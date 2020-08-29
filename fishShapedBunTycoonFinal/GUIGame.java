package fishShapedBunTycoonFinal;

import fishShapedBunTycoon.GUIMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIGame extends JFrame {


    ImageIcon lifeImage = new ImageIcon((Main.class.getResource("../image/life.png")));
    ImageIcon moneyImage = new ImageIcon((Main.class.getResource("../image/money.png")));
    ImageIcon numberOfFishImage = new ImageIcon((Main.class.getResource("../image/numberOfFish.png")));
    ImageIcon multiplyImage = new ImageIcon((Main.class.getResource("../image/x.png")));

    ImageIcon dialogImage =  new ImageIcon((GUIMain.class.getResource("../image/dialog.png")));
    ImageIcon blankDialogImage =  new ImageIcon((GUIMain.class.getResource("../image/blankDialog.png")));


    Player player = new Player();


    //손님 클래스 객체 선언

    static Guest guestPlace1 = new Guest();
    static Guest guestPlace2 = new Guest();
    static Guest guestPlace3 = new Guest();


    Thread guestVisit1 = new Thread(guestPlace1);
    Thread guestVisit2 = new Thread(guestPlace2);
    Thread guestVisit3 = new Thread(guestPlace3);


    //손님칸 위쪽에 나오는 대화 문구 출력
    static JLabel dialogTextGuestPlace1 = new JLabel();
    static JLabel dialogTextGuestPlace2 = new JLabel();
    static JLabel dialogTextGuestPlace3 = new JLabel();

    //말풍선 이미지 객체 선언
    static Dialog dialogImagePlace1 = new Dialog();
    static Dialog dialogImagePlace2 = new Dialog();
    static Dialog dialogImagePlace3 = new Dialog();

    //화면 우측 아래에 위치한 플레이어의 정보를 출력해주는 객체 선언
    static JLabel valueOfLife = new JLabel();
    static JLabel valueOfMoney = new JLabel();
    static JLabel valueOfNumberOfFish = new JLabel();

    JLabel lifeImageLabel = new JLabel(lifeImage);
    JLabel moneyImageLabel = new JLabel(moneyImage);
    JLabel numberOfFishImageLabel = new JLabel(numberOfFishImage);


    JLabel lifeMultiplyImage = new JLabel(multiplyImage);
    JLabel moneyMultiplyImage = new JLabel(multiplyImage);
    JLabel numberOfFishMultiplyImage = new JLabel(multiplyImage);

    static JLabel timeLeft =new JLabel();


    //붕어 빵틀 클래스 객체 선언
    CastOfFishBun castOfFishBun1st = new CastOfFishBun();
    CastOfFishBun castOfFishBun2nd  = new CastOfFishBun();
    CastOfFishBun castOfFishBun3rd  = new CastOfFishBun();

    CastOfFishBun castOfFishBun4th  = new CastOfFishBun();
    CastOfFishBun castOfFishBun5th  = new CastOfFishBun();
    CastOfFishBun castOfFishBun6th  = new CastOfFishBun();

    CastOfFishBun castOfFishBun7th  = new CastOfFishBun();
    CastOfFishBun castOfFishBun8th  = new CastOfFishBun();
    CastOfFishBun castOfFishBun9th  = new CastOfFishBun();

    //JFrame 객체 선언
    static JFrame gameGui = new JFrame();

    TimeCount timeCount = new TimeCount();
    Thread timeCountThread = new Thread(timeCount);


    public void addJFrame(){

        //게임 시작전 플레이어 Life,Money, NumberOfFishBun 값 지정
        player.beforeStart();
        guestVisit1.start();
        timeCountThread.start();
//        guestVisit2.start();
        //        guestThread();
//        guestVisit4.start();

        //게임 시작전 플레이어의 정보를 설정한 값이 맞는지 확인하기 위한 로그
        System.out.println("player.getLife() : "+player.getLife());
        System.out.println("player.getNumberOfFishBun() : "+player.getNumberOfFishBun());
        System.out.println("player.getMoney() : "+player.getMoney());

        gameGui.setSize(1024,810);

        //플레이어 정보 출력
        valueOfLife.setText(Integer.toString(Player.life));
        valueOfMoney.setText(Integer.toString(Player.money));
        valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));
        timeLeft.setText(Integer.toString(120));

        //timer기능을 사용해서 1초마다 컴포넌트를 지우고 다시 그린다.
        //구현 안됨. 실행 시키게 되면 프로그램 자체가 멈춤

//        Timer timer = new Timer(1000, e -> {
//            gameGui.getContentPane().removeAll();
//            valueOfLife.repaint();
//            valueOfLife.revalidate();
//            valueOfMoney.repaint();
//            valueOfMoney.revalidate();
//            valueOfNumberOfFish.repaint();
//            valueOfNumberOfFish.revalidate();
//        });
//        timer.start();


        //플레이어 객체가 구현되는 범위 지정

        lifeImageLabel.setBounds(680, 460, 100, 100);
        moneyImageLabel.setBounds(680,560,100,100);
        numberOfFishImageLabel.setBounds(680,660,100,100);

        lifeMultiplyImage.setBounds(780,460,100,100);
        numberOfFishMultiplyImage.setBounds(780,560,100,100);
        moneyMultiplyImage.setBounds(780,660,100,100);

        valueOfLife.setBounds(900,460,100,100);
        valueOfMoney.setBounds(900,560,100,100);
        valueOfNumberOfFish.setBounds(900,660,100,100);

        //손님 객체가 구현 되는 범위 지정

        guestPlace1.setBounds(56,100,300,300);
        guestPlace2.setBounds(656,100,300,300);
