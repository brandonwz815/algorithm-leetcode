package com.utraque.leetcode.tag.bitmanipulation;

class Main
{
    public static void main(String[] args)
    {
        int n = -6;
        final int mask = n >> Integer.SIZE * 8 - 1;
 
        System.out.println("n (" + n + ") in binary is " + Integer.toBinaryString(n));
        System.out.println("(n >> Integer.SIZE) in binary is " + Integer.toBinaryString(n >> Integer.SIZE));
        System.out.println("mask (" + mask + ") in binary is " + Integer.toBinaryString(mask));
        System.out.println("n + mask (" + n + mask + ") in binary is " + Integer.toBinaryString(n + mask));
        System.out.println("abs(" + n + ") is " + ((n + mask) ^ mask));
    }
}

/*

n (-6) in binary is 11111111111111111111111111111010
mask (-1) in binary is 11111111111111111111111111111111
n + mask (-6-1) in binary is 11111111111111111111111111111001
abs(-6) is 6

 */