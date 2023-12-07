package fr.AntoineArcher;

public class LangueAnglais implements Langue {
    @Override
    public String feliciter() {
        return Expressions.WELLDONE;
    }

    @Override
    public String bonjour() {
        return Expressions.HELLO;
    }

    @Override
    public String auRevoir() {
        return Expressions.BYE;
    }
}
