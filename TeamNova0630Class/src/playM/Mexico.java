package playM;

public class Mexico  extends Countries{

	static String name ="¡¡¡¡¸ß½ÃÄÚ¡¡¡¡¡¡";
	static String own1p,own2p;
	String ownName	   ="¡¡¡¡¸ß½ÃÄÚ¡¡¡¡¡¡";
	String p1_own	   ="¡¡¡Ù¸ß½ÃÄÚ¡Ù¡¡¡¡";
	String p2_own	   ="¡¡¡Ú¸ß½ÃÄÚ¡Ú¡¡¡¡";
	String travel ="¸ß½ÃÄÚ";



	static boolean p1_successContract;
	static boolean p1_startOwnTheLand;
	static boolean p1_returnTheMapNaming;
	static boolean p1_movedOtherPlayerMap;
	static boolean p1_taxBuilding;
	static boolean p1_taxLandmark;
	static boolean p1_taxBuild_mark;
	static boolean p1_willTakeYourMap;
	static boolean p1_willTakeYourMapYes;
	static boolean p1_event;

	static boolean p2_successContract;
	static boolean p2_startOwnTheLand;
	static boolean p2_returnTheMapNaming;
	static boolean p2_movedOtherPlayerMap;
	static boolean p2_taxBuilding;
	static boolean p2_taxLandmark;
	static boolean p2_taxBuild_mark;
	static boolean p2_willTakeYourMap;
	static boolean p2_willTakeYourMapYes;
	static boolean p2_event;






	static String playerNone	="¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡";
			String playerBlank	="¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡";
			String player1		="¡¡¡¡¡Ù~¡¡¡¡¡¡¡¡¡¡¡¡";
			String player2		="¡¡¡¡¡¡¡¡¡¡¡¡¡Ú~¡¡¡¡";
			String player1_2 	="¡¡¡¡¡Ù~¡¡¡¡¡Ú~¡¡¡¡";
	String building  			="¡¡¡¡¢Ç¡¡¡¡¡¡¡¡¡¡";
	String landmark 			="¡¡¡¡¡¡¡¡¡¡¡Ê¡¡¡¡";
	String build_mark			="¡¡¡¡¢Ç¡¡¡¡¡Ê¡¡¡¡";
	static String structureNone ="¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡";

	
	static String value  		="¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡";
	static int buildingCost = 16;
	static int landmarkCost = 32;
	static int build_markCost=48;
	int cost;
	int contractNationYet=0;
	
	public void own1p() {
		
		name=name.replaceAll("¡¡¡¡¸ß½ÃÄÚ¡¡¡¡¡¡","¡¡¡Ù¸ß½ÃÄÚ¡Ù¡¡¡¡");
		
	}//own1p
	
	public void own2p() {
		
		name=name.replaceAll("¡¡¡¡¸ß½ÃÄÚ¡¡¡¡¡¡","¡¡¡Ú¸ß½ÃÄÚ¡Ú¡¡¡¡");
							    	
	}//own2p

	
	public void buyOwn1p() {
		
		name=name.replaceAll("¡¡¡Ù¸ß½ÃÄÚ¡Ù¡¡¡¡","¡¡¡Ú¸ß½ÃÄÚ¡Ú¡¡¡¡");
		
	}
	
	public void buyOwn2p() {
		name=name.replaceAll("¡¡¡Ú¸ß½ÃÄÚ¡Ú¡¡¡¡","¡¡¡Ù¸ß½ÃÄÚ¡Ù¡¡¡¡");
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


	public void p1_festivalInMexico(){
		Player player = new Player();
		TimeThread TT = new TimeThread();

		if(Player.p1_index==12 && TimeThread.Season.equals(TT.Fall)) {
			//System.out.println("¸ß½ÃÄÚ °»´ÜÀ» ¸¸³ª¼­ °¡Áö°í ÀÖ´Â ¼ÒÁö±ÝÀÇ ¹ÝÀ» °­Å» ´çÇß½À´Ï´Ù.");
			p1_event=true;
			Player.p1_cash = Player.p1_cash /2;
		}//p1_index==12 &&season.equals(Fall)
	}//p1_festival
	public void p2_festivalInMexico(){
		Player player = new Player();
		TimeThread TT = new TimeThread();

		if(Player.p2_index==12 && TimeThread.Season.equals(TT.Fall)) {
			//System.out.println("¸ß½ÃÄÚ °»´ÜÀ» ¸¸³ª¼­ °¡Áö°í ÀÖ´Â ¼ÒÁö±ÝÀÇ ¹ÝÀ» °­Å» ´çÇß½À´Ï´Ù.");
			p2_event=true;
			Player.p2_cash =(Player.p2_cash /2);
		}//p1_index==12 &&season.equals(Fall)
	}//p2_festival


}//class
