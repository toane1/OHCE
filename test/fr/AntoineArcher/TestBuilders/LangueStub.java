package fr.AntoineArcher.TestBuilders;
import fr.AntoineArcher.domaine.Langue;

public class LangueStub implements Langue {


    @Override
    public String feliciter() {
        return "";
    }

    @Override
    public String bonjour(int momentDeLaJournee) {
        return " ";
    }

    @Override
    public String auRevoir(int momentDeLaJournee) {
        return " ";
    }

    @Override
    public String demandeMot() {
        return "";
    }
}
