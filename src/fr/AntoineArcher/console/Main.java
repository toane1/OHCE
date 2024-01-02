package fr.AntoineArcher.console;

import fr.AntoineArcher.domaine.Langue;
import fr.AntoineArcher.domaine.VerificationPalindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Langue langue = new LangueSystem().langueSystem();
        int momentDeLaJournee = new DetectionMomentDeLaJournee().detecter();
        VerificationPalindrome detecteurPalindrome = new VerificationPalindrome(langue, momentDeLaJournee);

        Scanner sc = new Scanner(System.in);
        System.out.println(langue.demandeMot());
        String chaine = sc.next();
        System.out.println(detecteurPalindrome.verifier(chaine));
    }
}
