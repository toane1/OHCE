package fr.Antoine.Archer.TestBuilders;

import fr.AntoineArcher.Langue;
import fr.AntoineArcher.VerificationPalindrome;

public class VerificationPalindromeBuilder {
    private Langue langue = new LangueStub();

    public static VerificationPalindrome Default() {
        return new VerificationPalindromeBuilder().Build();
    }

    public VerificationPalindrome Build() {
        return new VerificationPalindrome(this.langue);
    }

    public VerificationPalindromeBuilder AyantPourLangue(Langue langue){
        this.langue = langue;
        return this;
    }

}
