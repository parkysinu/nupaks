package playM;

import java.util.Scanner;

public class Countries extends Place { //���� Ŭ�������� ������ִ� Ŭ����
    // ���� Ŭ�������� ������ �����ϰ� ������ �����Ҽ��ִ� ���๰���� ǥ���ϴ� ������ �������
    //���� 2��° �ٿ� ǥ��
            //buyMapReturned();
			//buyMap();
			//dontTakeMyMoney();
			//willTakeYourMap();

    String select;
    String value;
    String building = "�����ǡ���������";
    String landmark = "�����������ʡ���";
    String build_mark = "�����ǡ����ʡ���";
    String structureBlank = "����������������";
    String structureNone = "����������������";

    static boolean p1_doNotActiveReturn;
    static boolean p2_doNotActiveReturn;

    int buildingCost;
    int landmarkCost;
    int build_markCost;
    int cost;
    int contractNationYet;
    //	String roof      ="������������������������";
    //public String blank   ="            ";
//	String floor     ="������������������������";


    public void building() {

        structureNone = structureNone.replaceAll("����������������", "�����ǡ���������");

    }//building replaceALl

    public void landmark() {

        structureNone = structureNone.replaceAll("����������������", "�����������ʡ���");

    }//landmark replaceAll

    public void buld_mark() {


        structureNone = structureNone.replaceAll("����������������", "�����ǡ����ʡ���");

    }//build_mark replaceAll

    public void building_landmark() {

        structureNone = structureNone.replaceAll("�����ǡ���������", "�����ǡ����ʡ���");

    }//building replaceALl

    public void landmark_building() {

        structureNone = structureNone.replaceAll("�����������ʡ���", "�����ǡ����ʡ���");

    }//building replaceALl


    //�ǹ� ��Ȳ �޼ҵ�


