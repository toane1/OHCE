package fr.AntoineArcher;

import fr.AntoineArcher.Domain.Constantes;
import fr.AntoineArcher.Domain.Langue;
import fr.AntoineArcher.Domain.LangueAnglais;
import fr.AntoineArcher.Domain.LangueFrancais;
import fr.AntoineArcher.TestBuilders.LangueSpy;
import fr.AntoineArcher.TestBuilders.VerificationPalindromeBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @ParameterizedTest
    @DisplayName("On retourne en miroir une chaîne de caractère transmise")
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
    @DisplayName("Si pas un palindrome, on ne félicite pas")
    public void testSansPalindromePasDeFelicitations(){
        // ETANT DONNE un non-palindrome
        String chaine = "test";
        var langueSpy = new LangueSpy();
        var verificateur = new VerificationPalindromeBuilder()
                .ayantPourLangue(langueSpy)
                .build();

        // QUAND on vérifie si c'est un palindrome
        verificateur.verifier(chaine);

        // ALORS le résultat ne comporte pas de félicitations
        assertFalse(langueSpy.feliciterAEteInvoque());
    }
    static Stream<Arguments> casPalindromeMultilangue(){
        return Stream.of(
                Arguments.of("radar", new LangueFrancais(), Constantes.BIENDIT),
                Arguments.of("radar", new LangueAnglais(), Constantes.WELLDONE)
        );
    }
    @ParameterizedTest
    @DisplayName("On félicite l'utilisateur quand il entre un palindrome")
    @MethodSource("casPalindromeMultilangue")
    public void testPalindromeMultiLangue(String palindrome, Langue langue, String gg){
        // ETANT DONNE une chaîne
        // ET un utilisateur parlant une <langue>
        var verification = new VerificationPalindromeBuilder()
                .ayantPourLangue(langue)
                .build();

        // QUAND on vérifie si c'est un palindrome
        String resultat =  verification.verifier(palindrome);

        // ALORS toute réponse est précédée de <salutations> dans cette <langue>
        String attendu = palindrome + System.lineSeparator() + gg;
        assertTrue(resultat.contains(attendu));
    }
    static Stream<Arguments> casTestBonjourMultilangue(){
        return Stream.of(
                Arguments.of("test", new LangueFrancais(), Constantes.BONJOUR_FR),
                Arguments.of("radar", new LangueFrancais(), Constantes.BONJOUR_FR),
                Arguments.of("test", new LangueAnglais(), Constantes.BONJOUR_EN),
                Arguments.of("radar", new LangueAnglais(), Constantes.BONJOUR_EN)
        );
    }
    @ParameterizedTest
    @MethodSource("casTestBonjourMultilangue")
    public void testBonjourMultiLangue(String chaine, Langue langue, String bjr){
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

    static Stream<Arguments> casTestAuRevoirMultilangue(){
        return Stream.of(
                Arguments.of("test", new LangueFrancais(), Constantes.AUREVOIR_FR),
                Arguments.of("radar", new LangueFrancais(), Constantes.AUREVOIR_FR),
                Arguments.of("test", new LangueAnglais(), Constantes.AUREVOIR_EN),
                Arguments.of("radar", new LangueAnglais(), Constantes.AUREVOIR_EN)
        );
    }
    @ParameterizedTest
    @MethodSource("casTestAuRevoirMultilangue")
    public void testAuRevoirMultiLangue(String chaine, Langue langue, String bjr){
        // ETANT DONNE une chaîne
        // ET un utilisateur parlant une <langue>
        var verification = new VerificationPalindromeBuilder()
                .ayantPourLangue(langue)
                .build();

        // QUAND on vérifie si c'est un palindrome
        String resultat =  verification.verifier(chaine);

        // ALORS toute réponse est précédée de <salutations> dans cette <langue>
        String[] lines = resultat.split(System.lineSeparator());
        String lastline = lines[lines.length - 1];
        assertEquals(bjr, lastline);
    }
}