//        guestPlace2.setBounds(356,100,300,300);
//        guestPlace3.setBounds(656,100,300,300);


        //말풍선 이미지가 구현되는 범위 지정

        dialogImagePlace1.setBounds(56,50,300,100);
        dialogImagePlace2.setBounds(656,50,300,100);
//        dialogImagePlace2.setBounds(356,50,300,100);

//        dialogImagePlace3.setBounds(656,50,300,100);

        //말풍선 텍스트가 출력되는 범위 지정
        dialogTextGuestPlace1.setBounds(110,50,300,100);
        dialogTextGuestPlace2.setBounds(710,50,300,100);
//        dialogTextGuestPlace2.setBounds(410,50,300,100);
//        dialogTextGuestPlace3.setBounds(710,50,300,100);

        //붕어빵 틀 객체가 구현 되는 범위 지정

        castOfFishBun1st.setBounds(30,460,200,100);
        castOfFishBun2nd.setBounds(30,560,200,100);
        castOfFishBun3rd.setBounds(30,660,200,100);

        castOfFishBun4th.setBounds(230,460,200,100);
        castOfFishBun5th.setBounds(230,560,200,100);
        castOfFishBun6th.setBounds(230,660,200,100);

        castOfFishBun7th.setBounds(430,460,200,100);
        castOfFishBun8th.setBounds(430,560,200,100);
        castOfFishBun9th.setBounds(430,660,200,100);

        timeLeft.setBounds(950,30,60,30);


        //손님 없을때 기본 버튼 이미지 없애는 기능
        guestPlace1.setContentAreaFilled(false);
        guestPlace2.setContentAreaFilled(false);
        guestPlace3.setContentAreaFilled(false);

        //guestPlace버튼 테두리 없애기.
        guestPlace1.setBorderPainted(false);
        guestPlace2.setBorderPainted(false);
        guestPlace3.setBorderPainted(false);

        dialogTextGuestPlace1.setLayout(null);
        dialogTextGuestPlace2.setLayout(null);
        dialogTextGuestPlace3.setLayout(null);

        dialogImagePlace1.setLayout(null);
        dialogImagePlace1.setLayout(null);
        dialogImagePlace1.setLayout(null);

        timeLeft.setLayout(null);

        //출력되는 플레이어의 변수 값의 문자 크기 조절
        valueOfLife.setFont(new Font("Arial",Font.PLAIN,40));
        valueOfMoney.setFont(new Font("Arial",Font.PLAIN,40));
        valueOfNumberOfFish.setFont(new Font("Arial",Font.PLAIN,40));

        //손님의 대사가 출력되는 문자 크기 조절
        dialogTextGuestPlace1.setFont(new Font("Arial",Font.PLAIN,20));
        dialogTextGuestPlace2.setFont(new Font("Arial",Font.PLAIN,20));
        dialogTextGuestPlace3.setFont(new Font("Arial",Font.PLAIN,20));

        timeLeft.setFont(new Font("Arial",Font.PLAIN,20));



        //플레이어 상태를 알려주는 텍스트 실시간 출력
        //구현 안됨
//        guestPlace1.addActionListener(new Action() {
//            @Override
//            public Object getValue(String key) {
//                return null;
//            }
//
//            @Override
//            public void putValue(String key, Object value) {
//
//            }
//
//            @Override
//            public void setEnabled(boolean b) {
//
//            }
//
//            @Override
//            public boolean isEnabled() {
//                return false;
//            }
//
//            @Override
//            public void addPropertyChangeListener(PropertyChangeListener listener) {
//
//            }
//
//            @Override
//            public void removePropertyChangeListener(PropertyChangeListener listener) {
//
//            }
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(Guest.guest1WillExit){
//                    valueOfLife.setText(Integer.toString(Player.life));
//                }
//                if(Guest.guest2WillExit){
//                    valueOfLife.setText(Integer.toString(Player.life));
//                }
//                if(Guest.guest3WillExit){
//                    valueOfLife.setText(Integer.toString(Player.life));
//                }
//
//            }
//        });






        guestPlace1.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {

            System.out.println("do click");
            if(guestPlace1.noGuest){
                System.out.println("can't sell fish bun at noGuest");
            }
            else if(guestPlace1.guestVisit){
                System.out.println("can't sell fish bun at guestVisit");
            }
            else if(guestPlace1.guestOrder){
                System.out.println("can't sell fish bun at guestOrder");
            }
            else if(guestPlace1.guestWait){
                System.out.println("can sell fish bun waiting");

                if(Player.numberOfFishBun >= guestPlace1.demandNumberOfFish){
                    System.out.println("Player.numberOfFishBun >= guestPlace1.demandNumberOfFish");
                    guestPlace1.guestWaitingTimer.stop();
                    guestPlace1.setSellFish(true);
                    guestPlace1.sellFishBun();
                }
                else if(Player.numberOfFishBun < guestPlace1.demandNumberOfFish){
                    dialogTextGuestPlace1.setText("not enough number of fishBun");
                }

            }
            else if(guestPlace1.guestMad){
                System.out.println("can sell fish bun getMad");

                if(Player.numberOfFishBun >= guestPlace1.demandNumberOfFish){
                    System.out.println("Player.numberOfFishBun >= guestPlace1.demandNumberOfFish");
                    guestPlace1.guestGetMadTimer.stop();
                    guestPlace1.setSellFish(true);
                    guestPlace1.sellFishBun();

                }
                else if(Player.numberOfFishBun < guestPlace1.demandNumberOfFish){
                    dialogTextGuestPlace1.setText("not enough number of fishBun");
                }

            }
            else if(guestPlace1.guestLastWord){
                System.out.println("can't sell fish bun at lastWord");
            }
            else if(guestPlace1.guestExit){
                System.out.println("can't sell fish bun at geustExit");
            }
        }
        });

        guestPlace2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                System.out.println("do click For place2");
                if(guestPlace2.noGuest){
                    System.out.println("can't sell fish bun at noGuest");
                }
                else if(guestPlace2.guestVisit){
                    System.out.println("can't sell fish bun at guestVisit");
                }
                else if(guestPlace2.guestOrder){
                    System.out.println("can't sell fish bun at guestOrder");
                }
                else if(guestPlace2.guestWait){
                    System.out.println("can sell fish bun waiting");

                    if(Player.numberOfFishBun >= guestPlace2.demandNumberOfFish){
                        System.out.println("Player.numberOfFishBun >= guestPlace2.demandNumberOfFish");
                        guestPlace2.guestWaitingTimerForPlace2.stop();
                        guestPlace2.setSellFish(true);
                        guestPlace2.sellFishBunForPlace2();
                    }
                    else if(Player.numberOfFishBun < guestPlace1.demandNumberOfFish){
                        dialogTextGuestPlace2.setText("not enough number of fishBun");
                    }

                }
                else if(guestPlace2.guestMad){
                    System.out.println("can sell fish bun getMad");

                    if(Player.numberOfFishBun >= guestPlace2.demandNumberOfFish){
                        System.out.println("Player.numberOfFishBun >= guestPlace2.demandNumberOfFish");
                        guestPlace2.guestGetMadTimerForPlace2.stop();
                        guestPlace2.setSellFish(true);
                        guestPlace2.sellFishBunForPlace2();

                    }
                    else if(Player.numberOfFishBun < guestPlace2.demandNumberOfFish){
                        dialogTextGuestPlace2.setText("not enough number of fishBun");
                    }

                }
                else if(guestPlace2.guestLastWord){
                    System.out.println("can't sell fish bun at lastWord");
                }
                else if(guestPlace2.guestExit){
                    System.out.println("can't sell fish bun at geustExit");
                }
            }
        });





        // 손님이 붕어빵 받는 것을 기다리고 있을 때 클릭을 하면 돈을 얻고, 돈이 올라 가고, 손님은 퇴장 한다.
        //스레드를 제어 해야하는 상황 이유 클릭 하고 나면 마무리가 깔끔하지 않음.

