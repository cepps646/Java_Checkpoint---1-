package com.statefarm;

public class Checkpoint1 {

    public static void main(String[] args) {
        int sum = 0;
        if (args.length < 1) {
            System.out.println(0);
        } else if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                int value = Integer.parseInt(args[i]);
                if (value >= 0) {
                    sum = value + sum;
                }
            }
            System.out.println("Outside for:" + sum);
        }
    }
}