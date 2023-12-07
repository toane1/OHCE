package fr.AntoineArcher;

public class LangueAnglais implements Langue {
    @Override
    public String Feliciter() {
        return Expressions.WELLDONE;
    }

    @Override
    public String Bonjour() {
        return Expressions.HELLO;
    }

    @Override
    public String AuRevoir() {
        return Expressions.BYE;
    }
}
