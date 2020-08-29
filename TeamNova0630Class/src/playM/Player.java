package playM;

import java.util.Random;
import java.util.Scanner;

public class Player {

	// �÷��̾� Ŭ�������� �� ǥ���� �� �ִ� ������ �Լ��� ���� �� ������
	// ��, �̵���, ���� ���� �ϰ� �ִ� ��, ���� �ϰ� �ִ� ���帶ũ, ���� �ϰ� �ִ� ����,
	// �������̽��� �� �� ǥ���� �� �ְ� ���� �� ����
	// ���ӿ� ���� ���� �����������
	// ���� �ǿ� ǥ���� ������ ���⼭ �޼ҵ带 ����� �͵� ������ ������
	// ���� ������ ���� ��Ȳ ���� ���� ��ȹ

	static int p1_cash;
	static int p1_mountOfBuilding;
	static int p1_mountOfLandmark;
	static int p1_locked;
	static int p1_balloonLock;
	static int p1_index;
	static int p1_gage;
	static int p1_upMonopolized;
	static int p1_downMonopolized;
	static int p1_leftMonopolized;
	static int p1_rightMonopolized;
	static int p1_moved;   			//moved ������ ��� ������ �ٷ� ����� �޼��尡 ���� ���� �ʰ� , �ѹ��� �̻� ������ �� ���� �ɼ� �ֵ��� �����ص�

	int p1_moving;
	int p1_past;
	int p1_result;




	// p1 ����

	static int p2_cash;
	static int p2_index;
	static int p2_locked;
	static int p2_balloonLock;
	static int p2_mountOfBuilding;
	static int p2_mountOfLandmark;
	static int p2_gage;
	static int p2_upMonopolized;
	static int p2_downMonopolized;
	static int p2_leftMonopolized;
	static int p2_rightMonopolized;
	static int p2_moved;			//moved ������ ��� ������ �ٷ� ����� �޼��尡 ���� ���� �ʰ� , �ѹ��� �̻� ������ �� ���� �ɼ� �ֵ��� �����ص�


	int p2_moving;
	int p2_past;
	int p2_result;


	// p2 ����

	// dice Ŭ���� ������ ��üȭ ���Ѽ� player Ŭ������ ��ħ
	Scanner scan = new Scanner(System.in);
	Random r1 = new Random();
	Random r2 = new Random();

	static boolean superDiceStart;
	static boolean superDiceResult;

	static boolean useDice;
	static boolean useNumber;

	int run;
	static int dice1;
	static int dice2;

