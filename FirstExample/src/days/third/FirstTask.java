package days.third;

import days.second.numberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Justas
 */




public class FirstTask {
    private double ugis;
    private double svoris;

    public static void main(String[] args) {

        FirstTask firsttask = new FirstTask();
        firsttask.readInfo();
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println("Jusu kmi = "+ df.format(firsttask.countKMI()));


    }
    private void readInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("iveskite savo ugi cm");
        ugis = numberUtils.getCorrectNumber(scanner);
        System.out.println("iveskite savo svori");
        svoris = numberUtils.getCorrectNumber(scanner);

    }

    private double countKMI(){
        return svoris / Math.pow(ugis,2);
    }

}
