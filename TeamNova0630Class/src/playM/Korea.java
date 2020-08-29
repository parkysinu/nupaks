package playM;

public class Korea  extends Countries{

	static String name ="　　한국　　　";
	static String own1p,own2p;
	String ownName ="　　한국　　　";
	String p1_own  ="　☆한국☆　　　";
	String p2_own  ="　★한국★　　　";
	static String playerNone	="　　　　　　　　";
	String playerBlank			="　　　　　　　　";
	String player1				="　　☆~　　　　　　";
	String player2				="　　　　　　★~　　";
	static String player1_2 	="　　☆~　　★~　　";

	String building  	="　　▤　　　　　";
	String landmark 	="　　　　　Å　　";
	String build_mark	="　　▤　　Å　　";
	String structureBlank 		="　　　　　　　　";
	static String structureNone ="　　　　　　　　";
	
	String travel ="한국";



	static boolean p1_successContract;
	static boolean p1_startOwnTheLand;
	static boolean p1_returnTheMapNaming;
	static boolean p1_movedOtherPlayerMap;
	static boolean p1_taxBuilding;
	static boolean p1_taxLandmark;
	static boolean p1_taxBuild_mark;
	static boolean p1_willTakeYourMap;
	static boolean p1_willTakeYourMapYes;

	static boolean p2_successContract;
	static boolean p2_startOwnTheLand;
	static boolean p2_returnTheMapNaming;
	static boolean p2_movedOtherPlayerMap;
	static boolean p2_taxBuilding;
	static boolean p2_taxLandmark;
	static boolean p2_taxBuild_mark;
	static boolean p2_willTakeYourMap;
	static boolean p2_willTakeYourMapYes;



	static String value  		="　　　　　　　　";
	static int buildingCost = 20;
	static int landmarkCost = 40;
	static int build_markCost=60;
	static int p1_koreanLock=0;
	static int p2_koreanLock=0;
	int cost;
	int contractNationYet=0;
	
	public void own1p() {
		
		name=name.replaceAll("　　한국　　　","　☆한국☆　　　");
		
	}//own1p
	
	public void own2p() {
		
		name=name.replaceAll("　　한국　　　","　★한국★　　　");
							    	
	}//own2p

	public void buyOwn1p() {
		
		name=name.replaceAll("　☆한국☆　　　","　★한국★　　　");
		
	}
	
	public void buyOwn2p() {
		name=name.replaceAll("　★한국★　　　","　☆한국☆　　　");
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
		
		
		//건물 현황 메소드
		
		
		
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


	public void festivalIntKorea(){

			System.out.println("현재 명절 기간에 한국에 도착 해서 교통 체증 으로 인해 다른 국가로 이동을 할수 없습니다.");
			if(p1_koreanLock==1){
				p1_koreanLock=0;
			}
			else if(p2_koreanLock==1){
				p2_koreanLock=0;
			}

	}//festivalInKorea



}//class
