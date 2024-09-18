import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wynik z testu(0-100):");
        int score = scan.nextInt();

        if(score < 0){                                      //poczatek instrukcji warunkowej sprawdzajacej oceny dla wyniku w punktach, sprawdzenie czy nie podano ujemnych punktow
            System.out.println("zla ilosc punktow");        
        }
        else if(score >=0 && score < 60){                   //sprawdzenie czy ocena to F
            System.out.println("Ocena: F");
        }
        else if(score >= 60 && score <= 69){                //sprawdzenie czy ocena to D
            System.out.println("Ocena: D");
        }
        else if(score >= 70 && score <= 79){                //sprawdzenie czy ocena to C
            System.out.println("Ocena: C");
        }
        else if(score >= 80 && score <= 89){                //sprawdzenie czy ocena to B
            System.out.println("Ocena: B");
        }
        else if(score >= 90 && score <= 100){               //sprawdzenie czy ocena to A
            System.out.println("Ocena: A");
        }
        else if(score > 100){                               //sprawdzenie czy wynik jest ponad 100
            System.out.println("zla ilosc punktow");    
        }
    scan.close();
    }
}