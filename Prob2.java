package Assignment9;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        int count=1;
        for(String i : arr){
            if(count%2==0){
                System.out.println(i);
                count++;
                continue;
            }
            count++;
        }
    }
}
