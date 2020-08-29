package playM;

import java.sql.Time;

public class China  extends Countries{


	static String name ="�����߱�������";
	static String own1p,own2p;
	String ownName ="�����߱�������";
	String p1_own  ="�����߱��١�����";
	String p2_own  ="�����߱��ڡ�����";
	static String playerNone	="����������������";
	String playerBlank	="����������������";
	String player1		="������~������������";
	String player2		="��������������~����";
	String player1_2 	="������~������~����";
	String building  	="�����ǡ���������";
	String landmark 	="�����������ʡ���";
	String build_mark	="�����ǡ����ʡ���";
	static String structureNone ="����������������";
	String travel ="�߱�";
	static String value  		="����������������";


	static boolean p1_successContract;
	static boolean p1_startOwnTheLand;
	static boolean p1_returnTheMapNaming;
	static boolean p1_movedOtherPlayerMap;
	static boolean p1_taxBuilding;
	static boolean p1_taxLandmark;
	static boolean p1_taxBuild_mark;
	static boolean p1_willTakeYourMap;
	static boolean p1_willTakeYourMapYes;
	static boolean p1_chinaEvent;

	static boolean p2_successContract;
	static boolean p2_startOwnTheLand;
	static boolean p2_returnTheMapNaming;
	static boolean p2_movedOtherPlayerMap;
	static boolean p2_taxBuilding;
	static boolean p2_taxLandmark;
	static boolean p2_taxBuild_mark;
	static boolean p2_willTakeYourMap;
	static boolean p2_willTakeYourMapYes;
	static boolean p2_chinaEvent;





	static int buildingCost = 20;
	static int landmarkCost = 40;
	static int build_markCost=60;
	int cost;
	int contractNationYet=0;
	
	public void own1p() {
		
		name=name.replaceAll("�����߱�������","�����߱��١�����");
		
	}//own1p
	
	public void own2p() {
		
		name=name.replaceAll("�����߱�������","�����߱��ڡ�����");
							    	
	}//own2p

	public void buyOwn1p() {
		
		name=name.replaceAll("�����߱��١�����","�����߱��ڡ�����");
		
	}
	
	public void buyOwn2p() {
		name=name.replaceAll("�����߱��ڡ�����","�����߱��١�����");
	}

	public void p1_noneContract(){

		name=name.replaceAll("�����߱��١�����","�����߱�������");

	}
	public void p2_noneContract(){

		name=name.replaceAll("�����߱��ڡ�����","�����߱�������");

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


	public void build_none(){

		structureNone=structureNone.replaceAll("�����ǡ���������","����������������");

	}
	public void land_none(){

		structureNone=structureNone.replaceAll("�����������ʡ���","����������������");

	}
	public void buildMark_none(){

		structureNone=structureNone.replaceAll("�����ǡ����ʡ���","����������������");

	}
	//�ǹ� ��Ȳ �޼ҵ�
		
		
		public void player1() {
			
			playerNone=playerNone.replaceAll("����������������","������~������������");
			
		}//player1
		
		public void player2() {
			
			playerNone=playerNone.replaceAll("����������������","��������������~����");
								
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

	public void p1_festivalInChina(){
		Player player = new Player();
		TimeThread TT = new TimeThread();



		if(TurnOver.p1_turnOver){
			return;
		}//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.
		if(TimeThread.Season.equals(TT.Spring)&& Player.p1_index ==3){

			if(name.equals(own1p)){

				//System.out.println("���� ��å���� ���� ������ �ִ� ���๰���� �Ϲ������� ö�� �Ǿ����ϴ�.");
				p1_chinaEvent=true;
				if(structureNone.equals(building)){
					p1_noneContract();
					build_none();
				}
				else if(structureNone.equals(landmark)){
					p1_noneContract();
					land_none();
				}

			}//own_1p


		}//p1_index==3  ///tt.season.equals(spring)

	}	//festival in China


	public void p2_festivalInChina(){
		Player player = new Player();
		TimeThread TT = new TimeThread();

		if(TurnOver.p2_turnOver){
			return;
		}//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.

		if(TimeThread.Season.equals(TT.Spring)&& Player.p2_index ==3){

			if(name.equals(own2p)){
				p2_chinaEvent=true;
				//System.out.println("���� ��å���� ���� ������ �ִ� ���� ������ �Ϲ������� ö�� �Ǿ����ϴ�.");

				if(structureNone.equals(building)){
					p2_noneContract();
					build_none();
				}
				else if(structureNone.equals(landmark)){
					p2_noneContract();
					land_none();
				}
				else if(structureNone.equals(build_mark)){
					p2_noneContract();
					buildMark_none();
				}
			}//own_2p


		}//p2_index==3  ///tt.season.equals(spring)

	}	//festival in China



}//class
