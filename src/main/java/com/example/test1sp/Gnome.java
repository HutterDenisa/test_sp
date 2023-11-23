package com.example.test1sp;

public class Gnome implements Creature{

    @Override
    public void attack() {
        System.out.println("Gnome attacks with small axes!");

    }

    @Override
    public void defend() {
        System.out.println("Gnome defends with shields!");

    }
}