    public void p1_buyMap() {


        //��� ������ �� �ΰ�
        //if ���� ���� �������� ������ ���� �ϴ� �޼ҵ尡 ���� �ȴ�.
        //Ȯ���� ���� �ؼ� 3/4��  ������ ���� 1/4�� ���� ��ũ�� ������ �� �ְ� ��.
        //���� ��ũ �Ǽ��� Ÿ �÷��̾ ������ �ִ� ���� ������ �� ����. ������ ����� ���� ���� ���⸸ ����
        //���� owner�� �� �湮�� ���� Ȯ���� �߰��� ���� ���� ������ ����.
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
        String Y = "����";
        String y = "dd";
        String yy = "DD";

        String N = "����";
        String n = "ss";
        String nn = "SS";

        if(TurnOver.p1_turnOver){
            return;
        }//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.

        if (Player.p1_index == 1 && Korea.name.equals(kor.ownName)) {
            Korea.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;


            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                kor.own1p();
                Korea.p1_successContract=true;
                System.out.println("�١١�"+kor.travel+"�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    kor.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    kor.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ� ������ ���� ���

        }//name =  " �ѱ� " p1_index =1

        else if (Player.p1_index == 2 && Japan.name.equals(jap.ownName)) {
            if(Russia.name.equals(Russia.own2p)){
                Japan.p1_startOwnTheLand=true;
                PlayboardLog.p1_ownTheLand=true;

                playboard.playboard();
                choice = scan.nextLine();
                if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                    jap.own1p();
                    Japan.p1_successContract=true;
                    System.out.println("�١١�" + jap.ownName + "�� ��� �߽��ϴ١١١�");
                    dice.buyStructure();
                    Player.p1_cash = Player.p1_cash - 20;
                    if (dice.dice3 == 3) {

                        jap.landmark();
                        Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                    else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                        jap.building();
                        Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
                }//�ǹ��� ��ٰ� �ǻ������ �������
            }
            else {
                Japan.p1_startOwnTheLand=true;
                PlayboardLog.p1_ownTheLand=true;

                playboard.playboard();
                choice = scan.nextLine();
                if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                    jap.own1p();
                    Japan.p1_successContract=true;
                    System.out.println("�١١�" + jap.ownName + "�� ��� �߽��ϴ١١١�");
                    dice.buyStructure();
                    Player.p1_cash = Player.p1_cash - 10;
                    if (dice.dice3 == 3) {

                        jap.landmark();
                        Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                    else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                        jap.building();
                        Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
                }//�ǹ��� ��ٰ� �ǻ������ �������
            }//elseContractedRussia
        }//name = " �Ϻ� " p1_index =2


        else if (Player.p1_index == 3 && China.name.equals(chi.ownName)) {
            China.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                chi.own1p();
                China.p1_successContract=true;
                System.out.println("�١١�" + chi.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    chi.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    chi.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������
        }//name = " �߱� " p1_index =3


        else if (Player.p1_index == 5 && England.name.equals(eng.ownName)) {
            China.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                eng.own1p();
                England.p1_successContract=true;
                System.out.println("�١١�" + eng.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    eng.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    eng.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ� ������ ���� ���
        }//name = " ���� " p1_index = 5


        else if (Player.p1_index == 6 && France.name.equals(fra.ownName)) {
            if(TimeThread.Season.equals(TT.Summer)) {
                PlayboardLog.p1_france_protesting=true;

            }//������ �̺�Ʈ season.equals(Summer)
            else {
                France.p1_startOwnTheLand=true;
                PlayboardLog.p1_ownTheLand=true;

                playboard.playboard();
                choice = scan.nextLine();
                if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                    fra.own1p();
                    France.p1_successContract=true;
                    System.out.println("�١١�" + fra.ownName + "�� ��� �߽��ϴ١١١�");
                    dice.buyStructure();
                    Player.p1_cash = Player.p1_cash - 10;
                    if (dice.dice3 == 3) {

                        fra.landmark();
                        Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    }//dice3==3 (�ֻ��� ���� 3�϶� ���� ��ũ ��)

                    else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                        fra.building();
                        Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
                }//�ǹ��� ��ٰ� �ǻ������ �������
            }//else !Summer
        }//name = " ������ " p1_index = 6


        else if (Player.p1_index == 7 && Germany.name.equals(ger.ownName)) {
            Germany.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                ger.own1p();
                Germany.p1_successContract=true;
                System.out.println("�١١�" + ger.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    ger.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    ger.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������
        }//name = " ���� "  p1_index = 7


        else if (Player.p1_index == 8 && Russia.name.equals(rus.ownName)) {
            Russia.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                rus.own1p();
                Russia.p1_successContract=true;
                System.out.println("�١١�" + rus.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    rus.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    rus.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������
        }//name = " ���þ�  " p1_index =8


        else if (Player.p1_index == 10 && USA.name.equals(usa.ownName)) {
            USA.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                usa.own1p();
                USA.p1_successContract=true;
                System.out.println("�١١�" + usa.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    usa.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    usa.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������
        }//name = " �̱� " p1_index = 10


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
                    System.out.println("�١١�" + can.ownName + "�� ��� �߽��ϴ١١١�");
                    dice.buyStructure();
                    Player.p1_cash = Player.p1_cash - 5;
                    if (dice.dice3 == 3) {

                        can.landmark();
                        Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                    else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                        can.building();
                        Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
                }//�ǹ��� ��ٰ� �ǻ������ �������
            }
            else {
                Canada.p1_startOwnTheLand=true;
                PlayboardLog.p1_ownTheLand=true;

                playboard.playboard();
                choice = scan.nextLine();
                if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                    can.own1p();
                    Canada.p1_successContract=true;
                    System.out.println("�١١�" + can.ownName + "�� ��� �߽��ϴ١١١�");
                    dice.buyStructure();
                    Player.p1_cash = Player.p1_cash - 10;
                    if (dice.dice3 == 3) {

                        can.landmark();
                        Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                    else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                        can.building();
                        Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
                }//�ǹ��� ��ٰ� �ǻ������ �������
            }//else eng.name.equals(eng.p1_own)
        }//name = " ĳ���� "  p1_index= 11


        else if (Player.p1_index == 12 && Mexico.name.equals(mex.ownName)) {
            Mexico.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                mex.own1p();
                Mexico.p1_successContract=true;
                System.out.println("�١١�" + mex.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    mex.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    mex.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������
        }//name = " �߽��� " p1_index= 12


        else if (Player.p1_index == 14 && Italy.name.equals(ita.ownName)) {
            Italy.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                ita.own1p();
                Italy.p1_successContract=true;
                System.out.println("�١١�" + ita.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    ita.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    ita.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������
        }//name = " ��Ż���� " p1_index= 14


        else if (Player.p1_index == 15 && Swiss.name.equals(swi.ownName)) {
            Swiss.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                swi.own1p();
                Swiss.p1_successContract=true;
                System.out.println("�١١�" + swi.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    swi.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    swi.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ� ������ ���� ���
        }//name = " ������ " p1_index=15


        else if (Player.p1_index == 16 && Vietnam.name.equals(vie.ownName)) {
            Vietnam.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                vie.own1p();
                Vietnam.p1_successContract=true;
                System.out.println("�١١�" + vie.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    vie.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    vie.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������
        }//name = " ��Ʈ�� " p1_index =16


        else if (Player.p1_index == 17 && Egypt.name.equals(egy.ownName)) {
            Egypt.p1_startOwnTheLand=true;
            PlayboardLog.p1_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                egy.own1p();
                Egypt.p1_successContract=true;
                System.out.println("�١١�" + egy.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p1_cash = Player.p1_cash - 10;
                if (dice.dice3 == 3) {

                    egy.landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    egy.building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������
        }//name = " ����Ʈ " p1 index= 17


    }
    //p1�� ���� �����ϴ� �޼ҵ�


    public void p2_buyMap() {


        //��� �����Ұ��ΰ�
        //if ���� ���� �������� ������ �����ϴ� �޼ҵ尡 �����ȴ�.
        //Ȯ���� �����ؼ� 3/4��  ������ ���� 1/4�� ���帶ũ�� �����Ҽ��ְ� ��.
        //���帶ũ �Ǽ��� Ÿ �÷��̾ ������ �ִ� ���� �����Ҽ�����. ������ ����� ���� �������⸸ ����
        //���� owner�� ��湮�� ���� Ȯ���� �߰��� ���๰�� ������ ����.
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
        String Y = "����";
        String y = "dd";
        String yy = "DD";

        String N = "����";
        String n = "ss";
        String nn = "SS";

        if(TurnOver.p2_turnOver){
            return;
        }//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.

        if (Player.p2_index == 1 && Korea.name.equals(kor.ownName)) {
            Korea.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                kor.own2p();
                Korea.p2_successContract=true;
                System.out.println("�١١�" + kor.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    kor.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    kor.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name =  " �ѱ� " p2_index =1

        else if (Player.p2_index == 2 && Japan.name.equals(jap.ownName)) {
                if(Russia.name.equals(Russia.own1p)){
                    Japan.p2_startOwnTheLand=true;
                    PlayboardLog.p2_ownTheLand=true;
                    playboard.playboard();


                    choice = scan.nextLine();
                    if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                        jap.own2p();
                        Japan.p2_successContract=true;
                        System.out.println("�١١�" + jap.ownName + "�� ��� �߽��ϴ١١١�");
                        dice.buyStructure();
                        Player.p2_cash = Player.p2_cash - 20;
                        if (dice.dice3 == 3) {

                            jap.landmark();
                            Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                        }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                        else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                            jap.building();
                            Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                        }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
                    }//�ǹ��� ��ٰ� �ǻ������ �������
                }
                else {

                    Japan.p2_startOwnTheLand=true;
                    PlayboardLog.p2_ownTheLand=true;

                    playboard.playboard();
                    choice = scan.nextLine();
                    if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                        jap.own2p();
                        Japan.p2_successContract=true;
                        System.out.println("�١١�" + jap.ownName + "�� ��� �߽��ϴ١١١�");
                        dice.buyStructure();
                        Player.p2_cash = Player.p2_cash - 10;
                        if (dice.dice3 == 3) {

                            jap.landmark();
                            Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                        }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                        else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                            jap.building();
                            Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                        }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
                    }//�ǹ��� ��ٰ� �ǻ������ �������

                }//elseContractedRussia
        }//name = " �Ϻ� " p2_index =2


        else if (Player.p2_index == 3 && China.name.equals(chi.ownName)) {
            China.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                chi.own2p();
                China.p2_successContract=true;
                System.out.println("�١١�" + chi.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    chi.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    chi.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name = " �߱� " p2_index =3


        else if (Player.p2_index == 5 && England.name.equals(eng.ownName)) {
            England.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                eng.own2p();
                England.p2_successContract=true;
                System.out.println("�١١�" + eng.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    eng.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    eng.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name = " ���� " p2_index = 5


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
                        System.out.println("�١١�" + fra.ownName + "�� ��� �߽��ϴ١١١�");
                        dice.buyStructure();
                        Player.p2_cash = Player.p2_cash - 10;
                        if (dice.dice3 == 3) {

                            fra.landmark();
                            Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                        }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                        else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                            fra.building();
                            Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                        }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
                    }//�ǹ��� ��ٰ� �ǻ������ �������
                }//else !Summer

        }//name = " ������ " p2_index = 6


        else if (Player.p2_index == 7 && Germany.name.equals(ger.ownName)) {
            Germany.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                ger.own2p();
                Germany.p2_successContract=true;
                System.out.println("�١١�" + ger.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    ger.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    ger.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name = " ���� "  p2_index = 7


        else if (Player.p2_index == 8 && Russia.name.equals(rus.ownName)) {
            Russia.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                rus.own2p();
                Russia.p2_successContract=true;
                System.out.println("�١١�" + rus.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    rus.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    rus.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name = " ���þ�  " p2_index =8


        else if (Player.p2_index == 10 && USA.name.equals(usa.ownName)) {
            USA.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                usa.own2p();
                USA.p2_successContract=true;
                System.out.println("�١١�" + usa.ownName + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    usa.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    usa.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name = " �̱� " p2_index = 10


        else if (Player.p2_index == 11 && Canada.name.equals(can.ownName)) {
            Canada.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                can.own2p();
                Canada.p2_successContract=true;
                System.out.println("�١١�" + can.travel + "�� ��� �߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    can.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    can.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name = " ĳ���� "  p2_index= 11


        else if (Player.p2_index == 12 && Mexico.name.equals(mex.ownName)) {
            Mexico.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                mex.own2p();
                Mexico.p2_successContract=true;
                System.out.println("�١١�" + mex.ownName + "���� �����߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    mex.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    mex.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name = " �߽��� " p2_index= 12


        else if (Player.p2_index == 14 && Italy.name.equals(ita.ownName)) {
            Italy.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                ita.own2p();
                Italy.p2_successContract=true;
                System.out.println("�١١�" + ita.ownName + "���� �����߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    ita.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    ita.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name = " ��Ż���� " p2_index= 14


        else if (Player.p2_index == 15 && Swiss.name.equals(swi.ownName)) {
            Swiss.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                swi.own2p();
                Swiss.p2_successContract=true;
                System.out.println("�١١�" + swi.ownName + "���� �����߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    swi.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    swi.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name = " ������ " p2_index=15


        else if (Player.p2_index == 16 && Vietnam.name.equals(vie.ownName)) {
            Vietnam.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                vie.own2p();
                Vietnam.p2_successContract=true;
                System.out.println("�١١�" + vie.ownName + "���� �����߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    vie.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    vie.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name = " ��Ʈ�� " p2_index =16


        else if (Player.p2_index == 17 && Egypt.name.equals(egy.ownName)) {
            Egypt.p2_startOwnTheLand=true;
            PlayboardLog.p2_ownTheLand=true;

            playboard.playboard();
            choice = scan.nextLine();
            if (choice.equals(y) || choice.equals(yy) || choice.equals(Y)) {//yyyyyy

                egy.own2p();
                Egypt.p2_successContract=true;
                System.out.println("�١١�" + egy.ownName + "���� �����߽��ϴ١١١�");
                dice.buyStructure();
                Player.p2_cash = Player.p2_cash - 10;
                if (dice.dice3 == 3) {

                    egy.landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                }//dice3==3 (�ֻ��� ���� 3�϶� ���帶ũ ��)

                else if (dice.dice3 >= 0 && dice.dice3 < 3) {

                    egy.building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                }//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)
            }//�ǹ��� ��ٰ� �ǻ������ �������

        }//name = " ����Ʈ " p2 index= 17


    }
    //p2�� ���� �����ϴ� �޼ҵ�

    public void p1_buyMapReturned() {

        //��� ������ ���ΰ�
        //if ���� ���� ���� ���� ������ ���� �ϴ� �޼ҵ尡 ���� �ȴ�.
        //Ȯ���� ���� �ؼ� 3/4��  ������ ���� 1/4�� ���帶ũ�� ������ �� �ְ� ��.
        //���帶ũ �Ǽ��� Ÿ �÷��̾ ������ �ִ� ���� ������ �� ����. ������ ����� ���� ���� ���⸸ ����
        //���� owner�� �� �湮�� ���� Ȯ���� �߰��� ���� ���� ������ ����.
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
        }//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.


        if (Player.p1_index == 1 && Korea.name.equals(kor.p1_own)) {


            if (Korea.structureNone.equals(kor.building)) {
                //System.out.println("�١١� p1 is returned!�١١�");
                PlayboardLog.p1_returnedTHeMap=true;
                kor.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Korea.p1_returnTheMapNaming=true;
                //System.out.println("�١١��� �湮���� ���� �ѱ��� ���� ���� ���� ������ϴ١١١�");
            }//building�� �̹� ������ �ִ� ���

            if (Korea.structureNone.equals(kor.landmark)) {
                //System.out.println("�١١� p1 is returned!�١١�");
                PlayboardLog.p1_returnedTHeMap=true;
                kor.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                Korea.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮 ȿ���� �ѱ��� ���� �������� ������ϴ١١١�");

            }//���帶ũ�� �������������


        }//name =  " �ѱ� " p1_index =1

        else if (Player.p1_index == 2 && Japan.name.equals(jap.p1_own)) {


            if (Japan.structureNone.equals(jap.building)) {
                jap.building_landmark();
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Japan.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮���� ���� �Ϻ��� ���� �������� ������ϴ١١١�");
            }//building�� �̹� ������ �ִ� ���

            if (Japan.structureNone.equals(jap.landmark)) {
                //System.out.println("�١١� p1 is returned!�١١�");
                PlayboardLog.p1_returnedTHeMap=true;
                jap.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                Japan.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮 ȿ���� �Ϻ��� ���� �������� ������ϴ١١١�");

            }//���帶ũ�� �������������

        }//name = " �Ϻ� " p1_index =2


        else if (Player.p1_index == 3 && China.name.equals(chi.p1_own)) {


            if (China.structureNone.equals(chi.building)) {
                //System.out.println("�١١� p1 is returned!�١١�");
                PlayboardLog.p1_returnedTHeMap=true;
                chi.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                China.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮���� ���� �߱��� ���� �������� ������ϴ١١١�");
            }//building�� �̹� ������ �ִ� ���

            if (China.structureNone.equals(chi.landmark)) {
                //System.out.println("�١١� p1 is returned!�١١�");
                PlayboardLog.p1_returnedTHeMap=true;
                chi.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                China.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮 ȿ���� �߱��� ���� �������� ������ϴ١١١�");

            }//���帶ũ�� �������������


        }//name = " �߱� " p1_index =3


        else if (Player.p1_index == 5 && England.name.equals(eng.p1_own)) {


            if (England.structureNone.equals(eng.building)) {
                //System.out.println("�١١� p1 is returned!�١١�");
                PlayboardLog.p1_returnedTHeMap=true;
                eng.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                England.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮���� ���� ������ ���� �������� ������ϴ١١١�");
            }//building�� �̹� ������ �ִ� ���

            if (England.structureNone.equals(eng.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                eng.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("�١١���湮 ȿ���� ������ ���� �������� ������ϴ١١١�");
                England.p1_returnTheMapNaming=true;
            }//���帶ũ�� �������������

        }//name = " ���� " p1_index = 5


        else if (Player.p1_index == 6 && France.name.equals(fra.p1_own)) {
            if(TimeThread.Season.equals(TT.Summer)){
                PlayboardLog.p1_france_protesting=true;
                //System.out.println("���� ���������� ��ȸ �������̶� ���������� ó���Ҽ������ϴ�.");
            }
            else {
                if (France.structureNone.equals(fra.building)) {
                    PlayboardLog.p1_returnedTHeMap=true;
                    //System.out.println("�١١� p1 is returned!�١١�");
                    fra.building_landmark();
                    Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                    France.p1_returnTheMapNaming=true;
                    //System.out.println("�١١���湮���� ���� �������� ���� �������� ������ϴ١١١�");
                }//building�� �̹� ������ �ִ� ���

                if (France.structureNone.equals(fra.landmark)) {
                    //System.out.println("�١١� p1 is returned!�١١�");
                    PlayboardLog.p1_returnedTHeMap=true;
                    fra.landmark_building();
                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                    France.p1_returnTheMapNaming=true;
                    //System.out.println("�١١���湮 ȿ���� �������� ���� �������� ������ϴ١١١�");

                }//���帶ũ�� �������������
            }

        }//name = " ������ " p1_index = 6


        else if (Player.p1_index == 7 && Germany.name.equals(ger.p1_own)) {


            if (Germany.structureNone.equals(ger.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                ger.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Germany.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮���� ���� ���Ͽ� ���� �������� ������ϴ١١١�");
            }//building�� �̹� ������ �ִ� ���

            if (Germany.structureNone.equals(ger.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                ger.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                Germany.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮 ȿ���� ���Ͽ� ���� �������� ������ϴ١١١�");

            }//���帶ũ�� �������������


        }//name = " ���� "  p1_index = 7


        else if (Player.p1_index == 8 && Russia.name.equals(rus.p1_own)) {


            if (Russia.structureNone.equals(rus.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                rus.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Russia.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮���� ���� ���þƿ� ���� �������� ������ϴ١١١�");
            }//building�� �̹� ������ �ִ� ���

            if (Russia.structureNone.equals(rus.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                rus.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("�١١���湮 ȿ���� ���þƿ� ���� �������� ������ϴ١١١�");
                Russia.p1_returnTheMapNaming=true;
            }//���帶ũ�� �������������


        }//name = " ���þ�  " p1_index =8


        else if (Player.p1_index == 10 && USA.name.equals(usa.p1_own)) {


            if (USA.structureNone.equals(usa.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                usa.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                USA.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮���� ���� �̱��� ���� �������� ������ϴ١١١�");
            }//building�� �̹� ������ �ִ� ���

            if (USA.structureNone.equals(usa.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                usa.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                USA.p1_returnTheMapNaming=true;
                // System.out.println("�١١���湮 ȿ���� �̱��� ���� �������� ������ϴ١١١�");

            }//���帶ũ�� �������������


        }//name = " �̱� " p1_index = 10


        else if (Player.p1_index == 11 && Canada.name.equals(can.p1_own)) {


            if (Canada.structureNone.equals(can.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                can.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Canada.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮���� ���� ĳ���ٿ� ���� �������� ������ϴ١١١�");
            }//building�� �̹� ������ �ִ� ���

            if (Canada.structureNone.equals(can.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                can.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("�١١���湮 ȿ���� ĳ���ٿ� ���� �������� ������ϴ١١١�");
                Canada.p1_returnTheMapNaming=true;
            }//���帶ũ�� �������������


        }//name = " ĳ���� "  p1_index= 11


        else if (Player.p1_index == 12 && Mexico.name.equals(mex.p1_own)) {


            if (Mexico.structureNone.equals(mex.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                mex.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Mexico.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮���� ���� �߽��ڿ� ���� �������� ������ϴ١١١�");
            }//building�� �̹� ������ �ִ� ���

            if (Mexico.structureNone.equals(mex.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                mex.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("�١١���湮 ȿ���� �߽��ڿ� ���� �������� ������ϴ١١١�");
                Mexico.p1_returnTheMapNaming=true;
            }//���帶ũ�� �������������


        }//name = " �߽��� " p1_index= 12


        else if (Player.p1_index == 14 && Italy.name.equals(ita.p1_own)) {


            if (Italy.structureNone.equals(ita.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                ita.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                Italy.p1_returnTheMapNaming=true;
                //System.out.println("�١١���湮���� ���� ��Ż���ƿ� ���� �������� ������ϴ١١١�");
            }//building�� �̹� ������ �ִ� ���

            if (Italy.structureNone.equals(ita.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                ita.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("�١١���湮 ȿ���� ��Ż���ƿ� ���� �������� ������ϴ١١١�");
                Italy.p1_returnTheMapNaming=true;
            }//���帶ũ�� �������������


        }//name = " ��Ż���� " p1_index= 14


        else if (Player.p1_index == 15 && Swiss.name.equals(swi.p1_own)) {


            if (Swiss.structureNone.equals(swi.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                swi.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                //System.out.println("�١١���湮���� ���� �������� ���� �������� ������ϴ١١١�");
                Swiss.p1_returnTheMapNaming=true;
            }//building�� �̹� ������ �ִ� ���

            if (Swiss.structureNone.equals(swi.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                swi.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("�١١���湮 ȿ���� �������� ���� �������� ������ϴ١١١�");
                Swiss.p1_returnTheMapNaming=true;
            }//���帶ũ�� �������������


        }//name = " ������ " p1_index=15


        else if (Player.p1_index == 16 && Vietnam.name.equals(vie.p1_own)) {


            if (Vietnam.structureNone.equals(vie.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                vie.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                //System.out.println("�١١���湮���� ���� ��Ʈ���� ���� �������� ������ϴ١١١�");
                Vietnam.p1_returnTheMapNaming=true;
            }//building�� �̹� ������ �ִ� ���

            if (Vietnam.structureNone.equals(vie.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                vie.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("�١١���湮 ȿ���� ��Ʈ���� ���� �������� ������ϴ١١١�");
                Vietnam.p1_returnTheMapNaming=true;
            }//���帶ũ�� �������������


        }//name = " ��Ʈ�� " p1_index =16


        else if (Player.p1_index == 17 && Egypt.name.equals(egy.p1_own)) {


            if (Egypt.structureNone.equals(egy.building)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                egy.building_landmark();
                Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
                //System.out.println("�١١���湮���� ���� ����Ʈ�� ���� �������� ������ϴ١١١�");
                Egypt.p1_returnTheMapNaming=true;
            }//building�� �̹� ������ �ִ� ���

            if (Egypt.structureNone.equals(egy.landmark)) {
                PlayboardLog.p1_returnedTHeMap=true;
                //System.out.println("�١١� p1 is returned!�١١�");
                egy.landmark_building();
                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                //System.out.println("�١١���湮 ȿ���� ����Ʈ�� ���� �������� ������ϴ١١١�");
                Egypt.p1_returnTheMapNaming=true;
            }//���帶ũ�� �������������


        }//name = " ����Ʈ " p1 index= 17


    }
    //p1�� ���� ��湮�ϴ� �޼ҵ�  //p1�� ���� ��湮�ϴ� �޼ҵ�  //p1�� ���� ��湮�ϴ� �޼ҵ�  //p1�� ���� ��湮�ϴ� �޼ҵ�  //p1�� ���� ��湮�ϴ� �޼ҵ�  //p1�� ���� ��湮�ϴ� �޼ҵ�  //p1�� ���� ��湮�ϴ� �޼ҵ�
    //p1�� ���� ��湮�ϴ� �޼ҵ�  //p1�� ���� ��湮�ϴ� �޼ҵ�  //p1�� ���� ��湮�ϴ� �޼ҵ�  //p1�� ���� ��湮�ϴ� �޼ҵ�  //p1�� ���� ��湮�ϴ� �޼ҵ�  //p1�� ���� ��湮�ϴ� �޼ҵ�


    public void p2_buyMapReturned() {

        //��� �����Ұ��ΰ�
        //if ���� ���� �������� ������ �����ϴ� �޼ҵ尡 �����ȴ�.
        //Ȯ���� �����ؼ� 3/4��  ������ ���� 1/4�� ���帶ũ�� �����Ҽ��ְ� ��.
        //���帶ũ �Ǽ��� Ÿ �÷��̾ ������ �ִ� ���� �����Ҽ�����. ������ ����� ���� �������⸸ ����
        //���� owner�� ��湮�� ���� Ȯ���� �߰��� ���๰�� ������ ����.
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
        }//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.


        if (Player.p2_index == 1 && Korea.name.equals(kor.p2_own)) {


            if (Korea.structureNone.equals(kor.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                kor.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                //System.out.println("�ڡڡ���湮���� ���� �ѱ��� ���� �������� ������ϴ١ڡڡ�");
                Korea.p2_returnTheMapNaming=true;
            }//building�� �̹� ������ �ִ� ���

            if (Korea.structureNone.equals(kor.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                kor.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                //System.out.println("�ڡڡ���湮 ȿ���� �ѱ��� ���� �������� ������ϴ١ڡڡ�");
                Korea.p2_returnTheMapNaming=true;
            }//���帶ũ�� �������������


        }//name =  " �ѱ� " p1_index =1

        else if (Player.p2_index == 2 && Japan.name.equals(jap.p2_own)) {


            if (Japan.structureNone.equals(jap.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                jap.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                //System.out.println("�ڡڡ���湮���� ���� �Ϻ��� ���� �������� ������ϴ١ڡڡ�");
                Japan.p2_returnTheMapNaming=true;
            }//building�� �̹� ������ �ִ� ���

            if (Japan.structureNone.equals(jap.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                jap.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                //System.out.println("�ڡڡ���湮 ȿ���� �Ϻ��� ���� �������� ������ϴ١ڡڡ�");
                Japan.p2_returnTheMapNaming=true;

            }//���帶ũ�� �������������

        }//name = " �Ϻ� " p1_index =2


        else if (Player.p2_index == 3 && China.name.equals(chi.p2_own)) {


            if (China.structureNone.equals(chi.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                chi.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                //System.out.println("�ڡڡ���湮���� ���� �߱��� ���� �������� ������ϴ١ڡڡ�");
                China.p2_returnTheMapNaming=true;
            }//building�� �̹� ������ �ִ� ���

            if (China.structureNone.equals(chi.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                chi.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
//                System.out.println("�ڡڡ���湮 ȿ���� �߱��� ���� �������� ������ϴ١ڡڡ�");
                China.p2_returnTheMapNaming=true;
            }//���帶ũ�� �������������


        }//name = " �߱� " p2_index =3


        else if (Player.p2_index == 5 && England.name.equals(eng.p2_own)) {


            if (England.structureNone.equals(eng.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ�p2 is returned!�ڡڡ�");
                eng.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
  //              System.out.println("�ڡڡ���湮���� ���� ������ ���� �������� ������ϴ١ڡڡ�");
                England.p2_returnTheMapNaming=true;
            }//building�� �̹� ������ �ִ� ���

            if (England.structureNone.equals(eng.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ�p2 is returned!�ڡڡ�");
                eng.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                //System.out.println("�ڡڡ���湮 ȿ���� ������ ���� �������� ������ϴ١ڡڡ�");
                England.p2_returnTheMapNaming=true;
            }//���帶ũ�� �������������

        }//name = " ���� " p2_index = 5


        else if (Player.p2_index == 6 && France.name.equals(fra.p2_own)) {
            if(TimeThread.Season.equals(TT.Summer)){
                PlayboardLog.p2_france_protesting=true;
                //System.out.println("���� ���������� ��ȸ �������̶� ���������� ó���Ҽ������ϴ�.");
            }//eqauals(Summer)
            else {

                if (France.structureNone.equals(fra.building)) {
                    PlayboardLog.p2_returnedTHeMap=true;
                    //System.out.println("�ڡڡ�p2 is returned!�ڡڡ�");
                    fra.building_landmark();
                    Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                    France.p2_returnTheMapNaming=true;
                    //System.out.println("�ڡڡ���湮���� ���� �������� ���� �������� ������ϴ١ڡڡ�");
                }//building�� �̹� ������ �ִ� ���

                if (France.structureNone.equals(fra.landmark)) {
                    PlayboardLog.p2_returnedTHeMap=true;
                    //System.out.println("�ڡڡ�p2 is returned!�ڡڡ�");
                    fra.landmark_building();
                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                    France.p2_returnTheMapNaming=true;
                    //System.out.println("�ڡڡ���湮 ȿ���� �������� ���� �������� ������ϴ١ڡڡ�");

                }//���帶ũ�� �������������
            }//!Summer

        }//name = " ������ " p2_index = 6


        else if (Player.p2_index == 7 && Germany.name.equals(ger.p2_own)) {


            if (Germany.structureNone.equals(ger.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                ger.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Germany.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮���� ���� ���Ͽ� ���� �������� ������ϴ١ڡڡ�");
            }//building�� �̹� ������ �ִ� ���

            if (Germany.structureNone.equals(ger.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                ger.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Germany.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮 ȿ���� ���Ͽ� ���� �������� ������ϴ١ڡڡ�");

            }//���帶ũ�� �������������


        }//name = " ���� "  p2_index = 7


        else if (Player.p2_index == 8 && Russia.name.equals(rus.p2_own)) {


            if (Russia.structureNone.equals(rus.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                rus.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Russia.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮���� ���� ���þƿ� ���� �������� ������ϴ١ڡڡ�");
            }//building�� �̹� ������ �ִ� ���

            if (Russia.structureNone.equals(rus.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                rus.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                //System.out.println("�ڡڡ���湮 ȿ���� ���þƿ� ���� �������� ������ϴ١ڡڡ�");
                Russia.p2_returnTheMapNaming=true;
            }//���帶ũ�� �������������


        }//name = " ���þ�  " p2_index =8


        else if (Player.p2_index == 10 && USA.name.equals(usa.p2_own)) {


            if (USA.structureNone.equals(usa.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                usa.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                USA.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮���� ���� �̱��� ���� �������� ������ϴ١ڡڡ�");
            }//building�� �̹� ������ �ִ� ���

            if (USA.structureNone.equals(usa.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                usa.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                USA.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮 ȿ���� �̱��� ���� �������� ������ϴ١ڡڡ�");

            }//���帶ũ�� �������������


        }//name = " �̱� " p2_index = 10


        else if (Player.p2_index == 11 && Canada.name.equals(can.p2_own)) {


            if (Canada.structureNone.equals(can.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p1 is returned!�ڡڡ�");
                can.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                //System.out.println("�ڡڡ���湮���� ���� ĳ���ٿ� ���� �������� ������ϴ١ڡڡ�");
                Canada.p2_returnTheMapNaming=true;
            }//building�� �̹� ������ �ִ� ���

            if (Canada.structureNone.equals(can.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p1 is returned!�ڡڡ�");
                can.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Canada.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮 ȿ���� ĳ���ٿ� ���� �������� ������ϴ١ڡڡ�");

            }//���帶ũ�� �������������


        }//name = " ĳ���� "  p2_index= 11


        else if (Player.p2_index == 12 && Mexico.name.equals(mex.p2_own)) {


            if (Mexico.structureNone.equals(mex.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                mex.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Mexico.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮���� ���� �߽��ڿ� ���� �������� ������ϴ١ڡڡ�");
            }//building�� �̹� ������ �ִ� ���

            if (Mexico.structureNone.equals(mex.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                mex.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Mexico.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮 ȿ���� �߽��ڿ� ���� �������� ������ϴ١ڡڡ�");

            }//���帶ũ�� �������������


        }//name = " �߽��� " p2_index= 12


        else if (Player.p2_index == 14 && Italy.name.equals(ita.p2_own)) {


            if (Italy.structureNone.equals(ita.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ�p2 is returned!�ڡڡ�");
                ita.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Italy.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮���� ���� ��Ż���ƿ� ���� �������� ������ϴ١ڡڡ�");
            }//building�� �̹� ������ �ִ� ���

            if (Italy.structureNone.equals(ita.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ�p2 is returned!�ڡڡ�");
                ita.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Italy.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮 ȿ���� ��Ż���ƿ� ���� �������� ������ϴ١ڡڡ�");

            }//���帶ũ�� �������������


        }//name = " ��Ż���� " p2_index= 14


        else if (Player.p2_index == 15 && Swiss.name.equals(swi.p2_own)) {


            if (Swiss.structureNone.equals(swi.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p1 is returned!�ڡڡ�");
                swi.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Swiss.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮���� ���� �������� ���� �������� ������ϴ١ڡڡ�");
            }//building�� �̹� ������ �ִ� ���

            if (Swiss.structureNone.equals(swi.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p1 is returned!�ڡڡ�");
                swi.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Swiss.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮 ȿ���� �������� ���� �������� ������ϴ١ڡڡ�");

            }//���帶ũ�� �������������


        }//name = " ������ " p2_index=15


        else if (Player.p2_index == 16 && Vietnam.name.equals(vie.p2_own)) {


            if (Vietnam.structureNone.equals(vie.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ�p2 is returned!�ڡڡ�");
                vie.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Vietnam.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮���� ���� ��Ʈ���� ���� �������� ������ϴ١ڡڡ�");
            }//building�� �̹� ������ �ִ� ���

            if (Vietnam.structureNone.equals(vie.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ�p2 is returned!�ڡڡ�");
                vie.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Vietnam.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮 ȿ���� ��Ʈ���� ���� �������� ������ϴ١ڡڡ�");

            }//���帶ũ�� �������������


        }//name = " ��Ʈ�� " p2_index =16


        else if (Player.p2_index == 17 && Egypt.name.equals(egy.p2_own)) {


            if (Egypt.structureNone.equals(egy.building)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                egy.building_landmark();
                Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
                Egypt.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮���� ���� ����Ʈ�� ���� �������� ������ϴ١ڡڡ�");
            }//building�� �̹� ������ �ִ� ���

            if (Egypt.structureNone.equals(egy.landmark)) {
                PlayboardLog.p2_returnedTHeMap=true;
                //System.out.println("�ڡڡ� p2 is returned!�ڡڡ�");
                egy.landmark_building();
                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                Egypt.p2_returnTheMapNaming=true;
                //System.out.println("�ڡڡ���湮 ȿ���� ����Ʈ�� ���� �������� ������ϴ١ڡڡ�");

            }//���帶ũ�� �������������


        }//name = " ����Ʈ " p2 index= 17


    }
    //p2�� ���� ��湮�ϴ� �޼ҵ�


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
        //����1�� �ٸ� ������ �����ϰ��ִ� �ʿ� ���� �Ǹ� ���๰�� ���� ���༼�� �����ϰ� ��.
        //���� 10cash  ���帶ũ 20ĳ��   ����_��ũ 30ĳ��

        if(TurnOver.p1_turnOver){
            return;
        }//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.


        if (Player.p1_index == 1) {
            if (Korea.name.equals(kor.p2_own)) {
              //  System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
              //  System.out.println("������!");
                Korea.p1_movedOtherPlayerMap=true;
                if ((Korea.structureNone.equals(kor.building))) {
                    Player.p1_cash = Player.p1_cash - Korea.buildingCost;
                    Player.p2_cash = Player.p2_cash + Korea.buildingCost;
                    Korea.p1_taxBuilding=true;
                    //System.out.println("���ϳ�� ��� ����ᰡ "+Korea.buildingCost+"���̳� ��!");
                }//building
                else if ((Korea.structureNone.equals(kor.landmark))) {
                    Player.p1_cash = Player.p1_cash - Korea.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Korea.landmarkCost;
                    Korea.p1_taxLandmark=true;
                   // System.out.println("���ϳ�� ��� ����ᰡ "+Korea.landmarkCost+"���̳� ��!");
                }//landmark
                else if (Korea.structureNone.equals(kor.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Korea.build_markCost;
                    Player.p2_cash = Player.p2_cash + Korea.build_markCost;
                    Korea.p1_taxBuild_mark=true;
                  //  System.out.println("���ϳ�� ��� ����ᰡ "+Korea.build_markCost+"���̳� ��!");
                }//build_mark
            }//name = kor.p2_own

        }//p1_index == 1

        else if (Player.p1_index == 2) {
            if (Japan.name.equals(jap.p2_own)) {
               // System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
               // System.out.println("������!");
                Japan.p1_movedOtherPlayerMap=true;
                if ((Japan.structureNone.equals(jap.building))) {
                    Player.p1_cash = Player.p1_cash - Japan.buildingCost;
                    Player.p2_cash = Player.p2_cash + Japan.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ "+Japan.buildingCost+"���̳� ��!");
                    Japan.p1_taxBuilding=true;
                }//building
                else if ((Japan.structureNone.equals(jap.landmark))) {
                    Player.p1_cash = Player.p1_cash - Japan.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Japan.landmarkCost;
                   // System.out.println("���ϳ�� ��� ����ᰡ 40���̳���!");
                    Japan.p1_taxLandmark=true;

                }//landmark
                else if (Japan.structureNone.equals(jap.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Japan.build_markCost;
                    Player.p2_cash = Player.p2_cash + Japan.build_markCost;
                   // System.out.println("���ϳ�� ��� ����ᰡ 60���̳���!");
                    Japan.p1_taxBuild_mark=true;

                }//build_mark
            }//name = jap.p2_own

        }//p1_index == 2


        else if (Player.p1_index == 3) {
            if (China.name.equals(chi.p2_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                China.p1_movedOtherPlayerMap=true;
                if ((China.structureNone.equals(chi.building))) {
                    Player.p1_cash = Player.p1_cash - China.buildingCost;
                    Player.p2_cash = Player.p2_cash + China.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                    China.p1_taxBuilding=true;
                }//building
                else if ((China.structureNone.equals(chi.landmark))) {
                    Player.p1_cash = Player.p1_cash - China.landmarkCost;
                    Player.p2_cash = Player.p2_cash + China.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 40���̳���!");
                    China.p1_taxLandmark=true;

                }//landmark
                else if (China.structureNone.equals(chi.build_mark)) {
                    Player.p1_cash = Player.p1_cash - China.build_markCost;
                    Player.p2_cash = Player.p2_cash + China.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 60���̳���!");
                    China.p1_taxBuild_mark=true;

                }//build_mark
            }//name = chi.p2_own

        }//p1_index == 3

        //���ε�

        else if (Player.p1_index == 5) {
            if (England.name.equals(eng.p2_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                England.p1_movedOtherPlayerMap=true;
                if ((England.structureNone.equals(eng.building))) {
                    Player.p1_cash = Player.p1_cash - England.buildingCost;
                    Player.p2_cash = Player.p2_cash + England.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 13���̳���!");
                    England.p1_taxBuilding=true;
                }//building
                else if ((England.structureNone.equals(eng.landmark))) {
                    Player.p1_cash = Player.p1_cash - England.landmarkCost;
                    Player.p2_cash = Player.p2_cash + England.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 26���̳���!");
                    England.p1_taxLandmark=true;
                }//landmark
                else if (England.structureNone.equals(eng.build_mark)) {
                    Player.p1_cash = Player.p1_cash - England.build_markCost;
                    Player.p2_cash = Player.p2_cash + England.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 39���̳���!");
                    England.p1_taxBuild_mark=true;
                }//build_mark
            }//eng.name = eng.p2_own

        }//p1_index == 5


        else if (Player.p1_index == 6) {
            if(TimeThread.Season.equals(TT.Summer)){
                PlayboardLog.p1_france_protesting=true;
                //System.out.println("���� ���������� ��ȸ �������̶� ���������� ó���Ҽ������ϴ�.");
            }
            else {
                if (France.name.equals(fra.p2_own)) {
                    //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                    //System.out.println("������!");
                    France.p1_movedOtherPlayerMap=true;
                    if ((France.structureNone.equals(fra.building))) {
                        Player.p1_cash = Player.p1_cash - France.buildingCost;
                        Player.p2_cash = Player.p2_cash + France.buildingCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 13���̳���!");
                        France.p1_taxBuilding=true;
                    }//building
                    else if ((France.structureNone.equals(fra.landmark))) {
                        Player.p1_cash = Player.p1_cash - France.landmarkCost;
                        Player.p2_cash = Player.p2_cash + France.landmarkCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 26���̳���!");
                        France.p1_taxLandmark=true;

                    }//landmark
                    else if (France.structureNone.equals(fra.build_mark)) {
                        Player.p1_cash = Player.p1_cash - France.build_markCost;
                        Player.p2_cash = Player.p2_cash + France.build_markCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 39���̳���!");
                        France.p1_taxBuild_mark=true;
                    }//build_mark
                }//kor.name =fra.p2_own
            }//!Summer
        }//p1_index == 6


        else if (Player.p1_index == 7) {
            if (Germany.name.equals(ger.p2_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Germany.p1_movedOtherPlayerMap=true;
                if ((Germany.structureNone.equals(ger.building))) {
                    Player.p1_cash = Player.p1_cash - Germany.buildingCost;
                    Player.p2_cash = Player.p2_cash + Germany.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 13���̳���!");
                    Germany.p1_taxBuilding=true;
                }//building
                else if ((Germany.structureNone.equals(ger.landmark))) {
                    Player.p1_cash = Player.p1_cash - Germany.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Germany.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 26���̳���!");
                    Germany.p1_taxLandmark=true;

                }//landmark
                else if (Germany.structureNone.equals(ger.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Germany.build_markCost;
                    Player.p2_cash = Player.p2_cash + Germany.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 39���̳���!");
                    Germany.p1_taxBuild_mark=true;

                }//build_mark
            }//kor.name = ger.p2_own

        }//p1_index == 7


        else if (Player.p1_index == 8) {
            if (Russia.name.equals(rus.p2_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Russia.p1_movedOtherPlayerMap=true;
                if ((Russia.structureNone.equals(rus.building))) {
                    Player.p1_cash = Player.p1_cash - Russia.buildingCost;
                    Player.p2_cash = Player.p2_cash + Russia.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 13���̳���!");
                    Russia.p1_taxBuilding=true;
                }//building
                else if ((Russia.structureNone.equals(rus.landmark))) {
                    Player.p1_cash = Player.p1_cash - Russia.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Russia.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 26���̳���!");
                    Russia.p1_taxLandmark=true;

                }//landmark
                else if (Russia.structureNone.equals(rus.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Russia.build_markCost;
                    Player.p2_cash = Player.p2_cash + Russia.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 39���̳���!");
                    Russia.p1_taxBuild_mark=true;

                }//build_mark
            }//name = rus.p2_own

        }//p1_index == 8

        //tax x2

        else if (Player.p1_index == 10) {
            if (USA.name.equals(usa.p2_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                USA.p1_movedOtherPlayerMap=true;
                if ((USA.structureNone.equals(usa.building))) {
                    Player.p1_cash = Player.p1_cash - USA.buildingCost;
                    Player.p2_cash = Player.p2_cash + USA.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 16���̳���!");
                    USA.p1_taxBuilding=true;
                }//building
                else if ((USA.structureNone.equals(usa.landmark))) {
                    Player.p1_cash = Player.p1_cash - USA.landmarkCost;
                    Player.p2_cash = Player.p2_cash + USA.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 32���̳���!");
                    USA.p1_taxLandmark=true;

                }//landmark
                else if (USA.structureNone.equals(usa.build_mark)) {
                    Player.p1_cash = Player.p1_cash - USA.build_markCost;
                    Player.p2_cash = Player.p2_cash + USA.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 48���̳���!");
                    USA.p1_taxBuild_mark=true;

                }//build_mark
            }//usa.name = usa.p2_own

        }//p1_index == 10


        else if (Player.p1_index == 11) {
            if (Canada.name.equals(can.p2_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Canada.p1_movedOtherPlayerMap=true;
                if ((Canada.structureNone.equals(can.building))) {
                    Player.p1_cash = Player.p1_cash - Canada.buildingCost;
                    Player.p2_cash = Player.p2_cash + Canada.buildingCost;
                  //  System.out.println("���ϳ�� ��� ����ᰡ 16���̳���!");
                    Canada.p1_taxBuilding=true;
                }//building
                else if ((Canada.structureNone.equals(can.landmark))) {
                    Player.p1_cash = Player.p1_cash - Canada.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Canada.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 32���̳���!");
                    Canada.p1_taxLandmark=true;

                }//landmark
                else if (Canada.structureNone.equals(can.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Canada.build_markCost;
                    Player.p2_cash = Player.p2_cash + Canada.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 48���̳���!");
                    Canada.p1_taxBuild_mark=true;
                }//build_mark
            }//name = can.p2_own

        }//p1_index == 11


        else if (Player.p1_index == 12) {
            if (Mexico.name.equals(mex.p2_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Mexico.p1_movedOtherPlayerMap=true;
                if ((Mexico.structureNone.equals(mex.building))) {
                    Player.p1_cash = Player.p1_cash - Mexico.buildingCost;
                    Player.p2_cash = Player.p2_cash + Mexico.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 16���̳���!");
                    Mexico.p1_taxBuilding=true;
                }//building
                else if ((Mexico.structureNone.equals(mex.landmark))) {
                    Player.p1_cash = Player.p1_cash - Mexico.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Mexico.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 32���̳���!");
                    Mexico.p1_taxLandmark=true;

                }//landmark
                else if (Mexico.structureNone.equals(mex.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Mexico.build_markCost;
                    Player.p2_cash = Player.p2_cash + Mexico.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 48���̳���!");
                    Mexico.p1_taxBuild_mark=true;
                }//build_mark
            }//kor.name = mex

        }//p1_index == 12

        //balloon

        else if (Player.p1_index == 14) {
            if (Italy.name.equals(ita.p2_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Italy.p1_movedOtherPlayerMap=true;
                if ((Italy.structureNone.equals(ita.building))) {
                    Player.p1_cash = Player.p1_cash - Italy.buildingCost;
                    Player.p2_cash = Player.p2_cash + Italy.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 10���̳���!");
                    Italy.p1_taxBuilding=true;
                }//building
                else if ((Italy.structureNone.equals(ita.landmark))) {
                    Player.p1_cash = Player.p1_cash - Italy.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Italy.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                    Italy.p1_taxLandmark=true;
                }//landmark
                else if (Italy.structureNone.equals(ita.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Italy.build_markCost;
                    Player.p2_cash = Player.p2_cash + Italy.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 30���̳���!");
                    Italy.p1_taxBuild_mark=true;

                }//build_mark
            }//kor.name = ita.p2_own

        }//p1_index == 14


        else if (Player.p1_index == 15) {
            if (Swiss.name.equals(swi.p2_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Swiss.p1_movedOtherPlayerMap=true;
                if ((Swiss.structureNone.equals(swi.building))) {
                    Player.p1_cash = Player.p1_cash - Swiss.buildingCost;
                    Player.p2_cash = Player.p2_cash + Swiss.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 10���̳���!");
                    Swiss.p1_taxBuilding=true;
                }//building
                else if ((Swiss.structureNone.equals(swi.landmark))) {
                    Player.p1_cash = Player.p1_cash - Swiss.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Swiss.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                    Swiss.p1_taxLandmark=true;
                }//landmark
                else if (Swiss.structureNone.equals(swi.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Swiss.build_markCost;
                    Player.p2_cash = Player.p2_cash + Swiss.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 30���̳���!");
                    Swiss.p1_taxBuild_mark=true;

                }//build_mark
            }//kor.name = swi.p2_own

        }//p1_index == 15


        else if (Player.p1_index == 16) {
            if (Vietnam.name.equals(vie.p2_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Vietnam.p1_movedOtherPlayerMap=true;
                if ((Vietnam.structureNone.equals(vie.building))) {
                    Player.p1_cash = Player.p1_cash - Vietnam.buildingCost;
                    Player.p2_cash = Player.p2_cash + Vietnam.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 10���̳���!");
                    Vietnam.p1_taxBuilding=true;
                }//building
                else if ((Vietnam.structureNone.equals(vie.landmark))) {
                    Player.p1_cash = Player.p1_cash - Vietnam.landmarkCost;
                    Player.p2_cash = Player.p2_cash + Vietnam.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                    Vietnam.p1_taxLandmark=true;

                }//landmark
                else if (Vietnam.structureNone.equals(vie.build_mark)) {
                    Player.p1_cash = Player.p1_cash - Vietnam.build_markCost;
                    Player.p2_cash = Player.p2_cash + Vietnam.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 30���̳���!");
                    Vietnam.p1_taxBuild_mark=true;

                }//build_mark
            }//kor.name = vie.p2_own

        }//p1_index == 16


        else if (Player.p1_index == 17) {
            if(TimeThread.Season.equals(TT.Winter)) {
                Egypt.p1_egyptEvent =true;
                //System.out.println("���� ��� ������� ���������� ���Ƽ� ���� �ᰡ 2�谡 �Ǿ����ϴ�.");
                if (Egypt.name.equals(egy.p2_own)) {
                   // System.out.println("��� �÷��̾�� ����� ���� ������ ���� �߽��ϴ�.");
                    //System.out.println("������!");
                    if ((Egypt.structureNone.equals(egy.building))) {
                        Player.p1_cash = Player.p1_cash - (Egypt.buildingCost*2);
                        Player.p2_cash = Player.p2_cash + (Egypt.buildingCost*2);
                        Egypt.p1_egyptEventBuilding =true;
                        //System.out.println("����ᰡ �� 2�質 �ö�! �ȵ�!!");
                        //System.out.println("���ϳ�� ��� ����ᰡ 20���̳� ��!");


                    }//building
                    else if ((Egypt.structureNone.equals(egy.landmark))) {
                        Player.p1_cash = Player.p1_cash - (Egypt.landmarkCost*2);
                        Player.p2_cash = Player.p2_cash + (Egypt.landmarkCost*2);
                        Egypt.p1_egyptEventLandmark =true;
                        //System.out.println("����ᰡ �� 2�質 �ö�! �ȵ�!!");
                        //System.out.println("���ϳ�� ��� ����ᰡ 40���̳� ��!");
                    }//landmark
                    else if (Egypt.structureNone.equals(egy.build_mark)) {
                        Egypt.p1_egyptEventBuild_mark =true;
                        Player.p1_cash = Player.p1_cash - (Egypt.build_markCost*2);
                        Player.p2_cash = Player.p2_cash + (Egypt.build_markCost*2);

                        //System.out.println("����ᰡ �� 2�質 �ö�! �ȵ�!!");
                        //System.out.println("���ϳ�� ��� ����ᰡ 60���̳� ��!");
                    }//build_mark
                }//kor.name = egy.p1_own
            }//if(Fall)
            else {
                if (Egypt.name.equals(egy.p2_own)) {
                    //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                    //System.out.println("������!");
                    Egypt.p1_movedOtherPlayerMap=true;
                    if ((Egypt.structureNone.equals(egy.building))) {
                        Player.p1_cash = Player.p1_cash - Egypt.buildingCost;
                        Player.p2_cash = Player.p2_cash + Egypt.buildingCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 10���̳���!");
                        Egypt.p1_taxBuilding=true;
                    }//building
                    else if ((Egypt.structureNone.equals(egy.landmark))) {
                        Player.p1_cash = Player.p1_cash - Egypt.landmarkCost;
                        Player.p2_cash = Player.p2_cash + Egypt.landmarkCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                        Egypt.p1_taxLandmark=true;

                    }//landmark
                    else if (Egypt.structureNone.equals(egy.build_mark)) {
                        Player.p1_cash = Player.p1_cash - Egypt.build_markCost;
                        Player.p2_cash = Player.p2_cash + Egypt.build_markCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 30���̳���!");
                        Egypt.p1_taxBuild_mark=true;

                    }//build_mark
                }//kor.name = egy.p2_own
            }//else(!Winter)
        }//p1_index == 17


    }//���� ���� �������� ���� ���� �ƴ� ����!
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
        //����1�� �ٸ� ������ ���� �ϰ� �ִ� �ʿ� ��� ���� �Ǹ� ���� ���� ���� ���� ���� ���� �ϰ� ��.
        //���� 10cash  ���帶ũ 20ĳ��   ����_��ũ 30ĳ��  -> ������ ������ ���� �ο�

        if(TurnOver.p2_turnOver){
            return;
        }//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.


        if (Player.p2_index == 1) {
            if (Korea.name.equals(kor.p1_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
               // System.out.println("������!");
                Korea.p2_movedOtherPlayerMap=true;
                if ((Korea.structureNone.equals(kor.building))) {
                    Player.p2_cash = Player.p2_cash - Korea.buildingCost;
                    Player.p1_cash = Player.p1_cash + Korea.buildingCost;
                    Korea.p2_taxBuilding=true;
                    //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                }//building
                else if ((Korea.structureNone.equals(kor.landmark))) {
                    Player.p2_cash = Player.p2_cash - Korea.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Korea.landmarkCost;
                    Korea.p2_taxLandmark=true;
                    //System.out.println("���ϳ�� ��� ����ᰡ 40���̳���!");
                }//landmark
                else if (Korea.structureNone.equals(kor.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Korea.build_markCost;
                    Player.p1_cash = Player.p1_cash + Korea.build_markCost;
                    Korea.p2_taxBuild_mark=true;
                    //System.out.println("���ϳ�� ��� ����ᰡ 60���̳���!");
                }//build_mark
            }//name = kor.p2_own

        }//p2_index == 1

        else if (Player.p2_index == 2) {
            if (Japan.name.equals(jap.p1_own)) {
                Japan.p2_movedOtherPlayerMap=true;
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                if ((Japan.structureNone.equals(jap.building))) {
                    Player.p2_cash = Player.p2_cash - Japan.buildingCost;
                    Player.p1_cash = Player.p1_cash + Japan.buildingCost;
                    Japan.p2_taxBuilding=true;
                    //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                }//building
                else if ((Japan.structureNone.equals(jap.landmark))) {
                    Player.p2_cash = Player.p2_cash - Japan.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Japan.landmarkCost;
                    Japan.p2_taxLandmark=true;
                    //System.out.println("���ϳ�� ��� ����ᰡ 40���̳���!");

                }//landmark
                else if (Japan.structureNone.equals(jap.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Japan.build_markCost;
                    Player.p1_cash = Player.p1_cash + Japan.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 60���̳���!");
                    Japan.p2_taxBuild_mark=true;

                }//build_mark
            }//name = jap.p1_own

        }//p2_index == 2


        else if (Player.p2_index == 3) {
            if (China.name.equals(chi.p1_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                China.p2_movedOtherPlayerMap=true;
                if ((China.structureNone.equals(chi.building))) {
                    Player.p2_cash = Player.p2_cash - China.buildingCost;
                    Player.p1_cash = Player.p1_cash + China.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                    China.p2_taxBuilding=true;
                }//building
                else if ((China.structureNone.equals(chi.landmark))) {
                    Player.p2_cash = Player.p2_cash - China.landmarkCost;
                    Player.p1_cash = Player.p1_cash + China.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 40���̳���!");
                    China.p2_taxLandmark=true;
                }//landmark
                else if (China.structureNone.equals(chi.build_mark)) {
                    Player.p2_cash = Player.p2_cash - China.build_markCost;
                    Player.p1_cash = Player.p1_cash + China.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 60���̳���!");
                    China.p2_taxBuild_mark=true;
                }//build_mark
            }//name = chi.p1_own

        }//p1_index == 3

        //���ε�

        else if (Player.p2_index == 5) {
            if (England.name.equals(eng.p1_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                England.p2_movedOtherPlayerMap=true;
                if ((England.structureNone.equals(eng.building))) {
                    Player.p2_cash = Player.p2_cash - England.buildingCost;
                    Player.p1_cash = Player.p1_cash + England.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 13���̳���!");
                    England.p2_taxBuilding=true;
                }//building
                else if ((England.structureNone.equals(eng.landmark))) {
                    Player.p2_cash = Player.p2_cash - England.landmarkCost;
                    Player.p1_cash = Player.p1_cash + England.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 26���̳���!");
                    England.p2_taxLandmark=true;
                }//landmark
                else if (England.structureNone.equals(eng.build_mark)) {
                    Player.p2_cash = Player.p2_cash - England.build_markCost;
                    Player.p1_cash = Player.p1_cash + England.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 39���̳���!");
                    England.p2_taxBuild_mark=true;

                }//build_mark
            }//eng.name = eng.p1_own

        }//p2_index == 5


        else if (Player.p2_index == 6) {
            if(TimeThread.Season.equals(TT.Summer)){
                PlayboardLog.p2_france_protesting=true;
                //System.out.println("���� ���������� ��ȸ �������̶� ���������� ó���Ҽ������ϴ�.");
            }//equals.Summer
            else {
                if (France.name.equals(fra.p1_own)) {
                    France.p2_movedOtherPlayerMap=true;
                    //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                    //System.out.println("������!");
                    if ((France.structureNone.equals(fra.building))) {
                        Player.p2_cash = Player.p2_cash - France.buildingCost;
                        Player.p1_cash = Player.p1_cash + France.buildingCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 13���̳���!");
                        France.p2_taxBuilding=true;
                    }//building
                    else if ((France.structureNone.equals(fra.landmark))) {
                        Player.p2_cash = Player.p2_cash - France.landmarkCost;
                        Player.p1_cash = Player.p1_cash + France.landmarkCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 26���̳���!");
                        France.p2_taxLandmark=true;

                    }//landmark
                    else if (France.structureNone.equals(fra.build_mark)) {
                        Player.p2_cash = Player.p2_cash - France.build_markCost;
                        Player.p1_cash = Player.p1_cash + France.build_markCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 30���̳���!");
                        France.p2_taxBuild_mark=true;
                    }//build_mark
                }//kor.name =fra.p1_own
            }//!Summer
        }//p2_index == 6


        else if (Player.p2_index == 7) {
            if (Germany.name.equals(ger.p1_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Germany.p2_movedOtherPlayerMap=true;
                if ((Germany.structureNone.equals(ger.building))) {
                    Player.p2_cash = Player.p2_cash - Germany.buildingCost;
                    Player.p1_cash = Player.p1_cash + Germany.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 13���̳���!");
                    Germany.p2_taxBuilding=true;
                }//building
                else if ((Germany.structureNone.equals(ger.landmark))) {
                    Player.p2_cash = Player.p2_cash - Germany.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Germany.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 26���̳���!");
                    Germany.p2_taxLandmark=true;
                }//landmark
                else if (Germany.structureNone.equals(ger.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Germany.build_markCost;
                    Player.p1_cash = Player.p1_cash + Germany.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 39���̳���!");
                    Germany.p2_taxBuild_mark=true;

                }//build_mark
            }//kor.name = ger.p2_own

        }//p1_index == 7


        else if (Player.p2_index == 8) {
            if (Russia.name.equals(rus.p1_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Russia.p2_movedOtherPlayerMap=true;
                if ((Russia.structureNone.equals(rus.building))) {
                    Player.p2_cash = Player.p2_cash - Russia.buildingCost;
                    Player.p1_cash = Player.p1_cash + Russia.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 13���̳���!");
                    Russia.p2_taxBuilding=true;
                }//building
                else if ((Russia.structureNone.equals(rus.landmark))) {
                    Player.p2_cash = Player.p2_cash - Russia.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Russia.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 26���̳���!");
                    Russia.p2_taxLandmark=true;

                }//landmark
                else if (Russia.structureNone.equals(rus.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Russia.build_markCost;
                    Player.p1_cash = Player.p1_cash + Russia.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 39���̳���!");
                    Russia.p2_taxBuild_mark=true;

                }//build_mark
            }//name = rus.p1_own

        }//p2_index == 8

        //tax x2

        else if (Player.p2_index == 10) {
            if (USA.name.equals(usa.p1_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                USA.p2_movedOtherPlayerMap=true;
                if ((USA.structureNone.equals(usa.building))) {
                    Player.p2_cash = Player.p2_cash - USA.buildingCost;
                    Player.p1_cash = Player.p1_cash + USA.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 16���̳���!");
                    USA.p2_taxBuilding=true;
                }//building
                else if ((USA.structureNone.equals(usa.landmark))) {
                    Player.p2_cash = Player.p2_cash - USA.landmarkCost;
                    Player.p1_cash = Player.p1_cash + USA.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 32���̳���!");
                    USA.p2_taxLandmark=true;
                }//landmark
                else if (USA.structureNone.equals(usa.build_mark)) {
                    Player.p2_cash = Player.p2_cash - USA.build_markCost;
                    Player.p1_cash = Player.p1_cash + USA.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 48���̳���!");
                    USA.p2_taxBuild_mark=true;

                }//build_mark
            }//usa.name = usa.p1_own

        }//p2_index == 10


        else if (Player.p2_index == 11) {
            if (Canada.name.equals(can.p1_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Canada.p2_movedOtherPlayerMap=true;
                if ((Canada.structureNone.equals(can.building))) {
                    Player.p2_cash = Player.p2_cash - Canada.buildingCost;
                    Player.p1_cash = Player.p1_cash + Canada.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 16���̳���!");
                    Canada.p2_taxBuilding=true;
                }//building
                else if ((Canada.structureNone.equals(can.landmark))) {
                    Player.p2_cash = Player.p2_cash - Canada.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Canada.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 32���̳���!");
                    Canada.p2_taxLandmark=true;

                }//landmark
                else if (Canada.structureNone.equals(can.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Canada.build_markCost;
                    Player.p1_cash = Player.p1_cash + Canada.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 48���̳���!");
                    Canada.p2_taxBuild_mark=true;
                }//build_mark
            }//name = can.p1_own

        }//p2_index == 11


        else if (Player.p2_index == 12) {
            if (Mexico.name.equals(mex.p1_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Mexico.p2_movedOtherPlayerMap=true;
                if ((Mexico.structureNone.equals(mex.building))) {
                    Player.p2_cash = Player.p2_cash - Mexico.buildingCost;
                    Player.p1_cash = Player.p1_cash + Mexico.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 16���̳���!");
                    Mexico.p2_taxBuilding=true;
                }//building
                else if ((Mexico.structureNone.equals(mex.landmark))) {
                    Player.p2_cash = Player.p2_cash - Mexico.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Mexico.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 32���̳���!");
                    Mexico.p2_taxLandmark=true;
                }//landmark
                else if (Mexico.structureNone.equals(mex.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Mexico.build_markCost;
                    Player.p1_cash = Player.p1_cash + Mexico.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 48���̳���!");
                    Mexico.p2_taxBuild_mark=true;
                }//build_mark
            }//kor.name = mex

        }//p2_index == 12

        //balloon

        else if (Player.p2_index == 14) {
            if (Italy.name.equals(ita.p1_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Italy.p2_movedOtherPlayerMap=true;
                if ((Italy.structureNone.equals(ita.building))) {
                    Player.p2_cash = Player.p2_cash - Italy.buildingCost;
                    Player.p1_cash = Player.p1_cash + Italy.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 10���̳���!");
                    Italy.p2_taxBuilding=true;
                }//building
                else if ((Italy.structureNone.equals(ita.landmark))) {
                    Player.p2_cash = Player.p2_cash - Italy.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Italy.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                    Italy.p2_taxLandmark=true;
                }//landmark
                else if (Italy.structureNone.equals(ita.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Italy.build_markCost;
                    Player.p1_cash = Player.p1_cash + Italy.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 30���̳���!");
                    Italy.p2_taxBuild_mark=true;
                }//build_mark
            }//kor.name = ita.p1_own

        }//p2_index == 14


        else if (Player.p2_index == 15) {
            if (Swiss.name.equals(swi.p1_own)) {
                //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                //System.out.println("������!");
                Swiss.p2_movedOtherPlayerMap=true;
                if ((Swiss.structureNone.equals(swi.building))) {
                    Player.p2_cash = Player.p2_cash - Swiss.buildingCost;
                    Player.p1_cash = Player.p1_cash + Swiss.buildingCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 10���̳���!");
                    Swiss.p2_taxBuilding=true;
                }//building
                else if ((Swiss.structureNone.equals(swi.landmark))) {
                    Player.p2_cash = Player.p2_cash - Swiss.landmarkCost;
                    Player.p1_cash = Player.p1_cash + Swiss.landmarkCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                    Swiss.p2_taxLandmark=true;

                }//landmark
                else if (Swiss.structureNone.equals(swi.build_mark)) {
                    Player.p2_cash = Player.p2_cash - Swiss.build_markCost;
                    Player.p1_cash = Player.p1_cash + Swiss.build_markCost;
                    //System.out.println("���ϳ�� ��� ����ᰡ 30���̳���!");
                    Swiss.p2_taxBuild_mark=true;
                }//build_mark
            }//kor.name = swi.p1_own

        }//p2_index == 15


        else if (Player.p2_index == 16) {
            if(TimeThread.Season.equals(TT.Fall)){
                System.out.println("���� ��簡 ǳ���̶� ������ ����޾Ҵ� :)");
            }
            else {
                if (Vietnam.name.equals(vie.p1_own)) {
                    //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                    //System.out.println("������!");
                    Vietnam.p2_movedOtherPlayerMap=true;
                    if ((Vietnam.structureNone.equals(vie.building))) {
                        Player.p2_cash = Player.p2_cash - Vietnam.buildingCost;
                        Player.p1_cash = Player.p1_cash + Vietnam.buildingCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 10���̳���!");
                        Vietnam.p2_taxBuilding=true;
                    }//building
                    else if ((Vietnam.structureNone.equals(vie.landmark))) {
                        Player.p2_cash = Player.p2_cash - Vietnam.landmarkCost;
                        Player.p1_cash = Player.p1_cash + Vietnam.landmarkCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                        Vietnam.p2_taxLandmark=true;
                    }//landmark
                    else if (Vietnam.structureNone.equals(vie.build_mark)) {
                        Player.p2_cash = Player.p2_cash - Vietnam.build_markCost;
                        Player.p1_cash = Player.p1_cash + Vietnam.build_markCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 30���̳���!");
                        Vietnam.p2_taxBuild_mark=true;
                    }//build_mark
                }//kor.name = vie.p1_own
            }//else(!Fall)
        }//p2_index == 16


        else if (Player.p2_index == 17) {
            if(TimeThread.Season.equals(TT.Winter)) {
                System.out.println("���� ��� ������� ���������� ���Ƽ� ����ᰡ 2�谡 �Ǿ����ϴ�.");
                if (Egypt.name.equals(egy.p1_own)) {
                   // System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                    //System.out.println("������!");

                    if ((Egypt.structureNone.equals(egy.building))) {
                        Player.p2_cash = Player.p2_cash - (Egypt.buildingCost*2);
                        Player.p1_cash = Player.p1_cash + (Egypt.buildingCost*2);
                        //System.out.println("���ϳ�� ��� ����ᰡ 10���̳� ��!");
                        //System.out.println("����ᰡ �� 2�質 �ö�! �ȵ�!!");

                    }//building
                    else if ((Egypt.structureNone.equals(egy.landmark))) {
                        Player.p2_cash = Player.p2_cash - (Egypt.landmarkCost*2);
                        Player.p1_cash = Player.p1_cash + (Egypt.landmarkCost*2);
                        //System.out.println("���ϳ�� ��� ����ᰡ 20���̳� ��!");
                        //System.out.println("����ᰡ �� 2�質 �ö�! �ȵ�!!");

                    }//landmark
                    else if (Egypt.structureNone.equals(egy.build_mark)) {
                        Player.p2_cash = Player.p2_cash - (Egypt.build_markCost*2);
                        Player.p1_cash = Player.p1_cash + (Egypt.build_markCost*2);
                        //System.out.println("���ϳ�� ��� ����ᰡ 30���̳� ��!");
                        //System.out.println("����ᰡ �� 2�質 �ö�! �ȵ�!!");

                    }//build_mark
                }//kor.name = egy.p2_own
            }//if(Fall)
            else {
                if (Egypt.name.equals(egy.p1_own)) {
                    Egypt.p2_movedOtherPlayerMap=true;
                    //System.out.println("��� �÷��̾�� ����� ���� ������ �����߽��ϴ�.");
                    //System.out.println("������!");
                    if ((Egypt.structureNone.equals(egy.building))) {
                        Player.p2_cash = Player.p2_cash - Egypt.buildingCost;
                        Player.p1_cash = Player.p1_cash + Egypt.buildingCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 10���̳���!");
                        Egypt.p2_taxBuilding=true;
                    }//building
                    else if ((Egypt.structureNone.equals(egy.landmark))) {
                        Player.p2_cash = Player.p2_cash - Egypt.landmarkCost;
                        Player.p1_cash = Player.p1_cash + Egypt.landmarkCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 20���̳���!");
                        Egypt.p2_taxLandmark=true;
                    }//landmark
                    else if (Egypt.structureNone.equals(egy.build_mark)) {
                        Player.p2_cash = Player.p2_cash - Egypt.build_markCost;
                        Player.p1_cash = Player.p1_cash + Egypt.build_markCost;
                        //System.out.println("���ϳ�� ��� ����ᰡ 30���̳���!");
                        Egypt.p2_taxBuild_mark=true;
                    }//build_mark
                }//kor.name = egy.p2_own
            }//else(!Winter)
        }//p1_index == 17


    }//���� ���� �������� ���� ���� �ƴ϶���!
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
        String YES = "����";
        String NO = "����";

        if(TurnOver.p1_turnOver){
            return;
        }//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.


        if (Player.p1_index == 1) {

            if (Korea.name.equals(kor.p2_own)) {

                if (Korea.structureNone.equals(kor.building)) {
                    if (Japan.structureNone.equals(jap.p2_own) && China.structureNone.equals(chi.p2_own)) {
                        //System.out.println("���� ������ ���� ����� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
                       // System.out.println(kor.travel + "��(��) �����Ͻðڽ��ϱ�?");
                       // System.out.println("������ 22�� �Դϴ�.");
                       // System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է��� �ּ���  :)");
                      //  System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է��� �ּ���.");
                        Korea.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(kor.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ� �־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(kor.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 22���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Korea.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(kor.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
                                Korea.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 22;
                                Player.p2_cash = Player.p2_cash + 22;
                                kor.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own)

        }//p1_index==1


        else if (Player.p1_index == 2) {
            if (Japan.name.equals(jap.p2_own)) {
                if (Japan.structureNone.equals(jap.building)) {
                    if (Korea.structureNone.equals(kor.p2_own) && China.structureNone.equals(chi.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(jap.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 22���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Japan.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(jap.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ ���� �ϰ� �־��� ���� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(jap.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 22���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                       Japan.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(jap.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
                                Japan.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 22;
                                Player.p2_cash = Player.p2_cash + 22;
                                jap.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own)

        }//p1_index==2


        else if (Player.p1_index == 3) {
            if (China.name.equals(chi.p2_own)) {
                if (China.structureNone.equals(chi.building)) {
                    if (Japan.structureNone.equals(jap.p2_own) && Korea.structureNone.equals(kor.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(chi.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 22���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        China.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(chi.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(chi.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 22���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        China.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(chi.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
                                China.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 22;
                                Player.p2_cash = Player.p2_cash + 22;
                                chi.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building
            }//chi.p2_own
        }//p1_index==3


        else if (Player.p1_index == 5) {
            if (England.name.equals(eng.p2_own)) {
                if (England.structureNone.equals(eng.building)) {
                    if (France.structureNone.equals(fra.p2_own) && Russia.structureNone.equals(rus.p2_own) && Germany.structureNone.equals(ger.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(eng.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        England.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(eng.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(eng.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        England.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(eng.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                England.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                eng.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own)

        }//p1_index==5


        else if (Player.p1_index == 6) {
            if(TimeThread.Season.equals(TT.Summer)){
               PlayboardLog.p1_france_protesting=true;
               // System.out.println("���� ���������� ��ȸ �������̶� ���������� ó���Ҽ������ϴ�.");
            }
            else{
            if (France.name.equals(fra.p2_own)) {
                if (France.structureNone.equals(fra.building)) {
                    if (England.structureNone.equals(eng.p2_own) && Russia.structureNone.equals(rus.p2_own) && Germany.structureNone.equals(ger.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(fra.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        France.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(fra.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(fra.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        France.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(fra.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                France.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                fra.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own)
            }//!summer
        }//p1_index==6


        else if (Player.p1_index == 7) {
            if (Germany.name.equals(ger.p2_own)) {
                if (Germany.structureNone.equals(ger.building)) {
                    if (France.structureNone.equals(fra.p2_own) && Russia.structureNone.equals(rus.p2_own) && England.structureNone.equals(eng.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(ger.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Germany.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(ger.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(ger.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Germany.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(ger.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                Germany.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                ger.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own)ger

        }//p1_index==7


        else if (Player.p1_index == 8) {
            if (Russia.name.equals(rus.p2_own)) {
                if (Russia.structureNone.equals(rus.building)) {
                    if (France.structureNone.equals(fra.p2_own) && England.structureNone.equals(eng.p2_own) && Germany.structureNone.equals(ger.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(rus.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Russia.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(rus.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(rus.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Russia.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(rus.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                Russia.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 14;
                                Player.p2_cash = Player.p2_cash + 14;
                                rus.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own)

        }//p1_index==8


        else if (Player.p1_index == 10) {
            if (USA.name.equals(usa.p2_own)) {
                if (USA.structureNone.equals(usa.building)) {
                    if (Canada.structureNone.equals(can.p2_own) && Mexico.structureNone.equals(mex.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(usa.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        USA.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(usa.travel + "��(��) ���� �߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 18����� ���� �߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 18����� ���� �߽��ϴ�.");
                                System.out.println("���� ���� ������ ���� �Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(usa.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        USA.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(usa.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 18����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 18����� �����߽��ϴ�.");
                                USA.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 18;
                                Player.p2_cash = Player.p2_cash + 18;
                                usa.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own)

        }//p1_index==10


        else if (Player.p1_index == 11) {
            if (Canada.name.equals(can.p2_own)) {
                if (Canada.structureNone.equals(can.building)) {
                    if (USA.structureNone.equals(usa.p2_own) && Mexico.structureNone.equals(mex.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(can.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Canada.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(can.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 18����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 18����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(can.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            Canada.p1_willTakeYourMap=true;
                            board.playboard();
                            while (true) {
                                choice = scan.nextLine();
                                if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(can.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 18����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 18����� �����߽��ϴ�.");
                                Canada.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 18;
                                Player.p2_cash = Player.p2_cash + 18;
                                can.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own) can

        }//p1_index==11


        else if (Player.p1_index == 12) {
            if (Mexico.name.equals(mex.p2_own)) {
                if (Mexico.structureNone.equals(mex.building)) {
                    if (Canada.structureNone.equals(can.p2_own) && USA.structureNone.equals(usa.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(mex.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Mexico.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(mex.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 18����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 18����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(mex.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Mexico.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(mex.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 18����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 18����� �����߽��ϴ�.");
                                Mexico.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 18;
                                Player.p2_cash = Player.p2_cash + 18;
                                mex.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own)

        }//p1_index==12


        else if (Player.p1_index == 14) {
            if (Italy.name.equals(ita.p2_own)) {
                if (Italy.structureNone.equals(ita.building)) {
                    if (Swiss.structureNone.equals(swi.p2_own) && Vietnam.structureNone.equals(vie.p2_own) && Egypt.structureNone.equals(egy.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(ita.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Italy.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(ita.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�Ʒ��� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(ita.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Italy.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(ita.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                Italy.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                ita.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own)

        }//p1_index==14


        else if (Player.p1_index == 15) {
            if (Swiss.name.equals(swi.p2_own)) {
                if (Swiss.structureNone.equals(swi.building)) {
                    if (Italy.structureNone.equals(ita.p2_own) && Vietnam.structureNone.equals(vie.p2_own) && Egypt.structureNone.equals(egy.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(swi.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Swiss.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(swi.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�Ʒ��� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(swi.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Swiss.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(swi.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                Swiss.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                swi.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���

                }//building


            }//name.equals(p2_own) swi

        }//p1_index==15


        else if (Player.p1_index == 16) {
            if (Vietnam.name.equals(vie.p2_own)) {
                if (Vietnam.structureNone.equals(vie.building)) {
                    if (Swiss.structureNone.equals(swi.p2_own) && Italy.structureNone.equals(ita.p2_own) && Egypt.structureNone.equals(egy.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(vie.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Vietnam.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(vie.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�Ʒ��� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(vie.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Vietnam.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(vie.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                Vietnam.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                vie.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���

                }//building


            }//name.equals(p2_own) vie

        }//p1_index==16

        else if (Player.p1_index == 17) {
            if (Egypt.name.equals(egy.p2_own)) {
                if (Egypt.structureNone.equals(egy.building)) {
                    if (Swiss.structureNone.equals(swi.p2_own) && Vietnam.structureNone.equals(vie.p2_own) && Italy.structureNone.equals(ita.p2_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(ita.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Egypt.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(egy.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�Ʒ��� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(egy.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Egypt.p1_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(egy.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                Egypt.p1_willTakeYourMapYes=true;
                                Player.p1_cash = Player.p1_cash - 11;
                                Player.p2_cash = Player.p2_cash + 11;
                                egy.buyOwn2p();
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���

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
        String no = "����";
        String YES = "����";
        String NO = "ss";


        if(TurnOver.p2_turnOver){
            return;
        }//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.

        if (Player.p2_index == 1) {
            if (Korea.name.equals(kor.p1_own)) {
                if (Korea.structureNone.equals(kor.building)) {
                    if (Japan.structureNone.equals(jap.p1_own) && China.structureNone.equals(chi.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(kor.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 22���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Korea.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(kor.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����


                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(kor.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 22���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Korea.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(kor.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
                                Korea.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 22;
                                Player.p1_cash = Player.p1_cash + 22;
                                kor.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own)

        }//p1_index==1


        else if (Player.p2_index == 2) {
            if (Japan.name.equals(jap.p1_own)) {
                if (Japan.structureNone.equals(jap.building)) {
                    if (Korea.structureNone.equals(kor.p1_own) && China.structureNone.equals(chi.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(jap.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 22���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Japan.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(jap.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(jap.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 22���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Japan.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(jap.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
                                Japan.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 22;
                                Player.p1_cash = Player.p1_cash + 22;
                                jap.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p1_own)

        }//p2_index==2


        else if (Player.p2_index == 3) {
            if (China.name.equals(chi.p1_own)) {
                if (China.structureNone.equals(chi.building)) {
                    if (Japan.structureNone.equals(jap.p1_own) && Korea.structureNone.equals(kor.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(chi.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 22���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        China.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(chi.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(chi.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 22���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        China.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(chi.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 22����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 22����� �����߽��ϴ�.");
                                China.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 22;
                                Player.p1_cash = Player.p1_cash + 22;
                                chi.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building
            }//chi.p1_own
        }//p1_index==3


        else if (Player.p2_index == 5) {
            if (England.name.equals(eng.p1_own)) {
                if (England.structureNone.equals(eng.building)) {
                    if (France.structureNone.equals(fra.p1_own) && Russia.structureNone.equals(rus.p1_own) && Germany.structureNone.equals(ger.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(eng.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        England.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(eng.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(eng.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                        England.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(eng.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                England.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 14;
                                Player.p1_cash = Player.p1_cash + 14;
                                eng.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p1_own)

        }//p2_index==5


        else if (Player.p2_index == 6) {
            if(TimeThread.Season.equals(TT.Summer)){
                System.out.println("���� ���������� ��ȸ �������̶� ���������� ó���Ҽ������ϴ�.");
            }
            else {
                if (France.name.equals(fra.p1_own)) {
                    if (France.structureNone.equals(fra.building)) {
                        if (England.structureNone.equals(eng.p1_own) && Russia.structureNone.equals(rus.p1_own) && Germany.structureNone.equals(ger.p1_own)) {
//                            System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                            System.out.println(fra.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                            System.out.println("������ 14���Դϴ�.");
//                            System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                            System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            France.p2_willTakeYourMap=true;
                            board.playboard();
                            while (true) {
                                choice = scan.nextLine();
                                if (choice.equals(yes) || choice.equals(YES)) {
                                    System.out.println(fra.travel + "��(��) �����߽��ϴ�.");
                                    System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                    System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                    System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                    //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                    break;
                                }//yes
                                else if (choice.equals(no) || choice.equals(NO)) {


                                    break;
                                }//no
                                else {
                                    System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                    System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                                }//else
                            }//while


                        }//������ �����ϰ��־������� ���� ����
                        else {
//                            System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                            System.out.println(fra.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                            System.out.println("������ 14���Դϴ�.");
//                            System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                            System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            France.p2_willTakeYourMap=true;
                            board.playboard();
                            while (true) {
                                choice = scan.nextLine();
                                if (choice.equals(yes) || choice.equals(YES)) {
//                                    System.out.println(fra.travel + "��(��) �����߽��ϴ�.");
//                                    System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
//                                    System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                    France.p2_willTakeYourMapYes=true;
                                    Player.p2_cash = Player.p2_cash - 14;
                                    Player.p1_cash = Player.p1_cash + 14;
                                    fra.buyOwn1p();
                                    Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                    Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                    //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                    break;
                                }//yes
                                else if (choice.equals(no) || choice.equals(NO)) {


                                    break;
                                }//no
                                else {
                                    System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                    System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                                }//else
                            }//while
                        }//���� ���� ���ϰ��ִ� ���
                    }//building


                }//name.equals(p1_own)
            }//else !Summer
        }//p2_index==6


        //���嵶����
        else if (Player.p2_index == 7) {
            if (Germany.name.equals(ger.p1_own)) {
                if (Germany.structureNone.equals(ger.building)) {
                    if (England.structureNone.equals(eng.p1_own) && Russia.structureNone.equals(rus.p1_own) && France.structureNone.equals(fra.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(ger.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Germany.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(ger.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(ger.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Germany.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(ger.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                Germany.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 14;
                                Player.p1_cash = Player.p1_cash + 14;
                                ger.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {

                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p1_own)ger

        }//p2_index==7


        else if (Player.p2_index == 8) {
            if (Russia.name.equals(rus.p1_own)) {
                if (Russia.structureNone.equals(rus.building)) {
                    if (England.structureNone.equals(eng.p1_own) && Germany.structureNone.equals(ger.p1_own) && France.structureNone.equals(fra.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(rus.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Russia.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(rus.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                System.out.println("���� ���ε����� �����Ǿ����ϴ�.");
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

                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(rus.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 14���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Russia.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(rus.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 14����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 14����� �����߽��ϴ�.");
                                Russia.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 14;
                                Player.p1_cash = Player.p1_cash + 14;
                                rus.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p1_own)

        }//p2_index==8

        //�̱� ��ġ����
        else if (Player.p2_index == 10) {
            if (USA.name.equals(usa.p1_own)) {
                if (USA.structureNone.equals(usa.building)) {
                    if (Canada.structureNone.equals(can.p1_own) && Mexico.structureNone.equals(mex.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(usa.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        USA.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(usa.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 18����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 18����� �����߽��ϴ�.");
                                System.out.println("������ ���ε����� �����Ǿ����ϴ�.");
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


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(usa.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        USA.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(usa.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 18����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 18����� �����߽��ϴ�.");
                                USA.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 18;
                                Player.p1_cash = Player.p1_cash + 18;
                                usa.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own)

        }//p2_index==10


        else if (Player.p2_index == 11) {
            if (Canada.name.equals(can.p1_own)) {
                if (Canada.structureNone.equals(can.building)) {
                    if (USA.structureNone.equals(usa.p1_own) && Mexico.structureNone.equals(mex.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(can.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Canada.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(can.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 18����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 18����� �����߽��ϴ�.");
                                System.out.println("������ ���ε����� �����Ǿ����ϴ�.");
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


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(can.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Canada.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(can.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 18����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 18����� �����߽��ϴ�.");
                                Canada.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 18;
                                Player.p1_cash = Player.p1_cash + 18;
                                can.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p1_own) can

        }//p2_index==12


        else if (Player.p2_index == 12) {
            if (Mexico.name.equals(mex.p1_own)) {
                if (Mexico.structureNone.equals(mex.building)) {
                    if (USA.structureNone.equals(usa.p1_own) && Canada.structureNone.equals(can.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(mex.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Mexico.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(mex.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 18����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 18����� �����߽��ϴ�.");
                                System.out.println("������ ���ε����� �����Ǿ����ϴ�.");
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


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(mex.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 18���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Mexico.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(mex.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 18����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 18����� �����߽��ϴ�.");
                                Mexico.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 18;
                                Player.p1_cash = Player.p1_cash + 18;
                                mex.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {

                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p1_own)

        }//p2_index==12


        else if (Player.p2_index == 14) {
            if (Italy.name.equals(ita.p1_own)) {
                if (Italy.structureNone.equals(ita.building)) {
                    if (Swiss.structureNone.equals(swi.p1_own) && Vietnam.structureNone.equals(vie.p1_own) && Egypt.structureNone.equals(egy.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(ita.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Italy.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(ita.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�Ʒ��� ���ε����� �����Ǿ����ϴ�.");
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


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(ita.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Italy.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(ita.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                Italy.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                ita.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p1_own)

        }//p2_index==14


        else if (Player.p2_index == 15) {
            if (Swiss.name.equals(swi.p1_own)) {
                if (Swiss.structureNone.equals(swi.building)) {
                    if (Italy.structureNone.equals(ita.p1_own) && Vietnam.structureNone.equals(vie.p1_own) && Egypt.structureNone.equals(egy.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(swi.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Swiss.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(swi.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�Ʒ��� ���ε����� �����Ǿ����ϴ�.");
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


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(swi.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Swiss.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(swi.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                Swiss.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                swi.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p1_own) swi

        }//p2_index==15


        else if (Player.p2_index == 16) {
            if (Vietnam.name.equals(vie.p1_own)) {
                if (Vietnam.structureNone.equals(vie.building)) {
                    if (Italy.structureNone.equals(ita.p1_own) && Swiss.structureNone.equals(swi.p1_own) && Egypt.structureNone.equals(egy.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(vie.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Vietnam.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(vie.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�Ʒ��� ���ε����� �����Ǿ����ϴ�.");
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


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(vie.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Vietnam.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(vie.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                Vietnam.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                vie.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
                }//building


            }//name.equals(p2_own) vie

        }//p2_index==16

        else if (Player.p2_index == 17) {
            if (Egypt.name.equals(egy.p1_own)) {
                if (Egypt.structureNone.equals(egy.building)) {
                    if (Italy.structureNone.equals(ita.p1_own) && Swiss.structureNone.equals(swi.p1_own) && Vietnam.structureNone.equals(vie.p1_own)) {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(egy.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Egypt.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
                                System.out.println(egy.travel + "��(��) �����߽��ϴ�.");
                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                System.out.println("�Ʒ��� ���ε����� �����Ǿ����ϴ�.");
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


                                //Ÿ �÷��̾ ����ϰ��ִ� ������ �� �����ϴ� ������ ���ؼ� ���ε����� ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while


                    }//������ �����ϰ��־������� ���� ����
                    else {
//                        System.out.println("���� ������ ��������� ���� �ʾƼ� �����Ҽ��ֽ��ϴ�.");
//                        System.out.println(egy.travel + "��(��) �����Ͻðڽ��ϱ�?");
//                        System.out.println("������ 11���Դϴ�.");
//                        System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���  :)");
//                        System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                        Egypt.p2_willTakeYourMap=true;
                        board.playboard();
                        while (true) {
                            choice = scan.nextLine();
                            if (choice.equals(yes) || choice.equals(YES)) {
//                                System.out.println(egy.travel + "��(��) �����߽��ϴ�.");
//                                System.out.println("�÷��̾�2�� ������ 11����� �����߽��ϴ�.");
//                                System.out.println("�÷��̾�1�� ������ 11����� �����߽��ϴ�.");
                                Egypt.p2_willTakeYourMapYes=true;
                                Player.p2_cash = Player.p2_cash - 11;
                                Player.p1_cash = Player.p1_cash + 11;
                                egy.buyOwn1p();
                                Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
                                Player.p1_mountOfBuilding = Player.p1_mountOfBuilding - 1;


                                //Ÿ �÷��̾ ����ϰ� �ִ� ������ �� �����ϴ� ������ ���ؼ� ���� ������ ����� ��쿡 ���� �ڵ�

                                break;
                            }//yes
                            else if (choice.equals(no) || choice.equals(NO)) {


                                break;
                            }//no
                            else {
                                System.out.println("������ �ǻ簡 �ִٸ� '����','dd'�� �Է� ���ּ���.  :)");
                                System.out.println("������ �ǻ簡 ���ٸ� '����','ss'�� �Է� ���ּ���.");
                            }//else
                        }//while
                    }//���� ���� ���ϰ��ִ� ���
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
            System.out.println("�١١ٿ��ʶ��ο� �ִ� ������ ��ΰ��١١�");


        }//if ���ε����϶�


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

        System.out.println("�١١������ο� �ִ� ������ ��ΰ��١١�");


        }//if ���ε����϶�


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

            System.out.println("�١١ٿ������ο� �ִ� ������ ��ΰ��١١�");


        }//if ���ε����϶�


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

            System.out.println("�١١پƷ����ο� �ִ� ������ ��ΰ��١١�");


        }//if ���ε����϶�


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

            System.out.println("�ڡڡڿ��ʶ��ο� �ִ� ������ ��ΰ��ڡڡ�");


        }//if ���ε����϶�


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

            System.out.println("�ڡڡ������ο� �ִ� ������ ��ΰ��ڡڡ�");


        }//if ���ε����϶�


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

            System.out.println("�ڡڡڿ������ο� �ִ� ������ ��ΰ��ڡڡ�");


        }//if ���ε����϶�


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

            System.out.println("�ڡڡھƷ����ο� �ִ� ������ ��ΰ��ڡڡ�");


        }//if ���� ������ ��


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
