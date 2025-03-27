package com.onkar.spring_data_jpa_ex;
import com.onkar.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setsName("Nishi");
		s1.setMarks(78);
		s1.setRollNo(1);

		s2.setsName("Chetna");
		s2.setMarks(100);
		s2.setRollNo(2);

		s3.setsName("Nirmal");
		s3.setMarks(0);
		s3.setRollNo(3);


		repo.save(s1);
		repo.save(s2);
		repo.save(s3);

		System.out.println(repo.findAll());

	}
}
