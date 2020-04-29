package days.x;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Test1 {


    public static void main(String[] args) {


        System.out.println("Iveskite du skaicius ir zenkla tarp ju, pvz: 5 + 5\nGalimi variantai : + - * ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] items = line.split(" ");
        int pSkaic = (int) klaiduTaisymas(scanner, items[0]);
        int aSkaic = (int) klaiduTaisymas(scanner, items[2]);

        Sprendimas(items[1], pSkaic, aSkaic, scanner);


    }

    public static void Sprendimas(String bandom, int pSkaic, int aSkaic,Scanner scanner) {
        switch (bandom) {
            case "+":
                System.out.println("suma lygi = " + (pSkaic + aSkaic));
                break;
            case "-":
                System.out.println("suma lygi = " + (pSkaic - aSkaic));
                break;
            case "*":
                System.out.println("suma lygi = " + (pSkaic * aSkaic));
                break;
              default:
                System.out.println("tokio veiksmo nera :(");
        }

    }


     public static double klaiduTaisymas(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ivestas blogas skaicius! Pakartokite !");
                scanner.nextLine();
            }
        }
     }

     public static double klaiduTaisymas(Scanner scanner, String number) {
        try {
            return Integer.parseInt(number);
        } catch(NumberFormatException e) {
            System.out.println("Ivestas blogas skaicius! Pakartokite !!");
            return klaiduTaisymas(scanner);
        }

     }
}
/**finally {
        if (Integer.parseInt(String.valueOf(number)) == 0){
        System.out.println("Ivestas blogas skaicius! Pakartokite !!!");
        return klaiduTaisymas(scanner);
        }
 // P.S. beveik veike.. :D bet beveik nesiskaito, gaila bet nepavyksta sumastyt kaip issprest :(
 */