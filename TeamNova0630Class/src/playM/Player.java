package playM;

import java.util.Random;
import java.util.Scanner;

public class Player {

	// 플레이어 클래스에서 더 표현할 수 있는 변수와 함수는 뭐가 더 있을까
	// 돈, 이동값, 현재 보유 하고 있는 맵, 보유 하고 있는 랜드마크, 보유 하고 있는 빌딩,
	// 인터페이스를 더 잘 표현할 수 있게 생각 해 보자
	// 게임에 대한 룰을 설명해줘야함
	// 보드 판에 표현을 하지만 여기서 메소드를 만드는 것도 나쁘지 않을듯
	// 게임 정보에 대한 현황 판을 만들 계획

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
	static int p1_moved;   			//moved 변수는 출발 지에서 바로 출발지 메서드가 발현 되지 않고 , 한바퀴 이상 돌았을 때 발현 될수 있도록 설정해둠

	int p1_moving;
	int p1_past;
	int p1_result;




	// p1 변수

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
	static int p2_moved;			//moved 변수는 출발 지에서 바로 출발지 메서드가 발현 되지 않고 , 한바퀴 이상 돌았을 때 발현 될수 있도록 설정해둠


	int p2_moving;
	int p2_past;
	int p2_result;


	// p2 변수

	// dice 클래스 내용을 객체화 시켜서 player 클래스와 합침
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