//        guestPlace1.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//                        if(player.getNumberOfFishBun()>=guestPlace1.getDemandNumberOfFish()) {
//                        player.setNumberOfFishBun(player.getNumberOfFishBun()-guestPlace1.getDemandNumberOfFish());
//                        player.setMoney(player.getMoney() + guestPlace1.getDemandNumberOfFish());
//                        valueOfMoney.setText(Integer.toString(player.getMoney()));
//                        valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));
//                        guestPlace1.guest1PlaceBlank();
//                        guestPlace1.setIcon(guest.guestBlankImage);
//                        dialogTextGuestPlace1.setText(null);
//                        if(Player.life<=0){
//                            new GameEnd();
//                        }
//
//                        }
//                        else if(player.getNumberOfFishBun()<guestPlace1.getDemandNumberOfFish()){
//                            dialogTextGuestPlace1.setText("not enough fish bun");
//                            guestVisit1.start();
//                        }
//
////                else if(guestPlace1.guest2IsMad || guestPlace1.guest2IsWaiting) {
////                    if(player.getNumberOfFishBun()>=guestPlace2.getDemandNumberOfFish()) {
////                        player.setNumberOfFishBun(player.getNumberOfFishBun()-guestPlace2.getDemandNumberOfFish());
////                        player.setMoney(player.getMoney() +  guestPlace1.getDemandNumberOfFish());
////                        valueOfMoney.setText(Integer.toString(player.getMoney()));
////                        valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));
////                        guestPlace1.guest2GetFish=true;
////                        guestPlace1.guest2PlaceBlank();
////                        guestPlace1.setIcon(guest.guestBlankImage);
////                        dialogTextGuestPlace1.setText(null);
////                        guestVisit1.interrupt();
////                        if(Player.life<=0){
////                            new GameEnd();
////                        }
////                    }
////                }
////                else if(guestPlace1.guest3IsMad || guestPlace1.guest3IsWaiting) {
////                    if(player.getNumberOfFishBun()>=guestPlace1.getDemandNumberOfFish()) {
////                        player.setNumberOfFishBun(player.getNumberOfFishBun()-guestPlace3.getDemandNumberOfFish());
////                        player.setMoney(player.getMoney() +  guestPlace1.getDemandNumberOfFish());
////                        valueOfMoney.setText(Integer.toString(player.getMoney()));
////                        valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));
////                        guestPlace1.guest3GetFish=true;
////                        guestPlace1.guest3PlaceBlank();
////                        guestPlace1.setIcon(guestPlace1.guestBlankImage);
////                        dialogTextGuestPlace1.setText(null);
////                        guestVisit1.interrupt();
////                        if(Player.life<=0){
////                            new GameEnd();
////                        }
////                    }
////                }
//            }
//        });
//
//
//        guestPlace2.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//                if(guestPlace2.guest1IsMad || guestPlace2.guest1IsWaiting){
//                    if(player.getNumberOfFishBun()>=guestPlace2.getDemandNumberOfFish()) {
//                        player.setNumberOfFishBun(player.getNumberOfFishBun()-guestPlace2.getDemandNumberOfFish());
//                        player.setMoney(player.getMoney() +  guestPlace2.getDemandNumberOfFish());
//                        valueOfMoney.setText(Integer.toString(player.getMoney()));
//                        guestPlace2.guest1PlaceBlank();
//                        guestPlace2.setIcon(guestPlace2.guestBlankImage);
//                        dialogTextGuestPlace1.setText(null);
//                        if(Player.life<=0){
//                            new GameEnd();
//                        }
//                    }
//                }
//                else if(guestPlace2.guest2IsMad || guestPlace2.guest2IsWaiting) {
//                    if(player.getNumberOfFishBun()>=guestPlace2.getDemandNumberOfFish()) {
//                        player.setNumberOfFishBun(player.getNumberOfFishBun()-guestPlace2.getDemandNumberOfFish());
//                        player.setMoney(player.getMoney() +  guestPlace2.getDemandNumberOfFish());
//                        valueOfMoney.setText(Integer.toString(player.getMoney()));
//                        guestPlace2.guest2PlaceBlank();
//                        guestPlace2.setIcon(guestPlace2.guestBlankImage);
//                        if(Player.life<=0){
//                            new GameEnd();
//                        }
//                    }
//                }
//                else if(guestPlace2.guest3IsMad || guestPlace2.guest3IsWaiting) {
//                    if(player.getNumberOfFishBun()>=guestPlace2.getDemandNumberOfFish()) {
//                        player.setNumberOfFishBun(player.getNumberOfFishBun()-guestPlace2.getDemandNumberOfFish());
//                        player.setMoney(player.getMoney() +  guestPlace2.getDemandNumberOfFish());
//                        valueOfMoney.setText(Integer.toString(player.getMoney()));
//                        guestPlace2.guest3PlaceBlank();
//                        guestPlace2.setIcon(guestPlace2.guestBlankImage);
//                        if(Player.life<=0){
//                            new GameEnd();
//                        }
//                    }
//                }
//            }
//        });
//
//        guestPlace3.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//                if(guestPlace3.guest1IsMad || guestPlace3.guest1IsWaiting){
//                    if(player.getNumberOfFishBun()>=guestPlace3.getDemandNumberOfFish()) {
//                        player.setNumberOfFishBun(player.getNumberOfFishBun()-guestPlace3.getDemandNumberOfFish());
//                        player.setMoney(player.getMoney() +  guestPlace3.getDemandNumberOfFish());
//                        valueOfMoney.setText(Integer.toString(player.getMoney()));
//                        guestPlace3.guest1PlaceBlank();
//                        guestPlace3.setIcon(guestPlace3.guestBlankImage);
//                        if(Player.life<=0){
//                            new GameEnd();
//                        }
//                    }
//                }
//                else if(guestPlace3.guest2IsMad || guestPlace3.guest2IsWaiting) {
//                    if(player.getNumberOfFishBun()>=guestPlace3.getDemandNumberOfFish()) {
//                        player.setNumberOfFishBun(player.getNumberOfFishBun()-guestPlace3.getDemandNumberOfFish());
//                        player.setMoney(player.getMoney() +  guestPlace3.getDemandNumberOfFish());
//                        valueOfMoney.setText(Integer.toString(player.getMoney()));
//                        guestPlace3.guest2PlaceBlank();
//                        guestPlace3.setIcon(guestPlace3.guestBlankImage);
//                        if(Player.life<=0){
//                            new GameEnd();
//                        }
//                    }
//                }
//                else if(guestPlace3.guest3IsMad || guestPlace3.guest3IsWaiting) {
//                    if(player.getNumberOfFishBun()>=guestPlace3.getDemandNumberOfFish()) {
//                        player.setNumberOfFishBun(player.getNumberOfFishBun()-guestPlace3.getDemandNumberOfFish());
//                        player.setMoney(player.getMoney() +  guestPlace3.getDemandNumberOfFish());
//                        valueOfMoney.setText(Integer.toString(player.getMoney()));
//                        guestPlace3.guest3PlaceBlank();
//                        guestPlace3.setIcon(guestPlace3.guestBlankImage);
//                        if(Player.life<=0){
//                            new GameEnd();
//                        }
//                    }
//                }
//            }
//        });

