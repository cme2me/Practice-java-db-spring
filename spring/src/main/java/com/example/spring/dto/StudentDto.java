package com.example.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class StudentDto {
    private UUID id;
    private String name;
    private Integer age;
}
