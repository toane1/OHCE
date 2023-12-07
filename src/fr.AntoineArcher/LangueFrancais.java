package fr.AntoineArcher;

public class LangueFrancais implements Langue {
    @Override
    public String Feliciter() {
        return Expressions.BIENDIT;
    }

    @Override
    public String Bonjour() {
        return Expressions.BONJOUR;
    }

    @Override
    public String AuRevoir() {
        return Expressions.AUREVOIR;
    }
}
