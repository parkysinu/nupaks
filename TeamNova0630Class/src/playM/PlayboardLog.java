package playM;

import java.rmi.MarshalException;

public class PlayboardLog {//플레이 보드의 5시 방향에 게임 진행에 필요한 안내 문이 출력되는 메소스들을 모아 놓음

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

    public void roof3rd(){ // xxp님의 차례 입니다! 가 출력되는 메소드



        if(p1_turn){
        System.out.print("1P님의 차례 입니다!");
        }
        else if(p2_turn){
        System.out.print("2P님의 차례 입니다!");
        }
        else {
            System.out.print("");
        }

    }

    public void title3rd(){  //보통 원하는 주사위 숫자가 나오기를 기도 하며 숫자를 눌러 달라는 말이 나오고 무인도,열기구,한국의 고유 이벤트를 진행 해야 하면 다른 글이 출력 된다.
        if(p1_rollingDice){
            if(Player.p1_locked==1){

            }
            else if(Player.p1_balloonLock==1){


            }
            else if(Player.p1_index == 1 && Korea.p1_koreanLock==1 && TimeThread.Season.equals(TT.Winter)){

            }
            else if(Player.p1_locked==0 && Player.p1_balloonLock==0 && Korea.p1_koreanLock==0){

                System.out.print("원하는 숫자를 기도 하며 아무 숫자나 눌러 주세요!");

            }
            else if(p1_moving){
                System.out.print("원하는 숫자를 기도 하며 아무 숫자나 눌러 주세요!");
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

                System.out.print("원하는 숫자를 기도 하며 아무 숫자나 눌러 주세요!");

            }
            else if(p2_moving){
                System.out.print("원하는 숫자를 기도 하며 아무 숫자나 눌러 주세요!");
            }

        }

        if(Player.superDiceStart){
            System.out.print("슈퍼 주사위가 활성화 되었습니다. 게임 화면 아래를 봐주세요!");
        }



    }
    public void structure3rd(){
        Player player = new Player();
       if(p1_rollingDice1){
           System.out.print("1번 주사위를 던져 " + Player.dice1 + "(이)가 나왔습니다.");

       }
       else if(p2_rollingDice1){
           System.out.print("1번 주사위를 던져 " + Player.dice1 + "(이)가 나왔습니다.");
       }
        if(Player.superDiceResult){
            System.out.print("슈퍼 주사위를 굴려서 "+SuperDiceTime.result+"(이)가 나왔습니다.");
        }
      }
    public void cost3rd(){
        Player player = new Player();
        if(p1_rollingDice1){
            System.out.print("2번 주사위를 던져 " + Player.dice2 + "(이)가 나왔습니다.");

        }
        else if(p2_rollingDice1){
            System.out.print("2번 주사위를 던져 " + Player.dice2 + "(이)가 나왔습니다.");
        }

    }
    public void playerIndex3rd(){
        Player player = new Player();
        if(p1_rollingDice1){
            System.out.print("총 " + (Player.dice1 + Player.dice2) + "칸 이동합니다.");

        }
        else if(p2_rollingDice1){
            System.out.print("총 " + (Player.dice1 + Player.dice2) + "칸 이동합니다.");
        }
        if(Player.superDiceResult){
            System.out.print(SuperDiceTime.result+"칸 이동 합니다.");
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

            System.out.print(korea.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Japan.p1_startOwnTheLand && p1_turn){

            System.out.print(japan.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(China.p1_startOwnTheLand && p1_turn){

            System.out.print(china.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(England.p1_startOwnTheLand && p1_turn){

            System.out.print(england.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(France.p1_startOwnTheLand && p1_turn){

            System.out.print(france.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Germany.p1_startOwnTheLand && p1_turn){

            System.out.print(germany.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Russia.p1_startOwnTheLand && p1_turn){

            System.out.print(russia.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(USA.p1_startOwnTheLand && p1_turn){

            System.out.print(usa.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Canada.p1_startOwnTheLand && p1_turn){

            System.out.print(canada.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Mexico.p1_startOwnTheLand && p1_turn){

            System.out.print(mexico.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Italy.p1_startOwnTheLand && p1_turn){

            System.out.print(italy.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Swiss.p1_startOwnTheLand && p1_turn){

            System.out.print(swiss.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Vietnam.p1_startOwnTheLand && p1_turn){

            System.out.print(vietnam.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Egypt.p1_startOwnTheLand && p1_turn){

            System.out.print(egypt.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }


        else if(p1_turn && p1_placing_taxx2){
            System.out.print("기존의 통행료 보다 2배가 올라갔습니다! 조심 하세요!");

        }
        else if(p1_turn && p1_france_protesting){
            System.out.print("현재 프랑스에서 집회 시위 중 이라서 행정 업무를 처리할 수 없습니다.");
        }

        if(p1_turn && p1_returnedTHeMap){
            System.out.print("☆☆☆ p1 is returned!☆☆☆");
        }

        if(p1_turn && Korea.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }
        else if(p1_turn && Japan.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }
        else if(p1_turn && China.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p1_turn && England.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p1_turn && France.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p1_turn && Germany.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p1_turn && Russia.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p1_turn && USA.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p1_turn && Canada.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p1_turn && Mexico.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p1_turn && Italy.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p1_turn && Swiss.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p1_turn && Vietnam.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p1_turn && Egypt.p1_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        if(p1_turn && p1_placing_balloon){

            System.out.print("열기구를 타고 세계여행을 어디든 갈수있습니다!");
        }

        if(p1_turn && Start.p1_placingStart){
            System.out.print("목록을 확인하고 해당하는 업그레이드를 하고싶은 국가를 선택해주세요.");
        }

        if(p1_turn && Island.p1_lockedIsland){
            System.out.print("무인도에 갇혔습니다. :( 어떤 방법으로 탈출을 시도 해 볼까요?");
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

            System.out.print(korea.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Japan.p2_startOwnTheLand && p2_turn){

            System.out.print(japan.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(China.p2_startOwnTheLand  && p2_turn){

            System.out.print(china.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(England.p2_startOwnTheLand  && p2_turn){

            System.out.print(england.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(France.p2_startOwnTheLand  && p2_turn){

            System.out.print(france.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Germany.p2_startOwnTheLand  && p2_turn){

            System.out.print(germany.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Russia.p2_startOwnTheLand && p2_turn){

            System.out.print(russia.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(USA.p2_startOwnTheLand && p2_turn){

            System.out.print(usa.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Canada.p2_startOwnTheLand  && p2_turn){

            System.out.print(canada.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Mexico.p2_startOwnTheLand && p2_turn){

            System.out.print(mexico.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Italy.p2_startOwnTheLand && p2_turn){

            System.out.print(italy.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Swiss.p2_startOwnTheLand  && p2_turn){

            System.out.print(swiss.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Vietnam.p2_startOwnTheLand && p2_turn){

            System.out.print(vietnam.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(Egypt.p2_startOwnTheLand  && p2_turn){

            System.out.print(egypt.travel + "와 계약을 맺은 국가가 아직 존재하지 않습니다.");

        }
        else if(p2_turn && p2_placing_taxx2){
            System.out.print("기존의 통행 료보다 2배가 올라 갔습니다! 조심 하세요!");

        }
        else if(p2_turn && p2_france_protesting){
            System.out.print("현재 프랑스에서 집회 시위 중 이라서 행정 업무를 처리할 수 없습니다.");
        }
        if(p2_turn && p2_returnedTHeMap){
            System.out.print("★★★ p2 is returned!★★★");
        }

        if(p2_turn && Korea.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }
        else if(p2_turn && Japan.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }
        else if(p2_turn && China.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p2_turn && England.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p2_turn && France.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p2_turn && Germany.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p2_turn && Russia.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p2_turn && USA.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p2_turn && Canada.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p2_turn && Mexico.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p2_turn && Italy.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p2_turn && Swiss.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p2_turn && Vietnam.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }

        else if(p2_turn && Egypt.p2_movedOtherPlayerMap){
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
        }
        if(p2_turn && p2_placing_balloon){

            System.out.print("열기구를 타고 세계여행을 어디든 갈 수 있습니다!");
        }
        if(p2_turn && Start.p2_placingStart){
            System.out.print("목록을 확인하고 해당하는 업그레이드를 하고 싶은 국가를 선택 해주세요.");
        }
        if(p2_turn && Island.p2_lockedIsland){
            System.out.print("무인도에 갇혔습니다. :( 어떤 방법으로 탈출을 시도 해 볼까요?");
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

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p1_turn && p1_placing_taxx2){

            System.out.print("훅갈지 모른다구요? :)");
        }
        if(p1_turn && Korea.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ korea.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Japan.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ japan.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && China.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ china.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && England.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ england.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && France.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ france.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Germany.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ germany.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Russia.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ russia.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && USA.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ usa.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Canada.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ canada.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Mexico.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ mexico.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Italy.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ italy.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Swiss.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ swiss.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Vietnam.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ vietnam.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Egypt.p1_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ egypt.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }

        if(p1_turn && Korea.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }
        else if(p1_turn && Japan.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }
        else if(p1_turn && China.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p1_turn && England.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p1_turn && France.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p1_turn && Germany.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p1_turn && Russia.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p1_turn && USA.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p1_turn && Canada.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p1_turn && Mexico.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p1_turn && Italy.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p1_turn && Swiss.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p1_turn && Vietnam.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p1_turn && Egypt.p1_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }
        if(p1_turn && p1_placing_balloon){

            System.out.print("가고 싶은 여행 지를 입력해 주세요");
        }

        if(p1_turn && Island.p1_lockedIsland){
            System.out.print("1.주사위 2개를 굴려 주사위의 눈이 서로 같으면 탈출!");
        }

        if(p1_turn && Egypt.p1_egyptEvent){
            System.out.print("관광 사업 성수기라 관광객들이 많아서 통행 료가 2배가 되었습니다.");
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

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("계약 하시겠습니까? 계약 착수 금은 10억 입니다.");

        }
        else if(p2_turn && p2_placing_taxx2){

            System.out.print("훅갈지 모른다구요? :)");
        }
        if(p2_turn && Korea.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ korea.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && Japan.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ japan.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && China.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ china.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && England.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ england.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && France.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ france.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && Germany.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ germany.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && Russia.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ russia.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && USA.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ usa.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && Canada.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ canada.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && Mexico.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ mexico.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && Italy.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ italy.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && Swiss.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ swiss.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && Vietnam.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ vietnam.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }
        else if(p2_turn && Egypt.p2_returnTheMapNaming){
            System.out.print("☆☆☆재방문으로 인해 "+ egypt.travel+"에 대한 독점 권을 얻었습니다☆☆☆");
        }


        if(p2_turn && Korea.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }
        else if(p2_turn && Japan.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }
        else if(p2_turn && China.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p2_turn && England.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p2_turn && France.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p2_turn && Germany.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p2_turn && Russia.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p2_turn && USA.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p2_turn && Canada.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p2_turn && Mexico.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p2_turn && Italy.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p2_turn && Swiss.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p2_turn && Vietnam.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        else if(p2_turn && Egypt.p2_movedOtherPlayerMap){
            System.out.print("돈 내놔!");
        }

        if(p2_turn && p2_placing_balloon){

            System.out.print("가고싶은 여행지를 입력해주세요");
        }
        if(p2_turn && Island.p2_lockedIsland){
            System.out.print("1.주사위 2개를 굴려 주사위의 눈이 서로 같으면 탈출!");
        }
        if(p2_turn && Egypt.p2_egyptEvent){
            System.out.print("관광 사업 성수기라 관광객들이 많아서 통행 료가 2배가 되었습니다.");
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

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }


        if(p1_turn && Korea.p1_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Korea.buildingCost+"억 이나 해!");
        }
        else if(p1_turn && Japan.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+Japan.buildingCost+"억 이나 해!");
        }
        else if(p1_turn && China.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+China.buildingCost+"억 이나 해!");
        }

        else if(p1_turn && England.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+England.buildingCost+"억 이나 해!");
        }

        else if(p1_turn && France.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+France.buildingCost+"억 이나 해!");
        }

        else if(p1_turn && Germany.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+Germany.buildingCost+"억 이나 해!");
        }

        else if(p1_turn && Russia.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+Russia.buildingCost+"억 이나 해!");
        }

        else if(p1_turn && USA.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+USA.buildingCost+"억 이나 해!");
        }

        else if(p1_turn && Canada.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+Canada.buildingCost+"억 이나 해!");
        }

        else if(p1_turn && Mexico.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+Mexico.buildingCost+"억 이나 해!");
        }

        else if(p1_turn && Italy.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+Italy.buildingCost+"억 이나 해!");
        }

        else if(p1_turn && Swiss.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+Swiss.buildingCost+"억 이나 해!");
        }

        else if(p1_turn && Vietnam.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+Vietnam.buildingCost+"억 이나 해!");
        }

        else if(p1_turn && Egypt.p1_taxBuilding){
           System.out.print("도둑 놈들 어떻게 통행 료가 "+Egypt.buildingCost+"억 이나 해!");
        }


        if(p1_turn && Korea.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Korea.landmarkCost+"억 이나 해!");
        }
        else if(p1_turn && Japan.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Japan.landmarkCost+"억 이나 해!");
        }
        else if(p1_turn && China.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+China.landmarkCost+"억 이나 해!");
        }

        else if(p1_turn && England.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+England.landmarkCost+"억 이나 해!");
        }

        else if(p1_turn && France.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+France.landmarkCost+"억 이나 해!");
        }

        else if(p1_turn && Germany.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Germany.landmarkCost+"억 이나 해!");
        }

        else if(p1_turn && Russia.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Russia.landmarkCost+"억 이나 해!");
        }

        else if(p1_turn && USA.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+USA.landmarkCost+"억 이나 해!");
        }

        else if(p1_turn && Canada.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Canada.landmarkCost+"억 이나 해!");
        }

        else if(p1_turn && Mexico.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Mexico.landmarkCost+"억 이나 해!");
        }

        else if(p1_turn && Italy.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Italy.landmarkCost+"억 이나 해!");
        }

        else if(p1_turn && Swiss.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Swiss.landmarkCost+"억 이나 해!");
        }

        else if(p1_turn && Vietnam.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Vietnam.landmarkCost+"억 이나 해!");
        }

        else if(p1_turn && Egypt.p1_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Egypt.landmarkCost+"억 이나 해!");
        }


        if(p1_turn && Korea.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Korea.build_markCost+"억 이나 해!");
        }
        else if(p1_turn && Japan.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Japan.build_markCost+"억 이나 해!");
        }
        else if(p1_turn && China.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+China.build_markCost+"억 이나 해!");
        }

        else if(p1_turn && England.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+England.build_markCost+"억 이나 해!");
        }

        else if(p1_turn && France.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+France.build_markCost+"억 이나 해!");
        }

        else if(p1_turn && Germany.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Germany.build_markCost+"억 이나 해!");
        }

        else if(p1_turn && Russia.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Russia.build_markCost+"억 이나 해!");
        }

        else if(p1_turn && USA.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+USA.build_markCost+"억 이나 해!");
        }

        else if(p1_turn && Canada.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Canada.build_markCost+"억 이나 해!");
        }

        else if(p1_turn && Mexico.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Mexico.build_markCost+"억 이나 해!");
        }

        else if(p1_turn && Italy.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Italy.build_markCost+"억 이나 해!");
        }

        else if(p1_turn && Swiss.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Swiss.build_markCost+"억 이나 해!");
        }

