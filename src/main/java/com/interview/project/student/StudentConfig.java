package com.interview.project.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                Student jane = new Student(
                            "Jane",
                            "jane.dowy@gmail.com",
                            LocalDate.of(2000, JANUARY, 5)
                );
                Student ken = new Student(
                            "Kennedy",
                            "kennedy.simiyu@gmail.com",
                            LocalDate.of(1993, SEPTEMBER, 25)
                );

                repository.saveAll(
                        List.of(ken, jane)
                );
        };
    }
}
