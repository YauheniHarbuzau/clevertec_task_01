package edu.clever.clevertec_task_01.entity;

import edu.clever.clevertec_task_01.entity.parent.Animal;

public class Cat extends Animal {

    {
        System.out.println("Котик:");
    }

    public String name;

    public Cat() {
    }

    public Cat(String name) {
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
        return "Котик " + name;
    }
}