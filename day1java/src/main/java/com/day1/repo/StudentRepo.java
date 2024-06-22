package com.day1.repo;

import com.day1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {


    @Query(
            value = "select *from Student where stu_name=?1",nativeQuery = true
    )
    List<Student> findByName(String name);
}
