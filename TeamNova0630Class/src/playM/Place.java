package playM;

public class Place {
	//Place class�� ���� ǥ���ϴ� Ŭ������ �ֻ��� Ŭ�����̴�
	//��� �ʿ��� ���������� ���Ǵ� �������� ǥ���ߴ�.
	//���ʿ��� �̷�������ִ� �Լ����� �־���.
	//����,�÷��̾� ��ġ, �ٴ�
	//�÷��̾� ��ġ�� �׻� �ٲ�� �ֱ⶧���� ��� ǥ������ �����ؾ���
	//�������� ǥ���ϸ鼭 ������ ��ĭ���� ó���ϱ� ���� ��ĭ���� �̷���� ������ �������� �����س���.
	//�÷��̾� ��ġ�� ���� ��ĭ���� ǥ���Ǿ��ִٰ� �÷��̾ �ʾȿ� ������ �� ���� �̸� �������� ������ ��ȯ�ϴ� ������� ����.

	  //String roof   ="������������������������";
		
		
		public String blank  	="����������������";
		
		public String blankH	="��������";
		public String blankH1	="���� ��";

		public String blank2 ="������������������������������������������������������������������";

		
		public String blank1     ="��������";
		
		public String blank3    ="����������������������������������������������������������������������";
		
		public String roof      ="������������������������";
		
		public String floor     ="������������������������";
		
		public String roofR 	="��������������������������������������������������������������������������������������������������������";
		
		public String floorR	="��������������������������������������������������������������������������������������������������������";
	
		
		String playerNone	="����������������";
		String playerBlank	="����������������";
		String player1		="������~������������";
		String player2		="��������������~����";
		String player1_2 	="������~������~����";
		String building  	="�����ǡ���������";
		String landmark 	="�����������ʡ���";
		String build_mark	="�����ǡ����ʡ���";
		String structureNone ="����������������";
		
		
		
		public void player1() {
			
			playerNone=playerNone.replaceAll("����������������","������~������������");
			
		}//player1
		
		
		public void player2() {
			
			playerNone=playerNone.replaceAll("����������������","��������������~����");
								  
		}//player2
		
		
		public void player1_2() {
			
			playerNone=playerNone.replaceAll("������~������������","������~������~����");
			
		}//player1_2

		
		public void player2_1() {
			
			playerNone=playerNone.replaceAll("��������������~����","������~������~����");
			
		}//player2_1
		//������ ��������� ����� 2p�� ���� ������ ���¿��� 1p�� ������
		
		
		public void player1_None() {
			
			playerNone=playerNone.replaceAll("������~������������","����������������");
								 
		}//player1_None
		
		
		public void player2_None() {
			
			playerNone=playerNone.replaceAll("��������������~����","����������������");
								 
		}//player2_None
		
		
		public void player12_1() {
			playerNone=playerNone.replaceAll("������~������~����","������~������������");
		
		}//player12_1
		
		
		public void player12_2() {
			playerNone=playerNone.replaceAll("������~������~����","��������������~����");
		
		}//player12_2
		
		//�÷��̾� ��ǥ �̵� �Լ�
		

}//class
