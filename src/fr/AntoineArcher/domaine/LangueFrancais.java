package fr.AntoineArcher.domaine;

public class LangueFrancais implements Langue {
    @Override
    public String feliciter() {

        return Constantes.BIENDIT;
    }

    @Override
    public String bonjour(int momentDeLaJournee) {
        return Constantes.BONJOUR_FR[momentDeLaJournee];
    }

    @Override
    public String auRevoir(int momentDeLaJournee) {
        return Constantes.AUREVOIR_FR[momentDeLaJournee];
    }

    @Override
    public String demandeMot() {
        return Constantes.DEMANDE_MOT_FR;
    }
}
