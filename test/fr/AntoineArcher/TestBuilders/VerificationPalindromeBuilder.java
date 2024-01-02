package fr.AntoineArcher.TestBuilders;

import fr.AntoineArcher.domaine.Langue;
import fr.AntoineArcher.domaine.VerificationPalindrome;

public class VerificationPalindromeBuilder {
    private Langue langue = new LangueStub();
    private int momentDeLaJournee = 0;
    public static VerificationPalindrome parDefault() {
        return new VerificationPalindromeBuilder().build();
    }

    public VerificationPalindrome build() {
        return new VerificationPalindrome(this.langue, this.momentDeLaJournee);
    }

    public VerificationPalindromeBuilder ayantPourLangue(Langue langue){
        this.langue = langue;
        return this;
    }

    public VerificationPalindromeBuilder ayantPourMomentDeLaJournee(int momentDeLaJournee) {
        this.momentDeLaJournee = momentDeLaJournee;
        return this;
    }
}
