package playM;

import java.sql.Time;
import java.util.Scanner;

public class England  extends Countries{

	static String name ="����������������";
	static String own1p,own2p;
	String ownName ="����������������";
	String p1_own  ="���ٿ����١���";
	String p2_own  ="���ڿ����ڡ���";
	static String playerNone	="����������������";
	String playerBlank	="����������������";
	String player1		="������~������������";
	String player2		="��������������~����";
	String player1_2 	="������~������~����";
	String building  	="�����ǡ���������";
	String landmark 	="�����������ʡ���";
	String build_mark	="�����ǡ����ʡ���";
	static String structureNone ="����������������";
	String travel ="����";




	static boolean p1_successContract;
	static boolean p1_startOwnTheLand;
	static boolean p1_returnTheMapNaming;
	static boolean p1_movedOtherPlayerMap;
	static boolean p1_taxBuilding;
	static boolean p1_taxLandmark;
	static boolean p1_taxBuild_mark;
	static boolean p1_willTakeYourMap;
	static boolean p1_willTakeYourMapYes;

	static boolean p2_successContract;
	static boolean p2_startOwnTheLand;
	static boolean p2_returnTheMapNaming;
	static boolean p2_movedOtherPlayerMap;
	static boolean p2_taxBuilding;
	static boolean p2_taxLandmark;
	static boolean p2_taxBuild_mark;
	static boolean p2_willTakeYourMap;
	static boolean p2_willTakeYourMapYes;




	static String value  		="����������������";
	static int buildingCost = 13;
	static int landmarkCost = 26;
	static int build_markCost=39;
	int cost;
	int contractNationYet=0;
	
	
	public void own1p() {
		
		name=name.replaceAll("����������������","���ٿ����١���");
		
	}//own1p
	
	public void own2p() {
		
		name=name.replaceAll("����������������","���ڿ����ڡ���");
							    	
	}//own2p

	public void buyOwn1p() {
		
		name=name.replaceAll("���ٿ����١���","���ڿ����ڡ���");
		
	}
	
	public void buyOwn2p() {
		name=name.replaceAll("���ڿ����ڡ���","���ٿ����١���");
	}
	
	//���� ���� ����
	
	
	
	public void building() {
		
		structureNone=structureNone.replaceAll("����������������","�����ǡ���������");

	}//building replaceALl
	
	public void landmark() {
		
		structureNone=structureNone.replaceAll("����������������","�����������ʡ���");
		
	}//landmark replaceAll
	
	public void build_mark() {
		
		
		structureNone=structureNone.replaceAll("����������������","�����ǡ����ʡ���");
		
	}//build_mark replaceAll
	
	public void building_landmark() {
		
		structureNone=structureNone.replaceAll("�����ǡ���������","�����ǡ����ʡ���");

	}//building replaceALl
	
	public void landmark_building() {
		
		structureNone=structureNone.replaceAll("�����������ʡ���","�����ǡ����ʡ���");

	}//building replaceALl
	
	
	//�ǹ� ��Ȳ �޼ҵ�
	
	
	
	public void player1() {
		
		playerNone=playerNone.replaceAll("����������������","������~������������");
		
	}//player1
	
	public void player2() {
		
		playerNone=playerNone.replaceAll("����������������","��������������~����");
							  //"   ��Ʈ����~    ","   ��Ʈ����~    	"
	}//player2
	
	public void player1_2() {
		
		playerNone=playerNone.replaceAll("������~������������","������~������~����");
		
	}//player1_2

	public void player2_1() {
		
		playerNone=playerNone.replaceAll("��������������~����","������~������~����");
		
	}//player2_1
	//������ ��������� ����� 2p�� ���� ������ ���¿��� 1p�� ������
	public void player1_None() {
		
		playerNone=playerNone.replaceAll("������~������������","����������������");
							  //"   ��Ʈ����~    ","   ��Ʈ����~    	"
	}//player1_None
	
	public void player2_None() {
		
		playerNone=playerNone.replaceAll("��������������~����","����������������");
							  //"   ��Ʈ����~    ","   ��Ʈ����~    	"
	}//player2_None
	public void player12_1() {
		playerNone=playerNone.replaceAll("������~������~����","������~������������");
	}//player12_1
	
	public void player12_2() {
		playerNone=playerNone.replaceAll("������~������~����","��������������~����");
	}//player12_2
	