        else if(p1_turn && Vietnam.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Vietnam.build_markCost+"억 이나 해!");
        }

        else if(p1_turn && Egypt.p1_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Egypt.build_markCost+"억 이나 해!");
        }

        if(p1_turn && p1_placing_balloon){
            System.out.print("오타를 입력하면 두번의 '기회'는 없습니다 :)");
        }
        if(p1_turn && Island.p1_lockedIsland){
          System.out.print("2.30억 비용을 내고 무인도 구조 전문 업체 'don't worry'를 부른다. ");
        }
        if(p1_turn && Egypt.p1_egyptEvent) {
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
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

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("75%의 확률로 빌딩이 건설되고, 25%의 확률로 랜드마크가 건설됩니다. :)");

        }


        if(p2_turn && Korea.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Korea.buildingCost+"억 이나 해!");
        }
        else if(p2_turn && Japan.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Japan.buildingCost+"억 이나 해!");
        }
        else if(p2_turn && China.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+China.buildingCost+"억 이나 해!");
        }

        else if(p2_turn && England.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+England.buildingCost+"억 이나 해!");
        }

        else if(p2_turn && France.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+France.buildingCost+"억 이나 해!");
        }

        else if(p2_turn && Germany.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Germany.buildingCost+"억 이나 해!");
        }

        else if(p2_turn && Russia.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Russia.buildingCost+"억 이나 해!");
        }

        else if(p2_turn && USA.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+USA.buildingCost+"억 이나 해!");
        }

        else if(p2_turn && Canada.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Canada.buildingCost+"억 이나 해!");
        }

        else if(p2_turn && Mexico.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Mexico.buildingCost+"억 이나 해!");
        }

        else if(p2_turn && Italy.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Italy.buildingCost+"억 이나 해!");
        }

        else if(p2_turn && Swiss.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Swiss.buildingCost+"억 이나 해!");
        }

        else if(p2_turn && Vietnam.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Vietnam.buildingCost+"억 이나 해!");
        }

        else if(p2_turn && Egypt.p2_taxBuilding){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Egypt.buildingCost+"억 이나 해!");
        }


        if(p2_turn && Korea.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Korea.landmarkCost+"억 이나 해!");
        }
        else if(p2_turn && Japan.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Japan.landmarkCost+"억 이나 해!");
        }
        else if(p2_turn && China.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+China.landmarkCost+"억 이나 해!");
        }

        else if(p2_turn && England.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+England.landmarkCost+"억 이나 해!");
        }

        else if(p2_turn && France.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+France.landmarkCost+"억 이나 해!");
        }

        else if(p2_turn && Germany.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Germany.landmarkCost+"억 이나 해!");
        }

        else if(p2_turn && Russia.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Russia.landmarkCost+"억 이나 해!");
        }

        else if(p2_turn && USA.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+USA.landmarkCost+"억 이나 해!");
        }

        else if(p2_turn && Canada.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Canada.landmarkCost+"억 이나 해!");
        }

        else if(p2_turn && Mexico.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Mexico.landmarkCost+"억 이나 해!");
        }

        else if(p2_turn && Italy.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Italy.landmarkCost+"억 이나 해!");
        }

        else if(p2_turn && Swiss.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Swiss.landmarkCost+"억 이나 해!");
        }

        else if(p2_turn && Vietnam.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Vietnam.landmarkCost+"억 이나 해!");
        }

        else if(p2_turn && Egypt.p2_taxLandmark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Egypt.landmarkCost+"억 이나 해!");
        }


        if(p2_turn && Korea.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Korea.build_markCost+"억 이나 해!");
        }
        else if(p2_turn && Japan.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Japan.build_markCost+"억 이나 해!");
        }
        else if(p2_turn && China.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+China.build_markCost+"억 이나 해!");
        }

        else if(p2_turn && England.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+England.build_markCost+"억 이나 해!");
        }

        else if(p2_turn && France.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+France.build_markCost+"억 이나 해!");
        }

        else if(p2_turn && Germany.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Germany.build_markCost+"억 이나 해!");
        }

        else if(p2_turn && Russia.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Russia.build_markCost+"억 이나 해!");
        }

        else if(p2_turn && USA.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+USA.build_markCost+"억 이나 해!");
        }

        else if(p2_turn && Canada.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Canada.build_markCost+"억 이나 해!");
        }

        else if(p2_turn && Mexico.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Mexico.build_markCost+"억 이나 해!");
        }

        else if(p2_turn && Italy.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Italy.build_markCost+"억 이나 해!");
        }

        else if(p2_turn && Swiss.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Swiss.build_markCost+"억 이나 해!");
        }

        else if(p2_turn && Vietnam.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Vietnam.build_markCost+"억 이나 해!");
        }

        else if(p2_turn && Egypt.p2_taxBuild_mark){
            System.out.print("도둑 놈들 어떻게 통행 료가 "+Egypt.build_markCost+"억 이나 해!");
        }
        if(p2_turn && p2_placing_balloon){
            System.out.print("오타를 입력하면 두번의 '기회'는 없습니다 :)");
        }
        if(p2_turn && Island.p2_lockedIsland){
            System.out.print("2.30억 비용을 내고 무인도 구조 전문 업체 'don't worry'를 부른다. ");
        }

        if(p2_turn && Egypt.p2_egyptEvent) {
            System.out.print("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
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

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p1_ownTheLand && p1_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }

        if(p1_turn && Korea.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ korea.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }

        else if(p1_turn && Japan.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ japan.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }

        else if(p1_turn && China.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ china.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p1_turn && England.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ england.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p1_turn && France.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ france.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p1_turn && Germany.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ germany.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p1_turn && Russia.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ russia.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p1_turn && USA.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ usa.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p1_turn && Canada.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ canada.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ mexico.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p1_turn && Italy.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ italy.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ swiss.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ vietnam.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ egypt.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");

        }

        Balloon balloon = new Balloon();

        if(p1_turn && p1_placing_balloonSelected){

            System.out.print(balloon.where+"로 이동 합니다!");

        }

        if(p1_turn && Island.p1_lockedIslandError){
            System.out.print("잘못 입력했습니다. 이 방법 말고는 없어요! 선택해 주세요.");
        }
        if(p1_turn && Egypt.p1_egyptEvent){
            System.out.print("돈내놔!");
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

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }
        else if(p2_ownTheLand && p2_turn){

            System.out.print("'ㅇㅇ','dd','DD'을(를)  입력하면 구매가 되고 다른 숫자를 입력하면 구매가 되지않습니다.");

        }

        if(p2_turn && Korea.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ korea.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }

        else if(p2_turn && Japan.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ japan.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }

        else if(p2_turn && China.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ china.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p2_turn && England.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ england.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p2_turn && France.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ france.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p2_turn && Germany.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ germany.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p2_turn && Russia.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ russia.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p2_turn && USA.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ usa.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p2_turn && Canada.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ canada.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ mexico.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p2_turn && Italy.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ italy.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ swiss.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ vietnam.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMap){
            System.out.print("아직 상대 플레이어가 "+ egypt.travel+"와 독점 계약을 맺지 않아서 구매할 수 있습니다.");

        }
        Balloon balloon = new Balloon();
        if(p2_turn && p2_placing_balloonSelected){

            System.out.print(balloon.where+"로 이동 합니다!");

        }

        if(p2_turn && Island.p2_lockedIslandError){
            System.out.print("잘못 입력했습니다. 이 방법 말고는 없어요! 선택해 주세요.");
        }
        if(p2_turn && Egypt.p2_egyptEvent){
            System.out.print("돈내놔!");
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

            System.out.print("☆☆☆" + korea.travel + "와 계약 했습니다☆☆☆");

        }
        else if(Japan.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + japan.travel + "와 계약 했습니다☆☆☆");

        }
        else if(China.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + china.travel + "와 계약 했습니다☆☆☆");

        }
        else if(England.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + england.travel + "와 계약 했습니다☆☆☆");

        }
        else if(France.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + france.travel + "와 계약 했습니다☆☆☆");

        }
        else if(Germany.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + germany.travel + "와 계약 했습니다☆☆☆");

        }
        else if(Russia.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + russia.travel + "와 계약 했습니다☆☆☆");

        }
        else if(USA.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + usa.travel + "와 계약 했습니다☆☆☆");

        }
        else if(Canada.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + canada.travel + "와 계약 했습니다☆☆☆");

        }
        else if(Mexico.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + mexico.travel + "와 계약 했습니다☆☆☆");

        }
        else if(Italy.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + italy.travel + "와 계약 했습니다☆☆☆");

        }
        else if(Swiss.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + swiss.travel + "와 계약 했습니다☆☆☆");

        }
        else if(Vietnam.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + vietnam.travel + "와 계약 했습니다☆☆☆");

        }
        else if(Egypt.p1_successContract && p1_turn && p1_ownTheLand){

            System.out.print("☆☆☆" + egypt.travel + "와 계약 했습니다☆☆☆");

        }

        if(p1_turn && Korea.p1_willTakeYourMap){
            System.out.print(korea.travel+"을(를) 구매 하시겠습니까?");
        }

        else if(p1_turn && Japan.p1_willTakeYourMap){
            System.out.print(japan.travel+"을(를) 구매 하시겠습니까?");
        }

        else if(p1_turn && China.p1_willTakeYourMap){
            System.out.print(china.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p1_turn && England.p1_willTakeYourMap){
            System.out.print(england.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p1_turn && France.p1_willTakeYourMap){
            System.out.print(france.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p1_turn && Germany.p1_willTakeYourMap){
            System.out.print(germany.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p1_turn && Russia.p1_willTakeYourMap){
            System.out.print(russia.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p1_turn && USA.p1_willTakeYourMap){
            System.out.print(usa.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p1_turn && Canada.p1_willTakeYourMap){
            System.out.print(canada.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMap){
            System.out.print(mexico.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p1_turn && Italy.p1_willTakeYourMap){
            System.out.print(italy.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMap){
            System.out.print(swiss.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMap){
            System.out.print(vietnam.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMap){
            System.out.print(egypt.travel+"을(를) 구매 하시겠습니까?");

        }


        if(p1_turn && Start.p1_selectKorea){
            System.out.print("☆☆☆"+korea.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectJapan){
            System.out.print("☆☆☆"+japan.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectChina){
            System.out.print("☆☆☆"+china.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectEngland){
            System.out.print("☆☆☆"+england.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectFrance){
            System.out.print("☆☆☆"+france.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectGermany){
            System.out.print("☆☆☆"+germany.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectRussia){
            System.out.print("☆☆☆"+russia.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectUSA){
            System.out.print("☆☆☆"+usa.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectCanada){
            System.out.print("☆☆☆"+canada.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectMexico){
            System.out.print("☆☆☆"+mexico.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectItaly){
            System.out.print("☆☆☆"+italy.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectSwiss){
            System.out.print("☆☆☆"+swiss.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectVietnam){
            System.out.print("☆☆☆"+vietnam.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        else if(p1_turn && Start.p1_selectEgypt){
            System.out.print("☆☆☆"+egypt.travel+"에 대한 독점권을 얻었습니다☆☆☆");
        }
        if(p1_turn && Island.p1_select1Pass) {
            System.out.print("주사위를 굴렸는데 눈이 같네? 이건 하늘의 계시야!");
        }
        if(p1_turn && Island.p1_select1Fail) {
            System.out.print("주사위 눈이 서로 다르네.. 그래도 배와 비행기가 세상에 얼마나 많은데 한대 쯤은 지나 가겠지");
        }

        if(p1_turn && Island.p1_select2Call){
            System.out.print("안녕하세요 구조 전문 업체 'don't worry' 입니다. 고객님의 안전을 위해서 빠르게 왔습니다.");
        }

        if(p1_turn && Egypt.p1_egyptEvent){
            System.out.print("통행료가 왜 2배나 올라가! 안돼!!");
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

            System.out.print("★★★" + korea.travel + "와 계약 했습니다★★★");

        }
        else if(Japan.p2_successContract && p2_turn){

            System.out.print("★★★" + japan.travel + "와 계약 했습니다★★★");

        }
        else if(China.p2_successContract && p2_turn){

            System.out.print("★★★" + china.travel + "와 계약 했습니다★★★");

        }
        else if(England.p2_successContract && p2_turn){

            System.out.print("★★★" + england.travel + "와 계약 했습니다★★★");

        }
        else if(France.p2_successContract && p2_turn){

            System.out.print("★★★" + france.travel + "와 계약 했습니다★★★");

        }
        else if(Germany.p2_successContract && p2_turn){

            System.out.print("★★★" + germany.travel + "와 계약 했습니다★★★");

        }
        else if(Russia.p2_successContract && p2_turn){

            System.out.print("★★★" + russia.travel + "와 계약 했습니다★★★");

        }
        else if(USA.p2_successContract && p2_turn){

            System.out.print("★★★" + usa.travel + "와 계약 했습니다★★★");

        }
        else if(Canada.p2_successContract && p2_turn){

            System.out.print("★★★" + canada.travel + "와 계약 했습니다★★★");

        }
        else if(Mexico.p2_successContract && p2_turn){

            System.out.print("★★★" + mexico.travel + "와 계약 했습니다★★★");

        }
        else if(Italy.p2_successContract && p2_turn){

            System.out.print("★★★" + italy.travel + "와 계약 했습니다★★★");

        }
        else if(Swiss.p2_successContract && p2_turn){

            System.out.print("★★★" + swiss.travel + "와 계약 했습니다★★★");

        }
        else if(Vietnam.p2_successContract && p2_turn){

            System.out.print("★★★" + vietnam.travel + "와 계약 했습니다★★★");

        }
        else if(Egypt.p2_successContract && p2_turn){

            System.out.print("★★★" + egypt.travel + "와 계약 했습니다★★★");

        }


        if(p2_turn && Korea.p2_willTakeYourMap){
            System.out.print(korea.travel+"을(를) 구매 하시겠습니까?");
        }

        else if(p2_turn && Japan.p2_willTakeYourMap){
            System.out.print(japan.travel+"을(를) 구매 하시겠습니까?");
        }

        else if(p2_turn && China.p2_willTakeYourMap){
            System.out.print(china.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p2_turn && England.p2_willTakeYourMap){
            System.out.print(england.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p2_turn && France.p2_willTakeYourMap){
            System.out.print(france.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p2_turn && Germany.p2_willTakeYourMap){
            System.out.print(germany.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p2_turn && Russia.p2_willTakeYourMap){
            System.out.print(russia.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p2_turn && USA.p2_willTakeYourMap){
            System.out.print(usa.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p2_turn && Canada.p2_willTakeYourMap){
            System.out.print(canada.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMap){
            System.out.print(mexico.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p2_turn && Italy.p2_willTakeYourMap){
            System.out.print(italy.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMap){
            System.out.print(swiss.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMap){
            System.out.print(vietnam.travel+"을(를) 구매 하시겠습니까?");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMap){
            System.out.print(egypt.travel+"을(를) 구매 하시겠습니까?");

        }


        if(p2_turn && Start.p2_selectKorea){
            System.out.print("★★★"+korea.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectJapan){
            System.out.print("★★★"+japan.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectChina){
            System.out.print("★★★"+china.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectEngland){
            System.out.print("★★★"+england.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectFrance){
            System.out.print("★★★"+france.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectGermany){
            System.out.print("★★★"+germany.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectRussia){
            System.out.print("★★★"+russia.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectUSA){
            System.out.print("★★★"+usa.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectCanada){
            System.out.print("★★★"+canada.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectMexico){
            System.out.print("★★★"+mexico.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectItaly){
            System.out.print("★★★"+italy.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectSwiss){
            System.out.print("★★★"+swiss.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectVietnam){
            System.out.print("★★★"+vietnam.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        else if(p2_turn && Start.p2_selectEgypt){
            System.out.print("★★★"+egypt.travel+"에 대한 독점권을 얻었습니다★★★");
        }
        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("주사위를 굴렸는데 눈이 같네? 이건 하늘의 계시야!");
        }
        if(p2_turn && Island.p2_select1Fail) {
            System.out.print("주사위 눈이 서로 다르네.. 그래도 배와 비행기가 세상에 얼마나 많은데 한대 쯤은 지나 가겠지");
        }

        if(p2_turn && Island.p2_select2Call){
            System.out.print("안녕하세요 구조 전문 업체 'don't worry' 입니다. 고객님의 안전을 위해서 빠르게 왔습니다.");
        }

        if(p2_turn && Egypt.p2_egyptEvent){
            System.out.print("통행료가 왜 2배나 올라가! 안돼!!");
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
            System.out.print("빌딩을 건설 했습니다 :)");
        }
        else if(p1_turn && p1_selected_landmark){
            System.out.print("랜드마크를 건설 했습니다 :)");
        }


        if(p1_turn && Korea.p1_willTakeYourMap){
            System.out.print("가격은 "+(Korea.buildingCost*1.1)+"억 입니다.");
        }

        else if(p1_turn && Japan.p1_willTakeYourMap){
            System.out.print("가격은 "+(Japan.buildingCost*1.1)+"억 입니다.");
        }

        else if(p1_turn && China.p1_willTakeYourMap){
            System.out.print("가격은 "+(China.buildingCost*1.1)+"억 입니다.");
        }


        else if(p1_turn && England.p1_willTakeYourMap){
            System.out.print("가격은 "+(England.buildingCost*1.1)+"억 입니다.");
        }


        else if(p1_turn && France.p1_willTakeYourMap){
            System.out.print("가격은 "+(France.buildingCost*1.1)+"억 입니다.");
        }


        else if(p1_turn && Germany.p1_willTakeYourMap){
            System.out.print("가격은 "+(Germany.buildingCost*1.1)+"억 입니다.");
        }


        else if(p1_turn && Russia.p1_willTakeYourMap){
            System.out.print("가격은 "+(Russia.buildingCost*1.1)+"억 입니다.");
        }


        else if(p1_turn && USA.p1_willTakeYourMap){
            System.out.print("가격은 "+(USA.buildingCost*1.1)+"억 입니다.");
        }


        else if(p1_turn && Canada.p1_willTakeYourMap){
            System.out.print("가격은 "+(Canada.buildingCost*1.1)+"억 입니다.");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMap){
            System.out.print("가격은 "+(Mexico.buildingCost*1.1)+"억 입니다.");
        }


        else if(p1_turn && Italy.p1_willTakeYourMap){
            System.out.print("가격은 "+(Italy.buildingCost*1.1)+"억 입니다.");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMap){
            System.out.print("가격은 "+(Swiss.buildingCost*1.1)+"억 입니다.");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMap){
            System.out.print("가격은 "+(Vietnam.buildingCost*1.1)+"억 입니다.");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMap){
            System.out.print("가격은 "+(Egypt.buildingCost*1.1)+"억 입니다.");

        }

        if(p1_turn && Island.p1_select1Pass) {
            System.out.print("멀리서 뿌우우우우 소리가 들린다");
        }
        if(p1_turn && Island.p1_select1Fail){
            System.out.print(".....어떤 것도 오지 않는다");
        }

        if(p1_turn && Island.p1_select2Call){
            System.out.print("감사 합니다");
        }

        if(p1_turn && Egypt.p1_egyptEventBuilding){
            System.out.println("도둑 놈들 어떻게 통행 료가 "+Egypt.buildingCost+"억이나 해!");
        }
        else if(p1_turn && Egypt.p1_egyptEventLandmark){
            System.out.println("도둑 놈들 어떻게 통행 료가 "+Egypt.landmarkCost+"억이나 해!");
        }
        else if(p1_turn && Egypt.p1_egyptEventBuild_mark){
            System.out.println("도둑 놈들 어떻게 통행 료가 "+Egypt.build_markCost+"억이나 해!");
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
            System.out.print("빌딩을 건설 했습니다 :)");
        }
        else if(p2_turn && p2_selected_landmark){
            System.out.print("랜드마크를 건설 했습니다 :)");
        }




        if(p2_turn && Korea.p2_willTakeYourMap){
            System.out.print("가격은 "+(Korea.buildingCost*1.1)+"억 입니다.");
        }

        else if(p2_turn && Japan.p2_willTakeYourMap){
            System.out.print("가격은 "+(Japan.buildingCost*1.1)+"억 입니다.");
        }

        else if(p2_turn && China.p2_willTakeYourMap){
            System.out.print("가격은 "+(China.buildingCost*1.1)+"억 입니다.");
        }


        else if(p2_turn && England.p2_willTakeYourMap){
            System.out.print("가격은 "+(England.buildingCost*1.1)+"억 입니다.");
        }


        else if(p2_turn && France.p2_willTakeYourMap){
            System.out.print("가격은 "+(France.buildingCost*1.1)+"억 입니다.");
        }


        else if(p2_turn && Germany.p2_willTakeYourMap){
            System.out.print("가격은 "+(Germany.buildingCost*1.1)+"억 입니다.");
        }


        else if(p2_turn && Russia.p2_willTakeYourMap){
            System.out.print("가격은 "+(Russia.buildingCost*1.1)+"억 입니다.");
        }


        else if(p2_turn && USA.p2_willTakeYourMap){
            System.out.print("가격은 "+(USA.buildingCost*1.1)+"억 입니다.");
        }


        else if(p2_turn && Canada.p2_willTakeYourMap){
            System.out.print("가격은 "+(Canada.buildingCost*1.1)+"억 입니다.");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMap){
            System.out.print("가격은 "+(Mexico.buildingCost*1.1)+"억 입니다.");
        }


        else if(p2_turn && Italy.p2_willTakeYourMap){
            System.out.print("가격은 "+(Italy.buildingCost*1.1)+"억 입니다.");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMap){
            System.out.print("가격은 "+(Swiss.buildingCost*1.1)+"억 입니다.");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMap){
            System.out.print("가격은 "+(Vietnam.buildingCost*1.1)+"억 입니다.");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMap){
            System.out.print("가격은 "+(Egypt.buildingCost*1.1)+"억 입니다.");

        }
        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("멀리서 뿌우우우우 소리가 들린다");
        }
        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("어? 배가 지나 간다 여기 에요 여기!");
        }
        if(p2_turn && Island.p2_select1Fail){
            System.out.print(".....어떤 것도 오지 않는다");
        }
        if(p2_turn && Island.p2_select2Call){
            System.out.print("감사 합니다");
        }
        if(p2_turn && Egypt.p2_egyptEventBuilding){
            System.out.println("도둑 놈들 어떻게 통행 료가 "+Egypt.buildingCost+"억이나 해!");
        }
        else if(p2_turn && Egypt.p2_egyptEventLandmark){
            System.out.println("도둑 놈들 어떻게 통행 료가 "+Egypt.landmarkCost+"억이나 해!");
        }
        else if(p2_turn && Egypt.p2_egyptEventBuild_mark){
            System.out.println("도둑 놈들 어떻게 통행 료가 "+Egypt.build_markCost+"억이나 해!");
        }

    }

    public void floor2nd_p1(){

        if(p1_turn && p1_england_event){
            System.out.print("'dd','DD','ㅇㅇ' 중 하나를 입력 하면 영국이 플레이어와 캐나다가 계약을 할수 있게 도와 줍니다.");
        }

        if(p1_turn && Korea.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }

        else if(p1_turn && Japan.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }

        else if(p1_turn && China.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p1_turn && England.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p1_turn && France.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p1_turn && Germany.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p1_turn && Russia.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p1_turn && USA.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p1_turn && Canada.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p1_turn && Italy.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");

        }
        if(p1_turn && Island.p1_select1Pass) {
            System.out.print("어? 배가 지나 간다 여기 에요 여기!");
        }

        if(p1_turn && Island.p1_select2Call){
            System.out.print("서비스 이용료는 30억 입니다.");
        }

        if(p1_turn && p1_england_event_5){
            System.out.print("상대 플레이어가 해당 국가와 계약을 하고 있지만 위약금을 지불 하고 계약을 맺을수 있습니다. 하시겠습니까?");
        }

    }

    public void floor2nd_p2(){
        if(p2_turn && p2_england_event){
            System.out.print("'dd','DD','ㅇㅇ' 중 하나를 입력 하면 영국이 플레이어와 캐나다가 계약을 할수 있게 도와 줍니다.");
        }

        if(p2_turn && Korea.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }

        else if(p2_turn && Japan.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }

        else if(p2_turn && China.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p2_turn && England.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p2_turn && France.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p2_turn && Germany.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p2_turn && Russia.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p2_turn && USA.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p2_turn && Canada.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p2_turn && Italy.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMap){
            System.out.print("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");

        }

        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("어? 배가 지나 간다 여기 에요 여기!");
        }

        if(p2_turn && Island.p2_select2Call){
            System.out.print("서비스 이용료는 30억 입니다.");
        }
        if(p2_turn && p2_england_event_5){
            System.out.print("상대 플레이어가 해당 국가와 계약을 하고 있지만 위약금을 지불 하고 계약을 맺을수 있습니다. 하시겠습니까?");
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
            System.out.print("수락을 해도 10%의 확률로 계약이 성립 됩니다.");
        }
        if(p1_turn && Korea.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }

        else if(p1_turn && Japan.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }

        else if(p1_turn && China.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p1_turn && England.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p1_turn && France.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p1_turn && Germany.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p1_turn && Russia.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p1_turn && USA.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p1_turn && Canada.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p1_turn && Italy.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");

        }

        if(p1_turn && Island.p1_select1Pass) {
            System.out.print("휴 살았다");
        }


        if(p1_turn && Island.p1_select2Call){
            System.out.print("너무 비싸..");
        }

        if (p1_turn && p1_england_event_5) {

            System.out.print("계약 착수 금이 18억 소모 됩니다. 계속 하시겠 습니까?");
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
            System.out.print("수락을 해도 10%의 확률로 계약이 성립 됩니다.");
        }


        if(p2_turn && Korea.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }

        else if(p2_turn && Japan.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }

        else if(p2_turn && China.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p2_turn && England.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p2_turn && France.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p2_turn && Germany.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p2_turn && Russia.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p2_turn && USA.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p2_turn && Canada.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p2_turn && Italy.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMap){
            System.out.print("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");

        }

        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("휴 살았다");
        }

        if(p2_turn && Island.p2_select2Call){
            System.out.print("너무 비싸..");
        }
        if (p2_turn && p2_england_event_5) {

            System.out.print("계약 착수 금이 18억 소모 됩니다. 계속 하시겠 습니까?");
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
            System.out.print(korea.travel + "을(를) 구매했습니다.");
        }
        else if(p1_turn && Japan.p1_willTakeYourMapYes){
            System.out.print(japan.travel + "을(를) 구매했습니다.");
        }

        else if(p1_turn && China.p1_willTakeYourMapYes){
            System.out.print(china.travel + "을(를) 구매했습니다.");
        }

        else if(p1_turn && England.p1_willTakeYourMapYes){
            System.out.print(england.travel + "을(를) 구매했습니다.");
        }

        else if(p1_turn && France.p1_willTakeYourMapYes){
            System.out.print(france.travel + "을(를) 구매했습니다.");
        }


        else if(p1_turn && Germany.p1_willTakeYourMapYes){
            System.out.print(germany.travel + "을(를) 구매했습니다.");
        }


        else if(p1_turn && Russia.p1_willTakeYourMapYes){
            System.out.print(russia.travel + "을(를) 구매했습니다.");
        }


        else if(p1_turn && USA.p1_willTakeYourMapYes){
            System.out.print(usa.travel + "을(를) 구매했습니다.");
        }


        else if(p1_turn && Canada.p1_willTakeYourMapYes){
            System.out.print(canada.travel + "을(를) 구매했습니다.");
        }


        else if(p1_turn && Mexico.p1_willTakeYourMapYes){
            System.out.print(mexico.travel + "을(를) 구매했습니다.");
        }


        else if(p1_turn && Italy.p1_willTakeYourMapYes){
            System.out.print(italy.travel + "을(를) 구매했습니다.");
        }


        else if(p1_turn && Swiss.p1_willTakeYourMapYes){
            System.out.print(swiss.travel + "을(를) 구매했습니다.");
        }


        else if(p1_turn && Vietnam.p1_willTakeYourMapYes){
            System.out.print(vietnam.travel + "을(를) 구매했습니다.");
        }


        else if(p1_turn && Egypt.p1_willTakeYourMapYes){
            System.out.print(egypt.travel + "을(를) 구매했습니다.");
        }

        if(p1_turn && Island.p1_select1Pass) {
            System.out.print("경)무인도 탈출에 성공 했습니다(축");
        }
        if(p1_turn && Island.p1_select2Call) {
            System.out.print("☆☆☆당신의 현금이 30억 감소 되었습니다☆☆☆");
        }
        if(p1_turn && p1_england_event_3){
            System.out.print("☆☆☆캐나다와 계약 했습니다☆☆☆");
        }

        if (p1_turn && p1_england_event_5) {

            System.out.print("'dd','DD','ㅇㅇ' 중 하나를 입력 하면 계약이 성사 됩니다.");
        }
        if(p1_turn && p1_england_event_8){
            System.out.print("캐나다와의 계약을 실패 했습니다.");
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
            System.out.print(korea.travel + "을(를) 구매했습니다.");
        }
        else if(p2_turn && Japan.p2_willTakeYourMapYes){
            System.out.print(japan.travel + "을(를) 구매했습니다.");
        }

        else if(p2_turn && China.p2_willTakeYourMapYes){
            System.out.print(china.travel + "을(를) 구매했습니다.");
        }

        else if(p2_turn && England.p2_willTakeYourMapYes){
            System.out.print(england.travel + "을(를) 구매했습니다.");
        }

        else if(p2_turn && France.p2_willTakeYourMapYes){
            System.out.print(france.travel + "을(를) 구매했습니다.");
        }


        else if(p2_turn && Germany.p2_willTakeYourMapYes){
            System.out.print(germany.travel + "을(를) 구매했습니다.");
        }


        else if(p2_turn && Russia.p2_willTakeYourMapYes){
            System.out.print(russia.travel + "을(를) 구매했습니다.");
        }


        else if(p2_turn && USA.p2_willTakeYourMapYes){
            System.out.print(usa.travel + "을(를) 구매했습니다.");
        }


        else if(p2_turn && Canada.p2_willTakeYourMapYes){
            System.out.print(canada.travel + "을(를) 구매했습니다.");
        }


        else if(p2_turn && Mexico.p2_willTakeYourMapYes){
            System.out.print(mexico.travel + "을(를) 구매했습니다.");
        }


        else if(p2_turn && Italy.p2_willTakeYourMapYes){
            System.out.print(italy.travel + "을(를) 구매했습니다.");
        }


        else if(p2_turn && Swiss.p2_willTakeYourMapYes){
            System.out.print(swiss.travel + "을(를) 구매했습니다.");
        }


        else if(p2_turn && Vietnam.p2_willTakeYourMapYes){
            System.out.print(vietnam.travel + "을(를) 구매했습니다.");
        }


        else if(p2_turn && Egypt.p2_willTakeYourMapYes){
            System.out.print(egypt.travel + "을(를) 구매했습니다.");
        }

        if(p2_turn && Island.p2_select1Pass) {
            System.out.print("경)무인도 탈출에 성공 했습니다(축");
        }
        if(p2_turn && Island.p2_select2Call) {
            System.out.print("★★★당신의 현금이 30억 감소 되었습니다★★★");
        }
        if(p2_turn && p2_england_event_3){
            System.out.print("★★★캐나다와 계약 했습니다★★★");
        }
        if (p2_turn && p2_england_event_5) {

            System.out.print("'dd','DD','ㅇㅇ' 중 하나를 입력 하면 계약이 성사 됩니다.");
        }
        if(p2_turn && p2_england_event_8){
            System.out.print("캐나다와의 계약을 실패 했습니다.");
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
            System.out.print("빌딩을 건설 했습니다.");
        }
        if(p1_turn && p1_england_event_6){
            System.out.print("☆☆☆캐나다와 계약 했습니다☆☆☆");
        }
        if(p1_turn && p1_england_event_7){
            System.out.print("상대 플레이어가 랜드마크를 보유 하고 있어서 계약을 할수 없습니다.");
        }
        if(p1_turn && China.p1_chinaEvent){
            System.out.print("개혁 정책으로 현재 가지고 있는 건축물들이 일방적으로 철거 되었습니다.");
        }
        if(p1_turn && USA.p1_event){
            System.out.print("중국과의 무역 전쟁으로 인해  중국과의 계약이 파기 됩니다.");
        }
        if(p1_turn && Germany.p1_event){
            System.out.print("축제 기간에 방문 하여 정부에서 10억을 지원 합니다.");
        }
        if(p1_turn && Italy.p1_event){
            System.out.print("관광수익이 대폭 늘어나서 10억을 경영지원금으로  받았습니다!");
        }
        if(p1_turn && Mexico.p1_event){
            System.out.print("멕시코 갱단을 만나서 가지고 있는 소지금의 반을 강탈 당했습니다.");
        }
        if(p1_turn && Russia.p1_event){
            System.out.print("즈드라 스뜨부이쩨");
        }
        if(p1_turn && Swiss.p1_event){
            System.out.print("알프스 산맥의 눈이 녹기 시작 해서 현상에 대한 지원 금을 10억 기부 했습니다.");
        }
    }
    public void structure1st_p2(){
        if(p2_turn && p2_england_event_3){
            System.out.print("빌딩을 건설 했습니다.");
        }
        if(p2_turn && p2_england_event_6){
            System.out.print("★★★캐나다와 계약 했습니다★★★");
        }
        if(p2_turn && p2_england_event_7){
            System.out.print("상대 플레이어가 랜드마크를 보유 하고 있어서 계약을 할수 없습니다.");
        }
        if(p2_turn && China.p2_chinaEvent){
            System.out.print("개혁 정책으로 현재 가지고 있는 건축물들이 일방적으로 철거 되었습니다.");
        }
        if(p2_turn && USA.p2_event){
            System.out.print("중국과의 무역 전쟁으로 인해 중국과의 계약이 파기 됩니다.");
        }
        if(p2_turn && Germany.p2_event){
            System.out.print("축제 기간에 방문 하여 정부에서 10억을 지원 합니다.");
        }
        if(p2_turn && Italy.p2_event){
            System.out.print("관광수익이 대폭 늘어나서 10억을 경영지원금으로  받았습니다!");
        }
        if(p2_turn && Mexico.p2_event){
            System.out.print("멕시코 갱단을 만나서 가지고 있는 소지금의 반을 강탈 당했습니다.");
        }
        if(p2_turn && Russia.p2_event){
            System.out.print("즈드라 스뜨부이쩨");
        }
        if(p2_turn && Swiss.p2_event){
            System.out.print("알프스 산맥의 눈이 녹기 시작 해서 현상에 대한 지원 금을 10억 기부 했습니다.");
        }
    }
    public void cost1st_p1(){
        if(p1_turn && Island.throwDice){
            System.out.print("1번 주사위를 굴려서 "+Dice.dice1+"이 나왔습니다");
        }
        if(p1_turn && Russia.p1_event){
            System.out.print("푸틴과 친해져서 러시아와 독점계약을 맺었습니다.");
        }

    }
    public void cost1st_p2(){
        if(p2_turn && Island.throwDice){
            System.out.print("1번 주사위를 굴려서 "+Dice.dice1+"이 나왔습니다");
        }
        if(p2_turn && Russia.p2_event){
            System.out.print("푸틴과 친해져서 러시아와 독점계약을 맺었습니다.");
        }
    }
    public void playerIndex1st_p1(){
        if(p1_turn && Island.throwDice){
            System.out.print("2번 주사위를 굴려서 "+Dice.dice2+"이 나왔습니다");
        }
    }
    public void playerIndex1st_p2(){
        if(p2_turn && Island.throwDice){
            System.out.print("2번 주사위를 굴려서 "+Dice.dice2+"이 나왔습니다");
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
