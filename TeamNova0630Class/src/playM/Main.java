package playM;

import java.sql.Time;
import java.util.Random;
import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		Germany ger = new Germany();
		Playboard playb = new Playboard();
		Player player = new Player();
		Countries country = new Countries();
		TimeThread TT = new TimeThread();
		Thread t1 = new Thread(TT);
		China chi = new China();
		England eng = new England();
		Italy ita = new Italy();
		Mexico mex = new Mexico();
		Russia rus = new Russia();
		Swiss swi = new Swiss();
		USA usa = new USA();
		TimeThreadView TTV = new TimeThreadView();
		Thread t2 =new Thread(TTV);
		IncreasingCost increasingCost =new IncreasingCost();
		Thread t3 =new Thread(increasingCost);
		TurnOver turnover =new TurnOver();
		Thread turnOverThread =new Thread(turnover);




		PlayboardLog playboardLog = new PlayboardLog();
		int turn;

		String p2;
		String p1;
		Scanner scan =new Scanner(System.in);

		playb.op();

		System.out.println("�̵� ��� ����");
		System.out.println("1.�ֻ����� �̿��ؼ� �̵�");
		System.out.println("2.���ڸ� �Է��ؼ� �̵�");
		int choice=scan.nextInt();
		if(choice==1){
			Player.useDice=true;
			Player.useNumber=false;
		}
		else if(choice==2){
			Player.useDice=false;
			Player.useNumber=true;
		}

		player.beforeStart();
		t1.start();
		t3.start();

		for (turn = 0; turn < 10; turn++) {
			System.out.println("(" + (turn + 1) + "��° ��)");

			PlayboardLog.p1_turn =true;//�÷��̾� 1�� ���� ���� �Ǵ� ���� �˷��� �α� â�� �ȳ� ���� ���� ���� �޼ҵ带 ���� �ǰ� ��.

//			turnOverThread.start();

			player.player1_index();
			playb.playboard();

			country.p1_buyMapReturned();
			playb.playboard();
			country.p1_buyMap();
			playb.playboard();
			country.p1_dontTakeMyMoney();
			playb.playboard();
			country.p1_willTakeYourMap();
			playb.playboard();

			chi.p1_festivalInChina();
			playb.playboard();
			eng.p1_ContractCanada();
			playb.playboard();
			ger.p1_helpPlayer();
			playb.playboard();
			ita.p1_festivalInItaly();
			playb.playboard();
			mex.p1_festivalInMexico();
			playb.playboard();
			rus.p1_festivalRussia();
			playb.playboard();
			swi.p1_festivalInSwiss();
			playb.playboard();
			usa.p1_tradeWar();
			playb.playboard();

//			country.p1_monopolizedDownsideLine();
//			playb.playboard();
//			country.p1_monopolizedLeftLine();
//			playb.playboard();
//			country.p1_monopolizedRightLine();
//			playb.playboard();
//			country.p1_monopolizedUpsidetLine();
//			playb.playboard();


			playb.playboard();
			player.ending();

			PlayboardLog.p1_false();


			System.out.println("�ƹ� Ű�� ������ ���� ���� �˴ϴ�.");
			p1=scan.nextLine();


			System.out.println("(" + (turn + 1) + "��° ��)");
			PlayboardLog.p2_turn =true; //�÷��̾�2�� ���� ����

//			turnOverThread.start();

			player.player2_index();
			playb.playboard();
			country.p2_buyMapReturned();
			playb.playboard();
			country.p2_buyMap();
			playb.playboard();
			country.p2_dontTakeMyMoney();
			playb.playboard();
			country.p2_willTakeYourMap();
			playb.playboard();

			chi.p2_festivalInChina();
			playb.playboard();
			eng.p2_ContractCanada();
			playb.playboard();
			ger.p2_helpPlayer();
			playb.playboard();
			ita.p2_festivalInItaly();
			playb.playboard();
			mex.p2_festivalInMexico();
			playb.playboard();
			rus.p2_festivalRussia();
			playb.playboard();
			swi.p2_festivalInSwiss();
			playb.playboard();
			usa.p2_tradeWar();
			playb.playboard();

//			country.p2_monopolizedDownsideLine();
//			playb.playboard();
//			country.p2_monopolizedLeftLine();
//			playb.playboard();
//			country.p2_monopolizedRightLine();
//			playb.playboard();
//			country.p2_monopolizedUpsidetLine();
//			playb.playboard();


			player.ending();

			PlayboardLog.p2_false();




			System.out.println("�ƹ� Ű�� ������ ���� ���� �˴ϴ�.");
			p2=scan.nextLine();
		}

		System.out.println("10���� ��� �Ҹ��Ͽ� ���� ���� ����");
		// ������ 10���� ����.
		player.ending_turn();

	}// main

}// class
