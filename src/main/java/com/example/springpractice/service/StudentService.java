package com.example.springpractice.service;

import com.example.springpractice.dto.StudentDto;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    void saveStudent(String name, Integer age);
    void saveStudent(List<String> names, List<Integer> ages);
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(UUID id);
    void deleteStudentById(UUID id);

}
