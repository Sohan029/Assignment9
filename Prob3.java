package Assignment9;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int a : arr){
            if(a%2==0){
                System.out.println(a);
            }
        }
    }
}
