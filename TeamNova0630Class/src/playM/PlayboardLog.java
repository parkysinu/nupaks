package playM;

import java.rmi.MarshalException;

public class PlayboardLog {//�÷��� ������ 5�� ���⿡ ���� ���࿡ �ʿ��� �ȳ� ���� ��µǴ� �޼ҽ����� ��� ����

    static boolean p1_turn;
    static boolean p1_rollingDice;
    static boolean p1_rollingDice1;
    static boolean p1_ownTheLand;
    static boolean p1_placing_taxx2;
    static boolean p1_france_protesting;
    static boolean p1_selected_building;
    static boolean p1_selected_landmark;
    static boolean p1_returnedTHeMap;

    static boolean p1_england_event;
    static boolean p1_england_event_1;
    static boolean p1_england_event_2;
    static boolean p1_england_event_3;
    static boolean p1_england_event_4;
    static boolean p1_england_event_5;
    static boolean p1_england_event_6;
    static boolean p1_england_event_7;
    static boolean p1_england_event_8;

    static boolean p1_placing_balloon;
    static boolean p1_placing_balloonSelected;
    static boolean p1_moving;

    static boolean p2_turn;
    static boolean p2_rollingDice;
    static boolean p2_rollingDice1;
    static boolean p2_ownTheLand;
    static boolean p2_placing_taxx2;
    static boolean p2_france_protesting;
    static boolean p2_selected_building;
    static boolean p2_selected_landmark;
    static boolean p2_returnedTHeMap;

    static boolean p2_england_event;
    static boolean p2_england_event_1;
    static boolean p2_england_event_2;
    static boolean p2_england_event_3;
    static boolean p2_england_event_4;
    static boolean p2_england_event_5;
    static boolean p2_england_event_6;
    static boolean p2_england_event_7;
    static boolean p2_england_event_8;


    static boolean p2_placing_balloon;
    static boolean p2_placing_balloonSelected;
    static boolean p2_moving;

    TimeThread TT = new TimeThread();

    public void roof3rd(){ // xxp���� ���� �Դϴ�! �� ��µǴ� �޼ҵ�



        if(p1_turn){
        System.out.print("1P���� ���� �Դϴ�!");
        }
        else if(p2_turn){
        System.out.print("2P���� ���� �Դϴ�!");
        }
        else {
            System.out.print("");
        }

    }

    public void title3rd(){  //���� ���ϴ� �ֻ��� ���ڰ� �����⸦ �⵵ �ϸ� ���ڸ� ���� �޶�� ���� ������ ���ε�,���ⱸ,�ѱ��� ���� �̺�Ʈ�� ���� �ؾ� �ϸ� �ٸ� ���� ��� �ȴ�.
        if(p1_rollingDice){
            if(Player.p1_locked==1){

            }
            else if(Player.p1_balloonLock==1){


            }
            else if(Player.p1_index == 1 && Korea.p1_koreanLock==1 && TimeThread.Season.equals(TT.Winter)){

            }
            else if(Player.p1_locked==0 && Player.p1_balloonLock==0 && Korea.p1_koreanLock==0){

                System.out.print("���ϴ� ���ڸ� �⵵ �ϸ� �ƹ� ���ڳ� ���� �ּ���!");

            }
            else if(p1_moving){
                System.out.print("���ϴ� ���ڸ� �⵵ �ϸ� �ƹ� ���ڳ� ���� �ּ���!");
            }

        }
        else if(p2_rollingDice){
            if(Player.p2_locked==1){

            }
            else if(Player.p2_balloonLock==1){


            }
            else if(Player.p2_index == 1 && Korea.p2_koreanLock==1 && TimeThread.Season.equals(TT.Winter)){

            }
            else if(Player.p2_locked==0 && Player.p2_balloonLock==0 && Korea.p2_koreanLock==0){

                System.out.print("���ϴ� ���ڸ� �⵵ �ϸ� �ƹ� ���ڳ� ���� �ּ���!");

            }
            else if(p2_moving){
                System.out.print("���ϴ� ���ڸ� �⵵ �ϸ� �ƹ� ���ڳ� ���� �ּ���!");
            }

        }

        if(Player.superDiceStart){
            System.out.print("���� �ֻ����� Ȱ��ȭ �Ǿ����ϴ�. ���� ȭ�� �Ʒ��� ���ּ���!");
        }



    }
    public void structure3rd(){
        Player player = new Player();
       if(p1_rollingDice1){
           System.out.print("1�� �ֻ����� ���� " + Player.dice1 + "(��)�� ���Խ��ϴ�.");

       }
       else if(p2_rollingDice1){
           System.out.print("1�� �ֻ����� ���� " + Player.dice1 + "(��)�� ���Խ��ϴ�.");
       }
        if(Player.superDiceResult){
            System.out.print("���� �ֻ����� ������ "+SuperDiceTime.result+"(��)�� ���Խ��ϴ�.");
        }
      }
    public void cost3rd(){
        Player player = new Player();
        if(p1_rollingDice1){
            System.out.print("2�� �ֻ����� ���� " + Player.dice2 + "(��)�� ���Խ��ϴ�.");

        }
        else if(p2_rollingDice1){
            System.out.print("2�� �ֻ����� ���� " + Player.dice2 + "(��)�� ���Խ��ϴ�.");
        }

    }
    public void playerIndex3rd(){
        Player player = new Player();
        if(p1_rollingDice1){
            System.out.print("�� " + (Player.dice1 + Player.dice2) + "ĭ �̵��մϴ�.");

        }
        else if(p2_rollingDice1){
            System.out.print("�� " + (Player.dice1 + Player.dice2) + "ĭ �̵��մϴ�.");
        }
        if(Player.superDiceResult){
            System.out.print(SuperDiceTime.result+"ĭ �̵� �մϴ�.");
        }


    }

