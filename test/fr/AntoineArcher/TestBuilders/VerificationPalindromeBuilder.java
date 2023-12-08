package fr.AntoineArcher.TestBuilders;

import fr.AntoineArcher.Domain.Langue;
import fr.AntoineArcher.Domain.verificationPalindrome;

public class VerificationPalindromeBuilder {
    private Langue langue = new LangueStub();

    public static verificationPalindrome parDefault() {
        return new VerificationPalindromeBuilder().build();
    }

    public verificationPalindrome build() {
        int momentDeLaJournee = 0;
        return new verificationPalindrome(this.langue, momentDeLaJournee);
    }

    public VerificationPalindromeBuilder ayantPourLangue(Langue langue){
        this.langue = langue;
        return this;
    }

}
