package Main;

import Classes.IntArrayList;
import Classes.IntVector;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        System.out.println("=====Big Decimal exercises=====");
        System.out.println("x: "+doubleNumber(new BigDecimal(2.4587)));
        System.out.println("x: "+reverse(new BigDecimal(-45.67)));

        System.out.println("==========Exercise 5==========");
        IntArrayList intArrayList = new IntArrayList();
        intArrayList.addNumber(21);
        intArrayList.addNumber(22);
        intArrayList.addNumber(23);
        intArrayList.addNumber(24);
        intArrayList.addNumber(25);
        intArrayList.addNumber(26);
        intArrayList.addNumber(27);
        intArrayList.addNumber(28);
        intArrayList.addNumber(29);
        intArrayList.addNumber(30);
        intArrayList.addNumber(31);
        intArrayList.addNumber(32);
        intArrayList.addNumber(33);


        System.out.println("The number is: "+intArrayList.getNumber(2));
        System.out.println(intArrayList.toString());

        IntVector intVector = new IntVector();
        intVector.addNumber(21);
        intVector.addNumber(22);
        intVector.addNumber(23);
        intVector.addNumber(24);
        intVector.addNumber(25);
        intVector.addNumber(26);
        intVector.addNumber(27);
        intVector.addNumber(28);
        intVector.addNumber(29);
        intVector.addNumber(30);
        intVector.addNumber(31);
        intVector.addNumber(32);
        intVector.addNumber(33);

        System.out.println("The number is: "+intVector.getNumber(5));
        System.out.println(intVector.toString());



    }

    public static BigDecimal doubleNumber(BigDecimal number){
        BigDecimal x = number.add(number);
        BigDecimal displayValue = x.setScale(2, RoundingMode.HALF_EVEN);
        return displayValue;
    }

    public static BigDecimal reverse(BigDecimal number){
        BigDecimal x = number.multiply(new BigDecimal(-1));
        BigDecimal displayValue = x.setScale(1, RoundingMode.HALF_EVEN);
        return displayValue;
    }


}
