package fr.AntoineArcher.Domain;

public class Constantes {
    // catchPhrase en cas de palindrome
    public static final String BIENDIT = "Bien dit !";
    public static final String WELLDONE = "Well Done";

    // Les BONJOUR et AUREVOIR comportent 4 valeurs valeurs:
    // 0 -> par défaut 1 -> matin, 2 -> Après midi, 3 -> soir et 4 -> nuit
    public static final String[] BONJOUR_FR = {"", "Bonjour", "Bonjour", "Bonjour", "bonsoir"};
    public static final String[] AUREVOIR_FR = {"", "Bonne journée", "Bonne fin de journée", "Bonne soirée", "Bonne nuit"};
    public static final String[] BONJOUR_EN = {"","Good morning", "Good afternoon", "Good evening", "good night"};
    public static final String[] AUREVOIR_EN = {"","Goodbye", "Goodbye", "Goodbye", "Goodbye"};

    //Phrase affichée dans la console pour demander la saisie d'un mot
    public static final String DEMANDE_MOT_FR = "Saisissez un mot :";
    public static final String DEMANDE_MOT_EN = "Enter a word :";

}