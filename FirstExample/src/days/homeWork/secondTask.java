package days.homeWork;

import java.util.Scanner;

/**
  ///@justas
*/
public class secondTask {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite kiek ketinate ivesti skaiciu");

        int ilgis = sc.nextInt();

        int[] masyv = new int[ilgis];

        for(int i = 0; i < masyv.length; i++){

            System.out.println(String.format("iveskite %d elementa", i));
            masyv[i] = sc.nextInt();

        }

        for(int i = 0; i < masyv.length; i++){
            if(masyv[i] > 100)
            {
                System.out.println(masyv[i]);
            }

        }

    }
}


