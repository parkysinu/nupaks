package playM;

public class SuperDiceTest {

    public static void main(String []args){

        SuperDiceTime time = new SuperDiceTime();
        SuperDiceNumber number = new SuperDiceNumber();
        Thread threadTime =new Thread(time);
        Thread threadNumber =new Thread(number);
        SuperDicePractice sdp =new SuperDicePractice();



        System.out.println("원하시는 숫자가 나오면 엔터 키를 입력해 주세요");
        sdp.method();


    }

}
