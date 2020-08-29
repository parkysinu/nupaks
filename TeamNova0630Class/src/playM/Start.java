package playM;

import java.util.Scanner;

public class Start extends Place{

	static String name ="　　출발점　　　";
	static String player1="　　☆~　　　　　　";
	String player2="　　　　　　★~　　";
	String player1_2="　　☆~　　★~　　";
	String player2_1="　　☆~　　★~　　";
	String playerBlank	="　　　　　　　　";
	static String playerNone="　　　　　　　　";
	String travel ="출발점";
	
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
	//"　　☆~　　★~　　","　　☆~　　　　　　","　　　　　　★~　　"
	
	
	public void upgrade_p1() {
		//먼저 타 유저가 소유 하고 있는지 아닌지 확인하는 조건&&내가 소유 중인 국가중 독점되지 않는 맵
		//확인된 조건을 목록을 짜서 리스트로 뿌림
		//그중에 선택을 한다
		//소유 하지 않은 맵 일경우 랜덤을 돌려서 건설 하는 건축 물을 뽑고 턴을 종료
		//소유 하는 맵 일경우 독점 권은 선언 하고 턴을 종료
		//빌딩을 소유 할 경우 랜드마크 건설
		//랜드마크를 소유 할 경우 빌딩을 건설
		
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
		//System.out.println("업그레이드 할수 있는 국가 목록");
		//System.out.println("목록을 확인 하고 해당 하는 업그레이드를 하고 싶은 국가를 선택 해주세요.");
		//System.out.println("업그레이드를 원하는 국가가 없거나, 원하는 국가가 없다면 0 을 입력 해주세요.");
		//System.out.println("===========================================");
		if(Korea.name.equals(kor.p1_own)) {
			if(Korea.structureNone.equals(kor.building)) {
				System.out.println("1.한국에  ▤  보유 중");
			}//빌딩 보유중
			else if(Korea.structureNone.equals(kor.landmark)) {
				System.out.println("1.한국에  Å  보유 중");
			}//랜드마크 보유중

		}//한국

		if(Japan.name.equals(jap.p1_own)) {
			if(Japan.structureNone.equals(jap.building)) {
				System.out.println("2.일본에  ▤  보유 중");
			}//빌딩 보유중
			else if(Japan.structureNone.equals(jap.landmark)) {
				System.out.println("2.일본에  Å  보유 중");
			}//랜드마크 보유중

		}//일본


		if(China.name.equals(chi.p1_own)) {
			if(China.structureNone.equals(chi.building)) {
				System.out.println("3.중국에  ▤  보유 중");
			}//빌딩 보유중
			else if(China.structureNone.equals(chi.landmark)) {
				System.out.println("3.중국에  Å  보유 중");
			}//랜드마크 보유중

		}//중국


		if(England.name.equals(eng.p1_own)) {
			if(England.structureNone.equals(eng.building)) {
				System.out.println("4.영국에  ▤  보유 중");
			}//빌딩 보유중
			else if(England.structureNone.equals(eng.landmark)) {
				System.out.println("4.영국에  Å  보유 중");
			}//랜드마크 보유중

		}//영국


		if(France.name.equals(fra.p1_own)) {
			if(France.structureNone.equals(fra.building)) {
				System.out.println("5.프랑스에  ▤  보유 중");
			}//빌딩 보유중
			else if(France.structureNone.equals(fra.landmark)) {
				System.out.println("5.프랑스에  Å  보유 중");
			}//랜드마크 보유중

		}//프랑스


		if(Germany.name.equals(ger.p1_own)) {
			if(Germany.structureNone.equals(ger.building)) {
				System.out.println("6.독일에  ▤  보유 중");
			}//빌딩 보유중
			else if(Germany.structureNone.equals(ger.landmark)) {
				System.out.println("6.독일에  Å  보유 중");
			}//랜드마크 보유중

		}//독일


		if(Russia.name.equals(rus.p1_own)) {
			if(Russia.structureNone.equals(rus.building)) {
				System.out.println("7.러시아에  ▤  보유 중");
			}//빌딩 보유중
			else if(Russia.structureNone.equals(rus.landmark)) {
				System.out.println("7.러시아에  Å  보유 중");
			}//랜드마크 보유중

		}//러시아


		if(USA.name.equals(usa.p1_own)) {
			if(USA.structureNone.equals(usa.building)) {
				System.out.println("8.미국에  ▤  보유 중");
			}//빌딩 보유중
			else if(USA.structureNone.equals(usa.landmark)) {
				System.out.println("8.미국에  Å  보유 중");
			}//랜드마크 보유중

		}//미국


		if(Canada.name.equals(can.p1_own)) {
			if(Canada.structureNone.equals(can.building)) {
				System.out.println("9.캐나다에  ▤  보유 중");
			}//빌딩 보유중
			else if(Canada.structureNone.equals(can.landmark)) {
				System.out.println("9.캐나다에  Å  보유 중");
			}//랜드마크 보유중

		}//캐나다


		if(Mexico.name.equals(mex.p1_own)) {
			if(Mexico.structureNone.equals(mex.building)) {
				System.out.println("10.멕시코에  ▤  보유 중");
			}//빌딩 보유중
			else if(Mexico.structureNone.equals(mex.landmark)) {
				System.out.println("10.멕시코에  Å  보유 중");
			}//랜드마크 보유중

		}//멕시코


		if(Italy.name.equals(ita.p1_own)) {
			if(Italy.structureNone.equals(ita.building)) {
				System.out.println("11.이탈리아에  ▤  보유 중");
			}//빌딩 보유중
			else if(Italy.structureNone.equals(ita.landmark)) {
				System.out.println("11.이탈리아에  Å  보유 중");
			}//랜드마크 보유중

		}//이탈리아


		if(Swiss.name.equals(swi.p1_own)) {
			if(Swiss.structureNone.equals(swi.building)) {
				System.out.println("12.스위스에  ▤  보유 중");
			}//빌딩 보유중
			else if(Swiss.structureNone.equals(swi.landmark)) {
				System.out.println("12.스위스에  Å  보유 중");
			}//랜드마크 보유중

		}//스위스


		if(Vietnam.name.equals(vie.p1_own)) {
			if(Vietnam.structureNone.equals(vie.building)) {
				System.out.println("13.베트남에  ▤  보유 중");
			}//빌딩 보유중
			else if(Vietnam.structureNone.equals(vie.landmark)) {
				System.out.println("13.베트남에  Å  보유 중");
			}//랜드마크 보유중

		}//베트남



		if(Egypt.name.equals(egy.p1_own)) {
			if(Egypt.structureNone.equals(egy.building)) {
				System.out.println("14.이집트에  ▤  보유 중");
			}//빌딩 보유중
			else if(Egypt.structureNone.equals(egy.landmark)) {
				System.out.println("14.이집트에  Å  보유 중");
			}//랜드마크 보유중

		}//이집트
//			else{
//				System.out.println("독점 권을 행사 할수 있는 국가가 없습니다.");
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
				//System.out.println("☆☆☆"+kor.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(Korea.structureNone.equals(kor.landmark)) {
				p1_selectKorea=true;
				kor.landmark_building();
				//System.out.println("☆☆☆"+kor.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
		break;
		}//choice==1  한국
		
