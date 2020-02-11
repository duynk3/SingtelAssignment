package com.singtel.assigment.service;

import org.springframework.stereotype.Service;

import com.singtel.assigment.interfaces.FlyAble;
import com.singtel.assigment.interfaces.SingAble;
import com.singtel.assigment.interfaces.SwimAble;
import com.singtel.assigment.interfaces.WalkAble;
import com.singtel.assigment.object.Animal;
import com.singtel.assigment.object.Bird;
import com.singtel.assigment.object.Butterfly;
import com.singtel.assigment.object.Caterpillar;
import com.singtel.assigment.object.Chicken;
import com.singtel.assigment.object.Clownfish;
import com.singtel.assigment.object.Dolphin;
import com.singtel.assigment.object.Duck;
import com.singtel.assigment.object.ParrotCat;
import com.singtel.assigment.object.ParrotDog;
import com.singtel.assigment.object.ParrotRooster;
import com.singtel.assigment.object.Rooster;
import com.singtel.assigment.object.Shark;

@Service
public class AnimalServiceImpl implements AnimalService {
	Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Shark(),
			new Clownfish(), new Dolphin(), new ParrotCat(), new ParrotDog(), new ParrotRooster(), new Butterfly(),
			new Caterpillar() };

	@Override
	public int countAnimalCanFly() {
		int result = 0;

		for (Animal animal : animals) {
			if (animal instanceof FlyAble) {
				try {
					((FlyAble) animal).fly();
					result += 1;
				} catch (Exception e) {
				}
			}
		}

		return result;
	}

	@Override
	public int countAnimalCanWalk() {
		int result = 0;

		for (Animal animal : animals) {
			if (animal instanceof WalkAble) {
				((WalkAble) animal).walk();
				result += 1;
			}
		}

		return result;
	}

	@Override
	public int countAnimalCanSing() {
		int result = 0;

		for (Animal animal : animals) {
			if (animal instanceof SingAble) {
				((SingAble) animal).sing();
				result += 1;
			}
		}

		return result;
	}

	@Override
	public int countAnimalCanSwim() {
		int result = 0;

		for (Animal animal : animals) {
			if (animal instanceof SwimAble) {
				((SwimAble) animal).swim();
				result += 1;
			}
		}

		return result;
	}

}
