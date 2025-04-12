package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Config config=Config.getInstance();
        System.out.println("Culoare: "+config.getColor());
        System.out.println("Weight: "+config.getWeight());


                ComplexNumber c1 = new ComplexNumber(3, 4); // modul = 5
                ComplexNumber c2 = new ComplexNumber(1, 2);

                Double d1 = 10.0;
                Double d2 = 2.0;

                System.out.println("Complex + Complex = " + Calculator.suma(c1, c2));
                System.out.println("Double + Double = " + Calculator.suma(d1, d2));
                System.out.println("Complex + Double = " + Calculator.suma(c1, d1));
                System.out.println("Double + Complex = " + Calculator.suma(d1, c2));

        }

    }
