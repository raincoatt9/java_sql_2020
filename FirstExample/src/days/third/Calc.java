package days.third;

/////@just


import days.second.numberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calc {
    private int fNum;
    private int sNum;

    public Calc(int fNum,int sNum){
        this.fNum = fNum;
        this.sNum = sNum;
    }

    protected int sum() {
        return fNum + sNum;
    }
    protected int minus(){
        return fNum - sNum;
    }
    protected double dalyba(Scanner sc){
        while (sNum == 0)
        {
            System.out.println("tokia dalyba negalima, iveskite nauja skaiciu");
            sNum = (int) numberUtils.getCorrectNumber(sc);
        }
        return fNum / sNum;
    }
    protected int daugyba(){
        return fNum * sNum;
    }
    protected double kelimas(){
        return Math.pow(fNum,sNum);

    }
}
