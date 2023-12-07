package fr.Antoine.Archer;

import fr.Antoine.Archer.TestBuilders.VerificationPalindromeBuilder;
import fr.AntoineArcher.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = {"test", "radar"})
    public void testMiroir(String chaine) {
        // ETANT DONNE une chaîne n'étant pas un palindrome
        // QUAND on vérifie si c'est un palindrome
        String resultat = VerificationPalindromeBuilder.Default().Verifier(chaine);

        // ALORS on obtient son miroir
        String inversion = new StringBuilder(chaine)
                .reverse()
                .toString();

        assertTrue(resultat.contains(inversion));
    }
    @Test
    public void testPalindromeFrancais(){
        // ETANT DONNE un palindrome
        String palindrome = "radar";
        // et un utilisateur en langue française
        Langue langue = new LangueFrancais();
        VerificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                .AyantPourLangue(langue)
                .Build();
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.Verifier(palindrome);

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu = palindrome + System.lineSeparator() + Expressions.BIENDIT;
        assertTrue(resultat.contains(attendu));
    }
    @Test
    public void testPalindromeAnglais(){
        // ETANT DONNE un palindrome
        String palindrome = "radar";
        // et un utilisateur en langue anglaise
        Langue langue = new LangueAnglais();
        VerificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                .AyantPourLangue(langue)
                .Build();
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.Verifier(palindrome);

        // ALORS la chaîne est répétée, suivie de "Well Done !"
        String attendu = palindrome + System.lineSeparator() + Expressions.WELLDONE;
        assertTrue(resultat.contains(attendu));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "radar"})
    public void testBonjourFrancais(String chaine){
        // ETANT DONNE une chaîne
        //
        // et un utilisateur en langue française
                Langue langue = new LangueFrancais();
                VerificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                        .AyantPourLangue(langue)
                        .Build();
        // QUAND on vérifie si c'est un palindrome
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.Verifier(chaine);

        // ALORS toute réponse est précédée de "Bonjour"
        String[] lines = resultat.split(System.lineSeparator());
        String firstLine = lines[0];
        assertEquals(Expressions.BONJOUR, firstLine);
    }
    @ParameterizedTest
    @ValueSource(strings = {"test", "radar"})
    public void testBonjourAnglais(String chaine){
        // ETANT DONNE une chaîne
        //
        // et un utilisateur en langue française
        Langue langue = new LangueAnglais();
        VerificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                .AyantPourLangue(langue)
                .Build();
        // QUAND on vérifie si c'est un palindrome
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.Verifier(chaine);

        // ALORS toute réponse est précédée de "Bonjour"
        String[] lines = resultat.split(System.lineSeparator());
        String firstLine = lines[0];
        assertEquals(Expressions.HELLO, firstLine);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "radar"})
    public void testAuRevoirFrancais(String chaine){
        // ETANT DONNE une chaîne
        // et un utilisateur en langue française
        Langue langue = new LangueFrancais();
        VerificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                .AyantPourLangue(langue)
                .Build();
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.Verifier(chaine);

        // ALORS toute réponse est suivie de "Au Revoir"
        String[] lines = resultat.split(System.lineSeparator());
        String lastLine = lines[lines.length - 1];
        assertEquals(Expressions.AUREVOIR, lastLine);
    }

    @ParameterizedTest
    @ValueSource(strings =  {"test", "radar"})
    public void testAuRevoirAnglais(String chaine){
        // ETANT DONNE une chaîne
        // et un utilisateur en langue française
        Langue langue = new LangueAnglais();
        VerificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                .AyantPourLangue(langue)
                .Build();
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.Verifier(chaine);
        // ALORS toute réponse est suivie de "Au Revoir"
        String[] lines = resultat.split(System.lineSeparator());
        String lastline = lines[lines.length - 1];
        assertEquals(Expressions.BYE, lastline);
    }

}