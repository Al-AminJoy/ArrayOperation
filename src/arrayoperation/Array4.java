package arrayoperation;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args){
       
       Scanner sc=new Scanner(System.in);
        int [][] number=new int [2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter Number For "+i+","+j+" Here : ");
                int num=sc.nextInt();
                number[i][j]=num;
            }
            System.out.println();
        }
        System.out.println("Matrix Are : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

    }
}
