package playM;

import java.util.Random;
import java.util.Scanner;

public class Dice {


	Scanner scan =new Scanner(System.in);
	Random r1=new Random();
	Random r2=new Random();
	Random r3=new Random();
	Main main = new Main();
	int run;
	static int dice1=0;
	static int dice2=0;
	public int dice3=0;
	
	public void setDice1(int dice1) {
		Dice.dice1 =dice1;
	}
	public int getDice1(int dice1) {
		return dice1;
	}
	
	public void moving() {//주사위를 돌려 두개의 주사위의 값을 더해서  값만큼 이동한다.
		
		Player player = new Player();
		
		
		System.out.println("나왔으면 하는 숫자를 기도하며 아무 숫자나 눌러주세요!"); 
		run=scan.nextInt();
		
		
		dice1=r1.nextInt(6)+1;
		
		System.out.println("주사위를 던져 "+dice1+"(이)가 나왔습니다.");
		System.out.println((dice1)+"칸 이동합니다.");
	
	}//이동할때 사용하는 메소드
	
	
	public void escapeIsland() {//주사위를 돌려 같은 값이 나왔을경우 무인도에서 탈출을 할수있게 한다.
		Island.throwDice=true;
		dice1=r1.nextInt(6)+1;
		dice2=r1.nextInt(6)+1;
		//System.out.println("1번 주사위를 굴려서 "+dice1+"이 나왔습니다");
		//System.out.println("2번 주사위를 굴려서 "+dice2+"이 나왔습니다.");
		//System.out.println();
	
	}//무인도에서 사용하는 메소드
	
	public void buyStructure() {
		
		dice3=r3.nextInt(4);
		if(dice3<3) {
			//System.out.println("빌딩을 구매했습니다 :)");
			if(PlayboardLog.p1_turn){
				PlayboardLog.p1_selected_building=true;
			}
			else if(PlayboardLog.p2_turn){
				PlayboardLog.p2_selected_building=true;
			}
		}
		else if(dice3==3) {
			//System.out.println("랜드마크 경매에 성공했습니다 :)");
			if(PlayboardLog.p1_turn){
				PlayboardLog.p1_selected_landmark=true;
			}
			else if(PlayboardLog.p2_turn){
				PlayboardLog.p2_selected_landmark=true;
			}
		}
	}//건물 구매할때 사용하는 랜덤 메소드
	

	public void contractCanada(){

		System.out.println("영국이 캐나다와 계약을 할수 있도록 주선을 해주기로 했습니다. ");
		System.out.println("10%의 확률로 캐나다와 계약을 할수 있습니다");
		dice3=r3.nextInt(10);

	}//contractCanadaByEngland

	public void contractChina(){

		System.out.println("영국이 캐나다와 계약을 할수 있도록 주선을 해주기로 했습니다. ");
		System.out.println("33%의 확률로 캐나다와 계약을 할수 있습니다");
		dice3=r3.nextInt(3);

	}//contractCanadaByEngland

	public void lockedIsland() {
		
		dice1=0;
		dice2=0;
		
	}
}//class
