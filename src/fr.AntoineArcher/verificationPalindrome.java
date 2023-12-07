package fr.AntoineArcher;

public class verificationPalindrome {
    private final Langue langue;
    public verificationPalindrome(Langue langue){
        this.langue = langue;
    }
    public String verifier(String chaine) {
        String miroir =  new StringBuilder(chaine)
                .reverse()
                .toString();
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(this.langue.bonjour());
        resultBuilder.append(System.lineSeparator());
        resultBuilder.append(miroir);
        resultBuilder.append(System.lineSeparator());

        if(miroir.equals(chaine)) {
            resultBuilder.append(langue.feliciter());
            resultBuilder.append(System.lineSeparator());
        }

        resultBuilder.append(langue.auRevoir());
        return resultBuilder.toString();
    }
}
