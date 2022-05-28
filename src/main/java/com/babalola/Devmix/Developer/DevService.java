package com.babalola.Devmix.Developer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevService {
    private final DevRepository devRepository;


    @Autowired
    public DevService(DevRepository devRepository) {
        this.devRepository = devRepository;
    }

    public List<Developer> getDevelopers() {
        return devRepository.findAll();
    }
}
