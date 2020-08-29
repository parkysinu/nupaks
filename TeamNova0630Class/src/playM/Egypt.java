package playM;

public class Egypt  extends Countries{

	static String name ="����������Ʈ������";
	static String own1p,own2p;
	String ownName ="����������Ʈ������";
	String p1_own  ="��������Ʈ�١�����";
	String p2_own  ="��������Ʈ�ڡ�����";
	static String playerNone	="����������������";
	String playerBlank	="����������������";
	String player1		="������~������������";
	String player2		="��������������~����";
	String player1_2 	="������~������~����";
	String building  	="�����ǡ���������";
	String landmark 	="�����������ʡ���";
	String build_mark	="�����ǡ����ʡ���";
	static String structureNone ="����������������";
	String travel ="����Ʈ";


	static boolean p1_successContract;
	static boolean p1_startOwnTheLand;
	static boolean p1_returnTheMapNaming;
	static boolean p1_movedOtherPlayerMap;
	static boolean p1_taxBuilding;
	static boolean p1_taxLandmark;
	static boolean p1_taxBuild_mark;
	static boolean p1_willTakeYourMap;
	static boolean p1_willTakeYourMapYes;

	static boolean p1_egyptEvent;
	static boolean p1_egyptEventBuilding;
	static boolean p1_egyptEventLandmark;
	static boolean p1_egyptEventBuild_mark;


	static boolean p2_successContract;
	static boolean p2_startOwnTheLand;
	static boolean p2_returnTheMapNaming;
	static boolean p2_movedOtherPlayerMap;
	static boolean p2_taxBuilding;
	static boolean p2_taxLandmark;
	static boolean p2_taxBuild_mark;
	static boolean p2_willTakeYourMap;
	static boolean p2_willTakeYourMapYes;

	static boolean p2_egyptEvent;
	static boolean p2_egyptEventBuilding;
	static boolean p2_egyptEventLandmark;
	static boolean p2_egyptEventBuild_mark;

	static String value  		="����������������";
	static int buildingCost = 10;
	static int landmarkCost = 20;
	static int build_markCost=30;
	int cost;
	int contractNationYet=0;
	
	public void own1p() {
		
		name=name.replaceAll("����������Ʈ������","��������Ʈ�١�����");
		
	}//own1p
	
	public void own2p() {
		
		name=name.replaceAll("����������Ʈ������","��������Ʈ�ڡ�����");
							    	
	}//own2p

	public void buyOwn1p() {
		
		name=name.replaceAll("��������Ʈ�١�����","��������Ʈ�ڡ�����");
		
	}
	
	public void buyOwn2p() {
		name=name.replaceAll("��������Ʈ�ڡ�����","��������Ʈ�١�����");
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
							 
	}//player1_None
	
	public void player2_None() {
		
		playerNone=playerNone.replaceAll("��������������~����","����������������");
							  
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

	
}