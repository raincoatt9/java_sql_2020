package days.third;

/// @justas


import days.second.numberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ThirdTask
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite du skaicius ir veiksma tarp ju pvz: 12 + 10, 10 - 5, 10 / 2, 10 * 3, 10 ^ 3");

        String line = sc.nextLine();

        String[] items = line.split(" ");

        int fNum = (int) numberUtils.getCorrectNumber(sc,items[0]);
        int sNum = (int) numberUtils.getCorrectNumber(sc,items[2]);

        callReqAct(items[1], fNum, sNum, sc);


    }
    private static void callReqAct(String action, int fNum, int sNum, Scanner sc){
        Calc calc = new Calc(fNum,sNum);
        DecimalFormat df = new DecimalFormat("0.0");
        switch(action){
            case "+":
                System.out.println("suma yra = "+ df.format(calc.sum()));
                break;
            case "-":
                System.out.println("skirtumas yra = "+calc.minus());
                break;
            case "/":
                System.out.println("dalyba yra = "+calc.dalyba(sc));
                break;
            case "*":
                System.out.println("daugyba yra = "+calc.daugyba());
                break;
            case "^":
                System.out.println(String.format("kelimas %d laipsniu %d = %d",fNum,sNum,Math.round(calc.kelimas())));
                break;
            default:
                System.out.println("Tokio veiksmo nera");
                break;
        }
    }
}
