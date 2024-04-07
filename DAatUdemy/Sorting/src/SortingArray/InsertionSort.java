package SortingArray;/*
 *   6508185
 *   Pitthawat
 */

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        //6 to 0
        for(int firstUnsortedIndex=1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++){
            int newElement=intArray[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex; i>0 && intArray[i-1]>newElement; i--){
                intArray[i]=intArray[i-1];
            }
            intArray[i]=newElement;
        }

        System.out.println(Arrays.toString(intArray));
    }
    public static void swap(int [] array,int i , int j){
        if(i==j){
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
