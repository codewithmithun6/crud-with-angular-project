package com.codewithmithun.crudwithangular.service;

import com.codewithmithun.crudwithangular.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public List<Student> getAllStudents();
    public Optional<Student> getStudentById(Long id);
    public Student createStudent(Student student);
    public Student updateStudent(Long id, Student studentDetails);
    public void deleteStudent(Long id);
}
