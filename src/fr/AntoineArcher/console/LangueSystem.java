package fr.AntoineArcher.console;

import fr.AntoineArcher.Domain.Langue;
import fr.AntoineArcher.Domain.LangueAnglais;
import fr.AntoineArcher.Domain.LangueFrancais;

public class LangueSystem implements Langue {

    public Langue langueSystem(){
        if(System.getProperty("user.name").equalsIgnoreCase("fr")){
            return new LangueFrancais();
        } else {
            return new LangueAnglais();
        }
    }

    @Override
    public String feliciter() {
        return "";
    }

    @Override
    public String bonjour(int momentDeLaJournee) {
        return "";
    }

    @Override
    public String auRevoir(int momentDeLaJournee) {
        return "";
    }

    @Override
    public String demandeMot() {
        return "";
    }
}
