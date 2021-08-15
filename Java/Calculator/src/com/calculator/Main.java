package com.calculator;

import java.io.*;
import java.awt.GraphicsEnvironment;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        Console console = System.console();
        if(console == null && !GraphicsEnvironment.isHeadless()) {
            String filename = Main.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + filename + "\""});
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Calculator - Java");
        int val1 = input.nextInt();
        String str = input.next();
        int val2 = input.nextInt();
        System.out.println("=");

        if(str.equals("+")) {
            int val3 = val1 + val2;
            System.out.println(val3);
        } else if(str.equals("-")) {
            int val3 = val1 - val2;
            System.out.println(val3);
        } else if(str.equals("*")) {
            int val3 = val1 * val2;
            System.out.println(val3);
        } else if(str.equals("/")) {
            int val3 = val1 / val2;
            System.out.println(val3);
        }

        input.next();
    }
}
