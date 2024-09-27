package com.codewithmithun.crudwithangular.controller;

import com.codewithmithun.crudwithangular.entity.Student;
import com.codewithmithun.crudwithangular.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
//@CrossOrigin(origins = "http://localhost:4200")  // Allow cross-origin requests from Angular
@CrossOrigin(origins = "*")  // Allow cross-origin requests from Angular
public class StudentController {

    @GetMapping("/health")
    public String health(){
        return "API is working fine";
    }

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        return studentService.updateStudent(id, studentDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
