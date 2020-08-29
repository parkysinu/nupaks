package fishShapedBunTycoonFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static fishShapedBunTycoonFinal.GUIGame.timeLeft;

public class TimeCount implements Runnable{

    static boolean gameover;
    Timer timeCount;
    public void run(){
        try{
            timeCount = new Timer(1000, new ActionListener() {
                    int count = 120;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count--;
                        System.out.println("left playing game time : "+count);
                        timeLeft.setText(Integer.toString(count));
                        if(Guest.gameover){
                            return;
                        }
                        if(count==0){
                            timeCount.stop();
                            gameover=true;
                            new GameEnd();
                            return;
                        }
                    }
                });
        }catch(Exception e){
            e.printStackTrace();
        }
        timeCount.start();
    }



}