    public void floor3rd_p1(){
        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();
        if (Korea.p1_startOwnTheLand && p1_turn) {

            System.out.print(korea.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Japan.p1_startOwnTheLand && p1_turn){

            System.out.print(japan.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(China.p1_startOwnTheLand && p1_turn){

            System.out.print(china.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(England.p1_startOwnTheLand && p1_turn){

            System.out.print(england.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(France.p1_startOwnTheLand && p1_turn){

            System.out.print(france.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Germany.p1_startOwnTheLand && p1_turn){

            System.out.print(germany.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Russia.p1_startOwnTheLand && p1_turn){

            System.out.print(russia.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(USA.p1_startOwnTheLand && p1_turn){

            System.out.print(usa.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Canada.p1_startOwnTheLand && p1_turn){

            System.out.print(canada.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Mexico.p1_startOwnTheLand && p1_turn){

            System.out.print(mexico.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Italy.p1_startOwnTheLand && p1_turn){

            System.out.print(italy.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Swiss.p1_startOwnTheLand && p1_turn){

            System.out.print(swiss.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Vietnam.p1_startOwnTheLand && p1_turn){

            System.out.print(vietnam.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Egypt.p1_startOwnTheLand && p1_turn){

            System.out.print(egypt.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }


        else if(p1_turn && p1_placing_taxx2){
            System.out.print("������ ����� ���� 2�谡 �ö󰬽��ϴ�! ���� �ϼ���!");

        }
        else if(p1_turn && p1_france_protesting){
            System.out.print("���� ���������� ��ȸ ���� �� �̶� ���� ������ ó���� �� �����ϴ�.");
        }

        if(p1_turn && p1_returnedTHeMap){
            System.out.print("�١١� p1 is returned!�١١�");
        }

        if(p1_turn && Korea.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }
        else if(p1_turn && Japan.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }
        else if(p1_turn && China.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p1_turn && England.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p1_turn && France.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p1_turn && Germany.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p1_turn && Russia.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p1_turn && USA.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p1_turn && Canada.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p1_turn && Mexico.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p1_turn && Italy.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p1_turn && Swiss.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p1_turn && Vietnam.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p1_turn && Egypt.p1_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        if(p1_turn && p1_placing_balloon){

            System.out.print("���ⱸ�� Ÿ�� ���迩���� ���� �����ֽ��ϴ�!");
        }

        if(p1_turn && Start.p1_placingStart){
            System.out.print("����� Ȯ���ϰ� �ش��ϴ� ���׷��̵带 �ϰ���� ������ �������ּ���.");
        }

        if(p1_turn && Island.p1_lockedIsland){
            System.out.print("���ε��� �������ϴ�. :( � ������� Ż���� �õ� �� �����?");
        }

    }
    public void floor3rd_p2(){
        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();
        if (Korea.p2_startOwnTheLand && p2_turn) {

            System.out.print(korea.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Japan.p2_startOwnTheLand && p2_turn){

            System.out.print(japan.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(China.p2_startOwnTheLand  && p2_turn){

            System.out.print(china.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(England.p2_startOwnTheLand  && p2_turn){

            System.out.print(england.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(France.p2_startOwnTheLand  && p2_turn){

            System.out.print(france.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Germany.p2_startOwnTheLand  && p2_turn){

            System.out.print(germany.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Russia.p2_startOwnTheLand && p2_turn){

            System.out.print(russia.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(USA.p2_startOwnTheLand && p2_turn){

            System.out.print(usa.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Canada.p2_startOwnTheLand  && p2_turn){

            System.out.print(canada.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Mexico.p2_startOwnTheLand && p2_turn){

            System.out.print(mexico.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Italy.p2_startOwnTheLand && p2_turn){

            System.out.print(italy.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Swiss.p2_startOwnTheLand  && p2_turn){

            System.out.print(swiss.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Vietnam.p2_startOwnTheLand && p2_turn){

            System.out.print(vietnam.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(Egypt.p2_startOwnTheLand  && p2_turn){

            System.out.print(egypt.travel + "�� ����� ���� ������ ���� �������� �ʽ��ϴ�.");

        }
        else if(p2_turn && p2_placing_taxx2){
            System.out.print("������ ���� �Ẹ�� 2�谡 �ö� �����ϴ�! ���� �ϼ���!");

        }
        else if(p2_turn && p2_france_protesting){
            System.out.print("���� ���������� ��ȸ ���� �� �̶� ���� ������ ó���� �� �����ϴ�.");
        }
        if(p2_turn && p2_returnedTHeMap){
            System.out.print("�ڡڡ� p2 is returned!�ڡڡ�");
        }

        if(p2_turn && Korea.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }
        else if(p2_turn && Japan.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }
        else if(p2_turn && China.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p2_turn && England.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p2_turn && France.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p2_turn && Germany.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p2_turn && Russia.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p2_turn && USA.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p2_turn && Canada.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p2_turn && Mexico.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p2_turn && Italy.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p2_turn && Swiss.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p2_turn && Vietnam.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }

        else if(p2_turn && Egypt.p2_movedOtherPlayerMap){
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }
        if(p2_turn && p2_placing_balloon){

            System.out.print("���ⱸ�� Ÿ�� ���迩���� ���� �� �� �ֽ��ϴ�!");
        }
        if(p2_turn && Start.p2_placingStart){
            System.out.print("����� Ȯ���ϰ� �ش��ϴ� ���׷��̵带 �ϰ� ���� ������ ���� ���ּ���.");
        }
        if(p2_turn && Island.p2_lockedIsland){
            System.out.print("���ε��� �������ϴ�. :( � ������� Ż���� �õ� �� �����?");
        }

    }


    public void roof2nd_p1(){

        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();
        if (p1_ownTheLand && p1_turn) {

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p1_turn && p1_placing_taxx2){

            System.out.print("�Ű��� �𸥴ٱ���? :)");
        }
        if(p1_turn && Korea.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ korea.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && Japan.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ japan.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && China.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ china.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && England.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ england.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && France.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ france.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && Germany.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ germany.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && Russia.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ russia.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && USA.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ usa.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && Canada.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ canada.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && Mexico.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ mexico.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && Italy.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ italy.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && Swiss.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ swiss.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && Vietnam.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ vietnam.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p1_turn && Egypt.p1_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ egypt.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }

        if(p1_turn && Korea.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }
        else if(p1_turn && Japan.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }
        else if(p1_turn && China.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p1_turn && England.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p1_turn && France.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p1_turn && Germany.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p1_turn && Russia.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p1_turn && USA.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p1_turn && Canada.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p1_turn && Mexico.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p1_turn && Italy.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p1_turn && Swiss.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p1_turn && Vietnam.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p1_turn && Egypt.p1_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }
        if(p1_turn && p1_placing_balloon){

            System.out.print("���� ���� ���� ���� �Է��� �ּ���");
        }

        if(p1_turn && Island.p1_lockedIsland){
            System.out.print("1.�ֻ��� 2���� ���� �ֻ����� ���� ���� ������ Ż��!");
        }

        if(p1_turn && Egypt.p1_egyptEvent){
            System.out.print("���� ��� ������� ���������� ���Ƽ� ���� �ᰡ 2�谡 �Ǿ����ϴ�.");
        }

    }

    public void roof2nd_p2(){
        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();
        if (p2_ownTheLand && p2_turn) {

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("��� �Ͻðڽ��ϱ�? ��� ���� ���� 10�� �Դϴ�.");

        }
        else if(p2_turn && p2_placing_taxx2){

            System.out.print("�Ű��� �𸥴ٱ���? :)");
        }
        if(p2_turn && Korea.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ korea.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && Japan.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ japan.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && China.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ china.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && England.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ england.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && France.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ france.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && Germany.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ germany.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && Russia.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ russia.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && USA.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ usa.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && Canada.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ canada.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && Mexico.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ mexico.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && Italy.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ italy.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && Swiss.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ swiss.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && Vietnam.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ vietnam.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }
        else if(p2_turn && Egypt.p2_returnTheMapNaming){
            System.out.print("�١١���湮���� ���� "+ egypt.travel+"�� ���� ���� ���� ������ϴ١١١�");
        }


        if(p2_turn && Korea.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }
        else if(p2_turn && Japan.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }
        else if(p2_turn && China.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p2_turn && England.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p2_turn && France.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p2_turn && Germany.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p2_turn && Russia.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p2_turn && USA.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p2_turn && Canada.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p2_turn && Mexico.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p2_turn && Italy.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p2_turn && Swiss.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p2_turn && Vietnam.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        else if(p2_turn && Egypt.p2_movedOtherPlayerMap){
            System.out.print("�� ����!");
        }

        if(p2_turn && p2_placing_balloon){

            System.out.print("������� �������� �Է����ּ���");
        }
        if(p2_turn && Island.p2_lockedIsland){
            System.out.print("1.�ֻ��� 2���� ���� �ֻ����� ���� ���� ������ Ż��!");
        }
        if(p2_turn && Egypt.p2_egyptEvent){
            System.out.print("���� ��� ������� ���������� ���Ƽ� ���� �ᰡ 2�谡 �Ǿ����ϴ�.");
        }
    }
    public void title2nd_p1(){

        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();
        if (p1_ownTheLand && p1_turn) {

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }


        if(p1_turn && Korea.p1_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+Korea.buildingCost+"�� �̳� ��!");
        }
        else if(p1_turn && Japan.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+Japan.buildingCost+"�� �̳� ��!");
        }
        else if(p1_turn && China.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+China.buildingCost+"�� �̳� ��!");
        }

        else if(p1_turn && England.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+England.buildingCost+"�� �̳� ��!");
        }

        else if(p1_turn && France.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+France.buildingCost+"�� �̳� ��!");
        }

        else if(p1_turn && Germany.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+Germany.buildingCost+"�� �̳� ��!");
        }

        else if(p1_turn && Russia.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+Russia.buildingCost+"�� �̳� ��!");
        }

        else if(p1_turn && USA.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+USA.buildingCost+"�� �̳� ��!");
        }

        else if(p1_turn && Canada.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+Canada.buildingCost+"�� �̳� ��!");
        }

        else if(p1_turn && Mexico.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+Mexico.buildingCost+"�� �̳� ��!");
        }

        else if(p1_turn && Italy.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+Italy.buildingCost+"�� �̳� ��!");
        }

        else if(p1_turn && Swiss.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+Swiss.buildingCost+"�� �̳� ��!");
        }

        else if(p1_turn && Vietnam.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+Vietnam.buildingCost+"�� �̳� ��!");
        }

        else if(p1_turn && Egypt.p1_taxBuilding){
           System.out.print("���� ��� ��� ���� �ᰡ "+Egypt.buildingCost+"�� �̳� ��!");
        }


        if(p1_turn && Korea.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Korea.landmarkCost+"�� �̳� ��!");
        }
        else if(p1_turn && Japan.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Japan.landmarkCost+"�� �̳� ��!");
        }
        else if(p1_turn && China.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+China.landmarkCost+"�� �̳� ��!");
        }

        else if(p1_turn && England.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+England.landmarkCost+"�� �̳� ��!");
        }

        else if(p1_turn && France.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+France.landmarkCost+"�� �̳� ��!");
        }

        else if(p1_turn && Germany.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Germany.landmarkCost+"�� �̳� ��!");
        }

        else if(p1_turn && Russia.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Russia.landmarkCost+"�� �̳� ��!");
        }

        else if(p1_turn && USA.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+USA.landmarkCost+"�� �̳� ��!");
        }

        else if(p1_turn && Canada.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Canada.landmarkCost+"�� �̳� ��!");
        }

        else if(p1_turn && Mexico.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Mexico.landmarkCost+"�� �̳� ��!");
        }

        else if(p1_turn && Italy.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Italy.landmarkCost+"�� �̳� ��!");
        }

        else if(p1_turn && Swiss.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Swiss.landmarkCost+"�� �̳� ��!");
        }

        else if(p1_turn && Vietnam.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Vietnam.landmarkCost+"�� �̳� ��!");
        }

        else if(p1_turn && Egypt.p1_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Egypt.landmarkCost+"�� �̳� ��!");
        }


        if(p1_turn && Korea.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Korea.build_markCost+"�� �̳� ��!");
        }
        else if(p1_turn && Japan.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Japan.build_markCost+"�� �̳� ��!");
        }
        else if(p1_turn && China.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+China.build_markCost+"�� �̳� ��!");
        }

        else if(p1_turn && England.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+England.build_markCost+"�� �̳� ��!");
        }

        else if(p1_turn && France.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+France.build_markCost+"�� �̳� ��!");
        }

        else if(p1_turn && Germany.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Germany.build_markCost+"�� �̳� ��!");
        }

        else if(p1_turn && Russia.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Russia.build_markCost+"�� �̳� ��!");
        }

        else if(p1_turn && USA.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+USA.build_markCost+"�� �̳� ��!");
        }

        else if(p1_turn && Canada.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Canada.build_markCost+"�� �̳� ��!");
        }

        else if(p1_turn && Mexico.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Mexico.build_markCost+"�� �̳� ��!");
        }

        else if(p1_turn && Italy.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Italy.build_markCost+"�� �̳� ��!");
        }

        else if(p1_turn && Swiss.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Swiss.build_markCost+"�� �̳� ��!");
        }

