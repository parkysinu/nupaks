package playM;

import java.util.Scanner;



public class Playboard {

	public void playboard() {  //보드판을 시각적으로 표현해주는 함수
							//원소 하나당 하나의 의미를 가진다 지붕,맵이름,지어져있는 건물현황,플레이어 위치,소유현황에 대해 알수있다.
							//맵이름과 건물현황 플레이어위치는 1차원 배열로 표현했다.
							//플레이어가 소유하고 있는 상황은 맵이름 우측에 표현한다.
							//플레이어가 이동하는것은 아직 미구현
							//배열값의 이동을 통해서 구현하고 싶은데 가능할지는 모르겠음.
							//맵이름을 모두 1차원 배열로 합쳐서 구현할지
							// 각각의 배열에 대입시키는 방법으로 구현할지 내가 할수있고 최대한 효율적으로 움직이게 만들어 보려고 노력해보자
							// 전에 만든 코드들이 다 망가져서 날라갔는데 왜그러는지 이유를 생각 잠깐잠깐 해보자.
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
		// 이 배열을 사용할수있을까
		//
		
		System.out.println("================================================================================================================================================");
		for(int i=0; i<9;i++) {
		if(i<6) {
			System.out.print(pla.roof+"　");
		}//게임보드
		else if(i==6) {
			System.out.print(pla.blank);
		}
		else if(i==7) {
			System.out.print(pla.roofR);
		}

		}//지붕
		System.out.println();
		
		
		String[] title5th = {Island.name, England.name, France.name, Germany.name, Russia.name, Taxx2.name};
		for(int i=0;i<8;i++) {
			if(i<6) {
			System.out.print(title5th[i]);
			}//L
			else if(i==6) {
				System.out.print("　　　"+pla.blank+"↓이벤트 중인 국가↓"+pla.blankH);
			}//mid중앙의 빈칸
			else if(i==7) {
				System.out.print("　　계　　절　 :"+ TimeThread.Season);
			}//R 우측의 텍스트 들어갈곳
		}//for//title5th
		System.out.println();
		
		
		String[] structure5th = {pla.blank, England.structureNone, France.structureNone, Germany.structureNone, Russia.structureNone,pla.blank};
		for(int i=0;i<8;i++) {
			if(i<6) {
				System.out.print(structure5th[i]);
			}//L
			else if(i==6) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==7) {
				System.out.print(pla.blank);
			}//R 우측의 텍스트 들어갈곳
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
				System.out.print("　　　　　중국　이탈리아　　　　　");
				}//봄일때 축제 중인 국가
				else if(TimeThread.Season.equals(TT.Summer)){
				System.out.print("　　　　　스위스　프랑스　　　　　");
				}
				else if(TimeThread.Season.equals(TT.Fall)){
				System.out.print("　　　　　멕시코　베트남　　　　　");
				}
				else if(TimeThread.Season.equals(TT.Winter)){
				System.out.print("　　　　한국　러시아　이집트　　　");
				}
			}//i==14
			else if(i==15){
				System.out.print("계절마다 이벤트가 발생하는 국가가 달라 집니다.");
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
			}//mid중앙의 빈칸
			else if(i==7) {
				System.out.print(pla.blank);
			}//R 우측의 텍스트 들어갈곳
		}
		//player index 5th
		System.out.println();
		
		
		
		
		
		for(int i=0; i<8;i++) {
			
			if(i<6) {
				System.out.print(pla.floor+"　");
			}//게임보드
			else if(i==6) {
				System.out.print(pla.blank);
			}
			else if(i==7) {
				System.out.print("플레이어　 　　　☆player 1☆　　　　　　　　　　★player 2★");
			}
		}  
		System.out.println();
		//floor5th  //floor5th  //floor5th  //floor5th  //floor5th  //floor5th		//floor5th  //floor5th  //floor5th  //floor5th  //floor5th  //floor5th
		//floor5th  //floor5th  //floor5th  //floor5th  //floor5th  //floor5th		//floor5th  //floor5th  //floor5th  //floor5th  //floor5th  //floor5th		//floor5th  //floor5th  //floor5th  //floor5th  //floor5th  //floor5th
		
		
		for(int i=0;i<5;i++) {
			if(i==0||i==2) {
				System.out.print(pla.roof+"　");
			}//i==0,i==2
			if(i==1) {
				System.out.print(pla.blank2+"　");
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==4) {
				System.out.print("소지금　　 　　　　"+ Player.p1_cash +"억원　　　　　　　　　　　　"+ Player.p2_cash +"억원");
			}//R 우측의 텍스트 들어갈곳
		}//4th roof
		System.out.println();
		
		
		String[] title4th = {China.name,pla.blank3, USA.name};
		for(int i=0;i<8;i++) {
			if(i<3) {
			System.out.print(title4th[i]);
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==4){
				System.out.print("　현재 위치　 　　　　");
			}
			else if(i==5) {
				//플레이어1의 위치를 알려 주는 조건문.
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

			}//R 우측의 텍스트 들어갈곳 //i==4
			else if(i==6){
				System.out.print(pla.blank+"　　　　　　");
			}
			else if(i==7){
				//플레이어 2의 위치를 알려주는 조건문
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

			}//i==6 우측의 플레이어 2의 위치를 알려 주는 조건 문
		}//title 4th
		System.out.println();
		
		String[] structure4th = {China.structureNone,pla.blank2, USA.structureNone};
		for(int i=0;i<8;i++) {
			if(i<3) {
			System.out.print(structure4th[i]);
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==4) {
				System.out.print(pla.blankH+"　　　　　　");
			}//R 우측의 텍스트 들어갈곳
//			else if(i==5){
//				if(player.p1_upMonopolized==0&&player.p1_downMonopolized==0&&player.p1_leftMonopolized==0&&player.p1_rightMonopolized==0){
//					System.out.print("독점 중인 라인 X");
//				}
//				else if(player.p1_upMonopolized==1){
//					System.out.print("윗 라인 독점 중");
//				}//상
//				else if(player.p1_downMonopolized==1){
//					System.out.print("아랫 라인 독점 중");
//				}//하
//				else if(player.p1_leftMonopolized==1){
//					System.out.print("좌측 라인 독점중");
//				}//좌
//				else if(player.p1_rightMonopolized==1){
//					System.out.print("우측 라인 독점 중");
//				}//우
//			}//p1_라인 독점 현황
//			else if(i==6){
//			System.out.print(pla.blank+"　");
//			}//i==6
//			else if(i==7){
//				if(player.p2_upMonopolized==0&&player.p2_downMonopolized==0&&player.p2_leftMonopolized==0&&player.p2_rightMonopolized==0){
//					System.out.print("독점 중인 라인 X");
//				}
//				else if(player.p2_upMonopolized==1){
//					System.out.print("윗 라인 독점 중");
//				}//상
//				else if(player.p2_downMonopolized==1){
//					System.out.print("아랫 라인 독점 중");
//				}//하
//				else if(player.p2_leftMonopolized==1){
//					System.out.print("좌측 라인 독점중");
//				}//좌
//				else if(player.p2_rightMonopolized==1){
//					System.out.print("우측 라인 독점 중");
//				}//우
//			}//i==7 p2_라인 독점 현황


		}//4층 건물 현황

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
					System.out.print("왼쪽 라인의 건물들의 가격이 10억 상승 했습니다.");
				}
				else if(IncreasingCost.structureInflationUp){
					System.out.print("위쪽 라인의 건물들의 가격이 10억 상승 했습니다.");
				}
				else if(IncreasingCost.structureInflationRight){
					System.out.print("오른쪽 라인의 건물들의 가격이 10억 상승 했습니다.");
				}
				else if(IncreasingCost.structureInflationDown){
					System.out.print("아래쪽 라인의 건물들의 가격이 10억 상승 했습니다.");
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
			}//mid중앙의 빈칸
			else if(i==4) {
				System.out.print("주사위 게이지 "+SuperDiceTime.player1Gage+"　　　　　"+SuperDiceTime.player2Gage);
			}//R 우측의 텍스트 들어갈곳
		}
		//player index 4th
		System.out.println();
		
		
		
		for(int i=0;i<6;i++) {
			if(i==0||i==2) {
			System.out.print(pla.floor+"　");
			}
			else if(i==1) {
			System.out.print(pla.blank2+"　");
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==4) {
				System.out.print("───────────────────────────────────────────────────");
			}//R 우측의 텍스트 들어갈곳


		}
		System.out.println();
		//4th floor//4th floor//4th floor//4th floor//4th floor//4th floor//4th floor
		//4th floor//4th floor//4th floor//4th floor//4th floor//4th floor//4th floor
		
		
		
		for(int i=0;i<5;i++) {
			if(i==0||i==2) {
				System.out.print(pla.roof+"　");
			}//i==0,i==2
			if(i==1) {


				if(TurnOver.p1_turnOver || TurnOver.p2_turnOver){

					System.out.print("　　1분동안 아무 행동도 진행하지 않아서 턴이 종료 되었습니다　　");


				}
				else {

					System.out.print(pla.blank2 + "　");
				}



			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid 중앙의 빈칸
			else if(i==4) {

				pbl.roof3rd();
			}//R 우측의 텍스트 들어갈 곳
		}//3rd roof
		System.out.println();
		
		
		String[] title3rd = {Japan.name,pla.blank3, Canada.name};
		for(int i=0;i<5;i++) {
			if(i<3) {
			System.out.print(title3rd[i]);
			}//L
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==4) {
				pbl.title3rd();
			}//R 우측의 텍스트 들어갈 곳
		}//title 3rd
		System.out.println();
		
		
		String[] structure3rd = {Japan.structureNone,pla.blank2, Canada.structureNone};
		for(int i=0;i<5;i++) {
			if(i<3) {
				System.out.print(structure3rd[i]);
			}//L
			else if(i==3) {
				System.out.print(pla.blank+"　　");
			}//mid중앙의 빈칸
			else if(i==4) {
				pbl.structure3rd();
			}//R 우측의 텍스트 들어갈곳
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
				System.out.print(pla.blank+"　　");
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
				System.out.print(pla.blank+"　　");
			}//mid중앙의 빈칸
			else if(i==4) {
				pbl.playerIndex3rd();
			}//R 우측의 텍스트 들어갈곳
			else if(i==5){

			}
		}
		//player index 3rd
		System.out.println();
		
		for(int i=0;i<5;i++) {
			if(i==0||i==2) {
			System.out.print(pla.floor+"　");
			}
			else if(i==1) {
			System.out.print(pla.blank2+"　");
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==4) {
				pbl.floor3rd_p1();
				pbl.floor3rd_p2();
			}//R 우측의 텍스트 들어갈곳
		}
		System.out.println();
	
		//3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor 
		//3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor //3rd  floor 
	
		
		for(int i=0;i<5;i++) {
			if(i==0||i==2) {
				System.out.print(pla.roof+"　");
			}//i==0,i==2
			if(i==1) {
				System.out.print(pla.blank2+"　");
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==4) {
				pbl.roof2nd_p1();
				pbl.roof2nd_p2();
			}//R 우측의 텍스트 들어갈곳
		}//2nd roof
		System.out.println();
		
		
		String[] title2nd = {Korea.name,pla.blank3, Mexico.name};
		for(int i=0;i<5;i++) {
			if(i<3) {
				System.out.print(title2nd[i]);
			}//L
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==4) {
				pbl.title2nd_p1();
				pbl.title2nd_p2();
			}//R 우측의 텍스트 들어갈곳
		}//title 2nd
		
		System.out.println();
		
		String[] structure2nd = {Korea.structureNone,pla.blank2, Mexico.structureNone};
		for(int i=0;i<5;i++) {
			if(i<3) {
				System.out.print(structure2nd[i]);
			}//L
			else if(i==3) {
				System.out.print(pla.blank+"　");
			}//mid중앙의 빈칸
			else if(i==4) {
				pbl.structure2nd_p1();
				pbl.structure2nd_p2();
			}//R 우측의 텍스트 들어갈곳
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
				System.out.print(pla.blank+"　　");
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
			}//mid중앙의 빈칸
			else if(i==4) {
				pbl.playerIndex2nd_p1();
				pbl.playerIndex2nd_p2();
			}//R 우측의 텍스트 들어갈곳
		}
		//player index 2nd
		System.out.println();
		
		for(int i=0;i<5;i++) {
			if(i==0||i==2) {
			System.out.print(pla.floor+"　");
			}
			else if(i==1) {
			System.out.print(pla.blank2+"　");
			}
			else if(i==3) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==4) {
				pbl.floor2nd_p1();
				pbl.floor2nd_p2();
			}//R 우측의 텍스트 들어갈곳
		}
		System.out.println();
	
		
		//2nd floor  //2nd floor  //2nd floor  //2nd floor  //2nd floor  //2nd floor  
		//2nd floor  //2nd floor  //2nd floor  //2nd floor  //2nd floor  //2nd floor  
		
	
		for(int i=0;i<8;i++) {
			if(i<6) {
				System.out.print(pla.roof+"　");
			}//L
			else if(i==6) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==7) {
				pbl.roof1st_p1();
				pbl.roof1st_p2();
			}//R 우측의 텍스트 들어갈곳
			}//1st roof
		System.out.println();
		
		
		String[] title1st = {Start.name, Egypt.name, Vietnam.name, Swiss.name, Italy.name,ball.name };
		for(int i=0;i<8;i++) {
			if(i<6) {
				System.out.print(title1st[i]);
			}//L
			else if(i==6) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==7) {
				pbl.title1st_p1();
				pbl.title1st_p2();
			}//R 우측의 텍스트 들어갈곳
		}//title 1st
		
		System.out.println();
		
		
		String[] structure1st = {pla.blank, Egypt.structureNone, Vietnam.structureNone, Swiss.structureNone, Italy.structureNone,pla.blank};
		
		for(int i=0;i<8;i++) {
			if(i<6) {
				System.out.print(structure1st[i]+"　");
			}//L
			else if(i==6) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==7) {
				pbl.structure1st_p1();
				pbl.structure1st_p2();
			}//R 우측의 텍스트 들어갈 곳
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
			}//우측의 텍스트 들어가는 곳
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
			}//mid중앙의 빈칸
			else if(i==7) {
				pbl.playerIndex1st_p1();
				pbl.playerIndex1st_p2();
			}//R 우측의 텍스트 들어갈곳
		}
		//player index 1st
		System.out.println();
		
		for(int i=0;i<8;i++) {
			if(i<6) {
				System.out.print(pla.floor+"　");
			}
			else if(i==6) {
				System.out.print(pla.blank);
			}//mid중앙의 빈칸
			else if(i==7) {
				System.out.print(pla.floorR);
			}//R 우측의 텍스트 들어갈곳
		}//1st floor
		System.out.println();
		System.out.println("=================================================================================================================================================");
		
		//first (1st) floor //first (1st) floor //first (1st) floor //first (1st) floor //first (1st) floor //first (1st) floor 
		//first (1st) floor //first (1st) floor //first (1st) floor //first (1st) floor //first (1st) floor 
	
	}//playBoard() 보드판
	
	
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
		
		
		System.out.println("┌─────────────────────────────────────────────────────────────────┐");
		System.out.println("　　　　　　　　　　　　　　 게임 메뉴얼　　　　　　　　　　　　　　　　");
		System.out.println();
		System.out.println("　1.2명이서 즐길 수 있다. 플레이어1은 ☆   플레이어2는 ★  말을 사용 한다.");
		System.out.println();
		System.out.println("　2.한 주사위 당 6까지의 눈을 가지고 주사위 2개를 굴려서 각 주사위의 합으로");
		System.out.println("　　  말들을 이동 시킬수 있다.");
		System.out.println();
		System.out.println("　3.플레이어 말이 이동 하고 각각의 국가 맵으로 가게 되면 비용 없이 국가 맵과");
		System.out.println("　　 계약을 맺게 된다.");
		System.out.println();
		System.out.println("　4.시작할 때 각 플레이어는 100억씩 받게 된다.");
		System.out.println();
		System.out.println("　5.플레이어가 계약을 유지하고 있는 맵에 재 방문을 하게 될 경우 국가에 대한 ");
		System.out.println("　　독점 권을 얻게 된다.");
		System.out.println();
		System.out.println("　6.플레이어 1이 플레이어2가 소유하고 있는 맵에 가게 되면 통행료를 지불 해야");
		System.out.println("　　 한다.");
		System.out.println();
		System.out.println("　7.국가와 계약을 맺고 일정한 확률로  ▤(빌딩)이나 Å(랜드 마크)를 건설 한다.");
		System.out.println();
		System.out.println("　8.각 플레이어들은 상대 플레이어가 계약한 맵에 도착 하게 되면 빌딩 현황에");
		System.out.println("　　따라서 통행료를 지불 하게 된다.  ");
		System.out.println();
		System.out.println();
		System.out.println("　9.각 맵의 끝에 있는 이벤트 맵에 도착하면 이벤트를 진행할수있다.");
		System.out.println();
		System.out.println("　10.상대 플레이어가 파산 하거나 10턴이 지나게 되면,게임이 종료 되고 ");
		System.out.println("　　보유 하고 있는 건물과 현금 현황을 종합 해서 승리와 패배를 볼수 있다.");
		System.out.println();
		System.out.println("└───────────────────────────────────────────────────────────────┘");
		System.out.println();
		System.out.println();
		System.out.println("　　　　　　　　아무키나 누르시면 게임을 시작합니다.");
		System.out.println();

		Scanner scan= new Scanner(System.in);
		String go;
		go=scan.nextLine();
	
	}//op
	
	
}//class
