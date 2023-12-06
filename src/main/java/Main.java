import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int langue = langue();

        dit("hello", langue);

        System.out.println("Entre un mot :");

        String mot = sc.next();

        palindrome(mot, langue);
        dit("bye", langue);
    }

    private static int langue() {
        int lang = 0;
        Scanner sc = new Scanner(System.in);
        do{

            System.out.println("Choisi une langue : \n 1 = francais, \n 2 = anglais");
            String langue = sc.next();
            try
            {
                Integer.parseInt(langue);
                lang =Integer.parseInt(langue);
            } catch (NumberFormatException ex)
            {
                System.out.println("Choisi une langue avec 1 ou 2 : \n 1 = francais, \n 2 = anglais");
            }
        }while(lang == 0);
        return lang;
    }

    private static void palindrome(String mot, int langue) {
        String pal = "";
        if (mot.isEmpty()) {
            System.out.println("Ther is not word; le mot en'est pas complété");
        } else {
            for (int i = 0; i < (mot.length()); ++i) {
                pal += mot.charAt((mot.length() - 1) - i);
            }
            if (pal.equals(mot)) {
                if(langue == 1){
                    System.out.println("gg");
                }else{
                    System.out.println("Good game ; Bien dit");
                }
            } else {
                System.out.println("Le palindrome de " + mot + " est : " + pal);
            }
        }
    }

    private static void dit(String st, int langue) {
        SimpleDateFormat s = new SimpleDateFormat("HH");
        Date date = new Date();
        int intDate = Integer.parseInt(s.format(date));
        if (intDate < 12) {
            if (st.equals("bye")) {
                if(langue == 1){
                    System.out.println("Bonne journée");
                }else{
                    System.out.println("Good bye");
                }
            } else {
                if(langue == 1){
                    System.out.println("Bonjour");
                }else{
                    System.out.println("Good morning");
                }
            }
        } else {
            if (st.equals("bye")) {
                if(langue == 1){
                    System.out.println("Bonne fin de journée");
                }else{
                    System.out.println("Have a good afternoon");
                }
            } else {
                if(langue == 1){
                    System.out.println("Bonjour");
                }
                System.out.println("Hello");
            }
        }
    }
}

