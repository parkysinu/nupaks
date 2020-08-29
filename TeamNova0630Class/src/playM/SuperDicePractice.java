package playM;

public class SuperDicePractice {


    SuperDiceTime sdt =new SuperDiceTime();
    SuperDiceNumber sdn =new SuperDiceNumber();
    Thread threadTime = new Thread(sdt);
    Thread threadNumber =new Thread(sdn);


    public void method(){
        System.out.println("원하시는 숫자가 나오면 엔터 키를 입력해 주세요.");
        threadTime.start();
        threadNumber.start();
    }

}