	public void moving1() {// 주사위를 돌려 두개의 주사위의 값을 더해서 값만큼 이동한다.

		int xx;
		Playboard board = new Playboard();
		PlayboardLog playboardLog = new PlayboardLog();
		String a;

		if(useDice) {

			if(SuperDiceTime.player1Gage>=10){//주사위를 굴릴때 마다 이동하는 값 만큼 게이지가 올라간다. 게이지가 50이상이 된 이후에 자기의 턴이 되면 이 메소드가 실행되어 미니게임을 통해서 자기의 주사위 값을 정할 수 있다.
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
			if(SuperDiceTime.player1Gage>=10){//주사위를 굴릴때 마다 이동하는 값 만큼 게이지가 올라간다. 게이지가 50이상이 된 이후에 자기의 턴이 되면 이 메소드가 실행되어 미니게임을 통해서 자기의 주사위 값을 정할 수 있다.
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



	}// 이동할 때 사용 하는 메소드 //주사위 사용

	public void moving2() {// 주사위를 돌려 두개의 주사위의 값을 더해서 값만큼 이동한다.

		String a;
		Playboard board = new Playboard();
		PlayboardLog playboardLog = new PlayboardLog();
		if(useDice) {
			if(SuperDiceTime.player2Gage>=10){//주사위를 굴릴때 마다 이동하는 값 만큼 게이지가 올라간다. 게이지가 50이상이 된 이후에 자기의 턴이 되면 이 메소드가 실행되어 미니게임을 통해서 자기의 주사위 값을 정할 수 있다.
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

			if(SuperDiceTime.player2Gage>=10){//주사위를 굴릴때 마다 이동하는 값 만큼 게이지가 올라간다. 게이지가 50이상이 된 이후에 자기의 턴이 되면 이 메소드가 실행되어 미니게임을 통해서 자기의 주사위 값을 정할 수 있다.
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

	}// 이동할때 사용하는 메소드  //주사위 사용





	public void beforeStart() {

		p1_index = 0;
		p2_index = 0;
		// 플레이어 위치
		p1_cash = 1000;
		p2_cash = 1000;
		// 플레이어가 가지고 있는 현금의 수 ( 억 )

		p1_moved = 0;
		p2_moved = 0;

		p1_locked = 0;
		p1_balloonLock=0;
		p1_upMonopolized=0;
		p1_downMonopolized=0;
		p1_leftMonopolized=0;
		p1_rightMonopolized=0;

		p2_locked = 0;		// 무인도 가서 탈출했는지 안했는지에 대한 여부
		p2_balloonLock=0;
		p2_upMonopolized=0;
		p2_downMonopolized=0;
		p2_leftMonopolized=0;
		p2_rightMonopolized=0;

		dice1 = 0;
		dice2 = 0;




		Start.playerNone = "　　☆~　　★~　　";
		// 출발지에서 시작
	}
	// 시작전 초기화

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
		// 메소드 입력전 필요한 정보들

		// 주사위 돌리는 메소드//주사위 돌리는 메소드//주사위 돌리는 메소드//주사위 돌리는 메소드//주사위 돌리는 메소드

		if(TurnOver.p1_turnOver){
			return;
		}//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.


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
		// 주사위 돌리는 메소드 //주사위 돌리는 메소드 //주사위 돌리는 메소드 //주사위 돌리는 메소드

		// 왜 주사위 값이 초기화 되는걸까??????????????????????

		// 여기서 조건이 일단 2가지로 나눌수 있음. 플레이어의 위치 + 움직이는 숫자가 player_index의 length보다 길때, 짧을때
		// 조건으로 나눌수 있음.

		if ((p1_index + (dice1 + dice2)) > player1_index.length) {

			p1_index = (p1_index + (dice1 + dice2)) - player1_index.length;
			// 이동해서 플레이어 좌표 값이 전체 길이 보다 길 경우 값을 전체 길이인 18을 빼줘서 좌표 값을 구함

		} // 주사위 굴린 숫자와 좌표 값의 합이 > player1_index 일때

		else if ((p1_index + (dice1 + dice2)) < player1_index.length) {

			p1_index = (p1_index + (dice1 + dice2));
			// 이동한 플레이어 좌표 값이 전체 길이 보다 짧을 경우 그대로 좌표 값을 이용 한다.

		} // 주사위 굴린 숫자와 좌표 값의 합이 > player1_index 일때

		else if(p1_index+dice1+dice2 == player1_index.length){
			p1_index = 0;
		}//이동할 좌표 값이 배열의 길이와 값이 같을때


		// 이제 보드판의 배열과 연결 해야함.
		// 보드판과 배열을 연결 시키고 주사위를 던지면 값만큼 말들의 원래 좌표에서는 사라지고 새로운 좌표로 이동해야 함.
		// ex ) 출발점의 좌표의 값은 빈칸으로 처리하고 이동한 값만큼의 좌표 값은 플레이어 말을 입력

		// 1p가 이동할 때의 조건문

		if (p1_index == 0) {
			if (Start.playerNone.equals(start.playerBlank)) {
				start.player1();

			} // 1p가 이동 하려는 자리에 아무도 없을때

			else if (Start.playerNone.equals(start.player2)) {
				start.player2_1();
			} // 1p가 이동 하려는 자리에 2p가 위치 하고 있을 때




		} // p1_index == 0 //출발점

		else if (p1_index == 1) {

			Korea.p1_koreanLock =1;

			if (Korea.playerNone.equals(kor.playerBlank)) {
				kor.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Korea.playerNone.equals(kor.player2)) {
				kor.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index ==1 //한국

		else if (p1_index == 2) {
			if (Japan.playerNone.equals(jap.playerBlank)) {
				jap.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Japan.playerNone.equals(jap.player2)) {
				jap.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index == 2 //일본

		else if (p1_index == 3) {

			if (China.playerNone.equals(chi.playerBlank)) {
				chi.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때

			else if (China.playerNone.equals(chi.player2)) {
				chi.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때

		} // p1_index == 3 //중국

		// p1_무인도 메소드 발현 저장위치

		else if (p1_index == 4) {

			p1_locked=1;

			if (Island.playerNone.equals(isl.playerBlank)) {
					isl.player1();
				} // 1p가 이동 하려는 자리에 아무도 없을 때

			else if (Island.playerNone.equals(isl.player2)) {
					isl.player2_1();
				} // 1p가 이동 하려는 자리에 2p가 위치하고 있을 때


		} // p1_index == 4 //무인도

		else if (p1_index == 5) {
			if (England.playerNone.equals(eng.playerBlank)) {
				eng.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (England.playerNone.equals(eng.player2)) {
				eng.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index == 5 //영국

		else if (p1_index == 6) {
			if (France.playerNone.equals(fra.playerBlank)) {
				fra.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (France.playerNone.equals(fra.player2)) {
				fra.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index == 6 //프랑스

		else if (p1_index == 7) {
			if (Germany.playerNone.equals(ger.playerBlank)) {
				ger.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Germany.playerNone.equals(ger.player2)) {
				ger.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index == 7 //독일

		else if (p1_index == 8) {
			if (Russia.playerNone.equals(rus.playerBlank)) {
				rus.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Russia.playerNone.equals(rus.player2)) {
				rus.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index ==8 //러시아

		else if (p1_index == 9) {
			if (Taxx2.playerNone.equals(tax.playerBlank)) {
				tax.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Taxx2.playerNone.equals(tax.player2)) {
				tax.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
			tax.vistX2();// 통행료가 2배가 되는 메소드
		} // p1_index ==9 //통행료x2

		else if (p1_index == 10) {
			if (USA.playerNone.equals(usa.playerBlank)) {
				usa.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (USA.playerNone.equals(usa.player2)) {
				usa.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index ==10 //미국

		else if (p1_index == 11) {
			if (Canada.playerNone.equals(can.playerBlank)) {
				can.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Canada.playerNone.equals(can.player2)) {
				can.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index ==11 //캐나다

		else if (p1_index == 12) {
			if (Mexico.playerNone.equals(mex.playerBlank)) {
				mex.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Mexico.playerNone.equals(mex.player2)) {
				mex.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index ==12 //멕시코

		else if (p1_index == 13) {
			p1_balloonLock=1;
			if (Balloon.playerNone.equals(ball.playerBlank)) {
				ball.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (ball.playerBlank.equals(ball.player2)) {
				ball.player2_1();

			} // 1p가 이동하려는 자리에 2p가 위치하고있을때


		} // p1_index ==13 //열기구

		else if (p1_index == 14) {
			if (Italy.playerNone.equals(ita.playerBlank)) {
				ita.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Italy.playerNone.equals(ita.player2)) {
				ita.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index ==14 //이탈리아

		else if (p1_index == 15) {
			if (Swiss.playerNone.equals(swi.playerBlank)) {
				swi.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Swiss.playerNone.equals(swi.player2)) {
				swi.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index ==15 //스위스

		else if (p1_index == 16) {
			if (Vietnam.playerNone.equals(vie.playerBlank)) {
				vie.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Vietnam.playerNone.equals(vie.player2)) {
				vie.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index ==16 //베트남

		else if (p1_index == 17) {
			if (Egypt.playerNone.equals(egy.playerBlank)) {
				egy.player1();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Egypt.playerNone.equals(egy.player2)) {
				egy.player2_1();
			} // 1p가 이동하려는 자리에 2p가 위치하고있을때
		} // p1_index ==17 //이집트

		// 주사위를 굴린만큼의 값으로 이동하는 알고리즘. //주사위를 굴린만큼의 값으로 이동하는 알고리즘. //주사위를 굴린만큼의 값으로 이동하는
		// 알고리즘. //주사위를 굴린만큼의 값으로 이동하는 알고리즘.
		// 주사위를 굴린만큼의 값으로 이동하는 알고리즘. //주사위를 굴린만큼의 값으로 이동하는 알고리즘. //주사위를 굴린만큼의 값으로 이동하는
		// 알고리즘.

		// 주사위 돌리기 전턴의 플레이어 좌표
		// 전에 위치했던 플레이어 좌표를 떠난것으로 표현을 해줘야함.
		// 전에 존재 했던 플레이어가 blank,1p,2p,1p_2P일때의 조건을 다 표현해줘야함.
		//

		if(dice1==0 && dice2==0 ){
			if(p1_index!=4) {
				return;
			}
		}//dice1 == 0 && dice2 == 0
		//주사위 값이 둘다 0이 되면 메소드를 종료 하게 만들어야 한다.





		if ((p1_index - (dice1 + dice2)) < 0) {

			p1_past = (p1_index + player1_index.length) - (dice1 + dice2);

		}
		// 플레이어 좌표가 주사위를 돌리기 전 좌표값이 사이클을 돌리기 전의 값일 경우
		// ex) p1_index=17 -> (dice1+dice2)=5 -> pi_index=4
		else if ((p1_index - (dice1 + dice2)) > 0) {
			p1_past = (p1_index - (dice1 + dice2));

		}

		// 플레이어 좌표가 주사위를 돌리기 전 좌표 값이 사이클을 돌리기 전의 값이 아닐 경우
		// ex) p1_index=0 -> (dice1+dice2)1=5 -> p1_index=5


		else if(p1_index-(dice1+dice2)==0){

			p1_past=0;
		}


		if (p1_past == 0) {

			if (Start.playerNone.equals(Start.player1)) {
				start.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Start.playerNone.equals(start.player1_2)) {
				start.player12_2();

			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past == 0 //출발점

		else if (p1_past == 1) {

			if (Korea.playerNone.equals(kor.player1)) {
				kor.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우

			else if (Korea.playerNone.equals(Korea.player1_2)) {
				kor.player12_2();

			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past ==1 //한국

		else if (p1_past == 2) {

			if (Japan.playerNone.equals(jap.player1)) {
				jap.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Japan.playerNone.equals(jap.player1_2)) {
				jap.player12_2();

			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past == 2 //일본
		else if (p1_past == 3) {

			if (China.playerNone.equals(chi.player1)) {
				chi.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (China.playerNone.equals(chi.player1_2)) {
				chi.player12_2();

			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past == 3 //중국

		else if (p1_past == 4) {

			if (Island.playerNone.equals(isl.player1)) {
				isl.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Island.playerNone.equals(isl.player1_2)) {
				isl.player12_2();

			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우
			isl.lockedIsland_p1();
		} // p1_past == 4 //무인도
		else if (p1_past == 5) {

			if (England.playerNone.equals(eng.player1)) {
				eng.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (England.playerNone.equals(eng.player1_2)) {
				eng.player12_2();

			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past == 5 //영국
		else if (p1_past == 6) {

			if (France.playerNone.equals(fra.player1)) {
				fra.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (France.playerNone.equals(fra.player1_2)) {
				fra.player12_2();

			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past == 6 //프랑스
		else if (p1_past == 7) {

			if (Germany.playerNone.equals(ger.player1)) {
				ger.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Germany.playerNone.equals(ger.player1_2)) {
				ger.player12_2();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past == 7 //독일
		else if (p1_past == 8) {

			if (Russia.playerNone.equals(rus.player1)) {
				rus.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Russia.playerNone.equals(rus.player1_2)) {
				rus.player12_2();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past ==8 //러시아
		else if (p1_past == 9) {

			if (Taxx2.playerNone.equals(tax.player1)) {
				tax.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Taxx2.playerNone.equals(tax.player1_2)) {
				tax.player12_2();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past ==9 //통행료x2

		else if (p1_past == 10) {

			if (USA.playerNone.equals(usa.player1)) {
				usa.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (USA.playerNone.equals(usa.player1_2)) {
				usa.player12_2();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past ==10 //미국
		else if (p1_past == 11) {

			if (Canada.playerNone.equals(can.player1)) {
				can.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Canada.playerNone.equals(can.player1_2)) {
				can.player12_2();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past ==11 //캐나다
		else if (p1_past == 12) {

			if (Mexico.playerNone.equals(mex.player1)) {
				mex.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Mexico.playerNone.equals(mex.player1))
			// playerNone==" ☆~ ★~ "
			{
				mex.player12_2();
			}
			// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past ==12 //멕시코
		else if (p1_past == 13) {

			if (Balloon.playerNone.equals(ball.player1)) {
				ball.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Balloon.playerNone.equals(ball.player1_2)) {
				ball.player12_2();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past ==13 //열기구
		else if (p1_past == 14) {

			if (Italy.playerNone.equals(ita.player1)) {
				ita.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Italy.playerNone.equals(ita.player1_2)) {
				ita.player12_2();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past ==14 //이탈리아
		else if (p1_past == 15) {

			if (Swiss.playerNone.equals(swi.player1)) {
				swi.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Swiss.playerNone.equals(swi.player1_2)) {
				swi.player12_2();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past ==15 //스위스
		else if (p1_past == 16) {

			if (Vietnam.playerNone.equals(vie.player1)) {
				vie.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Vietnam.playerNone.equals(vie.player1_2)) {
				vie.player12_2();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past ==16 //베트남
		else if (p1_past == 17) {

			if (Egypt.playerNone.equals(egy.player1)) {
				egy.player1_None();

			} // playerNone==" ☆~ "
				// 플레이어 좌표에 1p가 위치했을 경우
			else if (Egypt.playerNone.equals(egy.player1_2)) {
				egy.player12_2();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p1_past ==17 //이집트

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
		}//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.

		// 주사위 돌리는 메소드//주사위 돌리는 메소드//주사위 돌리는 메소드//주사위 돌리는 메소드//주사위 돌리는 메소드
		// p2_주사위
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
		// 주사위 돌리는 메소드 //주사위 돌리는 메소드 //주사위 돌리는 메소드 //주사위 돌리는 메소드

		// 왜 주사위 값이 초기화 되는걸까??????????????????????

		// 여기서 조건이 일단 2가지로 나눌수있음. 플레이어의 위치 + 움직이는 숫자가 player_index의 length보다 길때, 짧을때
		// 조건으로 나눌수 있음.'

		if ((p2_index + (dice1 + dice2)) > player2_index.length) {

			p2_index = (p2_index + (dice1 + dice2)) - player2_index.length;
			// 이동해서 플레이어 좌표값이 전체 길이보다 길 경우 값을 전체 길이인 18을 빼줘서 좌표값을 구함

		} // 주사위 굴린 숫자와 좌표 값의 합이 > player2_index 일때

		else if ((p2_index + (dice1 + dice2)) < player2_index.length) {

			p2_index = (p2_index + (dice1 + dice2));
			// 이동한 플레이어 좌표값이 전체 길이보다 짧을 경우 그대로 좌표값을 이용한다.


		} // 주사위 굴린 숫자와 좌표 값의 합이 > player2_index 일때

		else if(p2_index+(dice1+dice2) == player2_index.length){
			p2_index =0;
		}

		// 이제 보드판의 배열과 연결 해야함.
		// 보드판과 배열을 연결 시키고 주사위를 던지면 값만큼 말들의 원래 좌표에서는 사라지고 새로운 좌표로 이동해야 함.
		// ex ) 출발점의 좌표의 값은 빈칸으로 처리하고 이동한 값만큼의 좌표 값은 플레이어 말을 입력

		// 2p가 이동 할때의 조건문

		if (p2_index == 0) {
			if (Start.playerNone.equals(start.playerBlank)) {
				start.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Start.playerNone.equals(Start.player1)) {
				start.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때



		} // p2_index == 0 //출발점

		else if (p2_index == 1) {
			Korea.p2_koreanLock=1;
			if (Korea.playerNone.equals(kor.playerBlank)) {
				kor.player2();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (Korea.playerNone.equals(kor.player1)) {
				kor.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index ==1 //한국

		else if (p2_index == 2) {
			if (Japan.playerNone.equals(jap.playerBlank)) {
				jap.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Japan.playerNone.equals(pla_player2.player1)) {
				jap.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index == 2 //일본

		else if (p2_index == 3) {
			if (China.playerNone.equals(pla_player2.playerBlank)) {
				chi.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (China.playerNone.equals(pla_player2.player1)) {
				chi.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index == 3 //중국

		// p2_무인도 저장위치
		else if (p2_index == 4) {
				p2_locked=1;
			if (Island.playerNone.equals(isl.playerBlank)) {
					isl.player2();
				} // 2p가 이동하려는 자리에 아무도 없을때
				
			else if (Island.playerNone.equals(isl.player1)) {
					isl.player1_2();
				} // 2p가 이동하려는 자리에 1p가 위치하고있을때

		} // p2_index == 4 //무인도

		else if (p2_index == 5) {
			if (England.playerNone.equals(pla_player2.playerBlank)) {
				eng.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (England.playerNone.equals(pla_player2.player1)) {
				eng.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index == 5 //영국

		else if (p2_index == 6) {
			if (France.playerNone.equals(pla_player2.playerBlank)) {
				fra.player2();
			} // 1p가 이동하려는 자리에 아무도 없을때
			else if (France.playerNone.equals(pla_player2.player1)) {
				fra.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index == 6 //프랑스

		else if (p2_index == 7) {
			if (Germany.playerNone.equals(pla_player2.playerBlank)) {
				ger.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Germany.playerNone.equals(pla_player2.player1)) {
				ger.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index == 7 //독일

		else if (p2_index == 8) {
			if (Russia.playerNone.equals(pla_player2.playerBlank)) {
				rus.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Russia.playerNone.equals(pla_player2.player1)) {
				rus.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index ==8 //러시아

		else if (p2_index == 9) {
			if (Taxx2.playerNone.equals(pla_player2.playerBlank)) {
				tax.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Taxx2.playerNone.equals(pla_player2.player1)) {
				tax.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
			tax.vistX2();// 통행료 2배가 되는 메소드
		} // p2_index ==9 //통행료x2

		else if (p2_index == 10) {
			if (USA.playerNone.equals(pla_player2.playerBlank)) {
				usa.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (USA.playerNone.equals(pla_player2.player1)) {
				usa.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index ==10 //미국

		else if (p2_index == 11) {
			if (Canada.playerNone.equals(pla_player2.playerBlank)) {
				can.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Canada.playerNone.equals(pla_player2.player1)) {
				can.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index ==11 //캐나다

		else if (p2_index == 12) {
			if (Mexico.playerNone.equals(pla_player2.playerBlank)) {
				mex.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Mexico.playerNone.equals(pla_player2.player1)) {
				mex.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index ==12 //멕시코

		else if (p2_index == 13) {
			p2_balloonLock=1;
			if (Balloon.playerNone.equals(pla_player2.playerBlank)) {
				ball.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Balloon.playerNone.equals(pla_player2.player1)) {
				ball.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때

		} // p2_index ==13 //열기구

		else if (p2_index == 14) {
			if (Italy.playerNone.equals(pla_player2.playerBlank)) {
				ita.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Italy.playerNone.equals(pla_player2.player1)) {
				ita.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index ==14 //이탈리아

		else if (p2_index == 15) {
			if (Swiss.playerNone.equals(pla_player2.playerBlank)) {
				swi.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Swiss.playerNone.equals(pla_player2.player1)) {
				swi.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index ==15 //스위스

		else if (p2_index == 16) {
			if (Vietnam.playerNone.equals(pla_player2.playerBlank)) {
				vie.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Vietnam.playerNone.equals(pla_player2.player1)) {
				vie.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index ==16 //베트남

		else if (p2_index == 17) {
			if (Egypt.playerNone.equals(pla_player2.playerBlank)) {
				egy.player2();
			} // 2p가 이동하려는 자리에 아무도 없을때
			else if (Egypt.playerNone.equals(pla_player2.player1)) {
				egy.player1_2();
			} // 2p가 이동하려는 자리에 1p가 위치하고있을때
		} // p2_index ==17 //이집트

		// 주사위를 굴린만큼의 값으로 이동하는 알고리즘. //주사위를 굴린만큼의 값으로 이동하는 알고리즘. //주사위를 굴린만큼의 값으로 이동하는
		// 알고리즘. //주사위를 굴린만큼의 값으로 이동하는 알고리즘.
		// 주사위를 굴린만큼의 값으로 이동하는 알고리즘. //주사위를 굴린만큼의 값으로 이동하는 알고리즘. //주사위를 굴린만큼의 값으로 이동하는
		// 알고리즘.

		if(dice1 == 0 && dice2 == 0){
			if(p2_index!=4) {
				return;
			}
		}
		//주사위1,2의 값이 0 이되면 좌표가 왔던곳의 흔적을 이미 지웠으니 메소드를 종료한다.

		// 주사위 돌리기 전턴의 플레이어 좌표
		// 전에 위치했던 플레이어 좌표를 떠난것으로 표현을 해줘야함.
		// 전에 존재 했던 플레이어가 blank,1p,2p,1p_2P일때의 조건을 다 표현해줘야함.
		//

		if ((p2_index - (dice1 + dice2)) < 0) {

			p2_past = (p2_index + player2_index.length) - (dice1 + dice2);

		}
		// 플레이어 좌표가 주사위를 돌리기 전 좌표값이 사이클을 돌리기 전의 값일 경우
		// ex) p2_index=17 -> (dice1+dice2)=5 -> p2_index=4
		else if ((p2_index - (dice1 + dice2)) > 0) {
			p2_past = (p2_index - (dice1 + dice2));

		}


		// 플레이어 좌표가 주사위를 돌리기 전 좌표값이 사이클을 돌리기 전의 값이 아닐 경우
		// ex) p2_index=0 -> (dice1+dice2)1=5 -> p2_index=5

		else if(p2_index -(dice1+dice2)==0){
			p2_past=0;
		}
		if (p2_past == 0) {
			if (Start.playerNone.equals(pla_player2.player2)) {
				start.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Start.playerNone.equals(pla_player2.player1_2)) {
				start.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past == 0 //출발점
		else if (p2_past == 1) {
			if (Korea.playerNone.equals(pla_player2.player2)) {
				kor.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우

			else if (Korea.playerNone.equals(pla_player2.player1_2)) {
				kor.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past ==1 //한국

		else if (p2_past == 2) {
			if (Japan.playerNone.equals(pla_player2.player2)) {
				jap.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Japan.playerNone.equals(pla_player2.player1_2)) {
				jap.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past == 2 //일본

		else if (p2_past == 3) {
			if (China.playerNone.equals(pla_player2.player2)) {
				chi.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (China.playerNone.equals(pla_player2.player1_2)) {
				chi.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past == 3 //중국

		else if (p2_past == 4) {
			if (Island.playerNone.equals(pla_player2.player2)) {
				isl.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Island.playerNone.equals(pla_player2.player1_2)) {
				isl.player12_1();
			} // playerNone==" ☆~ ★~ "



			// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past == 4 //무인도

		else if (p2_past == 5) {
			if (England.playerNone.equals(pla_player2.player2)) {
				eng.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (England.playerNone.equals(pla_player2.player1_2)) {
				eng.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past == 5 //영국

		else if (p2_past == 6) {
			if (France.playerNone.equals(pla_player2.player2)) {
				fra.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (France.playerNone.equals(pla_player2.player1_2)) {
				fra.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past == 6 //프랑스

		else if (p2_past == 7) {
			if (Germany.playerNone.equals(pla_player2.player2)) {
				ger.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Germany.playerNone.equals(pla_player2.player1_2)) {
				ger.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past == 7 //독일

		else if (p2_past == 8) {
			if (Russia.playerNone.equals(pla_player2.player2)) {
				rus.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Russia.playerNone.equals(pla_player2.player1_2)) {
				rus.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past ==8 //러시아

		else if (p2_past == 9) {
			if (Taxx2.playerNone.equals(pla_player2.player2)) {
				tax.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Taxx2.playerNone.equals(pla_player2.player1_2)) {
				tax.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past ==9 //통행료x2

		else if (p2_past == 10) {
			if (USA.playerNone.equals(pla_player2.player2)) {
				usa.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (USA.playerNone.equals(pla_player2.player1_2)) {
				usa.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past ==10 //미국

		else if (p2_past == 11) {
			if (Canada.playerNone.equals(pla_player2.player2)) {
				can.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Canada.playerNone.equals(pla_player2.player1_2)) {
				can.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past ==11 //캐나다

		else if (p2_past == 12) {
			if (Mexico.playerNone.equals(pla_player2.player2)) {
				mex.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Mexico.playerNone.equals(pla_player2.player1_2)) {
				mex.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past ==12 //멕시코
		else if (p2_past == 13) {
			if (Balloon.playerNone.equals(pla_player2.player2)) {
				ball.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Balloon.playerNone.equals(pla_player2.player1_2)) {
				ball.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past ==13 //열기구
		else if (p2_past == 14) {
			if (Italy.playerNone.equals(pla_player2.player2)) {
				ita.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Italy.playerNone.equals(pla_player2.player1_2)) {
				ita.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past ==14 //이탈리아

		else if (p2_past == 15) {
			if (Swiss.playerNone.equals(pla_player2.player2)) {
				swi.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Swiss.playerNone.equals(pla_player2.player1_2)) {
				swi.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past ==15 //스위스

		else if (p2_past == 16) {
			if (Vietnam.playerNone.equals(pla_player2.player2)) {
				vie.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Vietnam.playerNone.equals(pla_player2.player1_2)) {
				vie.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past ==16 //베트남

		else if (p2_past == 17) {
			if (Egypt.playerNone.equals(pla_player2.player2)) {
				egy.player2_None();
			} // playerNone==" ★~ "
				// 플레이어 좌표에 2p가 위치했을 경우
			else if (Egypt.playerNone.equals(pla_player2.player1_2)) {
				egy.player12_1();
			} // playerNone==" ☆~ ★~ "
				// 플레이어 좌표가 1p 2p 둘다 위치했던 경우

		} // p2_past ==17 //이집트

	}// player2_index

	public void ending_turn() {

		p1_result = (p1_mountOfBuilding * 1) + (p1_mountOfLandmark * 2) + p1_cash;
		p2_result = (p2_mountOfBuilding * 1) + (p2_mountOfLandmark * 2) + p1_cash;

		if (p1_result > p2_result) {

			System.out.println("플레이어 1의 빌딩 점수 : "+p1_mountOfBuilding+"   랜드마크 점수 : "+p1_mountOfLandmark+" 보유한 현금 : "+p1_cash);
			System.out.println("플레이어 2의 빌딩 점수 : "+p2_mountOfBuilding+"   랜드마크 점수 : "+p2_mountOfLandmark+" 보유한 현금 : "+p1_cash);
			System.out.println("플레이어 1의 점수 : "+p1_result);
			System.out.println("플레이어 2의 점수 : "+p2_result);
			System.out.println("플레이어 1이 승리했습니다!");
			System.exit(0);
		} // p1 승리
		else if (p1_result < p2_result) {
			System.out.println("플레이어 1의 빌딩 점수 : "+p1_mountOfBuilding+"   랜드마크 점수 : "+p1_mountOfLandmark+" 보유한 현금 : "+p1_cash);
			System.out.println("플레이어 2의 빌딩 점수 : "+p2_mountOfBuilding+"   랜드마크 점수 : "+p2_mountOfLandmark+" 보유한 현금 : "+p1_cash);
			System.out.println("플레이어 1의 점수 : "+p1_result);
			System.out.println("플레이어 2의 점수 : "+p2_result);
			System.out.println("플레이어 2이 승리했습니다!");
			System.exit(0);
		} // p2 승리

	}// turn ending

	public void ending(){
		Playboard pb = new Playboard();


		if(p1_cash<=0){
			p1_cash=0;
			pb.playboard();
			System.out.println("p1의 현금이 모두 소진되어 패배했습니다.");
			System.out.println("★★★★★p2님의 승리를 축하 합니다★★★★★");

			System.exit(0);

		}

		else if(p2_cash<=0){
			p2_cash=0;
			pb.playboard();
			System.out.println("p2의 현금이 모두 소진되어 패배했습니다.");
			System.out.println("☆☆☆☆☆p1님의 승리를 축하 합니다☆☆☆☆☆");

			System.exit(0);

		}
	}


}// class
