package fishShapedBunTycoonFinal;

import fishShapedBunTycoon.GUIMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static fishShapedBunTycoonFinal.GUIGame.*;

public class Guest extends JButton implements Runnable{

    ImageIcon guestBlankImage = new ImageIcon((GUIMain.class.getResource("../image/guestBlank1.png")));

    ImageIcon guest1WaitingImage = new ImageIcon((GUIMain.class.getResource("../image/guest1Waiting.png")));
    ImageIcon guest1MadImage = new ImageIcon((GUIMain.class.getResource("../image/guest1Mad.png")));
    ImageIcon guest2WaitingImage = new ImageIcon((GUIMain.class.getResource("../image/guest2Waiting.png")));
    ImageIcon guest2MadImage = new ImageIcon((GUIMain.class.getResource("../image/guest2Mad.png")));
    ImageIcon guest3WaitingImage = new ImageIcon((GUIMain.class.getResource("../image/guest3Waiting.png")));
    ImageIcon guest3MadImage = new ImageIcon((GUIMain.class.getResource("../image/guest3Mad.png")));

    ImageIcon dialogImage =  new ImageIcon((GUIMain.class.getResource("../image/dialog.png")));
    ImageIcon blankDialogImage =  new ImageIcon((GUIMain.class.getResource("../image/blankDialog.png")));

    JLabel Dialog = new JLabel();

    Random choice = new Random();

    static boolean gameover;

    boolean noGuest;
    boolean guest1IsVisited;
    boolean guest2IsVisited;
    boolean guest3IsVisited;

    boolean guest1IsWaiting;
    boolean guest2IsWaiting;
    boolean guest3IsWaiting;

    boolean guest1IsMad;
    boolean guest2IsMad;
    boolean guest3IsMad;

    boolean guest1WillExit;
    boolean guest2WillExit;
    boolean guest3WillExit;

    boolean guest1GetFish;
    boolean guest2GetFish;
    boolean guest3GetFish;

    boolean guestBlank;
    boolean guestVisit;
    boolean guestOrder;
    boolean guestWait;
    boolean guestMad;
    boolean guestLastWord;
    boolean guestExit;
    boolean sellFish;

    Timer guestBlankTimer;
    Timer guestWaitingTimer;
    Timer guestGetMadTimer;
    Timer guestLastWordTimer;
    Timer guestSellFishBunTimer;
    Timer notEnoughFishBunTimer;

    Timer guestBlankTimerForPlace2;
    Timer guestWaitingTimerForPlace2;
    Timer guestGetMadTimerForPlace2;
    Timer guestLastWordTimerForPlace2;
    Timer guestSellFishBunTimerForPlace2;
    Timer notEnoughFishBunTimerForPlace2;

    int demandNumberOfFish;
    JButton Guest = new JButton();

    Guest(){
        Guest.setLayout(null);
        Guest.setContentAreaFilled(false);
        Guest.setFocusPainted(false);
        setIcon(guestBlankImage);
        setVisible(true);
        setNoGuest(true);
    }

    public void setSellFish(boolean sellFish){
        this.sellFish = sellFish;
    }
    public boolean getSellFish(){
        return sellFish;
    }

    public int getDemandNumberOfFish() {
        return demandNumberOfFish;
    }

    public void setDemandNumberOfFish(int demandNumberOfFish) {
        this.demandNumberOfFish = demandNumberOfFish;
    }

    public boolean isNoGuest() {
        return noGuest;
    }

    public void setNoGuest(boolean noGuest) {
        this.noGuest = noGuest;
    }

    public boolean isGuest1IsVisited() {
        return guest1IsVisited;
    }

    public void setGuest1IsVisited(boolean guest1IsVisited) {
        this.guest1IsVisited = guest1IsVisited;
    }

    public boolean isGuest2IsVisited() {
        return guest2IsVisited;
    }

    public void setGuest2IsVisited(boolean guest2IsVisited) {
        this.guest2IsVisited = guest2IsVisited;
    }

    public boolean isGuest3IsVisited() {
        return guest3IsVisited;
    }

    public void setGuest3IsVisited(boolean guest3IsVisited) {
        this.guest3IsVisited = guest3IsVisited;
    }

    public boolean isGuest1IsWaiting() {
        return guest1IsWaiting;
    }

    public void setGuest1IsWaiting(boolean guest1IsWaiting) {
        this.guest1IsWaiting = guest1IsWaiting;
    }

    public boolean isGuest2IsWaiting() {
        return guest2IsWaiting;
    }

    public void setGuest2IsWaiting(boolean guest2IsWaiting) {
        this.guest2IsWaiting = guest2IsWaiting;
    }

    public boolean isGuest3IsWaiting() {
        return guest3IsWaiting;
    }

    public void setGuest3IsWaiting(boolean guest3IsWaiting) {
        this.guest3IsWaiting = guest3IsWaiting;
    }

    public boolean isGuest1IsMad() {
        return guest1IsMad;
    }

    public void setGuest1IsMad(boolean guest1IsMad) {
        this.guest1IsMad = guest1IsMad;
    }

    public boolean isGuest2IsMad() {
        return guest2IsMad;
    }

    public void setGuest2IsMad(boolean guest2IsMad) {
        this.guest2IsMad = guest2IsMad;
    }

    public boolean isGuest3IsMad() {
        return guest3IsMad;
    }

    public void setGuest3IsMad(boolean guest3IsMad) {
        this.guest3IsMad = guest3IsMad;
    }

    public boolean isGuestBlank() {
        return guestBlank;
    }

    public void setGuestBlank(boolean guestBlank) {
        this.guestBlank = guestBlank;
    }

    public boolean isGuestVisit() {
        return guestVisit;
    }

    public void setGuestVisit(boolean guestVisit) {
        this.guestVisit = guestVisit;
    }

    public boolean isGuestOrder() {
        return guestOrder;
    }

    public void setGuestOrder(boolean guestOrder) {
        this.guestOrder = guestOrder;
    }

    public boolean isGuestWait() {
        return guestWait;
    }

    public void setGuestWait(boolean guestWait) {
        this.guestWait = guestWait;
    }

    public boolean isGuestMad() {
        return guestMad;
    }

    public void setGuestMad(boolean guestMad) {
        this.guestMad = guestMad;
    }

    public boolean isGuestLastWord() {
        return guestLastWord;
    }

    public void setGuestLastWord(boolean guestLastWord) {
        this.guestLastWord = guestLastWord;
    }

