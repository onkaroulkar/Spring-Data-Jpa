package com.onkar.spring_data_jpa_ex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.onkar.spring_data_jpa_ex.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