		else if(choice==2) {
			
			if(Japan.structureNone.equals(jap.building)) {
				p1_selectJapan=true;
				jap.building_landmark();
				//System.out.println("☆☆☆"+jap.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(Japan.structureNone.equals(jap.landmark)) {
				p1_selectJapan=true;
				jap.landmark_building();
				//System.out.println("☆☆☆"+jap.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;	
		}//choice==2 일본

		
		else if(choice==3) {
			
			if(China.structureNone.equals(chi.building)) {
				p1_selectChina=true;
				chi.building_landmark();
				//System.out.println("☆☆☆"+chi.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(China.structureNone.equals(chi.landmark)) {
				p1_selectChina=true;
				chi.landmark_building();
				//System.out.println("☆☆☆"+chi.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==3 china
		
		
		else if(choice==4) {
			
			if(England.structureNone.equals(eng.building)) {
				p1_selectEngland=true;
				eng.building_landmark();
				//System.out.println("☆☆☆"+eng.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(England.structureNone.equals(eng.landmark)) {
				p1_selectEngland=true;
				eng.landmark_building();
				//System.out.println("☆☆☆"+eng.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==4 eng
		
		
		else if(choice==5) {
			
			if(France.structureNone.equals(fra.building)) {
				p1_selectFrance=true;
				fra.building_landmark();
				//System.out.println("☆☆☆"+fra.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(France.structureNone.equals(fra.landmark)) {
				p1_selectFrance=true;
				fra.landmark_building();
				//System.out.println("☆☆☆"+fra.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}///랜드마크 + 빌딩
			
			break;
		}//choice==5 fra
		
		
		else if(choice==6) {
			
			if(Germany.structureNone.equals(ger.building)) {
				p1_selectGermany=true;
				ger.building_landmark();
				//System.out.println("☆☆☆"+ger.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(Germany.structureNone.equals(ger.landmark)) {
				p1_selectGermany=true;
				ger.landmark_building();
				//System.out.println("☆☆☆"+ger.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==6 ger
		
		
		else if(choice==7) {
			
			if(Russia.structureNone.equals(rus.building)) {
				p1_selectRussia=true;
				rus.building_landmark();
				//System.out.println("☆☆☆"+rus.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(Russia.structureNone.equals(rus.landmark)) {
				p1_selectRussia=true;
				rus.landmark_building();
				//System.out.println("☆☆☆"+rus.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==7 rus
		
		
		else if(choice==8) {
			
			if(USA.structureNone.equals(usa.building)) {
				p1_selectUSA=true;
				usa.building_landmark();
				//System.out.println("☆☆☆"+usa.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(USA.structureNone.equals(usa.landmark)) {
				p1_selectUSA=true;
				usa.landmark_building();
				//System.out.println("☆☆☆"+usa.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==8 usa
		
		
		else if(choice==9) {
			
			if(Canada.structureNone.equals(can.building)) {
				p1_selectCanada=true;
				can.building_landmark();
				//System.out.println("☆☆☆"+can.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(Canada.structureNone.equals(can.landmark)) {
				p1_selectCanada=true;
				can.landmark_building();
				//System.out.println("☆☆☆"+can.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==9 can
		
		
		else if(choice==10) {

			if(Mexico.structureNone.equals(mex.building)) {
				p1_selectMexico=true;
				mex.building_landmark();
				//System.out.println("☆☆☆"+mex.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(Mexico.structureNone.equals(mex.landmark)) {
				p1_selectMexico=true;
				mex.landmark_building();
				//System.out.println("☆☆☆"+mex.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==10 mex
		
		
		else if(choice==11) {
			
			if(Italy.structureNone.equals(ita.building)) {
				p1_selectItaly=true;
				ita.building_landmark();
				//System.out.println("☆☆☆"+ita.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(Italy.structureNone.equals(ita.landmark)) {
				p1_selectItaly=true;
				ita.landmark_building();
				//System.out.println("☆☆☆"+ita.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==2 ita
		
		
		else if(choice==12) {
			
			if(Swiss.structureNone.equals(swi.building)) {
				p1_selectSwiss=true;
				swi.building_landmark();
				//System.out.println("☆☆☆"+swi.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(Swiss.structureNone.equals(swi.landmark)) {
				p1_selectSwiss=true;
				swi.landmark_building();
				//System.out.println("☆☆☆"+swi.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==12 swi
		
		
		else if(choice==13) {
			
			if(Vietnam.structureNone.equals(vie.building)) {
				p1_selectVietnam=true;
				vie.building_landmark();
				//System.out.println("☆☆☆"+vie.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(Vietnam.structureNone.equals(vie.landmark)) {
				p1_selectVietnam=true;
				vie.landmark_building();
				//System.out.println("☆☆☆"+vie.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==13 vie
		
		
		else if(choice==14) {
			
			if(Egypt.structureNone.equals(egy.building)) {
				p1_selectEgypt=true;
				egy.building_landmark();
				//System.out.println("☆☆☆"+egy.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//빌딩 + 랜드마크
			else if(Egypt.structureNone.equals(egy.landmark)) {
				p1_selectEgypt=true;
				egy.landmark_building();
				//System.out.println("☆☆☆"+egy.travel+"에 대한 독점권을 얻었습니다☆☆☆");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==14 egy


		else if(choice==0){
			return;
		}
		
		else {
			//System.out.println("해당 되는 숫자가 없습니다. 다시 입력 해 주세요 :)");
		}//else
		
		}//while
	}//if moved==1
		Player.p1_moved =0;
	}//p1_start upgrade map
	
	
	public void upgrade_p2() {
		//먼저 타유저가 소유하고 있는지 아닌지 확인하는 조건  &&  내가 소유중인 국가중 독점되지 않는 맵
		//확인된 조건을 목록을 짜서 리스트로 뿌림
		//그중에 선택을 한다
		//소유하지 않은 맵일경우 랜덤을 돌려서 건설하는 건축물을 뽑고 턴을 종료
		//소유하는 맵일경우 독점권은 선언 하고 턴을 종료
		//빌딩을 소유할경우 랜드마크 건설
		//랜드마크를 소유할경우 빌딩을 건설
		
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
			//System.out.println("업그레이드 할수있는 국가목록");
			//System.out.println("목록을 확인하고 해당하는 업그레이드를 하고싶은 국가를 선택해주세요.");
			//System.out.println("목록을 확인 하고 해당 하는 업그레이드를 하고 싶은 국가를 선택 해주세요.");
			//System.out.println("===========================================");
		if(Korea.name.equals(kor.p2_own)) {
			if(Korea.structureNone.equals(kor.building)) {
				System.out.println("1.한국에  ▤  보유중");
			}//빌딩 보유중
			else if(Korea.structureNone.equals(kor.landmark)) {
				System.out.println("1.한국에  Å  보유중");
			}//랜드마크 보유중

		}//한국

		if(Japan.name.equals(jap.p2_own)) {
			if(Japan.structureNone.equals(jap.building)) {
				System.out.println("2.일본에  ▤  보유중");
			}//빌딩 보유중
			else if(Japan.structureNone.equals(jap.landmark)) {
				System.out.println("2.일본에  Å  보유중");
			}//랜드마크 보유중

		}//일본


		if(China.name.equals(chi.p2_own)) {
			if(China.structureNone.equals(chi.building)) {
				System.out.println("3.중국에  ▤  보유중");
			}//빌딩 보유중
			else if(China.structureNone.equals(chi.landmark)) {
				System.out.println("3.중국에  Å  보유중");
			}//랜드마크 보유중

		}//중국


		if(England.name.equals(eng.p2_own)) {
			if(England.structureNone.equals(eng.building)) {
				System.out.println("4.영국에  ▤  보유중");
			}//빌딩 보유중
			else if(England.structureNone.equals(eng.landmark)) {
				System.out.println("4.영국에  Å  보유중");
			}//랜드마크 보유중

		}//영국


		if(France.name.equals(fra.p2_own)) {
			if(France.structureNone.equals(fra.building)) {
				System.out.println("5.프랑스에  ▤  보유중");
			}//빌딩 보유중
			else if(France.structureNone.equals(fra.landmark)) {
				System.out.println("5.프랑스에  Å  보유중");
			}//랜드마크 보유중

		}//프랑스


		if(Germany.name.equals(ger.p2_own)) {
			if(Germany.structureNone.equals(ger.building)) {
				System.out.println("6.독일에  ▤  보유중");
			}//빌딩 보유중
			else if(Germany.structureNone.equals(ger.landmark)) {
				System.out.println("6.독일에  Å  보유중");
			}//랜드마크 보유중

		}//독일


		if(Russia.name.equals(rus.p2_own)) {
			if(Russia.structureNone.equals(rus.building)) {
				System.out.println("7.러시아에  ▤  보유중");
			}//빌딩 보유중
			else if(Russia.structureNone.equals(rus.landmark)) {
				System.out.println("7.러시아에  Å  보유중");
			}//랜드마크 보유중

		}//러시아


		if(USA.name.equals(usa.p2_own)) {
			if(USA.structureNone.equals(usa.building)) {
				System.out.println("8.미국에  ▤  보유중");
			}//빌딩 보유중
			else if(USA.structureNone.equals(usa.landmark)) {
				System.out.println("8.미국에  Å  보유중");
			}//랜드마크 보유중

		}//미국


		if(Canada.name.equals(can.p2_own)) {
			if(Canada.structureNone.equals(can.building)) {
				System.out.println("9.캐나다에  ▤  보유중");
			}//빌딩 보유중
			else if(Canada.structureNone.equals(can.landmark)) {
				System.out.println("9.캐나다에  Å  보유중");
			}//랜드마크 보유중

		}//캐나다


		if(Mexico.name.equals(mex.p2_own)) {
			if(Mexico.structureNone.equals(mex.building)) {
				System.out.println("10.멕시코에  ▤  보유중");
			}//빌딩 보유중
			else if(Mexico.structureNone.equals(mex.landmark)) {
				System.out.println("10.멕시코에  Å  보유중");
			}//랜드마크 보유중

		}//멕시코


		if(Italy.name.equals(ita.p2_own)) {
			if(Italy.structureNone.equals(ita.building)) {
				System.out.println("11.이탈리아에  ▤  보유중");
			}//빌딩 보유중
			else if(Italy.structureNone.equals(ita.landmark)) {
				System.out.println("11.이탈리아에  Å  보유중");
			}//랜드마크 보유중

		}//이탈리아


		if(Swiss.name.equals(swi.p2_own)) {
			if(Swiss.structureNone.equals(swi.building)) {
				System.out.println("12.스위스에  ▤  보유중");
			}//빌딩 보유중
			else if(Swiss.structureNone.equals(swi.landmark)) {
				System.out.println("12.스위스에  Å  보유중");
			}//랜드마크 보유중

		}//스위스
		

		if(Vietnam.name.equals(vie.p2_own)) {
			if(Vietnam.structureNone.equals(vie.building)) {
				System.out.println("13.베트남에  ▤  보유중");
			}//빌딩 보유중
			else if(Vietnam.structureNone.equals(vie.landmark)) {
				System.out.println("13.베트남에  Å  보유중");
			}//랜드마크 보유중

		}//베트남


		if(Egypt.name.equals(egy.p2_own)) {
			if(Egypt.structureNone.equals(egy.building)) {
				System.out.println("14.이집트에  ▤  보유중");
			}//빌딩 보유중
			else if(Egypt.structureNone.equals(egy.landmark)) {
				System.out.println("14.이집트에  Å  보유중");
			}//랜드마크 보유중

		}//이집트

		System.out.println("===========================================");

		Scanner scan = new Scanner(System.in);
		int choice;
		while(true) {
		
		choice=scan.nextInt();
		
		if(choice==1) {
			
			if(Korea.structureNone.equals(kor.building)) {
				p2_selectKorea=true;
				kor.building_landmark();
				//System.out.println("★★★"+kor.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(Korea.structureNone.equals(kor.landmark)) {
				p2_selectKorea=true;
				kor.landmark_building();
				//System.out.println("★★★"+kor.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
		break;
		}//choice==1  한국
		
		else if(choice==2) {
			
			if(Japan.structureNone.equals(jap.building)) {
				p2_selectJapan=true;
				jap.building_landmark();
				//System.out.println("★★★"+jap.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(Japan.structureNone.equals(jap.landmark)) {
				p2_selectJapan=true;
				jap.landmark_building();
				//System.out.println("★★★"+jap.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;	
		}//choice==2 일본

		
		else if(choice==3) {
			
			if(China.structureNone.equals(chi.building)) {
				p2_selectChina=true;
				chi.building_landmark();
				//System.out.println("★★★"+chi.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(China.structureNone.equals(chi.landmark)) {
				p2_selectChina=true;
				chi.landmark_building();
				//System.out.println("★★★"+chi.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==3 china
		
		
		else if(choice==4) {
			
			if(England.structureNone.equals(eng.building)) {
				p2_selectEngland=true;
				eng.building_landmark();
				//System.out.println("★★★"+eng.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(England.structureNone.equals(eng.landmark)) {
				p2_selectEngland=true;
				eng.landmark_building();
				//System.out.println("★★★"+eng.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==4 eng
		
		
		else if(choice==5) {
			
			if(France.structureNone.equals(fra.building)) {
				p2_selectFrance=true;
				fra.building_landmark();
				//System.out.println("★★★"+fra.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(France.structureNone.equals(fra.landmark)) {
				p2_selectFrance=true;
				fra.landmark_building();
				//System.out.println("★★★"+fra.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==5 fra
		
		
		else if(choice==6) {
			
			if(Germany.structureNone.equals(ger.building)) {
				p2_selectGermany=true;
				ger.building_landmark();
				//System.out.println("★★★"+ger.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(Germany.structureNone.equals(ger.landmark)) {
				p2_selectGermany=true;
				ger.landmark_building();
				//System.out.println("★★★"+ger.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==6 ger
		
		
		else if(choice==7) {
			
			if(Russia.structureNone.equals(rus.building)) {
				p2_selectRussia=true;
				rus.building_landmark();
				//System.out.println("★★★"+rus.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(Russia.structureNone.equals(rus.landmark)) {
				p2_selectRussia=true;
				rus.landmark_building();
				//System.out.println("★★★"+rus.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==7 rus
		
		
		else if(choice==8) {
			
			if(USA.structureNone.equals(usa.building)) {
				p2_selectUSA=true;
				usa.building_landmark();
				//System.out.println("★★★"+usa.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(USA.structureNone.equals(usa.landmark)) {
				p2_selectUSA=true;
				usa.landmark_building();
				//System.out.println("★★★"+usa.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==8 usa
		
		
		else if(choice==9) {
			
			if(Canada.structureNone.equals(can.building)) {
				p2_selectCanada=true;
				can.building_landmark();
				//System.out.println("★★★"+can.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(Canada.structureNone.equals(can.landmark)) {
				p2_selectCanada=true;
				can.landmark_building();
				//System.out.println("★★★"+can.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==9 can
		
		
		else if(choice==10) {
			
			if(Mexico.structureNone.equals(mex.building)) {
				p2_selectMexico=true;
				mex.building_landmark();
				//System.out.println("★★★"+mex.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(Mexico.structureNone.equals(mex.landmark)) {
				p2_selectMexico=true;
				mex.landmark_building();
				//System.out.println("★★★"+mex.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==10 mex
		
		
		else if(choice==11) {
			
			if(Italy.structureNone.equals(ita.building)) {
				p2_selectItaly=true;
				ita.building_landmark();
				//System.out.println("★★★"+ita.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(Italy.structureNone.equals(ita.landmark)) {
				p2_selectItaly=true;
				ita.landmark_building();
				//System.out.println("★★★"+ita.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==2 ita
		
		
		else if(choice==12) {
			
			if(Swiss.structureNone.equals(swi.building)) {
				p2_selectSwiss=true;
				swi.building_landmark();
				//System.out.println("★★★"+swi.travel+"에 대한 독점권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(Swiss.structureNone.equals(swi.landmark)) {
				p2_selectSwiss=true;
				swi.landmark_building();
				//System.out.println("★★★"+swi.travel+"에 대한 독점권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==12 swi
		
		
		else if(choice==13) {
			
			if(Vietnam.structureNone.equals(vie.building)) {
				p2_selectVietnam=true;
				vie.building_landmark();
				//System.out.println("★★★"+vie.travel+"에 대한 독점 권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(Vietnam.structureNone.equals(vie.landmark)) {
				p2_selectVietnam=true;
				vie.landmark_building();
				//System.out.println("★★★"+vie.travel+"에 대한 독점 권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==13 vie
		
		
		else if(choice==14) {
			
			if(Egypt.structureNone.equals(egy.building)) {
				p2_selectEgypt=true;
				egy.building_landmark();
				//System.out.println("★★★"+egy.travel+"에 대한 독점 권을 얻었습니다★★★");
			}//빌딩 + 랜드마크
			else if(Egypt.structureNone.equals(egy.landmark)) {
				p2_selectEgypt=true;
				egy.landmark_building();
				//System.out.println("★★★"+egy.travel+"에 대한 독점 권을 얻었습니다★★★");
			}//랜드마크 + 빌딩
			
			break;
		}//choice==14 egy
		
			else if(choice==0){
				return;
		}
		
		else {
			System.out.println("해당 되는 숫자가 없습니다. 다시 입력 해 주세요 :)");
		}//else
		
		}//while
		}//if moved==1
		Player.p2_moved =0;
	}//p2_start upgrade map
	
	
}//class