        else if(p1_turn && Vietnam.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Vietnam.build_markCost+"�� �̳� ��!");
        }

        else if(p1_turn && Egypt.p1_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Egypt.build_markCost+"�� �̳� ��!");
        }

        if(p1_turn && p1_placing_balloon){
            System.out.print("��Ÿ�� �Է��ϸ� �ι��� '��ȸ'�� �����ϴ� :)");
        }
        if(p1_turn && Island.p1_lockedIsland){
          System.out.print("2.30�� ����� ���� ���ε� ���� ���� ��ü 'don't worry'�� �θ���. ");
        }
        if(p1_turn && Egypt.p1_egyptEvent) {
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }
    }

    public void title2nd_p2(){
        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();
        if (p2_ownTheLand && p2_turn) {

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%�� Ȯ���� ������ �Ǽ��ǰ�, 25%�� Ȯ���� ���帶ũ�� �Ǽ��˴ϴ�. :)");

        }


        if(p2_turn && Korea.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+Korea.buildingCost+"�� �̳� ��!");
        }
        else if(p2_turn && Japan.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+Japan.buildingCost+"�� �̳� ��!");
        }
        else if(p2_turn && China.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+China.buildingCost+"�� �̳� ��!");
        }

        else if(p2_turn && England.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+England.buildingCost+"�� �̳� ��!");
        }

        else if(p2_turn && France.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+France.buildingCost+"�� �̳� ��!");
        }

        else if(p2_turn && Germany.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+Germany.buildingCost+"�� �̳� ��!");
        }

        else if(p2_turn && Russia.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+Russia.buildingCost+"�� �̳� ��!");
        }

        else if(p2_turn && USA.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+USA.buildingCost+"�� �̳� ��!");
        }

        else if(p2_turn && Canada.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+Canada.buildingCost+"�� �̳� ��!");
        }

        else if(p2_turn && Mexico.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+Mexico.buildingCost+"�� �̳� ��!");
        }

        else if(p2_turn && Italy.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+Italy.buildingCost+"�� �̳� ��!");
        }

        else if(p2_turn && Swiss.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+Swiss.buildingCost+"�� �̳� ��!");
        }

        else if(p2_turn && Vietnam.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+Vietnam.buildingCost+"�� �̳� ��!");
        }

        else if(p2_turn && Egypt.p2_taxBuilding){
            System.out.print("���� ��� ��� ���� �ᰡ "+Egypt.buildingCost+"�� �̳� ��!");
        }


        if(p2_turn && Korea.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Korea.landmarkCost+"�� �̳� ��!");
        }
        else if(p2_turn && Japan.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Japan.landmarkCost+"�� �̳� ��!");
        }
        else if(p2_turn && China.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+China.landmarkCost+"�� �̳� ��!");
        }

        else if(p2_turn && England.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+England.landmarkCost+"�� �̳� ��!");
        }

        else if(p2_turn && France.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+France.landmarkCost+"�� �̳� ��!");
        }

        else if(p2_turn && Germany.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Germany.landmarkCost+"�� �̳� ��!");
        }

        else if(p2_turn && Russia.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Russia.landmarkCost+"�� �̳� ��!");
        }

        else if(p2_turn && USA.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+USA.landmarkCost+"�� �̳� ��!");
        }

        else if(p2_turn && Canada.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Canada.landmarkCost+"�� �̳� ��!");
        }

        else if(p2_turn && Mexico.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Mexico.landmarkCost+"�� �̳� ��!");
        }

        else if(p2_turn && Italy.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Italy.landmarkCost+"�� �̳� ��!");
        }

        else if(p2_turn && Swiss.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Swiss.landmarkCost+"�� �̳� ��!");
        }

        else if(p2_turn && Vietnam.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Vietnam.landmarkCost+"�� �̳� ��!");
        }

        else if(p2_turn && Egypt.p2_taxLandmark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Egypt.landmarkCost+"�� �̳� ��!");
        }


        if(p2_turn && Korea.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Korea.build_markCost+"�� �̳� ��!");
        }
        else if(p2_turn && Japan.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Japan.build_markCost+"�� �̳� ��!");
        }
        else if(p2_turn && China.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+China.build_markCost+"�� �̳� ��!");
        }

        else if(p2_turn && England.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+England.build_markCost+"�� �̳� ��!");
        }

        else if(p2_turn && France.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+France.build_markCost+"�� �̳� ��!");
        }

        else if(p2_turn && Germany.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Germany.build_markCost+"�� �̳� ��!");
        }

        else if(p2_turn && Russia.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Russia.build_markCost+"�� �̳� ��!");
        }

        else if(p2_turn && USA.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+USA.build_markCost+"�� �̳� ��!");
        }

        else if(p2_turn && Canada.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Canada.build_markCost+"�� �̳� ��!");
        }

        else if(p2_turn && Mexico.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Mexico.build_markCost+"�� �̳� ��!");
        }

        else if(p2_turn && Italy.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Italy.build_markCost+"�� �̳� ��!");
        }

        else if(p2_turn && Swiss.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Swiss.build_markCost+"�� �̳� ��!");
        }

        else if(p2_turn && Vietnam.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Vietnam.build_markCost+"�� �̳� ��!");
        }

        else if(p2_turn && Egypt.p2_taxBuild_mark){
            System.out.print("���� ��� ��� ���� �ᰡ "+Egypt.build_markCost+"�� �̳� ��!");
        }
        if(p2_turn && p2_placing_balloon){
            System.out.print("��Ÿ�� �Է��ϸ� �ι��� '��ȸ'�� �����ϴ� :)");
        }
        if(p2_turn && Island.p2_lockedIsland){
            System.out.print("2.30�� ����� ���� ���ε� ���� ���� ��ü 'don't worry'�� �θ���. ");
        }

        if(p2_turn && Egypt.p2_egyptEvent) {
            System.out.print("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
        }


    }
    public void structure2nd_p1(){


        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();
        if (p1_ownTheLand && p1_turn) {

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }

        if(p1_turn && Korea.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ korea.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }

        else if(p1_turn && Japan.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ japan.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }

        else if(p1_turn && China.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ china.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p1_turn && England.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ england.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p1_turn && France.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ france.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p1_turn && Germany.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ germany.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p1_turn && Russia.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ russia.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p1_turn && USA.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ usa.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p1_turn && Canada.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ canada.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ mexico.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p1_turn && Italy.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ italy.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ swiss.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ vietnam.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ egypt.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");

        }

        Balloon balloon = new Balloon();

        if(p1_turn && p1_placing_balloonSelected){

            System.out.print(balloon.where+"�� �̵� �մϴ�!");

        }

        if(p1_turn && Island.p1_lockedIslandError){
            System.out.print("�߸� �Է��߽��ϴ�. �� ��� ����� �����! ������ �ּ���.");
        }
        if(p1_turn && Egypt.p1_egyptEvent){
            System.out.print("������!");
        }
    }

    public void structure2nd_p2(){
        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();
        if (p2_ownTheLand && p2_turn) {

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'����','dd','DD'��(��)  �Է��ϸ� ���Ű� �ǰ� �ٸ� ���ڸ� �Է��ϸ� ���Ű� �����ʽ��ϴ�.");

        }

        if(p2_turn && Korea.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ korea.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }

        else if(p2_turn && Japan.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ japan.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }

        else if(p2_turn && China.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ china.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p2_turn && England.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ england.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p2_turn && France.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ france.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p2_turn && Germany.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ germany.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p2_turn && Russia.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ russia.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p2_turn && USA.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ usa.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p2_turn && Canada.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ canada.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ mexico.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p2_turn && Italy.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ italy.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ swiss.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ vietnam.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMap){
            System.out.print("���� ��� �÷��̾ "+ egypt.travel+"�� ���� ����� ���� �ʾƼ� ������ �� �ֽ��ϴ�.");

        }
        Balloon balloon = new Balloon();
        if(p2_turn && p2_placing_balloonSelected){

            System.out.print(balloon.where+"�� �̵� �մϴ�!");

        }

        if(p2_turn && Island.p2_lockedIslandError){
            System.out.print("�߸� �Է��߽��ϴ�. �� ��� ����� �����! ������ �ּ���.");
        }
        if(p2_turn && Egypt.p2_egyptEvent){
            System.out.print("������!");
        }

    }
    public void cost2nd_p1(){

        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();
        if (Korea.p1_successContract && p1_turn && p1_ownTheLand) {

            System.out.print("�١١�" + korea.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(Japan.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + japan.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(China.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + china.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(England.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + england.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(France.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + france.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(Germany.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + germany.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(Russia.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + russia.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(USA.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + usa.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(Canada.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + canada.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(Mexico.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + mexico.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(Italy.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + italy.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(Swiss.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + swiss.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(Vietnam.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + vietnam.travel + "�� ��� �߽��ϴ١١١�");

        }
        else if(Egypt.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("�١١�" + egypt.travel + "�� ��� �߽��ϴ١١١�");

        }

        if(p1_turn && Korea.p1_willTakeYourMap){
            System.out.print(korea.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }

        else if(p1_turn && Japan.p1_willTakeYourMap){
            System.out.print(japan.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }

        else if(p1_turn && China.p1_willTakeYourMap){
            System.out.print(china.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p1_turn && England.p1_willTakeYourMap){
            System.out.print(england.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p1_turn && France.p1_willTakeYourMap){
            System.out.print(france.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p1_turn && Germany.p1_willTakeYourMap){
            System.out.print(germany.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p1_turn && Russia.p1_willTakeYourMap){
            System.out.print(russia.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p1_turn && USA.p1_willTakeYourMap){
            System.out.print(usa.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p1_turn && Canada.p1_willTakeYourMap){
            System.out.print(canada.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMap){
            System.out.print(mexico.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p1_turn && Italy.p1_willTakeYourMap){
            System.out.print(italy.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMap){
            System.out.print(swiss.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMap){
            System.out.print(vietnam.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMap){
            System.out.print(egypt.travel+"��(��) ���� �Ͻðڽ��ϱ�?");

        }


        if(p1_turn && Start.p1_selectKorea){
            System.out.print("�١١�"+korea.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectJapan){
            System.out.print("�١١�"+japan.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectChina){
            System.out.print("�١١�"+china.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectEngland){
            System.out.print("�١١�"+england.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectFrance){
            System.out.print("�١١�"+france.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectGermany){
            System.out.print("�١١�"+germany.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectRussia){
            System.out.print("�١١�"+russia.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectUSA){
            System.out.print("�١١�"+usa.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectCanada){
            System.out.print("�١١�"+canada.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectMexico){
            System.out.print("�١١�"+mexico.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectItaly){
            System.out.print("�١١�"+italy.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectSwiss){
            System.out.print("�١١�"+swiss.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectVietnam){
            System.out.print("�١١�"+vietnam.travel+"�� ���� �������� ������ϴ١١١�");
        }
        else if(p1_turn && Start.p1_selectEgypt){
            System.out.print("�١١�"+egypt.travel+"�� ���� �������� ������ϴ١١١�");
        }
        if(p1_turn && Island.p1_select1Pass) {
            System.out.print("�ֻ����� ���ȴµ� ���� ����? �̰� �ϴ��� ��þ�!");
        }
        if(p1_turn && Island.p1_select1Fail) {
            System.out.print("�ֻ��� ���� ���� �ٸ���.. �׷��� ��� ����Ⱑ ���� �󸶳� ������ �Ѵ� ���� ���� ������");
        }

        if(p1_turn && Island.p1_select2Call){
            System.out.print("�ȳ��ϼ��� ���� ���� ��ü 'don't worry' �Դϴ�. ������ ������ ���ؼ� ������ �Խ��ϴ�.");
        }

        if(p1_turn && Egypt.p1_egyptEvent){
            System.out.print("����ᰡ �� 2�質 �ö�! �ȵ�!!");
        }
    }

    public void cost2nd_p2(){

        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();
        if (Korea.p2_successContract && p2_turn) {

            System.out.print("�ڡڡ�" + korea.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(Japan.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + japan.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(China.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + china.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(England.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + england.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(France.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + france.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(Germany.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + germany.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(Russia.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + russia.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(USA.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + usa.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(Canada.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + canada.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(Mexico.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + mexico.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(Italy.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + italy.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(Swiss.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + swiss.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(Vietnam.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + vietnam.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }
        else if(Egypt.p2_successContract && p2_turn){

            System.out.print("�ڡڡ�" + egypt.travel + "�� ��� �߽��ϴ١ڡڡ�");

        }


        if(p2_turn && Korea.p2_willTakeYourMap){
            System.out.print(korea.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }

        else if(p2_turn && Japan.p2_willTakeYourMap){
            System.out.print(japan.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }

        else if(p2_turn && China.p2_willTakeYourMap){
            System.out.print(china.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p2_turn && England.p2_willTakeYourMap){
            System.out.print(england.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p2_turn && France.p2_willTakeYourMap){
            System.out.print(france.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p2_turn && Germany.p2_willTakeYourMap){
            System.out.print(germany.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p2_turn && Russia.p2_willTakeYourMap){
            System.out.print(russia.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p2_turn && USA.p2_willTakeYourMap){
            System.out.print(usa.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p2_turn && Canada.p2_willTakeYourMap){
            System.out.print(canada.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMap){
            System.out.print(mexico.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p2_turn && Italy.p2_willTakeYourMap){
            System.out.print(italy.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMap){
            System.out.print(swiss.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMap){
            System.out.print(vietnam.travel+"��(��) ���� �Ͻðڽ��ϱ�?");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMap){
            System.out.print(egypt.travel+"��(��) ���� �Ͻðڽ��ϱ�?");

        }


        if(p2_turn && Start.p2_selectKorea){
            System.out.print("�ڡڡ�"+korea.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectJapan){
            System.out.print("�ڡڡ�"+japan.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectChina){
            System.out.print("�ڡڡ�"+china.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectEngland){
            System.out.print("�ڡڡ�"+england.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectFrance){
            System.out.print("�ڡڡ�"+france.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectGermany){
            System.out.print("�ڡڡ�"+germany.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectRussia){
            System.out.print("�ڡڡ�"+russia.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectUSA){
            System.out.print("�ڡڡ�"+usa.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectCanada){
            System.out.print("�ڡڡ�"+canada.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectMexico){
            System.out.print("�ڡڡ�"+mexico.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectItaly){
            System.out.print("�ڡڡ�"+italy.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectSwiss){
            System.out.print("�ڡڡ�"+swiss.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectVietnam){
            System.out.print("�ڡڡ�"+vietnam.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        else if(p2_turn && Start.p2_selectEgypt){
            System.out.print("�ڡڡ�"+egypt.travel+"�� ���� �������� ������ϴ١ڡڡ�");
        }
        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("�ֻ����� ���ȴµ� ���� ����? �̰� �ϴ��� ��þ�!");
        }
        if(p2_turn && Island.p2_select1Fail) {
            System.out.print("�ֻ��� ���� ���� �ٸ���.. �׷��� ��� ����Ⱑ ���� �󸶳� ������ �Ѵ� ���� ���� ������");
        }

        if(p2_turn && Island.p2_select2Call){
            System.out.print("�ȳ��ϼ��� ���� ���� ��ü 'don't worry' �Դϴ�. ������ ������ ���ؼ� ������ �Խ��ϴ�.");
        }

        if(p2_turn && Egypt.p2_egyptEvent){
            System.out.print("����ᰡ �� 2�質 �ö�! �ȵ�!!");
        }

    }
    public void playerIndex2nd_p1(){


        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();

        if(p1_turn && p1_selected_building){
            System.out.print("������ �Ǽ� �߽��ϴ� :)");
        }
        else if(p1_turn && p1_selected_landmark){
            System.out.print("���帶ũ�� �Ǽ� �߽��ϴ� :)");
        }


        if(p1_turn && Korea.p1_willTakeYourMap){
            System.out.print("������ "+(Korea.buildingCost*1.1)+"�� �Դϴ�.");
        }

        else if(p1_turn && Japan.p1_willTakeYourMap){
            System.out.print("������ "+(Japan.buildingCost*1.1)+"�� �Դϴ�.");
        }

        else if(p1_turn && China.p1_willTakeYourMap){
            System.out.print("������ "+(China.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p1_turn && England.p1_willTakeYourMap){
            System.out.print("������ "+(England.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p1_turn && France.p1_willTakeYourMap){
            System.out.print("������ "+(France.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p1_turn && Germany.p1_willTakeYourMap){
            System.out.print("������ "+(Germany.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p1_turn && Russia.p1_willTakeYourMap){
            System.out.print("������ "+(Russia.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p1_turn && USA.p1_willTakeYourMap){
            System.out.print("������ "+(USA.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p1_turn && Canada.p1_willTakeYourMap){
            System.out.print("������ "+(Canada.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMap){
            System.out.print("������ "+(Mexico.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p1_turn && Italy.p1_willTakeYourMap){
            System.out.print("������ "+(Italy.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMap){
            System.out.print("������ "+(Swiss.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMap){
            System.out.print("������ "+(Vietnam.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMap){
            System.out.print("������ "+(Egypt.buildingCost*1.1)+"�� �Դϴ�.");

        }

        if(p1_turn && Island.p1_select1Pass) {
            System.out.print("�ָ��� �ѿ���� �Ҹ��� �鸰��");
        }
        if(p1_turn && Island.p1_select1Fail){
            System.out.print(".....� �͵� ���� �ʴ´�");
        }

        if(p1_turn && Island.p1_select2Call){
            System.out.print("���� �մϴ�");
        }

        if(p1_turn && Egypt.p1_egyptEventBuilding){
            System.out.println("���� ��� ��� ���� �ᰡ "+Egypt.buildingCost+"���̳� ��!");
        }
        else if(p1_turn && Egypt.p1_egyptEventLandmark){
            System.out.println("���� ��� ��� ���� �ᰡ "+Egypt.landmarkCost+"���̳� ��!");
        }
        else if(p1_turn && Egypt.p1_egyptEventBuild_mark){
            System.out.println("���� ��� ��� ���� �ᰡ "+Egypt.build_markCost+"���̳� ��!");
        }
    }

    public void playerIndex2nd_p2(){


        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();

        if(p2_turn && p2_selected_building){
            System.out.print("������ �Ǽ� �߽��ϴ� :)");
        }
        else if(p2_turn && p2_selected_landmark){
            System.out.print("���帶ũ�� �Ǽ� �߽��ϴ� :)");
        }




        if(p2_turn && Korea.p2_willTakeYourMap){
            System.out.print("������ "+(Korea.buildingCost*1.1)+"�� �Դϴ�.");
        }

        else if(p2_turn && Japan.p2_willTakeYourMap){
            System.out.print("������ "+(Japan.buildingCost*1.1)+"�� �Դϴ�.");
        }

        else if(p2_turn && China.p2_willTakeYourMap){
            System.out.print("������ "+(China.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p2_turn && England.p2_willTakeYourMap){
            System.out.print("������ "+(England.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p2_turn && France.p2_willTakeYourMap){
            System.out.print("������ "+(France.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p2_turn && Germany.p2_willTakeYourMap){
            System.out.print("������ "+(Germany.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p2_turn && Russia.p2_willTakeYourMap){
            System.out.print("������ "+(Russia.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p2_turn && USA.p2_willTakeYourMap){
            System.out.print("������ "+(USA.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p2_turn && Canada.p2_willTakeYourMap){
            System.out.print("������ "+(Canada.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMap){
            System.out.print("������ "+(Mexico.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p2_turn && Italy.p2_willTakeYourMap){
            System.out.print("������ "+(Italy.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMap){
            System.out.print("������ "+(Swiss.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMap){
            System.out.print("������ "+(Vietnam.buildingCost*1.1)+"�� �Դϴ�.");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMap){
            System.out.print("������ "+(Egypt.buildingCost*1.1)+"�� �Դϴ�.");

        }
        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("�ָ��� �ѿ���� �Ҹ��� �鸰��");
        }
        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("��? �谡 ���� ���� ���� ���� ����!");
        }
        if(p2_turn && Island.p2_select1Fail){
            System.out.print(".....� �͵� ���� �ʴ´�");
        }
        if(p2_turn && Island.p2_select2Call){
            System.out.print("���� �մϴ�");
        }
        if(p2_turn && Egypt.p2_egyptEventBuilding){
            System.out.println("���� ��� ��� ���� �ᰡ "+Egypt.buildingCost+"���̳� ��!");
        }
        else if(p2_turn && Egypt.p2_egyptEventLandmark){
            System.out.println("���� ��� ��� ���� �ᰡ "+Egypt.landmarkCost+"���̳� ��!");
        }
        else if(p2_turn && Egypt.p2_egyptEventBuild_mark){
            System.out.println("���� ��� ��� ���� �ᰡ "+Egypt.build_markCost+"���̳� ��!");
        }

    }

    public void floor2nd_p1(){

        if(p1_turn && p1_england_event){
            System.out.print("'dd','DD','����' �� �ϳ��� �Է� �ϸ� ������ �÷��̾�� ĳ���ٰ� ����� �Ҽ� �ְ� ���� �ݴϴ�.");
        }

        if(p1_turn && Korea.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }

        else if(p1_turn && Japan.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }

        else if(p1_turn && China.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p1_turn && England.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p1_turn && France.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p1_turn && Germany.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p1_turn && Russia.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p1_turn && USA.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p1_turn && Canada.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p1_turn && Italy.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");

        }
        if(p1_turn && Island.p1_select1Pass) {
            System.out.print("��? �谡 ���� ���� ���� ���� ����!");
        }

        if(p1_turn && Island.p1_select2Call){
            System.out.print("���� �̿��� 30�� �Դϴ�.");
        }

        if(p1_turn && p1_england_event_5){
            System.out.print("��� �÷��̾ �ش� ������ ����� �ϰ� ������ ������� ���� �ϰ� ����� ������ �ֽ��ϴ�. �Ͻðڽ��ϱ�?");
        }

    }

    public void floor2nd_p2(){
        if(p2_turn && p2_england_event){
            System.out.print("'dd','DD','����' �� �ϳ��� �Է� �ϸ� ������ �÷��̾�� ĳ���ٰ� ����� �Ҽ� �ְ� ���� �ݴϴ�.");
        }

        if(p2_turn && Korea.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }

        else if(p2_turn && Japan.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }

        else if(p2_turn && China.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p2_turn && England.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p2_turn && France.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p2_turn && Germany.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p2_turn && Russia.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p2_turn && USA.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p2_turn && Canada.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p2_turn && Italy.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");

        }

        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("��? �谡 ���� ���� ���� ���� ����!");
        }

        if(p2_turn && Island.p2_select2Call){
            System.out.print("���� �̿��� 30�� �Դϴ�.");
        }
        if(p2_turn && p2_england_event_5){
            System.out.print("��� �÷��̾ �ش� ������ ����� �ϰ� ������ ������� ���� �ϰ� ����� ������ �ֽ��ϴ�. �Ͻðڽ��ϱ�?");
        }


    }

    public void roof1st_p1(){

        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();

        if(p1_turn && p1_england_event){
            System.out.print("������ �ص� 10%�� Ȯ���� ����� ���� �˴ϴ�.");
        }
        if(p1_turn && Korea.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }

        else if(p1_turn && Japan.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }

        else if(p1_turn && China.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p1_turn && England.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p1_turn && France.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p1_turn && Germany.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p1_turn && Russia.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p1_turn && USA.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p1_turn && Canada.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p1_turn && Italy.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");

        }

        if(p1_turn && Island.p1_select1Pass) {
            System.out.print("�� ��Ҵ�");
        }


        if(p1_turn && Island.p1_select2Call){
            System.out.print("�ʹ� ���..");
        }

        if (p1_turn && p1_england_event_5) {

            System.out.print("��� ���� ���� 18�� �Ҹ� �˴ϴ�. ��� �Ͻð� ���ϱ�?");
        }



    }
    public void roof1st_p2(){

        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();

        if(p2_turn && p2_england_event){
            System.out.print("������ �ص� 10%�� Ȯ���� ����� ���� �˴ϴ�.");
        }


        if(p2_turn && Korea.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }

        else if(p2_turn && Japan.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }

        else if(p2_turn && China.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p2_turn && England.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p2_turn && France.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p2_turn && Germany.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p2_turn && Russia.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p2_turn && USA.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p2_turn && Canada.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p2_turn && Italy.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMap){
            System.out.print("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");

        }

        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("�� ��Ҵ�");
        }

        if(p2_turn && Island.p2_select2Call){
            System.out.print("�ʹ� ���..");
        }
        if (p2_turn && p2_england_event_5) {

            System.out.print("��� ���� ���� 18�� �Ҹ� �˴ϴ�. ��� �Ͻð� ���ϱ�?");
        }


    }
    public void title1st_p1(){

        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();

        if(p1_turn && Korea.p1_willTakeYourMapYes){
            System.out.print(korea.travel + "��(��) �����߽��ϴ�.");
        }
        else if(p1_turn && Japan.p1_willTakeYourMapYes){
            System.out.print(japan.travel + "��(��) �����߽��ϴ�.");
        }

        else if(p1_turn && China.p1_willTakeYourMapYes){
            System.out.print(china.travel + "��(��) �����߽��ϴ�.");
        }

        else if(p1_turn && England.p1_willTakeYourMapYes){
            System.out.print(england.travel + "��(��) �����߽��ϴ�.");
        }

        else if(p1_turn && France.p1_willTakeYourMapYes){
            System.out.print(france.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p1_turn && Germany.p1_willTakeYourMapYes){
            System.out.print(germany.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p1_turn && Russia.p1_willTakeYourMapYes){
            System.out.print(russia.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p1_turn && USA.p1_willTakeYourMapYes){
            System.out.print(usa.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p1_turn && Canada.p1_willTakeYourMapYes){
            System.out.print(canada.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMapYes){
            System.out.print(mexico.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p1_turn && Italy.p1_willTakeYourMapYes){
            System.out.print(italy.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMapYes){
            System.out.print(swiss.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMapYes){
            System.out.print(vietnam.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMapYes){
            System.out.print(egypt.travel + "��(��) �����߽��ϴ�.");
        }

        if(p1_turn && Island.p1_select1Pass) {
            System.out.print("��)���ε� Ż�⿡ ���� �߽��ϴ�(��");
        }
        if(p1_turn && Island.p1_select2Call) {
            System.out.print("�١١ٴ���� ������ 30�� ���� �Ǿ����ϴ١١١�");
        }
        if(p1_turn && p1_england_event_3){
            System.out.print("�١١�ĳ���ٿ� ��� �߽��ϴ١١١�");
        }

        if (p1_turn && p1_england_event_5) {

            System.out.print("'dd','DD','����' �� �ϳ��� �Է� �ϸ� ����� ���� �˴ϴ�.");
        }
        if(p1_turn && p1_england_event_8){
            System.out.print("ĳ���ٿ��� ����� ���� �߽��ϴ�.");
        }

    }
    public void title1st_p2(){

        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();

        if(p2_turn && Korea.p2_willTakeYourMapYes){
            System.out.print(korea.travel + "��(��) �����߽��ϴ�.");
        }
        else if(p2_turn && Japan.p2_willTakeYourMapYes){
            System.out.print(japan.travel + "��(��) �����߽��ϴ�.");
        }

        else if(p2_turn && China.p2_willTakeYourMapYes){
            System.out.print(china.travel + "��(��) �����߽��ϴ�.");
        }

        else if(p2_turn && England.p2_willTakeYourMapYes){
            System.out.print(england.travel + "��(��) �����߽��ϴ�.");
        }

        else if(p2_turn && France.p2_willTakeYourMapYes){
            System.out.print(france.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p2_turn && Germany.p2_willTakeYourMapYes){
            System.out.print(germany.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p2_turn && Russia.p2_willTakeYourMapYes){
            System.out.print(russia.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p2_turn && USA.p2_willTakeYourMapYes){
            System.out.print(usa.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p2_turn && Canada.p2_willTakeYourMapYes){
            System.out.print(canada.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMapYes){
            System.out.print(mexico.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p2_turn && Italy.p2_willTakeYourMapYes){
            System.out.print(italy.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMapYes){
            System.out.print(swiss.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMapYes){
            System.out.print(vietnam.travel + "��(��) �����߽��ϴ�.");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMapYes){
            System.out.print(egypt.travel + "��(��) �����߽��ϴ�.");
        }

        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("��)���ε� Ż�⿡ ���� �߽��ϴ�(��");
        }
        if(p2_turn && Island.p2_select2Call) {
            System.out.print("�ڡڡڴ���� ������ 30�� ���� �Ǿ����ϴ١ڡڡ�");
        }
        if(p2_turn && p2_england_event_3){
            System.out.print("�ڡڡ�ĳ���ٿ� ��� �߽��ϴ١ڡڡ�");
        }
        if (p2_turn && p2_england_event_5) {

            System.out.print("'dd','DD','����' �� �ϳ��� �Է� �ϸ� ����� ���� �˴ϴ�.");
        }
        if(p2_turn && p2_england_event_8){
            System.out.print("ĳ���ٿ��� ����� ���� �߽��ϴ�.");
        }


    }
    public void structure1st_p1(){
        Korea korea = new Korea();
        Japan japan = new Japan();
        France france = new France();
        Germany germany = new Germany();
        Russia russia = new Russia();
        England england = new England();
        China china = new China();
        USA usa = new USA();
        Canada canada = new Canada();
        Mexico mexico = new Mexico();
        Egypt egypt = new Egypt();
        Vietnam vietnam = new Vietnam();
        Swiss swiss = new Swiss();
        Italy italy = new Italy();

        if(p1_turn && p1_england_event_3){
            System.out.print("������ �Ǽ� �߽��ϴ�.");
        }
        if(p1_turn && p1_england_event_6){
            System.out.print("�١١�ĳ���ٿ� ��� �߽��ϴ١١١�");
        }
        if(p1_turn && p1_england_event_7){
            System.out.print("��� �÷��̾ ���帶ũ�� ���� �ϰ� �־ ����� �Ҽ� �����ϴ�.");
        }
        if(p1_turn && China.p1_chinaEvent){
            System.out.print("���� ��å���� ���� ������ �ִ� ���๰���� �Ϲ������� ö�� �Ǿ����ϴ�.");
        }
        if(p1_turn && USA.p1_event){
            System.out.print("�߱����� ���� �������� ����  �߱����� ����� �ı� �˴ϴ�.");
        }
        if(p1_turn && Germany.p1_event){
            System.out.print("���� �Ⱓ�� �湮 �Ͽ� ���ο��� 10���� ���� �մϴ�.");
        }
        if(p1_turn && Italy.p1_event){
            System.out.print("���������� ���� �þ�� 10���� �濵����������  �޾ҽ��ϴ�!");
        }
        if(p1_turn && Mexico.p1_event){
            System.out.print("�߽��� ������ ������ ������ �ִ� �������� ���� ��Ż ���߽��ϴ�.");
        }
        if(p1_turn && Russia.p1_event){
            System.out.print("���� ���ߺ�����");
        }
        if(p1_turn && Swiss.p1_event){
            System.out.print("������ ����� ���� ��� ���� �ؼ� ���� ���� ���� ���� 10�� ��� �߽��ϴ�.");
        }
    }
    public void structure1st_p2(){
        if(p2_turn && p2_england_event_3){
            System.out.print("������ �Ǽ� �߽��ϴ�.");
        }
        if(p2_turn && p2_england_event_6){
            System.out.print("�ڡڡ�ĳ���ٿ� ��� �߽��ϴ١ڡڡ�");
        }
        if(p2_turn && p2_england_event_7){
            System.out.print("��� �÷��̾ ���帶ũ�� ���� �ϰ� �־ ����� �Ҽ� �����ϴ�.");
        }
        if(p2_turn && China.p2_chinaEvent){
            System.out.print("���� ��å���� ���� ������ �ִ� ���๰���� �Ϲ������� ö�� �Ǿ����ϴ�.");
        }
        if(p2_turn && USA.p2_event){
            System.out.print("�߱����� ���� �������� ���� �߱����� ����� �ı� �˴ϴ�.");
        }
        if(p2_turn && Germany.p2_event){
            System.out.print("���� �Ⱓ�� �湮 �Ͽ� ���ο��� 10���� ���� �մϴ�.");
        }
        if(p2_turn && Italy.p2_event){
            System.out.print("���������� ���� �þ�� 10���� �濵����������  �޾ҽ��ϴ�!");
        }
        if(p2_turn && Mexico.p2_event){
            System.out.print("�߽��� ������ ������ ������ �ִ� �������� ���� ��Ż ���߽��ϴ�.");
        }
        if(p2_turn && Russia.p2_event){
            System.out.print("���� ���ߺ�����");
        }
        if(p2_turn && Swiss.p2_event){
            System.out.print("������ ����� ���� ��� ���� �ؼ� ���� ���� ���� ���� 10�� ��� �߽��ϴ�.");
        }
    }
    public void cost1st_p1(){
        if(p1_turn && Island.throwDice){
            System.out.print("1�� �ֻ����� ������ "+Dice.dice1+"�� ���Խ��ϴ�");
        }
        if(p1_turn && Russia.p1_event){
            System.out.print("Ǫƾ�� ģ������ ���þƿ� ��������� �ξ����ϴ�.");
        }

    }
    public void cost1st_p2(){
        if(p2_turn && Island.throwDice){
            System.out.print("1�� �ֻ����� ������ "+Dice.dice1+"�� ���Խ��ϴ�");
        }
        if(p2_turn && Russia.p2_event){
            System.out.print("Ǫƾ�� ģ������ ���þƿ� ��������� �ξ����ϴ�.");
        }
    }
    public void playerIndex1st_p1(){
        if(p1_turn && Island.throwDice){
            System.out.print("2�� �ֻ����� ������ "+Dice.dice2+"�� ���Խ��ϴ�");
        }
    }
    public void playerIndex1st_p2(){
        if(p2_turn && Island.throwDice){
            System.out.print("2�� �ֻ����� ������ "+Dice.dice2+"�� ���Խ��ϴ�");
        }
    }
    public void floor1st_p1(){



    }
    public void floor1st_p2(){

    }

    public static void p1_false(){


        SuperDiceTime.stop=false;

        Island.p1_lockedIsland=false;
        Island.p1_lockedIslandError=false;
        Island.p1_select1Pass=false;
        Island.p1_select1Fail=false;
        Island.p1_select2Call=false;
        Island.throwDice=false;
        //Island

        Start.p1_placingStart=false;
        Start.p1_selectKorea=false;
        Start.p1_selectJapan=false;
        Start.p1_selectChina=false;
        Start.p1_selectEngland=false;
        Start.p1_selectFrance=false;
        Start.p1_selectGermany=false;
        Start.p1_selectRussia=false;
        Start.p1_selectUSA=false;
        Start.p1_selectCanada=false;
        Start.p1_selectMexico=false;
        Start.p1_selectItaly=false;
        Start.p1_selectSwiss=false;
        Start.p1_selectVietnam=false;
        Start.p1_selectEgypt=false;

        //Start

        p1_turn=false;
        p1_rollingDice=false;
        p1_rollingDice1=false;
        p1_ownTheLand=false;
        p1_placing_taxx2=false;
        p1_france_protesting=false;
        p1_selected_building=false;
        p1_selected_landmark=false;
        p1_returnedTHeMap=false;

        p1_england_event=false;
        p1_england_event_1=false;
        p1_england_event_2=false;
        p1_england_event_3=false;
        p1_england_event_4=false;
        p1_england_event_5=false;
        p1_england_event_6=false;
        p1_england_event_7=false;
        p1_england_event_8=false;


        p1_placing_balloon=false;
        p1_placing_balloonSelected=false;
        p1_moving=false;
        //PlayboardLog

        Player.superDiceStart=false;
        Player.superDiceResult=false;


        TurnOver.p1_player_index_turnOver=false;
        TurnOver.p1_buyMapReturned_turnOver=false;
        TurnOver.p1_buyMap_turnOver=false;
        TurnOver.p1_dontTakeMyMoney_turnOver=false;
        TurnOver.p1_willTakeYourMap_turnOver=false;
        TurnOver.p1_festivalInChina_turnOver=false;
        TurnOver.p1_ContractCanada_turnOver=false;
        TurnOver.p1_helpPlayer_turnOver=false;
        TurnOver.p1_festivalInItaly_turnOver=false;
        TurnOver.p1_festivalInMexico_turnOver=false;
        TurnOver.p1_festivalRussia_turnOver=false;
        TurnOver.p1_festivalInSwiss_turnOver=false;
        TurnOver.p1_tradeWar_turnOver=false;
        TurnOver.p1_turnOver=false;
        //TurnOver


        Korea.p1_successContract=false;
        Korea.p1_startOwnTheLand=false;
        Korea.p1_returnTheMapNaming=false;
        Korea.p1_movedOtherPlayerMap=false;
        Korea.p1_taxBuilding=false;
        Korea.p1_taxLandmark=false;
        Korea.p1_taxBuild_mark=false;
        Korea.p1_willTakeYourMap=false;
        Korea.p1_willTakeYourMapYes=false;

        //Korea

        Japan.p1_successContract=false;
        Japan.p1_startOwnTheLand=false;
        Japan.p1_returnTheMapNaming=false;
        Japan.p1_movedOtherPlayerMap=false;
        Japan.p1_taxBuilding=false;
        Japan.p1_taxLandmark=false;
        Japan.p1_taxBuild_mark=false;
        Japan.p1_willTakeYourMap=false;
        Japan.p1_willTakeYourMapYes=false;

        //Japan

        China.p1_successContract=false;
        China.p1_startOwnTheLand=false;
        China.p1_returnTheMapNaming=false;
        China.p1_movedOtherPlayerMap=false;
        China.p1_taxBuilding=false;
        China.p1_taxLandmark=false;
        China.p1_taxBuild_mark=false;
        China.p1_willTakeYourMap=false;
        China.p1_willTakeYourMapYes=false;
        China.p1_chinaEvent=false;
        //China

        England.p1_successContract=false;
        England.p1_startOwnTheLand=false;
        England.p1_returnTheMapNaming=false;
        England.p1_movedOtherPlayerMap=false;
        England.p1_taxBuilding=false;
        England.p1_taxLandmark=false;
        England.p1_taxBuild_mark=false;
        England.p1_willTakeYourMap=false;
        England.p1_willTakeYourMapYes=false;


        //England

        France.p1_successContract=false;
        France.p1_startOwnTheLand=false;
        France.p1_returnTheMapNaming=false;
        France.p1_movedOtherPlayerMap=false;
        France.p1_taxBuilding=false;
        France.p1_taxLandmark=false;
        France.p1_taxBuild_mark=false;
        France.p1_willTakeYourMap=false;
        France.p1_willTakeYourMapYes=false;

        //France

        Germany.p1_successContract=false;
        Germany.p1_startOwnTheLand=false;
        Germany.p1_returnTheMapNaming=false;
        Germany.p1_movedOtherPlayerMap=false;
        Germany.p1_taxBuilding=false;
        Germany.p1_taxLandmark=false;
        Germany.p1_taxBuild_mark=false;
        Germany.p1_willTakeYourMap=false;
        Germany.p1_willTakeYourMapYes=false;
        Germany.p1_event=false;

        //Germany

        Russia.p1_successContract=false;
        Russia.p1_startOwnTheLand=false;
        Russia.p1_returnTheMapNaming=false;
        Russia.p1_movedOtherPlayerMap=false;
        Russia.p1_taxBuilding=false;
        Russia.p1_taxLandmark=false;
        Russia.p1_taxBuild_mark=false;
        Russia.p1_willTakeYourMap=false;
        Russia.p1_willTakeYourMapYes=false;
        Russia.p1_event=false;

        //Russia

        USA.p1_successContract=false;
        USA.p1_startOwnTheLand=false;
        USA.p1_returnTheMapNaming=false;
        USA.p1_movedOtherPlayerMap=false;
        USA.p1_taxBuilding=false;
        USA.p1_taxLandmark=false;
        USA.p1_taxBuild_mark=false;
        USA.p1_willTakeYourMap=false;
        USA.p1_willTakeYourMapYes=false;
        USA.p1_event=false;


        //USA

        Canada.p1_successContract=false;
        Canada.p1_startOwnTheLand=false;
        Canada.p1_returnTheMapNaming=false;
        Canada.p1_movedOtherPlayerMap=false;
        Canada.p1_taxBuilding=false;
        Canada.p1_taxLandmark=false;
        Canada.p1_taxBuild_mark=false;
        Canada.p1_willTakeYourMap=false;
        Canada.p1_willTakeYourMapYes=false;


        //Canada

        Mexico.p1_successContract=false;
        Mexico.p1_startOwnTheLand=false;
        Mexico.p1_returnTheMapNaming=false;
        Mexico.p1_movedOtherPlayerMap=false;
        Mexico.p1_taxBuilding=false;
        Mexico.p1_taxLandmark=false;
        Mexico.p1_taxBuild_mark=false;
        Mexico.p1_willTakeYourMap=false;
        Mexico.p1_willTakeYourMapYes=false;
        Mexico.p1_event=false;

        //Mexico

        Italy.p1_successContract=false;
        Italy.p1_startOwnTheLand=false;
        Italy.p1_returnTheMapNaming=false;
        Italy.p1_movedOtherPlayerMap=false;
        Italy.p1_taxBuilding=false;
        Italy.p1_taxLandmark=false;
        Italy.p1_taxBuild_mark=false;
        Italy.p1_willTakeYourMap=false;
        Italy.p1_willTakeYourMapYes=false;
        Italy.p1_event=false;

        //Italy

        Swiss.p1_successContract=false;
        Swiss.p1_startOwnTheLand=false;
        Swiss.p1_returnTheMapNaming=false;
        Swiss.p1_movedOtherPlayerMap=false;
        Swiss.p1_taxBuilding=false;
        Swiss.p1_taxLandmark=false;
        Swiss.p1_taxBuild_mark=false;
        Swiss.p1_willTakeYourMap=false;
        Swiss.p1_willTakeYourMapYes=false;
        Swiss.p1_event=false;

        //Swiss

        Vietnam.p1_successContract=false;
        Vietnam.p1_startOwnTheLand=false;
        Vietnam.p1_returnTheMapNaming=false;
        Vietnam.p1_movedOtherPlayerMap=false;
        Vietnam.p1_taxBuilding=false;
        Vietnam.p1_taxLandmark=false;
        Vietnam.p1_taxBuild_mark=false;
        Vietnam.p1_willTakeYourMap=false;
        Vietnam.p1_willTakeYourMapYes=false;


        //Vietnam

        Egypt.p1_successContract=false;
        Egypt.p1_startOwnTheLand=false;
        Egypt.p1_returnTheMapNaming=false;
        Egypt.p1_movedOtherPlayerMap=false;
        Egypt.p1_taxBuilding=false;
        Egypt.p1_taxLandmark=false;
        Egypt.p1_taxBuild_mark=false;
        Egypt.p1_willTakeYourMap=false;
        Egypt.p1_willTakeYourMapYes=false;

        //Egypt


    }

    public static void p2_false(){

        SuperDiceTime.stop=false;

        Island.p2_lockedIsland=false;
        Island.p2_lockedIslandError=false;
        Island.p2_select1Pass=false;
        Island.p2_select1Fail=false;
        Island.p2_select2Call=false;
        Island.throwDice=false;
        //Island

        Start.p2_placingStart=false;
        Start.p2_selectKorea=false;
        Start.p2_selectJapan=false;
        Start.p2_selectChina=false;
        Start.p2_selectEngland=false;
        Start.p2_selectFrance=false;
        Start.p2_selectGermany=false;
        Start.p2_selectRussia=false;
        Start.p2_selectUSA=false;
        Start.p2_selectCanada=false;
        Start.p2_selectMexico=false;
        Start.p2_selectItaly=false;
        Start.p2_selectSwiss=false;
        Start.p2_selectVietnam=false;
        Start.p2_selectEgypt=false;

        //Start

        p2_turn=false;
        p2_rollingDice=false;
        p2_rollingDice1=false;
        p2_ownTheLand=false;
        p2_placing_taxx2=false;
        p2_france_protesting=false;
        p2_selected_building=false;
        p2_selected_landmark=false;
        p2_returnedTHeMap=false;

        p2_england_event=false;
        p2_england_event_1=false;
        p2_england_event_2=false;
        p2_england_event_3=false;
        p2_england_event_4=false;
        p2_england_event_5=false;
        p2_england_event_6=false;
        p2_england_event_7=false;
        p2_england_event_8=false;

        p2_placing_balloon=false;
        p2_placing_balloonSelected=false;
        p2_moving=false;
        //PlayboardLog


        Player.superDiceStart=false;
        Player.superDiceResult=false;
        //player

        TurnOver.p2_player_index_turnOver=false;
        TurnOver.p2_buyMapReturned_turnOver=false;
        TurnOver.p2_buyMap_turnOver=false;
        TurnOver.p2_dontTakeMyMoney_turnOver=false;
        TurnOver.p2_willTakeYourMap_turnOver=false;
        TurnOver.p2_festivalInChina_turnOver=false;
        TurnOver.p2_ContractCanada_turnOver=false;
        TurnOver.p2_helpPlayer_turnOver=false;
        TurnOver.p2_festivalInItaly_turnOver=false;
        TurnOver.p2_festivalInMexico_turnOver=false;
        TurnOver.p2_festivalRussia_turnOver=false;
        TurnOver.p2_festivalInSwiss_turnOver=false;
        TurnOver.p2_tradeWar_turnOver=false;
        TurnOver.p2_turnOver=false;

        //TurnOver

        Korea.p2_successContract=false;
        Korea.p2_startOwnTheLand=false;
        Korea.p2_returnTheMapNaming=false;
        Korea.p2_movedOtherPlayerMap=false;
        Korea.p2_taxBuilding=false;
        Korea.p2_taxLandmark=false;
        Korea.p2_taxBuild_mark=false;
        Korea.p2_willTakeYourMap=false;
        Korea.p2_willTakeYourMapYes=false;

        //Korea

        Japan.p2_successContract=false;
        Japan.p2_startOwnTheLand=false;
        Japan.p2_returnTheMapNaming=false;
        Japan.p2_movedOtherPlayerMap=false;
        Japan.p2_taxBuilding=false;
        Japan.p2_taxLandmark=false;
        Japan.p2_taxBuild_mark=false;
        Japan.p2_willTakeYourMap=false;
        Japan.p2_willTakeYourMapYes=false;

        //Japan

        China.p2_successContract=false;
        China.p2_startOwnTheLand=false;
        China.p2_returnTheMapNaming=false;
        China.p2_movedOtherPlayerMap=false;
        China.p2_taxBuilding=false;
        China.p2_taxLandmark=false;
        China.p2_taxBuild_mark=false;
        China.p2_willTakeYourMap=false;
        China.p2_willTakeYourMapYes=false;
        China.p2_chinaEvent=false;

        //China

        England.p2_successContract=false;
        England.p2_startOwnTheLand=false;
        England.p2_returnTheMapNaming=false;
        England.p2_movedOtherPlayerMap=false;
        England.p2_taxBuilding=false;
        England.p2_taxLandmark=false;
        England.p2_taxBuild_mark=false;
        England.p2_willTakeYourMap=false;
        England.p2_willTakeYourMapYes=false;


        //England

        France.p2_successContract=false;
        France.p2_startOwnTheLand=false;
        France.p2_returnTheMapNaming=false;
        France.p2_movedOtherPlayerMap=false;
        France.p2_taxBuilding=false;
        France.p2_taxLandmark=false;
        France.p2_taxBuild_mark=false;
        France.p2_willTakeYourMap=false;
        France.p2_willTakeYourMapYes=false;

        //France

        Germany.p2_successContract=false;
        Germany.p2_startOwnTheLand=false;
        Germany.p2_returnTheMapNaming=false;
        Germany.p2_movedOtherPlayerMap=false;
        Germany.p2_taxBuilding=false;
        Germany.p2_taxLandmark=false;
        Germany.p2_taxBuild_mark=false;
        Germany.p2_willTakeYourMap=false;
        Germany.p2_willTakeYourMapYes=false;
        Germany.p2_event=false;

        //Germany

        Russia.p2_successContract=false;
        Russia.p2_startOwnTheLand=false;
        Russia.p2_returnTheMapNaming=false;
        Russia.p2_movedOtherPlayerMap=false;
        Russia.p2_taxBuilding=false;
        Russia.p2_taxLandmark=false;
        Russia.p2_taxBuild_mark=false;
        Russia.p2_willTakeYourMap=false;
        Russia.p2_willTakeYourMapYes=false;
        Russia.p2_event=false;
        //Russia

        USA.p2_successContract=false;
        USA.p2_startOwnTheLand=false;
        USA.p2_returnTheMapNaming=false;
        USA.p2_movedOtherPlayerMap=false;
        USA.p2_taxBuilding=false;
        USA.p2_taxLandmark=false;
        USA.p2_taxBuild_mark=false;
        USA.p2_willTakeYourMap=false;
        USA.p2_willTakeYourMapYes=false;
        USA.p2_event=false;

        //USA

        Canada.p2_successContract=false;
        Canada.p2_startOwnTheLand=false;
        Canada.p2_returnTheMapNaming=false;
        Canada.p2_movedOtherPlayerMap=false;
        Canada.p2_taxBuilding=false;
        Canada.p2_taxLandmark=false;
        Canada.p2_taxBuild_mark=false;
        Canada.p2_willTakeYourMap=false;
        Canada.p2_willTakeYourMapYes=false;


        //Canada

        Mexico.p2_successContract=false;
        Mexico.p2_startOwnTheLand=false;
        Mexico.p2_returnTheMapNaming=false;
        Mexico.p2_movedOtherPlayerMap=false;
        Mexico.p2_taxBuilding=false;
        Mexico.p2_taxLandmark=false;
        Mexico.p2_taxBuild_mark=false;
        Mexico.p2_willTakeYourMap=false;
        Mexico.p2_willTakeYourMapYes=false;
        Mexico.p2_event=false;

        //Mexico

        Italy.p2_successContract=false;
        Italy.p2_startOwnTheLand=false;
        Italy.p2_returnTheMapNaming=false;
        Italy.p2_movedOtherPlayerMap=false;
        Italy.p2_taxBuilding=false;
        Italy.p2_taxLandmark=false;
        Italy.p2_taxBuild_mark=false;
        Italy.p2_willTakeYourMap=false;
        Italy.p2_willTakeYourMapYes=false;
        Italy.p2_event=false;

        //Italy

        Swiss.p2_successContract=false;
        Swiss.p2_startOwnTheLand=false;
        Swiss.p2_returnTheMapNaming=false;
        Swiss.p2_movedOtherPlayerMap=false;
        Swiss.p2_taxBuilding=false;
        Swiss.p2_taxLandmark=false;
        Swiss.p2_taxBuild_mark=false;
        Swiss.p2_willTakeYourMap=false;
        Swiss.p2_willTakeYourMapYes=false;
        Swiss.p2_event=false;

        //Swiss

        Vietnam.p2_successContract=false;
        Vietnam.p2_startOwnTheLand=false;
        Vietnam.p2_returnTheMapNaming=false;
        Vietnam.p2_movedOtherPlayerMap=false;
        Vietnam.p2_taxBuilding=false;
        Vietnam.p2_taxLandmark=false;
        Vietnam.p2_taxBuild_mark=false;
        Vietnam.p2_willTakeYourMap=false;
        Vietnam.p2_willTakeYourMapYes=false;


        //Vietnam

        Egypt.p2_successContract=false;
        Egypt.p2_startOwnTheLand=false;
        Egypt.p2_returnTheMapNaming=false;
        Egypt.p2_movedOtherPlayerMap=false;
        Egypt.p2_taxBuilding=false;
        Egypt.p2_taxLandmark=false;
        Egypt.p2_taxBuild_mark=false;
        Egypt.p2_willTakeYourMap=false;
        Egypt.p2_willTakeYourMapYes=false;

        //Egypt


    }

}//PlayboardLog Class
