package playM;

import java.util.Scanner;

public class Island extends Place{

	static String name 		="　　무인도　　　";
	String player1			="　　☆~　　　　　　";
	String player2  		="　　　　　　★~　　";
	String player1_2		="　　☆~　　★~　　";
	String player2_1		="　　☆~　　★~　　";
	String playerBlank		="　　　　　　　　";
	static String playerNone="　　　　　　　　";
	String travel ="무인도";
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
		
		playerNone=playerNone.replaceAll("　　　　　　　　","　　☆~　　　　　　");
		
	}//player1
	
	public void player2() {
		
		playerNone=playerNone.replaceAll("　　　　　　　　","　　　　　　★~　　");
							  
	}//player2
	
	public void player1_2() {

		playerNone=playerNone.replaceAll("　　☆~　　　　　　","　　☆~　　★~　　");

	}//player1_2

	public void player2_1() {
		
		playerNone=playerNone.replaceAll("　　　　　　★~　　","　　☆~　　★~　　");
		
	}//player2_1
	//뭐땜에 만들었는지 까먹음 2p가 먼저 도착한 상태에서 1p가 도착함
	public void player1_None() {
		
		playerNone=playerNone.replaceAll("　　☆~　　　　　　","　　　　　　　　");
						
		
	}//player1_None
	
	public void player2_None() {
		
		playerNone=playerNone.replaceAll("　　　　　　★~　　","　　　　　　　　");
							 
	}//player2_None
	public void player12_1() {
		playerNone=playerNone.replaceAll("　　☆~　　★~　　","　　☆~　　　　　　");
	}//player12_1
	
	public void player12_2() {
		playerNone=playerNone.replaceAll("　　☆~　　★~　　","　　　　　　★~　　");
	}//player12_2
	
	//플레이어 좌표 이동 함수




	///주사위 값이 저장되지 않아서 새롭게 짯음 .
	//변수가 저장되는 위치가 달라서 어떻게 해결해야할지 질문해야함.

	public void lockedIsland_p1() {
		Player player = new Player();
		Playboard playboard =new Playboard();
		Scanner scan= new Scanner(System.in);
		if(Player.p1_index ==4) {

			p1_lockedIsland = true;
			//System.out.println("무인도에 갇혔습니다. :( 어떤 방법으로 탈출을 시도해볼까요?");
			//System.out.println("1.운을 시험해본다. 뭔가 곧 배나 비행기가 도착할거 같아!");
			//System.out.println("2.30억 비용을 내고 무인도 구조 전문업체 'don't worry'를 부른다. ");
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
					//System.out.println("잘못 입력했습니다. 이 방법 말고는 없어요! 선택해주세요.");

				}//else
			}//while(true)
		}//p1_index==4일 때 메소드 실행
	}//무인도 탈출 
	
	
	public void lockedIsland_p2() {
		Playboard playboard = new Playboard();
		Player player = new Player();
		Scanner scan= new Scanner(System.in);
		if(Player.p2_index ==4) {
			p2_lockedIsland = true;
			playboard.playboard();
			//System.out.println("무인도에 갇혔습니다. :( 어떤 방법으로 탈출을 시도해볼까요?");
			//System.out.println("1.운을 시험해본다. 뭔가 곧 배나 비행기가 도착할거 같아!");
			//System.out.println("2.30억 비용을 내고 무인도 구조 전문업체 'don't worry'를 부른다. ");

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
					//System.out.println("잘못 입력 했습니다. 이 방법 말고는 없어요! 선택 해주세요.");

				}//else
			}//while(true)
		}//p2_index==4 일때 메소드 실행
	}//무인도 탈출 
	

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
			//System.out.println("주사위를 굴렸는데 눈이 같네? 이건 하늘의 계시야!");
			//System.out.println("멀리서 뿌우우우우 소리가 들린다");
			//System.out.println("어? 배가 지나 간다 여기 에요 여기!");
			//System.out.println("휴 살았다");
			//System.out.println("경)무인도 탈출에 성공 했습니다(축");
			Player.p1_locked =0;
