package ch02;

public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println("var2 = " + var2);

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println("var4 = " + var4);

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println("var6 = " + var6);

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println("var8 = " + var8);
    }
}
