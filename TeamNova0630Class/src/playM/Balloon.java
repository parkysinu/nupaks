package playM;

import java.util.Scanner;

public class Balloon extends Place{

	String name ="　　열기구　　　";
	static String playerNone	="　　　　　　　　";
	String playerBlank	="　　　　　　　　";
	String player1		="　　☆~　　　　　　";
	String player2		="　　　　　　★~　　";
	String player1_2 	="　　☆~　　★~　　";
	String building  	="　　　▤　　　　　　";
	String landmark 		="　　　　　　　　　Å";
	String build_mark	="　　▤　　　　 Å　　";
	String structureNone ="　　　　　　　　";
	String travel ="열기구";
	String where;
	
	
	
	
	public void player1() {
		
		playerNone=playerNone.replaceAll("　　　　　　　　","　　☆~　　　　　　");
		
	}//player1
	
	public void player2() {
		
		playerNone=playerNone.replaceAll("　　　　　　　　","　　　　　　★~　　");
							  //"   베트남★~    ","   베트남★~    	"
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
							  //"   베트남★~    ","   베트남★~    	"
	}//player1_None
	
	public void player2_None() {
		
		playerNone=playerNone.replaceAll("　　　　　　★~　　","　　　　　　　　");
							  //"   베트남★~    ","   베트남★~    	"
	}//player2_None
	public void player12_1() {
		playerNone=playerNone.replaceAll("　　☆~　　★~　　","　　☆~　　　　　　");
	}//player12_1
	
	public void player12_2() {
		playerNone=playerNone.replaceAll("　　☆~　　★~　　","　　　　　　★~　　");
	}//player12_2
	
	//플레이어 좌표 이동 함수
	
	PlayboardLog playboardLog =new PlayboardLog();
	