	public void moving1() {// �ֻ����� ���� �ΰ��� �ֻ����� ���� ���ؼ� ����ŭ �̵��Ѵ�.

		int xx;
		Playboard board = new Playboard();
		PlayboardLog playboardLog = new PlayboardLog();
		String a;

		if(useDice) {

			if(SuperDiceTime.player1Gage>=10){//�ֻ����� ������ ���� �̵��ϴ� �� ��ŭ �������� �ö󰣴�. �������� 50�̻��� �� ���Ŀ� �ڱ��� ���� �Ǹ� �� �޼ҵ尡 ����Ǿ� �̴ϰ����� ���ؼ� �ڱ��� �ֻ��� ���� ���� �� �ִ�.
				superDiceStart=true;
				PlayboardLog.p1_rollingDice=false;

				board.playboard();




				SuperDiceNumber superDiceNumber =new SuperDiceNumber();
				SuperDiceTime superDiceTime =new SuperDiceTime();
				Thread thread_number =new Thread(superDiceNumber);
				Thread thread_time =new Thread(superDiceTime);

				thread_time.start();
				thread_number.start();
				try{
					thread_time.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if(SuperDiceTime.SuperDiceResultOn) {
					dice1=SuperDiceTime.result;
//					SuperDiceTime.player1Gage = SuperDiceTime.player1Gage - 10;
					superDiceResult = true;
					board.playboard();
				}
				return;
			}



			PlayboardLog.p1_moving=true;
			board.playboard();
			xx = scan.nextInt();
			PlayboardLog.p1_rollingDice1 = true;
			//dice1 = xx;
			//dice2 = xx;
			dice1 = r1.nextInt(6) + 1;
			dice2 = r2.nextInt(6) + 1;
			SuperDiceTime.player1Gage = SuperDiceTime.player1Gage+ dice1 + dice2;
		}
		else if(useNumber) {
			if(SuperDiceTime.player1Gage>=10){//�ֻ����� ������ ���� �̵��ϴ� �� ��ŭ �������� �ö󰣴�. �������� 50�̻��� �� ���Ŀ� �ڱ��� ���� �Ǹ� �� �޼ҵ尡 ����Ǿ� �̴ϰ����� ���ؼ� �ڱ��� �ֻ��� ���� ���� �� �ִ�.
				superDiceStart=true;
				PlayboardLog.p1_rollingDice=false;

				board.playboard();



				SuperDiceNumber superDiceNumber =new SuperDiceNumber();
				SuperDiceTime superDiceTime =new SuperDiceTime();
				Thread thread_number =new Thread(superDiceNumber);
				Thread thread_time =new Thread(superDiceTime);

				thread_time.start();
				thread_number.start();
				try{
					thread_time.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}



				if(SuperDiceTime.SuperDiceResultOn) {
					dice1=SuperDiceTime.result;
//					SuperDiceTime.player1Gage = SuperDiceTime.player1Gage - 10;
					superDiceResult = true;
					board.playboard();
				}
				return;
			}




			PlayboardLog.p1_moving=true;
			board.playboard();
			xx = scan.nextInt();
			PlayboardLog.p1_rollingDice1 = true;
			dice1 = xx;
			//dice2 = xx;
			//dice1 = r1.nextInt(6) + 1;
			//dice2 = r2.nextInt(6) + 1;
			SuperDiceTime.player1Gage=SuperDiceTime.player1Gage+dice1 +dice2;
		}



	}// �̵��� �� ��� �ϴ� �޼ҵ� //�ֻ��� ���

	public void moving2() {// �ֻ����� ���� �ΰ��� �ֻ����� ���� ���ؼ� ����ŭ �̵��Ѵ�.

		String a;
		Playboard board = new Playboard();
		PlayboardLog playboardLog = new PlayboardLog();
		if(useDice) {
			if(SuperDiceTime.player2Gage>=10){//�ֻ����� ������ ���� �̵��ϴ� �� ��ŭ �������� �ö󰣴�. �������� 50�̻��� �� ���Ŀ� �ڱ��� ���� �Ǹ� �� �޼ҵ尡 ����Ǿ� �̴ϰ����� ���ؼ� �ڱ��� �ֻ��� ���� ���� �� �ִ�.
				superDiceStart=true;
				PlayboardLog.p2_rollingDice=false;

				board.playboard();


				SuperDiceNumber superDiceNumber =new SuperDiceNumber();
				SuperDiceTime superDiceTime =new SuperDiceTime();
				Thread thread_number =new Thread(superDiceNumber);
				Thread thread_time =new Thread(superDiceTime);

				thread_time.start();
				thread_number.start();
				try{
					thread_time.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(SuperDiceTime.SuperDiceResultOn) {
					dice1=SuperDiceTime.result;
//					SuperDiceTime.player1Gage = SuperDiceTime.player1Gage - 10;
					superDiceResult = true;
					board.playboard();
				}
				return;
			}


			PlayboardLog.p2_moving=true;
			board.playboard();
			run = scan.nextInt();
			PlayboardLog.p2_rollingDice1 = true;
			//dice1 = run;
			//dice2 = run;
			dice1 = r1.nextInt(6) + 1;
			dice2 = r2.nextInt(6) + 1;
			SuperDiceTime.player2Gage = SuperDiceTime.player2Gage + dice1 + dice2;
		}
		else if(useNumber){

			if(SuperDiceTime.player2Gage>=10){//�ֻ����� ������ ���� �̵��ϴ� �� ��ŭ �������� �ö󰣴�. �������� 50�̻��� �� ���Ŀ� �ڱ��� ���� �Ǹ� �� �޼ҵ尡 ����Ǿ� �̴ϰ����� ���ؼ� �ڱ��� �ֻ��� ���� ���� �� �ִ�.
				superDiceStart=true;
				PlayboardLog.p2_rollingDice=false;

				board.playboard();


				SuperDiceNumber superDiceNumber =new SuperDiceNumber();
				SuperDiceTime superDiceTime =new SuperDiceTime();
				Thread thread_number =new Thread(superDiceNumber);
				Thread thread_time =new Thread(superDiceTime);

				thread_time.start();
				thread_number.start();
				try{
					thread_time.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(SuperDiceTime.SuperDiceResultOn) {
					dice1=SuperDiceTime.result;
//					SuperDiceTime.player1Gage = SuperDiceTime.player1Gage - 10;
					superDiceResult = true;
					board.playboard();
				}
				return;
			}

			PlayboardLog.p2_moving=true;
			board.playboard();
			run = scan.nextInt();
			PlayboardLog.p2_rollingDice1 = true;
			dice1 = run;
			//dice2 = run;
			//dice1 = r1.nextInt(6) + 1;
			//dice2 = r2.nextInt(6) + 1;
			SuperDiceTime.player2Gage = SuperDiceTime.player2Gage +dice1 + dice2;
		}

	}// �̵��Ҷ� ����ϴ� �޼ҵ�  //�ֻ��� ���





	public void beforeStart() {

		p1_index = 0;
		p2_index = 0;
		// �÷��̾� ��ġ
		p1_cash = 1000;
		p2_cash = 1000;
		// �÷��̾ ������ �ִ� ������ �� ( �� )

		p1_moved = 0;
		p2_moved = 0;

		p1_locked = 0;
		p1_balloonLock=0;
		p1_upMonopolized=0;
		p1_downMonopolized=0;
		p1_leftMonopolized=0;
		p1_rightMonopolized=0;

		p2_locked = 0;		// ���ε� ���� Ż���ߴ��� ���ߴ����� ���� ����
		p2_balloonLock=0;
		p2_upMonopolized=0;
		p2_downMonopolized=0;
		p2_leftMonopolized=0;
		p2_rightMonopolized=0;

		dice1 = 0;
		dice2 = 0;




		Start.playerNone = "������~������~����";
		// ��������� ����
	}
	// ������ �ʱ�ȭ

	public void player1_index() {

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
		Swiss swi = new Swiss();
		Italy ita = new Italy();
		Balloon ball = new Balloon();
		TimeThread TT = new TimeThread();

		String[] player1_index = { pla_player1.player1, pla_player1.blank, pla_player1.blank, pla_player1.blank,
				pla_player1.blank, pla_player1.blank, pla_player1.blank, pla_player1.blank, pla_player1.blank,
				pla_player1.blank, pla_player1.blank, pla_player1.blank, pla_player1.blank, pla_player1.blank,
				pla_player1.blank, pla_player1.blank, pla_player1.blank, pla_player1.blank, };
		String[] player1_countryIndex = {Start.name, Korea.name, Japan.name, China.name, Island.name, England.name, France.name,
                Germany.name, Russia.name, Taxx2.name, USA.name, Canada.name, Mexico.name, ball.name, Italy.name, Swiss.name, Vietnam.name,
                Egypt.name};
		// �޼ҵ� �Է��� �ʿ��� ������

		// �ֻ��� ������ �޼ҵ�//�ֻ��� ������ �޼ҵ�//�ֻ��� ������ �޼ҵ�//�ֻ��� ������ �޼ҵ�//�ֻ��� ������ �޼ҵ�

		if(TurnOver.p1_turnOver){
			return;
		}//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.


		if (p1_index == 4 && p1_locked == 1) {

			isl.lockedIsland_p1();

			return;
//			dice1=0;
//			dice2=0;

		} // p1_index==4&&p1_locked==1

		else if(p1_index == 13 && p1_balloonLock==1){


			dice1 = 0;
			dice2 = 0;
			ball.p1_TravelWhereYouWantToGo();
			return;
		}
		else if(p1_index == 1 && Korea.p1_koreanLock==1 && TimeThread.Season.equals(TT.Winter)){

			kor.festivalIntKorea();
			dice1=0;
			dice2=0;
			return;
		}

		else if(p1_index ==0 && p1_moved==1){
			start.upgrade_p1();
			return;
		}
		else {
			PlayboardLog.p1_rollingDice=true;
			moving1();
			p1_moved = 1;
		} // p1_index!=4&&p1_locked==0

		p1_moving = dice1 + dice2;
		//p1_moving = dice1;
		// �ֻ��� ������ �޼ҵ� //�ֻ��� ������ �޼ҵ� //�ֻ��� ������ �޼ҵ� //�ֻ��� ������ �޼ҵ�

		// �� �ֻ��� ���� �ʱ�ȭ �Ǵ°ɱ�??????????????????????

		// ���⼭ ������ �ϴ� 2������ ������ ����. �÷��̾��� ��ġ + �����̴� ���ڰ� player_index�� length���� �涧, ª����
		// �������� ������ ����.

		if ((p1_index + (dice1 + dice2)) > player1_index.length) {

			p1_index = (p1_index + (dice1 + dice2)) - player1_index.length;
			// �̵��ؼ� �÷��̾� ��ǥ ���� ��ü ���� ���� �� ��� ���� ��ü ������ 18�� ���༭ ��ǥ ���� ����

		} // �ֻ��� ���� ���ڿ� ��ǥ ���� ���� > player1_index �϶�

		else if ((p1_index + (dice1 + dice2)) < player1_index.length) {

			p1_index = (p1_index + (dice1 + dice2));
			// �̵��� �÷��̾� ��ǥ ���� ��ü ���� ���� ª�� ��� �״�� ��ǥ ���� �̿� �Ѵ�.

		} // �ֻ��� ���� ���ڿ� ��ǥ ���� ���� > player1_index �϶�

		else if(p1_index+dice1+dice2 == player1_index.length){
			p1_index = 0;
		}//�̵��� ��ǥ ���� �迭�� ���̿� ���� ������


		// ���� �������� �迭�� ���� �ؾ���.
		// �����ǰ� �迭�� ���� ��Ű�� �ֻ����� ������ ����ŭ ������ ���� ��ǥ������ ������� ���ο� ��ǥ�� �̵��ؾ� ��.
		// ex ) ������� ��ǥ�� ���� ��ĭ���� ó���ϰ� �̵��� ����ŭ�� ��ǥ ���� �÷��̾� ���� �Է�

		// 1p�� �̵��� ���� ���ǹ�

		if (p1_index == 0) {
			if (Start.playerNone.equals(start.playerBlank)) {
				start.player1();

			} // 1p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ������

			else if (Start.playerNone.equals(start.player2)) {
				start.player2_1();
			} // 1p�� �̵� �Ϸ��� �ڸ��� 2p�� ��ġ �ϰ� ���� ��




		} // p1_index == 0 //�����

		else if (p1_index == 1) {

			Korea.p1_koreanLock =1;

			if (Korea.playerNone.equals(kor.playerBlank)) {
				kor.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Korea.playerNone.equals(kor.player2)) {
				kor.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index ==1 //�ѱ�

		else if (p1_index == 2) {
			if (Japan.playerNone.equals(jap.playerBlank)) {
				jap.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Japan.playerNone.equals(jap.player2)) {
				jap.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index == 2 //�Ϻ�

		else if (p1_index == 3) {

			if (China.playerNone.equals(chi.playerBlank)) {
				chi.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������

			else if (China.playerNone.equals(chi.player2)) {
				chi.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������

		} // p1_index == 3 //�߱�

		// p1_���ε� �޼ҵ� ���� ������ġ

		else if (p1_index == 4) {

			p1_locked=1;

			if (Island.playerNone.equals(isl.playerBlank)) {
					isl.player1();
				} // 1p�� �̵� �Ϸ��� �ڸ��� �ƹ��� ���� ��

			else if (Island.playerNone.equals(isl.player2)) {
					isl.player2_1();
				} // 1p�� �̵� �Ϸ��� �ڸ��� 2p�� ��ġ�ϰ� ���� ��


		} // p1_index == 4 //���ε�

		else if (p1_index == 5) {
			if (England.playerNone.equals(eng.playerBlank)) {
				eng.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (England.playerNone.equals(eng.player2)) {
				eng.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index == 5 //����

		else if (p1_index == 6) {
			if (France.playerNone.equals(fra.playerBlank)) {
				fra.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (France.playerNone.equals(fra.player2)) {
				fra.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index == 6 //������

		else if (p1_index == 7) {
			if (Germany.playerNone.equals(ger.playerBlank)) {
				ger.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Germany.playerNone.equals(ger.player2)) {
				ger.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index == 7 //����

		else if (p1_index == 8) {
			if (Russia.playerNone.equals(rus.playerBlank)) {
				rus.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Russia.playerNone.equals(rus.player2)) {
				rus.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index ==8 //���þ�

		else if (p1_index == 9) {
			if (Taxx2.playerNone.equals(tax.playerBlank)) {
				tax.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Taxx2.playerNone.equals(tax.player2)) {
				tax.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
			tax.vistX2();// ����ᰡ 2�谡 �Ǵ� �޼ҵ�
		} // p1_index ==9 //�����x2

		else if (p1_index == 10) {
			if (USA.playerNone.equals(usa.playerBlank)) {
				usa.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (USA.playerNone.equals(usa.player2)) {
				usa.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index ==10 //�̱�

		else if (p1_index == 11) {
			if (Canada.playerNone.equals(can.playerBlank)) {
				can.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Canada.playerNone.equals(can.player2)) {
				can.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index ==11 //ĳ����

		else if (p1_index == 12) {
			if (Mexico.playerNone.equals(mex.playerBlank)) {
				mex.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Mexico.playerNone.equals(mex.player2)) {
				mex.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index ==12 //�߽���

		else if (p1_index == 13) {
			p1_balloonLock=1;
			if (Balloon.playerNone.equals(ball.playerBlank)) {
				ball.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (ball.playerBlank.equals(ball.player2)) {
				ball.player2_1();

			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������


		} // p1_index ==13 //���ⱸ

		else if (p1_index == 14) {
			if (Italy.playerNone.equals(ita.playerBlank)) {
				ita.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Italy.playerNone.equals(ita.player2)) {
				ita.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index ==14 //��Ż����

		else if (p1_index == 15) {
			if (Swiss.playerNone.equals(swi.playerBlank)) {
				swi.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Swiss.playerNone.equals(swi.player2)) {
				swi.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index ==15 //������

		else if (p1_index == 16) {
			if (Vietnam.playerNone.equals(vie.playerBlank)) {
				vie.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Vietnam.playerNone.equals(vie.player2)) {
				vie.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index ==16 //��Ʈ��

		else if (p1_index == 17) {
			if (Egypt.playerNone.equals(egy.playerBlank)) {
				egy.player1();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Egypt.playerNone.equals(egy.player2)) {
				egy.player2_1();
			} // 1p�� �̵��Ϸ��� �ڸ��� 2p�� ��ġ�ϰ�������
		} // p1_index ==17 //����Ʈ

		// �ֻ����� ������ŭ�� ������ �̵��ϴ� �˰���. //�ֻ����� ������ŭ�� ������ �̵��ϴ� �˰���. //�ֻ����� ������ŭ�� ������ �̵��ϴ�
		// �˰���. //�ֻ����� ������ŭ�� ������ �̵��ϴ� �˰���.
		// �ֻ����� ������ŭ�� ������ �̵��ϴ� �˰���. //�ֻ����� ������ŭ�� ������ �̵��ϴ� �˰���. //�ֻ����� ������ŭ�� ������ �̵��ϴ�
		// �˰���.

		// �ֻ��� ������ ������ �÷��̾� ��ǥ
		// ���� ��ġ�ߴ� �÷��̾� ��ǥ�� ���������� ǥ���� �������.
		// ���� ���� �ߴ� �÷��̾ blank,1p,2p,1p_2P�϶��� ������ �� ǥ���������.
		//

		if(dice1==0 && dice2==0 ){
			if(p1_index!=4) {
				return;
			}
		}//dice1 == 0 && dice2 == 0
		//�ֻ��� ���� �Ѵ� 0�� �Ǹ� �޼ҵ带 ���� �ϰ� ������ �Ѵ�.





		if ((p1_index - (dice1 + dice2)) < 0) {

			p1_past = (p1_index + player1_index.length) - (dice1 + dice2);

		}
		// �÷��̾� ��ǥ�� �ֻ����� ������ �� ��ǥ���� ����Ŭ�� ������ ���� ���� ���
		// ex) p1_index=17 -> (dice1+dice2)=5 -> pi_index=4
		else if ((p1_index - (dice1 + dice2)) > 0) {
			p1_past = (p1_index - (dice1 + dice2));

		}

		// �÷��̾� ��ǥ�� �ֻ����� ������ �� ��ǥ ���� ����Ŭ�� ������ ���� ���� �ƴ� ���
		// ex) p1_index=0 -> (dice1+dice2)1=5 -> p1_index=5


		else if(p1_index-(dice1+dice2)==0){

			p1_past=0;
		}


		if (p1_past == 0) {

			if (Start.playerNone.equals(Start.player1)) {
				start.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Start.playerNone.equals(start.player1_2)) {
				start.player12_2();

			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past == 0 //�����

		else if (p1_past == 1) {

			if (Korea.playerNone.equals(kor.player1)) {
				kor.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���

			else if (Korea.playerNone.equals(Korea.player1_2)) {
				kor.player12_2();

			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past ==1 //�ѱ�

		else if (p1_past == 2) {

			if (Japan.playerNone.equals(jap.player1)) {
				jap.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Japan.playerNone.equals(jap.player1_2)) {
				jap.player12_2();

			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past == 2 //�Ϻ�
		else if (p1_past == 3) {

			if (China.playerNone.equals(chi.player1)) {
				chi.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (China.playerNone.equals(chi.player1_2)) {
				chi.player12_2();

			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past == 3 //�߱�

		else if (p1_past == 4) {

			if (Island.playerNone.equals(isl.player1)) {
				isl.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Island.playerNone.equals(isl.player1_2)) {
				isl.player12_2();

			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���
			isl.lockedIsland_p1();
		} // p1_past == 4 //���ε�
		else if (p1_past == 5) {

			if (England.playerNone.equals(eng.player1)) {
				eng.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (England.playerNone.equals(eng.player1_2)) {
				eng.player12_2();

			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past == 5 //����
		else if (p1_past == 6) {

			if (France.playerNone.equals(fra.player1)) {
				fra.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (France.playerNone.equals(fra.player1_2)) {
				fra.player12_2();

			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past == 6 //������
		else if (p1_past == 7) {

			if (Germany.playerNone.equals(ger.player1)) {
				ger.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Germany.playerNone.equals(ger.player1_2)) {
				ger.player12_2();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past == 7 //����
		else if (p1_past == 8) {

			if (Russia.playerNone.equals(rus.player1)) {
				rus.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Russia.playerNone.equals(rus.player1_2)) {
				rus.player12_2();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past ==8 //���þ�
		else if (p1_past == 9) {

			if (Taxx2.playerNone.equals(tax.player1)) {
				tax.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Taxx2.playerNone.equals(tax.player1_2)) {
				tax.player12_2();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past ==9 //�����x2

		else if (p1_past == 10) {

			if (USA.playerNone.equals(usa.player1)) {
				usa.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (USA.playerNone.equals(usa.player1_2)) {
				usa.player12_2();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past ==10 //�̱�
		else if (p1_past == 11) {

			if (Canada.playerNone.equals(can.player1)) {
				can.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Canada.playerNone.equals(can.player1_2)) {
				can.player12_2();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past ==11 //ĳ����
		else if (p1_past == 12) {

			if (Mexico.playerNone.equals(mex.player1)) {
				mex.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Mexico.playerNone.equals(mex.player1))
			// playerNone==" ��~ ��~ "
			{
				mex.player12_2();
			}
			// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past ==12 //�߽���
		else if (p1_past == 13) {

			if (Balloon.playerNone.equals(ball.player1)) {
				ball.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Balloon.playerNone.equals(ball.player1_2)) {
				ball.player12_2();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past ==13 //���ⱸ
		else if (p1_past == 14) {

			if (Italy.playerNone.equals(ita.player1)) {
				ita.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Italy.playerNone.equals(ita.player1_2)) {
				ita.player12_2();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past ==14 //��Ż����
		else if (p1_past == 15) {

			if (Swiss.playerNone.equals(swi.player1)) {
				swi.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Swiss.playerNone.equals(swi.player1_2)) {
				swi.player12_2();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past ==15 //������
		else if (p1_past == 16) {

			if (Vietnam.playerNone.equals(vie.player1)) {
				vie.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Vietnam.playerNone.equals(vie.player1_2)) {
				vie.player12_2();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past ==16 //��Ʈ��
		else if (p1_past == 17) {

			if (Egypt.playerNone.equals(egy.player1)) {
				egy.player1_None();

			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 1p�� ��ġ���� ���
			else if (Egypt.playerNone.equals(egy.player1_2)) {
				egy.player12_2();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p1_past ==17 //����Ʈ

	}// player1_index
		// player1_index //player1_index //player1_index //player1_index //player1_index
		// //player1_index //player1_index //player1_index
		// player1_index //player1_index //player1_index //player1_index //player1_index
		// //player1_index //player1_index //player1_index

	public void player2_index() {

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
		TimeThread TT = new TimeThread();

		String[] player2_index = { pla_player2.player2, pla_player2.blank, pla_player2.blank, pla_player2.blank,
				pla_player2.blank, pla_player2.blank, pla_player2.blank, pla_player2.blank, pla_player2.blank,
				pla_player2.blank, pla_player2.blank, pla_player2.blank, pla_player2.blank, pla_player2.blank,
				pla_player2.blank, pla_player2.blank, pla_player2.blank, pla_player2.blank, };
		String[] player2_countryIndex = {Start.name, Korea.name, Japan.name, China.name, Island.name, England.name, France.name,
                Germany.name, Russia.name, Taxx2.name, USA.name, Canada.name, Mexico.name, ball.name, Italy.name, Swiss.name, Vietnam.name,
                Egypt.name};

		if(TurnOver.p2_turnOver){
			return;
		}//�ð��� ������ ���� �ѱ�� ��ư�� Ȱ��ȭ �ǰ� ���� �Ѱ����� �޼ҵ尡 ����ȴ�.

		// �ֻ��� ������ �޼ҵ�//�ֻ��� ������ �޼ҵ�//�ֻ��� ������ �޼ҵ�//�ֻ��� ������ �޼ҵ�//�ֻ��� ������ �޼ҵ�
		// p2_�ֻ���
		if (p2_index == 4 && p2_locked == 1) {

			isl.lockedIsland_p2();
			return;
//			dice1 = 0;
//			dice2 = 0;

		} // p1_index==4&&p1_locked==1

		else if (p2_index == 13 && p2_balloonLock == 1
		) {


			dice1 = 0;
			dice2 = 0;
			ball.p2_TravelWhereYouWantToGo();
			return;
		}
		else if(p2_index == 4 && Korea.p2_koreanLock==1 && TimeThread.Season.equals(TT.Winter)){

			kor.festivalIntKorea();
			dice1=0;
			dice2=0;
			return;
		}
		else if(p2_index ==0 && p2_moved==1){
			start.upgrade_p2();
			return;
		}
		else if(p2_index == 1 && Korea.p2_koreanLock==1 && TimeThread.Season.equals(TT.Winter)){

			kor.festivalIntKorea();
			dice1=0;
			dice2=0;
			return;
		}
		else {
			PlayboardLog.p2_rollingDice=true;
			moving2();
			p2_moved = 1;
		} // p1_index!=4&&p1_locked==0

		p2_moving = dice1 + dice2;
		//p2_moving=dice1;
		// �ֻ��� ������ �޼ҵ� //�ֻ��� ������ �޼ҵ� //�ֻ��� ������ �޼ҵ� //�ֻ��� ������ �޼ҵ�

		// �� �ֻ��� ���� �ʱ�ȭ �Ǵ°ɱ�??????????????????????

		// ���⼭ ������ �ϴ� 2������ ����������. �÷��̾��� ��ġ + �����̴� ���ڰ� player_index�� length���� �涧, ª����
		// �������� ������ ����.'

		if ((p2_index + (dice1 + dice2)) > player2_index.length) {

			p2_index = (p2_index + (dice1 + dice2)) - player2_index.length;
			// �̵��ؼ� �÷��̾� ��ǥ���� ��ü ���̺��� �� ��� ���� ��ü ������ 18�� ���༭ ��ǥ���� ����

		} // �ֻ��� ���� ���ڿ� ��ǥ ���� ���� > player2_index �϶�

		else if ((p2_index + (dice1 + dice2)) < player2_index.length) {

			p2_index = (p2_index + (dice1 + dice2));
			// �̵��� �÷��̾� ��ǥ���� ��ü ���̺��� ª�� ��� �״�� ��ǥ���� �̿��Ѵ�.


		} // �ֻ��� ���� ���ڿ� ��ǥ ���� ���� > player2_index �϶�

		else if(p2_index+(dice1+dice2) == player2_index.length){
			p2_index =0;
		}

		// ���� �������� �迭�� ���� �ؾ���.
		// �����ǰ� �迭�� ���� ��Ű�� �ֻ����� ������ ����ŭ ������ ���� ��ǥ������ ������� ���ο� ��ǥ�� �̵��ؾ� ��.
		// ex ) ������� ��ǥ�� ���� ��ĭ���� ó���ϰ� �̵��� ����ŭ�� ��ǥ ���� �÷��̾� ���� �Է�

		// 2p�� �̵� �Ҷ��� ���ǹ�

		if (p2_index == 0) {
			if (Start.playerNone.equals(start.playerBlank)) {
				start.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Start.playerNone.equals(Start.player1)) {
				start.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������



		} // p2_index == 0 //�����

		else if (p2_index == 1) {
			Korea.p2_koreanLock=1;
			if (Korea.playerNone.equals(kor.playerBlank)) {
				kor.player2();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Korea.playerNone.equals(kor.player1)) {
				kor.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index ==1 //�ѱ�

		else if (p2_index == 2) {
			if (Japan.playerNone.equals(jap.playerBlank)) {
				jap.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Japan.playerNone.equals(pla_player2.player1)) {
				jap.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index == 2 //�Ϻ�

		else if (p2_index == 3) {
			if (China.playerNone.equals(pla_player2.playerBlank)) {
				chi.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (China.playerNone.equals(pla_player2.player1)) {
				chi.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index == 3 //�߱�

		// p2_���ε� ������ġ
		else if (p2_index == 4) {
				p2_locked=1;
			if (Island.playerNone.equals(isl.playerBlank)) {
					isl.player2();
				} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
				
			else if (Island.playerNone.equals(isl.player1)) {
					isl.player1_2();
				} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������

		} // p2_index == 4 //���ε�

		else if (p2_index == 5) {
			if (England.playerNone.equals(pla_player2.playerBlank)) {
				eng.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (England.playerNone.equals(pla_player2.player1)) {
				eng.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index == 5 //����

		else if (p2_index == 6) {
			if (France.playerNone.equals(pla_player2.playerBlank)) {
				fra.player2();
			} // 1p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (France.playerNone.equals(pla_player2.player1)) {
				fra.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index == 6 //������

		else if (p2_index == 7) {
			if (Germany.playerNone.equals(pla_player2.playerBlank)) {
				ger.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Germany.playerNone.equals(pla_player2.player1)) {
				ger.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index == 7 //����

		else if (p2_index == 8) {
			if (Russia.playerNone.equals(pla_player2.playerBlank)) {
				rus.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Russia.playerNone.equals(pla_player2.player1)) {
				rus.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index ==8 //���þ�

		else if (p2_index == 9) {
			if (Taxx2.playerNone.equals(pla_player2.playerBlank)) {
				tax.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Taxx2.playerNone.equals(pla_player2.player1)) {
				tax.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
			tax.vistX2();// ����� 2�谡 �Ǵ� �޼ҵ�
		} // p2_index ==9 //�����x2

		else if (p2_index == 10) {
			if (USA.playerNone.equals(pla_player2.playerBlank)) {
				usa.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (USA.playerNone.equals(pla_player2.player1)) {
				usa.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index ==10 //�̱�

		else if (p2_index == 11) {
			if (Canada.playerNone.equals(pla_player2.playerBlank)) {
				can.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Canada.playerNone.equals(pla_player2.player1)) {
				can.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index ==11 //ĳ����

		else if (p2_index == 12) {
			if (Mexico.playerNone.equals(pla_player2.playerBlank)) {
				mex.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Mexico.playerNone.equals(pla_player2.player1)) {
				mex.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index ==12 //�߽���

		else if (p2_index == 13) {
			p2_balloonLock=1;
			if (Balloon.playerNone.equals(pla_player2.playerBlank)) {
				ball.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Balloon.playerNone.equals(pla_player2.player1)) {
				ball.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������

		} // p2_index ==13 //���ⱸ

		else if (p2_index == 14) {
			if (Italy.playerNone.equals(pla_player2.playerBlank)) {
				ita.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Italy.playerNone.equals(pla_player2.player1)) {
				ita.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index ==14 //��Ż����

		else if (p2_index == 15) {
			if (Swiss.playerNone.equals(pla_player2.playerBlank)) {
				swi.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Swiss.playerNone.equals(pla_player2.player1)) {
				swi.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index ==15 //������

		else if (p2_index == 16) {
			if (Vietnam.playerNone.equals(pla_player2.playerBlank)) {
				vie.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Vietnam.playerNone.equals(pla_player2.player1)) {
				vie.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index ==16 //��Ʈ��

		else if (p2_index == 17) {
			if (Egypt.playerNone.equals(pla_player2.playerBlank)) {
				egy.player2();
			} // 2p�� �̵��Ϸ��� �ڸ��� �ƹ��� ������
			else if (Egypt.playerNone.equals(pla_player2.player1)) {
				egy.player1_2();
			} // 2p�� �̵��Ϸ��� �ڸ��� 1p�� ��ġ�ϰ�������
		} // p2_index ==17 //����Ʈ

		// �ֻ����� ������ŭ�� ������ �̵��ϴ� �˰���. //�ֻ����� ������ŭ�� ������ �̵��ϴ� �˰���. //�ֻ����� ������ŭ�� ������ �̵��ϴ�
		// �˰���. //�ֻ����� ������ŭ�� ������ �̵��ϴ� �˰���.
		// �ֻ����� ������ŭ�� ������ �̵��ϴ� �˰���. //�ֻ����� ������ŭ�� ������ �̵��ϴ� �˰���. //�ֻ����� ������ŭ�� ������ �̵��ϴ�
		// �˰���.

		if(dice1 == 0 && dice2 == 0){
			if(p2_index!=4) {
				return;
			}
		}
		//�ֻ���1,2�� ���� 0 �̵Ǹ� ��ǥ�� �Դ����� ������ �̹� �������� �޼ҵ带 �����Ѵ�.

		// �ֻ��� ������ ������ �÷��̾� ��ǥ
		// ���� ��ġ�ߴ� �÷��̾� ��ǥ�� ���������� ǥ���� �������.
		// ���� ���� �ߴ� �÷��̾ blank,1p,2p,1p_2P�϶��� ������ �� ǥ���������.
		//

		if ((p2_index - (dice1 + dice2)) < 0) {

			p2_past = (p2_index + player2_index.length) - (dice1 + dice2);

		}
		// �÷��̾� ��ǥ�� �ֻ����� ������ �� ��ǥ���� ����Ŭ�� ������ ���� ���� ���
		// ex) p2_index=17 -> (dice1+dice2)=5 -> p2_index=4
		else if ((p2_index - (dice1 + dice2)) > 0) {
			p2_past = (p2_index - (dice1 + dice2));

		}


		// �÷��̾� ��ǥ�� �ֻ����� ������ �� ��ǥ���� ����Ŭ�� ������ ���� ���� �ƴ� ���
		// ex) p2_index=0 -> (dice1+dice2)1=5 -> p2_index=5

		else if(p2_index -(dice1+dice2)==0){
			p2_past=0;
		}
		if (p2_past == 0) {
			if (Start.playerNone.equals(pla_player2.player2)) {
				start.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Start.playerNone.equals(pla_player2.player1_2)) {
				start.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past == 0 //�����
		else if (p2_past == 1) {
			if (Korea.playerNone.equals(pla_player2.player2)) {
				kor.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���

			else if (Korea.playerNone.equals(pla_player2.player1_2)) {
				kor.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past ==1 //�ѱ�

		else if (p2_past == 2) {
			if (Japan.playerNone.equals(pla_player2.player2)) {
				jap.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Japan.playerNone.equals(pla_player2.player1_2)) {
				jap.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past == 2 //�Ϻ�

		else if (p2_past == 3) {
			if (China.playerNone.equals(pla_player2.player2)) {
				chi.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (China.playerNone.equals(pla_player2.player1_2)) {
				chi.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past == 3 //�߱�

		else if (p2_past == 4) {
			if (Island.playerNone.equals(pla_player2.player2)) {
				isl.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Island.playerNone.equals(pla_player2.player1_2)) {
				isl.player12_1();
			} // playerNone==" ��~ ��~ "



			// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past == 4 //���ε�

		else if (p2_past == 5) {
			if (England.playerNone.equals(pla_player2.player2)) {
				eng.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (England.playerNone.equals(pla_player2.player1_2)) {
				eng.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past == 5 //����

		else if (p2_past == 6) {
			if (France.playerNone.equals(pla_player2.player2)) {
				fra.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (France.playerNone.equals(pla_player2.player1_2)) {
				fra.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past == 6 //������

		else if (p2_past == 7) {
			if (Germany.playerNone.equals(pla_player2.player2)) {
				ger.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Germany.playerNone.equals(pla_player2.player1_2)) {
				ger.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past == 7 //����

		else if (p2_past == 8) {
			if (Russia.playerNone.equals(pla_player2.player2)) {
				rus.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Russia.playerNone.equals(pla_player2.player1_2)) {
				rus.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past ==8 //���þ�

		else if (p2_past == 9) {
			if (Taxx2.playerNone.equals(pla_player2.player2)) {
				tax.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Taxx2.playerNone.equals(pla_player2.player1_2)) {
				tax.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past ==9 //�����x2

		else if (p2_past == 10) {
			if (USA.playerNone.equals(pla_player2.player2)) {
				usa.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (USA.playerNone.equals(pla_player2.player1_2)) {
				usa.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past ==10 //�̱�

		else if (p2_past == 11) {
			if (Canada.playerNone.equals(pla_player2.player2)) {
				can.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Canada.playerNone.equals(pla_player2.player1_2)) {
				can.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past ==11 //ĳ����

		else if (p2_past == 12) {
			if (Mexico.playerNone.equals(pla_player2.player2)) {
				mex.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Mexico.playerNone.equals(pla_player2.player1_2)) {
				mex.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past ==12 //�߽���
		else if (p2_past == 13) {
			if (Balloon.playerNone.equals(pla_player2.player2)) {
				ball.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Balloon.playerNone.equals(pla_player2.player1_2)) {
				ball.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past ==13 //���ⱸ
		else if (p2_past == 14) {
			if (Italy.playerNone.equals(pla_player2.player2)) {
				ita.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Italy.playerNone.equals(pla_player2.player1_2)) {
				ita.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past ==14 //��Ż����

		else if (p2_past == 15) {
			if (Swiss.playerNone.equals(pla_player2.player2)) {
				swi.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Swiss.playerNone.equals(pla_player2.player1_2)) {
				swi.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past ==15 //������

		else if (p2_past == 16) {
			if (Vietnam.playerNone.equals(pla_player2.player2)) {
				vie.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Vietnam.playerNone.equals(pla_player2.player1_2)) {
				vie.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past ==16 //��Ʈ��

		else if (p2_past == 17) {
			if (Egypt.playerNone.equals(pla_player2.player2)) {
				egy.player2_None();
			} // playerNone==" ��~ "
				// �÷��̾� ��ǥ�� 2p�� ��ġ���� ���
			else if (Egypt.playerNone.equals(pla_player2.player1_2)) {
				egy.player12_1();
			} // playerNone==" ��~ ��~ "
				// �÷��̾� ��ǥ�� 1p 2p �Ѵ� ��ġ�ߴ� ���

		} // p2_past ==17 //����Ʈ

	}// player2_index

	public void ending_turn() {

		p1_result = (p1_mountOfBuilding * 1) + (p1_mountOfLandmark * 2) + p1_cash;
		p2_result = (p2_mountOfBuilding * 1) + (p2_mountOfLandmark * 2) + p1_cash;

		if (p1_result > p2_result) {

			System.out.println("�÷��̾� 1�� ���� ���� : "+p1_mountOfBuilding+"   ���帶ũ ���� : "+p1_mountOfLandmark+" ������ ���� : "+p1_cash);
			System.out.println("�÷��̾� 2�� ���� ���� : "+p2_mountOfBuilding+"   ���帶ũ ���� : "+p2_mountOfLandmark+" ������ ���� : "+p1_cash);
			System.out.println("�÷��̾� 1�� ���� : "+p1_result);
			System.out.println("�÷��̾� 2�� ���� : "+p2_result);
			System.out.println("�÷��̾� 1�� �¸��߽��ϴ�!");
			System.exit(0);
		} // p1 �¸�
		else if (p1_result < p2_result) {
			System.out.println("�÷��̾� 1�� ���� ���� : "+p1_mountOfBuilding+"   ���帶ũ ���� : "+p1_mountOfLandmark+" ������ ���� : "+p1_cash);
			System.out.println("�÷��̾� 2�� ���� ���� : "+p2_mountOfBuilding+"   ���帶ũ ���� : "+p2_mountOfLandmark+" ������ ���� : "+p1_cash);
			System.out.println("�÷��̾� 1�� ���� : "+p1_result);
			System.out.println("�÷��̾� 2�� ���� : "+p2_result);
			System.out.println("�÷��̾� 2�� �¸��߽��ϴ�!");
			System.exit(0);
		} // p2 �¸�

	}// turn ending

	public void ending(){
		Playboard pb = new Playboard();


		if(p1_cash<=0){
			p1_cash=0;
			pb.playboard();
			System.out.println("p1�� ������ ��� �����Ǿ� �й��߽��ϴ�.");
			System.out.println("�ڡڡڡڡ�p2���� �¸��� ���� �մϴ١ڡڡڡڡ�");

			System.exit(0);

		}

		else if(p2_cash<=0){
			p2_cash=0;
			pb.playboard();
			System.out.println("p2�� ������ ��� �����Ǿ� �й��߽��ϴ�.");
			System.out.println("�١١١١�p1���� �¸��� ���� �մϴ١١١١١�");

			System.exit(0);

		}
	}


}// class
