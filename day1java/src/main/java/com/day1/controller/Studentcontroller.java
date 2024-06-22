package com.day1.controller;

import com.day1.entity.Student;
import com.day1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class Studentcontroller {

    @Autowired
    StudentService studentService;

    @PostMapping("/create-student")
      public void CreateStudent(@RequestBody Student data){
           studentService.createStudent(data);
      }

      @GetMapping("/getAllStudent")
    public List<Student> getStudent(){
        return studentService.getAllStudent();
      }

      @GetMapping("/get-student/{id}")
        public Student getSingleStudent(@PathVariable int id){
        return studentService.getStudent(id);
      }

      @GetMapping("/getByName/{name}")
    public List<Student> getByName(@PathVariable String name){
        return studentService.getByName(name);

      }

      @PutMapping("/update-stu/{id}")
      public void updateStudent(@RequestBody Student data,@PathVariable int id){
        studentService.updateStudentDetails(data,id);
      }

      @DeleteMapping("/delete-stu/{id}")
        public void deleteStudent(@PathVariable int id){
          studentService.deleteStudent(id);
      }
}