    public boolean isGuestExit() {
        return guestExit;
    }

    public void setGuestExit(boolean guestExit) {
        this.guestExit = guestExit;
    }

    //    public void run(){
//
//        try{
//            if (getIcon().equals(guestBlankImage)) {
//            if(noGuest){
//                guestPlace1.setGuest1IsWaiting(true);
//                guestPlace1.setIcon(guest1WaitingImage);
//                demandNumberOfFish = choice.nextInt(5)+1;
//                dialogTextGuestPlace1.setText("give "+demandNumberOfFish +" fish bun");
//                return;
//            }
//            }
//            else if(getIcon().equals(guest1WaitingImage)){
//                dialogTextGuestPlace1.setText("give "+demandNumberOfFish +" fish bun");
//                return;
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//
//    }

    public void run(){

        noGuest();
        noGuestForPlace2();

    }


//    public void run(){
//
//            while(true) {
//                try {
//                    Thread.sleep(5000);
//                    if (getIcon().equals(guestBlankImage)) {
//                        if (guestPlace1.noGuest) {
//                            int guest = choice.nextInt(3);
//                            if (guest == 0) {
//                                setGuest1IsVisited(true);
//                                setIcon(guest1WaitingImage);
//                                repaint();
//                                guest1IsWaiting = true;
//                                demandNumberOfFish = choice.nextInt(10) + 1;
//                                setDemandNumberOfFish(demandNumberOfFish);
//                                //시간이 지남에 따라 손님의 기분이 바껴서 이미지가 화난 이미지로 변경 된다.
//                                //boolean 값을 주고 손님이 하는 말이 바뀌 도록 함.
//                                for (int i = 0; i < 2; i++) {
//                                    if (i == 0) {
//                                        if (guest1IsWaiting) {
//                                            //dialogImagePlace1.setIcon(dialogImagePlace1.dialogImage);
//                                            dialogTextGuestPlace1.setText(getDemandNumberOfFish() + " fish bun please!");
//                                            try{Thread.sleep(demandNumberOfFish * 2000);}catch(InterruptedException e){
//                                                e.printStackTrace();
//                                            }
//                                            guest1IsWaiting = false;
//                                            guest1IsMad = true;
//                                        }
//                                    } else if (i == 1) {
//                                        if (guest1IsMad) {
//                                            //dialogImagePlace1.setIcon(dialogImagePlace1.dialogImage);
//                                            dialogTextGuestPlace1.setText("hurry up! " + getDemandNumberOfFish() + " fish bun please!");
//                                            setIcon(guest1MadImage);
//                                            repaint();
//                                            try{Thread.sleep(demandNumberOfFish * 1000);}catch(InterruptedException e){}
//                                            guest1IsMad = false;
//                                            guest1WillExit = true;
//                                        }
//                                    }
//                                }
//                                if (guest1WillExit) {
//                                    //dialogImagePlace1.setIcon(dialogImagePlace1.dialogImage);
//                                    dialogTextGuestPlace1.setText("You are too lazy!");
//                                    try{Thread.sleep(1000);}catch(InterruptedException e){}
//                                    Player.life = Player.life - 1;
//                                    GUIGame.renewalLife();
//                                    setIcon(guestBlankImage);
//                                    repaint();
//                                    guest1WillExit = false;
//                                    //dialogImagePlace1.setIcon(dialogImagePlace1.blankDialogImage);
//                                    dialogTextGuestPlace1.setText(null);
//                                    if (Player.life <= 0) {
//                                        Thread.interrupted();
//                                        new GameEnd();
//                                    }
//                                }
//                            } else if (guest == 1) {
//                                setIcon(guest2WaitingImage);
//                                repaint();
//                                guest2IsWaiting = true;
//                                setGuest2IsVisited(true);
//                                demandNumberOfFish = choice.nextInt(10) + 1;
//                                setDemandNumberOfFish(demandNumberOfFish);
//                                //시간이 지남에 따라 손님의 기분이 바껴서 이미지가 화난 이미지로 변경 된다.
//                                //boolean 값을 주고 손님이 하는 말이 바뀌 도록 함.
//                                for (int i = 0; i < 2; i++) {
//                                    if (i == 0) {
//                                        if (guest2IsWaiting) {
//                                            //dialogImagePlace1.setIcon(dialogImagePlace1.dialogImage);
//                                            dialogTextGuestPlace1.setText(getDemandNumberOfFish() + " fish bun please!");
//                                            try{Thread.sleep(demandNumberOfFish * 2000);}catch(InterruptedException e){
//                                                e.printStackTrace();
//                                            }
//                                            guest2IsWaiting = false;
//                                            guest2IsMad = true;
//                                        }
//                                    } else if (i == 1) {
//                                        if (guest2IsMad) {
//                                            //dialogImagePlace1.setIcon(dialogImagePlace1.dialogImage);
//                                            dialogTextGuestPlace1.setText("hurry up! " + getDemandNumberOfFish() + " fish bun please!");
//                                            setIcon(guest2MadImage);
//                                            repaint();
//                                            try{Thread.sleep(demandNumberOfFish * 1000);}catch(InterruptedException e){}
//                                            guest2IsMad = false;
//                                            guest2WillExit = true;
//                                        }
//                                    }
//                                }
//                                if (guest2WillExit) {
//                                    //dialogImagePlace1.setIcon(dialogImagePlace1.dialogImage);
//                                    dialogTextGuestPlace1.setText("You are too lazy!");
//                                    try{Thread.sleep(1000);}catch(InterruptedException e){}
//                                    Player.life = Player.life - 1;
//                                    GUIGame.renewalLife();
//                                    guest2WillExit = false;
//                                    setIcon(guestBlankImage);
//                                    repaint();
//                                    //dialogImagePlace1.setIcon(dialogImagePlace1.blankDialogImage);
//                                    dialogTextGuestPlace1.setText(null);
//                                    if (Player.life <= 0) {
//                                        Thread.interrupted();
//                                        new GameEnd();
//                                    }
//                                }
//                            } else if (guest == 2) {
//                                setIcon(guest3WaitingImage);
//                                repaint();
//                                guest3IsWaiting = true;
//                                setGuest3IsVisited(true);
//                                demandNumberOfFish = choice.nextInt(10) + 1;
//                                setDemandNumberOfFish(demandNumberOfFish);
//                                //시간이 지남에 따라 손님의 기분이 바껴서 이미지가 화난 이미지로 변경된다.
//                                //boolean값을 주고 손님이 하는 말이 바뀌도록 함.
//                                for (int i = 0; i < 2; i++) {
//                                    if (i == 0) {
//                                        if (guest3IsWaiting) {
//                                            //dialogImagePlace1.setIcon(dialogImagePlace1.dialogImage);
//                                            dialogTextGuestPlace1.setText(getDemandNumberOfFish() + " fish bun please!");
//                                            try{Thread.sleep(demandNumberOfFish * 2000);}catch(InterruptedException e){}
//                                            guest3IsWaiting = false;
//                                            guest3IsMad = true;
//                                        }
//                                    } else if (i == 1) {
//                                        if (guest3IsMad) {
//                                            //dialogImagePlace1.setIcon(dialogImagePlace1.dialogImage);
//                                            dialogTextGuestPlace1.setText("hurry up! " + getDemandNumberOfFish() + " fish bun please!");
//                                            setIcon(guest3MadImage);
//                                            repaint();
//                                            try{Thread.sleep(demandNumberOfFish * 1000);}catch(InterruptedException e){}
//                                            guest3IsMad = false;
//                                            guest3WillExit = true;
//                                        }
//                                    }
//                                }
//                                if (guest3WillExit) {
//                                    //dialogImagePlace1.setIcon(dialogImagePlace1.dialogImage);
//                                    dialogTextGuestPlace1.setText("You are too lazy!");
//                                    try{Thread.sleep(1000);}catch(InterruptedException e){}
//                                    Player.life = Player.life - 1;
//                                    GUIGame.renewalLife();
//                                    setIcon(guestBlankImage);
//                                    repaint();
//                                    guest3WillExit = false;
//                                    //dialogImagePlace1.setIcon(dialogImagePlace1.blankDialogImage);
//                                    dialogTextGuestPlace1.setText(null);
//                                    if (Player.life <= 0) {
//                                        Thread.interrupted();
//                                        new GameEnd();
//                                    }
//                                }
//                            }
//                        }
////                    if (guestPlace2.noGuest) {
////                        int guest = choice.nextInt(3);
////                        if (guest == 0) {
////                            setGuest1IsVisited(true);
////                            setIcon(guest1WaitingImage);
////                            repaint();
////                            guest1IsWaiting=true;
////
////                            demandNumberOfFish = choice.nextInt(10)+1;
////                            setDemandNumberOfFish(demandNumberOfFish);
////                            //시간이 지남에 따라 손님의 기분이 바껴서 이미지가 화난 이미지로 변경된다.
////                            //boolean값을 주고 손님이 하는 말이 바뀌도록 함.
////                            for(int i=0;i<2;i++){
////                                if(i==0){
////                                    if(guest1IsWaiting) {
////                                        //dialogImagePlace2.setIcon(dialogImagePlace2.dialogImage);
////                                        dialogTextGuestPlace2.setText(getDemandNumberOfFish()+"place2");
////                                        repaint();
////                                        revalidate();
////                                        Thread.sleep(demandNumberOfFish * 2000);
////                                        guest1IsWaiting = false;
////                                        guest1IsMad = true;
////                                    }
////                                }
////                                else if(i==1){
////                                    if(guest1IsMad) {
////                                        //dialogImagePlace2.setIcon(dialogImagePlace2.dialogImage);
////                                        dialogTextGuestPlace2.setText("hurry up! "+getDemandNumberOfFish()+"place2");
////
////                                        setIcon(guest1MadImage);
////                                        repaint();
////                                        revalidate();
////                                        Thread.sleep(demandNumberOfFish * 1000);
////                                        guest1IsMad=false;
////                                        guest1WillExit=true;
////                                    }
////                                }
////                            }
////                            if(guest1WillExit){
////                                //dialogImagePlace2.setIcon(dialogImagePlace2.dialogImage);
////                                dialogTextGuestPlace2.setText("place2");
////                                repaint();
////                                revalidate();
////                                Thread.sleep(1000);
////                                Player.life= Player.life-1;
////                                GUIGame.renewalLife();
////                                setIcon(guestBlankImage);
////                                repaint();
////                                guest1WillExit=false;
////                                //dialogImagePlace2.setIcon(dialogImagePlace2.blankDialogImage);
////                                dialogTextGuestPlace2.setText(null);
////                                if(Player.life<=0) {
////                                    Thread.interrupted();
////                                    new GameEnd();
////                                }
////                            }
////                        } else if (guest == 1) {
////
////                            setIcon(guest2WaitingImage);
////                            repaint();
////                            guest2IsWaiting=true;
////                            setGuest2IsVisited(true);
////                            demandNumberOfFish = choice.nextInt(10)+1;
////                            setDemandNumberOfFish(demandNumberOfFish);
////                            //시간이 지남에 따라 손님의 기분이 바껴서 이미지가 화난 이미지로 변경된다.
////                            //boolean값을 주고 손님이 하는 말이 바뀌도록 함.
////                            for(int i=0;i<2;i++){
////                                if(i==0){
////                                    if(guest2IsWaiting) {
////                                        //dialogImagePlace2.setIcon(dialogImagePlace2.dialogImage);
////                                        dialogTextGuestPlace2.setText(getDemandNumberOfFish()+"place2");
////                                        repaint();
////                                        revalidate();
////                                        Thread.sleep(demandNumberOfFish * 2000);
////                                        guest2IsWaiting = false;
////                                        guest2IsMad = true;
////                                    }
////                                }
////                                else if(i==1){
////                                    if(guest2IsMad) {
////                                        //dialogImagePlace2.setIcon(dialogImagePlace2.dialogImage);
////                                        dialogTextGuestPlace2.setText("hurry up! "+getDemandNumberOfFish()+"place2");
////                                        repaint();
////                                        revalidate();
////                                        setIcon(guest2MadImage);
////                                        repaint();
////                                        Thread.sleep(demandNumberOfFish * 1000);
////                                        guest2IsMad=false;
////                                        guest2WillExit=true;
////                                    }
////                                }
////                            }
////                            if(guest2WillExit){
////                                //dialogImagePlace2.setIcon(dialogImagePlace2.dialogImage);
////                                dialogTextGuestPlace2.setText("place2");
////
////                                Thread.sleep(1000);
////                                Player.life= Player.life-1;
////                                GUIGame.renewalLife();
////                                setIcon(guestBlankImage);
////                                repaint();
////                                revalidate();
////                                guest2WillExit=false;
////                                //dialogImagePlace2.setIcon(dialogImagePlace2.blankDialogImage);
////                                dialogTextGuestPlace2.setText(null);
////                                if(Player.life<=0) {
////                                    Thread.interrupted();
////                                    new GameEnd();
////                                }
////                            }
////                        } else if (guest == 2) {
////                            setIcon(guest3WaitingImage);
////                            repaint();
////                            revalidate();
////                            guest3IsWaiting=true;
////                            setGuest3IsVisited(true);
////                            demandNumberOfFish = choice.nextInt(10)+1;
////                            setDemandNumberOfFish(demandNumberOfFish);
////                            //시간이 지남에 따라 손님의 기분이 바껴서 이미지가 화난 이미지로 변경된다.
////                            //boolean값을 주고 손님이 하는 말이 바뀌도록 함.
////                            for(int i=0;i<2;i++){
////                                if(i==0){
////                                    if(guest3IsWaiting) {
////                                        //dialogImagePlace2.setIcon(dialogImagePlace2.dialogImage);
////                                        dialogTextGuestPlace2.setText(getDemandNumberOfFish()+" place2");
////                                        repaint();
////                                        revalidate();
////                                        Thread.sleep(demandNumberOfFish * 2000);
////                                        guest3IsWaiting = false;
////                                        guest3IsMad = true;
////                                    }
////                                }
////                                else if(i==1){
////                                    if(guest3IsMad) {
////                                        //dialogImagePlace2.setIcon(dialogImagePlace2.dialogImage);
////                                        dialogTextGuestPlace2.setText("hurry up! "+getDemandNumberOfFish()+"place2");
////
////                                        setIcon(guest3MadImage);
////                                        repaint();
////                                        revalidate();
////                                        Thread.sleep(demandNumberOfFish * 1000);
////                                        guest3IsMad=false;
////                                        guest3WillExit=true;
////                                    }
////                                }
////                            }
////                            if(guest3WillExit){
////                                //dialogImagePlace2.setIcon(dialogImagePlace2.dialogImage);
////                                dialogTextGuestPlace2.setText("place2");
////
////                                Thread.sleep(1000);
////                                Player.life= Player.life-1;
////                                GUIGame.renewalLife();
////                                setIcon(guestBlankImage);
////                                repaint();
////                                revalidate();
////                                guest3WillExit=false;
////                                //dialogImagePlace2.setIcon(dialogImagePlace2.blankDialogImage);
////                                dialogTextGuestPlace2.setText(null);
////                                if(Player.life<=0) {
////                                    Thread.interrupted();
////                                    new GameEnd();
////                                }
////                            }                        }
////
////                    }
//
//
//                        //guestPlace3.noGuest
////                    if (guestPlace3.noGuest) {
////                        int guest = choice.nextInt(3);
////                        if (guest == 0) {
////                            setGuest1IsVisited(true);
////                            setIcon(guest1WaitingImage);
////                            repaint();
////                            guest1IsWaiting=true;
////                            demandNumberOfFish = choice.nextInt(10)+1;
////                            setDemandNumberOfFish(demandNumberOfFish);
////                            //시간이 지남에 따라 손님의 기분이 바껴서 이미지가 화난 이미지로 변경된다.
////                            //boolean값을 주고 손님이 하는 말이 바뀌도록 함.
////                            for(int i=0;i<2;i++){
////                                if(i==0){
////                                    if(guest1IsWaiting) {
////                                        //dialogImagePlace3.setIcon(dialogImagePlace3.dialogImage);
////                                        dialogTextGuestPlace3.setText(getDemandNumberOfFish()+" fish bun please!");
////
////                                        Thread.sleep(demandNumberOfFish * 2000);
////                                        guest1IsWaiting = false;
////                                        guest1IsMad = true;
////                                    }
////                                }
////                                else if(i==1){
////                                    if(guest1IsMad) {
////                                        //dialogImagePlace3.setIcon(dialogImagePlace3.dialogImage);
////                                        dialogTextGuestPlace3.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
////
////                                        setIcon(guest1MadImage);
////                                        repaint();
////                                        Thread.sleep(demandNumberOfFish * 1000);
////                                        guest1IsMad=false;
////                                        guest1WillExit=true;
////                                    }
////                                }
////                            }
////                            if(guest1WillExit){
////                                //dialogImagePlace3.setIcon(dialogImagePlace3.dialogImage);
////                                dialogTextGuestPlace3.setText("You are too lazy!");
////
////                                Thread.sleep(1000);
////                                Player.life= Player.life-1;
////                                GUIGame.renewalLife();
////                                setIcon(guestBlankImage);
////                                repaint();
////                                guest1WillExit=false;
////                                //dialogImagePlace3.setIcon(dialogImagePlace3.blankDialogImage);
////                                dialogTextGuestPlace3.setText(null);
////                                if(Player.life<=0) {
////                                    Thread.interrupted();
////                                    new GameEnd();
////                                }
////                            }
////                        } else if (guest == 1) {
////                            setIcon(guest2WaitingImage);
////                            repaint();
////                            guest2IsWaiting=true;
////                            setGuest2IsVisited(true);
////                            demandNumberOfFish = choice.nextInt(10)+1;
////                            setDemandNumberOfFish(demandNumberOfFish);
////                            //시간이 지남에 따라 손님의 기분이 바껴서 이미지가 화난 이미지로 변경된다.
////                            //boolean값을 주고 손님이 하는 말이 바뀌도록 함.
////                            for(int i=0;i<2;i++){
////                                if(i==0){
////                                    if(guest2IsWaiting) {
////                                        //dialogImagePlace3.setIcon(dialogImagePlace3.dialogImage);
////                                        dialogTextGuestPlace3.setText(getDemandNumberOfFish()+" fish bun please!");
////
////                                        Thread.sleep(demandNumberOfFish * 2000);
////                                        guest2IsWaiting = false;
////                                        guest2IsMad = true;
////                                    }
////                                }
////                                else if(i==1){
////                                    if(guest2IsMad) {
////                                        //dialogImagePlace3.setIcon(dialogImagePlace3.dialogImage);
////                                        dialogTextGuestPlace3.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
////
////                                        setIcon(guest2MadImage);
////                                        repaint();
////                                        Thread.sleep(demandNumberOfFish * 1000);
////                                        guest2IsMad=false;
////                                        guest2WillExit=true;
////
////                                    }
////                                }
////                            }
////                            if(guest2WillExit){
////                                //dialogImagePlace3.setIcon(dialogImagePlace3.dialogImage);
////                                dialogTextGuestPlace3.setText("You are too lazy!");
////
////                                Thread.sleep(1000);
////                                Player.life= Player.life-1;
////                                GUIGame.renewalLife();
////                                setIcon(guestBlankImage);
////                                repaint();
////                                guest2WillExit=false;
////                                //dialogImagePlace3.setIcon(dialogImagePlace3.blankDialogImage);
////                                dialogTextGuestPlace3.setText(null);
////                                if(Player.life<=0) {
////                                    Thread.interrupted();
////                                    new GameEnd();
////                                }
////                            }
////                        } else if (guest == 2) {
////                            setIcon(guest3WaitingImage);
////                            repaint();
////                            guest3IsWaiting=true;
////                            setGuest3IsVisited(true);
////                            demandNumberOfFish = choice.nextInt(10)+1;
////                            setDemandNumberOfFish(demandNumberOfFish);
////                            //시간이 지남에 따라 손님의 기분이 바껴서 이미지가 화난 이미지로 변경된다.
////                            //boolean값을 주고 손님이 하는 말이 바뀌도록 함.
////                            for(int i=0;i<2;i++){
////                                if(i==0){
////                                    if(guest3IsWaiting) {
////                                        //dialogImagePlace3.setIcon(dialogImagePlace3.dialogImage);
////                                        dialogTextGuestPlace3.setText(getDemandNumberOfFish()+" fish bun please!");
////
////                                        Thread.sleep(demandNumberOfFish * 2000);
////                                        guest3IsWaiting = false;
////                                        guest3IsMad = true;
////                                    }
////                                }
////                                else if(i==1){
////                                    if(guest3IsMad) {
////                                        //dialogImagePlace3.setIcon(dialogImagePlace3.dialogImage);
////                                        dialogTextGuestPlace3.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
////
////                                        setIcon(guest3MadImage);
////                                        repaint();
////                                        Thread.sleep(demandNumberOfFish * 1000);
////                                        guest3IsMad=false;
////                                        guest3WillExit=true;
////                                    }
////                                }
////                            }
////                            if(guest3WillExit){
////                                //dialogImagePlace3.setIcon(dialogImagePlace3.dialogImage);
////                                dialogTextGuestPlace3.setText("You are too lazy!");
////
////                                Thread.sleep(1000);
////                                Player.life= Player.life-1;
////                                GUIGame.renewalLife();
////                                setIcon(guestBlankImage);
////                                repaint();
////                                guest3WillExit=false;
////                                //dialogImagePlace3.setIcon(dialogImagePlace3.blankDialogImage);
////                                dialogTextGuestPlace3.setText(null);
////                                if(Player.life<=0) {
////                                    Thread.interrupted();
////                                    new GameEnd();
////                                }
////                            }                        }
////
////                    }
//                    }
//
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//    }

