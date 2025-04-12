package org.example;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getModulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
class ComplexNumberAdapter {

    // Convert Double to ComplexNumber (imaginar = 0)
    public static ComplexNumber fromDouble(Double number) {
        return new ComplexNumber(number, 0);
    }

    // Convert ComplexNumber to Double (folosind modulul)
    public static Double toDouble(ComplexNumber complex) {
        return complex.getModulus();
    }
}
 class Calculator {

    // Sumă între 2 numere complexe
    public static ComplexNumber suma(ComplexNumber nr1, ComplexNumber nr2) {
        double real = nr1.getReal() + nr2.getReal();
        double imaginary = nr1.getImaginary() + nr2.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    // Sumă între 2 double, convertiți la ComplexNumber
    public static ComplexNumber suma(Double nr1, Double nr2) {
        ComplexNumber c1 = ComplexNumberAdapter.fromDouble(nr1);
        ComplexNumber c2 = ComplexNumberAdapter.fromDouble(nr2);
        return suma(c1, c2);
    }

    // Sumă între ComplexNumber și Double: convertim ComplexNumber la Double (modul), facem suma, apoi înapoi la ComplexNumber
    public static ComplexNumber suma(ComplexNumber nr1, Double nr2) {
        Double d1 = ComplexNumberAdapter.toDouble(nr1);
        Double suma = d1 + nr2;
        return ComplexNumberAdapter.fromDouble(suma);
    }

    public static ComplexNumber suma(Double nr1, ComplexNumber nr2) {
        Double d2 = ComplexNumberAdapter.toDouble(nr2);
        Double suma = nr1 + d2;
        return ComplexNumberAdapter.fromDouble(suma);
    }
}



