package com.example.dockertestserver;

import com.example.dockertestserver.Model.People;
import com.example.dockertestserver.Repository.PeopleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DockerTestServerApplication {


    public static void main(String[] args) {SpringApplication.run(DockerTestServerApplication.class, args);}


    }