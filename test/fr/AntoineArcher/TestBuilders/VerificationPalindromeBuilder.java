package fr.AntoineArcher.TestBuilders;

import fr.AntoineArcher.Langue;
import fr.AntoineArcher.verificationPalindrome;

public class VerificationPalindromeBuilder {
    private Langue langue = new LangueStub();

    public static verificationPalindrome parDefault() {
        return new VerificationPalindromeBuilder().build();
    }

    public verificationPalindrome build() {
        return new verificationPalindrome(this.langue);
    }

    public VerificationPalindromeBuilder ayantPourLangue(Langue langue){
        this.langue = langue;
        return this;
    }

}
