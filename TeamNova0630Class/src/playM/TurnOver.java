package playM;

import java.util.NoSuchElementException;

public class TurnOver implements Runnable{


    static boolean p1_player_index_turnOver;
    static boolean p1_buyMapReturned_turnOver;
    static boolean p1_buyMap_turnOver;
    static boolean p1_dontTakeMyMoney_turnOver;
    static boolean p1_willTakeYourMap_turnOver;
    static boolean p1_festivalInChina_turnOver;
    static boolean p1_ContractCanada_turnOver;
    static boolean p1_helpPlayer_turnOver;
    static boolean p1_festivalInItaly_turnOver;
    static boolean p1_festivalInMexico_turnOver;
    static boolean p1_festivalRussia_turnOver;
    static boolean p1_festivalInSwiss_turnOver;
    static boolean p1_tradeWar_turnOver;
    static boolean p1_turnOver;


    static boolean p2_player_index_turnOver;
    static boolean p2_buyMapReturned_turnOver;
    static boolean p2_buyMap_turnOver;
    static boolean p2_dontTakeMyMoney_turnOver;
    static boolean p2_willTakeYourMap_turnOver;
    static boolean p2_festivalInChina_turnOver;
    static boolean p2_ContractCanada_turnOver;
    static boolean p2_helpPlayer_turnOver;
    static boolean p2_festivalInItaly_turnOver;
    static boolean p2_festivalInMexico_turnOver;
    static boolean p2_festivalRussia_turnOver;
    static boolean p2_festivalInSwiss_turnOver;
    static boolean p2_tradeWar_turnOver;
    static boolean p2_turnOver;


    public void run() {


        for (int i = 0; i < 6; i++) {




            if (i == 4) {
                System.out.println("10초 후 턴이 종료 됩니다.");
            }
            if (i == 5) {

                if(PlayboardLog.p1_turn){

                    p1_turnOver();

                }
                else if(PlayboardLog.p2_turn){

                    p2_turnOver();

                }

            }


            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }



        }


    }//run

    public void p1_turnOver(){

        Player player =new Player();
        player.scan.close();



        p1_player_index_turnOver=true;
        p1_buyMapReturned_turnOver=true;
        p1_buyMap_turnOver=true;
        p1_dontTakeMyMoney_turnOver=true;
        p1_willTakeYourMap_turnOver=true;
        p1_festivalInChina_turnOver=true;
        p1_ContractCanada_turnOver=true;
        p1_helpPlayer_turnOver=true;
        p1_festivalInItaly_turnOver=true;
        p1_festivalInMexico_turnOver=true;
        p1_festivalRussia_turnOver=true;
        p1_festivalInSwiss_turnOver=true;
        p1_tradeWar_turnOver=true;
        p1_turnOver=true;


    }

    public void p2_turnOver(){

        Player player =new Player();
        player.scan.close();

        p2_player_index_turnOver=true;
        p2_buyMapReturned_turnOver=true;
        p2_buyMap_turnOver=true;
        p2_dontTakeMyMoney_turnOver=true;
        p2_willTakeYourMap_turnOver=true;
        p2_festivalInChina_turnOver=true;
        p2_ContractCanada_turnOver=true;
        p2_helpPlayer_turnOver=true;
        p2_festivalInItaly_turnOver=true;
        p2_festivalInMexico_turnOver=true;
        p2_festivalRussia_turnOver=true;
        p2_festivalInSwiss_turnOver=true;
        p2_tradeWar_turnOver=true;
        p2_turnOver=true;

    }

}
