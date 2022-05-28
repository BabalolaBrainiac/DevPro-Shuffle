package com.babalola.Devmix.Developer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class DevConfig {

    @Bean
    CommandLineRunner commandLineRunner(DevRepository repository)  {
        return args -> {
            Developer Ope = new Developer("Daniel", "Ola");
            Developer Babalola = new Developer("babalola", "Opeyemi");
            repository.saveAll(List.of(Ope, Babalola));
        };
    };
};