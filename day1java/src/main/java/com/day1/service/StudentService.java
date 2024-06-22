package com.day1.service;

import com.day1.entity.Student;
import com.day1.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public void createStudent(Student data){
        studentRepo.save(data);
    }

//    Get All Studnet
    public List<Student> getAllStudent(){
        List<Student> data = studentRepo.findAll();
        return data;
    }

//    Get Single Student
    public Student getStudent(int id){
        Optional<Student> data = studentRepo.findById(id);
        Student student=data.get();
        return student;

    }

    /**
     * Get By Name
     */
    public List<Student> getByName(String name){
        List<Student> data = studentRepo.findByName(name);
        return data;
    }

    /**
     * Update Student Details
     */
    public void updateStudentDetails(Student student,int id){
        Student student1 = studentRepo.findById(id).get();
        student1.setName(student.getName());
        student1.setContact(student.getContact());
//        student1.setRoll_number(student.getRoll_number());
        student1.setEmail(student.getEmail());
        student1.setDesignation(student.getDesignation());
        studentRepo.save(student1);

    }

    public void deleteStudent(int id){
        studentRepo.deleteById(id);
    }
}
