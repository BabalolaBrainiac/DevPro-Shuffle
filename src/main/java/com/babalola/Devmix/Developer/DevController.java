package com.babalola.Devmix.Developer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path = "/devs")
public class DevController {
   public final DevService devService;

   @Autowired
    public DevController(DevService devService) {
        this.devService = devService;
    }


    @GetMapping
    public List<Developer> getDevelopers() {
       return devService.getDevelopers();
    }





}
