package com.example;

public class TryCatchCase {
    public static void main(String[] args) {
        System.out.println("get A Int: " + getAInt());
    }

    private static int getAInt() {
        String intString = "1";
        String strString = "a";
        int outcome = -1;
        try {
            outcome = Integer.parseInt(strString);
        } catch (Exception e) {
            System.out.println(e.toString());
            outcome = 0;
        } finally {
            return outcome;
        }
    }
}
