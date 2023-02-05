package edu.clever.clevertec_task_01;

import edu.clever.clevertec_task_01.entity.Cat;
import edu.clever.clevertec_task_01.entity.parent.Animal;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat("Борис");
        System.out.println(cat);
    }
}