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
	
	public void moving() {//�ֻ����� ���� �ΰ��� �ֻ����� ���� ���ؼ�  ����ŭ �̵��Ѵ�.
		
		Player player = new Player();
		
		
		System.out.println("�������� �ϴ� ���ڸ� �⵵�ϸ� �ƹ� ���ڳ� �����ּ���!"); 
		run=scan.nextInt();
		
		
		dice1=r1.nextInt(6)+1;
		
		System.out.println("�ֻ����� ���� "+dice1+"(��)�� ���Խ��ϴ�.");
		System.out.println((dice1)+"ĭ �̵��մϴ�.");
	
	}//�̵��Ҷ� ����ϴ� �޼ҵ�
	
	
	public void escapeIsland() {//�ֻ����� ���� ���� ���� ��������� ���ε����� Ż���� �Ҽ��ְ� �Ѵ�.
		Island.throwDice=true;
		dice1=r1.nextInt(6)+1;
		dice2=r1.nextInt(6)+1;
		//System.out.println("1�� �ֻ����� ������ "+dice1+"�� ���Խ��ϴ�");
		//System.out.println("2�� �ֻ����� ������ "+dice2+"�� ���Խ��ϴ�.");
		//System.out.println();
	
	}//���ε����� ����ϴ� �޼ҵ�
	
	public void buyStructure() {
		
		dice3=r3.nextInt(4);
		if(dice3<3) {
			//System.out.println("������ �����߽��ϴ� :)");
			if(PlayboardLog.p1_turn){
				PlayboardLog.p1_selected_building=true;
			}
			else if(PlayboardLog.p2_turn){
				PlayboardLog.p2_selected_building=true;
			}
		}
		else if(dice3==3) {
			//System.out.println("���帶ũ ��ſ� �����߽��ϴ� :)");
			if(PlayboardLog.p1_turn){
				PlayboardLog.p1_selected_landmark=true;
			}
			else if(PlayboardLog.p2_turn){
				PlayboardLog.p2_selected_landmark=true;
			}
		}
	}//�ǹ� �����Ҷ� ����ϴ� ���� �޼ҵ�
	

	public void contractCanada(){

		System.out.println("������ ĳ���ٿ� ����� �Ҽ� �ֵ��� �ּ��� ���ֱ�� �߽��ϴ�. ");
		System.out.println("10%�� Ȯ���� ĳ���ٿ� ����� �Ҽ� �ֽ��ϴ�");
		dice3=r3.nextInt(10);

	}//contractCanadaByEngland

	public void contractChina(){

		System.out.println("������ ĳ���ٿ� ����� �Ҽ� �ֵ��� �ּ��� ���ֱ�� �߽��ϴ�. ");
		System.out.println("33%�� Ȯ���� ĳ���ٿ� ����� �Ҽ� �ֽ��ϴ�");
		dice3=r3.nextInt(3);

	}//contractCanadaByEngland

	public void lockedIsland() {
		
		dice1=0;
		dice2=0;
		
	}
}//class
