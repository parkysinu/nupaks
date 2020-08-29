package playM;

import java.util.Scanner;

public class Countries extends Place { //국가 클래스들을 상속해주는 클래스
    // 국가 클래스들을 유저가 소유하고 있을때 소유할수있는 건축물들을 표현하는 변수를 담고있음
    //맵의 2번째 줄에 표시
            //buyMapReturned();
			//buyMap();
			//dontTakeMyMoney();
			//willTakeYourMap();

    String select;
    String value;
    String building = "　　▤　　　　　";
    String landmark = "　　　　　Å　　";
    String build_mark = "　　▤　　Å　　";
    String structureBlank = "　　　　　　　　";
    String structureNone = "　　　　　　　　";

    static boolean p1_doNotActiveReturn;
    static boolean p2_doNotActiveReturn;

    int buildingCost;
    int landmarkCost;
    int build_markCost;
    int cost;
    int contractNationYet;
    //	String roof      ="┌──────────┐";
    //public String blank   ="            ";
//	String floor     ="└──────────┘";


    public void building() {

        structureNone = structureNone.replaceAll("　　　　　　　　", "　　▤　　　　　");

    }//building replaceALl

    public void landmark() {

        structureNone = structureNone.replaceAll("　　　　　　　　", "　　　　　Å　　");

    }//landmark replaceAll

    public void buld_mark() {


        structureNone = structureNone.replaceAll("　　　　　　　　", "　　▤　　Å　　");

    }//build_mark replaceAll

    public void building_landmark() {

        structureNone = structureNone.replaceAll("　　▤　　　　　", "　　▤　　Å　　");

    }//building replaceALl

    public void landmark_building() {

        structureNone = structureNone.replaceAll("　　　　　Å　　", "　　▤　　Å　　");

    }//building replaceALl


    //건물 현황 메소드


