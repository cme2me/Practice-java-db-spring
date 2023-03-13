package com.example.spring.mapper;

import com.example.spring.dao.entity.Student;
import com.example.spring.dto.StudentDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentMapper {
    Student toStudent(StudentDto dto);
    List<Student> toStudentList(List<StudentDto> dtoList);
    StudentDto toStudentDto(Student student);
    List<StudentDto> toStudentDtoList(List<Student> students);
}
