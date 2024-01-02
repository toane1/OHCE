package fr.AntoineArcher.TestBuilders;

import fr.AntoineArcher.domaine.Langue;

public class LangueSpy implements Langue {
    private boolean feliciterAEteInvoque;

    @Override
    public String feliciter() {
        this.feliciterAEteInvoque = true;
        return "";
    }

    public boolean feliciterAEteInvoque() {
        return this.feliciterAEteInvoque;
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
