package playM;

public class TimeThread implements Runnable {

    static String Season ="����������";
    String Spring   = "����������";
    String Summer   = "����������";
    String Fall     = "����������";
    String Winter   = "�����ܡ���";


    public void run(){



        while(!Thread.currentThread().isInterrupted()){

            for(int i = 0 ; i < 4 ; i++){

                if(i==0){
                    SpringToSummer();


                }
                else if(i==1){
                    SummerToFall();

                }
                else if(i==2){
                    FallToWinter();

                }
                else if(i==3){
                    WinterToSpring();

                }
                try{
                    Thread.sleep(30000);
                }catch(Exception e){}
            }//for (i)


        }//while(!isInterrupted())

    }//run

    public void SpringToSummer(){

        Season=Season.replaceAll("����������","����������");

    }
    public void SummerToFall(){

        Season=Season.replaceAll("����������","����������");

    }
    public void FallToWinter(){

        Season=Season.replaceAll("����������","�����ܡ���");

    }
    public void WinterToSpring(){

        Season=Season.replaceAll("�����ܡ���","����������");

    }
}//ClassTimeThread