    public void p1_buyMap() {


        //어떻게 구현할 것 인가
        //if 땅에 대한 소유권이 없을시 구매 하는 메소드가 발현 된다.
        //확률을 조정 해서 3/4는  빌딩을 짓고 1/4는 랜드 마크를 구매할 수 있게 함.
        //랜드 마크 건설시 타 플레이어가 가지고 있는 땅을 구매할 수 없음. 무조건 통행료 내고 지나 가기만 가능
        //만약 owner가 재 방문시 같은 확률로 추가로 건축 물을 지을수 있음.
        //

        Player player = new Player();
        Scanner scan = new Scanner(System.in);
        France fra = new France();
        Germany ger = new Germany();
        Russia rus = new Russia();
        England eng = new England();
        China chi = new China();
        USA usa = new USA();
        Japan jap = new Japan();
        Canada can = new Canada();
        Korea kor = new Korea();
        Mexico mex = new Mexico();
        Egypt egy = new Egypt();
        Vietnam vie = new Vietnam();
        Swiss swi = new Swiss();
        Italy ita = new Italy();
        TimeThread TT = new TimeThread();
        Dice dice = new Dice();
        Playboard playboard =new Playboard();
        String choice;
        String Y = "ㅇㅇ";
        String y = "dd";
        String yy = "DD";

        String N = "ㄴㄴ";
        String n = "ss";
        String nn = "SS";

        if(TurnOver.p1_turnOver){
            return;
        }//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.

        if (Player.p1_index == 1 && Korea.name.equals(kor.ownName)) {
            Korea.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;


            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                kor.own1p();
                Korea.p1_successContract=true;
                System.out.println("☆☆☆"+kor.travel+"와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    kor.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    kor.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사 결정을 했을 경우

        }//name =  " 한국 " p1_index =1

        else if (Player.p1_index == 2 && Japan.name.equals(jap.ownName)) {
            if(Russia.name.equals(Russia.own2p)){
                Japan.p1_startOwnTheLand=true;
                PlayboardLog.p1_ownTheLand=true;

                playboard.playboard();
                choice = scan.nextLine();
                if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                    jap.own1p();
                    Japan.p1_successContract=true;
                    System.out.println("☆☆☆" + jap.ownName + "와 계약 했습니다☆☆☆");
                    dice.buyStructure();
                    Player.p1_cash = Player.p1_cash - 20;
                    if (dice.dice3 == 3) {

                        jap.landmark();
                        Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                    else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                        jap.building();
                        Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
                }//건물을 산다고 의사결정을 했을경우
            }
            else {
                Japan.p1_startOwnTheLand=true;
                PlayboardLog.p1_ownTheLand=true;

                playboard.playboard();
                choice = scan.nextLine();
                if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                    jap.own1p();
                    Japan.p1_successContract=true;
                    System.out.println("☆☆☆" + jap.ownName + "와 계약 했습니다☆☆☆");
                    dice.buyStructure();
                    Player.p1_cash = Player.p1_cash - 10;
                    if (dice.dice3 == 3) {

                        jap.landmark();
                        Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                    else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                        jap.building();
                        Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
                }//건물을 산다고 의사결정을 했을경우
            }//elseContractedRussia
        }//name = " 일본 " p1_index =2


        else if (Player.p1_index == 3 && China.name.equals(chi.ownName)) {
            China.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                chi.own1p();
                China.p1_successContract=true;
                System.out.println("☆☆☆" + chi.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    chi.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    chi.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우
        }//name = " 중국 " p1_index =3


        else if (Player.p1_index == 5 && England.name.equals(eng.ownName)) {
            China.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                eng.own1p();
                England.p1_successContract=true;
                System.out.println("☆☆☆" + eng.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    eng.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    eng.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사 결정을 했을 경우
        }//name = " 영국 " p1_index = 5


        else if (Player.p1_index == 6 && France.name.equals(fra.ownName)) {
            if(TimeThread.Season.equals(TT.Summer)) {
                PlayboardLog.p1_france_protesting=true;

            }//프랑스 이벤트 season.equals(Summer)
            else {
                France.p1_startOwnTheLand=true;
                PlayboardLog.p1_ownTheLand=true;

                playboard.playboard();
                choice = scan.nextLine();
                if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                    fra.own1p();
                    France.p1_successContract=true;
                    System.out.println("☆☆☆" + fra.ownName + "와 계약 했습니다☆☆☆");
                    dice.buyStructure();
                    Player.p1_cash = Player.p1_cash - 10;
                    if (dice.dice3 == 3) {

                        fra.landmark();
                        Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    }//dice3==3 (주사위 값이 3일때 랜드 마크 ㄱ)

                    else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                        fra.building();
                        Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
                }//건물을 산다고 의사결정을 했을경우
            }//else !Summer
        }//name = " 프랑스 " p1_index = 6


        else if (Player.p1_index == 7 && Germany.name.equals(ger.ownName)) {
            Germany.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                ger.own1p();
                Germany.p1_successContract=true;
                System.out.println("☆☆☆" + ger.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    ger.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    ger.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우
        }//name = " 독일 "  p1_index = 7


        else if (Player.p1_index == 8 && Russia.name.equals(rus.ownName)) {
            Russia.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                rus.own1p();
                Russia.p1_successContract=true;
                System.out.println("☆☆☆" + rus.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    rus.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    rus.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우
        }//name = " 러시아  " p1_index =8


        else if (Player.p1_index == 10 && USA.name.equals(usa.ownName)) {
            USA.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                usa.own1p();
                USA.p1_successContract=true;
                System.out.println("☆☆☆" + usa.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    usa.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    usa.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우
        }//name = " 미국 " p1_index = 10


        else if (Player.p1_index == 11 && Canada.name.equals(can.ownName)) {
            Canada.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            if(England.name.equals(eng.p1_own)){
                can.englishSale();

                playboard.playboard();
                choice = scan.nextLine();
                if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                    can.own1p();
                    Canada.p1_successContract=true;
                    System.out.println("☆☆☆" + can.ownName + "와 계약 했습니다☆☆☆");
                    dice.buyStructure();
                    Player.p1_cash = Player.p1_cash - 5;
                    if (dice.dice3 == 3) {

                        can.landmark();
                        Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                    else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                        can.building();
                        Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
                }//건물을 산다고 의사결정을 했을경우
            }
            else {
                Canada.p1_startOwnTheLand=true;
                PlayboardLog.p1_ownTheLand=true;

                playboard.playboard();
                choice = scan.nextLine();
                if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                    can.own1p();
                    Canada.p1_successContract=true;
                    System.out.println("☆☆☆" + can.ownName + "와 계약 했습니다☆☆☆");
                    dice.buyStructure();
                    Player.p1_cash = Player.p1_cash - 10;
                    if (dice.dice3 == 3) {

                        can.landmark();
                        Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                    else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                        can.building();
                        Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
                }//건물을 산다고 의사결정을 했을경우
            }//else eng.name.equals(eng.p1_own)
        }//name = " 캐나다 "  p1_index= 11


        else if (Player.p1_index == 12 && Mexico.name.equals(mex.ownName)) {
            Mexico.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                mex.own1p();
                Mexico.p1_successContract=true;
                System.out.println("☆☆☆" + mex.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    mex.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    mex.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우
        }//name = " 멕시코 " p1_index= 12


        else if (Player.p1_index == 14 && Italy.name.equals(ita.ownName)) {
            Italy.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                ita.own1p();
                Italy.p1_successContract=true;
                System.out.println("☆☆☆" + ita.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    ita.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    ita.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우
        }//name = " 이탈리아 " p1_index= 14


        else if (Player.p1_index == 15 && Swiss.name.equals(swi.ownName)) {
            Swiss.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                swi.own1p();
                Swiss.p1_successContract=true;
                System.out.println("☆☆☆" + swi.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    swi.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    swi.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사 결정을 했을 경우
        }//name = " 스위스 " p1_index=15


        else if (Player.p1_index == 16 && Vietnam.name.equals(vie.ownName)) {
            Vietnam.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                vie.own1p();
                Vietnam.p1_successContract=true;
                System.out.println("☆☆☆" + vie.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    vie.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    vie.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우
        }//name = " 베트남 " p1_index =16


        else if (Player.p1_index == 17 && Egypt.name.equals(egy.ownName)) {
            Egypt.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                egy.own1p();
                Egypt.p1_successContract=true;
                System.out.println("☆☆☆" + egy.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    egy.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    egy.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우
        }//name = " 이집트 " p1 index= 17


    }
    //p1이 땅을 구매하는 메소드


    public void p2_buyMap() {


        //어떻게 구현할것인가
        //if 땅에 대한 소유권이 없을시 구매하는 메소드가 발현된다.
        //확률을 조정해서 3/4는  빌딩을 짓고 1/4는 랜드마크를 구매할수있게 함.
        //랜드마크 건설시 타 플레이어가 가지고 있는 땅을 구매할수없음. 무조건 통행료 내고 지나가기만 가능
        //만약 owner가 재방문시 같은 확률로 추가로 건축물을 지을수 있음.
        //
        Player player = new Player();
        Place pla_player1 = new Place();
        Playboard board = new Playboard();
        Scanner scan = new Scanner(System.in);
        Island isl = new Island();
        France fra = new France();
        Germany ger = new Germany();
        Russia rus = new Russia();
        Taxx2 tax = new Taxx2();
        England eng = new England();
        China chi = new China();
        USA usa = new USA();
        Japan jap = new Japan();
        Canada can = new Canada();
        Korea kor = new Korea();
        Mexico mex = new Mexico();
        Start start = new Start();
        Egypt egy = new Egypt();
        Vietnam vie = new Vietnam();
        Swiss swi = new Swiss();
        Italy ita = new Italy();
        Balloon ball = new Balloon();
        TimeThread TT = new TimeThread();
        Dice dice = new Dice();
        Playboard playboard =new Playboard();
        String choice;
        String Y = "ㅇㅇ";
        String y = "dd";
        String yy = "DD";

        String N = "ㄴㄴ";
        String n = "ss";
        String nn = "SS";

        if(TurnOver.p2_turnOver){
            return;
        }//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.

        if (Player.p2_index == 1 && Korea.name.equals(kor.ownName)) {
            Korea.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                kor.own2p();
                Korea.p2_successContract=true;
                System.out.println("☆☆☆" + kor.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    kor.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    kor.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name =  " 한국 " p2_index =1

        else if (Player.p2_index == 2 && Japan.name.equals(jap.ownName)) {
                if(Russia.name.equals(Russia.own1p)){
                    Japan.p2_startOwnTheLand=true;
                    PlayboardLog.p2_ownTheLand=true;
                    playboard.playboard();


                    choice = scan.nextLine();
                    if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                        jap.own2p();
                        Japan.p2_successContract=true;
                        System.out.println("☆☆☆" + jap.ownName + "와 계약 했습니다☆☆☆");
                        dice.buyStructure();
                        Player.p2_cash = Player.p2_cash - 20;
                        if (dice.dice3 == 3) {

                            jap.landmark();
                            Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                        }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                        else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                            jap.building();
                            Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                        }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
                    }//건물을 산다고 의사결정을 했을경우
                }
                else {

                    Japan.p2_startOwnTheLand=true;
                    PlayboardLog.p2_ownTheLand=true;

                    playboard.playboard();
                    choice = scan.nextLine();
                    if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                        jap.own2p();
                        Japan.p2_successContract=true;
                        System.out.println("☆☆☆" + jap.ownName + "와 계약 했습니다☆☆☆");
                        dice.buyStructure();
                        Player.p2_cash = Player.p2_cash - 10;
                        if (dice.dice3 == 3) {

                            jap.landmark();
                            Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                        }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                        else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                            jap.building();
                            Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                        }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
                    }//건물을 산다고 의사결정을 했을경우

                }//elseContractedRussia
        }//name = " 일본 " p2_index =2


        else if (Player.p2_index == 3 && China.name.equals(chi.ownName)) {
            China.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                chi.own2p();
                China.p2_successContract=true;
                System.out.println("☆☆☆" + chi.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    chi.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    chi.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name = " 중국 " p2_index =3


        else if (Player.p2_index == 5 && England.name.equals(eng.ownName)) {
            England.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                eng.own2p();
                England.p2_successContract=true;
                System.out.println("☆☆☆" + eng.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    eng.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    eng.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name = " 영국 " p2_index = 5


        else if (Player.p2_index == 6 && France.name.equals(fra.ownName)) {
                if(TimeThread.Season.equals(TT.Summer)){
                    PlayboardLog.p2_france_protesting=true;


                }
                else {
                    France.p2_startOwnTheLand=true;
                    PlayboardLog.p2_ownTheLand=true;

                    playboard.playboard();
                    choice = scan.nextLine();
                    if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                        fra.own2p();
                        France.p2_successContract=true;
                        System.out.println("☆☆☆" + fra.ownName + "와 계약 했습니다☆☆☆");
                        dice.buyStructure();
                        Player.p2_cash = Player.p2_cash - 10;
                        if (dice.dice3 == 3) {

                            fra.landmark();
                            Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                        }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                        else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                            fra.building();
                            Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                        }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
                    }//건물을 산다고 의사결정을 했을경우
                }//else !Summer

        }//name = " 프랑스 " p2_index = 6


        else if (Player.p2_index == 7 && Germany.name.equals(ger.ownName)) {
            Germany.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                ger.own2p();
                Germany.p2_successContract=true;
                System.out.println("☆☆☆" + ger.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    ger.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    ger.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name = " 독일 "  p2_index = 7


        else if (Player.p2_index == 8 && Russia.name.equals(rus.ownName)) {
            Russia.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                rus.own2p();
                Russia.p2_successContract=true;
                System.out.println("☆☆☆" + rus.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    rus.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    rus.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name = " 러시아  " p2_index =8


        else if (Player.p2_index == 10 && USA.name.equals(usa.ownName)) {
            USA.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                usa.own2p();
                USA.p2_successContract=true;
                System.out.println("☆☆☆" + usa.ownName + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    usa.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    usa.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name = " 미국 " p2_index = 10


        else if (Player.p2_index == 11 && Canada.name.equals(can.ownName)) {
            Canada.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                can.own2p();
                Canada.p2_successContract=true;
                System.out.println("☆☆☆" + can.travel + "와 계약 했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    can.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    can.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name = " 캐나다 "  p2_index= 11


        else if (Player.p2_index == 12 && Mexico.name.equals(mex.ownName)) {
            Mexico.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                mex.own2p();
                Mexico.p2_successContract=true;
                System.out.println("☆☆☆" + mex.ownName + "땅을 구매했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    mex.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    mex.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name = " 멕시코 " p2_index= 12


        else if (Player.p2_index == 14 && Italy.name.equals(ita.ownName)) {
            Italy.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                ita.own2p();
                Italy.p2_successContract=true;
                System.out.println("☆☆☆" + ita.ownName + "땅을 구매했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    ita.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    ita.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name = " 이탈리아 " p2_index= 14


        else if (Player.p2_index == 15 && Swiss.name.equals(swi.ownName)) {
            Swiss.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                swi.own2p();
                Swiss.p2_successContract=true;
                System.out.println("☆☆☆" + swi.ownName + "땅을 구매했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    swi.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    swi.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name = " 스위스 " p2_index=15


        else if (Player.p2_index == 16 && Vietnam.name.equals(vie.ownName)) {
            Vietnam.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                vie.own2p();
                Vietnam.p2_successContract=true;
                System.out.println("☆☆☆" + vie.ownName + "땅을 구매했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    vie.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    vie.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name = " 베트남 " p2_index =16


        else if (Player.p2_index == 17 && Egypt.name.equals(egy.ownName)) {
            Egypt.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                egy.own2p();
                Egypt.p2_successContract=true;
                System.out.println("☆☆☆" + egy.ownName + "땅을 구매했습니다☆☆☆");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    egy.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (주사위 값이 3일때 랜드마크 ㄱ)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    egy.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)
            }//건물을 산다고 의사결정을 했을경우

        }//name = " 이집트 " p2 index= 17


    }
    //p2가 땅을 구매하는 메소드

    public void p1_buyMapReturned() {

        //어떻게 구현할 것인가
        //if 땅에 대한 소유 권이 없을시 구매 하는 메소드가 발현 된다.
        //확률을 조정 해서 3/4는  빌딩을 짓고 1/4는 랜드마크를 구매할 수 있게 함.
        //랜드마크 건설시 타 플레이어가 가지고 있는 땅을 구매할 수 없음. 무조건 통행료 내고 지나 가기만 가능
        //만약 owner가 재 방문시 같은 확률로 추가로 건축 물을 지을수 있음.
        //

        Place pla_player1 = new Place();
        Playboard board = new Playboard();
        Scanner scan = new Scanner(System.in);
        Island isl = new Island();
        France fra = new France();
        Germany ger = new Germany();
        Russia rus = new Russia();
        Taxx2 tax = new Taxx2();
        England eng = new England();
        China chi = new China();
        USA usa = new USA();
        Japan jap = new Japan();
        Canada can = new Canada();
        Korea kor = new Korea();
        Mexico mex = new Mexico();
        Start start = new Start();
        Egypt egy = new Egypt();
        Vietnam vie = new Vietnam();
        Swiss swi = new Swiss();
        Italy ita = new Italy();
        Balloon ball = new Balloon();
        Player player = new Player();
        Dice dice = new Dice();
        TimeThread TT= new TimeThread();

        if(TurnOver.p1_turnOver){
            return;
        }//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.


        if (Player.p1_index == 1 && Korea.name.equals(kor.p1_own)) {


            if (Korea.structureNone.equals(kor.building)) {
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                PlayboardLog.p1_returnedTHeMap=true;
                kor.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Korea.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재 방문으로 인해 한국에 대한 독점 권을 얻었습니다☆☆☆");
            }//building을 이미 가지고 있는 경우

            if (Korea.structureNone.equals(kor.landmark)) {
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                PlayboardLog.p1_returnedTHeMap=true;
                kor.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                Korea.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문 효과로 한국에 대한 독점권을 얻었습니다☆☆☆");

            }//랜드마크를 가지고있을경우


        }//name =  " 한국 " p1_index =1

        else if (Player.p1_index == 2 && Japan.name.equals(jap.p1_own)) {


            if (Japan.structureNone.equals(jap.building)) {
                jap.building_landmark();
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Japan.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문으로 인해 일본에 대한 독점권을 얻었습니다☆☆☆");
            }//building을 이미 가지고 있는 경우

            if (Japan.structureNone.equals(jap.landmark)) {
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                PlayboardLog.p1_returnedTHeMap=true;
                jap.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                Japan.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문 효과로 일본에 대한 독점권을 얻었습니다☆☆☆");

            }//랜드마크를 가지고있을경우

        }//name = " 일본 " p1_index =2


        else if (Player.p1_index == 3 && China.name.equals(chi.p1_own)) {


            if (China.structureNone.equals(chi.building)) {
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                PlayboardLog.p1_returnedTHeMap=true;
                chi.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                China.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문으로 인해 중국에 대한 독점권을 얻었습니다☆☆☆");
            }//building을 이미 가지고 있는 경우

            if (China.structureNone.equals(chi.landmark)) {
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                PlayboardLog.p1_returnedTHeMap=true;
                chi.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                China.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문 효과로 중국에 대한 독점권을 얻었습니다☆☆☆");

            }//랜드마크를 가지고있을경우


        }//name = " 중국 " p1_index =3


        else if (Player.p1_index == 5 && England.name.equals(eng.p1_own)) {


            if (England.structureNone.equals(eng.building)) {
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                PlayboardLog.p1_returnedTHeMap=true;
                eng.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                England.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문으로 인해 영국에 대한 독점권을 얻었습니다☆☆☆");
            }//building을 이미 가지고 있는 경우

            if (England.structureNone.equals(eng.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                eng.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("☆☆☆재방문 효과로 영국에 대한 독점권을 얻었습니다☆☆☆");
                England.p1_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우

        }//name = " 영국 " p1_index = 5


        else if (Player.p1_index == 6 && France.name.equals(fra.p1_own)) {
            if(TimeThread.Season.equals(TT.Summer)){
                PlayboardLog.p1_france_protesting=true;
                //System.out.println("현재 프랑스에서 집회 시위중이라서 행정업무를 처리할수없습니다.");
            }
            else {
                if (France.structureNone.equals(fra.building)) {
                    PlayboardLog.p1_returnedTHeMap=true;
                    //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                    fra.building_landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    France.p1_returnTheMapNaming=true;
                    //System.out.println("☆☆☆재방문으로 인해 프랑스에 대한 독점권을 얻었습니다☆☆☆");
                }//building을 이미 가지고 있는 경우

                if (France.structureNone.equals(fra.landmark)) {
                    //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                    PlayboardLog.p1_returnedTHeMap=true;
                    fra.landmark_building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    France.p1_returnTheMapNaming=true;
                    //System.out.println("☆☆☆재방문 효과로 프랑스에 대한 독점권을 얻었습니다☆☆☆");

                }//랜드마크를 가지고있을경우
            }

        }//name = " 프랑스 " p1_index = 6


        else if (Player.p1_index == 7 && Germany.name.equals(ger.p1_own)) {


            if (Germany.structureNone.equals(ger.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                ger.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Germany.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문으로 인해 독일에 대한 독점권을 얻었습니다☆☆☆");
            }//building을 이미 가지고 있는 경우

            if (Germany.structureNone.equals(ger.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                ger.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                Germany.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문 효과로 독일에 대한 독점권을 얻었습니다☆☆☆");

            }//랜드마크를 가지고있을경우


        }//name = " 독일 "  p1_index = 7


        else if (Player.p1_index == 8 && Russia.name.equals(rus.p1_own)) {


            if (Russia.structureNone.equals(rus.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                rus.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Russia.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문으로 인해 러시아에 대한 독점권을 얻었습니다☆☆☆");
            }//building을 이미 가지고 있는 경우

            if (Russia.structureNone.equals(rus.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                rus.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("☆☆☆재방문 효과로 러시아에 대한 독점권을 얻었습니다☆☆☆");
                Russia.p1_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우


        }//name = " 러시아  " p1_index =8


        else if (Player.p1_index == 10 && USA.name.equals(usa.p1_own)) {


            if (USA.structureNone.equals(usa.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                usa.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                USA.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문으로 인해 미국에 대한 독점권을 얻었습니다☆☆☆");
            }//building을 이미 가지고 있는 경우

            if (USA.structureNone.equals(usa.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                usa.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                USA.p1_returnTheMapNaming=true;
                // System.out.println("☆☆☆재방문 효과로 미국에 대한 독점권을 얻었습니다☆☆☆");

            }//랜드마크를 가지고있을경우


        }//name = " 미국 " p1_index = 10


        else if (Player.p1_index == 11 && Canada.name.equals(can.p1_own)) {


            if (Canada.structureNone.equals(can.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                can.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Canada.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문으로 인해 캐나다에 대한 독점권을 얻었습니다☆☆☆");
            }//building을 이미 가지고 있는 경우

            if (Canada.structureNone.equals(can.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                can.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("☆☆☆재방문 효과로 캐나다에 대한 독점권을 얻었습니다☆☆☆");
                Canada.p1_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우


        }//name = " 캐나다 "  p1_index= 11


        else if (Player.p1_index == 12 && Mexico.name.equals(mex.p1_own)) {


            if (Mexico.structureNone.equals(mex.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                mex.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Mexico.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문으로 인해 멕시코에 대한 독점권을 얻었습니다☆☆☆");
            }//building을 이미 가지고 있는 경우

            if (Mexico.structureNone.equals(mex.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                mex.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("☆☆☆재방문 효과로 멕시코에 대한 독점권을 얻었습니다☆☆☆");
                Mexico.p1_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우


        }//name = " 멕시코 " p1_index= 12


        else if (Player.p1_index == 14 && Italy.name.equals(ita.p1_own)) {


            if (Italy.structureNone.equals(ita.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                ita.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Italy.p1_returnTheMapNaming=true;
                //System.out.println("☆☆☆재방문으로 인해 이탈리아에 대한 독점권을 얻었습니다☆☆☆");
            }//building을 이미 가지고 있는 경우

            if (Italy.structureNone.equals(ita.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                ita.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("☆☆☆재방문 효과로 이탈리아에 대한 독점권을 얻었습니다☆☆☆");
                Italy.p1_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우


        }//name = " 이탈리아 " p1_index= 14


        else if (Player.p1_index == 15 && Swiss.name.equals(swi.p1_own)) {


            if (Swiss.structureNone.equals(swi.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                swi.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                //System.out.println("☆☆☆재방문으로 인해 스위스에 대한 독점권을 얻었습니다☆☆☆");
                Swiss.p1_returnTheMapNaming=true;
            }//building을 이미 가지고 있는 경우

            if (Swiss.structureNone.equals(swi.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                swi.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("☆☆☆재방문 효과로 스위스에 대한 독점권을 얻었습니다☆☆☆");
                Swiss.p1_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우


        }//name = " 스위스 " p1_index=15


        else if (Player.p1_index == 16 && Vietnam.name.equals(vie.p1_own)) {


            if (Vietnam.structureNone.equals(vie.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                vie.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                //System.out.println("☆☆☆재방문으로 인해 베트남에 대한 독점권을 얻었습니다☆☆☆");
                Vietnam.p1_returnTheMapNaming=true;
            }//building을 이미 가지고 있는 경우

            if (Vietnam.structureNone.equals(vie.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                vie.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("☆☆☆재방문 효과로 베트남에 대한 독점권을 얻었습니다☆☆☆");
                Vietnam.p1_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우


        }//name = " 베트남 " p1_index =16


        else if (Player.p1_index == 17 && Egypt.name.equals(egy.p1_own)) {


            if (Egypt.structureNone.equals(egy.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                egy.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                //System.out.println("☆☆☆재방문으로 인해 이집트에 대한 독점권을 얻었습니다☆☆☆");
                Egypt.p1_returnTheMapNaming=true;
            }//building을 이미 가지고 있는 경우

            if (Egypt.structureNone.equals(egy.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("☆☆☆ p1 is returned!☆☆☆");
                egy.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("☆☆☆재방문 효과로 이집트에 대한 독점권을 얻었습니다☆☆☆");
                Egypt.p1_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우


        }//name = " 이집트 " p1 index= 17


    }
    //p1이 땅을 재방문하는 메소드  //p1이 땅을 재방문하는 메소드  //p1이 땅을 재방문하는 메소드  //p1이 땅을 재방문하는 메소드  //p1이 땅을 재방문하는 메소드  //p1이 땅을 재방문하는 메소드  //p1이 땅을 재방문하는 메소드
    //p1이 땅을 재방문하는 메소드  //p1이 땅을 재방문하는 메소드  //p1이 땅을 재방문하는 메소드  //p1이 땅을 재방문하는 메소드  //p1이 땅을 재방문하는 메소드  //p1이 땅을 재방문하는 메소드


    public void p2_buyMapReturned() {

        //어떻게 구현할것인가
        //if 땅에 대한 소유권이 없을시 구매하는 메소드가 발현된다.
        //확률을 조정해서 3/4는  빌딩을 짓고 1/4는 랜드마크를 구매할수있게 함.
        //랜드마크 건설시 타 플레이어가 가지고 있는 땅을 구매할수없음. 무조건 통행료 내고 지나가기만 가능
        //만약 owner가 재방문시 같은 확률로 추가로 건축물을 지을수 있음.
        //

        Place pla_player1 = new Place();
        Playboard board = new Playboard();
        Scanner scan = new Scanner(System.in);
        Island isl = new Island();
        France fra = new France();
        Germany ger = new Germany();
        Russia rus = new Russia();
        Taxx2 tax = new Taxx2();
        England eng = new England();
        China chi = new China();
        USA usa = new USA();
        Japan jap = new Japan();
        Canada can = new Canada();
        Korea kor = new Korea();
        Mexico mex = new Mexico();
        Start start = new Start();
        Egypt egy = new Egypt();
        Vietnam vie = new Vietnam();
        Swiss swi = new Swiss();
        Italy ita = new Italy();
        Balloon ball = new Balloon();
        Player player = new Player();
        Dice dice = new Dice();
        TimeThread TT = new TimeThread();

        if(TurnOver.p2_turnOver){
            return;
        }//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.


        if (Player.p2_index == 1 && Korea.name.equals(kor.p2_own)) {


            if (Korea.structureNone.equals(kor.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                kor.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                //System.out.println("★★★재방문으로 인해 한국에 대한 독점권을 얻었습니다★★★");
                Korea.p2_returnTheMapNaming=true;
            }//building을 이미 가지고 있는 경우

            if (Korea.structureNone.equals(kor.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                kor.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                //System.out.println("★★★재방문 효과로 한국에 대한 독점권을 얻었습니다★★★");
                Korea.p2_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우


        }//name =  " 한국 " p1_index =1

        else if (Player.p2_index == 2 && Japan.name.equals(jap.p2_own)) {


            if (Japan.structureNone.equals(jap.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                jap.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                //System.out.println("★★★재방문으로 인해 일본에 대한 독점권을 얻었습니다★★★");
                Japan.p2_returnTheMapNaming=true;
            }//building을 이미 가지고 있는 경우

            if (Japan.structureNone.equals(jap.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                jap.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                //System.out.println("★★★재방문 효과로 일본에 대한 독점권을 얻었습니다★★★");
                Japan.p2_returnTheMapNaming=true;

            }//랜드마크를 가지고있을경우

        }//name = " 일본 " p1_index =2


        else if (Player.p2_index == 3 && China.name.equals(chi.p2_own)) {


            if (China.structureNone.equals(chi.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                chi.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                //System.out.println("★★★재방문으로 인해 중국에 대한 독점권을 얻었습니다★★★");
                China.p2_returnTheMapNaming=true;
            }//building을 이미 가지고 있는 경우

            if (China.structureNone.equals(chi.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                chi.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
//                System.out.println("★★★재방문 효과로 중국에 대한 독점권을 얻었습니다★★★");
                China.p2_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우


        }//name = " 중국 " p2_index =3


        else if (Player.p2_index == 5 && England.name.equals(eng.p2_own)) {


            if (England.structureNone.equals(eng.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★p2 is returned!★★★");
                eng.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
  //              System.out.println("★★★재방문으로 인해 영국에 대한 독점권을 얻었습니다★★★");
                England.p2_returnTheMapNaming=true;
            }//building을 이미 가지고 있는 경우

            if (England.structureNone.equals(eng.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★p2 is returned!★★★");
                eng.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                //System.out.println("★★★재방문 효과로 영국에 대한 독점권을 얻었습니다★★★");
                England.p2_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우

        }//name = " 영국 " p2_index = 5


        else if (Player.p2_index == 6 && France.name.equals(fra.p2_own)) {
            if(TimeThread.Season.equals(TT.Summer)){
                PlayboardLog.p2_france_protesting=true;
                //System.out.println("현재 프랑스에서 집회 시위중이라서 행정업무를 처리할수없습니다.");
            }//eqauals(Summer)
            else {

                if (France.structureNone.equals(fra.building)) {
                    PlayboardLog.p2_returnedTHeMap=true;
                    //System.out.println("★★★p2 is returned!★★★");
                    fra.building_landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                    France.p2_returnTheMapNaming=true;
                    //System.out.println("★★★재방문으로 인해 프랑스에 대한 독점권을 얻었습니다★★★");
                }//building을 이미 가지고 있는 경우

                if (France.structureNone.equals(fra.landmark)) {
                    PlayboardLog.p2_returnedTHeMap=true;
                    //System.out.println("★★★p2 is returned!★★★");
                    fra.landmark_building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                    France.p2_returnTheMapNaming=true;
                    //System.out.println("★★★재방문 효과로 프랑스에 대한 독점권을 얻었습니다★★★");

                }//랜드마크를 가지고있을경우
            }//!Summer

        }//name = " 프랑스 " p2_index = 6


        else if (Player.p2_index == 7 && Germany.name.equals(ger.p2_own)) {


            if (Germany.structureNone.equals(ger.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                ger.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Germany.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문으로 인해 독일에 대한 독점권을 얻었습니다★★★");
            }//building을 이미 가지고 있는 경우

            if (Germany.structureNone.equals(ger.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                ger.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Germany.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문 효과로 독일에 대한 독점권을 얻었습니다★★★");

            }//랜드마크를 가지고있을경우


        }//name = " 독일 "  p2_index = 7


        else if (Player.p2_index == 8 && Russia.name.equals(rus.p2_own)) {


            if (Russia.structureNone.equals(rus.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                rus.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Russia.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문으로 인해 러시아에 대한 독점권을 얻었습니다★★★");
            }//building을 이미 가지고 있는 경우

            if (Russia.structureNone.equals(rus.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                rus.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                //System.out.println("★★★재방문 효과로 러시아에 대한 독점권을 얻었습니다★★★");
                Russia.p2_returnTheMapNaming=true;
            }//랜드마크를 가지고있을경우


        }//name = " 러시아  " p2_index =8


        else if (Player.p2_index == 10 && USA.name.equals(usa.p2_own)) {


            if (USA.structureNone.equals(usa.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                usa.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                USA.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문으로 인해 미국에 대한 독점권을 얻었습니다★★★");
            }//building을 이미 가지고 있는 경우

            if (USA.structureNone.equals(usa.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                usa.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                USA.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문 효과로 미국에 대한 독점권을 얻었습니다★★★");

            }//랜드마크를 가지고있을경우


        }//name = " 미국 " p2_index = 10


        else if (Player.p2_index == 11 && Canada.name.equals(can.p2_own)) {


            if (Canada.structureNone.equals(can.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p1 is returned!★★★");
                can.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                //System.out.println("★★★재방문으로 인해 캐나다에 대한 독점권을 얻었습니다★★★");
                Canada.p2_returnTheMapNaming=true;
            }//building을 이미 가지고 있는 경우

            if (Canada.structureNone.equals(can.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p1 is returned!★★★");
                can.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Canada.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문 효과로 캐나다에 대한 독점권을 얻었습니다★★★");

            }//랜드마크를 가지고있을경우


        }//name = " 캐나다 "  p2_index= 11


        else if (Player.p2_index == 12 && Mexico.name.equals(mex.p2_own)) {


            if (Mexico.structureNone.equals(mex.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                mex.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Mexico.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문으로 인해 멕시코에 대한 독점권을 얻었습니다★★★");
            }//building을 이미 가지고 있는 경우

            if (Mexico.structureNone.equals(mex.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                mex.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Mexico.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문 효과로 멕시코에 대한 독점권을 얻었습니다★★★");

            }//랜드마크를 가지고있을경우


        }//name = " 멕시코 " p2_index= 12


        else if (Player.p2_index == 14 && Italy.name.equals(ita.p2_own)) {


            if (Italy.structureNone.equals(ita.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★p2 is returned!★★★");
                ita.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Italy.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문으로 인해 이탈리아에 대한 독점권을 얻었습니다★★★");
            }//building을 이미 가지고 있는 경우

            if (Italy.structureNone.equals(ita.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★p2 is returned!★★★");
                ita.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Italy.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문 효과로 이탈리아에 대한 독점권을 얻었습니다★★★");

            }//랜드마크를 가지고있을경우


        }//name = " 이탈리아 " p2_index= 14


        else if (Player.p2_index == 15 && Swiss.name.equals(swi.p2_own)) {


            if (Swiss.structureNone.equals(swi.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p1 is returned!★★★");
                swi.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Swiss.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문으로 인해 스위스에 대한 독점권을 얻었습니다★★★");
            }//building을 이미 가지고 있는 경우

            if (Swiss.structureNone.equals(swi.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p1 is returned!★★★");
                swi.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Swiss.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문 효과로 스위스에 대한 독점권을 얻었습니다★★★");

            }//랜드마크를 가지고있을경우


        }//name = " 스위스 " p2_index=15


        else if (Player.p2_index == 16 && Vietnam.name.equals(vie.p2_own)) {


            if (Vietnam.structureNone.equals(vie.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★p2 is returned!★★★");
                vie.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Vietnam.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문으로 인해 베트남에 대한 독점권을 얻었습니다★★★");
            }//building을 이미 가지고 있는 경우

            if (Vietnam.structureNone.equals(vie.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★p2 is returned!★★★");
                vie.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Vietnam.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문 효과로 베트남에 대한 독점권을 얻었습니다★★★");

            }//랜드마크를 가지고있을경우


        }//name = " 베트남 " p2_index =16


        else if (Player.p2_index == 17 && Egypt.name.equals(egy.p2_own)) {


            if (Egypt.structureNone.equals(egy.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                egy.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Egypt.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문으로 인해 이집트에 대한 독점권을 얻었습니다★★★");
            }//building을 이미 가지고 있는 경우

            if (Egypt.structureNone.equals(egy.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("★★★ p2 is returned!★★★");
                egy.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Egypt.p2_returnTheMapNaming=true;
                //System.out.println("★★★재방문 효과로 이집트에 대한 독점권을 얻었습니다★★★");

            }//랜드마크를 가지고있을경우


        }//name = " 이집트 " p2 index= 17


    }
    //p2이 땅을 재방문하는 메소드


    public void p1_dontTakeMyMoney() {

        Player player = new Player();
        Place pla_player1 = new Place();
        Playboard board = new Playboard();
        Scanner scan = new Scanner(System.in);
        Island isl = new Island();
        France fra = new France();
        Germany ger = new Germany();
        Russia rus = new Russia();
        Taxx2 tax = new Taxx2();
        England eng = new England();
        China chi = new China();
        USA usa = new USA();
        Japan jap = new Japan();
        Canada can = new Canada();
        Korea kor = new Korea();
        Mexico mex = new Mexico();
        Start start = new Start();
        Egypt egy = new Egypt();
        Vietnam vie = new Vietnam();
        Swiss swi = new Swiss();
        Italy ita = new Italy();
        Balloon ball = new Balloon();
        TimeThread TT = new TimeThread();
        //유저1이 다른 유저가 소유하고있는 맵에 들어가게 되면 건축물에 따라 통행세를 지불하게 됨.
        //빌딩 10cash  랜드마크 20캐쉬   빌드_마크 30캐쉬

        if(TurnOver.p1_turnOver){
            return;
        }//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.


        if (Player.p1_index == 1) {
            if (Korea.name.equals(kor.p2_own)) {
              //  System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
              //  System.out.println("돈내놔!");
                Korea.p1_movedOtherPlayerMap=true;
                if ((Korea.structureNone.equals(kor.building))) {
                    Player.p1_cash = Player.p1_cash - Korea.buildingCost;
                    Player.p2_cash = Player.p2_cash + Korea.buildingCost;
                    Korea.p1_taxBuilding=true;
                    //System.out.println("도둑놈들 어떻게 통행료가 "+Korea.buildingCost+"억이나 해!");
                }//building
                else if ((Korea.structureNone.equals(kor.landmark))) {
                    Player.p1_cash = Player.p1_cash - Korea.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Korea.landmarkCost;
                    Korea.p1_taxLandmark=true;
                   // System.out.println("도둑놈들 어떻게 통행료가 "+Korea.landmarkCost+"억이나 해!");
                }//landmark
                else if (Korea.structureNone.equals(kor.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Korea.build_markCost;
                    Player.p2_cash = Player.p2_cash + Korea.build_markCost;
                    Korea.p1_taxBuild_mark=true;
                  //  System.out.println("도둑놈들 어떻게 통행료가 "+Korea.build_markCost+"억이나 해!");
                }//build_mark
            }//name = kor.p2_own

        }//p1_index == 1

        else if (Player.p1_index == 2) {
            if (Japan.name.equals(jap.p2_own)) {
               // System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
               // System.out.println("돈내놔!");
                Japan.p1_movedOtherPlayerMap=true;
                if ((Japan.structureNone.equals(jap.building))) {
                    Player.p1_cash = Player.p1_cash - Japan.buildingCost;
                    Player.p2_cash = Player.p2_cash + Japan.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 "+Japan.buildingCost+"억이나 해!");
                    Japan.p1_taxBuilding=true;
                }//building
                else if ((Japan.structureNone.equals(jap.landmark))) {
                    Player.p1_cash = Player.p1_cash - Japan.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Japan.landmarkCost;
                   // System.out.println("도둑놈들 어떻게 통행료가 40억이나해!");
                    Japan.p1_taxLandmark=true;

                }//landmark
                else if (Japan.structureNone.equals(jap.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Japan.build_markCost;
                    Player.p2_cash = Player.p2_cash + Japan.build_markCost;
                   // System.out.println("도둑놈들 어떻게 통행료가 60억이나해!");
                    Japan.p1_taxBuild_mark=true;

                }//build_mark
            }//name = jap.p2_own

        }//p1_index == 2


        else if (Player.p1_index == 3) {
            if (China.name.equals(chi.p2_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                China.p1_movedOtherPlayerMap=true;
                if ((China.structureNone.equals(chi.building))) {
                    Player.p1_cash = Player.p1_cash - China.buildingCost;
                    Player.p2_cash = Player.p2_cash + China.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                    China.p1_taxBuilding=true;
                }//building
                else if ((China.structureNone.equals(chi.landmark))) {
                    Player.p1_cash = Player.p1_cash - China.landmarkCost;
                    Player.p2_cash = Player.p2_cash + China.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 40억이나해!");
                    China.p1_taxLandmark=true;

                }//landmark
                else if (China.structureNone.equals(chi.build_mark)) {
                    Player.p1_cash = Player.p1_cash - China.build_markCost;
                    Player.p2_cash = Player.p2_cash + China.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 60억이나해!");
                    China.p1_taxBuild_mark=true;

                }//build_mark
            }//name = chi.p2_own

        }//p1_index == 3

        //무인도

        else if (Player.p1_index == 5) {
            if (England.name.equals(eng.p2_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                England.p1_movedOtherPlayerMap=true;
                if ((England.structureNone.equals(eng.building))) {
                    Player.p1_cash = Player.p1_cash - England.buildingCost;
                    Player.p2_cash = Player.p2_cash + England.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 13억이나해!");
                    England.p1_taxBuilding=true;
                }//building
                else if ((England.structureNone.equals(eng.landmark))) {
                    Player.p1_cash = Player.p1_cash - England.landmarkCost;
                    Player.p2_cash = Player.p2_cash + England.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 26억이나해!");
                    England.p1_taxLandmark=true;
                }//landmark
                else if (England.structureNone.equals(eng.build_mark)) {
                    Player.p1_cash = Player.p1_cash - England.build_markCost;
                    Player.p2_cash = Player.p2_cash + England.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 39억이나해!");
                    England.p1_taxBuild_mark=true;
                }//build_mark
            }//eng.name = eng.p2_own

        }//p1_index == 5


        else if (Player.p1_index == 6) {
            if(TimeThread.Season.equals(TT.Summer)){
                PlayboardLog.p1_france_protesting=true;
                //System.out.println("현재 프랑스에서 집회 시위중이라서 행정업무를 처리할수없습니다.");
            }
            else {
                if (France.name.equals(fra.p2_own)) {
                    //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                    //System.out.println("돈내놔!");
                    France.p1_movedOtherPlayerMap=true;
                    if ((France.structureNone.equals(fra.building))) {
                        Player.p1_cash = Player.p1_cash - France.buildingCost;
                        Player.p2_cash = Player.p2_cash + France.buildingCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 13억이나해!");
                        France.p1_taxBuilding=true;
                    }//building
                    else if ((France.structureNone.equals(fra.landmark))) {
                        Player.p1_cash = Player.p1_cash - France.landmarkCost;
                        Player.p2_cash = Player.p2_cash + France.landmarkCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 26억이나해!");
                        France.p1_taxLandmark=true;

                    }//landmark
                    else if (France.structureNone.equals(fra.build_mark)) {
                        Player.p1_cash = Player.p1_cash - France.build_markCost;
                        Player.p2_cash = Player.p2_cash + France.build_markCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 39억이나해!");
                        France.p1_taxBuild_mark=true;
                    }//build_mark
                }//kor.name =fra.p2_own
            }//!Summer
        }//p1_index == 6


        else if (Player.p1_index == 7) {
            if (Germany.name.equals(ger.p2_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Germany.p1_movedOtherPlayerMap=true;
                if ((Germany.structureNone.equals(ger.building))) {
                    Player.p1_cash = Player.p1_cash - Germany.buildingCost;
                    Player.p2_cash = Player.p2_cash + Germany.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 13억이나해!");
                    Germany.p1_taxBuilding=true;
                }//building
                else if ((Germany.structureNone.equals(ger.landmark))) {
                    Player.p1_cash = Player.p1_cash - Germany.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Germany.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 26억이나해!");
                    Germany.p1_taxLandmark=true;

                }//landmark
                else if (Germany.structureNone.equals(ger.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Germany.build_markCost;
                    Player.p2_cash = Player.p2_cash + Germany.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 39억이나해!");
                    Germany.p1_taxBuild_mark=true;

                }//build_mark
            }//kor.name = ger.p2_own

        }//p1_index == 7


        else if (Player.p1_index == 8) {
            if (Russia.name.equals(rus.p2_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Russia.p1_movedOtherPlayerMap=true;
                if ((Russia.structureNone.equals(rus.building))) {
                    Player.p1_cash = Player.p1_cash - Russia.buildingCost;
                    Player.p2_cash = Player.p2_cash + Russia.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 13억이나해!");
                    Russia.p1_taxBuilding=true;
                }//building
                else if ((Russia.structureNone.equals(rus.landmark))) {
                    Player.p1_cash = Player.p1_cash - Russia.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Russia.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 26억이나해!");
                    Russia.p1_taxLandmark=true;

                }//landmark
                else if (Russia.structureNone.equals(rus.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Russia.build_markCost;
                    Player.p2_cash = Player.p2_cash + Russia.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 39억이나해!");
                    Russia.p1_taxBuild_mark=true;

                }//build_mark
            }//name = rus.p2_own

        }//p1_index == 8

        //tax x2

        else if (Player.p1_index == 10) {
            if (USA.name.equals(usa.p2_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                USA.p1_movedOtherPlayerMap=true;
                if ((USA.structureNone.equals(usa.building))) {
                    Player.p1_cash = Player.p1_cash - USA.buildingCost;
                    Player.p2_cash = Player.p2_cash + USA.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 16억이나해!");
                    USA.p1_taxBuilding=true;
                }//building
                else if ((USA.structureNone.equals(usa.landmark))) {
                    Player.p1_cash = Player.p1_cash - USA.landmarkCost;
                    Player.p2_cash = Player.p2_cash + USA.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 32억이나해!");
                    USA.p1_taxLandmark=true;

                }//landmark
                else if (USA.structureNone.equals(usa.build_mark)) {
                    Player.p1_cash = Player.p1_cash - USA.build_markCost;
                    Player.p2_cash = Player.p2_cash + USA.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 48억이나해!");
                    USA.p1_taxBuild_mark=true;

                }//build_mark
            }//usa.name = usa.p2_own

        }//p1_index == 10


        else if (Player.p1_index == 11) {
            if (Canada.name.equals(can.p2_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Canada.p1_movedOtherPlayerMap=true;
                if ((Canada.structureNone.equals(can.building))) {
                    Player.p1_cash = Player.p1_cash - Canada.buildingCost;
                    Player.p2_cash = Player.p2_cash + Canada.buildingCost;
                  //  System.out.println("도둑놈들 어떻게 통행료가 16억이나해!");
                    Canada.p1_taxBuilding=true;
                }//building
                else if ((Canada.structureNone.equals(can.landmark))) {
                    Player.p1_cash = Player.p1_cash - Canada.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Canada.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 32억이나해!");
                    Canada.p1_taxLandmark=true;

                }//landmark
                else if (Canada.structureNone.equals(can.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Canada.build_markCost;
                    Player.p2_cash = Player.p2_cash + Canada.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 48억이나해!");
                    Canada.p1_taxBuild_mark=true;
                }//build_mark
            }//name = can.p2_own

        }//p1_index == 11


        else if (Player.p1_index == 12) {
            if (Mexico.name.equals(mex.p2_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Mexico.p1_movedOtherPlayerMap=true;
                if ((Mexico.structureNone.equals(mex.building))) {
                    Player.p1_cash = Player.p1_cash - Mexico.buildingCost;
                    Player.p2_cash = Player.p2_cash + Mexico.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 16억이나해!");
                    Mexico.p1_taxBuilding=true;
                }//building
                else if ((Mexico.structureNone.equals(mex.landmark))) {
                    Player.p1_cash = Player.p1_cash - Mexico.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Mexico.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 32억이나해!");
                    Mexico.p1_taxLandmark=true;

                }//landmark
                else if (Mexico.structureNone.equals(mex.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Mexico.build_markCost;
                    Player.p2_cash = Player.p2_cash + Mexico.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 48억이나해!");
                    Mexico.p1_taxBuild_mark=true;
                }//build_mark
            }//kor.name = mex

        }//p1_index == 12

        //balloon

        else if (Player.p1_index == 14) {
            if (Italy.name.equals(ita.p2_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Italy.p1_movedOtherPlayerMap=true;
                if ((Italy.structureNone.equals(ita.building))) {
                    Player.p1_cash = Player.p1_cash - Italy.buildingCost;
                    Player.p2_cash = Player.p2_cash + Italy.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 10억이나해!");
                    Italy.p1_taxBuilding=true;
                }//building
                else if ((Italy.structureNone.equals(ita.landmark))) {
                    Player.p1_cash = Player.p1_cash - Italy.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Italy.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                    Italy.p1_taxLandmark=true;
                }//landmark
                else if (Italy.structureNone.equals(ita.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Italy.build_markCost;
                    Player.p2_cash = Player.p2_cash + Italy.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 30억이나해!");
                    Italy.p1_taxBuild_mark=true;

                }//build_mark
            }//kor.name = ita.p2_own

        }//p1_index == 14


        else if (Player.p1_index == 15) {
            if (Swiss.name.equals(swi.p2_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Swiss.p1_movedOtherPlayerMap=true;
                if ((Swiss.structureNone.equals(swi.building))) {
                    Player.p1_cash = Player.p1_cash - Swiss.buildingCost;
                    Player.p2_cash = Player.p2_cash + Swiss.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 10억이나해!");
                    Swiss.p1_taxBuilding=true;
                }//building
                else if ((Swiss.structureNone.equals(swi.landmark))) {
                    Player.p1_cash = Player.p1_cash - Swiss.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Swiss.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                    Swiss.p1_taxLandmark=true;
                }//landmark
                else if (Swiss.structureNone.equals(swi.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Swiss.build_markCost;
                    Player.p2_cash = Player.p2_cash + Swiss.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 30억이나해!");
                    Swiss.p1_taxBuild_mark=true;

                }//build_mark
            }//kor.name = swi.p2_own

        }//p1_index == 15


        else if (Player.p1_index == 16) {
            if (Vietnam.name.equals(vie.p2_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Vietnam.p1_movedOtherPlayerMap=true;
                if ((Vietnam.structureNone.equals(vie.building))) {
                    Player.p1_cash = Player.p1_cash - Vietnam.buildingCost;
                    Player.p2_cash = Player.p2_cash + Vietnam.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 10억이나해!");
                    Vietnam.p1_taxBuilding=true;
                }//building
                else if ((Vietnam.structureNone.equals(vie.landmark))) {
                    Player.p1_cash = Player.p1_cash - Vietnam.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Vietnam.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                    Vietnam.p1_taxLandmark=true;

                }//landmark
                else if (Vietnam.structureNone.equals(vie.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Vietnam.build_markCost;
                    Player.p2_cash = Player.p2_cash + Vietnam.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 30억이나해!");
                    Vietnam.p1_taxBuild_mark=true;

                }//build_mark
            }//kor.name = vie.p2_own

        }//p1_index == 16


        else if (Player.p1_index == 17) {
            if(TimeThread.Season.equals(TT.Winter)) {
                Egypt.p1_egyptEvent =true;
                //System.out.println("관광 사업 성수기라 관광객들이 많아서 통행 료가 2배가 되었습니다.");
                if (Egypt.name.equals(egy.p2_own)) {
                   // System.out.println("상대 플레이어와 계약을 맺은 국가에 도착 했습니다.");
                    //System.out.println("돈내놔!");
                    if ((Egypt.structureNone.equals(egy.building))) {
                        Player.p1_cash = Player.p1_cash - (Egypt.buildingCost*2);
                        Player.p2_cash = Player.p2_cash + (Egypt.buildingCost*2);
                        Egypt.p1_egyptEventBuilding =true;
                        //System.out.println("통행료가 왜 2배나 올라가! 안돼!!");
                        //System.out.println("도둑놈들 어떻게 통행료가 20억이나 해!");


                    }//building
                    else if ((Egypt.structureNone.equals(egy.landmark))) {
                        Player.p1_cash = Player.p1_cash - (Egypt.landmarkCost*2);
                        Player.p2_cash = Player.p2_cash + (Egypt.landmarkCost*2);
                        Egypt.p1_egyptEventLandmark =true;
                        //System.out.println("통행료가 왜 2배나 올라가! 안돼!!");
                        //System.out.println("도둑놈들 어떻게 통행료가 40억이나 해!");
                    }//landmark
                    else if (Egypt.structureNone.equals(egy.build_mark)) {
                        Egypt.p1_egyptEventBuild_mark =true;
                        Player.p1_cash = Player.p1_cash - (Egypt.build_markCost*2);
                        Player.p2_cash = Player.p2_cash + (Egypt.build_markCost*2);

                        //System.out.println("통행료가 왜 2배나 올라가! 안돼!!");
                        //System.out.println("도둑놈들 어떻게 통행료가 60억이나 해!");
                    }//build_mark
                }//kor.name = egy.p1_own
            }//if(Fall)
            else {
                if (Egypt.name.equals(egy.p2_own)) {
                    //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                    //System.out.println("돈내놔!");
                    Egypt.p1_movedOtherPlayerMap=true;
                    if ((Egypt.structureNone.equals(egy.building))) {
                        Player.p1_cash = Player.p1_cash - Egypt.buildingCost;
                        Player.p2_cash = Player.p2_cash + Egypt.buildingCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 10억이나해!");
                        Egypt.p1_taxBuilding=true;
                    }//building
                    else if ((Egypt.structureNone.equals(egy.landmark))) {
                        Player.p1_cash = Player.p1_cash - Egypt.landmarkCost;
                        Player.p2_cash = Player.p2_cash + Egypt.landmarkCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                        Egypt.p1_taxLandmark=true;

                    }//landmark
                    else if (Egypt.structureNone.equals(egy.build_mark)) {
                        Player.p1_cash = Player.p1_cash - Egypt.build_markCost;
                        Player.p2_cash = Player.p2_cash + Egypt.build_markCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 30억이나해!");
                        Egypt.p1_taxBuild_mark=true;

                    }//build_mark
                }//kor.name = egy.p2_own
            }//else(!Winter)
        }//p1_index == 17


    }//들어올 떄는 자유지만 나갈 때는 아니 란다!
    //p1_dontTakeMyMoney


    public void p2_dontTakeMyMoney() {

        Player player = new Player();
        Playboard board = new Playboard();
        Scanner scan = new Scanner(System.in);
        Island isl = new Island();
        France fra = new France();
        Germany ger = new Germany();
        Russia rus = new Russia();
        Taxx2 tax = new Taxx2();
        England eng = new England();
        China chi = new China();
        USA usa = new USA();
        Japan jap = new Japan();
        Canada can = new Canada();
        Korea kor = new Korea();
        Mexico mex = new Mexico();
        Start start = new Start();
        Egypt egy = new Egypt();
        Vietnam vie = new Vietnam();
        Swiss swi = new Swiss();
        Italy ita = new Italy();
        Balloon ball = new Balloon();
        TimeThread TT = new TimeThread();
        //유저1이 다른 유저가 소유 하고 있는 맵에 들어 가게 되면 건축 물에 따라 통행 세를 지불 하게 됨.
        //빌딩 10cash  랜드마크 20캐쉬   빌드_마크 30캐쉬  -> 각각의 가격을 따로 부여

        if(TurnOver.p2_turnOver){
            return;
        }//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.


        if (Player.p2_index == 1) {
            if (Korea.name.equals(kor.p1_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
               // System.out.println("돈내놔!");
                Korea.p2_movedOtherPlayerMap=true;
                if ((Korea.structureNone.equals(kor.building))) {
                    Player.p2_cash = Player.p2_cash - Korea.buildingCost;
                    Player.p1_cash = Player.p1_cash + Korea.buildingCost;
                    Korea.p2_taxBuilding=true;
                    //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                }//building
                else if ((Korea.structureNone.equals(kor.landmark))) {
                    Player.p2_cash = Player.p2_cash - Korea.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Korea.landmarkCost;
                    Korea.p2_taxLandmark=true;
                    //System.out.println("도둑놈들 어떻게 통행료가 40억이나해!");
                }//landmark
                else if (Korea.structureNone.equals(kor.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Korea.build_markCost;
                    Player.p1_cash = Player.p1_cash + Korea.build_markCost;
                    Korea.p2_taxBuild_mark=true;
                    //System.out.println("도둑놈들 어떻게 통행료가 60억이나해!");
                }//build_mark
            }//name = kor.p2_own

        }//p2_index == 1

        else if (Player.p2_index == 2) {
            if (Japan.name.equals(jap.p1_own)) {
                Japan.p2_movedOtherPlayerMap=true;
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                if ((Japan.structureNone.equals(jap.building))) {
                    Player.p2_cash = Player.p2_cash - Japan.buildingCost;
                    Player.p1_cash = Player.p1_cash + Japan.buildingCost;
                    Japan.p2_taxBuilding=true;
                    //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                }//building
                else if ((Japan.structureNone.equals(jap.landmark))) {
                    Player.p2_cash = Player.p2_cash - Japan.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Japan.landmarkCost;
                    Japan.p2_taxLandmark=true;
                    //System.out.println("도둑놈들 어떻게 통행료가 40억이나해!");

                }//landmark
                else if (Japan.structureNone.equals(jap.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Japan.build_markCost;
                    Player.p1_cash = Player.p1_cash + Japan.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 60억이나해!");
                    Japan.p2_taxBuild_mark=true;

                }//build_mark
            }//name = jap.p1_own

        }//p2_index == 2


        else if (Player.p2_index == 3) {
            if (China.name.equals(chi.p1_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                China.p2_movedOtherPlayerMap=true;
                if ((China.structureNone.equals(chi.building))) {
                    Player.p2_cash = Player.p2_cash - China.buildingCost;
                    Player.p1_cash = Player.p1_cash + China.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                    China.p2_taxBuilding=true;
                }//building
                else if ((China.structureNone.equals(chi.landmark))) {
                    Player.p2_cash = Player.p2_cash - China.landmarkCost;
                    Player.p1_cash = Player.p1_cash + China.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 40억이나해!");
                    China.p2_taxLandmark=true;
                }//landmark
                else if (China.structureNone.equals(chi.build_mark)) {
                    Player.p2_cash = Player.p2_cash - China.build_markCost;
                    Player.p1_cash = Player.p1_cash + China.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 60억이나해!");
                    China.p2_taxBuild_mark=true;
                }//build_mark
            }//name = chi.p1_own

        }//p1_index == 3

        //무인도

        else if (Player.p2_index == 5) {
            if (England.name.equals(eng.p1_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                England.p2_movedOtherPlayerMap=true;
                if ((England.structureNone.equals(eng.building))) {
                    Player.p2_cash = Player.p2_cash - England.buildingCost;
                    Player.p1_cash = Player.p1_cash + England.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 13억이나해!");
                    England.p2_taxBuilding=true;
                }//building
                else if ((England.structureNone.equals(eng.landmark))) {
                    Player.p2_cash = Player.p2_cash - England.landmarkCost;
                    Player.p1_cash = Player.p1_cash + England.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 26억이나해!");
                    England.p2_taxLandmark=true;
                }//landmark
                else if (England.structureNone.equals(eng.build_mark)) {
                    Player.p2_cash = Player.p2_cash - England.build_markCost;
                    Player.p1_cash = Player.p1_cash + England.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 39억이나해!");
                    England.p2_taxBuild_mark=true;

                }//build_mark
            }//eng.name = eng.p1_own

        }//p2_index == 5


        else if (Player.p2_index == 6) {
            if(TimeThread.Season.equals(TT.Summer)){
                PlayboardLog.p2_france_protesting=true;
                //System.out.println("현재 프랑스에서 집회 시위중이라서 행정업무를 처리할수없습니다.");
            }//equals.Summer
            else {
                if (France.name.equals(fra.p1_own)) {
                    France.p2_movedOtherPlayerMap=true;
                    //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                    //System.out.println("돈내놔!");
                    if ((France.structureNone.equals(fra.building))) {
                        Player.p2_cash = Player.p2_cash - France.buildingCost;
                        Player.p1_cash = Player.p1_cash + France.buildingCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 13억이나해!");
                        France.p2_taxBuilding=true;
                    }//building
                    else if ((France.structureNone.equals(fra.landmark))) {
                        Player.p2_cash = Player.p2_cash - France.landmarkCost;
                        Player.p1_cash = Player.p1_cash + France.landmarkCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 26억이나해!");
                        France.p2_taxLandmark=true;

                    }//landmark
                    else if (France.structureNone.equals(fra.build_mark)) {
                        Player.p2_cash = Player.p2_cash - France.build_markCost;
                        Player.p1_cash = Player.p1_cash + France.build_markCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 30억이나해!");
                        France.p2_taxBuild_mark=true;
                    }//build_mark
                }//kor.name =fra.p1_own
            }//!Summer
        }//p2_index == 6


        else if (Player.p2_index == 7) {
            if (Germany.name.equals(ger.p1_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Germany.p2_movedOtherPlayerMap=true;
                if ((Germany.structureNone.equals(ger.building))) {
                    Player.p2_cash = Player.p2_cash - Germany.buildingCost;
                    Player.p1_cash = Player.p1_cash + Germany.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 13억이나해!");
                    Germany.p2_taxBuilding=true;
                }//building
                else if ((Germany.structureNone.equals(ger.landmark))) {
                    Player.p2_cash = Player.p2_cash - Germany.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Germany.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 26억이나해!");
                    Germany.p2_taxLandmark=true;
                }//landmark
                else if (Germany.structureNone.equals(ger.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Germany.build_markCost;
                    Player.p1_cash = Player.p1_cash + Germany.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 39억이나해!");
                    Germany.p2_taxBuild_mark=true;

                }//build_mark
            }//kor.name = ger.p2_own

        }//p1_index == 7


        else if (Player.p2_index == 8) {
            if (Russia.name.equals(rus.p1_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Russia.p2_movedOtherPlayerMap=true;
                if ((Russia.structureNone.equals(rus.building))) {
                    Player.p2_cash = Player.p2_cash - Russia.buildingCost;
                    Player.p1_cash = Player.p1_cash + Russia.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 13억이나해!");
                    Russia.p2_taxBuilding=true;
                }//building
                else if ((Russia.structureNone.equals(rus.landmark))) {
                    Player.p2_cash = Player.p2_cash - Russia.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Russia.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 26억이나해!");
                    Russia.p2_taxLandmark=true;

                }//landmark
                else if (Russia.structureNone.equals(rus.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Russia.build_markCost;
                    Player.p1_cash = Player.p1_cash + Russia.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 39억이나해!");
                    Russia.p2_taxBuild_mark=true;

                }//build_mark
            }//name = rus.p1_own

        }//p2_index == 8

        //tax x2

        else if (Player.p2_index == 10) {
            if (USA.name.equals(usa.p1_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                USA.p2_movedOtherPlayerMap=true;
                if ((USA.structureNone.equals(usa.building))) {
                    Player.p2_cash = Player.p2_cash - USA.buildingCost;
                    Player.p1_cash = Player.p1_cash + USA.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 16억이나해!");
                    USA.p2_taxBuilding=true;
                }//building
                else if ((USA.structureNone.equals(usa.landmark))) {
                    Player.p2_cash = Player.p2_cash - USA.landmarkCost;
                    Player.p1_cash = Player.p1_cash + USA.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 32억이나해!");
                    USA.p2_taxLandmark=true;
                }//landmark
                else if (USA.structureNone.equals(usa.build_mark)) {
                    Player.p2_cash = Player.p2_cash - USA.build_markCost;
                    Player.p1_cash = Player.p1_cash + USA.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 48억이나해!");
                    USA.p2_taxBuild_mark=true;

                }//build_mark
            }//usa.name = usa.p1_own

        }//p2_index == 10


        else if (Player.p2_index == 11) {
            if (Canada.name.equals(can.p1_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Canada.p2_movedOtherPlayerMap=true;
                if ((Canada.structureNone.equals(can.building))) {
                    Player.p2_cash = Player.p2_cash - Canada.buildingCost;
                    Player.p1_cash = Player.p1_cash + Canada.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 16억이나해!");
                    Canada.p2_taxBuilding=true;
                }//building
                else if ((Canada.structureNone.equals(can.landmark))) {
                    Player.p2_cash = Player.p2_cash - Canada.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Canada.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 32억이나해!");
                    Canada.p2_taxLandmark=true;

                }//landmark
                else if (Canada.structureNone.equals(can.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Canada.build_markCost;
                    Player.p1_cash = Player.p1_cash + Canada.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 48억이나해!");
                    Canada.p2_taxBuild_mark=true;
                }//build_mark
            }//name = can.p1_own

        }//p2_index == 11


        else if (Player.p2_index == 12) {
            if (Mexico.name.equals(mex.p1_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Mexico.p2_movedOtherPlayerMap=true;
                if ((Mexico.structureNone.equals(mex.building))) {
                    Player.p2_cash = Player.p2_cash - Mexico.buildingCost;
                    Player.p1_cash = Player.p1_cash + Mexico.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 16억이나해!");
                    Mexico.p2_taxBuilding=true;
                }//building
                else if ((Mexico.structureNone.equals(mex.landmark))) {
                    Player.p2_cash = Player.p2_cash - Mexico.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Mexico.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 32억이나해!");
                    Mexico.p2_taxLandmark=true;
                }//landmark
                else if (Mexico.structureNone.equals(mex.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Mexico.build_markCost;
                    Player.p1_cash = Player.p1_cash + Mexico.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 48억이나해!");
                    Mexico.p2_taxBuild_mark=true;
                }//build_mark
            }//kor.name = mex

        }//p2_index == 12

        //balloon

        else if (Player.p2_index == 14) {
            if (Italy.name.equals(ita.p1_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Italy.p2_movedOtherPlayerMap=true;
                if ((Italy.structureNone.equals(ita.building))) {
                    Player.p2_cash = Player.p2_cash - Italy.buildingCost;
                    Player.p1_cash = Player.p1_cash + Italy.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 10억이나해!");
                    Italy.p2_taxBuilding=true;
                }//building
                else if ((Italy.structureNone.equals(ita.landmark))) {
                    Player.p2_cash = Player.p2_cash - Italy.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Italy.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                    Italy.p2_taxLandmark=true;
                }//landmark
                else if (Italy.structureNone.equals(ita.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Italy.build_markCost;
                    Player.p1_cash = Player.p1_cash + Italy.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 30억이나해!");
                    Italy.p2_taxBuild_mark=true;
                }//build_mark
            }//kor.name = ita.p1_own

        }//p2_index == 14


        else if (Player.p2_index == 15) {
            if (Swiss.name.equals(swi.p1_own)) {
                //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                //System.out.println("돈내놔!");
                Swiss.p2_movedOtherPlayerMap=true;
                if ((Swiss.structureNone.equals(swi.building))) {
                    Player.p2_cash = Player.p2_cash - Swiss.buildingCost;
                    Player.p1_cash = Player.p1_cash + Swiss.buildingCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 10억이나해!");
                    Swiss.p2_taxBuilding=true;
                }//building
                else if ((Swiss.structureNone.equals(swi.landmark))) {
                    Player.p2_cash = Player.p2_cash - Swiss.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Swiss.landmarkCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                    Swiss.p2_taxLandmark=true;

                }//landmark
                else if (Swiss.structureNone.equals(swi.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Swiss.build_markCost;
                    Player.p1_cash = Player.p1_cash + Swiss.build_markCost;
                    //System.out.println("도둑놈들 어떻게 통행료가 30억이나해!");
                    Swiss.p2_taxBuild_mark=true;
                }//build_mark
            }//kor.name = swi.p1_own

        }//p2_index == 15


        else if (Player.p2_index == 16) {
            if(TimeThread.Season.equals(TT.Fall)){
                System.out.println("올해 농사가 풍년이라 세금을 감면받았다 :)");
            }
            else {
                if (Vietnam.name.equals(vie.p1_own)) {
                    //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                    //System.out.println("돈내놔!");
                    Vietnam.p2_movedOtherPlayerMap=true;
                    if ((Vietnam.structureNone.equals(vie.building))) {
                        Player.p2_cash = Player.p2_cash - Vietnam.buildingCost;
                        Player.p1_cash = Player.p1_cash + Vietnam.buildingCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 10억이나해!");
                        Vietnam.p2_taxBuilding=true;
                    }//building
                    else if ((Vietnam.structureNone.equals(vie.landmark))) {
                        Player.p2_cash = Player.p2_cash - Vietnam.landmarkCost;
                        Player.p1_cash = Player.p1_cash + Vietnam.landmarkCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                        Vietnam.p2_taxLandmark=true;
                    }//landmark
                    else if (Vietnam.structureNone.equals(vie.build_mark)) {
                        Player.p2_cash = Player.p2_cash - Vietnam.build_markCost;
                        Player.p1_cash = Player.p1_cash + Vietnam.build_markCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 30억이나해!");
                        Vietnam.p2_taxBuild_mark=true;
                    }//build_mark
                }//kor.name = vie.p1_own
            }//else(!Fall)
        }//p2_index == 16


        else if (Player.p2_index == 17) {
            if(TimeThread.Season.equals(TT.Winter)) {
                System.out.println("관광 사업 성수기라 관광객들이 많아서 통행료가 2배가 되었습니다.");
                if (Egypt.name.equals(egy.p1_own)) {
                   // System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                    //System.out.println("돈내놔!");

                    if ((Egypt.structureNone.equals(egy.building))) {
                        Player.p2_cash = Player.p2_cash - (Egypt.buildingCost*2);
                        Player.p1_cash = Player.p1_cash + (Egypt.buildingCost*2);
                        //System.out.println("도둑놈들 어떻게 통행료가 10억이나 해!");
                        //System.out.println("통행료가 왜 2배나 올라가! 안돼!!");

                    }//building
                    else if ((Egypt.structureNone.equals(egy.landmark))) {
                        Player.p2_cash = Player.p2_cash - (Egypt.landmarkCost*2);
                        Player.p1_cash = Player.p1_cash + (Egypt.landmarkCost*2);
                        //System.out.println("도둑놈들 어떻게 통행료가 20억이나 해!");
                        //System.out.println("통행료가 왜 2배나 올라가! 안돼!!");

                    }//landmark
                    else if (Egypt.structureNone.equals(egy.build_mark)) {
                        Player.p2_cash = Player.p2_cash - (Egypt.build_markCost*2);
                        Player.p1_cash = Player.p1_cash + (Egypt.build_markCost*2);
                        //System.out.println("도둑놈들 어떻게 통행료가 30억이나 해!");
                        //System.out.println("통행료가 왜 2배나 올라가! 안돼!!");

                    }//build_mark
                }//kor.name = egy.p2_own
            }//if(Fall)
            else {
                if (Egypt.name.equals(egy.p1_own)) {
                    Egypt.p2_movedOtherPlayerMap=true;
                    //System.out.println("상대 플레이어와 계약을 맺은 국가에 도착했습니다.");
                    //System.out.println("돈내놔!");
                    if ((Egypt.structureNone.equals(egy.building))) {
                        Player.p2_cash = Player.p2_cash - Egypt.buildingCost;
                        Player.p1_cash = Player.p1_cash + Egypt.buildingCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 10억이나해!");
                        Egypt.p2_taxBuilding=true;
                    }//building
                    else if ((Egypt.structureNone.equals(egy.landmark))) {
                        Player.p2_cash = Player.p2_cash - Egypt.landmarkCost;
                        Player.p1_cash = Player.p1_cash + Egypt.landmarkCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 20억이나해!");
                        Egypt.p2_taxLandmark=true;
                    }//landmark
                    else if (Egypt.structureNone.equals(egy.build_mark)) {
                        Player.p2_cash = Player.p2_cash - Egypt.build_markCost;
                        Player.p1_cash = Player.p1_cash + Egypt.build_markCost;
                        //System.out.println("도둑놈들 어떻게 통행료가 30억이나해!");
                        Egypt.p2_taxBuild_mark=true;
                    }//build_mark
                }//kor.name = egy.p2_own
            }//else(!Winter)
        }//p1_index == 17


    }//들어올 떄는 자유지만 나갈 때는 아니란다!
    //p2_dontTakeMyMoney

    public void p1_willTakeYourMap() {
        p1_doNotActiveReturn=true;
        Player player = new Player();
        Place pla_player1 = new Place();
        Playboard board = new Playboard();
        Scanner scan = new Scanner(System.in);
        Island isl = new Island();
        France fra = new France();
        Germany ger = new Germany();
        Russia rus = new Russia();
        Taxx2 tax = new Taxx2();
        England eng = new England();
        China chi = new China();
        USA usa = new USA();
        Japan jap = new Japan();
        Canada can = new Canada();
        Korea kor = new Korea();
        Mexico mex = new Mexico();
        Start start = new Start();
        Egypt egy = new Egypt();
        Vietnam vie = new Vietnam();
        Swiss swi = new Swiss();
        Italy ita = new Italy();
        Balloon ball = new Balloon();
        TimeThread TT = new TimeThread();

        String choice;
        String yes = "dd";
        String no = "ss";
        String YES = "ㅇㅇ";
        String NO = "ㄴㄴ";

        if(TurnOver.p1_turnOver){
            return;
        }//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.


        if (Player.p1_index == 1) {

            if (Korea.name.equals(kor.p2_own)) {

                if (Korea.structureNone.equals(kor.building)) {
                    if (Japan.structureNone.equals(jap.p2_own) && China.structureNone.equals(chi.p2_own)) {
                        //System.out.println("아직 국가와 독점 계약을 맺지 않아서 구매할수있습니다.");
                       // System.out.println(kor.travel + "을(를) 구매하시겠습니까?");
                       // System.out.println("가격은 22억 입니다.");
                       // System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력해 주세요  :)");
                      //  System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력해 주세요.");
                        Korea.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(kor.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 22억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 22억원이 증가했습니다.");
                                System.out.println("왼쪽 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 22;
                                Player.p2_cash = Player.p2_cash + 22;
                                kor.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                Korea.buildingCost = Korea.buildingCost / 2;
                                Korea.landmarkCost = Korea.landmarkCost / 2;
                                Korea.build_markCost = Korea.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고 있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(kor.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 22억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Korea.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(kor.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 22억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 22억원이 증가했습니다.");
                                Korea.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 22;
                                Player.p2_cash = Player.p2_cash + 22;
                                kor.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own)

        }//p1_index==1


        else if (Player.p1_index == 2) {
            if (Japan.name.equals(jap.p2_own)) {
                if (Japan.structureNone.equals(jap.building)) {
                    if (Korea.structureNone.equals(kor.p2_own) && China.structureNone.equals(chi.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(jap.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 22억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Japan.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(jap.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 22억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 22억원이 증가했습니다.");
                                System.out.println("왼쪽 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 22;
                                Player.p2_cash = Player.p2_cash + 22;
                                jap.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                Korea.buildingCost = Korea.buildingCost / 2;
                                Korea.landmarkCost = Korea.landmarkCost / 2;
                                Korea.build_markCost = Korea.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점 하고 있엇는 지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(jap.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 22억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                       Japan.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(jap.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 22억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 22억원이 증가했습니다.");
                                Japan.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 22;
                                Player.p2_cash = Player.p2_cash + 22;
                                jap.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own)

        }//p1_index==2


        else if (Player.p1_index == 3) {
            if (China.name.equals(chi.p2_own)) {
                if (China.structureNone.equals(chi.building)) {
                    if (Japan.structureNone.equals(jap.p2_own) && Korea.structureNone.equals(kor.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(chi.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 22억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        China.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(chi.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 22억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 22억원이 증가했습니다.");
                                System.out.println("왼쪽 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 22;
                                Player.p2_cash = Player.p2_cash + 22;
                                chi.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                Korea.buildingCost = Korea.buildingCost / 2;
                                Korea.landmarkCost = Korea.landmarkCost / 2;
                                Korea.build_markCost = Korea.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(chi.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 22억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        China.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(chi.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 22억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 22억원이 증가했습니다.");
                                China.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 22;
                                Player.p2_cash = Player.p2_cash + 22;
                                chi.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building
            }//chi.p2_own
        }//p1_index==3


        else if (Player.p1_index == 5) {
            if (England.name.equals(eng.p2_own)) {
                if (England.structureNone.equals(eng.building)) {
                    if (France.structureNone.equals(fra.p2_own) && Russia.structureNone.equals(rus.p2_own) && Germany.structureNone.equals(ger.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(eng.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        England.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(eng.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 14억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 14억원이 증가했습니다.");
                                System.out.println("위쪽 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                eng.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                England.buildingCost = England.buildingCost / 2;
                                England.landmarkCost = England.landmarkCost / 2;
                                England.build_markCost = England.build_markCost / 2;

                                Germany.buildingCost = Germany.buildingCost / 2;
                                Germany.landmarkCost = Germany.landmarkCost / 2;
                                Germany.build_markCost = Germany.build_markCost / 2;

                                Russia.buildingCost = Russia.buildingCost / 2;
                                Russia.landmarkCost = Russia.landmarkCost / 2;
                                Russia.build_markCost = Russia.build_markCost / 2;

                                France.buildingCost = France.buildingCost / 2;
                                France.landmarkCost = France.landmarkCost / 2;
                                France.build_markCost = France.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(eng.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        England.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(eng.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 14억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 14억원이 증가했습니다.");
                                England.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                eng.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own)

        }//p1_index==5


        else if (Player.p1_index == 6) {
            if(TimeThread.Season.equals(TT.Summer)){
               PlayboardLog.p1_france_protesting=true;
               // System.out.println("현재 프랑스에서 집회 시위중이라서 행정업무를 처리할수없습니다.");
            }
            else{
            if (France.name.equals(fra.p2_own)) {
                if (France.structureNone.equals(fra.building)) {
                    if (England.structureNone.equals(eng.p2_own) && Russia.structureNone.equals(rus.p2_own) && Germany.structureNone.equals(ger.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(fra.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        France.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(fra.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 14억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 14억원이 증가했습니다.");
                                System.out.println("위쪽 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                fra.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                England.buildingCost = England.buildingCost / 2;
                                England.landmarkCost = England.landmarkCost / 2;
                                England.build_markCost = England.build_markCost / 2;

                                Germany.buildingCost = Germany.buildingCost / 2;
                                Germany.landmarkCost = Germany.landmarkCost / 2;
                                Germany.build_markCost = Germany.build_markCost / 2;

                                Russia.buildingCost = Russia.buildingCost / 2;
                                Russia.landmarkCost = Russia.landmarkCost / 2;
                                Russia.build_markCost = Russia.build_markCost / 2;

                                France.buildingCost = France.buildingCost / 2;
                                France.landmarkCost = France.landmarkCost / 2;
                                France.build_markCost = France.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(fra.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        France.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(fra.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 14억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 14억원이 증가했습니다.");
                                France.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                fra.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own)
            }//!summer
        }//p1_index==6


        else if (Player.p1_index == 7) {
            if (Germany.name.equals(ger.p2_own)) {
                if (Germany.structureNone.equals(ger.building)) {
                    if (France.structureNone.equals(fra.p2_own) && Russia.structureNone.equals(rus.p2_own) && England.structureNone.equals(eng.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(ger.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Germany.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(ger.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 14억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 14억원이 증가했습니다.");
                                System.out.println("위쪽 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                ger.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                England.buildingCost = England.buildingCost / 2;
                                England.landmarkCost = England.landmarkCost / 2;
                                England.build_markCost = England.build_markCost / 2;

                                Germany.buildingCost = Germany.buildingCost / 2;
                                Germany.landmarkCost = Germany.landmarkCost / 2;
                                Germany.build_markCost = Germany.build_markCost / 2;

                                Russia.buildingCost = Russia.buildingCost / 2;
                                Russia.landmarkCost = Russia.landmarkCost / 2;
                                Russia.build_markCost = Russia.build_markCost / 2;

                                France.buildingCost = France.buildingCost / 2;
                                France.landmarkCost = France.landmarkCost / 2;
                                France.build_markCost = France.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(ger.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Germany.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(ger.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 14억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 14억원이 증가했습니다.");
                                Germany.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                ger.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own)ger

        }//p1_index==7


        else if (Player.p1_index == 8) {
            if (Russia.name.equals(rus.p2_own)) {
                if (Russia.structureNone.equals(rus.building)) {
                    if (France.structureNone.equals(fra.p2_own) && England.structureNone.equals(eng.p2_own) && Germany.structureNone.equals(ger.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(rus.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Russia.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(rus.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 14억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 14억원이 증가했습니다.");
                                System.out.println("위쪽 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                rus.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                England.buildingCost = England.buildingCost / 2;
                                England.landmarkCost = England.landmarkCost / 2;
                                England.build_markCost = England.build_markCost / 2;

                                Germany.buildingCost = Germany.buildingCost / 2;
                                Germany.landmarkCost = Germany.landmarkCost / 2;
                                Germany.build_markCost = Germany.build_markCost / 2;

                                Russia.buildingCost = Russia.buildingCost / 2;
                                Russia.landmarkCost = Russia.landmarkCost / 2;
                                Russia.build_markCost = Russia.build_markCost / 2;

                                France.buildingCost = France.buildingCost / 2;
                                France.landmarkCost = France.landmarkCost / 2;
                                France.build_markCost = France.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(rus.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Russia.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(rus.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 14억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 14억원이 증가했습니다.");
                                Russia.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                rus.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own)

        }//p1_index==8


        else if (Player.p1_index == 10) {
            if (USA.name.equals(usa.p2_own)) {
                if (USA.structureNone.equals(usa.building)) {
                    if (Canada.structureNone.equals(can.p2_own) && Mexico.structureNone.equals(mex.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(usa.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        USA.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(usa.travel + "을(를) 구매 했습니다.");
                                System.out.println("플레이어1의 현금이 18억원이 감소 했습니다.");
                                System.out.println("플레이어2의 현금이 18억원이 증가 했습니다.");
                                System.out.println("우측 라인 독점이 해제 되었습니다.");
                                Player.p1_cash = Player.p1_cash - 18;
                                Player.p2_cash = Player.p2_cash + 18;
                                eng.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                USA.buildingCost = USA.buildingCost / 2;
                                USA.landmarkCost = USA.landmarkCost / 2;
                                USA.build_markCost = USA.build_markCost / 2;

                                Mexico.buildingCost = Mexico.buildingCost / 2;
                                Mexico.landmarkCost = Mexico.landmarkCost / 2;
                                Mexico.build_markCost = Mexico.build_markCost / 2;

                                Canada.buildingCost = Canada.buildingCost / 2;
                                Canada.landmarkCost = Canada.landmarkCost / 2;
                                Canada.build_markCost = Canada.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(usa.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        USA.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(usa.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 18억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 18억원이 증가했습니다.");
                                USA.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 18;
                                Player.p2_cash = Player.p2_cash + 18;
                                usa.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own)

        }//p1_index==10


        else if (Player.p1_index == 11) {
            if (Canada.name.equals(can.p2_own)) {
                if (Canada.structureNone.equals(can.building)) {
                    if (USA.structureNone.equals(usa.p2_own) && Mexico.structureNone.equals(mex.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(can.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Canada.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(can.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 18억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 18억원이 증가했습니다.");
                                System.out.println("우측 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 18;
                                Player.p2_cash = Player.p2_cash + 18;
                                can.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                USA.buildingCost = USA.buildingCost / 2;
                                USA.landmarkCost = USA.landmarkCost / 2;
                                USA.build_markCost = USA.build_markCost / 2;

                                Mexico.buildingCost = Mexico.buildingCost / 2;
                                Mexico.landmarkCost = Mexico.landmarkCost / 2;
                                Mexico.build_markCost = Mexico.build_markCost / 2;

                                Canada.buildingCost = Canada.buildingCost / 2;
                                Canada.landmarkCost = Canada.landmarkCost / 2;
                                Canada.build_markCost = Canada.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(can.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            Canada.p1_willTakeYourMap=true;
                            board.playboard();
                            while (true) {
                                choice = scan.nextLine();
                                if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(can.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 18억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 18억원이 증가했습니다.");
                                Canada.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 18;
                                Player.p2_cash = Player.p2_cash + 18;
                                can.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own) can

        }//p1_index==11


        else if (Player.p1_index == 12) {
            if (Mexico.name.equals(mex.p2_own)) {
                if (Mexico.structureNone.equals(mex.building)) {
                    if (Canada.structureNone.equals(can.p2_own) && USA.structureNone.equals(usa.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(mex.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Mexico.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(mex.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 18억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 18억원이 증가했습니다.");
                                System.out.println("우측 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 18;
                                Player.p2_cash = Player.p2_cash + 18;
                                mex.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                USA.buildingCost = USA.buildingCost / 2;
                                USA.landmarkCost = USA.landmarkCost / 2;
                                USA.build_markCost = USA.build_markCost / 2;

                                Mexico.buildingCost = Mexico.buildingCost / 2;
                                Mexico.landmarkCost = Mexico.landmarkCost / 2;
                                Mexico.build_markCost = Mexico.build_markCost / 2;

                                Canada.buildingCost = Canada.buildingCost / 2;
                                Canada.landmarkCost = Canada.landmarkCost / 2;
                                Canada.build_markCost = Canada.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(mex.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Mexico.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(mex.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 18억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 18억원이 증가했습니다.");
                                Mexico.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 18;
                                Player.p2_cash = Player.p2_cash + 18;
                                mex.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own)

        }//p1_index==12


        else if (Player.p1_index == 14) {
            if (Italy.name.equals(ita.p2_own)) {
                if (Italy.structureNone.equals(ita.building)) {
                    if (Swiss.structureNone.equals(swi.p2_own) && Vietnam.structureNone.equals(vie.p2_own) && Egypt.structureNone.equals(egy.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(ita.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Italy.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(ita.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 11억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 11억원이 증가했습니다.");
                                System.out.println("아래쪽 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                ita.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                Italy.buildingCost = Italy.buildingCost / 2;
                                Italy.landmarkCost = Italy.landmarkCost / 2;
                                Italy.build_markCost = Italy.build_markCost / 2;

                                Swiss.buildingCost = Swiss.buildingCost / 2;
                                Swiss.landmarkCost = Swiss.landmarkCost / 2;
                                Swiss.build_markCost = Swiss.build_markCost / 2;

                                Vietnam.buildingCost = Vietnam.buildingCost / 2;
                                Vietnam.landmarkCost = Vietnam.landmarkCost / 2;
                                Vietnam.build_markCost = Vietnam.build_markCost / 2;

                                Egypt.buildingCost = Egypt.buildingCost / 2;
                                Egypt.landmarkCost = Egypt.landmarkCost / 2;
                                Egypt.build_markCost = Egypt.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(ita.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Italy.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(ita.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 11억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 11억원이 증가했습니다.");
                                Italy.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                ita.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own)

        }//p1_index==14


        else if (Player.p1_index == 15) {
            if (Swiss.name.equals(swi.p2_own)) {
                if (Swiss.structureNone.equals(swi.building)) {
                    if (Italy.structureNone.equals(ita.p2_own) && Vietnam.structureNone.equals(vie.p2_own) && Egypt.structureNone.equals(egy.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(swi.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Swiss.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(swi.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 11억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 11억원이 증가했습니다.");
                                System.out.println("아래쪽 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                swi.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                Italy.buildingCost = Italy.buildingCost / 2;
                                Italy.landmarkCost = Italy.landmarkCost / 2;
                                Italy.build_markCost = Italy.build_markCost / 2;

                                Swiss.buildingCost = Swiss.buildingCost / 2;
                                Swiss.landmarkCost = Swiss.landmarkCost / 2;
                                Swiss.build_markCost = Swiss.build_markCost / 2;

                                Vietnam.buildingCost = Vietnam.buildingCost / 2;
                                Vietnam.landmarkCost = Vietnam.landmarkCost / 2;
                                Vietnam.build_markCost = Vietnam.build_markCost / 2;

                                Egypt.buildingCost = Egypt.buildingCost / 2;
                                Egypt.landmarkCost = Egypt.landmarkCost / 2;
                                Egypt.build_markCost = Egypt.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(swi.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Swiss.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(swi.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 11억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 11억원이 증가했습니다.");
                                Swiss.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                swi.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우

                }//building


            }//name.equals(p2_own) swi

        }//p1_index==15


        else if (Player.p1_index == 16) {
            if (Vietnam.name.equals(vie.p2_own)) {
                if (Vietnam.structureNone.equals(vie.building)) {
                    if (Swiss.structureNone.equals(swi.p2_own) && Italy.structureNone.equals(ita.p2_own) && Egypt.structureNone.equals(egy.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(vie.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Vietnam.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(vie.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 11억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 11억원이 증가했습니다.");
                                System.out.println("아래쪽 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                vie.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                Italy.buildingCost = Italy.buildingCost / 2;
                                Italy.landmarkCost = Italy.landmarkCost / 2;
                                Italy.build_markCost = Italy.build_markCost / 2;

                                Swiss.buildingCost = Swiss.buildingCost / 2;
                                Swiss.landmarkCost = Swiss.landmarkCost / 2;
                                Swiss.build_markCost = Swiss.build_markCost / 2;

                                Vietnam.buildingCost = Vietnam.buildingCost / 2;
                                Vietnam.landmarkCost = Vietnam.landmarkCost / 2;
                                Vietnam.build_markCost = Vietnam.build_markCost / 2;

                                Egypt.buildingCost = Egypt.buildingCost / 2;
                                Egypt.landmarkCost = Egypt.landmarkCost / 2;
                                Egypt.build_markCost = Egypt.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(vie.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Vietnam.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(vie.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 11억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 11억원이 증가했습니다.");
                                Vietnam.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                vie.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우

                }//building


            }//name.equals(p2_own) vie

        }//p1_index==16

        else if (Player.p1_index == 17) {
            if (Egypt.name.equals(egy.p2_own)) {
                if (Egypt.structureNone.equals(egy.building)) {
                    if (Swiss.structureNone.equals(swi.p2_own) && Vietnam.structureNone.equals(vie.p2_own) && Italy.structureNone.equals(ita.p2_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(ita.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Egypt.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(egy.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어1의 현금이 11억원이 감소했습니다.");
                                System.out.println("플레이어2의 현금이 11억원이 증가했습니다.");
                                System.out.println("아래쪽 라인독점이 해제되었습니다.");
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                egy.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;

                                Italy.buildingCost = Italy.buildingCost / 2;
                                Italy.landmarkCost = Italy.landmarkCost / 2;
                                Italy.build_markCost = Italy.build_markCost / 2;

                                Swiss.buildingCost = Swiss.buildingCost / 2;
                                Swiss.landmarkCost = Swiss.landmarkCost / 2;
                                Swiss.build_markCost = Swiss.build_markCost / 2;

                                Vietnam.buildingCost = Vietnam.buildingCost / 2;
                                Vietnam.landmarkCost = Vietnam.landmarkCost / 2;
                                Vietnam.build_markCost = Vietnam.build_markCost / 2;

                                Egypt.buildingCost = Egypt.buildingCost / 2;
                                Egypt.landmarkCost = Egypt.landmarkCost / 2;
                                Egypt.build_markCost = Egypt.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(egy.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Egypt.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(egy.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어1의 현금이 11억원이 감소했습니다.");
//                                System.out.println("플레이어2의 현금이 11억원이 증가했습니다.");
                                Egypt.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                egy.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우

                }//building


            }//name.equals(p2_own) egy

        }//p1_index==17


    }
    //p1_willTakeYourMap()


    public void p2_willTakeYourMap() {
        p2_doNotActiveReturn=true;
        Player player = new Player();
        Place pla_player1 = new Place();
        Playboard board = new Playboard();
        Scanner scan = new Scanner(System.in);
        Island isl = new Island();
        France fra = new France();
        Germany ger = new Germany();
        Russia rus = new Russia();
        Taxx2 tax = new Taxx2();
        England eng = new England();
        China chi = new China();
        USA usa = new USA();
        Japan jap = new Japan();
        Canada can = new Canada();
        Korea kor = new Korea();
        Mexico mex = new Mexico();
        Start start = new Start();
        Egypt egy = new Egypt();
        Vietnam vie = new Vietnam();
        Swiss swi = new Swiss();
        Italy ita = new Italy();
        Balloon ball = new Balloon();
        TimeThread TT = new TimeThread();

        String choice;
        String yes = "dd";
        String no = "ㄴㄴ";
        String YES = "ㅇㅇ";
        String NO = "ss";


        if(TurnOver.p2_turnOver){
            return;
        }//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.

        if (Player.p2_index == 1) {
            if (Korea.name.equals(kor.p1_own)) {
                if (Korea.structureNone.equals(kor.building)) {
                    if (Japan.structureNone.equals(jap.p1_own) && China.structureNone.equals(chi.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(kor.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 22억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Korea.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(kor.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 22억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 22억원이 증가했습니다.");
                                System.out.println("왼쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 22;
                                Player.p1_cash = Player.p1_cash + 22;
                                kor.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                Korea.buildingCost = Korea.buildingCost / 2;
                                Korea.landmarkCost = Korea.landmarkCost / 2;
                                Korea.build_markCost = Korea.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부


                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(kor.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 22억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Korea.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(kor.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 22억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 22억원이 증가했습니다.");
                                Korea.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 22;
                                Player.p1_cash = Player.p1_cash + 22;
                                kor.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own)

        }//p1_index==1


        else if (Player.p2_index == 2) {
            if (Japan.name.equals(jap.p1_own)) {
                if (Japan.structureNone.equals(jap.building)) {
                    if (Korea.structureNone.equals(kor.p1_own) && China.structureNone.equals(chi.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(jap.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 22억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Japan.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(jap.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 22억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 22억원이 증가했습니다.");
                                System.out.println("왼쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 22;
                                Player.p1_cash = Player.p1_cash + 22;
                                jap.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                Korea.buildingCost = Korea.buildingCost / 2;
                                Korea.landmarkCost = Korea.landmarkCost / 2;
                                Korea.build_markCost = Korea.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(jap.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 22억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Japan.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(jap.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 22억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 22억원이 증가했습니다.");
                                Japan.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 22;
                                Player.p1_cash = Player.p1_cash + 22;
                                jap.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p1_own)

        }//p2_index==2


        else if (Player.p2_index == 3) {
            if (China.name.equals(chi.p1_own)) {
                if (China.structureNone.equals(chi.building)) {
                    if (Japan.structureNone.equals(jap.p1_own) && Korea.structureNone.equals(kor.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(chi.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 22억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        China.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(chi.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 22억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 22억원이 증가했습니다.");
                                System.out.println("왼쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 22;
                                Player.p1_cash = Player.p1_cash + 22;
                                chi.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                Korea.buildingCost = Korea.buildingCost / 2;
                                Korea.landmarkCost = Korea.landmarkCost / 2;
                                Korea.build_markCost = Korea.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                Japan.buildingCost = Japan.buildingCost / 2;
                                Japan.landmarkCost = Japan.landmarkCost / 2;
                                Japan.build_markCost = Japan.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(chi.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 22억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        China.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(chi.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 22억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 22억원이 증가했습니다.");
                                China.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 22;
                                Player.p1_cash = Player.p1_cash + 22;
                                chi.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building
            }//chi.p1_own
        }//p1_index==3


        else if (Player.p2_index == 5) {
            if (England.name.equals(eng.p1_own)) {
                if (England.structureNone.equals(eng.building)) {
                    if (France.structureNone.equals(fra.p1_own) && Russia.structureNone.equals(rus.p1_own) && Germany.structureNone.equals(ger.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(eng.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        England.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(eng.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 14억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 14억원이 증가했습니다.");
                                System.out.println("위쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 14;
                                Player.p1_cash = Player.p1_cash + 14;
                                eng.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                England.buildingCost = England.buildingCost / 2;
                                England.landmarkCost = England.landmarkCost / 2;
                                England.build_markCost = England.build_markCost / 2;

                                Germany.buildingCost = Germany.buildingCost / 2;
                                Germany.landmarkCost = Germany.landmarkCost / 2;
                                Germany.build_markCost = Germany.build_markCost / 2;

                                Russia.buildingCost = Russia.buildingCost / 2;
                                Russia.landmarkCost = Russia.landmarkCost / 2;
                                Russia.build_markCost = Russia.build_markCost / 2;

                                France.buildingCost = France.buildingCost / 2;
                                France.landmarkCost = France.landmarkCost / 2;
                                France.build_markCost = France.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(eng.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                        England.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(eng.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 14억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 14억원이 증가했습니다.");
                                England.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 14;
                                Player.p1_cash = Player.p1_cash + 14;
                                eng.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p1_own)

        }//p2_index==5


        else if (Player.p2_index == 6) {
            if(TimeThread.Season.equals(TT.Summer)){
                System.out.println("현재 프랑스에서 집회 시위중이라서 행정업무를 처리할수없습니다.");
            }
            else {
                if (France.name.equals(fra.p1_own)) {
                    if (France.structureNone.equals(fra.building)) {
                        if (England.structureNone.equals(eng.p1_own) && Russia.structureNone.equals(rus.p1_own) && Germany.structureNone.equals(ger.p1_own)) {
//                            System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                            System.out.println(fra.travel + "을(를) 구매하시겠습니까?");
//                            System.out.println("가격은 14억입니다.");
//                            System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                            System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            France.p2_willTakeYourMap=true;
                            board.playboard();
                            while (true) {
                                choice = scan.nextLine();
                                if (choice.equals(yes) || choice.equals(YES)) {
                                    System.out.println(fra.travel + "을(를) 구매했습니다.");
                                    System.out.println("플레이어2의 현금이 14억원이 감소했습니다.");
                                    System.out.println("플레이어1의 현금이 14억원이 증가했습니다.");
                                    System.out.println("위쪽 라인독점이 해제되었습니다.");
                                    Player.p2_cash = Player.p2_cash - 14;
                                    Player.p1_cash = Player.p1_cash + 14;
                                    fra.buyOwn1p();
                                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                    England.buildingCost = England.buildingCost / 2;
                                    England.landmarkCost = England.landmarkCost / 2;
                                    England.build_markCost = England.build_markCost / 2;

                                    Germany.buildingCost = Germany.buildingCost / 2;
                                    Germany.landmarkCost = Germany.landmarkCost / 2;
                                    Germany.build_markCost = Germany.build_markCost / 2;

                                    Russia.buildingCost = Russia.buildingCost / 2;
                                    Russia.landmarkCost = Russia.landmarkCost / 2;
                                    Russia.build_markCost = Russia.build_markCost / 2;

                                    France.buildingCost = France.buildingCost / 2;
                                    France.landmarkCost = France.landmarkCost / 2;
                                    France.build_markCost = France.build_markCost / 2;

                                    //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                    break;
                                }//yes
                                else if (choice.equals(no) || choice.equals(NO)) {


                                    break;
                                }//no
                                else {
                                    System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                    System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                                }//else
                            }//while


                        }//라인을 독점하고있엇는지에 대한 여부
                        else {
//                            System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                            System.out.println(fra.travel + "을(를) 구매하시겠습니까?");
//                            System.out.println("가격은 14억입니다.");
//                            System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                            System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            France.p2_willTakeYourMap=true;
                            board.playboard();
                            while (true) {
                                choice = scan.nextLine();
                                if (choice.equals(yes) || choice.equals(YES)) {
//                                    System.out.println(fra.travel + "을(를) 구매했습니다.");
//                                    System.out.println("플레이어2의 현금이 14억원이 감소했습니다.");
//                                    System.out.println("플레이어1의 현금이 14억원이 증가했습니다.");
                                    France.p2_willTakeYourMapYes=true;
                                    Player.p2_cash = Player.p2_cash - 14;
                                    Player.p1_cash = Player.p1_cash + 14;
                                    fra.buyOwn1p();
                                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                    //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                    break;
                                }//yes
                                else if (choice.equals(no) || choice.equals(NO)) {


                                    break;
                                }//no
                                else {
                                    System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                    System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                                }//else
                            }//while
                        }//라인 독점 안하고있던 경우
                    }//building


                }//name.equals(p1_own)
            }//else !Summer
        }//p2_index==6


        //저장독일위
        else if (Player.p2_index == 7) {
            if (Germany.name.equals(ger.p1_own)) {
                if (Germany.structureNone.equals(ger.building)) {
                    if (England.structureNone.equals(eng.p1_own) && Russia.structureNone.equals(rus.p1_own) && France.structureNone.equals(fra.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(ger.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Germany.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(ger.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 14억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 14억원이 증가했습니다.");
                                System.out.println("위쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 14;
                                Player.p1_cash = Player.p1_cash + 14;
                                ger.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                England.buildingCost = England.buildingCost / 2;
                                England.landmarkCost = England.landmarkCost / 2;
                                England.build_markCost = England.build_markCost / 2;

                                Germany.buildingCost = Germany.buildingCost / 2;
                                Germany.landmarkCost = Germany.landmarkCost / 2;
                                Germany.build_markCost = Germany.build_markCost / 2;

                                Russia.buildingCost = Russia.buildingCost / 2;
                                Russia.landmarkCost = Russia.landmarkCost / 2;
                                Russia.build_markCost = Russia.build_markCost / 2;

                                France.buildingCost = France.buildingCost / 2;
                                France.landmarkCost = France.landmarkCost / 2;
                                France.build_markCost = France.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(ger.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Germany.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(ger.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 14억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 14억원이 증가했습니다.");
                                Germany.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 14;
                                Player.p1_cash = Player.p1_cash + 14;
                                ger.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {

                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p1_own)ger

        }//p2_index==7


        else if (Player.p2_index == 8) {
            if (Russia.name.equals(rus.p1_own)) {
                if (Russia.structureNone.equals(rus.building)) {
                    if (England.structureNone.equals(eng.p1_own) && Germany.structureNone.equals(ger.p1_own) && France.structureNone.equals(fra.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(rus.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Russia.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(rus.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 14억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 14억원이 증가했습니다.");
                                System.out.println("위쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 14;
                                Player.p1_cash = Player.p1_cash + 14;
                                rus.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                England.buildingCost = England.buildingCost / 2;
                                England.landmarkCost = England.landmarkCost / 2;
                                England.build_markCost = England.build_markCost / 2;

                                Germany.buildingCost = Germany.buildingCost / 2;
                                Germany.landmarkCost = Germany.landmarkCost / 2;
                                Germany.build_markCost = Germany.build_markCost / 2;

                                Russia.buildingCost = Russia.buildingCost / 2;
                                Russia.landmarkCost = Russia.landmarkCost / 2;
                                Russia.build_markCost = Russia.build_markCost / 2;

                                France.buildingCost = France.buildingCost / 2;
                                France.landmarkCost = France.landmarkCost / 2;
                                France.build_markCost = France.build_markCost / 2;

                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(rus.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 14억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Russia.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(rus.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 14억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 14억원이 증가했습니다.");
                                Russia.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 14;
                                Player.p1_cash = Player.p1_cash + 14;
                                rus.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p1_own)

        }//p2_index==8

        //미국 위치저장
        else if (Player.p2_index == 10) {
            if (USA.name.equals(usa.p1_own)) {
                if (USA.structureNone.equals(usa.building)) {
                    if (Canada.structureNone.equals(can.p1_own) && Mexico.structureNone.equals(mex.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(usa.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        USA.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(usa.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 18억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 18억원이 증가했습니다.");
                                System.out.println("오른쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 18;
                                Player.p1_cash = Player.p1_cash + 18;
                                usa.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                USA.buildingCost = USA.buildingCost / 2;
                                USA.landmarkCost = USA.landmarkCost / 2;
                                USA.build_markCost = USA.build_markCost / 2;

                                Mexico.buildingCost = Mexico.buildingCost / 2;
                                Mexico.landmarkCost = Mexico.landmarkCost / 2;
                                Mexico.build_markCost = Mexico.build_markCost / 2;

                                Canada.buildingCost = Canada.buildingCost / 2;
                                Canada.landmarkCost = Canada.landmarkCost / 2;
                                Canada.build_markCost = Canada.build_markCost / 2;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(usa.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        USA.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(usa.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 18억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 18억원이 증가했습니다.");
                                USA.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 18;
                                Player.p1_cash = Player.p1_cash + 18;
                                usa.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own)

        }//p2_index==10


        else if (Player.p2_index == 11) {
            if (Canada.name.equals(can.p1_own)) {
                if (Canada.structureNone.equals(can.building)) {
                    if (USA.structureNone.equals(usa.p1_own) && Mexico.structureNone.equals(mex.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(can.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Canada.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(can.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 18억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 18억원이 증가했습니다.");
                                System.out.println("오른쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 18;
                                Player.p1_cash = Player.p1_cash + 18;
                                can.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                USA.buildingCost = USA.buildingCost / 2;
                                USA.landmarkCost = USA.landmarkCost / 2;
                                USA.build_markCost = USA.build_markCost / 2;

                                Mexico.buildingCost = Mexico.buildingCost / 2;
                                Mexico.landmarkCost = Mexico.landmarkCost / 2;
                                Mexico.build_markCost = Mexico.build_markCost / 2;

                                Canada.buildingCost = Canada.buildingCost / 2;
                                Canada.landmarkCost = Canada.landmarkCost / 2;
                                Canada.build_markCost = Canada.build_markCost / 2;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(can.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Canada.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(can.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 18억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 18억원이 증가했습니다.");
                                Canada.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 18;
                                Player.p1_cash = Player.p1_cash + 18;
                                can.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p1_own) can

        }//p2_index==12


        else if (Player.p2_index == 12) {
            if (Mexico.name.equals(mex.p1_own)) {
                if (Mexico.structureNone.equals(mex.building)) {
                    if (USA.structureNone.equals(usa.p1_own) && Canada.structureNone.equals(can.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(mex.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Mexico.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(mex.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 18억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 18억원이 증가했습니다.");
                                System.out.println("오른쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 18;
                                Player.p1_cash = Player.p1_cash + 18;
                                mex.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                USA.buildingCost = USA.buildingCost / 2;
                                USA.landmarkCost = USA.landmarkCost / 2;
                                USA.build_markCost = USA.build_markCost / 2;

                                Mexico.buildingCost = Mexico.buildingCost / 2;
                                Mexico.landmarkCost = Mexico.landmarkCost / 2;
                                Mexico.build_markCost = Mexico.build_markCost / 2;

                                Canada.buildingCost = Canada.buildingCost / 2;
                                Canada.landmarkCost = Canada.landmarkCost / 2;
                                Canada.build_markCost = Canada.build_markCost / 2;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(mex.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 18억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Mexico.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(mex.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 18억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 18억원이 증가했습니다.");
                                Mexico.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 18;
                                Player.p1_cash = Player.p1_cash + 18;
                                mex.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {

                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p1_own)

        }//p2_index==12


        else if (Player.p2_index == 14) {
            if (Italy.name.equals(ita.p1_own)) {
                if (Italy.structureNone.equals(ita.building)) {
                    if (Swiss.structureNone.equals(swi.p1_own) && Vietnam.structureNone.equals(vie.p1_own) && Egypt.structureNone.equals(egy.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(ita.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Italy.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(ita.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 11억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 11억원이 증가했습니다.");
                                System.out.println("아래쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                ita.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                Italy.buildingCost = Italy.buildingCost / 2;
                                Italy.landmarkCost = Italy.landmarkCost / 2;
                                Italy.build_markCost = Italy.build_markCost / 2;

                                Swiss.buildingCost = Swiss.buildingCost / 2;
                                Swiss.landmarkCost = Swiss.landmarkCost / 2;
                                Swiss.build_markCost = Swiss.build_markCost / 2;

                                Vietnam.buildingCost = Vietnam.buildingCost / 2;
                                Vietnam.landmarkCost = Vietnam.landmarkCost / 2;
                                Vietnam.build_markCost = Vietnam.build_markCost / 2;

                                Egypt.buildingCost = Egypt.buildingCost / 2;
                                Egypt.landmarkCost = Egypt.landmarkCost / 2;
                                Egypt.build_markCost = Egypt.build_markCost / 2;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(ita.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Italy.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(ita.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 11억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 11억원이 증가했습니다.");
                                Italy.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                ita.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p1_own)

        }//p2_index==14


        else if (Player.p2_index == 15) {
            if (Swiss.name.equals(swi.p1_own)) {
                if (Swiss.structureNone.equals(swi.building)) {
                    if (Italy.structureNone.equals(ita.p1_own) && Vietnam.structureNone.equals(vie.p1_own) && Egypt.structureNone.equals(egy.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(swi.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Swiss.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(swi.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 11억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 11억원이 증가했습니다.");
                                System.out.println("아래쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                ita.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                Italy.buildingCost = Italy.buildingCost / 2;
                                Italy.landmarkCost = Italy.landmarkCost / 2;
                                Italy.build_markCost = Italy.build_markCost / 2;

                                Swiss.buildingCost = Swiss.buildingCost / 2;
                                Swiss.landmarkCost = Swiss.landmarkCost / 2;
                                Swiss.build_markCost = Swiss.build_markCost / 2;

                                Vietnam.buildingCost = Vietnam.buildingCost / 2;
                                Vietnam.landmarkCost = Vietnam.landmarkCost / 2;
                                Vietnam.build_markCost = Vietnam.build_markCost / 2;

                                Egypt.buildingCost = Egypt.buildingCost / 2;
                                Egypt.landmarkCost = Egypt.landmarkCost / 2;
                                Egypt.build_markCost = Egypt.build_markCost / 2;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(swi.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Swiss.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(swi.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 11억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 11억원이 증가했습니다.");
                                Swiss.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                swi.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p1_own) swi

        }//p2_index==15


        else if (Player.p2_index == 16) {
            if (Vietnam.name.equals(vie.p1_own)) {
                if (Vietnam.structureNone.equals(vie.building)) {
                    if (Italy.structureNone.equals(ita.p1_own) && Swiss.structureNone.equals(swi.p1_own) && Egypt.structureNone.equals(egy.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(vie.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Vietnam.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(vie.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 11억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 11억원이 증가했습니다.");
                                System.out.println("아래쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                vie.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                Italy.buildingCost = Italy.buildingCost / 2;
                                Italy.landmarkCost = Italy.landmarkCost / 2;
                                Italy.build_markCost = Italy.build_markCost / 2;

                                Swiss.buildingCost = Swiss.buildingCost / 2;
                                Swiss.landmarkCost = Swiss.landmarkCost / 2;
                                Swiss.build_markCost = Swiss.build_markCost / 2;

                                Vietnam.buildingCost = Vietnam.buildingCost / 2;
                                Vietnam.landmarkCost = Vietnam.landmarkCost / 2;
                                Vietnam.build_markCost = Vietnam.build_markCost / 2;

                                Egypt.buildingCost = Egypt.buildingCost / 2;
                                Egypt.landmarkCost = Egypt.landmarkCost / 2;
                                Egypt.build_markCost = Egypt.build_markCost / 2;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(vie.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Vietnam.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(vie.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 11억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 11억원이 증가했습니다.");
                                Vietnam.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                vie.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p2_own) vie

        }//p2_index==16

        else if (Player.p2_index == 17) {
            if (Egypt.name.equals(egy.p1_own)) {
                if (Egypt.structureNone.equals(egy.building)) {
                    if (Italy.structureNone.equals(ita.p1_own) && Swiss.structureNone.equals(swi.p1_own) && Vietnam.structureNone.equals(vie.p1_own)) {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(egy.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Egypt.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(egy.travel + "을(를) 구매했습니다.");
                                System.out.println("플레이어2의 현금이 11억원이 감소했습니다.");
                                System.out.println("플레이어1의 현금이 11억원이 증가했습니다.");
                                System.out.println("아래쪽 라인독점이 해제되었습니다.");
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                egy.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;

                                Italy.buildingCost = Italy.buildingCost / 2;
                                Italy.landmarkCost = Italy.landmarkCost / 2;
                                Italy.build_markCost = Italy.build_markCost / 2;

                                Swiss.buildingCost = Swiss.buildingCost / 2;
                                Swiss.landmarkCost = Swiss.landmarkCost / 2;
                                Swiss.build_markCost = Swiss.build_markCost / 2;

                                Vietnam.buildingCost = Vietnam.buildingCost / 2;
                                Vietnam.landmarkCost = Vietnam.landmarkCost / 2;
                                Vietnam.build_markCost = Vietnam.build_markCost / 2;

                                Egypt.buildingCost = Egypt.buildingCost / 2;
                                Egypt.landmarkCost = Egypt.landmarkCost / 2;
                                Egypt.build_markCost = Egypt.build_markCost / 2;


                                //타 플레이어가 계약하고있는 국가를 재 구입하는 행위로 인해서 라인독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while


                    }//라인을 독점하고있엇는지에 대한 여부
                    else {
//                        System.out.println("아직 국가와 독점계약을 맺지 않아서 구매할수있습니다.");
//                        System.out.println(egy.travel + "을(를) 구매하시겠습니까?");
//                        System.out.println("가격은 11억입니다.");
//                        System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요  :)");
//                        System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                        Egypt.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(egy.travel + "을(를) 구매했습니다.");
//                                System.out.println("플레이어2의 현금이 11억원이 감소했습니다.");
//                                System.out.println("플레이어1의 현금이 11억원이 증가했습니다.");
                                Egypt.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                egy.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //타 플레이어가 계약하고 있는 국가를 재 구입하는 행위로 인해서 라인 독점이 사라질 경우에 대한 코드

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("구매할 의사가 있다면 'ㅇㅇ','dd'을 입력 해주세요.  :)");
                                System.out.println("구매할 의사가 없다면 'ㄴㄴ','ss'를 입력 해주세요.");
                            }//else
                        }//while
                    }//라인 독점 안하고있던 경우
                }//building


            }//name.equals(p1_own) egy

        }//p2_index==17


    }
    //p2_willTakeYourMap()    //p2_willTakeYourMap()    //p2_willTakeYourMap()    //p2_willTakeYourMap()
    //p2_willTakeYourMap()    //p2_willTakeYourMap()    //p2_willTakeYourMap()    //p2_willTakeYourMap()


    public void p1_monopolizedLeftLine() {

        Korea kor = new Korea();
        Japan jap = new Japan();
        China chi = new China();
        Player player = new Player();


        if (Korea.name.equals(kor.p1_own) && Japan.name.equals(jap.p1_own) && China.name.equals(chi.p1_own)&&Player.p1_leftMonopolized==0) {

            Korea.buildingCost = Korea.buildingCost * 2;
            Korea.landmarkCost = Korea.landmarkCost * 2;
            Korea.build_markCost = Korea.build_markCost * 2;

            Japan.buildingCost = Japan.buildingCost * 2;
            Japan.landmarkCost = Japan.landmarkCost * 2;
            Japan.build_markCost = Japan.build_markCost * 2;

            China.buildingCost = China.buildingCost * 2;
            China.landmarkCost = China.landmarkCost * 2;
            China.build_markCost = China.build_markCost * 2;

            Player.p1_leftMonopolized=1;
            System.out.println("☆☆☆왼쪽라인에 있는 국가와 모두계약☆☆☆");


        }//if 라인독점일때


    }//leftLine

    public void p1_monopolizedUpsidetLine() {

        England eng = new England();
        France fra = new France();
        Germany ger = new Germany();
        Russia rus = new Russia();

        Player player = new Player();


        if (England.name.equals(eng.p1_own) && France.name.equals(fra.p1_own) && Germany.name.equals(ger.p1_own) && Russia.name.equals(rus.p1_own)&&Player.p1_upMonopolized==0) {

            England.buildingCost = England.buildingCost * 2;
            England.landmarkCost = England.landmarkCost * 2;
            England.build_markCost = England.build_markCost * 2;

            France.buildingCost = France.buildingCost * 2;
            France.landmarkCost = France.landmarkCost * 2;
            France.build_markCost = France.build_markCost * 2;

            Germany.buildingCost = Germany.buildingCost * 2;
            Germany.landmarkCost = Germany.landmarkCost * 2;
            Germany.build_markCost = Germany.build_markCost * 2;

            Russia.buildingCost = Russia.buildingCost * 2;
            Russia.landmarkCost = Russia.landmarkCost * 2;
            Russia.build_markCost = Russia.build_markCost * 2;

            Player.p1_upMonopolized=1;

        System.out.println("☆☆☆윗라인에 있는 국가와 모두계약☆☆☆");


        }//if 라인독점일때


    }//p1_monopolizedUpsidetLine


    public void p1_monopolizedRightLine() {

        USA usa = new USA();
        Canada can = new Canada();
        Mexico mex = new Mexico();
        Player player = new Player();


        if (USA.name.equals(usa.p1_own) && Canada.name.equals(can.p1_own) && Mexico.name.equals(mex.p1_own)&&Player.p1_rightMonopolized==0) {

            USA.buildingCost = USA.buildingCost * 2;
            USA.landmarkCost = USA.landmarkCost * 2;
            USA.build_markCost = USA.build_markCost * 2;

            Canada.buildingCost = Canada.buildingCost * 2;
            Canada.landmarkCost = Canada.landmarkCost * 2;
            Canada.build_markCost = Canada.build_markCost * 2;

            Mexico.buildingCost = Mexico.buildingCost * 2;
            Mexico.landmarkCost = Mexico.landmarkCost * 2;
            Mexico.build_markCost = Mexico.build_markCost * 2;

            Player.p1_rightMonopolized=1;

            System.out.println("☆☆☆우측라인에 있는 국가와 모두계약☆☆☆");


        }//if 라인독점일때


    }//p1_monopolizedRightLine


    public void p1_monopolizedDownsideLine() {

        Egypt egy = new Egypt();
        Italy ita = new Italy();
        Vietnam vie = new Vietnam();
        Swiss swi = new Swiss();
        Player player = new Player();


        if (Egypt.name.equals(egy.p1_own) && Italy.name.equals(ita.p1_own) && Vietnam.name.equals(vie.p1_own) && Swiss.name.equals(swi.p1_own)&&Player.p1_downMonopolized==0) {

            Egypt.buildingCost = Egypt.buildingCost * 2;
            Egypt.landmarkCost = Egypt.landmarkCost * 2;
            Egypt.build_markCost = Egypt.build_markCost * 2;

            Italy.buildingCost = Italy.buildingCost * 2;
            Italy.landmarkCost = Italy.landmarkCost * 2;
            Italy.build_markCost = Italy.build_markCost * 2;

            Vietnam.buildingCost = Vietnam.buildingCost * 2;
            Vietnam.landmarkCost = Vietnam.landmarkCost * 2;
            Vietnam.build_markCost = Vietnam.build_markCost * 2;

            Swiss.buildingCost = Swiss.buildingCost * 2;
            Swiss.landmarkCost = Swiss.landmarkCost * 2;
            Swiss.build_markCost = Swiss.build_markCost * 2;

            Player.p1_downMonopolized=1;

            System.out.println("☆☆☆아랫라인에 있는 국가와 모두계약☆☆☆");


        }//if 라인독점일때


    }//p1_monopolizedDownsideLine

    //p1_monopolized  	//p1_monopolized  	//p1_monopolized  	//p1_monopolized  	//p1_monopolized
    //p1_monopolized  	//p1_monopolized  	//p1_monopolized  	//p1_monopolized  	//p1_monopolized


    public void p2_monopolizedLeftLine() {

        Korea kor = new Korea();
        Japan jap = new Japan();
        China chi = new China();
        Player player = new Player();


        if (Korea.name.equals(kor.p2_own) && Japan.name.equals(jap.p2_own) && China.name.equals(chi.p2_own)&&Player.p2_leftMonopolized==0) {

            Korea.buildingCost = Korea.buildingCost * 2;
            Korea.landmarkCost = Korea.landmarkCost * 2;
            Korea.build_markCost = Korea.build_markCost * 2;

            Japan.buildingCost = Japan.buildingCost * 2;
            Japan.landmarkCost = Japan.landmarkCost * 2;
            Japan.build_markCost = Japan.build_markCost * 2;

            China.buildingCost = China.buildingCost * 2;
            China.landmarkCost = China.landmarkCost * 2;
            China.build_markCost = China.build_markCost * 2;

            Player.p2_leftMonopolized=1;

            System.out.println("★★★왼쪽라인에 있는 국가와 모두계약★★★");


        }//if 라인독점일때


    }//leftLine

    public void p2_monopolizedUpsidetLine() {

        England eng = new England();
        France fra = new France();
        Germany ger = new Germany();
        Russia rus = new Russia();

        Player player = new Player();


        if (England.name.equals(eng.p2_own) && France.name.equals(fra.p2_own) && Germany.name.equals(ger.p2_own) && Russia.name.equals(rus.p2_own)&&Player.p2_upMonopolized==0) {

            England.buildingCost = England.buildingCost * 2;
            England.landmarkCost = England.landmarkCost * 2;
            England.build_markCost = England.build_markCost * 2;

            France.buildingCost = France.buildingCost * 2;
            France.landmarkCost = France.landmarkCost * 2;
            France.build_markCost = France.build_markCost * 2;

            Germany.buildingCost = Germany.buildingCost * 2;
            Germany.landmarkCost = Germany.landmarkCost * 2;
            Germany.build_markCost = Germany.build_markCost * 2;

            Russia.buildingCost = Russia.buildingCost * 2;
            Russia.landmarkCost = Russia.landmarkCost * 2;
            Russia.build_markCost = Russia.build_markCost * 2;

            Player.p2_upMonopolized=1;

            System.out.println("★★★윗라인에 있는 국가와 모두계약★★★");


        }//if 라인독점일때


    }//p1_monopolizedUpsidetLine


    public void p2_monopolizedRightLine() {

        USA usa = new USA();
        Canada can = new Canada();
        Mexico mex = new Mexico();
        Player player = new Player();


        if (USA.name.equals(usa.p2_own) && Canada.name.equals(can.p2_own) && Mexico.name.equals(mex.p2_own)&&Player.p2_rightMonopolized==0) {

            USA.buildingCost = USA.buildingCost * 2;
            USA.landmarkCost = USA.landmarkCost * 2;
            USA.build_markCost = USA.build_markCost * 2;

            Canada.buildingCost = Canada.buildingCost * 2;
            Canada.landmarkCost = Canada.landmarkCost * 2;
            Canada.build_markCost = Canada.build_markCost * 2;

            Mexico.buildingCost = Mexico.buildingCost * 2;
            Mexico.landmarkCost = Mexico.landmarkCost * 2;
            Mexico.build_markCost = Mexico.build_markCost * 2;

            Player.p2_rightMonopolized=1;

            System.out.println("★★★우측라인에 있는 국가와 모두계약★★★");


        }//if 라인독점일때


    }//p1_monopolizedRightLine


    public void p2_monopolizedDownsideLine() {

        Egypt egy = new Egypt();
        Italy ita = new Italy();
        Vietnam vie = new Vietnam();
        Swiss swi = new Swiss();
        Player player = new Player();


        if (Egypt.name.equals(egy.p2_own) && Italy.name.equals(ita.p2_own) && Vietnam.name.equals(vie.p2_own) && Swiss.name.equals(swi.p2_own)&&Player.p2_downMonopolized==0) {

            Egypt.buildingCost = Egypt.buildingCost * 2;
            Egypt.landmarkCost = Egypt.landmarkCost * 2;
            Egypt.build_markCost = Egypt.build_markCost * 2;

            Italy.buildingCost = Italy.buildingCost * 2;
            Italy.landmarkCost = Italy.landmarkCost * 2;
            Italy.build_markCost = Italy.build_markCost * 2;

            Vietnam.buildingCost = Vietnam.buildingCost * 2;
            Vietnam.landmarkCost = Vietnam.landmarkCost * 2;
            Vietnam.build_markCost = Vietnam.build_markCost * 2;

            Swiss.buildingCost = Swiss.buildingCost * 2;
            Swiss.landmarkCost = Swiss.landmarkCost * 2;
            Swiss.build_markCost = Swiss.build_markCost * 2;

            Player.p2_downMonopolized=1;

            System.out.println("★★★아랫라인에 있는 국가와 모두계약★★★");


        }//if 라인 독점일 때


    }//p1_monopolizedDownsideLine

    //p2_monopolized   //p2_monopolized   //p2_monopolized   //p2_monopolized
    //p2_monopolized   //p2_monopolized   //p2_monopolized   //p2_monopolized

/*
    public void calculateCost() {

        if (structureNone.equals(building)) {
            cost = buildingCost;
            System.out.print(cost);
        } else if (structureNone.equals(landmark)) {
            cost = landmarkCost;
            System.out.print(cost);
        } else if (structureNone.equals(build_mark)) {
            cost = build_markCost;
            System.out.print(cost);
        } else if (structureNone.equals(structureBlank)) {
            cost = contractNationYet;
            System.out.print(cost);

        }

    }//calculateCost*/


}//class