//        Cooking cooking = new Cooking();
//        Thread cookingThread = new Thread(cooking);

        //붕어빵 틀 기능 구현.
        //붕어빵 틀의 재료를 다 넣고 cooking 할 단계가 되면 3초 기다리면 붕어 빵이 완성 되고 이미지가 완성된 붕어 빵으로 변경 된다.
        //ㄴ> 구현 실패
        //      ㄴ> 클릭하면 이미지가 바뀌게 구현.
        //붕어 빵이 완성 되면 setText를 이용 해서 가지고 있는 붕어 빵의 갯수가 갱신 된다.
        castOfFishBun1st.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {


                //일정시간이 지나면 붕어빵이 완성된 이미지로 바꿔주는 기능
//                if(CastOfFishBun.startMaking1stBun && castOfFishBun1st.cookingCast){
//                    cookingThread.start();
//                }
                //붕어빵을 만들기 시작하면 만들기 시작했다고 신호를 주는 조건문
//                if(castOfFishBun1st.addDoughCast){
//                    CastOfFishBun.startMaking1stBun=true;
//                }
                if (castOfFishBun1st.emptyCast) {
                    System.out.println("empty to dough");
                    castOfFishBun1st.setIcon(castOfFishBun1st.castOfFishAndDoughImage);
                    castOfFishBun1st.setEmptyCast(false);
                    castOfFishBun1st.setAddDoughCast(true);
                    System.out.println("dough finished");

                } else if (castOfFishBun1st.addDoughCast) {
                    System.out.println("dough to adzuki");
                    castOfFishBun1st.setIcon(castOfFishBun1st.castOfFishAndAduzukiImage);
                    castOfFishBun1st.setAddDoughCast(false);
                    castOfFishBun1st.setAddAdzukiCast(true);
                    System.out.println("adzuki finished");

                } else if (castOfFishBun1st.addAdzukiCast) {
                    System.out.println("adzuki to cooking");
                    castOfFishBun1st.setIcon(castOfFishBun1st.castOfFishCooking);
                    castOfFishBun1st.setAddAdzukiCast(false);
                    castOfFishBun1st.setCookingCast(true);

                }
                else if(castOfFishBun1st.cookingCast){
                    System.out.println("cooking");
                    castOfFishBun1st.setCookingCast(false);
                    castOfFishBun1st.cooking();

                }
                else if (castOfFishBun1st.finishCast) {
                    castOfFishBun1st.cooking.stop();
                    castOfFishBun1st.setIcon(castOfFishBun1st.castOfFishEmptyImage);
                    castOfFishBun1st.setFinishCast(false);
                    castOfFishBun1st.setEmptyCast(true);

                    player.setNumberOfFishBun(player.getNumberOfFishBun() + 1);
                    System.out.println("numberOfFishBun : "+player.getNumberOfFishBun());
                    valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));
                    //요리가 완료되면 붕어빵틀의 요리를 시작하는 변수를 false로 바꿈
                    //쓰레드를 사용할 때 다른 붕어빵틀과 겹치지 않기 위해서.