	//�÷��̾� ��ǥ �̵� �Լ�
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
		}
	}//calculateCost



	public void p1_ContractCanada(){
		//������ ������ ���� �ڵ尡 ����.
		//p2�� �ڵ尡 ���� x
		//��� �Ǵ� ������� ���� �ٵ��� �ʿ䰡 ����.
		Playboard playboard = new Playboard();
		Dice dice = new Dice();
		Canada can =new Canada();
		Player player = new Player();
		Scanner scan = new Scanner(System.in);
		TimeThread TT =new TimeThread();
		String ok ="dd";
		String ok1 = "����";
		String ok2 = "DD";
		String no = "ss";
		String no1 = "����";
		String no2 = "SS";
		String choice;


		if(TurnOver.p1_turnOver){
			return;
		}//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.

		if(Player.p1_index ==5 && TimeThread.Season.equals(TT.Winter)) {
			//System.out.println("'dd','DD','����' �� �ϳ��� �Է� �ϸ� ������ �÷��̾�� ĳ���ٰ� ����� �Ҽ� �ְ� ���� �ݴϴ�.");
			//System.out.println("������ �ص� 10%�� Ȯ���� ����� ���� �˴ϴ�.");
			PlayboardLog.p1_england_event=true;
			playboard.playboard();
			choice = scan.nextLine();
			if(choice.equals(ok)||choice.equals(ok1)||choice.equals(ok2)) {
				dice.contractCanada();
				if (dice.dice3 == 0) {
					PlayboardLog.p1_england_event_1=true;
					playboard.playboard();
					//System.out.println("10%�� Ȯ���� ĳ���ٿ� ����� �ϰ� �Ǿ� ���ϴ�.");
					if (Canada.name.equals(can.ownName)) {
						//System.out.println("��� ���� ���� 10�� �Ҹ� �˴ϴ�. ��� �Ͻð� ���ϱ�?");
						//System.out.println("'dd','DD','����' �� �ϳ��� �Է� �ϸ� ����� ���� �˴ϴ�.");
						PlayboardLog.p1_england_event_2=true;
						playboard.playboard();
						choice = scan.nextLine();
						if (choice.equals(ok) || choice.equals(ok1) || choice.equals(ok2)) {
							can.own1p();
							//System.out.println("�١١�" + can.travel + "�� ��� �߽��ϴ١١١�");
							if (structureNone.equals(structureNone)) {
								dice.buyStructure();
								if (dice.dice3 == 3) {
									can.landmark();
									Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
									Player.p1_cash = Player.p1_cash -10;
									PlayboardLog.p1_england_event_3=true;
									//���帶ũ �Ǽ� ����
								}//dice3==3 (�ֻ��� ���� 3�϶� ���� ��ũ ��)
								else if (dice.dice3 >= 0 && dice.dice3 < 3) {
									can.building();
									Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
									Player.p1_cash = Player.p1_cash -10;
									PlayboardLog.p1_england_event_4=true;
									//���� �Ǽ� ����
								}//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)

							}//���� ���� �ƹ� �͵� ���ٸ�,
						}//10�ۼ�Ʈ�� Ȯ���� �հ� ��� ���� ���� ���� �ͼ� ��� ���� ���� ���� �Ϳ� ���� ����
					}//ĳ���ٰ� ���� ����� �� �÷��̾ ���� ���
						else if (Canada.name.equals(Canada.own2p)) {
						if(Canada.structureNone.equals(can.building)){
						//System.out.println("��� �÷��̾ �ش� ������ ����� �ϰ� ������ ���� ���� ���� �ϰ� ����� ������ �ֽ��ϴ�. �Ͻðڽ��ϱ�?");
						//System.out.println("��� ���� ���� 18�� �Ҹ� �˴ϴ�. ��� �Ͻð� ���ϱ�?");
						//System.out.println("'dd','DD','����' �� �ϳ��� �Է� �ϸ� ����� ���� �˴ϴ�.");
							PlayboardLog.p1_england_event_5=true;
							playboard.playboard();
						choice=scan.nextLine();
							if(choice.equals(ok)||choice.equals(ok1)||choice.equals(ok2)) {
							can.buyOwn2p();
							//System.out.println("�١١�" + can.travel + "�� ��� �߽��ϴ١١١�");
							PlayboardLog.p1_england_event_6=true;
							}//��� �÷��̾ ������ ���� �ϰ� �ִ� ���

						}//p2�� �̹� ��� ���̰� ������ ���� �ϰ� ���� ���
						else if(Canada.structureNone.equals(can.landmark)|| Canada.structureNone.equals(can.build_mark)){
						//System.out.println("��� �÷��̾ ���帶ũ�� ���� �ϰ� �־ ����� �Ҽ� �����ϴ�.");
							PlayboardLog.p1_england_event_7=true;
						}//p2�� �̹� ������̰� ���帶ũ, ���帶ũ�� ���� ���� ���

					}//ĳ���ٿ� ����� �Ҽ������� ���� p2�� ��� ���� ���
				} else if (dice.dice3 != 0) {
					//System.out.println("ĳ���ٿ��� ����� ���� �߽��ϴ�.");
					PlayboardLog.p1_england_event_8=true;
				}
			}//choice to contract with Canada

		}//p1_index==5

	}//ContractCanada

	public void p2_ContractCanada(){
		//������ ������ ���� �ڵ尡 ����.
		//p2�� �ڵ尡 ���� x
		//��� �Ǵ� ������� ���� �ٵ��� �ʿ䰡 ����.
		Playboard playboard = new Playboard();
		Dice dice = new Dice();
		Canada can =new Canada();
		Player player = new Player();
		Scanner scan = new Scanner(System.in);
		TimeThread TT =new TimeThread();
		String ok ="dd";
		String ok1 = "����";
		String ok2 = "DD";
		String no = "ss";
		String no1 = "����";
		String no2 = "SS";
		String choice;


		if(TurnOver.p2_turnOver){
			return;
		}//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.
		if(Player.p2_index ==5 && TimeThread.Season.equals(TT.Winter)) {
			//System.out.println("'dd','DD','����' �� �ϳ��� �Է� �ϸ� ������ �÷��̾�� ĳ���ٰ� ����� �Ҽ� �ְ� ���� �ݴϴ�.");
			//System.out.println("������ �ص� 10%�� Ȯ���� ����� ���� �˴ϴ�.");
			PlayboardLog.p2_england_event=true;
			playboard.playboard();
			choice = scan.nextLine();
			if(choice.equals(ok)||choice.equals(ok1)||choice.equals(ok2)) {
				dice.contractCanada();
				if (dice.dice3 == 0) {
					PlayboardLog.p2_england_event_1=true;
					playboard.playboard();
					//System.out.println("10%�� Ȯ���� ĳ���ٿ� ����� �ϰ� �Ǿ� ���ϴ�.");
					if (Canada.name.equals(can.ownName)) {
						//System.out.println("��� ���� ���� 10�� �Ҹ� �˴ϴ�. ��� �Ͻð� ���ϱ�?");
						//System.out.println("'dd','DD','����' �� �ϳ��� �Է� �ϸ� ����� ���� �˴ϴ�.");
						PlayboardLog.p2_england_event_2=true;
						playboard.playboard();
						choice = scan.nextLine();
						if (choice.equals(ok) || choice.equals(ok1) || choice.equals(ok2)) {
							can.own1p();
							//System.out.println("�ڡڡ�" + can.travel + "�� ��� �߽��ϴ١ڡڡ�");
							if (structureNone.equals(structureNone)) {
								dice.buyStructure();
								if (dice.dice3 == 3) {
									can.landmark();
									Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
									Player.p2_cash = Player.p2_cash -10;
									PlayboardLog.p2_england_event_3=true;
								}//dice3==3 (�ֻ��� ���� 3�϶� ���� ��ũ ��)
								else if (dice.dice3 >= 0 && dice.dice3 < 3) {
									can.building();
									Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
									Player.p2_cash = Player.p2_cash -10;
									PlayboardLog.p2_england_event_4=true;
								}//dice3 == 0,1,2 (�ֻ��� ���� 0,1,2�϶� ������ �Ǽ���)

							}//���� ���� �ƹ� �͵� ���ٸ�,
						}//10�ۼ�Ʈ�� Ȯ���� �հ� ��� ���� �������� �ͼ� ��� ���� ���� ���� �Ϳ� ���� ����
					}//ĳ���ٰ� ���� ����� �� �÷��̾ ���� ���
					else if (Canada.name.equals(Canada.own1p)) {
						if(Canada.structureNone.equals(can.building)){
							//System.out.println("��� �÷��̾ �ش� ������ ����� �ϰ� ������ ������� ���� �ϰ� ����� ������ �ֽ��ϴ�. �Ͻðڽ��ϱ�?");
							//System.out.println("��� ���� ���� 18�� �Ҹ� �˴ϴ�. ��� �Ͻð� ���ϱ�?");
							//System.out.println("'dd','DD','����' �� �ϳ��� �Է� �ϸ� ����� ���� �˴ϴ�.");
							PlayboardLog.p2_england_event_5=true;
							playboard.playboard();
							choice=scan.nextLine();
							if(choice.equals(ok)||choice.equals(ok1)||choice.equals(ok2)) {
								can.buyOwn2p();
								//System.out.println("�ڡڡ�" + can.travel + "�� ��� �߽��ϴ١ڡڡ�");
								PlayboardLog.p2_england_event_6=true;
							}//��� �÷��̾ ������ ���� �ϰ� �ִ� ���

						}//p2�� �̹� ��� ���̰� ������ ���� �ϰ� ���� ���
						else if(Canada.structureNone.equals(can.landmark)|| Canada.structureNone.equals(can.landmark)){
//							System.out.println("��� �÷��̾ ���帶ũ�� ���� �ϰ� �־ ����� �Ҽ� �����ϴ�.");
							PlayboardLog.p2_england_event_7=true;

						}//p2�� �̹� ������̰� ���帶ũ, ���帶ũ�� ���� ���� ���

					}//ĳ���ٿ� ����� �� �� ������ ���� p2�� ��� ���� ���
				} else if (dice.dice3 != 0) {
//					System.out.println("ĳ���ٿ��� ����� ���� �߽��ϴ�.");
					PlayboardLog.p2_england_event_8=true;
				}
			}//choice to contract with Canada

		}//p1_index==5

	}//ContractCanada

}//class
