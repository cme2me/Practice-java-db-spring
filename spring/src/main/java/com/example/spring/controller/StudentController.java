package com.example.spring.controller;

import com.example.spring.dto.StudentDto;
import com.example.spring.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/api")
@Tag(name = "API", description = "")
public class StudentController {
    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }
    @ResponseBody
    @Operation(summary = "Get student by Id", description = "To get student enter Id")
    @GetMapping("/get/{id}")
    public StudentDto getStudentById(@PathVariable UUID id) {
        return service.getStudentById(id);
    }
    @ResponseBody
    @Operation(summary = "Get all students", description = "Get all students")
    @GetMapping("/all")
    public List<StudentDto> getAllStudents() {
        return service.getAllStudents();
    }
    @ResponseBody
    @Operation(summary = "Add student", description = "To add student enter name and age")
    @PostMapping("/add")
    public void addStudent(@RequestParam String name,
                             @RequestParam Integer age) {
        service.saveStudent(name, age);
    }
    @ResponseBody
    @Operation(summary = "Add multiple students", description = "To add more than 1 student enter their first and last names separated by commas")
    @PostMapping("/add/all")
    public void addMultipleStudent(@RequestParam List<String> name,
                           @RequestParam List<Integer> age) {
        service.saveStudent(name, age);
    }
    @ResponseBody
    @Operation(summary = "Delete student by id", description = "To delete student enter id")
    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable UUID id) {
        service.deleteStudentById(id);
    }
    @ResponseBody
    @Operation(summary = "Update student", description = "To update enter name and age")
    @PostMapping("/update")
    public void updateStudent(@RequestParam String name,
                           @RequestParam Integer age) {
        service.saveStudent(name, age);
    }
}
