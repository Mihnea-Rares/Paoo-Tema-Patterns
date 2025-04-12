package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Config config=Config.getInstance();
    //homework2.1
        System.out.println("Culoare: "+config.getColor());
        System.out.println("Weight: "+config.getWeight());

//homework 2.3
                ComplexNumber c1 = new ComplexNumber(3, 4); // modul = 5
                ComplexNumber c2 = new ComplexNumber(1, 2);

                Double d1 = 10.0;
                Double d2 = 2.0;

                System.out.println("Complex + Complex = " + Calculator.suma(c1, c2));
                System.out.println("Double + Double = " + Calculator.suma(d1, d2));
                System.out.println("Complex + Double = " + Calculator.suma(c1, d1));

        System.out.println("Double + Complex = " + Calculator.suma(d1, c2));

                        //homework2.5

                C2NR c2Nr = new C2NR(1, 2);
        System.out.println("Suma C2Nr: " + c2Nr.getSum()); // Afișează 3


        C3NR c3Nr = C2NR.Adapter.convert(c2Nr, 3);
        System.out.println("Instanța C3Nr după conversie: " + c3Nr); // Afișează C3Nr(1, 2, 3)
        System.out.println("Suma C3Nr: " + c3Nr.getSum()); // Afișează 6
        }

    }
