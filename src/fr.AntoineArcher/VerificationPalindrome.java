package fr.AntoineArcher;

public class VerificationPalindrome {
    private final Langue langue;
    public VerificationPalindrome(Langue langue){
        this.langue = langue;
    }
    public String Verifier(String chaine) {
        String miroir =  new StringBuilder(chaine)
                .reverse()
                .toString();
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(this.langue.Bonjour());
        resultBuilder.append(System.lineSeparator());
        resultBuilder.append(miroir);
        resultBuilder.append(System.lineSeparator());

        if(miroir.equals(chaine)) {
            resultBuilder.append(langue.Feliciter());
            resultBuilder.append(System.lineSeparator());
        }

        resultBuilder.append(langue.AuRevoir());
        return resultBuilder.toString();
    }
}
