package playM;

import java.util.Scanner;

public class Island extends Place{

	static String name 		="�������ε�������";
	String player1			="������~������������";
	String player2  		="��������������~����";
	String player1_2		="������~������~����";
	String player2_1		="������~������~����";
	String playerBlank		="����������������";
	static String playerNone="����������������";
	String travel ="���ε�";
	int dice1;
	int dice2;
	Scanner scan = new Scanner(System.in);
	int choice;
	static boolean throwDice;


	static boolean p1_lockedIsland;
	static boolean p1_lockedIslandError;
	static boolean p1_select1Pass;
	static boolean p1_select1Fail;
	static boolean p1_select2Call;


	static boolean p2_lockedIsland;
	static boolean p2_select1Pass;
	static boolean p2_select1Fail;
	static boolean p2_select2Call;
	static boolean p2_lockedIslandError;



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




	///�ֻ��� ���� ������� �ʾƼ� ���Ӱ� ­�� .
	//������ ����Ǵ� ��ġ�� �޶� ��� �ذ��ؾ����� �����ؾ���.

	public void lockedIsland_p1() {
		Player player = new Player();
		Playboard playboard =new Playboard();
		Scanner scan= new Scanner(System.in);
		if(Player.p1_index ==4) {

			p1_lockedIsland = true;
			//System.out.println("���ε��� �������ϴ�. :( � ������� Ż���� �õ��غ����?");
			//System.out.println("1.���� �����غ���. ���� �� �質 ����Ⱑ �����Ұ� ����!");
			//System.out.println("2.30�� ����� ���� ���ε� ���� ������ü 'don't worry'�� �θ���. ");
			playboard.playboard();
			while (true) {
				choice = scan.nextInt();
				if (choice == 1) {
					choice1_p1();
					break;
				}//choice==1
				else if (choice == 2) {
					choice2_p1();
					break;
				} else {
					p1_lockedIslandError = true;
					playboard.playboard();
					//System.out.println("�߸� �Է��߽��ϴ�. �� ��� ����� �����! �������ּ���.");

				}//else
			}//while(true)
		}//p1_index==4�� �� �޼ҵ� ����
	}//���ε� Ż�� 
	
	
	public void lockedIsland_p2() {
		Playboard playboard = new Playboard();
		Player player = new Player();
		Scanner scan= new Scanner(System.in);
		if(Player.p2_index ==4) {
			p2_lockedIsland = true;
			playboard.playboard();
			//System.out.println("���ε��� �������ϴ�. :( � ������� Ż���� �õ��غ����?");
			//System.out.println("1.���� �����غ���. ���� �� �質 ����Ⱑ �����Ұ� ����!");
			//System.out.println("2.30�� ����� ���� ���ε� ���� ������ü 'don't worry'�� �θ���. ");

			while (true) {
				choice = scan.nextInt();
				if (choice == 1) {
					choice1_p2();
					break;
				}//choice==1
				else if (choice == 2) {
					choice2_p2();
					break;
				}//choice==2
				//else if(choice==3) {

				//	break;
				//}//choice==3
				else {
					p2_lockedIslandError = true;
					playboard.playboard();
					//System.out.println("�߸� �Է� �߽��ϴ�. �� ��� ����� �����! ���� ���ּ���.");

				}//else
			}//while(true)
		}//p2_index==4 �϶� �޼ҵ� ����
	}//���ε� Ż�� 
	

