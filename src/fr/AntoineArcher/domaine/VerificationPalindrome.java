package fr.AntoineArcher.domaine;

public class VerificationPalindrome {
    private final Langue langue;
    private final int momentDeLaJournee;
    public VerificationPalindrome(Langue langue, int momentDeLaJournee){
        this.langue = langue;
        this.momentDeLaJournee = momentDeLaJournee;
    }
    public String verifier(String chaine) {
        String miroir =  new StringBuilder(chaine)
                .reverse()
                .toString();
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(this.langue.bonjour(momentDeLaJournee));
        resultBuilder.append(System.lineSeparator());
        resultBuilder.append(miroir);
        resultBuilder.append(System.lineSeparator());

        if(miroir.equals(chaine)) {
            resultBuilder.append(langue.feliciter());
            resultBuilder.append(System.lineSeparator());
        }

        resultBuilder.append(langue.auRevoir(momentDeLaJournee));

        return resultBuilder.toString();
    }
}