//                    if(castOfFishBun1st.startMaking1stBun){
//                        castOfFishBun1st.startMaking1stBun=false;
//                    }

                }

            }
        });

        castOfFishBun2nd.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                //일정시간이 지나면 붕어빵이 완성된 이미지로 바꿔주는 기능
//                if(CastOfFishBun.startMaking2ndBun && castOfFishBun2nd.cookingCast){
//                    cookingThread.start();
//                }
                //붕어빵을 만들기 시작하면 만들기 시작했다고 신호를 주는 조건문
//                if(castOfFishBun2nd.addDoughCast){
//                    CastOfFishBun.startMaking2ndBun=true;
//                }
                if (castOfFishBun2nd.emptyCast) {
                    System.out.println("empty to dough");
                    castOfFishBun2nd.setIcon(castOfFishBun2nd.castOfFishAndDoughImage);
                    castOfFishBun2nd.setEmptyCast(false);
                    castOfFishBun2nd.setAddDoughCast(true);
                    System.out.println("dough finished");

                } else if (castOfFishBun2nd.addDoughCast) {
                    System.out.println("dough to adzuki");
                    castOfFishBun2nd.setIcon(castOfFishBun2nd.castOfFishAndAduzukiImage);
                    castOfFishBun2nd.setAddDoughCast(false);
                    castOfFishBun2nd.setAddAdzukiCast(true);
                    System.out.println("adzuki finished");

                } else if (castOfFishBun2nd.addAdzukiCast) {
                    System.out.println("adzuki to cooking");
                    castOfFishBun2nd.setIcon(castOfFishBun2nd.castOfFishCooking);
                    castOfFishBun2nd.setAddAdzukiCast(false);
                    castOfFishBun2nd.setCookingCast(true);

                }
                else if(castOfFishBun2nd.cookingCast){
                    System.out.println("cooking");
                    castOfFishBun2nd.setCookingCast(false);
                    castOfFishBun2nd.cooking();

                }
                else if (castOfFishBun2nd.finishCast) {
                    castOfFishBun2nd.cooking.stop();
                    castOfFishBun2nd.setIcon(castOfFishBun2nd.castOfFishEmptyImage);
                    castOfFishBun2nd.setFinishCast(false);
                    castOfFishBun2nd.setEmptyCast(true);

                    player.setNumberOfFishBun(player.getNumberOfFishBun() + 1);
                    System.out.println("numberOfFishBun : "+player.getNumberOfFishBun());
                    valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));
//                    if(castOfFishBun2nd.startMaking2ndBun){
//                        castOfFishBun2nd.startMaking2ndBun=false;
//                    }

                }
            }
        });

        castOfFishBun3rd.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                //일정시간이 지나면 붕어빵이 완성된 이미지로 바꿔주는 기능
//                if(CastOfFishBun.startMaking3rdBun && castOfFishBun3rd.cookingCast){
//                    cookingThread.start();
//                }
                //붕어빵을 만들기 시작하면 만들기 시작했다고 신호를 주는 조건문
//                if(castOfFishBun3rd.addDoughCast){
//                    CastOfFishBun.startMaking3rdBun=true;
//                }
                if (castOfFishBun3rd.emptyCast) {
                    System.out.println("empty to dough");
                    castOfFishBun3rd.setIcon(castOfFishBun3rd.castOfFishAndDoughImage);
                    castOfFishBun3rd.setEmptyCast(false);
                    castOfFishBun3rd.setAddDoughCast(true);
                    System.out.println("dough finished");

                } else if (castOfFishBun3rd.addDoughCast) {
                    System.out.println("dough to adzuki");
                    castOfFishBun3rd.setIcon(castOfFishBun3rd.castOfFishAndAduzukiImage);
                    castOfFishBun3rd.setAddDoughCast(false);
                    castOfFishBun3rd.setAddAdzukiCast(true);
                    System.out.println("adzuki finished");

                } else if (castOfFishBun3rd.addAdzukiCast) {
                    System.out.println("adzuki to cooking");
                    castOfFishBun3rd.setIcon(castOfFishBun3rd.castOfFishCooking);
                    castOfFishBun3rd.setAddAdzukiCast(false);
                    castOfFishBun3rd.setCookingCast(true);

                }
                else if(castOfFishBun3rd.cookingCast){
                    System.out.println("cooking");
                    castOfFishBun3rd.setCookingCast(false);
                    castOfFishBun3rd.cooking();

                }
                else if (castOfFishBun3rd.finishCast) {
                    castOfFishBun3rd.cooking.stop();
                    castOfFishBun3rd.setIcon(castOfFishBun3rd.castOfFishEmptyImage);
                    castOfFishBun3rd.setFinishCast(false);
                    castOfFishBun3rd.setEmptyCast(true);

                    player.setNumberOfFishBun(player.getNumberOfFishBun() + 1);
                    System.out.println("numberOfFishBun : "+player.getNumberOfFishBun());
                    valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));
