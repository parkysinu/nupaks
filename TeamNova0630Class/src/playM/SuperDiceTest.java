package playM;

public class SuperDiceTest {

    public static void main(String []args){

        SuperDiceTime time = new SuperDiceTime();
        SuperDiceNumber number = new SuperDiceNumber();
        Thread threadTime =new Thread(time);
        Thread threadNumber =new Thread(number);
        SuperDicePractice sdp =new SuperDicePractice();



        System.out.println("���Ͻô� ���ڰ� ������ ���� Ű�� �Է��� �ּ���");
        sdp.method();


    }

}
