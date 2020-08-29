package playM;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeList {

    public static void main(String []args){

        ArrayList pitches = new ArrayList();
        pitches.add(0,"138");
        pitches.add(1,"129");
        pitches.add(2,"142");


        Scanner scan = new Scanner(System.in);
        String s ;

        System.out.println(pitches.get(1));
        System.out.println(pitches.contains("142"));
        System.out.println(pitches.size());
        System.out.println(pitches.remove("129"));
        System.out.println(pitches.get(1));



    }//main

}//Class
