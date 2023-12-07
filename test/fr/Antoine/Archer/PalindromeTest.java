package fr.Antoine.Archer;

import fr.Antoine.Archer.TestBuilders.VerificationPalindromeBuilder;
import fr.AntoineArcher.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = {"test", "radar"})
    public void testMiroir(String chaine) {
        // ETANT DONNE une chaîne n'étant pas un palindrome
        // QUAND on vérifie si c'est un palindrome
        String resultat = VerificationPalindromeBuilder.parDefault().verifier(chaine);

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
        verificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                .ayantPourLangue(langue)
                .build();
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.verifier(palindrome);

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
        verificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                .ayantPourLangue(langue)
                .build();
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.verifier(palindrome);

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
                verificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                        .ayantPourLangue(langue)
                        .build();
        // QUAND on vérifie si c'est un palindrome
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.verifier(chaine);

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
        verificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                .ayantPourLangue(langue)
                .build();
        // QUAND on vérifie si c'est un palindrome
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.verifier(chaine);

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
        verificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                .ayantPourLangue(langue)
                .build();
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.verifier(chaine);

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
        verificationPalindrome verificationPalindrome = new VerificationPalindromeBuilder()
                .ayantPourLangue(langue)
                .build();
        // QUAND on vérifie si c'est un palindrome
        String resultat = verificationPalindrome.verifier(chaine);
        // ALORS toute réponse est suivie de "Au Revoir"
        String[] lines = resultat.split(System.lineSeparator());
        String lastline = lines[lines.length - 1];
        assertEquals(Expressions.BYE, lastline);
    }

    static Stream<Arguments> casTestBonjour(){
        return Stream.of(
                Arguments.of("test", new LangueFrancais(), Expressions.BONJOUR),
                Arguments.of("radar", new LangueFrancais(), Expressions.BONJOUR),
                Arguments.of("test", new LangueAnglais(), Expressions.HELLO),
                Arguments.of("radar", new LangueAnglais(), Expressions.HELLO)
        );
    }
    @ParameterizedTest
    @MethodSource("casTestBonjour")
    public void testBonjourMultiCas(String chaine, Langue langue, String bjr){
        // ETANT DONNE une chaîne
        // ET un utilisateur parlant une <langue>
        var verification = new VerificationPalindromeBuilder()
                .ayantPourLangue(langue)
                .build();

        // QUAND on vérifie si c'est un palindrome
        String resultat =  verification.verifier(chaine);

        // ALORS toute réponse est précédée de <salutations> dans cette <langue>
        String[] lines = resultat.split(System.lineSeparator());
        String firstLine = lines[0];
        assertEquals(bjr, firstLine);
    }


}