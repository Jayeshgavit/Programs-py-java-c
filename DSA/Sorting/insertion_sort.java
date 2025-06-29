package DSA.Sorting;

import java.util.Arrays;

public class insertion_sort {

    public static int[] insertion_sorta(int[] arr) {
        
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;


            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,6};

        int[] rs = insertion_sorta(arr); 
        System.out.println(Arrays.toString(rs));
    }
}
