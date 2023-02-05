package edu.clever.clevertec_task_01;

import edu.clever.clevertec_task_01.entity.Cat;
import edu.clever.clevertec_task_01.entity.Dog;
import edu.clever.clevertec_task_01.entity.parent.Animal;

public class Main {

    public static void main(String[] args) {

        Animal cat1 = new Cat("Борис");
        System.out.println(cat1);

        Animal cat2 = new Cat("Мурка");
        System.out.println(cat2);

        Animal dog1 = new Dog("Полкан");
        System.out.println(dog1);

        Animal dog2 = new Dog("Рекс");
        System.out.println(dog2);
    }
}