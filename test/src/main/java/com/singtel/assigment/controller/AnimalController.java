package com.singtel.assigment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.assigment.service.AnimalService;

@RestController
@RequestMapping(value = "animal")
public class AnimalController {

	@Autowired
	AnimalService animalService;

	@GetMapping("/countAnimalCanFly")
	public int countAnimalCanFly() {
		return animalService.countAnimalCanFly();
	}

	@GetMapping("/countAnimalCanWalk")
	public int countAnimalCanWalk() {
		return animalService.countAnimalCanWalk();
	}

	@GetMapping("/countAnimalCanSing")
	public int countAnimalCanSing() {
		return animalService.countAnimalCanSing();
	}

	@GetMapping("/countAnimalCanSwim")
	public int countAnimalCanSwim() {
		return animalService.countAnimalCanSwim();
	}

}
