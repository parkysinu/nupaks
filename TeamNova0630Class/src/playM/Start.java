package playM;

import java.util.Scanner;

public class Start extends Place{

	static String name ="���������������";
	static String player1="������~������������";
	String player2="��������������~����";
	String player1_2="������~������~����";
	String player2_1="������~������~����";
	String playerBlank	="����������������";
	static String playerNone="����������������";
	String travel ="�����";
	
	static boolean p1_placingStart;
	static boolean p2_placingStart;

	static boolean p1_selectKorea;
	static boolean p1_selectJapan;
	static boolean p1_selectChina;
	static boolean p1_selectEngland;
	static boolean p1_selectFrance;
	static boolean p1_selectGermany;
	static boolean p1_selectRussia;
	static boolean p1_selectUSA;
	static boolean p1_selectCanada;
	static boolean p1_selectMexico;
	static boolean p1_selectItaly;
	static boolean p1_selectSwiss;
	static boolean p1_selectVietnam;
	static boolean p1_selectEgypt;


	static boolean p2_selectKorea;
	static boolean p2_selectJapan;
	static boolean p2_selectChina;
	static boolean p2_selectEngland;
	static boolean p2_selectFrance;
	static boolean p2_selectGermany;
	static boolean p2_selectRussia;
	static boolean p2_selectUSA;
	static boolean p2_selectCanada;
	static boolean p2_selectMexico;
	static boolean p2_selectItaly;
	static boolean p2_selectSwiss;
	static boolean p2_selectVietnam;
	static boolean p2_selectEgypt;




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
	//"������~������~����","������~������������","��������������~����"
	
	
	public void upgrade_p1() {
		//���� Ÿ ������ ���� �ϰ� �ִ��� �ƴ��� Ȯ���ϴ� ����&&���� ���� ���� ������ �������� �ʴ� ��
		//Ȯ�ε� ������ ����� ¥�� ����Ʈ�� �Ѹ�
		//���߿� ������ �Ѵ�
		//���� ���� ���� �� �ϰ�� ������ ������ �Ǽ� �ϴ� ���� ���� �̰� ���� ����
		//���� �ϴ� �� �ϰ�� ���� ���� ���� �ϰ� ���� ����
		//������ ���� �� ��� ���帶ũ �Ǽ�
		//���帶ũ�� ���� �� ��� ������ �Ǽ�
		
		Place pla_player1 = new Place();
		Playboard board = new Playboard();
		Dice dice = new Dice();
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
		Swiss swi =new Swiss();
		Italy ita = new Italy();
		Balloon ball =new Balloon();
		Player player =new Player();
		if(Player.p1_moved ==1) {
			p1_placingStart=true;
			board.playboard();
		//System.out.println("���׷��̵� �Ҽ� �ִ� ���� ���");
		//System.out.println("����� Ȯ�� �ϰ� �ش� �ϴ� ���׷��̵带 �ϰ� ���� ������ ���� ���ּ���.");
		//System.out.println("���׷��̵带 ���ϴ� ������ ���ų�, ���ϴ� ������ ���ٸ� 0 �� �Է� ���ּ���.");
		//System.out.println("===========================================");
		if(Korea.name.equals(kor.p1_own)) {
			if(Korea.structureNone.equals(kor.building)) {
				System.out.println("1.�ѱ���  ��  ���� ��");
			}//���� ������
			else if(Korea.structureNone.equals(kor.landmark)) {
				System.out.println("1.�ѱ���  ��  ���� ��");
			}//���帶ũ ������

		}//�ѱ�

		if(Japan.name.equals(jap.p1_own)) {
			if(Japan.structureNone.equals(jap.building)) {
				System.out.println("2.�Ϻ���  ��  ���� ��");
			}//���� ������
			else if(Japan.structureNone.equals(jap.landmark)) {
				System.out.println("2.�Ϻ���  ��  ���� ��");
			}//���帶ũ ������

		}//�Ϻ�


		if(China.name.equals(chi.p1_own)) {
			if(China.structureNone.equals(chi.building)) {
				System.out.println("3.�߱���  ��  ���� ��");
			}//���� ������
			else if(China.structureNone.equals(chi.landmark)) {
				System.out.println("3.�߱���  ��  ���� ��");
			}//���帶ũ ������

		}//�߱�


		if(England.name.equals(eng.p1_own)) {
			if(England.structureNone.equals(eng.building)) {
				System.out.println("4.������  ��  ���� ��");
			}//���� ������
			else if(England.structureNone.equals(eng.landmark)) {
				System.out.println("4.������  ��  ���� ��");
			}//���帶ũ ������

		}//����


		if(France.name.equals(fra.p1_own)) {
			if(France.structureNone.equals(fra.building)) {
				System.out.println("5.��������  ��  ���� ��");
			}//���� ������
			else if(France.structureNone.equals(fra.landmark)) {
				System.out.println("5.��������  ��  ���� ��");
			}//���帶ũ ������

		}//������


		if(Germany.name.equals(ger.p1_own)) {
			if(Germany.structureNone.equals(ger.building)) {
				System.out.println("6.���Ͽ�  ��  ���� ��");
			}//���� ������
			else if(Germany.structureNone.equals(ger.landmark)) {
				System.out.println("6.���Ͽ�  ��  ���� ��");
			}//���帶ũ ������

		}//����


		if(Russia.name.equals(rus.p1_own)) {
			if(Russia.structureNone.equals(rus.building)) {
				System.out.println("7.���þƿ�  ��  ���� ��");
			}//���� ������
			else if(Russia.structureNone.equals(rus.landmark)) {
				System.out.println("7.���þƿ�  ��  ���� ��");
			}//���帶ũ ������

		}//���þ�


		if(USA.name.equals(usa.p1_own)) {
			if(USA.structureNone.equals(usa.building)) {
				System.out.println("8.�̱���  ��  ���� ��");
			}//���� ������
			else if(USA.structureNone.equals(usa.landmark)) {
				System.out.println("8.�̱���  ��  ���� ��");
			}//���帶ũ ������

		}//�̱�


		if(Canada.name.equals(can.p1_own)) {
			if(Canada.structureNone.equals(can.building)) {
				System.out.println("9.ĳ���ٿ�  ��  ���� ��");
			}//���� ������
			else if(Canada.structureNone.equals(can.landmark)) {
				System.out.println("9.ĳ���ٿ�  ��  ���� ��");
			}//���帶ũ ������

		}//ĳ����


		if(Mexico.name.equals(mex.p1_own)) {
			if(Mexico.structureNone.equals(mex.building)) {
				System.out.println("10.�߽��ڿ�  ��  ���� ��");
			}//���� ������
			else if(Mexico.structureNone.equals(mex.landmark)) {
				System.out.println("10.�߽��ڿ�  ��  ���� ��");
			}//���帶ũ ������

		}//�߽���


		if(Italy.name.equals(ita.p1_own)) {
			if(Italy.structureNone.equals(ita.building)) {
				System.out.println("11.��Ż���ƿ�  ��  ���� ��");
			}//���� ������
			else if(Italy.structureNone.equals(ita.landmark)) {
				System.out.println("11.��Ż���ƿ�  ��  ���� ��");
			}//���帶ũ ������

		}//��Ż����


		if(Swiss.name.equals(swi.p1_own)) {
			if(Swiss.structureNone.equals(swi.building)) {
				System.out.println("12.��������  ��  ���� ��");
			}//���� ������
			else if(Swiss.structureNone.equals(swi.landmark)) {
				System.out.println("12.��������  ��  ���� ��");
			}//���帶ũ ������

		}//������


		if(Vietnam.name.equals(vie.p1_own)) {
			if(Vietnam.structureNone.equals(vie.building)) {
				System.out.println("13.��Ʈ����  ��  ���� ��");
			}//���� ������
			else if(Vietnam.structureNone.equals(vie.landmark)) {
				System.out.println("13.��Ʈ����  ��  ���� ��");
			}//���帶ũ ������

		}//��Ʈ��



		if(Egypt.name.equals(egy.p1_own)) {
			if(Egypt.structureNone.equals(egy.building)) {
				System.out.println("14.����Ʈ��  ��  ���� ��");
			}//���� ������
			else if(Egypt.structureNone.equals(egy.landmark)) {
				System.out.println("14.����Ʈ��  ��  ���� ��");
			}//���帶ũ ������

		}//����Ʈ
//			else{
//				System.out.println("���� ���� ��� �Ҽ� �ִ� ������ �����ϴ�.");
//
//		}
		System.out.println("===========================================");




		Scanner scan = new Scanner(System.in);
		int choice;

		while(true) {
		
		choice=scan.nextInt();
		
		if(choice==1) {
			
			if(Korea.structureNone.equals(kor.building)) {
				p1_selectKorea=true;
				kor.building_landmark();
				//System.out.println("�١١�"+kor.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(Korea.structureNone.equals(kor.landmark)) {
				p1_selectKorea=true;
				kor.landmark_building();
				//System.out.println("�١١�"+kor.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
		break;
		}//choice==1  �ѱ�
		
		else if(choice==2) {
			
			if(Japan.structureNone.equals(jap.building)) {
				p1_selectJapan=true;
				jap.building_landmark();
				//System.out.println("�١١�"+jap.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(Japan.structureNone.equals(jap.landmark)) {
				p1_selectJapan=true;
				jap.landmark_building();
				//System.out.println("�١١�"+jap.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;	
		}//choice==2 �Ϻ�

		
		else if(choice==3) {
			
			if(China.structureNone.equals(chi.building)) {
				p1_selectChina=true;
				chi.building_landmark();
				//System.out.println("�١١�"+chi.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(China.structureNone.equals(chi.landmark)) {
				p1_selectChina=true;
				chi.landmark_building();
				//System.out.println("�١١�"+chi.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;
		}//choice==3 china
		
		
		else if(choice==4) {
			
			if(England.structureNone.equals(eng.building)) {
				p1_selectEngland=true;
				eng.building_landmark();
				//System.out.println("�١١�"+eng.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(England.structureNone.equals(eng.landmark)) {
				p1_selectEngland=true;
				eng.landmark_building();
				//System.out.println("�١١�"+eng.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;
		}//choice==4 eng
		
		
		else if(choice==5) {
			
			if(France.structureNone.equals(fra.building)) {
				p1_selectFrance=true;
				fra.building_landmark();
				//System.out.println("�١١�"+fra.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(France.structureNone.equals(fra.landmark)) {
				p1_selectFrance=true;
				fra.landmark_building();
				//System.out.println("�١١�"+fra.travel+"�� ���� �������� ������ϴ١١١�");
			}///���帶ũ + ����
			
			break;
		}//choice==5 fra
		
		
		else if(choice==6) {
			
			if(Germany.structureNone.equals(ger.building)) {
				p1_selectGermany=true;
				ger.building_landmark();
				//System.out.println("�١١�"+ger.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(Germany.structureNone.equals(ger.landmark)) {
				p1_selectGermany=true;
				ger.landmark_building();
				//System.out.println("�١١�"+ger.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;
		}//choice==6 ger
		
		
		else if(choice==7) {
			
			if(Russia.structureNone.equals(rus.building)) {
				p1_selectRussia=true;
				rus.building_landmark();
				//System.out.println("�١١�"+rus.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(Russia.structureNone.equals(rus.landmark)) {
				p1_selectRussia=true;
				rus.landmark_building();
				//System.out.println("�١١�"+rus.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;
		}//choice==7 rus
		
		
		else if(choice==8) {
			
			if(USA.structureNone.equals(usa.building)) {
				p1_selectUSA=true;
				usa.building_landmark();
				//System.out.println("�١١�"+usa.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(USA.structureNone.equals(usa.landmark)) {
				p1_selectUSA=true;
				usa.landmark_building();
				//System.out.println("�١١�"+usa.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;
		}//choice==8 usa
		
		
		else if(choice==9) {
			
			if(Canada.structureNone.equals(can.building)) {
				p1_selectCanada=true;
				can.building_landmark();
				//System.out.println("�١١�"+can.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(Canada.structureNone.equals(can.landmark)) {
				p1_selectCanada=true;
				can.landmark_building();
				//System.out.println("�١١�"+can.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;
		}//choice==9 can
		
		
		else if(choice==10) {

			if(Mexico.structureNone.equals(mex.building)) {
				p1_selectMexico=true;
				mex.building_landmark();
				//System.out.println("�١١�"+mex.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(Mexico.structureNone.equals(mex.landmark)) {
				p1_selectMexico=true;
				mex.landmark_building();
				//System.out.println("�١١�"+mex.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;
		}//choice==10 mex
		
		
		else if(choice==11) {
			
			if(Italy.structureNone.equals(ita.building)) {
				p1_selectItaly=true;
				ita.building_landmark();
				//System.out.println("�١١�"+ita.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(Italy.structureNone.equals(ita.landmark)) {
				p1_selectItaly=true;
				ita.landmark_building();
				//System.out.println("�١١�"+ita.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;
		}//choice==2 ita
		
		
		else if(choice==12) {
			
			if(Swiss.structureNone.equals(swi.building)) {
				p1_selectSwiss=true;
				swi.building_landmark();
				//System.out.println("�١١�"+swi.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(Swiss.structureNone.equals(swi.landmark)) {
				p1_selectSwiss=true;
				swi.landmark_building();
				//System.out.println("�١١�"+swi.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;
		}//choice==12 swi
		
		
		else if(choice==13) {
			
			if(Vietnam.structureNone.equals(vie.building)) {
				p1_selectVietnam=true;
				vie.building_landmark();
				//System.out.println("�١١�"+vie.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(Vietnam.structureNone.equals(vie.landmark)) {
				p1_selectVietnam=true;
				vie.landmark_building();
				//System.out.println("�١١�"+vie.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;
		}//choice==13 vie
		
		
		else if(choice==14) {
			
			if(Egypt.structureNone.equals(egy.building)) {
				p1_selectEgypt=true;
				egy.building_landmark();
				//System.out.println("�١١�"+egy.travel+"�� ���� �������� ������ϴ١١١�");
			}//���� + ���帶ũ
			else if(Egypt.structureNone.equals(egy.landmark)) {
				p1_selectEgypt=true;
				egy.landmark_building();
				//System.out.println("�١١�"+egy.travel+"�� ���� �������� ������ϴ١١١�");
			}//���帶ũ + ����
			
			break;
		}//choice==14 egy


		else if(choice==0){
			return;
		}
		
		else {
			//System.out.println("�ش� �Ǵ� ���ڰ� �����ϴ�. �ٽ� �Է� �� �ּ��� :)");
		}//else
		
		}//while
	}//if moved==1
		Player.p1_moved =0;
	}//p1_start upgrade map
	
	
	public void upgrade_p2() {
		//���� Ÿ������ �����ϰ� �ִ��� �ƴ��� Ȯ���ϴ� ����  &&  ���� �������� ������ �������� �ʴ� ��
		//Ȯ�ε� ������ ����� ¥�� ����Ʈ�� �Ѹ�
		//���߿� ������ �Ѵ�
		//�������� ���� ���ϰ�� ������ ������ �Ǽ��ϴ� ���๰�� �̰� ���� ����
		//�����ϴ� ���ϰ�� �������� ���� �ϰ� ���� ����
		//������ �����Ұ�� ���帶ũ �Ǽ�
		//���帶ũ�� �����Ұ�� ������ �Ǽ�
		
		Place pla_player2 = new Place();
		Playboard board = new Playboard();
		Dice dice = new Dice();
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
		Swiss swi =new Swiss();
		Italy ita = new Italy();
		Balloon ball =new Balloon();
		Player player =new Player();
		
		
		if(Player.p2_moved ==1) {
			p2_placingStart=true;
			board.playboard();
			//System.out.println("���׷��̵� �Ҽ��ִ� �������");
			//System.out.println("����� Ȯ���ϰ� �ش��ϴ� ���׷��̵带 �ϰ���� ������ �������ּ���.");
			//System.out.println("����� Ȯ�� �ϰ� �ش� �ϴ� ���׷��̵带 �ϰ� ���� ������ ���� ���ּ���.");
			//System.out.println("===========================================");
		if(Korea.name.equals(kor.p2_own)) {
			if(Korea.structureNone.equals(kor.building)) {
				System.out.println("1.�ѱ���  ��  ������");
			}//���� ������
			else if(Korea.structureNone.equals(kor.landmark)) {
				System.out.println("1.�ѱ���  ��  ������");
			}//���帶ũ ������

		}//�ѱ�

		if(Japan.name.equals(jap.p2_own)) {
			if(Japan.structureNone.equals(jap.building)) {
				System.out.println("2.�Ϻ���  ��  ������");
			}//���� ������
			else if(Japan.structureNone.equals(jap.landmark)) {
				System.out.println("2.�Ϻ���  ��  ������");
			}//���帶ũ ������

		}//�Ϻ�


		if(China.name.equals(chi.p2_own)) {
			if(China.structureNone.equals(chi.building)) {
				System.out.println("3.�߱���  ��  ������");
			}//���� ������
			else if(China.structureNone.equals(chi.landmark)) {
				System.out.println("3.�߱���  ��  ������");
			}//���帶ũ ������

		}//�߱�


		if(England.name.equals(eng.p2_own)) {
			if(England.structureNone.equals(eng.building)) {
				System.out.println("4.������  ��  ������");
			}//���� ������
			else if(England.structureNone.equals(eng.landmark)) {
				System.out.println("4.������  ��  ������");
			}//���帶ũ ������

		}//����


		if(France.name.equals(fra.p2_own)) {
			if(France.structureNone.equals(fra.building)) {
				System.out.println("5.��������  ��  ������");
			}//���� ������
			else if(France.structureNone.equals(fra.landmark)) {
				System.out.println("5.��������  ��  ������");
			}//���帶ũ ������

		}//������


		if(Germany.name.equals(ger.p2_own)) {
			if(Germany.structureNone.equals(ger.building)) {
				System.out.println("6.���Ͽ�  ��  ������");
			}//���� ������
			else if(Germany.structureNone.equals(ger.landmark)) {
				System.out.println("6.���Ͽ�  ��  ������");
			}//���帶ũ ������

		}//����


		if(Russia.name.equals(rus.p2_own)) {
			if(Russia.structureNone.equals(rus.building)) {
				System.out.println("7.���þƿ�  ��  ������");
			}//���� ������
			else if(Russia.structureNone.equals(rus.landmark)) {
				System.out.println("7.���þƿ�  ��  ������");
			}//���帶ũ ������

		}//���þ�


		if(USA.name.equals(usa.p2_own)) {
			if(USA.structureNone.equals(usa.building)) {
				System.out.println("8.�̱���  ��  ������");
			}//���� ������
			else if(USA.structureNone.equals(usa.landmark)) {
				System.out.println("8.�̱���  ��  ������");
			}//���帶ũ ������

		}//�̱�


		if(Canada.name.equals(can.p2_own)) {
			if(Canada.structureNone.equals(can.building)) {
				System.out.println("9.ĳ���ٿ�  ��  ������");
			}//���� ������
			else if(Canada.structureNone.equals(can.landmark)) {
				System.out.println("9.ĳ���ٿ�  ��  ������");
			}//���帶ũ ������

		}//ĳ����


		if(Mexico.name.equals(mex.p2_own)) {
			if(Mexico.structureNone.equals(mex.building)) {
				System.out.println("10.�߽��ڿ�  ��  ������");
			}//���� ������
			else if(Mexico.structureNone.equals(mex.landmark)) {
				System.out.println("10.�߽��ڿ�  ��  ������");
			}//���帶ũ ������

		}//�߽���


		if(Italy.name.equals(ita.p2_own)) {
			if(Italy.structureNone.equals(ita.building)) {
				System.out.println("11.��Ż���ƿ�  ��  ������");
			}//���� ������
			else if(Italy.structureNone.equals(ita.landmark)) {
				System.out.println("11.��Ż���ƿ�  ��  ������");
			}//���帶ũ ������

		}//��Ż����


		if(Swiss.name.equals(swi.p2_own)) {
			if(Swiss.structureNone.equals(swi.building)) {
				System.out.println("12.��������  ��  ������");
			}//���� ������
			else if(Swiss.structureNone.equals(swi.landmark)) {
				System.out.println("12.��������  ��  ������");
			}//���帶ũ ������

		}//������
		

		if(Vietnam.name.equals(vie.p2_own)) {
			if(Vietnam.structureNone.equals(vie.building)) {
				System.out.println("13.��Ʈ����  ��  ������");
			}//���� ������
			else if(Vietnam.structureNone.equals(vie.landmark)) {
				System.out.println("13.��Ʈ����  ��  ������");
			}//���帶ũ ������

		}//��Ʈ��


		if(Egypt.name.equals(egy.p2_own)) {
			if(Egypt.structureNone.equals(egy.building)) {
				System.out.println("14.����Ʈ��  ��  ������");
			}//���� ������
			else if(Egypt.structureNone.equals(egy.landmark)) {
				System.out.println("14.����Ʈ��  ��  ������");
			}//���帶ũ ������

		}//����Ʈ

		System.out.println("===========================================");

		Scanner scan = new Scanner(System.in);
		int choice;
		while(true) {
		
		choice=scan.nextInt();
		
		if(choice==1) {
			
			if(Korea.structureNone.equals(kor.building)) {
				p2_selectKorea=true;
				kor.building_landmark();
				//System.out.println("�ڡڡ�"+kor.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(Korea.structureNone.equals(kor.landmark)) {
				p2_selectKorea=true;
				kor.landmark_building();
				//System.out.println("�ڡڡ�"+kor.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
		break;
		}//choice==1  �ѱ�
		
		else if(choice==2) {
			
			if(Japan.structureNone.equals(jap.building)) {
				p2_selectJapan=true;
				jap.building_landmark();
				//System.out.println("�ڡڡ�"+jap.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(Japan.structureNone.equals(jap.landmark)) {
				p2_selectJapan=true;
				jap.landmark_building();
				//System.out.println("�ڡڡ�"+jap.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;	
		}//choice==2 �Ϻ�

		
		else if(choice==3) {
			
			if(China.structureNone.equals(chi.building)) {
				p2_selectChina=true;
				chi.building_landmark();
				//System.out.println("�ڡڡ�"+chi.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(China.structureNone.equals(chi.landmark)) {
				p2_selectChina=true;
				chi.landmark_building();
				//System.out.println("�ڡڡ�"+chi.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==3 china
		
		
		else if(choice==4) {
			
			if(England.structureNone.equals(eng.building)) {
				p2_selectEngland=true;
				eng.building_landmark();
				//System.out.println("�ڡڡ�"+eng.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(England.structureNone.equals(eng.landmark)) {
				p2_selectEngland=true;
				eng.landmark_building();
				//System.out.println("�ڡڡ�"+eng.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==4 eng
		
		
		else if(choice==5) {
			
			if(France.structureNone.equals(fra.building)) {
				p2_selectFrance=true;
				fra.building_landmark();
				//System.out.println("�ڡڡ�"+fra.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(France.structureNone.equals(fra.landmark)) {
				p2_selectFrance=true;
				fra.landmark_building();
				//System.out.println("�ڡڡ�"+fra.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==5 fra
		
		
		else if(choice==6) {
			
			if(Germany.structureNone.equals(ger.building)) {
				p2_selectGermany=true;
				ger.building_landmark();
				//System.out.println("�ڡڡ�"+ger.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(Germany.structureNone.equals(ger.landmark)) {
				p2_selectGermany=true;
				ger.landmark_building();
				//System.out.println("�ڡڡ�"+ger.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==6 ger
		
		
		else if(choice==7) {
			
			if(Russia.structureNone.equals(rus.building)) {
				p2_selectRussia=true;
				rus.building_landmark();
				//System.out.println("�ڡڡ�"+rus.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(Russia.structureNone.equals(rus.landmark)) {
				p2_selectRussia=true;
				rus.landmark_building();
				//System.out.println("�ڡڡ�"+rus.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==7 rus
		
		
		else if(choice==8) {
			
			if(USA.structureNone.equals(usa.building)) {
				p2_selectUSA=true;
				usa.building_landmark();
				//System.out.println("�ڡڡ�"+usa.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(USA.structureNone.equals(usa.landmark)) {
				p2_selectUSA=true;
				usa.landmark_building();
				//System.out.println("�ڡڡ�"+usa.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==8 usa
		
		
		else if(choice==9) {
			
			if(Canada.structureNone.equals(can.building)) {
				p2_selectCanada=true;
				can.building_landmark();
				//System.out.println("�ڡڡ�"+can.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(Canada.structureNone.equals(can.landmark)) {
				p2_selectCanada=true;
				can.landmark_building();
				//System.out.println("�ڡڡ�"+can.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==9 can
		
		
		else if(choice==10) {
			
			if(Mexico.structureNone.equals(mex.building)) {
				p2_selectMexico=true;
				mex.building_landmark();
				//System.out.println("�ڡڡ�"+mex.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(Mexico.structureNone.equals(mex.landmark)) {
				p2_selectMexico=true;
				mex.landmark_building();
				//System.out.println("�ڡڡ�"+mex.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==10 mex
		
		
		else if(choice==11) {
			
			if(Italy.structureNone.equals(ita.building)) {
				p2_selectItaly=true;
				ita.building_landmark();
				//System.out.println("�ڡڡ�"+ita.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(Italy.structureNone.equals(ita.landmark)) {
				p2_selectItaly=true;
				ita.landmark_building();
				//System.out.println("�ڡڡ�"+ita.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==2 ita
		
		
		else if(choice==12) {
			
			if(Swiss.structureNone.equals(swi.building)) {
				p2_selectSwiss=true;
				swi.building_landmark();
				//System.out.println("�ڡڡ�"+swi.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(Swiss.structureNone.equals(swi.landmark)) {
				p2_selectSwiss=true;
				swi.landmark_building();
				//System.out.println("�ڡڡ�"+swi.travel+"�� ���� �������� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==12 swi
		
		
		else if(choice==13) {
			
			if(Vietnam.structureNone.equals(vie.building)) {
				p2_selectVietnam=true;
				vie.building_landmark();
				//System.out.println("�ڡڡ�"+vie.travel+"�� ���� ���� ���� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(Vietnam.structureNone.equals(vie.landmark)) {
				p2_selectVietnam=true;
				vie.landmark_building();
				//System.out.println("�ڡڡ�"+vie.travel+"�� ���� ���� ���� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==13 vie
		
		
		else if(choice==14) {
			
			if(Egypt.structureNone.equals(egy.building)) {
				p2_selectEgypt=true;
				egy.building_landmark();
				//System.out.println("�ڡڡ�"+egy.travel+"�� ���� ���� ���� ������ϴ١ڡڡ�");
			}//���� + ���帶ũ
			else if(Egypt.structureNone.equals(egy.landmark)) {
				p2_selectEgypt=true;
				egy.landmark_building();
				//System.out.println("�ڡڡ�"+egy.travel+"�� ���� ���� ���� ������ϴ١ڡڡ�");
			}//���帶ũ + ����
			
			break;
		}//choice==14 egy
		
			else if(choice==0){
				return;
		}
		
		else {
			System.out.println("�ش� �Ǵ� ���ڰ� �����ϴ�. �ٽ� �Է� �� �ּ��� :)");
		}//else
		
		}//while
		}//if moved==1
		Player.p2_moved =0;
	}//p2_start upgrade map
	
	
}//class
