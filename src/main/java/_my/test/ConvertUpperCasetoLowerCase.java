package _my.test;

public class ConvertUpperCasetoLowerCase {

    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' '));        // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
