package playM;

public class TimeThreadView implements Runnable{


    public void run(){


Playboard playboard =new Playboard();



        while(!Thread.currentThread().isInterrupted()){

            for(int i = 0 ; i < 4 ; i++){

                if(i==0){

                    System.out.println("여름 입니다.");

                }
                else if(i==1){

                    System.out.println("가을 입니다");
                }
                else if(i==2){

                    System.out.println("겨울 입니다.");
                }
                else if(i==3){

                    System.out.println("봄 입니다.");
                }
                try{
                    Thread.sleep(30000);
                }catch(Exception e){}
            }//for (i)


        }//while(!isInterrupted())

    }//run
}
