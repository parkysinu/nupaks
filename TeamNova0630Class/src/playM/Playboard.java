package playM;

import java.util.Scanner;



public class Playboard {

	public void playboard() {  //�������� �ð������� ǥ�����ִ� �Լ�
							//���� �ϳ��� �ϳ��� �ǹ̸� ������ ����,���̸�,�������ִ� �ǹ���Ȳ,�÷��̾� ��ġ,������Ȳ�� ���� �˼��ִ�.
							//���̸��� �ǹ���Ȳ �÷��̾���ġ�� 1���� �迭�� ǥ���ߴ�.
							//�÷��̾ �����ϰ� �ִ� ��Ȳ�� ���̸� ������ ǥ���Ѵ�.
							//�÷��̾ �̵��ϴ°��� ���� �̱���
							//�迭���� �̵��� ���ؼ� �����ϰ� ������ ���������� �𸣰���.
							//���̸��� ��� 1���� �迭�� ���ļ� ��������
							// ������ �迭�� ���Խ�Ű�� ������� �������� ���� �Ҽ��ְ� �ִ��� ȿ�������� �����̰� ����� ������ ����غ���
							// ���� ���� �ڵ���� �� �������� ���󰬴µ� �ֱ׷����� ������ ���� ������ �غ���.
		Place pla = new Place();
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
		Player player = new Player();
		TimeThread TT = new TimeThread();
		Thread t1 = new Thread(TT);
		PlayboardLog pbl = new PlayboardLog();
		Main main = new Main();



		//String title[]= {start.name,kor.name,jap.name,chi.name,isl.name,eng.name,fra.name,ger.name,rus.name,tax.name,
		//				 usa.name,can.name,mex.name,ball.name,ita.name,swi.name,vie.name,egy.name
		//		
		//}; 
		// �� �迭�� ����Ҽ�������
		//
		
		System.out.println("================================================================================================================================================");
		for(int i=0; i<9;i++) {
		if(i<6) {
			System.out.print(pla.roof+"��");
		}//���Ӻ���
		else if(i==6) {
			System.out.print(pla.blank);
		}
		else if(i==7) {
			System.out.print(pla.roofR);
		}

		}//����
		System.out.println();
		
		
		String[] title5th = {Island.name, England.name, France.name, Germany.name, Russia.name, Taxx2.name};
		for(int i=0;i<8;i++) {
			if(i<6) {
			System.out.print(title5th[i]);
			}//L
			else if(i==6) {
				System.out.print("������"+pla.blank+"���̺�Ʈ ���� ������"+pla.blankH);
			}//mid�߾��� ��ĭ
			else if(i==7) {
				System.out.print("�����衡������ :"+ TimeThread.Season);
			}//R ������ �ؽ�Ʈ ����
		}//for//title5th
		System.out.println();
		
		
		String[] structure5th = {pla.blank, England.structureNone, France.structureNone, Germany.structureNone, Russia.structureNone,pla.blank};
		for(int i=0;i<8;i++) {
			if(i<6) {
				System.out.print(structure5th[i]);
			}//L
			else if(i==6) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==7) {
				System.out.print(pla.blank);
			}//R ������ �ؽ�Ʈ ����
		}
		//building & land mark 5th
		System.out.println();
		
		
		
