package playM;

public class France  extends Countries{

	
	static String name ="¡¡¡¡ÇÁ¶û½º¡¡¡¡¡¡";
	static String own1p,own2p;
	String ownName ="¡¡¡¡ÇÁ¶û½º¡¡¡¡¡¡";
	String p1_own  ="¡¡¡ÙÇÁ¶û½º¡Ù¡¡¡¡¡¡";
	String p2_own  ="¡¡¡ÚÇÁ¶û½º¡Ú¡¡¡¡¡¡";
	static String playerNone	="¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡";
	String playerBlank	="¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡";
	String player1		="¡¡¡¡¡Ù~¡¡¡¡¡¡¡¡¡¡¡¡";
	String player2		="¡¡¡¡¡¡¡¡¡¡¡¡¡Ú~¡¡¡¡";
	String player1_2 	="¡¡¡¡¡Ù~¡¡¡¡¡Ú~¡¡¡¡";
	String building  	="¡¡¡¡¢Ç¡¡¡¡¡¡¡¡¡¡";
	String landmark 	="¡¡¡¡¡¡¡¡¡¡¡Ê¡¡¡¡";
	String build_mark	="¡¡¡¡¢Ç¡¡¡¡¡Ê¡¡¡¡";
	static String structureNone ="¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡";
	String travel ="ÇÁ¶û½º";




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






	static String value  		="¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡";
	static int buildingCost = 13;
	static int landmarkCost = 26;
	static int build_markCost=39;
	int cost;
	int contractNationYet=0;
	
	
	public void own1p() {
		
		name=name.replaceAll("¡¡¡¡ÇÁ¶û½º¡¡¡¡¡¡","¡¡¡ÙÇÁ¶û½º¡Ù¡¡¡¡¡¡");
		
	}//own1p
	
	public void own2p() {
		
		name=name.replaceAll("¡¡¡¡ÇÁ¶û½º¡¡¡¡¡¡","¡¡¡ÚÇÁ¶û½º¡Ú¡¡¡¡¡¡");
							    	
	}//own2p

	
	public void buyOwn1p() {
		
		name=name.replaceAll("¡¡¡ÙÇÁ¶û½º¡Ù¡¡¡¡¡¡","¡¡¡ÚÇÁ¶û½º¡Ú¡¡¡¡¡¡");
		
	}
	
	public void buyOwn2p() {
		name=name.replaceAll("¡¡¡ÚÇÁ¶û½º¡Ú¡¡¡¡¡¡","¡¡¡ÙÇÁ¶û½º¡Ù¡¡¡¡¡¡");
	}
	
	//¼ÒÀ¯ ±ÇÇÑ º¯°æ
	
	
	
	public void building() {
		
		structureNone=structureNone.replaceAll("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡","¡¡¡¡¢Ç¡¡¡¡¡¡¡¡¡¡");

	}//building replaceALl
	
	public void landmark() {
		
		structureNone=structureNone.replaceAll("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡","¡¡¡¡¡¡¡¡¡¡¡Ê¡¡¡¡");
		
	}//landmark replaceAll
	
	public void build_mark() {
		
		
		structureNone=structureNone.replaceAll("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡","¡¡¡¡¢Ç¡¡¡¡¡Ê¡¡¡¡");
		
	}//build_mark replaceAll
	
	public void building_landmark() {
		
		structureNone=structureNone.replaceAll("¡¡¡¡¢Ç¡¡¡¡¡¡¡¡¡¡","¡¡¡¡¢Ç¡¡¡¡¡Ê¡¡¡¡");

	}//building replaceALl
	
	public void landmark_building() {
		
		structureNone=structureNone.replaceAll("¡¡¡¡¡¡¡¡¡¡¡Ê¡¡¡¡","¡¡¡¡¢Ç¡¡¡¡¡Ê¡¡¡¡");

	}//building replaceALl
	
	
	//°Ç¹° ÇöÈ² ¸Þ¼Òµå
	
	
	public void player1() {
		
		playerNone=playerNone.replaceAll("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡","¡¡¡¡¡Ù~¡¡¡¡¡¡¡¡¡¡¡¡");
		
	}//player1
	
	public void player2() {
		
		playerNone=playerNone.replaceAll("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡","¡¡¡¡¡¡¡¡¡¡¡¡¡Ú~¡¡¡¡");
							  //"   º£Æ®³²¡Ú~    ","   º£Æ®³²¡Ú~    	"
	}//player2
	
	public void player1_2() {
		
		playerNone=playerNone.replaceAll("¡¡¡¡¡Ù~¡¡¡¡¡¡¡¡¡¡¡¡","¡¡¡¡¡Ù~¡¡¡¡¡Ú~¡¡¡¡");
		
	}//player1_2

	public void player2_1() {
		
		playerNone=playerNone.replaceAll("¡¡¡¡¡¡¡¡¡¡¡¡¡Ú~¡¡¡¡","¡¡¡¡¡Ù~¡¡¡¡¡Ú~¡¡¡¡");
		
	}//player2_1
	//¹¹¶«¿¡ ¸¸µé¾ú´ÂÁö ±î¸ÔÀ½ 2p°¡ ¸ÕÀú µµÂøÇÑ »óÅÂ¿¡¼­ 1p°¡ µµÂøÇÔ

	public void player1_None() {
		
		playerNone=playerNone.replaceAll("¡¡¡¡¡Ù~¡¡¡¡¡¡¡¡¡¡¡¡","¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
							  //"   º£Æ®³²¡Ú~    ","   º£Æ®³²¡Ú~    	"
	}//player1_None
	
	public void player2_None() {
		
		playerNone=playerNone.replaceAll("¡¡¡¡¡¡¡¡¡¡¡¡¡Ú~¡¡¡¡","¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
							  //"   º£Æ®³²¡Ú~    ","   º£Æ®³²¡Ú~    	"
	}//player2_None
	public void player12_1() {
		playerNone=playerNone.replaceAll("¡¡¡¡¡Ù~¡¡¡¡¡Ú~¡¡¡¡","¡¡¡¡¡Ù~¡¡¡¡¡¡¡¡¡¡¡¡");
	}//player12_1
	
	public void player12_2() {
		playerNone=playerNone.replaceAll("¡¡¡¡¡Ù~¡¡¡¡¡Ú~¡¡¡¡","¡¡¡¡¡¡¡¡¡¡¡¡¡Ú~¡¡¡¡");
	}//player12_2
	
	//ÇÃ·¹ÀÌ¾î ÁÂÇ¥ ÀÌµ¿ ÇÔ¼ö
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
