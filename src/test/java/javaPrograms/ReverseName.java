package javaPrograms;

import java.util.Scanner;

public class ReverseName {

    public  String reveName(String input){
        String []ipStrArr=input.split(" ");
        String opString = "";

        for(int i=ipStrArr.length-1;i>=0;i--){
            opString+=ipStrArr[i]+" ";
            System.out.println(opString);

        }
        return opString;
    }
    public static void main(String args[]){
        System.out.println("Enter input string: "+"\n");
        Scanner sc= new Scanner(System.in);
        ReverseName revNm=new ReverseName();
//        revNm.reveName( sc.nextLine());
        System.out.println("Reverse string is : "+  revNm.reveName( sc.nextLine()));

    }
}
