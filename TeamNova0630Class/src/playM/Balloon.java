package playM;

import java.util.Scanner;

public class Balloon extends Place{

	String name ="�������ⱸ������";
	static String playerNone	="����������������";
	String playerBlank	="����������������";
	String player1		="������~������������";
	String player2		="��������������~����";
	String player1_2 	="������~������~����";
	String building  	="�������ǡ�����������";
	String landmark 		="��������������������";
	String build_mark	="�����ǡ������� �ʡ���";
	String structureNone ="����������������";
	String travel ="���ⱸ";
	String where;
	
	
	
	
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
	
	PlayboardLog playboardLog =new PlayboardLog();
	
	public void p1_TravelWhereYouWantToGo() {//��� ���̵� ���� �ְ� ��ǥ �缳��
											//@@@@@@�̵��� ��Ű�� ���� ���� �ʱ�ȭ ��Ű�� ������ �س�����@@@@@@@@@@@ ��
		
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
		//System.out.println("���ⱸ�� Ÿ�� ���迩���� ���� �����ֽ��ϴ�!");
		//System.out.println("������� �������� �Է����ּ���");
		//System.out.println("��Ÿ�� �Է��ϸ� �ι��� '��ȸ'�� �����ϴ� :)");
		where=scan.nextLine();
		if(PlayboardLog.p1_turn) {
			PlayboardLog.p1_placing_balloonSelected = true;
		}

		//System.out.println(where+"�� �̵��մϴ� ���������");
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
	//p1_���迩��
	
	public void p2_TravelWhereYouWantToGo() {//������̵� �����ְ� ��ǥ �缳��
		
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
		//System.out.println("���ⱸ�� Ÿ�� ���迩���� ���� �����ֽ��ϴ�!");
		//System.out.println("������� �������� �Է����ּ���");
		//System.out.println("��Ÿ�� �Է��ϸ� �ι��� '��ȸ'�� �����ϴ� :)");
		where=scan.nextLine();



			PlayboardLog.p2_placing_balloonSelected =true;

		//System.out.println(where+"�� �̵��մϴ� ���������");
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
	//p2_���迩��
	
}//class
