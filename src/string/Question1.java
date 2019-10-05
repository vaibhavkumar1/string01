package string;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string=s.nextLine();
        System.out.print("index:");
        for(int i=0;i<string.length();i++){
            System.out.print("\t"+i);
        }
        System.out.println("\n");
        System.out.print("chars:");
        for (int i=0;i<string.length();i++){
            System.out.print("\t"+string.substring(0+i,i+1));
        }
    }
}
