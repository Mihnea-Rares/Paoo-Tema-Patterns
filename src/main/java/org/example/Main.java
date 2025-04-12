package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Config config=Config.getInstance();
        System.out.println("Culoare: "+config.getColor());
        System.out.println("Weight: "+config.getWeight());
    }
}