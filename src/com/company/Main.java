package com.company;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // scrie o metoda care numara cate cifre se afla intr-un sir
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti sirul dorit: ");
        String sir = scan.nextLine();
        System.out.println("Numarul de cifre din sirul introdus este : "+nrCifre(sir));
    }
    public static int nrCifre(String sir) {
        int contor = 0;
        for (int i = 0; i < sir.length(); i++) {
            switch (sir.charAt(i)) {
                case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
                    contor++;
                    break;

            }

        }
        return contor;
    }
}

