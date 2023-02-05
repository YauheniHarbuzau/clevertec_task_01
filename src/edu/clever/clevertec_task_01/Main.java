package edu.clever.clevertec_task_01;

import edu.clever.clevertec_task_01.entity.Cat;
import edu.clever.clevertec_task_01.entity.Dog;
import edu.clever.clevertec_task_01.entity.Fish;
import edu.clever.clevertec_task_01.entity.parent.Animal;

public class Main {

    public static void main(String[] args) {
        showAnimal(new Cat("Борис"));
        showAnimal(new Dog("Полкан"));
        showAnimal(new Fish("Салака"));
    }

    public static void showAnimal(Animal animal) {
        System.out.println(animal);
        animal.breathe();
        animal.eating();
        System.out.println("----------");
    }
}