//                    if(castOfFishBun3rd.startMaking3rdBun){
//                        castOfFishBun3rd.startMaking3rdBun=false;
//                    }

                }
            }
        });

        castOfFishBun4th.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //일정시간이 지나면 붕어빵이 완성된 이미지로 바꿔주는 기능
//                if(CastOfFishBun.startMaking4thBun && castOfFishBun4th.cookingCast){
//                    cookingThread.start();
//                }
                //붕어빵을 만들기 시작하면 만들기 시작했다고 신호를 주는 조건문
//                if(castOfFishBun4th.addDoughCast){
//                    CastOfFishBun.startMaking4thBun=true;
//                }
                if (castOfFishBun4th.emptyCast) {
                    System.out.println("empty to dough");
                    castOfFishBun4th.setIcon(castOfFishBun4th.castOfFishAndDoughImage);
                    castOfFishBun4th.setEmptyCast(false);
                    castOfFishBun4th.setAddDoughCast(true);
                    System.out.println("dough finished");

                } else if (castOfFishBun4th.addDoughCast) {
                    System.out.println("dough to adzuki");
                    castOfFishBun4th.setIcon(castOfFishBun4th.castOfFishAndAduzukiImage);
                    castOfFishBun4th.setAddDoughCast(false);
                    castOfFishBun4th.setAddAdzukiCast(true);
                    System.out.println("adzuki finished");

                } else if (castOfFishBun4th.addAdzukiCast) {
                    System.out.println("adzuki to cooking");
                    castOfFishBun4th.setIcon(castOfFishBun4th.castOfFishCooking);
                    castOfFishBun4th.setAddAdzukiCast(false);
                    castOfFishBun4th.setCookingCast(true);

                }
                else if(castOfFishBun4th.cookingCast){
                    System.out.println("cooking");
                    castOfFishBun4th.setCookingCast(false);
                    castOfFishBun4th.cooking();

                }
                else if (castOfFishBun4th.finishCast) {
                    castOfFishBun4th.cooking.stop();
                    castOfFishBun4th.setIcon(castOfFishBun4th.castOfFishEmptyImage);
                    castOfFishBun4th.setFinishCast(false);
                    castOfFishBun4th.setEmptyCast(true);

                    player.setNumberOfFishBun(player.getNumberOfFishBun() + 1);
                    System.out.println("numberOfFishBun : "+player.getNumberOfFishBun());
                    valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));

//                    if(castOfFishBun4th.startMaking4thBun){
//                        castOfFishBun4th.startMaking4thBun=false;
//                    }

                }
            }
        });

        castOfFishBun5th.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //일정시간이 지나면 붕어빵이 완성된 이미지로 바꿔주는 기능
//                if(CastOfFishBun.startMaking5thBun && castOfFishBun5th.cookingCast){
//                    cookingThread.start();
//                }
                //붕어빵을 만들기 시작하면 만들기 시작했다고 신호를 주는 조건문
//                if(castOfFishBun5th.addDoughCast){
//                    CastOfFishBun.startMaking5thBun=true;
//                }
                if (castOfFishBun5th.emptyCast) {
                    System.out.println("empty to dough");
                    castOfFishBun5th.setIcon(castOfFishBun5th.castOfFishAndDoughImage);
                    castOfFishBun5th.setEmptyCast(false);
                    castOfFishBun5th.setAddDoughCast(true);
                    System.out.println("dough finished");

                } else if (castOfFishBun5th.addDoughCast) {
                    System.out.println("dough to adzuki");
                    castOfFishBun5th.setIcon(castOfFishBun5th.castOfFishAndAduzukiImage);
                    castOfFishBun5th.setAddDoughCast(false);
                    castOfFishBun5th.setAddAdzukiCast(true);
                    System.out.println("adzuki finished");

                } else if (castOfFishBun5th.addAdzukiCast) {
                    System.out.println("adzuki to cooking");
                    castOfFishBun5th.setIcon(castOfFishBun5th.castOfFishCooking);
                    castOfFishBun5th.setAddAdzukiCast(false);
                    castOfFishBun5th.setCookingCast(true);

                }
                else if(castOfFishBun5th.cookingCast){
                    System.out.println("cooking");
                    castOfFishBun5th.setCookingCast(false);
                    castOfFishBun5th.cooking();

                }
                else if (castOfFishBun5th.finishCast) {
                    castOfFishBun5th.cooking.stop();
                    castOfFishBun5th.setIcon(castOfFishBun5th.castOfFishEmptyImage);
                    castOfFishBun5th.setFinishCast(false);
                    castOfFishBun5th.setEmptyCast(true);

                    player.setNumberOfFishBun(player.getNumberOfFishBun() + 1);
                    System.out.println("numberOfFishBun : "+player.getNumberOfFishBun());
                    valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));

//                    if(castOfFishBun5th.startMaking5thBun){
//                        castOfFishBun5th.startMaking5thBun=false;
//                    }

                }
            }
        });


        castOfFishBun6th.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //일정시간이 지나면 붕어빵이 완성된 이미지로 바꿔주는 기능
//                if(CastOfFishBun.startMaking6thBun && castOfFishBun6th.cookingCast){
//                    cookingThread.start();
//                }
                //붕어빵을 만들기 시작하면 만들기 시작했다고 신호를 주는 조건문
