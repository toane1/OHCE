package fr.AntoineArcher.domaine;

public class MomentDeLaJournee {
    public static int INCONNU= 0;
    public static int MATIN = 1;
    public static int APRESMIDI= 2;
    public static int SOIR= 3;
    public static int NUIT= 4;


    public static int depuisHeure(int heure){
        if (heure<8) return MomentDeLaJournee.NUIT;
        if (heure<12) return MomentDeLaJournee.MATIN;
        if (heure<18) return MomentDeLaJournee.APRESMIDI;
        if (heure>21) return MomentDeLaJournee.SOIR;
        else return MomentDeLaJournee.NUIT;
    }

}