	public void p1_TravelWhereYouWantToGo() {//어느 곳이든 갈수 있게 좌표 재설정
											//@@@@@@이동을 시키고 남은 말을 초기화 시키는 설정도 해놔야함@@@@@@@@@@@ 완
		
		Playboard board = new Playboard();
		Place pla=new Place();
		Player player = new Player();
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
		Balloon ball = new Balloon();
		
		Scanner scan = new Scanner(System.in);


			PlayboardLog.p1_placing_balloon = true;

		board.playboard();
		//System.out.println("열기구를 타고 세계여행을 어디든 갈수있습니다!");
		//System.out.println("가고싶은 여행지를 입력해주세요");
		//System.out.println("오타를 입력하면 두번의 '기회'는 없습니다 :)");
		where=scan.nextLine();
		if(PlayboardLog.p1_turn) {
			PlayboardLog.p1_placing_balloonSelected = true;
		}

		//System.out.println(where+"로 이동합니다 슈우우우우우웅");
			if(where.equals(start.travel)) {
				if(Start.playerNone.equals(start.player2)) {
					Player.p1_index =0;
					start.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}

				}//equals.player2
				else if(Start.playerNone.equals(start.playerBlank)) {
					Player.p1_index =0;
					start.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank
			}//p1_index = 0;
		
			else if(where.equals(kor.travel)) {
				if(Korea.playerNone.equals(kor.player2)) {
					Player.p1_index =1;
					kor.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Korea.playerNone.equals(kor.playerBlank)) {
					Player.p1_index =1;
					kor.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank
				
			}//p1_index = 1;

			else if(where.equals(jap.travel)) {
				if(Japan.playerNone.equals(jap.player2)) {
					Player.p1_index =2;
					jap.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Japan.playerNone.equals(jap.playerBlank)) {
					Player.p1_index =2;
					jap.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 2;
	

			else if(where.equals(chi.travel)) {
				if(China.playerNone.equals(chi.player2)) {
					Player.p1_index =3;
					chi.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(China.playerNone.equals(chi.playerBlank)) {
					Player.p1_index =3;
					chi.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 3;
	

			else if(where.equals(isl.travel)) {
				if(Island.playerNone.equals(isl.player2)) {
					Player.p1_index =4;
					isl.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Island.playerNone.equals(isl.playerBlank)) {
					Player.p1_index =4;
					isl.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 4;
	

			else if(where.equals(eng.travel)) {
				if(England.playerNone.equals(eng.player2)) {
					Player.p1_index =5;
					eng.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(England.playerNone.equals(eng.playerBlank)) {
					Player.p1_index =5;
					eng.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 5;
	

			else if(where.equals(fra.travel)) {
				if(France.playerNone.equals(fra.player2)) {
					Player.p1_index =6;
					fra.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(France.playerNone.equals(fra.playerBlank)) {
					Player.p1_index =6;
					fra.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 6;
	

			else if(where.equals(ger.travel)) {
				if(Germany.playerNone.equals(ger.player2)) {
					Player.p1_index =7;
					ger.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Germany.playerNone.equals(ger.playerBlank)) {
					Player.p1_index =7;
					ger.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 7;
	

			else if(where.equals(rus.travel)) {
				if(Russia.playerNone.equals(rus.player2)) {
					Player.p1_index =8;
					rus.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Russia.playerNone.equals(rus.playerBlank)) {
					Player.p1_index =8;
					rus.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 8;
	

			else if(where.equals(tax.travel)) {
				if(Taxx2.playerNone.equals(tax.player2)) {
					Player.p1_index =9;
					tax.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Taxx2.playerNone.equals(tax.playerBlank)) {
					Player.p1_index =9;
					tax.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 9;
	

			else if(where.equals(usa.travel)) {
				if(USA.playerNone.equals(usa.player2)) {
					Player.p1_index =10;
					usa.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(USA.playerNone.equals(usa.playerBlank)) {
					Player.p1_index =10;
					usa.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 10;
	

			else if(where.equals(can.travel)) {
				if(Canada.playerNone.equals(can.player2)) {
					Player.p1_index =11;
					can.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Canada.playerNone.equals(can.playerBlank)) {
					Player.p1_index =11;
					can.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 11;
	

			else if(where.equals(mex.travel)) {
				if(Mexico.playerNone.equals(mex.player2)) {
					Player.p1_index =12;
					mex.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Mexico.playerNone.equals(mex.playerBlank)) {
					Player.p1_index =12;
					mex.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 12;
	

			else if(where.equals(ita.travel)) {
				if(Italy.playerNone.equals(ita.player2)) {
					Player.p1_index =14;
					ita.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Italy.playerNone.equals(ita.playerBlank)) {
					Player.p1_index =14;
					ita.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 14;
	

			else if(where.equals(swi.travel)) {
				if(Swiss.playerNone.equals(swi.player2)) {
					Player.p1_index =15;
					swi.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Swiss.playerNone.equals(swi.playerBlank)) {
					Player.p1_index =15;
					swi.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 15;
	

			else if(where.equals(vie.travel)) {
				if(Vietnam.playerNone.equals(vie.player2)) {
					Player.p1_index =16;
					vie.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Vietnam.playerNone.equals(vie.playerBlank)) {
					Player.p1_index =16;
					vie.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 16;
	

			else if(where.equals(egy.travel)) {
				if(Egypt.playerNone.equals(egy.player2)) {
					Player.p1_index =17;
					egy.player2_1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.player2
				else if(Egypt.playerNone.equals(egy.playerBlank)) {
					Player.p1_index =17;
					egy.player1();
					if(playerNone.equals(player1)){
						player1_None();
					}
					else if(playerNone.equals(player1_2)){
						player12_2();
					}
				}//equals.playerBlank

			}//p1_index = 17;
			
			PlayboardLog.p1_placing_balloonSelected=false;
			PlayboardLog.p1_placing_balloon=false;
	

	}
	//p1_세계여행
	
	public void p2_TravelWhereYouWantToGo() {//어느곳이든 갈수있게 좌표 재설정
		
		Place pla_player2 = new Place();
		Playboard board = new Playboard();
		
		Player player = new Player();
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
		Balloon ball = new Balloon();
		Scanner scan = new Scanner(System.in);


		PlayboardLog.p2_placing_balloon =true;

		board.playboard();
		//System.out.println("열기구를 타고 세계여행을 어디든 갈수있습니다!");
		//System.out.println("가고싶은 여행지를 입력해주세요");
		//System.out.println("오타를 입력하면 두번의 '기회'는 없습니다 :)");
		where=scan.nextLine();



			PlayboardLog.p2_placing_balloonSelected =true;

		//System.out.println(where+"로 이동합니다 슈우우우우우웅");
		if(where.equals(start.travel)) {
			if(Start.playerNone.equals(Start.player1)) {
					Player.p2_index =0;
					start.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player2
			else if(Start.playerNone.equals(start.playerBlank)) {
				Player.p2_index =0;
				start.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank
		}//p2_index = 0;

		else if(where.equals(kor.travel)) {
			if(Korea.playerNone.equals(kor.player1)) {
				Player.p2_index =1;
				kor.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player2
			else if(Korea.playerNone.equals(kor.playerBlank)) {
				Player.p2_index =1;
				kor.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p2_index = 1;

		else if(where.equals(jap.travel)) {
			if(Japan.playerNone.equals(jap.player1)) {
				Player.p2_index =2;
				jap.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player2
			else if(Japan.playerNone.equals(jap.playerBlank)) {
				Player.p2_index =2;
				jap.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p2_index = 2;


		else if(where.equals(chi.travel)) {
			if(China.playerNone.equals(chi.player1)) {
				Player.p2_index =3;
				chi.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player1
			else if(China.playerNone.equals(chi.playerBlank)) {
				Player.p2_index =3;
				chi.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p2_index = 3;


		else if(where.equals(isl.travel)) {
			if(Island.playerNone.equals(isl.player1)) {
				Player.p2_index =4;
				isl.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player1
			else if(Island.playerNone.equals(isl.playerBlank)) {
				Player.p2_index =4;
				isl.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p2_index = 4;


		else if(where.equals(eng.travel)) {
			if(England.playerNone.equals(eng.player2)) {
				Player.p1_index =5;
				eng.player2_1();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player2
			else if(England.playerNone.equals(eng.playerBlank)) {
				Player.p1_index =5;
				eng.player1();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p1_index = 5;


		else if(where.equals(fra.travel)) {
			if(France.playerNone.equals(fra.player2)) {
				Player.p1_index =6;
				fra.player2_1();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player2
			else if(France.playerNone.equals(fra.playerBlank)) {
				Player.p1_index =6;
				fra.player1();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p1_index = 6;


		else if(where.equals(ger.travel)) {
			if(Germany.playerNone.equals(ger.player2)) {
				Player.p1_index =7;
				ger.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player2
			else if(Germany.playerNone.equals(ger.playerBlank)) {
				Player.p2_index =7;
				ger.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p2_index = 7;


		else if(where.equals(rus.travel)) {
			if(Russia.playerNone.equals(rus.player1)) {
				Player.p1_index =8;
				rus.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player2
			else if(Russia.playerNone.equals(rus.playerBlank)) {
				Player.p2_index =8;
				rus.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p2_index = 8;


		else if(where.equals(tax.travel)) {
			if(Taxx2.playerNone.equals(tax.player1)) {
				Player.p2_index =9;
				tax.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player1
			else if(Taxx2.playerNone.equals(tax.playerBlank)) {
				Player.p2_index =9;
				tax.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p2_index = 9;


		else if(where.equals(usa.travel)) {
			if(USA.playerNone.equals(usa.player1)) {
				Player.p2_index =10;
				usa.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player2
			else if(USA.playerNone.equals(usa.playerBlank)) {
				Player.p2_index =10;
				usa.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p2_index = 10;


		else if(where.equals(can.travel)) {
			if(Canada.playerNone.equals(can.player1)) {
				Player.p2_index =11;
				can.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player1
			else if(Canada.playerNone.equals(can.playerBlank)) {
				Player.p2_index =11;
				can.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p1_index = 11;


		else if(where.equals(mex.travel)) {
			if(Mexico.playerNone.equals(mex.player1)) {
				Player.p2_index =12;
				mex.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player1
			else if(Mexico.playerNone.equals(mex.playerBlank)) {
				Player.p2_index =12;
				mex.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p2_index = 12;


		else if(where.equals(ita.travel)) {
			if(Italy.playerNone.equals(ita.player1)) {
				Player.p2_index =14;
				ita.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player2
			else if(Italy.playerNone.equals(ita.playerBlank)) {
				Player.p2_index =14;
				ita.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p2_index = 14;


		else if(where.equals(swi.travel)) {
			if(Swiss.playerNone.equals(swi.player1)) {
				Player.p2_index =15;
				swi.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player1
			else if(Swiss.playerNone.equals(swi.playerBlank)) {
				Player.p2_index =15;
				swi.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p2_index = 15;


		else if(where.equals(vie.travel)) {
			if(Vietnam.playerNone.equals(vie.player1)) {
				Player.p2_index =16;
				vie.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player2
			else if(Vietnam.playerNone.equals(vie.playerBlank)) {
				Player.p2_index =16;
				vie.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p1_index = 16;


		else if(where.equals(egy.travel)) {
			if(Egypt.playerNone.equals(egy.player1)) {
				Player.p2_index =17;
				egy.player1_2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.player1
			else if(Egypt.playerNone.equals(egy.playerBlank)) {
				Player.p2_index =17;
				egy.player2();
				if(playerNone.equals(player2)){
					player2_None();
				}
				else if(playerNone.equals(player1_2)){
					player12_1();
				}
			}//equals.playerBlank

		}//p1_index = 17;
		PlayboardLog.p2_placing_balloonSelected=false;
		PlayboardLog.p2_placing_balloonSelected=false;


	}
	//p2_세계여행
	
}//class
