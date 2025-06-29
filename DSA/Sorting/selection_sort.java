package DSA.Sorting;
import java.util.Arrays;

public class selection_sort {

    
    public static int[] selection_sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){

            int min_idx = i;

            for(int j= i+1; j <n; j++){

                if(arr[j] < arr[min_idx]){
                    min_idx = j ;

                }
            }
             int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;

    }


    public static void main(String[] args) {
        
        int[] arr= {6,2,3,4,1};

       int[] rs = selection_sort(arr);
       System.out.println(Arrays.toString(rs));
    }
}
