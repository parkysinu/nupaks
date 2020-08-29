package playM;

import java.awt.event.*;

public class SuperDiceNumber implements Runnable{

    public void run() {
        String blank = "";
        System.out.print("≧");
//        long beforeTime = System.currentTimeMillis();


            for (int i = 2; i < 13; i++) {


                System.out.print("　" + i + "　");

                if(SuperDiceTime.stop){
                    return;
                }
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                long afterTime = System.currentTimeMillis();

                }







            for (int i = 11; i > 1; i--) {

                System.out.print("　" + i + "　");

                if(SuperDiceTime.stop){
                    return;
                }
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                long afterTime = System.currentTimeMillis();



            }




        }
}


