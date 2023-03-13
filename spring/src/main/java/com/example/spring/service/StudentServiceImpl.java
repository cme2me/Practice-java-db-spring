package com.example.spring.service;

import com.example.spring.dao.StudentRepository;
import com.example.spring.dto.StudentDto;
import com.example.spring.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentMapper mapper;
    private final StudentRepository repository;

    @Autowired
    public StudentServiceImpl(StudentMapper mapper, StudentRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public void saveStudent(String name, Integer age) {
        repository.save(mapper.toStudent(new StudentDto(UUID.randomUUID(), name, age)));
    }

    @Override
    public void saveStudent(List<String> names, List<Integer> ages) {
        List<StudentDto> dtoList = new ArrayList<>();

        for (String name : names) {
            var studentDto = new StudentDto();

            studentDto.setName(name);
            for (Integer age : ages) {
                studentDto.setAge(age);
            }
            studentDto.setId(UUID.randomUUID());
            dtoList.add(studentDto);
        }

        repository.saveAll(mapper.toStudentList(dtoList));
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return mapper.toStudentDtoList(repository.findAll());
    }

    @Override
    public StudentDto getStudentById(UUID id) {
        return mapper.toStudentDto(repository.findById(id).orElseThrow());
    }

    @Override
    public void deleteStudentById(UUID id) {
        if (!Objects.isNull(id))  repository.deleteById(id);
    }
}