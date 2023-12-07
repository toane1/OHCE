package fr.AntoineArcher;

public class LangueFrancais implements Langue {
    @Override
    public String feliciter() {
        return Expressions.BIENDIT;
    }

    @Override
    public String bonjour() {
        return Expressions.BONJOUR;
    }

    @Override
    public String auRevoir() {
        return Expressions.AUREVOIR;
    }
}