//                if(castOfFishBun6th.addDoughCast){
//                    CastOfFishBun.startMaking6thBun=true;
//                }
                if (castOfFishBun6th.emptyCast) {
                    System.out.println("empty to dough");
                    castOfFishBun6th.setIcon(castOfFishBun6th.castOfFishAndDoughImage);
                    castOfFishBun6th.setEmptyCast(false);
                    castOfFishBun6th.setAddDoughCast(true);
                    System.out.println("dough finished");

                } else if (castOfFishBun6th.addDoughCast) {
                    System.out.println("dough to adzuki");
                    castOfFishBun6th.setIcon(castOfFishBun6th.castOfFishAndAduzukiImage);
                    castOfFishBun6th.setAddDoughCast(false);
                    castOfFishBun6th.setAddAdzukiCast(true);
                    System.out.println("adzuki finished");

                } else if (castOfFishBun6th.addAdzukiCast) {
                    System.out.println("adzuki to cooking");
                    castOfFishBun6th.setIcon(castOfFishBun6th.castOfFishCooking);
                    castOfFishBun6th.setAddAdzukiCast(false);
                    castOfFishBun6th.setCookingCast(true);

                }
                else if(castOfFishBun6th.cookingCast){
                    System.out.println("cooking");
                    castOfFishBun6th.setCookingCast(false);
                    castOfFishBun6th.cooking();
                }
                else if (castOfFishBun6th.finishCast) {
                    castOfFishBun6th.cooking.stop();
                    castOfFishBun6th.setIcon(castOfFishBun6th.castOfFishEmptyImage);
                    castOfFishBun6th.setFinishCast(false);
                    castOfFishBun6th.setEmptyCast(true);

                    player.setNumberOfFishBun(player.getNumberOfFishBun() + 1);
                    System.out.println("numberOfFishBun : "+player.getNumberOfFishBun());
                    valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));
//                    if(castOfFishBun6th.startMaking6thBun){
//                        castOfFishBun6th.startMaking6thBun=false;
//                    }

                }
            }
        });


        castOfFishBun7th.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //일정시간이 지나면 붕어빵이 완성된 이미지로 바꿔주는 기능
//                if(CastOfFishBun.startMaking7thBun && castOfFishBun7th.cookingCast){
//                    cookingThread.start();
//                }
                //붕어빵을 만들기 시작하면 만들기 시작했다고 신호를 주는 조건문
//                if(castOfFishBun7th.addDoughCast){
//                    CastOfFishBun.startMaking7thBun=true;
//                }
                if (castOfFishBun7th.emptyCast) {
                    System.out.println("empty to dough");
                    castOfFishBun7th.setIcon(castOfFishBun7th.castOfFishAndDoughImage);
                    castOfFishBun7th.setEmptyCast(false);
                    castOfFishBun7th.setAddDoughCast(true);
                    System.out.println("dough finished");

                } else if (castOfFishBun7th.addDoughCast) {
                    System.out.println("dough to adzuki");
                    castOfFishBun7th.setIcon(castOfFishBun7th.castOfFishAndAduzukiImage);
                    castOfFishBun7th.setAddDoughCast(false);
                    castOfFishBun7th.setAddAdzukiCast(true);
                    System.out.println("adzuki finished");

                } else if (castOfFishBun7th.addAdzukiCast) {
                    System.out.println("adzuki to cooking");
                    castOfFishBun7th.setIcon(castOfFishBun7th.castOfFishCooking);
                    castOfFishBun7th.setAddAdzukiCast(false);
                    castOfFishBun7th.setCookingCast(true);

                }
                else if(castOfFishBun7th.cookingCast){
                    System.out.println("cooking");
                    castOfFishBun7th.setCookingCast(false);
                    castOfFishBun7th.cooking();

                }
                else if (castOfFishBun7th.finishCast) {
                    castOfFishBun7th.cooking.stop();
                    castOfFishBun7th.setIcon(castOfFishBun7th.castOfFishEmptyImage);
                    castOfFishBun7th.setFinishCast(false);
                    castOfFishBun7th.setEmptyCast(true);

                    player.setNumberOfFishBun(player.getNumberOfFishBun() + 1);
                    System.out.println("numberOfFishBun : "+player.getNumberOfFishBun());
                    valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));

//                    if(castOfFishBun7th.startMaking7thBun){
//                        castOfFishBun7th.startMaking7thBun=false;
//                    }

                }
            }
        });


        castOfFishBun8th.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //일정시간이 지나면 붕어빵이 완성된 이미지로 바꿔주는 기능
//                if(CastOfFishBun.startMaking8thBun && castOfFishBun8th.cookingCast){
//                    cookingThread.start();
//                }
                //붕어빵을 만들기 시작하면 만들기 시작했다고 신호를 주는 조건문
//                if(castOfFishBun8th.addDoughCast){
//                    CastOfFishBun.startMaking8thBun=true;
//                }
                if (castOfFishBun8th.emptyCast) {
                    System.out.println("empty to dough");
                    castOfFishBun8th.setIcon(castOfFishBun8th.castOfFishAndDoughImage);
                    castOfFishBun8th.setEmptyCast(false);
                    castOfFishBun8th.setAddDoughCast(true);
                    System.out.println("dough finished");

                } else if (castOfFishBun8th.addDoughCast) {
                    System.out.println("dough to adzuki");
                    castOfFishBun8th.setIcon(castOfFishBun8th.castOfFishAndAduzukiImage);
                    castOfFishBun8th.setAddDoughCast(false);
                    castOfFishBun8th.setAddAdzukiCast(true);
                    System.out.println("adzuki finished");

                } else if (castOfFishBun8th.addAdzukiCast) {
                    System.out.println("adzuki to cooking");
                    castOfFishBun8th.setIcon(castOfFishBun8th.castOfFishCooking);
                    castOfFishBun8th.setAddAdzukiCast(false);
                    castOfFishBun8th.setCookingCast(true);

                }
                else if(castOfFishBun8th.cookingCast){
                    System.out.println("cooking");
                    castOfFishBun8th.setCookingCast(false);
                    castOfFishBun8th.cooking();

                }
                else if (castOfFishBun8th.finishCast) {
                    castOfFishBun8th.cooking.stop();
                    castOfFishBun8th.setIcon(castOfFishBun8th.castOfFishEmptyImage);
                    castOfFishBun8th.setFinishCast(false);
                    castOfFishBun8th.setEmptyCast(true);

                    player.setNumberOfFishBun(player.getNumberOfFishBun() + 1);
                    System.out.println("numberOfFishBun : "+player.getNumberOfFishBun());
                    valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));

