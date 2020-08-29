package fishShapedBunTycoon3rd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static fishShapedBunTycoon3rd.GUIGame.*;

public class TimeCount implements Runnable{

    fishShapedBunTycoonFinal.GUIGame guiGame =new fishShapedBunTycoonFinal.GUIGame();

    static boolean gameover;
    Timer timeCount;
    public void run(){
        try{
            timeCount = new javax.swing.Timer(1000, new ActionListener() {
                    int count = 20;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count--;
                        System.out.println("left playing game time : "+count);
                        timeLeft.setText(Integer.toString(count));
                        if(Guest.gameover){
                            return;
                        }
                        if(count==0){
                            guiGame.dispose();
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
