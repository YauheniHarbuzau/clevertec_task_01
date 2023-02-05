package edu.clever.clevertec_task_01.entity;

import edu.clever.clevertec_task_01.entity.parent.Animal;

public class Fish extends Animal {

    {
        System.out.println("Рыбка:");
    }

    public String name;

    public Fish() {
    }

    public Fish(String name) {
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
        return "Рыбка " + name;
    }

    @Override
    public void breathe() {
        System.out.println("Дышу через жабры");
    }

    @Override
    public void eating() {
        System.out.println("Ем всё подряд");
    }
}