//			player.moving1();
//			player.p1_index = 4 + player.dice1 + player.dice2;
//
//
//			if (player.p1_index == 6) {
//				if (fra.playerNone.equals(fra.playerBlank)) {
//					fra.player1();
//				} // 1p가 이동 하려는 자리에 아무도 없을때
//				else if (fra.playerNone.equals(fra.player2)) {
//					fra.player2_1();
//				} // 1p가 이동 하려는 자리에 2p가 위치 하고 있을 때
//
//			} // p1_index == 6 //프랑스
//
//			else if (player.p1_index == 7) {
//				if (ger.playerNone.equals(ger.playerBlank)) {
//					ger.player1();
//				} // 1p가 이동 하려는 자리에 아무도 없을때
//				else if (ger.playerNone.equals(ger.player2)) {
//					ger.player2_1();
//				} // 1p가 이동 하려는 자리에 2p가 위치 하고 있을 때
//			} // p1_index == 7 //독일
//
//			else if (player.p1_index == 8) {
//				if (rus.playerNone.equals(rus.playerBlank)) {
//					rus.player1();
//				} // 1p가 이동 하려는 자리에 아무도 없을때
//				else if (rus.playerNone.equals(rus.player2)) {
//					rus.player2_1();
//				} // 1p가 이동 하려는 자리에 2p가 위치 하고 있을 때
//			} // p1_index ==8 //러시아
//
//			else if (player.p1_index == 9) {
//				if (tax.playerNone.equals(tax.playerBlank)) {
//					tax.player1();
//				} // 1p가 이동 하려는 자리에 아무도 없을때
//				else if (tax.playerNone.equals(tax.player2)) {
//					tax.player2_1();
//				} // 1p가 이동 하려는 자리에 2p가 위치하고있을때
//				tax.vistX2();// 통행료가 2배가 되는 메소드
//			} // p1_index ==9 //통행료x2
//
//			else if (player.p1_index == 10) {
//				if (usa.playerNone.equals(usa.playerBlank)) {
//					usa.player1();
//				} // 1p가 이동 하려는 자리에 아무도 없을때
//				else if (usa.playerNone.equals(usa.player2)) {
//					usa.player2_1();
//				} // 1p가 이동 하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==10 //미국
//
//			else if (player.p1_index == 11) {
//				if (can.playerNone.equals(can.playerBlank)) {
//					can.player1();
//				} // 1p가 이동 하려는 자리에 아무도 없을때
//				else if (can.playerNone.equals(can.player2)) {
//					can.player2_1();
//				} // 1p가 이동 하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==11 //캐나다
//
//			else if (player.p1_index == 12) {
//				if (mex.playerNone.equals(mex.playerBlank)) {
//					mex.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (mex.playerNone.equals(mex.player2)) {
//					mex.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==12 //멕시코
//
//			else if (player.p1_index == 13) {
//				player.p1_balloonLock=1;
//				if (ball.playerNone.equals(ball.playerBlank)) {
//					ball.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (ball.playerBlank.equals(ball.player2)) {
//					ball.player2_1();
//
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//
//
//			} // p1_index ==13 //열기구
//
//			else if (player.p1_index == 14) {
//				if (ita.playerNone.equals(ita.playerBlank)) {
//					ita.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (ita.playerNone.equals(ita.player2)) {
//					ita.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==14 //이탈리아
//
//			else if (player.p1_index == 15) {
//				if (swi.playerNone.equals(swi.playerBlank)) {
//					swi.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (swi.playerNone.equals(swi.player2)) {
//					swi.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==15 //스위스
//
//			else if (player.p1_index == 16) {
//				if (vie.playerNone.equals(vie.playerBlank)) {
//					vie.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (vie.playerNone.equals(vie.player2)) {
//					vie.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==16 //베트남
//
//			//플레이어를 무인도 탈출 뒤에 이동 시킨다.
//
//			if(isl.playerNone.equals(isl.player1)){
//				isl.player1_None();
//			}
//			else if(isl.playerNone.equals(isl.player1_2)){
//				isl.player12_2();
//			}
			//무인도에 있던 플레이어의 좌표가 바뀌었으니 무인도의 플레이어를 바꿔준다.
			playboard.playboard();
		}//dice1==dice2
		
		else if(Dice.dice1 != Dice.dice2) {

			p1_select1Fail=true;
			Player.p1_locked =1;
			playboard.playboard();
			//System.out.println("주사위 눈이 서로 다르네.. 그래도 배와 비행기가 세상에 얼마나 많은데 한대쯤은 지나가겠지");
			//System.out.println(".....아무것도 오지 않는다");

			
			//매턴마다 발현되는 메소드도 만들어야함.
			//어떻게 만들것인가?
			//매턴이 시작할 때 마다 무인도에 위치 하고 있다면 주사위를 새롭게 굴리던가 새로운 방법을 찾도록 만들어야 함
			
			
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
			
			//System.out.println("주사위를 굴렸는데 눈이 같네? 이건 하늘의 계시야!");
			//System.out.println("멀리서 뿌우우우우 소리가 들린다");
			//System.out.println("어? 배가 지나간다 여기에요 여기!");
			//System.out.println("휴 살았다");
			//System.out.println();
			//System.out.println();
			//System.out.println("경)무인도 탈출에 성공했습니다(축");
			Player.p2_locked =0;

//			player.moving2();
//			player.p2_index=4+player.dice1+player.dice2;
//
//			if (player.p2_index == 6) {
//				if (fra.playerNone.equals(pla_player2.playerBlank)) {
//					fra.player2();
//				} // 1p가 이동 하려는 자리에 아무도 없을때
//				else if (fra.playerNone.equals(pla_player2.player1)) {
//					fra.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고있을때
//			} // p2_index == 6 //프랑스
//
//			else if (player.p2_index == 7) {
//				if (ger.playerNone.equals(pla_player2.playerBlank)) {
//					ger.player2();
//				} // 2p가 이동 하려는 자리에 아무도 없을때
//				else if (ger.playerNone.equals(pla_player2.player1)) {
//					ger.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고있을때
//			} // p2_index == 7 //독일
//
//			else if (player.p2_index == 8) {
//				if (rus.playerNone.equals(pla_player2.playerBlank)) {
//					rus.player2();
//				} // 2p가 이동 하려는 자리에 아무도 없을때
//				else if (rus.playerNone.equals(pla_player2.player1)) {
//					rus.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==8 //러시아
//
//			else if (player.p2_index == 9) {
//				if (tax.playerNone.equals(pla_player2.playerBlank)) {
//					tax.player2();
//				} // 2p가 이동 하려는 자리에 아무도 없을때
//				else if (tax.playerNone.equals(pla_player2.player1)) {
//					tax.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고있을때
//				tax.vistX2();// 통행료 2배가 되는 메소드
//			} // p2_index ==9 //통행료x2
//
//			else if (player.p2_index == 10) {
//				if (usa.playerNone.equals(pla_player2.playerBlank)) {
//					usa.player2();
//				} // 2p가 이동 하려는 자리에 아무도 없을때
//				else if (usa.playerNone.equals(pla_player2.player1)) {
//					usa.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==10 //미국
//
//			else if (player.p2_index == 11) {
//				if (can.playerNone.equals(pla_player2.playerBlank)) {
//					can.player2();
//				} // 2p가 이동 하려는 자리에 아무도 없을때
//				else if (can.playerNone.equals(pla_player2.player1)) {
//					can.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==11 //캐나다
//
//			else if (player.p2_index == 12) {
//				if (mex.playerNone.equals(pla_player2.playerBlank)) {
//					mex.player2();
//				} // 2p가 이동 하려는 자리에 아무도 없을때
//				else if (mex.playerNone.equals(pla_player2.player1)) {
//					mex.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==12 //멕시코
//
//			else if (player.p2_index == 13) {
//				player.p2_balloonLock=1;
//				if (ball.playerNone.equals(pla_player2.playerBlank)) {
//					ball.player2();
//				} // 2p가 이동 하려는 자리에 아무도 없을때
//				else if (ball.playerNone.equals(pla_player2.player1)) {
//					ball.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고있을때
//
//			} // p2_index ==13 //열기구
//
//			else if (player.p2_index == 14) {
//				if (ita.playerNone.equals(pla_player2.playerBlank)) {
//					ita.player2();
//				} // 2p가 이동 하려는 자리에 아무도 없을때
//				else if (ita.playerNone.equals(pla_player2.player1)) {
//					ita.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==14 //이탈리아
//
//			else if (player.p2_index == 15) {
//				if (swi.playerNone.equals(pla_player2.playerBlank)) {
//					swi.player2();
//				} // 2p가 이동 하려는 자리에 아무도 없을때
//				else if (swi.playerNone.equals(pla_player2.player1)) {
//					swi.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==15 //스위스
//
//			else if (player.p2_index == 16) {
//				if (vie.playerNone.equals(pla_player2.playerBlank)) {
//					vie.player2();
//				} // 2p가 이동 하려는 자리에 아무도 없을때
//				else if (vie.playerNone.equals(pla_player2.player1)) {
//					vie.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==16 //베트남
//
//
//			//플레이어를 무인도 탈출 뒤에 이동 시킨다.
//
//			if(isl.playerNone.equals(isl.player2)){
//				isl.player2_None();
//			}
//			else if(isl.playerNone.equals(isl.player1_2)){
//				isl.player12_1();
//			}
			//플레이어 이동을 시킨 후에 전에 있던 자리의 플레이어 말을 초기화 시키기
			board.playboard();
		}//dice1==dice2

		else if(Dice.dice1 != Dice.dice2) {
			p2_select1Fail=true;
			//System.out.println("주사위 눈이 서로 다르네.. 그래도 배와 비행기가 세상에 얼마나 많은데 한대쯤은 지나가겠지");
			//System.out.println(".....아무것도 오지 않는다");
			
			Player.p2_locked =1;
			board.playboard();
			//매턴마다 발현되는 메소드도 만들어야함.
			//어떻게 만들것인가?
			//매턴이 시작할때마다 무인도에 위치하고있다면 주사위를 새롭게 굴리던가 새로운 방법을 찾도록 만들어야함
			
			
		}//dice1!=dice2
	}//choice1_p2
	
	public void choice2_p1() {
		//2번을 선택을 하게 되면 30억을 내고 구조 전문 업체(?)를 불러 탈출 하고 정상 적으로 게임을 진행 한다.
		
		
		p1_select2Call=true;


		//System.out.println("안녕 하세요 구조 전문 업체 'don't worry' 입니다. 고객 님의 안전을 위해서 빠르게 왔습니다.");
		//System.out.println("감사 합니다");
		//System.out.println("서비스 이용 료는 30억 입니다.");
		//System.out.println("너무 비싸..");
		//System.out.println("☆☆☆당신의 현금이 30억 감소 되었 습니다☆☆☆");


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
//				} // 1p가 이동 하려는 자리에 아무도 없을때
//
//				else if (fra.playerNone.equals(fra.player2)) {
//					fra.player2_1();
//				} // 1p가 이동 하려는 자리에 2p가 위치 하고 있을 때
//			} // p1_index == 6 //프랑스
//
//			else if (player.p1_index == 7) {
//				if (ger.playerNone.equals(ger.playerBlank)) {
//					ger.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (ger.playerNone.equals(ger.player2)) {
//					ger.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index == 7 //독일
//
//			else if (player.p1_index == 8) {
//				if (rus.playerNone.equals(rus.playerBlank)) {
//					rus.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (rus.playerNone.equals(rus.player2)) {
//					rus.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==8 //러시아
//
//			else if (player.p1_index == 9) {
//				if (tax.playerNone.equals(tax.playerBlank)) {
//					tax.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (tax.playerNone.equals(tax.player2)) {
//					tax.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//				tax.vistX2();// 통행료가 2배가 되는 메소드
//			} // p1_index ==9 //통행료x2
//
//			else if (player.p1_index == 10) {
//				if (usa.playerNone.equals(usa.playerBlank)) {
//					usa.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (usa.playerNone.equals(usa.player2)) {
//					usa.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==10 //미국
//
//			else if (player.p1_index == 11) {
//				if (can.playerNone.equals(can.playerBlank)) {
//					can.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (can.playerNone.equals(can.player2)) {
//					can.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==11 //캐나다
//
//			else if (player.p1_index == 12) {
//				if (mex.playerNone.equals(mex.playerBlank)) {
//					mex.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (mex.playerNone.equals(mex.player2)) {
//					mex.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==12 //멕시코
//
//			else if (player.p1_index == 13) {
//				player.p1_balloonLock=1;
//				if (ball.playerNone.equals(ball.playerBlank)) {
//					ball.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (ball.playerBlank.equals(ball.player2)) {
//					ball.player2_1();
//
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//
//
//			} // p1_index ==13 //열기구
//
//			else if (player.p1_index == 14) {
//				if (ita.playerNone.equals(ita.playerBlank)) {
//					ita.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (ita.playerNone.equals(ita.player2)) {
//					ita.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==14 //이탈리아
//
//			else if (player.p1_index == 15) {
//				if (swi.playerNone.equals(swi.playerBlank)) {
//					swi.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (swi.playerNone.equals(swi.player2)) {
//					swi.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==15 //스위스
//
//			else if (player.p1_index == 16) {
//				if (vie.playerNone.equals(vie.playerBlank)) {
//					vie.player1();
//				} // 1p가 이동하려는 자리에 아무도 없을때
//				else if (vie.playerNone.equals(vie.player2)) {
//					vie.player2_1();
//				} // 1p가 이동하려는 자리에 2p가 위치하고있을때
//			} // p1_index ==16 //베트남
//
//			//플레이어를 무인도 탈출 뒤에 이동 시킨다.
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
		//2번을 선택 하게 되면 30억을 내고 구조 전문 업체(?)를 불러 탈출하고 정상적으로 게임을 진행한다.


		Player player = new Player();

		p2_select2Call=true;
		//System.out.println("안녕하세요 구조 전문 업체 'don't worry' 입니다. 고객님의 안전을 위해서 빠르게 왔습니다.");
	//	System.out.println("감사합니다");
		//System.out.println("서비스 이용료는 30억 입니다.");
	//	System.out.println("너무 비싸..");
		//System.out.println("★★★당신의 현금이 30억 감소 되었습니다★★★");


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
//				} // 1p가 이동 하려는 자리에 아무도 없을때
//				else if (fra.playerNone.equals(pla_player2.player1)) {
//					fra.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고 있을 때
//			} // p2_index == 6 //프랑스
//
//			else if (player.p2_index == 7) {
//				if (ger.playerNone.equals(pla_player2.playerBlank)) {
//					ger.player2();
//				} // 2p가 이동 하려는 자리에 아무도 없을때
//				else if (ger.playerNone.equals(pla_player2.player1)) {
//					ger.player1_2();
//				} // 2p가 이동 하려는 자리에 1p가 위치하고 있을 때
//			} // p2_index == 7 //독일
//
//			else if (player.p2_index == 8) {
//				if (rus.playerNone.equals(pla_player2.playerBlank)) {
//					rus.player2();
//				} // 2p가 이동하려는 자리에 아무도 없을때
//				else if (rus.playerNone.equals(pla_player2.player1)) {
//					rus.player1_2();
//				} // 2p가 이동하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==8 //러시아
//
//			else if (player.p2_index == 9) {
//				if (tax.playerNone.equals(pla_player2.playerBlank)) {
//					tax.player2();
//				} // 2p가 이동하려는 자리에 아무도 없을때
//				else if (tax.playerNone.equals(pla_player2.player1)) {
//					tax.player1_2();
//				} // 2p가 이동하려는 자리에 1p가 위치하고있을때
//				tax.vistX2();// 통행료 2배가 되는 메소드
//			} // p2_index ==9 //통행료x2
//
//			else if (player.p2_index == 10) {
//				if (usa.playerNone.equals(pla_player2.playerBlank)) {
//					usa.player2();
//				} // 2p가 이동하려는 자리에 아무도 없을때
//				else if (usa.playerNone.equals(pla_player2.player1)) {
//					usa.player1_2();
//				} // 2p가 이동하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==10 //미국
//
//			else if (player.p2_index == 11) {
//				if (can.playerNone.equals(pla_player2.playerBlank)) {
//					can.player2();
//				} // 2p가 이동하려는 자리에 아무도 없을때
//				else if (can.playerNone.equals(pla_player2.player1)) {
//					can.player1_2();
//				} // 2p가 이동하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==11 //캐나다
//
//			else if (player.p2_index == 12) {
//				if (mex.playerNone.equals(pla_player2.playerBlank)) {
//					mex.player2();
//				} // 2p가 이동하려는 자리에 아무도 없을때
//				else if (mex.playerNone.equals(pla_player2.player1)) {
//					mex.player1_2();
//				} // 2p가 이동하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==12 //멕시코
//
//			else if (player.p2_index == 13) {
//				player.p2_balloonLock = 1;
//				if (ball.playerNone.equals(pla_player2.playerBlank)) {
//					ball.player2();
//				} // 2p가 이동하려는 자리에 아무도 없을때
//				else if (ball.playerNone.equals(pla_player2.player1)) {
//					ball.player1_2();
//				} // 2p가 이동하려는 자리에 1p가 위치하고있을때
//
//			} // p2_index ==13 //열기구
//
//			else if (player.p2_index == 14) {
//				if (ita.playerNone.equals(pla_player2.playerBlank)) {
//					ita.player2();
//				} // 2p가 이동하려는 자리에 아무도 없을때
//				else if (ita.playerNone.equals(pla_player2.player1)) {
//					ita.player1_2();
//				} // 2p가 이동하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==14 //이탈리아
//
//			else if (player.p2_index == 15) {
//				if (swi.playerNone.equals(pla_player2.playerBlank)) {
//					swi.player2();
//				} // 2p가 이동하려는 자리에 아무도 없을때
//				else if (swi.playerNone.equals(pla_player2.player1)) {
//					swi.player1_2();
//				} // 2p가 이동하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==15 //스위스
//
//			else if (player.p2_index == 16) {
//				if (vie.playerNone.equals(pla_player2.playerBlank)) {
//					vie.player2();
//				} // 2p가 이동하려는 자리에 아무도 없을때
//				else if (vie.playerNone.equals(pla_player2.player1)) {
//					vie.player1_2();
//				} // 2p가 이동하려는 자리에 1p가 위치하고있을때
//			} // p2_index ==16 //베트남
//
//
//			//플레이어를 무인도 탈출 뒤에 이동 시킨다.
//
//			if (isl.playerNone.equals(isl.player2)) {
//				isl.player2_None();
//			}
//			else if (isl.playerNone.equals(isl.player1_2)) {
//				isl.player12_1();
//			}
			//플레이어 이동시킨 후에 전에 있던 자리의 플레이어 말을 초기화 시키기
		playboard.playboard();
		}//choice2_p2


		public void failSameEyes_p1 () {
			//어떻게 만들어야 할까
			//새로운 기능을 가진 변수를 2개 만듬 ex)int lock =0; (boolean)?


			Player player = new Player();
			Scanner scan = new Scanner(System.in);
			int choice;

			System.out.println("무인도에 갇힌지 벌써 1주일째인데..여기를 어떻게 나가지..");
			System.out.println("1.주사위를 굴려서 나의 운을 점쳐보자!");
			System.out.println("2.어 ? 저기 핸드폰 같은데? 30억을 내고 무인도 구조 전문업체 'don't worry'에게 서비스를 부탁한다.");
			//System.out.println("3.내 경쟁자한테 독점하고있는 국가를 양도하게 되면 도와줄지도? ");
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
					System.out.println("잘못 입력했습니다. 이 방법 말고는 없어요! 선택해주세요.");

				}//else
			}//while(true)

		}//failSameEyes_p1

		public void failSameEyes_p2 () {
			//어떻게 만들어야 할까
			//새로운 기능을 가진 변수를 2개 만듬 ex)int lock =0; (boolean)?


			Player player = new Player();
			Scanner scan = new Scanner(System.in);
			int choice;

			System.out.println("무인도에 갇힌지 벌써 1주일째인데..여기를 어떻게 나가지..");
			System.out.println("1.주사위를 굴려서 나의 운을 점쳐보자!");
			System.out.println("2.어 ? 저기 핸드폰 같은데? 30억을 내고 무인도 구조 전문업체 'don't worry'에게 서비스를 부탁한다.");

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
					System.out.println("잘못 입력했습니다. 이 방법 말고는 없어요! 선택해주세요.");

				}//else
			}//while(true)

		}//failSameEyes_p2

	}//class

