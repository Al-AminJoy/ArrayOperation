
package arrayoperation;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args){
        int [] arr={1,-3,5,2,8};
        Arrays.sort(arr);
        System.out.println("Accending :");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Decending :");
        for(int i=4;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
