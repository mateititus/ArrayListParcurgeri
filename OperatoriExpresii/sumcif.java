package OperatoriExpresii;

public class sumcif {
    public static void main(String[] args) {
        int a = 245;
        int suma =  a%10 + a/10%10 + a/100%10;
        System.out.println(suma);
    }
}
