package Classes;

import interfaces.IntList;

import java.util.Arrays;

public class IntVector implements IntList {
    private  int[] numbersList ;

    public IntVector() {
        numbersList = new int[10];
    }

    public void addNumber(int number) {

        if (numbersList[numbersList.length - 1] != 0) {
            int[] newNumbersList = new int[2*numbersList.length];
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
        return "IntVector{" +
                "numbersList=" + Arrays.toString(numbersList) +
                '}';
    }
}
