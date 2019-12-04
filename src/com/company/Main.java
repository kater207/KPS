package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            Scanner con = new Scanner(System.in);

            int win1 = 0, win2 = 0;
            System.out.println("Print count of game");
            int n = con.nextInt();
            // System.out.println("vrevevr");
            for (int i = 0; i < n; i++) {
                System.out.println(" Print a(S/K/P)");
                char a = con.next().charAt(0);
                System.out.println("Print b(S/K/P)");
                char b = con.next().charAt(0);

                if ((a == 'K') && (b == 'S')) win1++;
                if ((a == 'S') && (b == 'K')) win2++;
                if ((a == 'S') && (b == 'P')) win1++;
                if ((a == 'P') && (b == 'S')) win2++;
                if ((a == 'P') && (b == 'K')) win1++;
                if ((a == 'K') && (b == 'P')) win2++;
                if ((a == '+') || (b == '+'))
                    return;

                if (win1 > win2) {
                    System.out.println("player 1 ");
                }
                if (win1 < win2) {
                    System.out.println("Player 2 ");
                } else {
                    System.out.println("TIE");
                }
                File file = new File("file.txt");
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                    if (win1 > win2) {
                        writer.write("Player 1\n");
                    }
                    if (win1 < win2) {
                        writer.write("Player 2\n");
                    } else {
                        writer.write("TIE\n");
                    }
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            con.close();
        }
    }
}
