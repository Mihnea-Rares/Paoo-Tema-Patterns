package org.example;
//homework 2.5
public class C2NR {
    private int nr1;
    private int nr2;
    public C2NR (int nr1,int nr2)
    {
        this.nr1=nr1;
        this.nr2=nr2;
    }
    public int getNumber1()
    {
        return nr1;
    }
    public int getNumber2()
    {
        return nr2;
    }
    int getSum()
    {
        return nr1+nr2;
    }
    class Adapter
    {
        public static C3NR convert(C2NR n,int num3)
        {
             return new C3NR(n.getNumber1(),n.getNumber2(),num3);
        }
    }

}
