package playM;

public class France  extends Countries{

	
	static String name ="　　覗櫛什　　　";
	static String own1p,own2p;
	String ownName ="　　覗櫛什　　　";
	String p1_own  ="　』覗櫛什』　　　";
	String p2_own  ="　【覗櫛什【　　　";
	static String playerNone	="　　　　　　　　";
	String playerBlank	="　　　　　　　　";
	String player1		="　　』~　　　　　　";
	String player2		="　　　　　　【~　　";
	String player1_2 	="　　』~　　【~　　";
	String building  	="　　�如　　　　�";
	String landmark 	="　　　　　（　　";
	String build_mark	="　　�如　　福　�";
	static String structureNone ="　　　　　　　　";
	String travel ="覗櫛什";




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
	static int buildingCost = 13;
	static int landmarkCost = 26;
	static int build_markCost=39;
	int cost;
	int contractNationYet=0;
	
	
	public void own1p() {
		
		name=name.replaceAll("　　覗櫛什　　　","　』覗櫛什』　　　");
		
	}//own1p
	
	public void own2p() {
		
		name=name.replaceAll("　　覗櫛什　　　","　【覗櫛什【　　　");
							    	
	}//own2p

	
	public void buyOwn1p() {
		
		name=name.replaceAll("　』覗櫛什』　　　","　【覗櫛什【　　　");
		
	}
	
	public void buyOwn2p() {
		name=name.replaceAll("　【覗櫛什【　　　","　』覗櫛什』　　　");
	}
	
	//社政 映廃 痕井
	
	
	
	public void building() {
		
		structureNone=structureNone.replaceAll("　　　　　　　　","　　�如　　　　�");

	}//building replaceALl
	
	public void landmark() {
		
		structureNone=structureNone.replaceAll("　　　　　　　　","　　　　　（　　");
		
	}//landmark replaceAll
	
	public void build_mark() {
		
		
		structureNone=structureNone.replaceAll("　　　　　　　　","　　�如　　福　�");
		
	}//build_mark replaceAll
	
	public void building_landmark() {
		
		structureNone=structureNone.replaceAll("　　�如　　　　�","　　�如　　福　�");

	}//building replaceALl
	
	public void landmark_building() {
		
		structureNone=structureNone.replaceAll("　　　　　（　　","　　�如　　福　�");

	}//building replaceALl
	
	
	//闇弘 薄伐 五社球
	
	
	public void player1() {
		
		playerNone=playerNone.replaceAll("　　　　　　　　","　　』~　　　　　　");
		
	}//player1
	
	public void player2() {
		
		playerNone=playerNone.replaceAll("　　　　　　　　","　　　　　　【~　　");
							  //"   今闘害【~    ","   今闘害【~    	"
	}//player2
	
	public void player1_2() {
		
		playerNone=playerNone.replaceAll("　　』~　　　　　　","　　』~　　【~　　");
		
	}//player1_2

	public void player2_1() {
		
		playerNone=playerNone.replaceAll("　　　　　　【~　　","　　』~　　【~　　");
		
	}//player2_1
	//更叫拭 幻級醸澗走 猿股製 2p亜 胡煽 亀鐸廃 雌殿拭辞 1p亜 亀鐸敗

	public void player1_None() {
		
		playerNone=playerNone.replaceAll("　　』~　　　　　　","　　　　　　　　");
							  //"   今闘害【~    ","   今闘害【~    	"
	}//player1_None
	
	public void player2_None() {
		
		playerNone=playerNone.replaceAll("　　　　　　【~　　","　　　　　　　　");
							  //"   今闘害【~    ","   今闘害【~    	"
	}//player2_None
	public void player12_1() {
		playerNone=playerNone.replaceAll("　　』~　　【~　　","　　』~　　　　　　");
	}//player12_1
	
	public void player12_2() {
		playerNone=playerNone.replaceAll("　　』~　　【~　　","　　　　　　【~　　");
	}//player12_2
	
	//巴傾戚嬢 疎妊 戚疑 敗呪
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


	public void festivalInFrance(){


	}


}//class
