package playM;

public class Taxx2 extends Place{

	static String name ="　　통행료x2　　　";
	String player1="　　☆~　　　　　　";
	String player2="　　　　　　★~　　";
	String player1_2="　　☆~　　★~　　";
	String player2_1="　　☆~　　★~　　";
	String playerBlank	="　　　　　　　　";
	static String playerNone="　　　　　　　　";
	String travel ="통행료x2";
	
	
	
	
	
	
	
	
	
	
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
	
	
	
	public void vistX2() {//모든 통행세가 2배가 되게 효과 적용

		Korea kor = new Korea();
		Japan jap = new Japan();
		China chi = new China();

		England eng = new England();
		France fra = new France();
		Germany ger = new Germany();
		Russia rus = new Russia();

		USA usa = new USA();
		Canada can = new Canada();
		Mexico mex = new Mexico();

		Italy ita =new Italy();
		Swiss swi = new Swiss();
		Vietnam vie =new Vietnam();
		Egypt egy = new Egypt();


		
	//	Countries.buildingCost=Countries.buildingCost*2;
	//	Countries.landmarkCost=Countries.landmarkCost*4;
	//	Countries.build_markCost=6*Countries.build_markCost;
		if(PlayboardLog.p1_turn){
			PlayboardLog.p1_placing_taxx2=true;
		}
		else if(PlayboardLog.p2_turn){
			PlayboardLog.p2_placing_taxx2=true;
		}


		Korea.buildingCost = Korea.buildingCost *2;
	 	Korea.landmarkCost = Korea.landmarkCost *2;
	 	Korea.build_markCost = Korea.build_markCost *2;
	 	//한국 통행료

		Japan.buildingCost = Japan.buildingCost *2;
		Japan.landmarkCost = Japan.landmarkCost *2;
		Japan.build_markCost = Japan.build_markCost *2;
		//jap 통행료

		China.buildingCost = China.buildingCost *2;
		China.landmarkCost = China.landmarkCost *2;
		China.build_markCost = China.build_markCost *2;
		//chi 통행료



		England.buildingCost = England.buildingCost *2;
		England.landmarkCost = England.landmarkCost *2;
		England.build_markCost = England.build_markCost *2;
		//eng 통행료

		France.buildingCost = France.buildingCost *2;
		France.landmarkCost = France.landmarkCost *2;
		France.build_markCost = France.build_markCost *2;
		//fra 통행료

		Germany.buildingCost = Germany.buildingCost *2;
		Germany.landmarkCost = Germany.landmarkCost *2;
		Germany.build_markCost = Germany.build_markCost *2;
		//ger 통행료

		Russia.buildingCost = Russia.buildingCost *2;
		Russia.landmarkCost = Russia.landmarkCost *2;
		Russia.build_markCost = Russia.build_markCost *2;
		//rus 통행료



		USA.buildingCost = USA.buildingCost *2;
		USA.landmarkCost = USA.landmarkCost *2;
		USA.build_markCost = USA.build_markCost *2;
		//usa 통행료

		Canada.buildingCost = Canada.buildingCost *2;
		Canada.landmarkCost = Canada.landmarkCost *2;
		Canada.build_markCost = Canada.build_markCost *2;
		//can 통행료

		Mexico.buildingCost = Mexico.buildingCost *2;
		Mexico.landmarkCost = Mexico.landmarkCost *2;
		Mexico.build_markCost = Mexico.build_markCost *2;
		//mex 통행료



		Italy.buildingCost = Italy.buildingCost *2;
		Italy.landmarkCost = Italy.landmarkCost *2;
		Italy.build_markCost = Italy.build_markCost *2;
		//ita 통행료

		Swiss.buildingCost = Swiss.buildingCost *2;
		Swiss.landmarkCost = Swiss.landmarkCost *2;
		Swiss.build_markCost = Swiss.build_markCost *2;
		//swi 통행료

		Vietnam.buildingCost = Vietnam.buildingCost *2;
		Vietnam.landmarkCost = Vietnam.landmarkCost *2;
		Vietnam.build_markCost = Vietnam.build_markCost *2;
		//vie 통행료

		Egypt.buildingCost = Egypt.buildingCost *2;
		Egypt.landmarkCost = Egypt.landmarkCost *2;
		Egypt.build_markCost = Egypt.build_markCost *2;
		//egy 통행료

	}//통행세 2배맵 방문 효과
	
	
	
	
	
	
	
}//class
