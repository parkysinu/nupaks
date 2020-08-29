package playM;

import java.sql.Time;
import java.util.Scanner;

public class England  extends Countries{

	static String name ="　　　영국　　　";
	static String own1p,own2p;
	String ownName ="　　　영국　　　";
	String p1_own  ="　☆영국☆　　";
	String p2_own  ="　★영국★　　";
	static String playerNone	="　　　　　　　　";
	String playerBlank	="　　　　　　　　";
	String player1		="　　☆~　　　　　　";
	String player2		="　　　　　　★~　　";
	String player1_2 	="　　☆~　　★~　　";
	String building  	="　　▤　　　　　";
	String landmark 	="　　　　　Å　　";
	String build_mark	="　　▤　　Å　　";
	static String structureNone ="　　　　　　　　";
	String travel ="영국";




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
		
		name=name.replaceAll("　　　영국　　　","　☆영국☆　　");
		
	}//own1p
	
	public void own2p() {
		
		name=name.replaceAll("　　　영국　　　","　★영국★　　");
							    	
	}//own2p

	public void buyOwn1p() {
		
		name=name.replaceAll("　☆영국☆　　","　★영국★　　");
		
	}
	
	public void buyOwn2p() {
		name=name.replaceAll("　★영국★　　","　☆영국☆　　");
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



	public void p1_ContractCanada(){
		//실패한 로직에 대한 코드가 없음.
		//p2의 코드가 존재 x
		//출력 되는 문장들을 좀더 다듬을 필요가 있음.
		Playboard playboard = new Playboard();
		Dice dice = new Dice();
		Canada can =new Canada();
		Player player = new Player();
		Scanner scan = new Scanner(System.in);
		TimeThread TT =new TimeThread();
		String ok ="dd";
		String ok1 = "ㅇㅇ";
		String ok2 = "DD";
		String no = "ss";
		String no1 = "ㄴㄴ";
		String no2 = "SS";
		String choice;


		if(TurnOver.p1_turnOver){
			return;
		}//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.

		if(Player.p1_index ==5 && TimeThread.Season.equals(TT.Winter)) {
			//System.out.println("'dd','DD','ㅇㅇ' 중 하나를 입력 하면 영국이 플레이어와 캐나다가 계약을 할수 있게 도와 줍니다.");
			//System.out.println("수락을 해도 10%의 확률로 계약이 성립 됩니다.");
			PlayboardLog.p1_england_event=true;
			playboard.playboard();
			choice = scan.nextLine();
			if(choice.equals(ok)||choice.equals(ok1)||choice.equals(ok2)) {
				dice.contractCanada();
				if (dice.dice3 == 0) {
					PlayboardLog.p1_england_event_1=true;
					playboard.playboard();
					//System.out.println("10%의 확률로 캐나다와 계약을 하게 되었 습니다.");
					if (Canada.name.equals(can.ownName)) {
						//System.out.println("계약 착수 금이 10억 소모 됩니다. 계속 하시겠 습니까?");
						//System.out.println("'dd','DD','ㅇㅇ' 중 하나를 입력 하면 계약이 성사 됩니다.");
						PlayboardLog.p1_england_event_2=true;
						playboard.playboard();
						choice = scan.nextLine();
						if (choice.equals(ok) || choice.equals(ok1) || choice.equals(ok2)) {
							can.own1p();
							//System.out.println("☆☆☆" + can.travel + "와 계약 했습니다☆☆☆");
							if (structureNone.equals(structureNone)) {
								dice.buyStructure();
								if (dice.dice3 == 3) {
									can.landmark();
									Player.p1_mountOfLandmark = Player.p1_mountOfLandmark + 1;
									Player.p1_cash = Player.p1_cash -10;
									PlayboardLog.p1_england_event_3=true;
									//랜드마크 건설 성공
								}//dice3==3 (주사위 값이 3일때 랜드 마크 ㄱ)
								else if (dice.dice3 >= 0 && dice.dice3 < 3) {
									can.building();
									Player.p1_mountOfBuilding = Player.p1_mountOfBuilding + 1;
									Player.p1_cash = Player.p1_cash -10;
									PlayboardLog.p1_england_event_4=true;
									//빌딩 건설 성공
								}//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)

							}//건축 물이 아무 것도 없다면,
						}//10퍼센트의 확률을 뚫고 계약 성사 직전 까지 와서 계약 착수 금을 내는 것에 대한 선택
					}//캐나다가 현재 계약중 인 플레이어가 없는 경우
						else if (Canada.name.equals(Canada.own2p)) {
						if(Canada.structureNone.equals(can.building)){
						//System.out.println("상대 플레이어가 해당 국가와 계약을 하고 있지만 위약 금을 지불 하고 계약을 맺을수 있습니다. 하시겠습니까?");
						//System.out.println("계약 착수 금이 18억 소모 됩니다. 계속 하시겠 습니까?");
						//System.out.println("'dd','DD','ㅇㅇ' 중 하나를 입력 하면 계약이 성사 됩니다.");
							PlayboardLog.p1_england_event_5=true;
							playboard.playboard();
						choice=scan.nextLine();
							if(choice.equals(ok)||choice.equals(ok1)||choice.equals(ok2)) {
							can.buyOwn2p();
							//System.out.println("☆☆☆" + can.travel + "와 계약 했습니다☆☆☆");
							PlayboardLog.p1_england_event_6=true;
							}//상대 플레이어가 빌딩을 소유 하고 있는 경우

						}//p2가 이미 계약 중이고 빌딩을 소유 하고 있을 경우
						else if(Canada.structureNone.equals(can.landmark)|| Canada.structureNone.equals(can.build_mark)){
						//System.out.println("상대 플레이어가 랜드마크를 보유 하고 있어서 계약을 할수 없습니다.");
							PlayboardLog.p1_england_event_7=true;
						}//p2가 이미 계약중이고 랜드마크, 빌드마크를 소유 중인 경우

					}//캐나다와 계약을 할수있지만 현재 p2가 계약 중인 경우
				} else if (dice.dice3 != 0) {
					//System.out.println("캐나다와의 계약을 실패 했습니다.");
					PlayboardLog.p1_england_event_8=true;
				}
			}//choice to contract with Canada

		}//p1_index==5

	}//ContractCanada

	public void p2_ContractCanada(){
		//실패한 로직에 대한 코드가 없음.
		//p2의 코드가 존재 x
		//출력 되는 문장들을 좀더 다듬을 필요가 있음.
		Playboard playboard = new Playboard();
		Dice dice = new Dice();
		Canada can =new Canada();
		Player player = new Player();
		Scanner scan = new Scanner(System.in);
		TimeThread TT =new TimeThread();
		String ok ="dd";
		String ok1 = "ㅇㅇ";
		String ok2 = "DD";
		String no = "ss";
		String no1 = "ㄴㄴ";
		String no2 = "SS";
		String choice;


		if(TurnOver.p2_turnOver){
			return;
		}//시간이 지나면 턴을 넘기는 버튼이 활성화 되고 턴이 넘겨지는 메소드가 실행된다.
		if(Player.p2_index ==5 && TimeThread.Season.equals(TT.Winter)) {
			//System.out.println("'dd','DD','ㅇㅇ' 중 하나를 입력 하면 영국이 플레이어와 캐나다가 계약을 할수 있게 도와 줍니다.");
			//System.out.println("수락을 해도 10%의 확률로 계약이 성립 됩니다.");
			PlayboardLog.p2_england_event=true;
			playboard.playboard();
			choice = scan.nextLine();
			if(choice.equals(ok)||choice.equals(ok1)||choice.equals(ok2)) {
				dice.contractCanada();
				if (dice.dice3 == 0) {
					PlayboardLog.p2_england_event_1=true;
					playboard.playboard();
					//System.out.println("10%의 확률로 캐나다와 계약을 하게 되었 습니다.");
					if (Canada.name.equals(can.ownName)) {
						//System.out.println("계약 착수 금이 10억 소모 됩니다. 계속 하시겠 습니까?");
						//System.out.println("'dd','DD','ㅇㅇ' 중 하나를 입력 하면 계약이 성사 됩니다.");
						PlayboardLog.p2_england_event_2=true;
						playboard.playboard();
						choice = scan.nextLine();
						if (choice.equals(ok) || choice.equals(ok1) || choice.equals(ok2)) {
							can.own1p();
							//System.out.println("★★★" + can.travel + "와 계약 했습니다★★★");
							if (structureNone.equals(structureNone)) {
								dice.buyStructure();
								if (dice.dice3 == 3) {
									can.landmark();
									Player.p2_mountOfLandmark = Player.p2_mountOfLandmark + 1;
									Player.p2_cash = Player.p2_cash -10;
									PlayboardLog.p2_england_event_3=true;
								}//dice3==3 (주사위 값이 3일때 랜드 마크 ㄱ)
								else if (dice.dice3 >= 0 && dice.dice3 < 3) {
									can.building();
									Player.p2_mountOfBuilding = Player.p2_mountOfBuilding + 1;
									Player.p2_cash = Player.p2_cash -10;
									PlayboardLog.p2_england_event_4=true;
								}//dice3 == 0,1,2 (주사위 값이 0,1,2일때 빌딩을 건설함)

							}//건축 물이 아무 것도 없다면,
						}//10퍼센트의 확률을 뚫고 계약 성사 직전까지 와서 계약 착수 금을 내는 것에 대한 선택
					}//캐나다가 현재 계약중 인 플레이어가 없는 경우
					else if (Canada.name.equals(Canada.own1p)) {
						if(Canada.structureNone.equals(can.building)){
							//System.out.println("상대 플레이어가 해당 국가와 계약을 하고 있지만 위약금을 지불 하고 계약을 맺을수 있습니다. 하시겠습니까?");
							//System.out.println("계약 착수 금이 18억 소모 됩니다. 계속 하시겠 습니까?");
							//System.out.println("'dd','DD','ㅇㅇ' 중 하나를 입력 하면 계약이 성사 됩니다.");
							PlayboardLog.p2_england_event_5=true;
							playboard.playboard();
							choice=scan.nextLine();
							if(choice.equals(ok)||choice.equals(ok1)||choice.equals(ok2)) {
								can.buyOwn2p();
								//System.out.println("★★★" + can.travel + "와 계약 했습니다★★★");
								PlayboardLog.p2_england_event_6=true;
							}//상대 플레이어가 빌딩을 소유 하고 있는 경우

						}//p2가 이미 계약 중이고 빌딩을 소유 하고 있을 경우
						else if(Canada.structureNone.equals(can.landmark)|| Canada.structureNone.equals(can.landmark)){
//							System.out.println("상대 플레이어가 랜드마크를 보유 하고 있어서 계약을 할수 없습니다.");
							PlayboardLog.p2_england_event_7=true;

						}//p2가 이미 계약중이고 랜드마크, 빌드마크를 소유 중인 경우

					}//캐나다와 계약을 할 수 있지만 현재 p2가 계약 중인 경우
				} else if (dice.dice3 != 0) {
//					System.out.println("캐나다와의 계약을 실패 했습니다.");
					PlayboardLog.p2_england_event_8=true;
				}
			}//choice to contract with Canada

		}//p1_index==5

	}//ContractCanada

}//class
