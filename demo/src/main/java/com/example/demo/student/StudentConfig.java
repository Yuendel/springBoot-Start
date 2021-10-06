package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    1l,
                    "Mariam",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "mariam.jamal@gmail.com"
            );
            Student alex = new Student(
                    2l,
                    "Alex",
                    LocalDate.of(2005, Month.JANUARY, 8),
                    "alex@gmail.com"
            );
            List<Student> list = new ArrayList<Student>();

            list.add(mariam);
            list.add(alex);
            repository.saveAll(list);
        };
    }
}