	public void choice1_p1() {
		Player player = new Player();
		Dice dice = new Dice();
		Island isl = new Island();
		France fra = new France();
		Germany ger = new Germany();
		Russia rus = new Russia();
		Taxx2 tax = new Taxx2();
		USA usa = new USA();
		Canada can = new Canada();
		Mexico mex = new Mexico();
		Vietnam vie = new Vietnam();
		Swiss swi = new Swiss();
		Italy ita = new Italy();
		Balloon ball = new Balloon();
		Playboard playboard = new Playboard();

		dice.escapeIsland();
		
		if(Dice.dice1 == Dice.dice2) {

			p1_select1Pass=true;
			//System.out.println("�ֻ����� ���ȴµ� ���� ����? �̰� �ϴ��� ��þ�!");
			//System.out.println("�ָ��� �ѿ���� �Ҹ��� �鸰��");
			//System.out.println("��? �谡 ���� ���� ���� ���� ����!");
			//System.out.println("�� ��Ҵ�");
			//System.out.println("��)���ε� Ż�⿡ ���� �߽��ϴ�(��");
			Player.p1_locked =0;
//			player.moving1();
//			player.p1_index = 4 + player.dice1 + player.dice2;
//
//
//			if (player.p1_index == 6) {
//				if (fra.playerNone.equals(fra.playerBlank)) {
//					fra.player1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (fra.playerNone.equals(fra.player2)) {
//					fra.player2_1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� 2p�� ��ġ �ϰ� ���� ��
//
//			} // p1_index == 6 //������
//
//			else if (player.p1_index == 7) {
//				if (ger.playerNone.equals(ger.playerBlank)) {
//					ger.player1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ger.playerNone.equals(ger.player2)) {
//					ger.player2_1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� 2p�� ��ġ �ϰ� ���� ��
//			} // p1_index == 7 //����
//
//			else if (player.p1_index == 8) {
//				if (rus.playerNone.equals(rus.playerBlank)) {
//					rus.player1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (rus.playerNone.equals(rus.player2)) {
//					rus.player2_1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� 2p�� ��ġ �ϰ� ���� ��
//			} // p1_index ==8 //���þ�
//
//			else if (player.p1_index == 9) {
//				if (tax.playerNone.equals(tax.playerBlank)) {
//					tax.player1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (tax.playerNone.equals(tax.player2)) {
//					tax.player2_1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//				tax.vistX2();// ����ᰡ 2�谡 �Ǵ� �޼ҵ�
//			} // p1_index ==9 //�����x2
//
//			else if (player.p1_index == 10) {
//				if (usa.playerNone.equals(usa.playerBlank)) {
//					usa.player1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (usa.playerNone.equals(usa.player2)) {
//					usa.player2_1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==10 //�̱�
//
//			else if (player.p1_index == 11) {
//				if (can.playerNone.equals(can.playerBlank)) {
//					can.player1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (can.playerNone.equals(can.player2)) {
//					can.player2_1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==11 //ĳ����
//
//			else if (player.p1_index == 12) {
//				if (mex.playerNone.equals(mex.playerBlank)) {
//					mex.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (mex.playerNone.equals(mex.player2)) {
//					mex.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==12 //�߽���
//
//			else if (player.p1_index == 13) {
//				player.p1_balloonLock=1;
//				if (ball.playerNone.equals(ball.playerBlank)) {
//					ball.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ball.playerBlank.equals(ball.player2)) {
//					ball.player2_1();
//
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//
//
//			} // p1_index ==13 //���ⱸ
//
//			else if (player.p1_index == 14) {
//				if (ita.playerNone.equals(ita.playerBlank)) {
//					ita.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ita.playerNone.equals(ita.player2)) {
//					ita.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==14 //��Ż����
//
//			else if (player.p1_index == 15) {
//				if (swi.playerNone.equals(swi.playerBlank)) {
//					swi.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (swi.playerNone.equals(swi.player2)) {
//					swi.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==15 //������
//
//			else if (player.p1_index == 16) {
//				if (vie.playerNone.equals(vie.playerBlank)) {
//					vie.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (vie.playerNone.equals(vie.player2)) {
//					vie.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==16 //��Ʈ��
//
//			//�÷��̾ ���ε� Ż�� �ڿ� �̵� ��Ų��.
//
//			if(isl.playerNone.equals(isl.player1)){
//				isl.player1_None();
//			}
//			else if(isl.playerNone.equals(isl.player1_2)){
//				isl.player12_2();
//			}
			//���ε��� �ִ� �÷��̾��� ��ǥ�� �ٲ������ ���ε��� �÷��̾ �ٲ��ش�.
			playboard.playboard();
		}//dice1==dice2
		
		else if(Dice.dice1 != Dice.dice2) {

			p1_select1Fail=true;
			Player.p1_locked =1;
			playboard.playboard();
			//System.out.println("�ֻ��� ���� ���� �ٸ���.. �׷��� ��� ����Ⱑ ���� �󸶳� ������ �Ѵ����� ����������");
			//System.out.println(".....�ƹ��͵� ���� �ʴ´�");

			
			//���ϸ��� �����Ǵ� �޼ҵ嵵 ��������.
			//��� ������ΰ�?
			//������ ������ �� ���� ���ε��� ��ġ �ϰ� �ִٸ� �ֻ����� ���Ӱ� �������� ���ο� ����� ã���� ������ ��
			
			
		}//dice1!=dice2
	}//choice1_p1

	
	public void choice1_p2() {
		Player player = new Player();
		Dice dice = new Dice();
		Place pla_player2 = new Place();
		Playboard board = new Playboard();

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
		dice.escapeIsland();
		if(Dice.dice1 == Dice.dice2) {
			p2_select1Pass=true;
			
			//System.out.println("�ֻ����� ���ȴµ� ���� ����? �̰� �ϴ��� ��þ�!");
			//System.out.println("�ָ��� �ѿ���� �Ҹ��� �鸰��");
			//System.out.println("��? �谡 �������� ���⿡�� ����!");
			//System.out.println("�� ��Ҵ�");
			//System.out.println();
			//System.out.println();
			//System.out.println("��)���ε� Ż�⿡ �����߽��ϴ�(��");
			Player.p2_locked =0;

//			player.moving2();
//			player.p2_index=4+player.dice1+player.dice2;
//
//			if (player.p2_index == 6) {
//				if (fra.playerNone.equals(pla_player2.playerBlank)) {
//					fra.player2();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (fra.playerNone.equals(pla_player2.player1)) {
//					fra.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index == 6 //������
//
//			else if (player.p2_index == 7) {
//				if (ger.playerNone.equals(pla_player2.playerBlank)) {
//					ger.player2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ger.playerNone.equals(pla_player2.player1)) {
//					ger.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index == 7 //����
//
//			else if (player.p2_index == 8) {
//				if (rus.playerNone.equals(pla_player2.playerBlank)) {
//					rus.player2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (rus.playerNone.equals(pla_player2.player1)) {
//					rus.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==8 //���þ�
//
//			else if (player.p2_index == 9) {
//				if (tax.playerNone.equals(pla_player2.playerBlank)) {
//					tax.player2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (tax.playerNone.equals(pla_player2.player1)) {
//					tax.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//				tax.vistX2();// ����� 2�谡 �Ǵ� �޼ҵ�
//			} // p2_index ==9 //�����x2
//
//			else if (player.p2_index == 10) {
//				if (usa.playerNone.equals(pla_player2.playerBlank)) {
//					usa.player2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (usa.playerNone.equals(pla_player2.player1)) {
//					usa.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==10 //�̱�
//
//			else if (player.p2_index == 11) {
//				if (can.playerNone.equals(pla_player2.playerBlank)) {
//					can.player2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (can.playerNone.equals(pla_player2.player1)) {
//					can.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==11 //ĳ����
//
//			else if (player.p2_index == 12) {
//				if (mex.playerNone.equals(pla_player2.playerBlank)) {
//					mex.player2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (mex.playerNone.equals(pla_player2.player1)) {
//					mex.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==12 //�߽���
//
//			else if (player.p2_index == 13) {
//				player.p2_balloonLock=1;
//				if (ball.playerNone.equals(pla_player2.playerBlank)) {
//					ball.player2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ball.playerNone.equals(pla_player2.player1)) {
//					ball.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//
//			} // p2_index ==13 //���ⱸ
//
//			else if (player.p2_index == 14) {
//				if (ita.playerNone.equals(pla_player2.playerBlank)) {
//					ita.player2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ita.playerNone.equals(pla_player2.player1)) {
//					ita.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==14 //��Ż����
//
//			else if (player.p2_index == 15) {
//				if (swi.playerNone.equals(pla_player2.playerBlank)) {
//					swi.player2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (swi.playerNone.equals(pla_player2.player1)) {
//					swi.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==15 //������
//
//			else if (player.p2_index == 16) {
//				if (vie.playerNone.equals(pla_player2.playerBlank)) {
//					vie.player2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (vie.playerNone.equals(pla_player2.player1)) {
//					vie.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==16 //��Ʈ��
//
//
//			//�÷��̾ ���ε� Ż�� �ڿ� �̵� ��Ų��.
//
//			if(isl.playerNone.equals(isl.player2)){
//				isl.player2_None();
//			}
//			else if(isl.playerNone.equals(isl.player1_2)){
//				isl.player12_1();
//			}
			//�÷��̾� �̵��� ��Ų �Ŀ� ���� �ִ� �ڸ��� �÷��̾� ���� �ʱ�ȭ ��Ű��
			board.playboard();
		}//dice1==dice2

		else if(Dice.dice1 != Dice.dice2) {
			p2_select1Fail=true;
			//System.out.println("�ֻ��� ���� ���� �ٸ���.. �׷��� ��� ����Ⱑ ���� �󸶳� ������ �Ѵ����� ����������");
			//System.out.println(".....�ƹ��͵� ���� �ʴ´�");
			
			Player.p2_locked =1;
			board.playboard();
			//���ϸ��� �����Ǵ� �޼ҵ嵵 ��������.
			//��� ������ΰ�?
			//������ �����Ҷ����� ���ε��� ��ġ�ϰ��ִٸ� �ֻ����� ���Ӱ� �������� ���ο� ����� ã���� ��������
			
			
		}//dice1!=dice2
	}//choice1_p2
	
