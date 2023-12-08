package fr.AntoineArcher.TestBuilders;

import fr.AntoineArcher.Domain.Langue;
import fr.AntoineArcher.Domain.verificationPalindrome;

public class VerificationPalindromeBuilder {
    private Langue langue = new LangueStub();
    private final int momentDeLaJournee = 0;

    public static verificationPalindrome parDefault() {
        return new VerificationPalindromeBuilder().build();
    }

    public verificationPalindrome build() {
        return new verificationPalindrome(this.langue, this.momentDeLaJournee);
    }

    public VerificationPalindromeBuilder ayantPourLangue(Langue langue){
        this.langue = langue;
        return this;
    }

}
