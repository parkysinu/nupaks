package fishShapedBunTycoon3rd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CastOfFishBun extends JButton implements Runnable{

    boolean emptyCast;
    boolean addDoughCast;
    boolean addAdzukiCast;
    boolean cookingCast;
    boolean finishCast;
    boolean cookingFinished;

    //다른 클래스에서 생성된 변수의 값을 공유하기 위해서 사용
    static boolean cooking1stBun;
    static boolean cooking2ndBun;
    static boolean cooking3rdBun;

    static boolean cooking4thBun;
    static boolean cooking5thBun;
    static boolean cooking6thBun;

    static boolean cooking7thBun;
    static boolean cooking8thBun;
    static boolean cooking9thBun;

    static boolean startMaking1stBun;
    static boolean startMaking2ndBun;
    static boolean startMaking3rdBun;

    static boolean startMaking4thBun;
    static boolean startMaking5thBun;
    static boolean startMaking6thBun;

    static boolean startMaking7thBun;
    static boolean startMaking8thBun;
    static boolean startMaking9thBun;

    Timer cooking;

    Player player = new Player();
    //이미지 파일 경로 & 변수로 만들기

    ImageIcon castOfFishEmptyImage = new ImageIcon(Main.class.getResource("../image/castOfFish.png"));
    ImageIcon castOfFishAndDoughImage = new ImageIcon(Main.class.getResource("../image/castOfFishAndDough.png"));
    ImageIcon castOfFishAndAduzukiImage = new ImageIcon(Main.class.getResource("../image/castOfFishAndAdzuki.png"));
    ImageIcon castOfFishCooking = new ImageIcon(Main.class.getResource("../image/castOfFishCooking.png"));
    ImageIcon castOfFishFinishImage = new ImageIcon(Main.class.getResource("../image/castOfFishFinish.png"));

    JButton CastOfFishBun = new JButton();

    CastOfFishBun( ) {

        setEmptyCast(true);
        CastOfFishBun.setLayout(null);
        CastOfFishBun.setContentAreaFilled(false);
        CastOfFishBun.setFocusPainted(false);
        setIcon(castOfFishEmptyImage);
        setVisible(true);

    }
            //붕어빵 틀 마우스 리스너

            //boolean 값을 사용 하여 상태를 알려 주는 불린 값을 변경 해서 이미지를 바꿈.
            //(empty -> addDough -> addAdzuki -> cooking -> finish -> empty ) => 반복
            //현재 cooking 이미지가 바뀌지 않고 바로 finish 이미지로 바뀌는데 이유를 파악하지 못함 이거 고쳐야함.
            // ㄴ> 일단 원인을 찾지 못해서 cooking으로 바로 이어 지는게 아니라 cooking상태의 이미지를 클릭해서 이어지고 cooking상태의 이미지를 클릭하면 cooking을 시작함.


//            addMouseListener(new MouseAdapter() {
//                @Override
//                public void mousePressed(MouseEvent e) {
//
//
////                    Thread cooking = new Thread(test);
//
//                    if (emptyCast) {
//                        System.out.println("empty to dough");
//                        setIcon(castOfFishAndDoughImage);
//                        setEmptyCast(false);
//                        setAddDoughCast(true);
//                        System.out.println("dough finished");
//
//                    } else if (addDoughCast) {
//                        System.out.println("dough to adzuki");
//                        setIcon(castOfFishAndAduzukiImage);
//                        setAddDoughCast(false);
//                        setAddAdzukiCast(true);
//                        System.out.println("adzuki finished");
//
//                    } else if (addAdzukiCast) {
//                        System.out.println("adzuki to cooking");
//                        setIcon(castOfFishCooking);
//                        setAddAdzukiCast(false);
//                        setCookingCast(true);
//
//                    }
//                    else if (cookingCast) {
//                        System.out.println("cooking start");
//                        //쿠킹 쓰레드 시작 시간이 지나고 cookingCast  false로 바꾸고 cookingFinished를 true로 바꾼다.
//                        //값이 동일한 메모리 위치에 보관되지 않아서 문제 해결이 필요함.
//                        //방법 1 : static
//                        //방법 2 : 생각 안남
//
//
////                        cooking.start();
////                        System.out.println("cooking to Finish");
////                        setIcon(castOfFishFinishImage);
////                        setFinishCast(true);
//                        setCookingCast(false);
//                        setCookingFinished(true);
////                        setCookingCast(false);
//                        System.out.println("in cooking cast");
//                        System.out.println("cooking Cast : " + isCookingCast());
//                        System.out.println("finish cast : " + isFinishCast());
//                        System.out.println("cooking start");
//                    }
//                       // 쓰레드를 실행시키고 난 뒤에 메소드 안의 변수의 값이 true인지 false인지 check
////                        try{
////                            Thread.sleep(5000);
////                        }catch(Exception s){
////                            s.printStackTrace();
////                        }
////                        System.out.println("after sleep");
////                        System.out.println("cooking Cast : " + isCookingCast());
////                        System.out.println("cookingFinished :  "+ isCookingFinished());
////                        System.out.println("finish cast : " + isFinishCast());
////                    }
//                    else if (cookingFinished) {
//                        setIcon(castOfFishFinishImage);
//                        setCookingFinished(false);
//                        setFinishCast(true);
//                    }
//                    else if (finishCast) {
//                        setIcon(castOfFishEmptyImage);
//                        setFinishCast(false);
//                        setEmptyCast(true);
//
//                        player.setNumberOfFishBun(player.getNumberOfFishBun() + 1);
//                        System.out.println("numberOfFishBun : "+player.getNumberOfFishBun());
////                        if(startMaking1stBun){
////                            startMaking1stBun=false;
////                        }
////                        else if(startMaking2ndBun){
////                            startMaking2ndBun=false;
////                        }
////                        else if(startMaking3rdBun){
////                            startMaking3rdBun=false;
////                        }
////                        else if(startMaking4thBun){
////                            startMaking4thBun=false;
////                        }
////                        else if(startMaking5thBun){
////                            startMaking5thBun=false;
////                        }
////                        else if(startMaking6thBun){
////                            startMaking6thBun=false;
////                        }
////                        else if(startMaking7thBun){
////                            startMaking7thBun=false;
////                        }
////                        else if(startMaking8thBun){
////                            startMaking8thBun=false;
////                        }
////                        else if(startMaking9thBun){
////                            startMaking9thBun=false;
////                        }
//
//                    System.out.println("(1st)player.numberOfFishBun : "+player.numberOfFishBun);
//                    player.setNumberOfFishBun(player.numberOfFishBun+1);
//                    System.out.println("(1st)player.numberOfFishBun : "+player.numberOfFishBun);
//                    }
//
//            });
//
//
//            }
    public boolean isEmptyCast() {
        return emptyCast;
    }

    public void setEmptyCast(boolean emptyCast) {
        this.emptyCast = emptyCast;
    }

    public boolean isAddDoughCast() {
        return addDoughCast;
    }

    public void setAddDoughCast(boolean addDoughCast) {
        this.addDoughCast = addDoughCast;
    }

    public boolean isAddAdzukiCast() {
        return addAdzukiCast;
    }

    public void setAddAdzukiCast(boolean addAdzukiCast) {
        this.addAdzukiCast = addAdzukiCast;
    }

    public boolean isCookingCast() {
        return cookingCast;
    }

    public void setCookingCast(boolean cookingCast) {
        this.cookingCast = cookingCast;
    }

    public boolean isFinishCast() {
        return finishCast;
    }

    public void setFinishCast(boolean finishCast) {
        this.finishCast = finishCast;
    }
    public boolean isCookingFinished() {
        return cookingFinished;
    }

    public void setCookingFinished(boolean cookingFinished) {
        this.cookingFinished = cookingFinished;
    }
    public void run(){

        try{
            System.out.println("ThreadStart");
            Thread.sleep(3000);
            System.out.println("ThreadEnd");
            System.out.println("cooking Finished");
            if(isCookingCast()==true) {
                setCookingCast(false);
            }
            if(isCookingFinished()==false) {
                setCookingFinished(true);
            }
            System.out.println("cooking Cast : "+cookingCast);
            System.out.println("cooking finished : "+cookingFinished);
            System.out.println("finish cast : "+finishCast);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void cooking(){

        cooking = new javax.swing.Timer(1000, new ActionListener() {
            int count = 5;
            @Override
            public void actionPerformed(ActionEvent e) {

                count--;
                System.out.println("cooking count time : "+count);
                if(count==0){
                    setFinishCast(true);
                    setIcon(castOfFishFinishImage);
                }
            }
        });
        cooking.start();
    }
}
