package faceprep;
import java.util.Scanner;
import java.util.Arrays;
public class ClassAssignment {
	

	public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j=3;
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        
	}}