	public void choice2_p1() {
		//2���� ������ �ϰ� �Ǹ� 30���� ���� ���� ���� ��ü(?)�� �ҷ� Ż�� �ϰ� ���� ������ ������ ���� �Ѵ�.
		
		
		p1_select2Call=true;


		//System.out.println("�ȳ� �ϼ��� ���� ���� ��ü 'don't worry' �Դϴ�. �� ���� ������ ���ؼ� ������ �Խ��ϴ�.");
		//System.out.println("���� �մϴ�");
		//System.out.println("���� �̿� ��� 30�� �Դϴ�.");
		//System.out.println("�ʹ� ���..");
		//System.out.println("�١١ٴ���� ������ 30�� ���� �Ǿ� ���ϴ١١١�");


		Player player = new Player();
		Island isl = new Island();
		France fra = new France();
		Germany ger = new Germany();
		Russia rus = new Russia();
		Taxx2 tax = new Taxx2();
		USA usa = new USA();
		Canada can = new Canada();
		Mexico mex = new Mexico();
		Vietnam vie = new Vietnam();
		Swiss swi = new Swiss();
		Italy ita = new Italy();
		Balloon ball = new Balloon();
		Playboard pb = new Playboard();


			Player.p1_cash = Player.p1_cash -30;
			Player.p1_locked =0;
//			player.moving1();
//			player.p1_index= 4 + player.dice1 + player.dice2;
//
//			if (player.p1_index == 6) {
//				if (fra.playerNone.equals(fra.playerBlank)) {
//					fra.player1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//
//				else if (fra.playerNone.equals(fra.player2)) {
//					fra.player2_1();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� 2p�� ��ġ �ϰ� ���� ��
//			} // p1_index == 6 //������
//
//			else if (player.p1_index == 7) {
//				if (ger.playerNone.equals(ger.playerBlank)) {
//					ger.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ger.playerNone.equals(ger.player2)) {
//					ger.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index == 7 //����
//
//			else if (player.p1_index == 8) {
//				if (rus.playerNone.equals(rus.playerBlank)) {
//					rus.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (rus.playerNone.equals(rus.player2)) {
//					rus.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==8 //���þ�
//
//			else if (player.p1_index == 9) {
//				if (tax.playerNone.equals(tax.playerBlank)) {
//					tax.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (tax.playerNone.equals(tax.player2)) {
//					tax.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//				tax.vistX2();// ����ᰡ 2�谡 �Ǵ� �޼ҵ�
//			} // p1_index ==9 //�����x2
//
//			else if (player.p1_index == 10) {
//				if (usa.playerNone.equals(usa.playerBlank)) {
//					usa.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (usa.playerNone.equals(usa.player2)) {
//					usa.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==10 //�̱�
//
//			else if (player.p1_index == 11) {
//				if (can.playerNone.equals(can.playerBlank)) {
//					can.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (can.playerNone.equals(can.player2)) {
//					can.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==11 //ĳ����
//
//			else if (player.p1_index == 12) {
//				if (mex.playerNone.equals(mex.playerBlank)) {
//					mex.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (mex.playerNone.equals(mex.player2)) {
//					mex.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==12 //�߽���
//
//			else if (player.p1_index == 13) {
//				player.p1_balloonLock=1;
//				if (ball.playerNone.equals(ball.playerBlank)) {
//					ball.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ball.playerBlank.equals(ball.player2)) {
//					ball.player2_1();
//
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//
//
//			} // p1_index ==13 //���ⱸ
//
//			else if (player.p1_index == 14) {
//				if (ita.playerNone.equals(ita.playerBlank)) {
//					ita.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ita.playerNone.equals(ita.player2)) {
//					ita.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==14 //��Ż����
//
//			else if (player.p1_index == 15) {
//				if (swi.playerNone.equals(swi.playerBlank)) {
//					swi.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (swi.playerNone.equals(swi.player2)) {
//					swi.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==15 //������
//
//			else if (player.p1_index == 16) {
//				if (vie.playerNone.equals(vie.playerBlank)) {
//					vie.player1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (vie.playerNone.equals(vie.player2)) {
//					vie.player2_1();
//				} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
//			} // p1_index ==16 //��Ʈ��
//
//			//�÷��̾ ���ε� Ż�� �ڿ� �̵� ��Ų��.
//
//			if(isl.playerNone.equals(isl.player1)){
//				isl.player1_None();
//			}
//			else if(isl.playerNone.equals(isl.player1_2)){
//				isl.player12_2();
//			}

		pb.playboard();
		
	}//choice2_p1
	
	
	public void choice2_p2() {
		//2���� ���� �ϰ� �Ǹ� 30���� ���� ���� ���� ��ü(?)�� �ҷ� Ż���ϰ� ���������� ������ �����Ѵ�.


		Player player = new Player();

		p2_select2Call=true;
		//System.out.println("�ȳ��ϼ��� ���� ���� ��ü 'don't worry' �Դϴ�. ������ ������ ���ؼ� ������ �Խ��ϴ�.");
	//	System.out.println("�����մϴ�");
		//System.out.println("���� �̿��� 30�� �Դϴ�.");
	//	System.out.println("�ʹ� ���..");
		//System.out.println("�ڡڡڴ���� ������ 30�� ���� �Ǿ����ϴ١ڡڡ�");


		Dice dice = new Dice();
		Place pla_player2 = new Place();

		Playboard playboard = new Playboard();
		Island isl = new Island();
		France fra = new France();
		Germany ger = new Germany();
		Russia rus = new Russia();
		Taxx2 tax = new Taxx2();
		USA usa = new USA();
		Canada can = new Canada();
		Mexico mex = new Mexico();
		Vietnam vie = new Vietnam();
		Swiss swi = new Swiss();
		Italy ita = new Italy();
		Balloon ball = new Balloon();
		Player.p2_cash = Player.p2_cash - 30;


			Player.p2_locked = 0;
//			player.moving2();
//			player.p2_index = 4 + player.dice1 + player.dice2;
//
//			if (player.p2_index == 6) {
//				if (fra.playerNone.equals(pla_player2.playerBlank)) {
//					fra.player2();
//				} // 1p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (fra.playerNone.equals(pla_player2.player1)) {
//					fra.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ� ���� ��
//			} // p2_index == 6 //������
//
//			else if (player.p2_index == 7) {
//				if (ger.playerNone.equals(pla_player2.playerBlank)) {
//					ger.player2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ger.playerNone.equals(pla_player2.player1)) {
//					ger.player1_2();
//				} // 2p�� �̵� �Ϸ��� �ڸ��� 1p�� ��ġ�ϰ� ���� ��
//			} // p2_index == 7 //����
//
//			else if (player.p2_index == 8) {
//				if (rus.playerNone.equals(pla_player2.playerBlank)) {
//					rus.player2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (rus.playerNone.equals(pla_player2.player1)) {
//					rus.player1_2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==8 //���þ�
//
//			else if (player.p2_index == 9) {
//				if (tax.playerNone.equals(pla_player2.playerBlank)) {
//					tax.player2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (tax.playerNone.equals(pla_player2.player1)) {
//					tax.player1_2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//				tax.vistX2();// ����� 2�谡 �Ǵ� �޼ҵ�
//			} // p2_index ==9 //�����x2
//
//			else if (player.p2_index == 10) {
//				if (usa.playerNone.equals(pla_player2.playerBlank)) {
//					usa.player2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (usa.playerNone.equals(pla_player2.player1)) {
//					usa.player1_2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==10 //�̱�
//
//			else if (player.p2_index == 11) {
//				if (can.playerNone.equals(pla_player2.playerBlank)) {
//					can.player2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (can.playerNone.equals(pla_player2.player1)) {
//					can.player1_2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==11 //ĳ����
//
//			else if (player.p2_index == 12) {
//				if (mex.playerNone.equals(pla_player2.playerBlank)) {
//					mex.player2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (mex.playerNone.equals(pla_player2.player1)) {
//					mex.player1_2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==12 //�߽���
//
//			else if (player.p2_index == 13) {
//				player.p2_balloonLock = 1;
//				if (ball.playerNone.equals(pla_player2.playerBlank)) {
//					ball.player2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ball.playerNone.equals(pla_player2.player1)) {
//					ball.player1_2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//
//			} // p2_index ==13 //���ⱸ
//
//			else if (player.p2_index == 14) {
//				if (ita.playerNone.equals(pla_player2.playerBlank)) {
//					ita.player2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (ita.playerNone.equals(pla_player2.player1)) {
//					ita.player1_2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==14 //��Ż����
//
//			else if (player.p2_index == 15) {
//				if (swi.playerNone.equals(pla_player2.playerBlank)) {
//					swi.player2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (swi.playerNone.equals(pla_player2.player1)) {
//					swi.player1_2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==15 //������
//
//			else if (player.p2_index == 16) {
//				if (vie.playerNone.equals(pla_player2.playerBlank)) {
//					vie.player2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
//				else if (vie.playerNone.equals(pla_player2.player1)) {
//					vie.player1_2();
//				} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
//			} // p2_index ==16 //��Ʈ��
//
//
//			//�÷��̾ ���ε� Ż�� �ڿ� �̵� ��Ų��.
//
//			if (isl.playerNone.equals(isl.player2)) {
//				isl.player2_None();
//			}
//			else if (isl.playerNone.equals(isl.player1_2)) {
//				isl.player12_1();
//			}
			//�÷��̾� �̵���Ų �Ŀ� ���� �ִ� �ڸ��� �÷��̾� ���� �ʱ�ȭ ��Ű��
		playboard.playboard();
		}//choice2_p2


