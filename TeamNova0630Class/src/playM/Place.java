package playM;

public class Place {
	//Place class는 맵을 표현하는 클래스중 최상위 클래스이다
	//모든 맵에서 공통적으로 사용되는 변수들을 표현했다.
	//모든맵에서 이루어질수있는 함수들을 넣었다.
	//지붕,플레이어 위치, 바닥
	//플레이어 위치는 항상 바뀔수 있기때문에 어떻게 표현할지 생각해야함
	//보드판을 표현하면서 나오는 빈칸들을 처리하기 위해 빈칸으로 이루어진 변수를 종류별로 생성해놓음.
	//플레이어 위치는 보통 빈칸으로 표현되어있다가 플레이어가 맵안에 들어오면 그 값을 미리 만들어놓은 변수로 교환하는 방식으로 구현.

	  //String roof   ="┌──────────┐";
		
		
		public String blank  	="　　　　　　　　";
		
		public String blankH	="　　　　";
		public String blankH1	="　　 　";

		public String blank2 ="　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　";

		
		public String blank1     ="　　　　";
		
		public String blank3    ="　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　";
		
		public String roof      ="┌──────────┐";
		
		public String floor     ="└──────────┘";
		
		public String roofR 	="┌──────────────────────────────────────────────────┐";
		
		public String floorR	="└──────────────────────────────────────────────────┘";
	
		
		String playerNone	="　　　　　　　　";
		String playerBlank	="　　　　　　　　";
		String player1		="　　☆~　　　　　　";
		String player2		="　　　　　　★~　　";
		String player1_2 	="　　☆~　　★~　　";
		String building  	="　　▤　　　　　";
		String landmark 	="　　　　　Å　　";
		String build_mark	="　　▤　　Å　　";
		String structureNone ="　　　　　　　　";
		
		
		
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
		

}//class
