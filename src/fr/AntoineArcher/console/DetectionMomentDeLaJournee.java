package fr.AntoineArcher.console;

import fr.AntoineArcher.domaine.MomentDeLaJournee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DetectionMomentDeLaJournee {
    public int detecter(){
        return MomentDeLaJournee.depuisHeure(getHeure());
    }

    private static int getHeure(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH");
        return Integer.parseInt(format.format(date));
    }
}
