import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println("Hej med dig!");
        System.out.println("Indsæt et tal: ");
        int x = scan.nextInt();
        System.out.println("Indsæt endnu et tal: ");
        int y = scan.nextInt();
        int sum = x + y;
        int antalTal = 2;
        int resultat = sum / antalTal;
        System.out.println("Gennemsnittet af alle tal er: " + resultat);
        while (true){
            System.out.println("Indtast endnu et tal: ");
            y = scan.nextInt();
            sum = sum + y;
            resultat = sum / ++antalTal;
            System.out.println("Gennemsnittet af alle tal er " + resultat);

            if(input == "Q" || input == "q"){
                return;
            }
        }

    }
}
