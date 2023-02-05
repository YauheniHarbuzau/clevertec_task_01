package edu.clever.clevertec_task_01.entity;

import edu.clever.clevertec_task_01.entity.parent.Animal;

public class Dog extends Animal {

    {
        System.out.println("Собачка:");
    }

    public String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Собачка " + name;
    }
}