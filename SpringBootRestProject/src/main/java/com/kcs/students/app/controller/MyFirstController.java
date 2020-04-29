package com.kcs.students.app.controller;

import com.kcs.students.app.dto.Pet;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/myExample")
public class MyFirstController {

    @GetMapping("/sayHi!")
    public String sayHi(){
        return "Hello";
    }

    @GetMapping("/sayHi!/{myName}")
    public String sayHi(@PathVariable("myName") String name) {
        return "Hello " + name;
    }

    @GetMapping("/pets")
    public List<Pet> getPets(){
        return List.of(new Pet("Dzimis", 12,"donkey"),
                       new Pet("Senukas", 25,"asilas"));

    }

    @PostMapping("/pets/save")
    public Pet savePet(@RequestBody Pet pet){
        pet.setName(pet.getName() + "_new");
        return pet;
    }

}


