package playM;

public class TimeThread implements Runnable {

    static String Season ="　　　砂　";
    String Spring   = "　　　砂　";
    String Summer   = "　　食　硯";
    String Fall     = "　　亜　聖";
    String Winter   = "　　移　随";


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

        Season=Season.replaceAll("　　　砂　","　　食　硯");

    }
    public void SummerToFall(){

        Season=Season.replaceAll("　　食　硯","　　亜　聖");

    }
    public void FallToWinter(){

        Season=Season.replaceAll("　　亜　聖","　　移　随");

    }
    public void WinterToSpring(){

        Season=Season.replaceAll("　　移　随","　　　砂　");

    }
}//ClassTimeThread
