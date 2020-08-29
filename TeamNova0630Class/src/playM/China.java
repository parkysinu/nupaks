package playM;

import java.sql.Time;

public class China  extends Countries{


	static String name ="　　중국　　　";
	static String own1p,own2p;
	String ownName ="　　중국　　　";
	String p1_own  ="　☆중국☆　　　";
	String p2_own  ="　★중국★　　　";
	static String playerNone	="　　　　　　　　";
	String playerBlank	="　　　　　　　　";
	String player1		="　　☆~　　　　　　";
	String player2		="　　　　　　★~　　";
	String player1_2 	="　　☆~　　★~　　";
	String building  	="　　▤　　　　　";
	String landmark 	="　　　　　Å　　";
	String build_mark	="　　▤　　Å　　";
	static String structureNone ="　　　　　　　　";
	String travel ="중국";
	static String value  		="　　　　　　　　";


	static boolean p1_successContract;
	static boolean p1_startOwnTheLand;
	static boolean p1_returnTheMapNaming;
	static boolean p1_movedOtherPlayerMap;
	static boolean p1_taxBuilding;
	static boolean p1_taxLandmark;
	static boolean p1_taxBuild_mark;
	static boolean p1_willTakeYourMap;
	static boolean p1_willTakeYourMapYes;
	static boolean p1_chinaEvent;

	static boolean p2_successContract;
	static boolean p2_startOwnTheLand;
	static boolean p2_returnTheMapNaming;
	static boolean p2_movedOtherPlayerMap;
	static boolean p2_taxBuilding;
	static boolean p2_taxLandmark;
	static boolean p2_taxBuild_mark;
	static boolean p2_willTakeYourMap;
	static boolean p2_willTakeYourMapYes;
	static boolean p2_chinaEvent;





	static int buildingCost = 20;
	static int landmarkCost = 40;
	static int build_markCost=60;
	int cost;
	int contractNationYet=0;
	
	public void own1p() {
		
		name=name.replaceAll("　　중국　　　","　☆중국☆　　　");
		
	}//own1p
	
	public void own2p() {
		
		name=name.replaceAll("　　중국　　　","　★중국★　　　");
							    	
	}//own2p

	public void buyOwn1p() {
		
		name=name.replaceAll("　☆중국☆　　　","　★중국★　　　");
		
	}
	
	public void buyOwn2p() {
		name=name.replaceAll("　★중국★　　　","　☆중국☆　　　");
	}

	public void p1_noneContract(){

		name=name.replaceAll("　☆중국☆　　　","　　중국　　　");

	}
	public void p2_noneContract(){

		name=name.replaceAll("　★중국★　　　","　　중국　　　");

	}
	//소유 권한 변경
		
		
	
	
	public void building() {
		
		structureNone=structureNone.replaceAll("　　　　　　　　","　　▤　　　　　");

	}//building replaceALl
	
	public void landmark() {
		
		structureNone=structureNone.replaceAll("　　　　　　　　","　　　　　Å　　");
		
	}//landmark replaceAll
	
	public void build_mark() {
		
		
		structureNone=structureNone.replaceAll("　　　　　　　　","　　▤　　Å　　");
		
	}//build_mark replaceAll
	
	public void building_landmark() {
		
		structureNone=structureNone.replaceAll("　　▤　　　　　","　　▤　　Å　　");

	}//building replaceALl
	
	public void landmark_building() {
		
		structureNone=structureNone.replaceAll("　　　　　Å　　","　　▤　　Å　　");

	}//building replaceALl


	public void build_none(){

		structureNone=structureNone.replaceAll("　　▤　　　　　","　　　　　　　　");

	}
	public void land_none(){

		structureNone=structureNone.replaceAll("　　　　　Å　　","　　　　　　　　");

	}
	public void buildMark_none(){

		structureNone=structureNone.replaceAll("　　▤　　Å　　","　　　　　　　　");

	}
	//건물 현황 메소드
		
		
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

	public void calculateCost() {

		if (structureNone.equals(building)) {
			cost = buildingCost;
			System.out.print(cost);
		} else if (structureNone.equals(landmark)) {
			cost = landmarkCost;
			System.out.print(cost);
		} else if (structureNone.equals(build_mark)) {
			cost = build_markCost;
			System.out.print(cost);
		}
	}//calculateCost

	public void p1_festivalInChina(){
		Player player = new Player();
		TimeThread TT = new TimeThread();



		if(TurnOver.p1_turnOver){
			return;
		}//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.
		if(TimeThread.Season.equals(TT.Spring)&& Player.p1_index ==3){

			if(name.equals(own1p)){

				//System.out.println("개혁 정책으로 현재 가지고 있는 건축물들이 일방적으로 철거 되었습니다.");
				p1_chinaEvent=true;
				if(structureNone.equals(building)){
					p1_noneContract();
					build_none();
				}
				else if(structureNone.equals(landmark)){
					p1_noneContract();
					land_none();
				}

			}//own_1p


		}//p1_index==3  ///tt.season.equals(spring)

	}	//festival in China


	public void p2_festivalInChina(){
		Player player = new Player();
		TimeThread TT = new TimeThread();

		if(TurnOver.p2_turnOver){
			return;
		}//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.

		if(TimeThread.Season.equals(TT.Spring)&& Player.p2_index ==3){

			if(name.equals(own2p)){
				p2_chinaEvent=true;
				//System.out.println("개혁 정책으로 현재 가지고 있는 건축 물들이 일방적으로 철거 되었습니다.");

				if(structureNone.equals(building)){
					p2_noneContract();
					build_none();
				}
				else if(structureNone.equals(landmark)){
					p2_noneContract();
					land_none();
				}
				else if(structureNone.equals(build_mark)){
					p2_noneContract();
					buildMark_none();
				}
			}//own_2p


		}//p2_index==3  ///tt.season.equals(spring)

	}	//festival in China



}//class