//                    if(castOfFishBun8th.startMaking8thBun){
//                        castOfFishBun8th.startMaking8thBun=false;
//                    }

                }
            }
        });


        castOfFishBun9th.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //일정시간이 지나면 붕어빵이 완성된 이미지로 바꿔주는 기능
//                if(CastOfFishBun.startMaking9thBun && castOfFishBun9th.cookingCast){
//                    cookingThread.start();
//                }
                //붕어빵을 만들기 시작하면 만들기 시작했다고 신호를 주는 조건문
//                if(castOfFishBun9th.addDoughCast){
//                    CastOfFishBun.startMaking9thBun=true;
//                }
                if (castOfFishBun9th.emptyCast) {
                    System.out.println("empty to dough");
                    castOfFishBun9th.setIcon(castOfFishBun9th.castOfFishAndDoughImage);
                    castOfFishBun9th.setEmptyCast(false);
                    castOfFishBun9th.setAddDoughCast(true);
                    System.out.println("dough finished");

                } else if (castOfFishBun9th.addDoughCast) {
                    System.out.println("dough to adzuki");
                    castOfFishBun9th.setIcon(castOfFishBun9th.castOfFishAndAduzukiImage);
                    castOfFishBun9th.setAddDoughCast(false);
                    castOfFishBun9th.setAddAdzukiCast(true);
                    System.out.println("adzuki finished");

                } else if (castOfFishBun9th.addAdzukiCast) {
                    System.out.println("adzuki to cooking");
                    castOfFishBun9th.setIcon(castOfFishBun9th.castOfFishCooking);
                    castOfFishBun9th.setAddAdzukiCast(false);
                    castOfFishBun9th.setCookingCast(true);

                }
                else if(castOfFishBun9th.cookingCast){
                    System.out.println("cooking");
                    castOfFishBun9th.setCookingCast(false);
                    castOfFishBun9th.cooking();

                }
                else if (castOfFishBun9th.finishCast) {
                    castOfFishBun9th.cooking.stop();
                    castOfFishBun9th.setIcon(castOfFishBun9th.castOfFishEmptyImage);
                    castOfFishBun9th.setFinishCast(false);
                    castOfFishBun9th.setEmptyCast(true);

                    player.setNumberOfFishBun(player.getNumberOfFishBun() + 1);
                    System.out.println("numberOfFishBun : "+player.getNumberOfFishBun());
                    valueOfNumberOfFish.setText(Integer.toString(Player.numberOfFishBun));
//
//                    if(castOfFishBun9th.startMaking9thBun){
//                        castOfFishBun9th.startMaking9thBun=false;
//                    }

                }
            }
        });







        //JFrame에 기능 추가
        //add 플레이어 정보
        gameGui.add(lifeImageLabel);
        gameGui.add(moneyImageLabel);
        gameGui.add(numberOfFishImageLabel);

        gameGui.add(lifeMultiplyImage);
        gameGui.add(moneyMultiplyImage);
        gameGui.add(numberOfFishMultiplyImage);

        gameGui.add(valueOfLife);
        gameGui.add(valueOfMoney);
        gameGui.add(valueOfNumberOfFish);

        //add 손님
        gameGui.add(guestPlace1);
        gameGui.add(guestPlace2);
//        gameGui.add(guestPlace3);

        //손님의 대화 출력
        gameGui.add(dialogTextGuestPlace1);
        gameGui.add(dialogTextGuestPlace2);
//        gameGui.add(dialogTextGuestPlace3);

        //add 말풍선
        gameGui.add(dialogImagePlace1);
        gameGui.add(dialogImagePlace2);
//        gameGui.add(dialogImagePlace3);

        //add 붕어빵
        gameGui.add(castOfFishBun1st);
        gameGui.add(castOfFishBun2nd);
        gameGui.add(castOfFishBun3rd);

        gameGui.add(castOfFishBun4th);
        gameGui.add(castOfFishBun5th);
        gameGui.add(castOfFishBun6th);

        gameGui.add(castOfFishBun7th);
        gameGui.add(castOfFishBun8th);
        gameGui.add(castOfFishBun9th);

        gameGui.add(timeLeft);

        //글자 출력 잘 되는지 테스트
//        dialogTextGuestPlace1.setText("hi nice to meet you");
//        dialogTextGuestPlace2.setText("hi nice to meet you");
//        dialogTextGuestPlace3.setText("hi nice to meet you");




        //JFrame 설정
        gameGui.setLayout(null);
        gameGui.setResizable(false); //화면 크기 변경 가능 여부
        gameGui.setLocationRelativeTo(null); //JFrame의 위치 지정
        gameGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 메소드가 종료 되면 자바 머신도 종료 시킨다.
        gameGui.setVisible(true);

    }



    public void guestThread(){
        //손님이 알아서 들어 오는 기능
        guestVisit1.start();
        guestVisit2.start();
        guestVisit3.start();
    }



    public static void renewalLife(){
        valueOfLife.setText(Integer.toString(Player.life));
    }


}
