package com.example.demo.student;


import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<List<Student>> getStudents() {
        return Arrays.asList(Arrays.asList(
                        new Student(
                                1L,
                                "Mariam",
                                21,
                                LocalDate.of(2000, Month.JANUARY, 5),
                                "mariam.jamal@gmail.com"
                        )
                )
        );
    }
}
