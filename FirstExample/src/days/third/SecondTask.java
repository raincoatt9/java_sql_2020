package days.third;

////@justas

import days.second.numberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SecondTask {

     private double km;
     private double sanaud;
    public static void main(String[] args) {

        SecondTask secondTask = new SecondTask();
        DecimalFormat df = new DecimalFormat("0.0");
        secondTask.fuel();
        System.out.println("vidurkio skaiciavimas = " + df.format(secondTask.vid()));

    }
    private void fuel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite sanaudas");
        sanaud = numberUtils.getCorrectNumber(sc);
        System.out.println("iveskite nuvaziuotus km");
        km = numberUtils.getCorrectNumber(sc);

    }
    private double vid(){
        return (sanaud*100)/ km;
    }
}