    public void setGuest1WillExit(boolean guest1WillExit){
        this.guest1WillExit = guest1WillExit;
    }
    public void setGuest2WillExit(boolean guest2WillExit){
        this.guest2WillExit = guest2WillExit;
    }
    public void setGuest3WillExit(boolean guest3WillExit){
        this.guest3WillExit = guest3WillExit;
    }

    public boolean isGuest1WillExit(){
        return guest1WillExit;
    }
    public boolean isGuest2WillExit(){
        return guest2WillExit;
    }
    public boolean isGuest3WillExit(){
        return guest3WillExit;
    }

    public void guest1PlaceBlank(){
        setGuest1IsVisited(false);
        setGuest1IsWaiting(false);
        setGuest1IsMad(false);
        setGuest1WillExit(false);
        setNoGuest(true);
    }


    public void guest2PlaceBlank(){
        setGuest2IsVisited(false);
        setGuest2IsWaiting(false);
        setGuest2IsMad(false);
        setGuest2WillExit(false);
        setNoGuest(true);
    }


    public void guest3PlaceBlank(){
        setGuest3IsVisited(false);
        setGuest3IsWaiting(false);
        setGuest3IsMad(false);
        setGuest3WillExit(false);
        setNoGuest(true);
    }


    public synchronized void setDialog() {


        try{

            //상태에 따라 다르게 출력되는 손님의 대사.
            Thread thread = Thread.currentThread();
            Thread.sleep(1000);
            //at guestPlace1
            if(guestPlace1.guest1IsWaiting){
                dialogTextGuestPlace1.setText(getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace1.guest1IsMad){
                dialogTextGuestPlace1.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace1.guest1WillExit){
                dialogTextGuestPlace1.setText("You are too lazy!");
            }
            if(guestPlace1.guest2IsWaiting){
                dialogTextGuestPlace1.setText(getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace1.guest2IsMad){
                dialogTextGuestPlace1.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace1.guest2WillExit){
                dialogTextGuestPlace1.setText("You are too lazy!");
            }
            if(guestPlace1.guest3IsWaiting){
                dialogTextGuestPlace1.setText(getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace1.guest3IsMad){
                dialogTextGuestPlace1.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace1.guest3WillExit){
                dialogTextGuestPlace1.setText("You are too lazy!");
            }

            //at guestPlace2
            if(guestPlace2.guest1IsWaiting){
                dialogTextGuestPlace2.setText(getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace2.guest1IsMad){
                dialogTextGuestPlace2.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace2.guest1WillExit){
                dialogTextGuestPlace2.setText("You are too lazy!");
            }
            if(guestPlace2.guest2IsWaiting){
                dialogTextGuestPlace2.setText(getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace2.guest2IsMad){
                dialogTextGuestPlace2.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace2.guest2WillExit){
                dialogTextGuestPlace2.setText("You are too lazy!");
            }
            if(guestPlace2.guest3IsWaiting){
                dialogTextGuestPlace2.setText(getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace2.guest3IsMad){
                dialogTextGuestPlace2.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace2.guest3WillExit){
                dialogTextGuestPlace2.setText("You are too lazy!");
            }

            //at guestPlace3
            if(guestPlace3.guest1IsWaiting){
                dialogTextGuestPlace3.setText(getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace3.guest1IsMad){
                dialogTextGuestPlace3.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace3.guest1WillExit){
                dialogTextGuestPlace3.setText("You are too lazy!");
            }
            if(guestPlace3.guest2IsWaiting){
                dialogTextGuestPlace3.setText(getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace3.guest2IsMad){
                dialogTextGuestPlace3.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace3.guest2WillExit){
                dialogTextGuestPlace3.setText("You are too lazy!");
            }
            if(guestPlace3.guest3IsWaiting){
                dialogTextGuestPlace3.setText(getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace3.guest3IsMad){
                dialogTextGuestPlace3.setText("hurry up! "+getDemandNumberOfFish()+" fish bun please!");
            }
            else if(guestPlace3.guest3WillExit){
                dialogTextGuestPlace3.setText("You are too lazy!");
            }



        }catch(Exception e){
            e.printStackTrace();
        }

    }


    //손님이 없다()
    //손님을 얼마나 기다릴지
    //손님을 다 기다리고 일정한 시간이 지나면 손님이 다시 들어 온다.

    public void noGuest(){

        setNoGuest(true);
        System.out.println("isNoGuest() : "+isNoGuest());
        System.out.println("guestPlace1.isNoGuest() : "+guestPlace1.isNoGuest());
        System.out.println("isGuestBlank() : "+isGuestBlank());
        System.out.println("guestPlace1.isGuestBlank() : "+guestPlace1.isGuestBlank());
        System.out.println("entered in no guest");
        setNoGuest(false);
        System.out.println("isNoGuest() : "+isNoGuest());
        System.out.println("guestPlace1.isNoGuest() : "+guestPlace1.isNoGuest());
        guestBlankTimer();
    }

    public void noGuestForPlace2(){

        guestPlace2.setNoGuest(true);
        System.out.println("isNoGuest() : "+isNoGuest());
        System.out.println("guestPlace2.isNoGuest() : "+guestPlace2.isNoGuest());
        System.out.println("isGuestBlank() : "+isGuestBlank());
        System.out.println("guestPlace2.isGuestBlank() : "+guestPlace2.isGuestBlank());
        System.out.println("entered in no guest");
        guestPlace2.setNoGuest(false);
        System.out.println("isNoGuest() : "+isNoGuest());
        System.out.println("guestPlace2.isNoGuest() : "+guestPlace2.isNoGuest());
        guestBlankTimerForPlace2();
    }


    //손님이 비어있는지 체크한다()
    //현재 손님의 자리에 손님이 이미지가 있는지 체크 && 손님이 입장한 상태인지 확인
    //위의 행동이 끝나면 손님이 입장 한다.
    public void guestCheckBlank(){

        guestBlankTimer.stop();
        System.out.println("entered in guestCheckBlank");
        if(!guestVisit){
            System.out.println("isGuestVisit() : "+isGuestVisit());
            System.out.println("guestPlace1.isGuestVisit() : "+guestPlace1.isGuestVisit());
            guestVisit();
        }
        else{
            System.out.println("else{noGuest}");
            noGuest();
        }

    }

    public void guestCheckBlankForPlace2(){

        guestBlankTimerForPlace2.stop();
        System.out.println("entered in guestCheckBlank");
        if(!guestPlace2.guestVisit){
            System.out.println("isGuestVisit() : "+guestPlace2.isGuestVisit());
            System.out.println("guestPlace2.isGuestVisit() : "+guestPlace2.isGuestVisit());
            guestPlace2.guestVisitForPlace2();
        }
        else{
            System.out.println("else{noGuest}");
            guestPlace2.noGuestForPlace2();
        }

    }


    //손님이 입장한다()
    //타이머 기능이 시작된다
    //손님이 입장했으니 손님이 대기하는 장소에 손님의 이미지가 생긴다.
    //손님의 상태가 입장 상태로 변경된다.
    //위의 행동이 끝나면 손님이 주문을 한다.
    public void guestVisit(){

        guestVisit=true;
        System.out.println("isGuestVisit() : "+isGuestVisit());
        System.out.println("guestPlace1.isGuestVisit() : "+guestPlace1.isGuestVisit());
        System.out.println("entered in guestVisit");
        setIcon(guest1WaitingImage);
        guestVisit=false;
        System.out.println("isGuestVisit() : "+isGuestVisit());
        System.out.println("guestPlace1.isGuestVisit() : "+guestPlace1.isGuestVisit());
        guestOrder();

    }

    public void guestVisitForPlace2(){

        guestPlace2.guestVisit=true;
        System.out.println("isGuestVisit() : "+guestPlace2.isGuestVisit());
        System.out.println("guestPlace2.isGuestVisit() : "+guestPlace2.isGuestVisit());
        System.out.println("entered in guestVisit");
        setIcon(guest1WaitingImage);
        guestPlace2.guestVisit=false;
        System.out.println("isGuestVisit() : "+guestPlace2.isGuestVisit());
        System.out.println("guestPlace2.isGuestVisit() : "+guestPlace2.isGuestVisit());
        guestPlace2.guestOrderForPlace2();

    }

    //손님이 주문한다()
    //랜덤으로 숫자를 뽑아서 몇개를 주문할지 정한다.
    //텍스트로 몇개를 주문을 할건지 출력한다.
    //위의 행동이 끝나면 손님이 기다리는 상태로 변경 된다.

    //손님의 대사 출력 부분의 초기 설정이 null인지 확인 해야함. 아니면 수정 필요 ( )

    public void guestOrder(){

        guestOrder=true;
        System.out.println("isGuestOrder() : "+isGuestOrder());
        System.out.println("guestPlace1.isGuestOrder() : "+guestPlace1.isGuestOrder());
        System.out.println("entered in guestOrder");
        demandNumberOfFish=choice.nextInt(5)+1;
        dialogTextGuestPlace1.setText("give "+demandNumberOfFish+ " number of fish bun please");
        guestOrder=false;
        System.out.println("isGuestOrder() : "+isGuestOrder());
        System.out.println("guestPlace1.isGuestOrder() : "+guestPlace1.isGuestOrder());
        guestWait();
    }
    public void guestOrderForPlace2(){

        guestPlace2.guestOrder=true;
        System.out.println("isGuestOrder() : "+guestPlace2.isGuestOrder());
        System.out.println("guestPlace1.isGuestOrder() : "+guestPlace2.isGuestOrder());
        System.out.println("entered in guestOrder");
        demandNumberOfFish=choice.nextInt(5)+1;
        dialogTextGuestPlace2.setText("give "+guestPlace2.demandNumberOfFish+ " number of fish bun please");
        guestPlace2.guestOrder=false;
        System.out.println("isGuestOrder() : "+guestPlace2.isGuestOrder());
        System.out.println("guestPlace2.isGuestOrder() : "+guestPlace2.isGuestOrder());
        guestPlace2.guestWaitForPlace2();
    }

    //손님이 기다린다()
    //붕어빵을 받을 수 있다.
    //일정 시간이 지나면 손님의 상태가 변경된다.
    //위의 행동이 끝나면 손님이 화난 상태로 변경 된다.
    public void guestWait(){

        guestWait=true;
        System.out.println("isGuestWait() : "+isGuestWait());
        System.out.println("guestPlace1.isGuestWait() : "+guestPlace1.isGuestWait());
        System.out.println("entered in guestWait");
        guestWaitingTimer();

        System.out.println("isGuestWait() : "+isGuestWait());
        System.out.println("guestPlace1.isGuestWait() : "+guestPlace1.isGuestWait());


    }
    public void guestWaitForPlace2(){

        guestPlace2.guestWait=true;
        System.out.println("isGuestWait() : "+guestPlace2.isGuestWait());
        System.out.println("guestPlace2.isGuestWait() : "+guestPlace2.isGuestWait());
        System.out.println("entered in guestWait");
        guestWaitingTimerForPlace2();

        System.out.println("isGuestWait() : "+guestPlace2.isGuestWait());
        System.out.println("guestPlace2.isGuestWait() : "+guestPlace2.isGuestWait());


    }
    //손님이 화났다()
    //붕어빵을 받을 수 있다.
    //일정 시간이 지나면 손님의 상태가 변경된다.
    //위의 행동이 끝나면 손님이 마지막 한마디를 던진다.
    public void guestGetMad(){

        guestMad=true;
        System.out.println("isGuestMad() : "+isGuestMad());
        System.out.println("guestPlace1.isGuestMad() : "+guestPlace1.isGuestMad());
        System.out.println("entered in guestGetMad");
        guestWaitingTimer.stop();
        setIcon(guest1MadImage);
        dialogTextGuestPlace1.setText("give "+demandNumberOfFish+ "! give "+demandNumberOfFish+"!");
        guestGetMadTimer();

        System.out.println("isGuestMad() : "+isGuestMad());
        System.out.println("guestPlace1.isGuestMad() : "+guestPlace1.isGuestMad());

    }
    public void guestGetMadForPlace2(){

        guestPlace2.guestMad=true;
        System.out.println("isGuestMad() : "+guestPlace2.isGuestMad());
        System.out.println("guestPlace2.isGuestMad() : "+guestPlace2.isGuestMad());
        System.out.println("entered in guestGetMad");
        guestWaitingTimerForPlace2.stop();
        guestPlace2.setIcon(guest1MadImage);
        dialogTextGuestPlace2.setText("give "+guestPlace2.demandNumberOfFish+ "! give "+guestPlace2.demandNumberOfFish+"!");
        guestGetMadTimerForPlace2();

        System.out.println("isGuestMad() : "+guestPlace2.isGuestMad());
        System.out.println("guestPlace2.isGuestMad() : "+guestPlace2.isGuestMad());

    }
    //마지막 한 마디()
    //출력되는 텍스트에 변화가 생긴다.
    //클릭이 되도 붕어빵을 팔 수 없다.
    //라이프가 1 감소 한다.

    public void guestLastWord(){

        guestLastWord=true;
        System.out.println("isGuestLastWord() : "+isGuestLastWord());
        System.out.println("guestPlace1.isGuestLastWord() : "+guestPlace1.isGuestLastWord());
        System.out.println("entered in guestLastWord");
        guestGetMadTimer.stop();
        System.out.println("guestGetMadTimer.stop()");
        dialogTextGuestPlace1.setText("Your too lazy!");
        Player.life = Player.life-1;
        valueOfLife.setText(Integer.toString(Player.life));
        if(Player.life<=0){
            gameover=true;
            if(TimeCount.gameover){
                return;
            }
            new GameEnd();
            return;
        }
        guestLastWordTimer();

        System.out.println("guestPlace1.isGuestLastWord() : "+guestPlace1.isGuestLastWord());
    }
    public void guestLastWordForPlace2(){

        guestLastWord=true;
        System.out.println("isGuestLastWord() : "+isGuestLastWord());
        System.out.println("guestPlace2.isGuestLastWord() : "+guestPlace2.isGuestLastWord());
        System.out.println("entered in guestLastWord");
        guestGetMadTimerForPlace2.stop();
        System.out.println("guestGetMadTimer.stop()");
        dialogTextGuestPlace2.setText("Your too lazy!");
        Player.life = Player.life-1;
        valueOfLife.setText(Integer.toString(Player.life));
        if(Player.life<=0){
            gameover=true;
            if(TimeCount.gameover){
                return;
            }
            new GameEnd();
            return;
        }
        guestLastWordTimerForPlace2();

        System.out.println("guestPlace2.isGuestLastWord() : "+guestPlace2.isGuestLastWord());
    }
    //손님이 나간다.
    //손님의 이미지가 null로 변경된다.
    //손님의 대사가 null로 변경된다.
    //위의 행동이 모두 끝나면 blank상태로 변경된다.
    public void guestExit(){

        guestExit=true;
        System.out.println("isGuestExit() : "+isGuestExit());
        System.out.println("guestPlace1.isGuestExit() : "+guestPlace1.isGuestExit());
        System.out.println("entered int guestExit");
        if(guestLastWord){
            guestLastWord=false;
            guestLastWordTimer.stop();
        }
        if(sellFish){
            guestSellFishBunTimer.stop();
        }
        dialogTextGuestPlace1.setText(null);
        setIcon(null);
        guestExit=false;
        guestBlank=true;
        System.out.println("isGuestExit() : "+isGuestExit());
        System.out.println("guestPlace1.isGuestExit() : "+guestPlace1.isGuestExit());
        System.out.println("isGuestBlank() : "+isGuestBlank());
        System.out.println("guestPlace1.isGuestBlank() : "+guestPlace1.isGuestBlank());
        noGuest();
    }
    public void guestExitForPlace2(){

        guestExit=true;
        System.out.println("isGuestExit() : "+isGuestExit());
        System.out.println("guestPlace2.isGuestExit() : "+guestPlace1.isGuestExit());
        System.out.println("entered int guestExit");
        if(guestLastWord){
            guestLastWord=false;
            guestLastWordTimerForPlace2.stop();
        }
        if(sellFish){
            guestSellFishBunTimerForPlace2.stop();
        }
        dialogTextGuestPlace2.setText(null);
        setIcon(null);
        guestExit=false;
        guestBlank=true;
        System.out.println("isGuestExit() : "+isGuestExit());
        System.out.println("guestPlace2.isGuestExit() : "+guestPlace2.isGuestExit());
        System.out.println("isGuestBlank() : "+isGuestBlank());
        System.out.println("guestPlace2.isGuestBlank() : "+guestPlace2.isGuestBlank());
        noGuestForPlace2();
    }



    //손님이 붕어 빵을 받고 나간다()
    //클릭이 되면 위의 메소드가 실행 된다.
    //붕어 빵의 갯수가 판 갯수만큼 감소
    //붕어 빵을 판 갯수 만큼 붕어빵 코인의 갯수가 늘어남.
    //붕어 빵을 잘 먹겠다는 손님의 대사 출력
    //손님이 나간다.
    //위의 행동이 끝나면 noGuest()로 이동 한다.

    public void sellFishBun(){

        Player.money= Player.money+demandNumberOfFish;
        Player.numberOfFishBun= Player.numberOfFishBun-demandNumberOfFish;
        valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));
        valueOfMoney.setText(Integer.toString(Player.money));
        setIcon(guest1WaitingImage);
        dialogTextGuestPlace1.setText("thank you");
        guestSellFishBunTimer();
    }

    public void sellFishBunForPlace2(){

        Player.money= Player.money+demandNumberOfFish;
        Player.numberOfFishBun= Player.numberOfFishBun-demandNumberOfFish;
        valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));
        valueOfMoney.setText(Integer.toString(Player.money));
        setIcon(guest1WaitingImage);
        dialogTextGuestPlace2.setText("thank you");
        guestSellFishBunTimerForPlace2();
    }

    public void guestBlankTimer(){

        guestBlankTimer = new Timer(1000, new ActionListener() {
            int count = 10;
            @Override
            public void actionPerformed(ActionEvent e) {


                count--;
                System.out.println("guestBlankTimer : "+count);
                if(count==0){
                    guestCheckBlank();
                }
            }
        });
        guestBlankTimer.start();
    }
    public void guestBlankTimerForPlace2(){

        guestBlankTimerForPlace2 = new Timer(1000, new ActionListener() {
            int count = 10;
            @Override
            public void actionPerformed(ActionEvent e) {


                count--;
                System.out.println("guestBlankTimer : "+count);
                if(count==0){
                    guestCheckBlankForPlace2();
                }
            }
        });
        guestBlankTimerForPlace2.start();
    }

    public void guestWaitingTimer(){
        guestWaitingTimer = new Timer(1000, new ActionListener() {
            int count = demandNumberOfFish;
            @Override
            public void actionPerformed(ActionEvent e) {

                count--;
                System.out.println("guestWaitingTimer : "+count);
                if(count==0){
                    guestWait=false;
                    System.out.println("isGuestWait() : "+isGuestWait());
                    System.out.println("guestPlace1.isGuestWait() : "+guestPlace1.isGuestWait());
                    guestGetMad();
                }
            }
        });
        guestWaitingTimer.start();
    }
    public void guestWaitingTimerForPlace2(){
        guestWaitingTimerForPlace2 = new Timer(1000, new ActionListener() {
            int count = demandNumberOfFish;
            @Override
            public void actionPerformed(ActionEvent e) {

                count--;
                System.out.println("guestWaitingTimer : "+count);
                if(count==0){
                    guestWait=false;
                    System.out.println("isGuestWait() : "+isGuestWait());
                    System.out.println("guestPlace2.isGuestWait() : "+guestPlace2.isGuestWait());
                    guestGetMadForPlace2();
                }
            }
        });
        guestWaitingTimerForPlace2.start();
    }

    public void guestGetMadTimer(){
        guestGetMadTimer = new Timer(1000, new ActionListener() {
            int count = demandNumberOfFish;
            @Override
            public void actionPerformed(ActionEvent e) {

                count--;
                System.out.println("guestGetMadTimer : "+count);
                if(count==0){
                    guestMad=false;
                    System.out.println("isGuestMad() : "+isGuestMad());
                    System.out.println("guestPlace1.isGuestMad() : "+guestPlace1.isGuestMad());
                    guestLastWord();
                }
            }
        });
        guestGetMadTimer.start();
    }
    public void guestGetMadTimerForPlace2(){
        guestGetMadTimerForPlace2 = new Timer(1000, new ActionListener() {
            int count = demandNumberOfFish;
            @Override
            public void actionPerformed(ActionEvent e) {

                count--;
                System.out.println("guestGetMadTimerForPlace2 : "+count);
                if(count==0){
                    guestMad=false;
                    System.out.println("isGuestMad() : "+isGuestMad());
                    System.out.println("guestPlaceForPlace2.isGuestMad() : "+guestPlace2.isGuestMad());
                    guestLastWordForPlace2();
                }
            }
        });
        guestGetMadTimerForPlace2.start();
    }

    public void guestLastWordTimer(){
        guestLastWordTimer = new Timer(1000, new ActionListener() {
            int count = 2;
            @Override
            public void actionPerformed(ActionEvent e) {

                count--;
                System.out.println("guestLastWordTimer : "+count);
                if(count==0){

                    guestExit();
                }
            }
        });
        guestLastWordTimer.start();
    }

    public void guestLastWordTimerForPlace2(){
        guestLastWordTimerForPlace2 = new Timer(1000, new ActionListener() {
            int count = 2;
            @Override
            public void actionPerformed(ActionEvent e) {

                count--;
                System.out.println("guestLastWordTimerForPlace2 : "+count);
                if(count==0){

                    guestExitForPlace2();
                }
            }
        });
        guestLastWordTimerForPlace2.start();
    }

    public void guestSellFishBunTimer(){
        guestSellFishBunTimer = new Timer(1000, new ActionListener() {
            int count = 2;
            @Override
            public void actionPerformed(ActionEvent e) {

                count--;
                System.out.println("guestSellFishBunTimer : "+count);
                if(count==0){
                    guestExit();
                }
            }
        });
        guestSellFishBunTimer.start();
    }

    public void guestSellFishBunTimerForPlace2(){
        guestSellFishBunTimerForPlace2 = new Timer(1000, new ActionListener() {
            int count = 2;
            @Override
            public void actionPerformed(ActionEvent e) {

                count--;
                System.out.println("guestSellFishBunTimerForPlace2 : "+count);
                if(count==0){
                    guestExitForPlace2();
                }
            }
        });
        guestSellFishBunTimerForPlace2.start();
    }
}
