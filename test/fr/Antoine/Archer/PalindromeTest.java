package fr.Antoine.Archer;

import fr.Antoine.Archer.TestBuilders.VerificationPalindromeBuilder;
import fr.AntoineArcher.Expressions;
import fr.AntoineArcher.Langue;
import fr.AntoineArcher.LangueFrancais;
import fr.AntoineArcher.VerificationPalindrome;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
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
        VerificationPalindrome VerificationPalindrome = new VerificationPalindromeBuilder()
                .AyantPourLangue(langue)
                .Build();
        // QUAND on vérifie si c'est un palindrome
        String resultat = VerificationPalindrome.Verifier(palindrome);

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu = palindrome + System.lineSeparator() + Expressions.BIENDIT;
        assertTrue(resultat.contains(attendu));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "radar"})
    public void testBonjour(String chaine){
        // ETANT DONNE une chaîne
        // QUAND on vérifie si c'est un palindrome
        String resultat = VerificationPalindromeBuilder.Default().Verifier(chaine);

        // ALORS toute réponse est précédée de "Bonjour"
        String[] lines = resultat.split(System.lineSeparator());
        assertEquals(Expressions.BONJOUR, lines[0]);
    }
    @ParameterizedTest
    @ValueSource(strings = {"test", "radar"})
    public void testAuRevoir(String chaine){
        // ETANT DONNE une chaîne
        // QUAND on vérifie si c'est un palindrome
        String résultat = VerificationPalindromeBuilder.Default().Verifier(chaine);

        // ALORS toute réponse est suivie de "Au Revoir"
        String[] lines = résultat.split(System.lineSeparator());
        String lastLine = lines[lines.length - 1];
        assertEquals(Expressions.AUREVOIR, lastLine);
    }


}