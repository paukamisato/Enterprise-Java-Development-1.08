package Classes;

import interfaces.IntList;
import java.math.BigDecimal;
import java.util.Arrays;

public class IntArrayList implements IntList {
    private  int[] numbersList ;

    public IntArrayList() {
        numbersList = new int[10];
    }

    public void addNumber(int number) {

        if (numbersList[numbersList.length - 1] != 0) {
            BigDecimal a = new BigDecimal("1.5");
            BigDecimal b = a.multiply(new BigDecimal(numbersList.length));
            int newLength = b.intValue();
            int[] newNumbersList = new int[newLength];
            for (int i = 0; i < numbersList.length; i++) {
                newNumbersList[i] = numbersList[i];
            }
            newNumbersList[numbersList.length] = number;
            setNumbersList(newNumbersList);
        }else{
            for (int i = 0; i < numbersList.length; i++){
                if(numbersList[i] == 0){
                    numbersList[i]=number;
                    break;
                }
            }
        }
    }

    public int getNumber(int idNumber){
        return  numbersList[idNumber];
    }

    public int[] getNumbersList() {
        return numbersList;
    }

    public void setNumbersList(int[] numbersList) {
        this.numbersList = numbersList;
    }

    @Override
    public String toString() {
        return "IntArrayList{" +
                "numbersList=" + Arrays.toString(numbersList) +
                '}';
    }
}