		for(int i =0 ; i<16;i++) {
			
			if(i==0) {
				System.out.print(pla.blank);
			}//blank
			else if(i==2) {
				eng.calculateCost();
			}//Cost
			else if(i==5) {
				fra.calculateCost();
			}//Cost
			else if(i==8) {
				ger.calculateCost();
			}//Cost
			else if(i==11) {
				rus.calculateCost();
			}//Cost
			else if(i==13){
				System.out.print(pla.blank+pla.blank);
			}
			else if(i==14){
				if(TimeThread.Season.equals(TT.Spring)){
				System.out.print("�����������߱�����Ż���ơ���������");
				}//���϶� ���� ���� ����
				else if(TimeThread.Season.equals(TT.Summer)){
				System.out.print("����������������������������������");
				}
				else if(TimeThread.Season.equals(TT.Fall)){
				System.out.print("�����������߽��ڡ���Ʈ������������");
				}
				else if(TimeThread.Season.equals(TT.Winter)){
				System.out.print("���������ѱ������þơ�����Ʈ������");
				}
			}//i==14
			else if(i==15){
				System.out.print("�������� �̺�Ʈ�� �߻��ϴ� ������ �޶� ���ϴ�.");
			}

			
			else if(i==1||i==3||i==4||i==6||i==7||i==9||i==10||i==12) {
				System.out.print(pla.blankH);

			}//BlankH
			
		}
		//build_markCost
		System.out.println();
		
		
		
		
		String[] playerPoint5th = {Island.playerNone, England.playerNone, France.playerNone, Germany.playerNone, Russia.playerNone, Taxx2.playerNone};
		for(int i=0;i<6;i++) {
			if(i<6) {
		System.out.print(playerPoint5th[i]);
		}//L
			else if(i==6) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==7) {
				System.out.print(pla.blank);
			}//R ������ �ؽ�Ʈ ����
		}
		//player index 5th
		System.out.println();
		
		
		
		
		
		for(int i=0; i<8;i++) {
			
			if(i<6) {
				System.out.print(pla.floor+"��");
			}//���Ӻ���
			else if(i==6) {
				System.out.print(pla.blank);
			}
			else if(i==7) {
				System.out.print("�÷��̾ ��������player 1�١���������������������player 2��");
			}
		}  
		System.out.println();
		//floor5th  //floor5th  //floor5th  //floor5th  //floor5th  //floor5th		//floor5th  //floor5th  //floor5th  //floor5th  //floor5th  //floor5th
		//floor5th  //floor5th  //floor5th  //floor5th  //floor5th  //floor5th		//floor5th  //floor5th  //floor5th  //floor5th  //floor5th  //floor5th		//floor5th  //floor5th  //floor5th  //floor5th  //floor5th  //floor5th
		
		
		for(int i=0;i<5;i++) {
			if(i==0||i==2) {
				System.out.print(pla.roof+"��");
			}//i==0,i==2
			if(i==1) {
				System.out.print(pla.blank2+"��");
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==4) {
				System.out.print("�����ݡ��� ��������"+ Player.p1_cash +"���������������������������"+ Player.p2_cash +"���");
			}//R ������ �ؽ�Ʈ ����
		}//4th roof
		System.out.println();
		
		
		String[] title4th = {China.name,pla.blank3, USA.name};
		for(int i=0;i<8;i++) {
			if(i<3) {
			System.out.print(title4th[i]);
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==4){
				System.out.print("������ ��ġ�� ��������");
			}
			else if(i==5) {
				//�÷��̾�1�� ��ġ�� �˷� �ִ� ���ǹ�.
				if(Player.p1_index ==0){
					System.out.print(start.travel);
				}
				else if(Player.p1_index ==1){
					System.out.print(kor.travel);
				}
				else if(Player.p1_index ==2){
					System.out.print(jap.travel);
				}
				else if(Player.p1_index ==3){
					System.out.print(chi.travel);
				}
				else if(Player.p1_index ==4){
					System.out.print(isl.travel);
				}
				else if(Player.p1_index ==5){
					System.out.print(eng.travel);
				}
				else if(Player.p1_index ==6){
					System.out.print(fra.travel);
				}
				else if(Player.p1_index ==7){
					System.out.print(ger.travel);
				}
				else if(Player.p1_index ==8){
					System.out.print(rus.travel);
				}
				else if(Player.p1_index ==9){
					System.out.print(tax.travel);
				}
				else if(Player.p1_index ==10){
					System.out.print(usa.travel);
				}
				else if(Player.p1_index ==11){
					System.out.print(can.travel);
				}
				else if(Player.p1_index ==12){
					System.out.print(mex.travel);
				}
				else if(Player.p1_index ==13){
					System.out.print(ball.travel);
				}
				else if(Player.p1_index ==14){
					System.out.print(ita.travel);
				}
				else if(Player.p1_index ==15){
					System.out.print(swi.travel);
				}
				else if(Player.p1_index ==16){
					System.out.print(vie.travel);
				}
				else if(Player.p1_index ==17){
					System.out.print(egy.travel);
				}

			}//R ������ �ؽ�Ʈ ���� //i==4
			else if(i==6){
				System.out.print(pla.blank+"������������");
			}
			else if(i==7){
				//�÷��̾� 2�� ��ġ�� �˷��ִ� ���ǹ�
				if(Player.p2_index ==0){
					System.out.print(start.travel);
				}
				else if(Player.p2_index ==1){
					System.out.print(kor.travel);
				}
				else if(Player.p2_index ==2){
					System.out.print(jap.travel);
				}
				else if(Player.p2_index ==3){
					System.out.print(chi.travel);
				}
				else if(Player.p2_index ==4){
					System.out.print(isl.travel);
				}
				else if(Player.p2_index ==5){
					System.out.print(eng.travel);
				}
				else if(Player.p2_index ==6){
					System.out.print(fra.travel);
				}
				else if(Player.p2_index ==7){
					System.out.print(ger.travel);
				}
				else if(Player.p2_index ==8){
					System.out.print(rus.travel);
				}
				else if(Player.p2_index ==9){
					System.out.print(tax.travel);
				}
				else if(Player.p2_index ==10){
					System.out.print(usa.travel);
				}
				else if(Player.p2_index ==11){
					System.out.print(can.travel);
				}
				else if(Player.p2_index ==12){
					System.out.print(mex.travel);
				}
				else if(Player.p2_index ==13){
					System.out.print(ball.travel);
				}
				else if(Player.p2_index ==14){
					System.out.print(ita.travel);
				}
				else if(Player.p2_index ==15){
					System.out.print(swi.travel);
				}
				else if(Player.p2_index ==16){
					System.out.print(vie.travel);
				}
				else if(Player.p2_index ==17){
					System.out.print(egy.travel);
				}

			}//i==6 ������ �÷��̾� 2�� ��ġ�� �˷� �ִ� ���� ��
		}//title 4th
		System.out.println();
		
		String[] structure4th = {China.structureNone,pla.blank2, USA.structureNone};
		for(int i=0;i<8;i++) {
			if(i<3) {
			System.out.print(structure4th[i]);
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==4) {
				System.out.print(pla.blankH+"������������");
			}//R ������ �ؽ�Ʈ ����
//			else if(i==5){
//				if(player.p1_upMonopolized==0&&player.p1_downMonopolized==0&&player.p1_leftMonopolized==0&&player.p1_rightMonopolized==0){
//					System.out.print("���� ���� ���� X");
//				}
//				else if(player.p1_upMonopolized==1){
//					System.out.print("�� ���� ���� ��");
//				}//��
//				else if(player.p1_downMonopolized==1){
//					System.out.print("�Ʒ� ���� ���� ��");
//				}//��
//				else if(player.p1_leftMonopolized==1){
//					System.out.print("���� ���� ������");
//				}//��
//				else if(player.p1_rightMonopolized==1){
//					System.out.print("���� ���� ���� ��");
//				}//��
//			}//p1_���� ���� ��Ȳ
//			else if(i==6){
//			System.out.print(pla.blank+"��");
//			}//i==6
//			else if(i==7){
//				if(player.p2_upMonopolized==0&&player.p2_downMonopolized==0&&player.p2_leftMonopolized==0&&player.p2_rightMonopolized==0){
//					System.out.print("���� ���� ���� X");
//				}
//				else if(player.p2_upMonopolized==1){
//					System.out.print("�� ���� ���� ��");
//				}//��
//				else if(player.p2_downMonopolized==1){
//					System.out.print("�Ʒ� ���� ���� ��");
//				}//��
//				else if(player.p2_leftMonopolized==1){
//					System.out.print("���� ���� ������");
//				}//��
//				else if(player.p2_rightMonopolized==1){
//					System.out.print("���� ���� ���� ��");
//				}//��
//			}//i==7 p2_���� ���� ��Ȳ


		}//4�� �ǹ� ��Ȳ

		System.out.println();
		
		
		
		for(int i =0 ; i<9;i++) {
			
			if(i==0||i==2||i==4||i==6)
			{
				System.out.print(pla.blankH);
			}
			else if(i==3) {
				System.out.print(pla.blank2);
			}
			else if(i==1) {
				chi.calculateCost();
			}
			else if(i==5) {
				usa.calculateCost();
			}
			else if(i==7){
				System.out.print(pla.blank);
			}
			else if(i==8){
				if(IncreasingCost.structureInflationLeft){
					System.out.print("���� ������ �ǹ����� ������ 10�� ��� �߽��ϴ�.");
				}
				else if(IncreasingCost.structureInflationUp){
					System.out.print("���� ������ �ǹ����� ������ 10�� ��� �߽��ϴ�.");
				}
				else if(IncreasingCost.structureInflationRight){
					System.out.print("������ ������ �ǹ����� ������ 10�� ��� �߽��ϴ�.");
				}
				else if(IncreasingCost.structureInflationDown){
					System.out.print("�Ʒ��� ������ �ǹ����� ������ 10�� ��� �߽��ϴ�.");
				}
			}
		}//build_markCost
		//building & land mark 4th
		System.out.println();

		SuperDiceTime superDiceTime =new SuperDiceTime();

		String[] playerPoint4th = {China.playerNone,pla.blank2, USA.playerNone};
		for(int i=0;i<5;i++) {
			if(i<3) {
				System.out.print(playerPoint4th[i]);
			}//L
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==4) {
				System.out.print("�ֻ��� ������ "+SuperDiceTime.player1Gage+"����������"+SuperDiceTime.player2Gage);
			}//R ������ �ؽ�Ʈ ����
		}
		//player index 4th
		System.out.println();
		
		
		
		for(int i=0;i<6;i++) {
			if(i==0||i==2) {
			System.out.print(pla.floor+"��");
			}
			else if(i==1) {
			System.out.print(pla.blank2+"��");
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==4) {
				System.out.print("������������������������������������������������������������������������������������������������������");
			}//R ������ �ؽ�Ʈ ����


		}
		System.out.println();
		//4th floor//4th floor//4th floor//4th floor//4th floor//4th floor//4th floor
		//4th floor//4th floor//4th floor//4th floor//4th floor//4th floor//4th floor
		
		
		
		for(int i=0;i<5;i++) {
			if(i==0||i==2) {
				System.out.print(pla.roof+"��");
			}//i==0,i==2
			if(i==1) {


				if(TurnOver.p1_turnOver || TurnOver.p2_turnOver){

					System.out.print("����1�е��� �ƹ� �ൿ�� �������� �ʾƼ� ���� ���� �Ǿ����ϴ١���");


				}
				else {

					System.out.print(pla.blank2 + "��");
				}



			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid �߾��� ��ĭ
			else if(i==4) {

				pbl.roof3rd();
			}//R ������ �ؽ�Ʈ �� ��
		}//3rd roof
		System.out.println();
		
		
		String[] title3rd = {Japan.name,pla.blank3, Canada.name};
		for(int i=0;i<5;i++) {
			if(i<3) {
			System.out.print(title3rd[i]);
			}//L
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==4) {
				pbl.title3rd();
			}//R ������ �ؽ�Ʈ �� ��
		}//title 3rd
		System.out.println();
		
		
		String[] structure3rd = {Japan.structureNone,pla.blank2, Canada.structureNone};
		for(int i=0;i<5;i++) {
			if(i<3) {
				System.out.print(structure3rd[i]);
			}//L
			else if(i==3) {
				System.out.print(pla.blank+"����");
			}//mid�߾��� ��ĭ
			else if(i==4) {
				pbl.structure3rd();
			}//R ������ �ؽ�Ʈ ����
		}
		//building & land mark 3th
		System.out.println();
		
		
		for(int i =0 ; i<9;i++) {
			
			if(i==0||i==2||i==4||i==6)
			{
				System.out.print(pla.blankH);
			}
			else if(i==1) {
				jap.calculateCost();
			}
			else if(i==5) {
				can.calculateCost();
			}
			else if(i==3) {
				System.out.print(pla.blank2);
			}
			else if(i==7){
				System.out.print(pla.blank+"����");
			}
			else if(i==8){
				pbl.cost3rd();
			}
		}//build_markCost3th
		System.out.println();
		
		
		String[] playerPoint3rd = {Japan.playerNone,pla.blank2, Canada.playerNone};
		for(int i=0;i<6;i++) {
			if(i<3) {
				System.out.print(playerPoint3rd[i]);
			}//L
			else if(i==3) {
				System.out.print(pla.blank+"����");
			}//mid�߾��� ��ĭ
			else if(i==4) {
				pbl.playerIndex3rd();
			}//R ������ �ؽ�Ʈ ����
			else if(i==5){

			}
		}
		//player index 3rd
		System.out.println();
		
		for(int i=0;i<5;i++) {
			if(i==0||i==2) {
			System.out.print(pla.floor+"��");
			}
			else if(i==1) {
			System.out.print(pla.blank2+"��");
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==4) {
				pbl.floor3rd_p1();
				pbl.floor3rd_p2();
			}//R ������ �ؽ�Ʈ ����
		}
		System.out.println();
	
		//3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor 
		//3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor 
	
		
		for(int i=0;i<5;i++) {
			if(i==0||i==2) {
				System.out.print(pla.roof+"��");
			}//i==0,i==2
			if(i==1) {
				System.out.print(pla.blank2+"��");
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==4) {
				pbl.roof2nd_p1();
				pbl.roof2nd_p2();
			}//R ������ �ؽ�Ʈ ����
		}//2nd roof
		System.out.println();
		
		
		String[] title2nd = {Korea.name,pla.blank3, Mexico.name};
		for(int i=0;i<5;i++) {
			if(i<3) {
				System.out.print(title2nd[i]);
			}//L
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==4) {
				pbl.title2nd_p1();
				pbl.title2nd_p2();
			}//R ������ �ؽ�Ʈ ����
		}//title 2nd
		
		System.out.println();
		
		String[] structure2nd = {Korea.structureNone,pla.blank2, Mexico.structureNone};
		for(int i=0;i<5;i++) {
			if(i<3) {
				System.out.print(structure2nd[i]);
			}//L
			else if(i==3) {
				System.out.print(pla.blank+"��");
			}//mid�߾��� ��ĭ
			else if(i==4) {
				pbl.structure2nd_p1();
				pbl.structure2nd_p2();
			}//R ������ �ؽ�Ʈ ����
		}
		//building & land mark 2nd
		System.out.println();
		
		for(int i =0 ; i<10;i++) {
			
			if(i==0||i==2||i==4||i==6)
			{
				System.out.print(pla.blankH);
			}
			else if(i==1) {
				kor.calculateCost();
			}
			else if(i==5) {
				mex.calculateCost();
			}
			else if(i==3) {
				System.out.print(pla.blank2);
			}
			else if(i==8){
				System.out.print(pla.blank+"����");
			}
			else if(i==9){

				pbl.cost2nd_p1();
				pbl.cost2nd_p2();
			}
		}//build_markCost 2nd
		System.out.println();
		
	
		
		String[] playerPoint2nd = {Korea.playerNone,pla.blank2, Mexico.playerNone};
		for(int i=0;i<5;i++) {
			if(i<3) {
				System.out.print(playerPoint2nd[i]);
			}//L
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==4) {
				pbl.playerIndex2nd_p1();
				pbl.playerIndex2nd_p2();
			}//R ������ �ؽ�Ʈ ����
		}
		//player index 2nd
		System.out.println();
		
		for(int i=0;i<5;i++) {
			if(i==0||i==2) {
			System.out.print(pla.floor+"��");
			}
			else if(i==1) {
			System.out.print(pla.blank2+"��");
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==4) {
				pbl.floor2nd_p1();
				pbl.floor2nd_p2();
			}//R ������ �ؽ�Ʈ ����
		}
		System.out.println();
	
		
		//2nd floor  //2nd floor  //2nd floor  //2nd floor  //2nd floor  //2nd floor  
		//2nd floor  //2nd floor  //2nd floor  //2nd floor  //2nd floor  //2nd floor  
		
	
		for(int i=0;i<8;i++) {
			if(i<6) {
				System.out.print(pla.roof+"��");
			}//L
			else if(i==6) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==7) {
				pbl.roof1st_p1();
				pbl.roof1st_p2();
			}//R ������ �ؽ�Ʈ ����
			}//1st roof
		System.out.println();
		
		
		String[] title1st = {Start.name, Egypt.name, Vietnam.name, Swiss.name, Italy.name,ball.name };
		for(int i=0;i<8;i++) {
			if(i<6) {
				System.out.print(title1st[i]);
			}//L
			else if(i==6) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==7) {
				pbl.title1st_p1();
				pbl.title1st_p2();
			}//R ������ �ؽ�Ʈ ����
		}//title 1st
		
		System.out.println();
		
		
		String[] structure1st = {pla.blank, Egypt.structureNone, Vietnam.structureNone, Swiss.structureNone, Italy.structureNone,pla.blank};
		
		for(int i=0;i<8;i++) {
			if(i<6) {
				System.out.print(structure1st[i]+"��");
			}//L
			else if(i==6) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==7) {
				pbl.structure1st_p1();
				pbl.structure1st_p2();
			}//R ������ �ؽ�Ʈ �� ��
		}
		//building & land mark 1st
		System.out.println();
		
		
		for(int i =0 ; i<17;i++) {
			
			if(i==0||i==13) {
				System.out.print(pla.blank);
			}//blank
			else if(i==2) {
				egy.calculateCost();
			}//Cost
			else if(i==5) {
				vie.calculateCost();
			}//Cost
			else if(i==8) {
				swi.calculateCost();
			}//Cost
			else if(i==11) {
				ita.calculateCost();
			}//Cost
			
			
			else if(i==1||i==3||i==4||i==6||i==7||i==9||i==10||i==12) {
				System.out.print(pla.blankH);

			}//BlankH
			else if(i==14){
				System.out.print(pla.blank+pla.blankH);
			}
			else if(i==15){
				pbl.cost1st_p1();
				pbl.cost1st_p2();
			}//������ �ؽ�Ʈ ���� ��
		}
		//build_markCost 1st
		System.out.println();
		
		
		
		String[] playerPoint1st = {Start.playerNone, Egypt.playerNone, Vietnam.playerNone, Swiss.playerNone, Italy.playerNone, Balloon.playerNone,};
		for(int i=0;i<8;i++) {
			if(i<6) {
				System.out.print(playerPoint1st[i]);
			}//L
			else if(i==6) {
				System.out.print(pla.blank+pla.blankH);
			}//mid�߾��� ��ĭ
			else if(i==7) {
				pbl.playerIndex1st_p1();
				pbl.playerIndex1st_p2();
			}//R ������ �ؽ�Ʈ ����
		}
		//player index 1st
		System.out.println();
		
		for(int i=0;i<8;i++) {
			if(i<6) {
				System.out.print(pla.floor+"��");
			}
			else if(i==6) {
				System.out.print(pla.blank);
			}//mid�߾��� ��ĭ
			else if(i==7) {
				System.out.print(pla.floorR);
			}//R ������ �ؽ�Ʈ ����
		}//1st floor
		System.out.println();
		System.out.println("=================================================================================================================================================");
		
		//first (1st) floor //first (1st) floor //first (1st) floor //first (1st) floor //first (1st) floor //first (1st) floor 
		//first (1st) floor //first (1st) floor //first (1st) floor //first (1st) floor //first (1st) floor 
	
	}//playBoard() ������
	
	
	public void op() {
		
		Place pla = new Place();
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
		
		
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("���������������������������� ���� �޴��󡡡�����������������������������");
		System.out.println();
		System.out.println("��1.2���̼� ��� �� �ִ�. �÷��̾�1�� ��   �÷��̾�2�� ��  ���� ��� �Ѵ�.");
		System.out.println();
		System.out.println("��2.�� �ֻ��� �� 6������ ���� ������ �ֻ��� 2���� ������ �� �ֻ����� ������");
		System.out.println("����  ������ �̵� ��ų�� �ִ�.");
		System.out.println();
		System.out.println("��3.�÷��̾� ���� �̵� �ϰ� ������ ���� ������ ���� �Ǹ� ��� ���� ���� �ʰ�");
		System.out.println("���� ����� �ΰ� �ȴ�.");
		System.out.println();
		System.out.println("��4.������ �� �� �÷��̾�� 100�﾿ �ް� �ȴ�.");
		System.out.println();
		System.out.println("��5.�÷��̾ ����� �����ϰ� �ִ� �ʿ� �� �湮�� �ϰ� �� ��� ������ ���� ");
		System.out.println("�������� ���� ��� �ȴ�.");
		System.out.println();
		System.out.println("��6.�÷��̾� 1�� �÷��̾�2�� �����ϰ� �ִ� �ʿ� ���� �Ǹ� ����Ḧ ���� �ؾ�");
		System.out.println("���� �Ѵ�.");
		System.out.println();
		System.out.println("��7.������ ����� �ΰ� ������ Ȯ����  ��(����)�̳� ��(���� ��ũ)�� �Ǽ� �Ѵ�.");
		System.out.println();
		System.out.println("��8.�� �÷��̾���� ��� �÷��̾ ����� �ʿ� ���� �ϰ� �Ǹ� ���� ��Ȳ��");
		System.out.println("�������� ����Ḧ ���� �ϰ� �ȴ�.  ");
		System.out.println();
		System.out.println();
		System.out.println("��9.�� ���� ���� �ִ� �̺�Ʈ �ʿ� �����ϸ� �̺�Ʈ�� �����Ҽ��ִ�.");
		System.out.println();
		System.out.println("��10.��� �÷��̾ �Ļ� �ϰų� 10���� ������ �Ǹ�,������ ���� �ǰ� ");
		System.out.println("�������� �ϰ� �ִ� �ǹ��� ���� ��Ȳ�� ���� �ؼ� �¸��� �й踦 ���� �ִ�.");
		System.out.println();
		System.out.println("����������������������������������������������������������������������������������������������������������������������������������");
		System.out.println();
		System.out.println();
		System.out.println("�����������������ƹ�Ű�� �����ø� ������ �����մϴ�.");
		System.out.println();

		Scanner scan= new Scanner(System.in);
		String go;
		go=scan.nextLine();
	
	}//op
	
	
}//class
