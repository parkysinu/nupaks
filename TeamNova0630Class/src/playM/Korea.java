package playM;

public class Korea  extends Countries{

	static String name ="�����ѱ�������";
	static String own1p,own2p;
	String ownName ="�����ѱ�������";
	String p1_own  ="�����ѱ��١�����";
	String p2_own  ="�����ѱ��ڡ�����";
	static String playerNone	="����������������";
	String playerBlank			="����������������";
	String player1				="������~������������";
	String player2				="��������������~����";
	static String player1_2 	="������~������~����";

	String building  	="�����ǡ���������";
	String landmark 	="�����������ʡ���";
	String build_mark	="�����ǡ����ʡ���";
	String structureBlank 		="����������������";
	static String structureNone ="����������������";
	
	String travel ="�ѱ�";



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
	static int buildingCost = 20;
	static int landmarkCost = 40;
	static int build_markCost=60;
	static int p1_koreanLock=0;
	static int p2_koreanLock=0;
	int cost;
	int contractNationYet=0;
	
	public void own1p() {
		
		name=name.replaceAll("�����ѱ�������","�����ѱ��١�����");
		
	}//own1p
	
	public void own2p() {
		
		name=name.replaceAll("�����ѱ�������","�����ѱ��ڡ�����");
							    	
	}//own2p

	public void buyOwn1p() {
		
		name=name.replaceAll("�����ѱ��١�����","�����ѱ��ڡ�����");
		
	}
	
	public void buyOwn2p() {
		name=name.replaceAll("�����ѱ��ڡ�����","�����ѱ��١�����");
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


	public void festivalIntKorea(){

			System.out.println("���� ���� �Ⱓ�� �ѱ��� ���� �ؼ� ���� ü�� ���� ���� �ٸ� ������ �̵��� �Ҽ� �����ϴ�.");
			if(p1_koreanLock==1){
				p1_koreanLock=0;
			}
			else if(p2_koreanLock==1){
				p2_koreanLock=0;
			}

	}//festivalInKorea



}//class
