package SortingArray;
//Recursive
//splitting and merging
//splitting or dividing left and right into to two arrays
//then merge into sorted array

import java.util.Arrays;

/*split each element into partitions of size 1

        recursively merge adjacent partitions

        for i = leftPartIdx to rightPartIdx

        if leftPartHeadValue <= rightPartHeadValue

        copy leftPartHeadValue

        else: copy rightPartHeadValue; Increase InvIdx

        copy elements back to original array*/
//แบ่งทุกทุกตำแหน่งออกเป็น {20},{35},{-15}... เป็นต้น
//จากนั้นจะทำการ merge และ sort ไปพร้อมๆ กัน ด้วยการเทียบ array ซ้าย กับ array ขวา
//เทียบหาตัวที่น้อยที่สุดไปใส่ก่อนใน array ใหม่ ตามลำดับจนครบ จึงได้ array ใหม่ แล้วนำไปเทียบกับ array ขวา ต่อไปเรื่อยๆ
//หาก array ไม่มีคู่จะรอจนกว่าจะมีคู่ merge ในรอบต่อไป
//ทำซ้ำจนกว่าจะครบทุกตัวเป้น array เดียวที่เรียงแล้ว
public class MergeSort {
    public static void main(String[] args) {
        int[] intArray={20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray,0,intArray.length);
        System.out.println(Arrays.toString(intArray));
    }
    public static void mergeSort(int[] input, int start, int end){
        //one element array is the breakpoint
        if(end-start<2){
            return;
        }
        //partitioning
        int mid=(start+end)/2;
        //left
        //{20, 35, -15, is sorting
        mergeSort(input, start, mid);//stacking changed

        //right
        //7, 55, 1, -22}; is sorting
        mergeSort(input, mid, end);
        merge(input,start,mid,end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        //if left is less than right is the breaking point
        //or nothing change or everything is sorted after merged
        if(input[mid-1]<=input[mid]){
            return;
        }
        int i=start;
        int j=mid;
        int tempIndex=0;
        int[] temp=new int[end-start];
        while (i<mid&&j<end){
            temp[tempIndex++]=input[i]<=input[j]?input[i++]:input[j++];
        }
        //there might be leftover element
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        System.arraycopy(temp,0,input,start,tempIndex);
    }
}
