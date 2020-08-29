package playM;

import java.util.Scanner;

public class SuperDiceTime implements Runnable{
    static String enter;
    static boolean stop;
    static int result = 0;
    static boolean SuperDiceResultOn;
    static int player1Gage;
    static int player2Gage;


    public void run(){



        long time;
        Scanner scan = new Scanner(System.in);

        if(player1Gage>=10) {
            long beforeTime = System.currentTimeMillis();


            enter = scan.nextLine();

            long afterTime = System.currentTimeMillis();

            stop = true;


            time = afterTime - beforeTime;

            if (time < 1100) {
                result = 2;
            } else if (time > 1100 && time < 2100) {
                result = 3;
            } else if (time > 2100 && time < 3100) {
                result = 4;
            } else if (time > 3100 && time < 4100) {
                result = 5;
            } else if (time > 4100 && time < 5100) {
                result = 6;
            } else if (time > 5100 && time < 6100) {
                result = 7;
            } else if (time > 6100 && time < 7100) {
                result = 8;
            } else if (time > 7100 && time < 8100) {
                result = 9;
            } else if (time > 8100 && time < 9100) {
                result = 10;
            } else if (time > 9100 && time < 10100) {
                result = 11;
            } else if (time > 10100 && time < 11100) {
                result = 12;
            } else if (time > 11100 && time < 12100) {
                result = 11;
            } else if (time > 12100 && time < 13100) {
                result = 10;
            } else if (time > 13100 && time < 14100) {
                result = 9;
            } else if (time > 14100 && time < 15100) {
                result = 8;
            } else if (time > 15100 && time < 16100) {
                result = 7;
            } else if (time > 16100 && time < 17100) {
                result = 6;
            } else if (time > 17100 && time < 18100) {
                result = 5;
            } else if (time > 18100 && time < 19100) {
                result = 4;
            } else if (time > 19100 && time < 20100) {
                result = 3;
            } else if (time > 20100 && time < 21100) {
                result = 2;
            }


            System.out.println("슈퍼 주사위를 굴려 " + result + "가 나왔습니다.");
            SuperDiceResultOn = true;
            player1Gage=player1Gage-10;
        }
        else if(player2Gage>=10){

                long beforeTime = System.currentTimeMillis();


                enter = scan.nextLine();

                long afterTime = System.currentTimeMillis();

                stop = true;


                time = afterTime - beforeTime;

                if (time < 1100) {
                    result = 2;
                } else if (time > 1100 && time < 2100) {
                    result = 3;
                } else if (time > 2100 && time < 3100) {
                    result = 4;
                } else if (time > 3100 && time < 4100) {
                    result = 5;
                } else if (time > 4100 && time < 5100) {
                    result = 6;
                } else if (time > 5100 && time < 6100) {
                    result = 7;
                } else if (time > 6100 && time < 7100) {
                    result = 8;
                } else if (time > 7100 && time < 8100) {
                    result = 9;
                } else if (time > 8100 && time < 9100) {
                    result = 10;
                } else if (time > 9100 && time < 10100) {
                    result = 11;
                } else if (time > 10100 && time < 11100) {
                    result = 12;
                } else if (time > 11100 && time < 12100) {
                    result = 11;
                } else if (time > 12100 && time < 13100) {
                    result = 10;
                } else if (time > 13100 && time < 14100) {
                    result = 9;
                } else if (time > 14100 && time < 15100) {
                    result = 8;
                } else if (time > 15100 && time < 16100) {
                    result = 7;
                } else if (time > 16100 && time < 17100) {
                    result = 6;
                } else if (time > 17100 && time < 18100) {
                    result = 5;
                } else if (time > 18100 && time < 19100) {
                    result = 4;
                } else if (time > 19100 && time < 20100) {
                    result = 3;
                } else if (time > 20100 && time < 21100) {
                    result = 2;
                }


                System.out.println("슈퍼 주사위를 굴려 " + result + "가 나왔습니다.");
                SuperDiceResultOn = true;
                player2Gage=player2Gage-10;

            }
        }


}
