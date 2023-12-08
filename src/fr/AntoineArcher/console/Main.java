package fr.AntoineArcher.console;

import fr.AntoineArcher.Domain.verificationPalindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var langue = new LangueSystem().langueSystem();
        int momentDeLaJournee = new DetectionMomentDeLaJournee().detecter();
        var detecteurPalindrome = new verificationPalindrome(langue, momentDeLaJournee);
        Scanner sc = new Scanner(System.in);
        System.out.println(langue.demandeMot());
        String chaine = sc.next();
        System.out.println(detecteurPalindrome.verifier(chaine));
    }
}
