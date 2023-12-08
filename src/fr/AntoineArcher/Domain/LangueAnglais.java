package fr.AntoineArcher.Domain;

public class LangueAnglais implements Langue {
    @Override
    public String feliciter() {
        return Constantes.WELLDONE;
    }

    @Override
    public String bonjour(int momentDeLaJournee) {

        return Constantes.BONJOUR_EN[momentDeLaJournee];
    }

    @Override
    public String auRevoir(int momentDeLaJournee) {
        return Constantes.AUREVOIR_EN[momentDeLaJournee];
    }

    @Override
    public String demandeMot() {
        return Constantes.DEMANDE_MOT_EN;
    }
}