		public void failSameEyes_p1 () {
			//��� ������ �ұ�
			//���ο� ����� ���� ������ 2�� ���� ex)int lock =0; (boolean)?


			Player player = new Player();
			Scanner scan = new Scanner(System.in);
			int choice;

			System.out.println("���ε��� ������ ���� 1����°�ε�..���⸦ ��� ������..");
			System.out.println("1.�ֻ����� ������ ���� ���� ���ĺ���!");
			System.out.println("2.�� ? ���� �ڵ��� ������? 30���� ���� ���ε� ���� ������ü 'don't worry'���� ���񽺸� ��Ź�Ѵ�.");
			//System.out.println("3.�� ���������� �����ϰ��ִ� ������ �絵�ϰ� �Ǹ� ����������? ");
			while (true) {
				choice = scan.nextInt();
				if (choice == 1) {
					choice1_p1();
					break;
				}//choice==1
				else if (choice == 2) {
					choice2_p1();
					break;
				}//choice==2
				//else if(choice==3) {

				//	break;
				//}//choice==3
				else {
					System.out.println("�߸� �Է��߽��ϴ�. �� ��� ����� �����! �������ּ���.");

				}//else
			}//while(true)

		}//failSameEyes_p1

		public void failSameEyes_p2 () {
			//��� ������ �ұ�
			//���ο� ����� ���� ������ 2�� ���� ex)int lock =0; (boolean)?


			Player player = new Player();
			Scanner scan = new Scanner(System.in);
			int choice;

			System.out.println("���ε��� ������ ���� 1����°�ε�..���⸦ ��� ������..");
			System.out.println("1.�ֻ����� ������ ���� ���� ���ĺ���!");
			System.out.println("2.�� ? ���� �ڵ��� ������? 30���� ���� ���ε� ���� ������ü 'don't worry'���� ���񽺸� ��Ź�Ѵ�.");

			while (true) {
				choice = scan.nextInt();
				if (choice == 1) {
					choice1_p2();
					break;
				}//choice==1
				else if (choice == 2) {
					choice2_p2();
					break;
				}//choice==2

				else {
					System.out.println("�߸� �Է��߽��ϴ�. �� ��� ����� �����! �������ּ���.");

				}//else
			}//while(true)

		}//failSameEyes_p2

	}//class

