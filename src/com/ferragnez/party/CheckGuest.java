package com.ferragnez.party;

import java.util.*;

public class CheckGuest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi,
        // Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic

        String[] invitiedGuests = {"Dua Lipa", "Paris Hilton", "Manuel Angelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};



        System.out.println("Enter Guest's full name");
        String name = scanner.nextLine();

        for (int i = 0; i <= invitiedGuests.length; i++){
            if(name.equals(invitiedGuests[i])){
                System.out.println("Welcome to our party dear Guest");

            }

            else{
                System.out.println("Sorry u are not allowed to enter");
                break;
            }
        }

    }

}
