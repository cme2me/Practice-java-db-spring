package com.example.springpractice.mapper;

import com.example.springpractice.dao.entity.Student;
import com.example.springpractice.dto.StudentDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student toStudent(StudentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( dto.getId() );
        student.setName( dto.getName() );
        student.setAge( dto.getAge() );

        return student;
    }

    @Override
    public List<Student> toStudentList(List<StudentDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Student> list = new ArrayList<Student>( dtoList.size() );
        for ( StudentDto studentDto : dtoList ) {
            list.add( toStudent( studentDto ) );
        }

        return list;
    }

    @Override
    public StudentDto toStudentDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setId( student.getId() );
        studentDto.setName( student.getName() );
        studentDto.setAge( student.getAge() );

        return studentDto;
    }

    @Override
    public List<StudentDto> toStudentDtoList(List<Student> students) {
        if ( students == null ) {
            return null;
        }

        List<StudentDto> list = new ArrayList<StudentDto>( students.size() );
        for ( Student student : students ) {
            list.add( toStudentDto( student ) );
        }

        return list;
    }
}
