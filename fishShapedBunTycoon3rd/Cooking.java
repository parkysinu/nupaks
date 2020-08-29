package fishShapedBunTycoon3rd;

public class Cooking implements Runnable{

    CastOfFishBun castOfFishBun =new CastOfFishBun();

    public void run(){
        try {

            Thread.sleep(3000);

            if(CastOfFishBun.startMaking1stBun){
                CastOfFishBun.cooking1stBun=true;
                castOfFishBun.setIcon(castOfFishBun.castOfFishFinishImage);
                castOfFishBun.setFinishCast(true);
            }
            else if(CastOfFishBun.startMaking2ndBun){
                CastOfFishBun.cooking2ndBun=true;
                castOfFishBun.setIcon(castOfFishBun.castOfFishFinishImage);
                castOfFishBun.setFinishCast(true);
            }
            else if(CastOfFishBun.startMaking3rdBun){
                CastOfFishBun.cooking3rdBun=true;
                castOfFishBun.setIcon(castOfFishBun.castOfFishFinishImage);
                castOfFishBun.setFinishCast(true);
            }
            else if(CastOfFishBun.startMaking4thBun){
                CastOfFishBun.cooking4thBun=true;
                castOfFishBun.setIcon(castOfFishBun.castOfFishFinishImage);
                castOfFishBun.setFinishCast(true);
            }
            else if(CastOfFishBun.startMaking5thBun){
                CastOfFishBun.cooking5thBun=true;
                castOfFishBun.setIcon(castOfFishBun.castOfFishFinishImage);
                castOfFishBun.setFinishCast(true);
            }
            else if(CastOfFishBun.startMaking6thBun){
                CastOfFishBun.cooking6thBun=true;
                castOfFishBun.setIcon(castOfFishBun.castOfFishFinishImage);
                castOfFishBun.setFinishCast(true);
            }
            else if(CastOfFishBun.startMaking7thBun){
                CastOfFishBun.cooking7thBun=true;
                castOfFishBun.setIcon(castOfFishBun.castOfFishFinishImage);
                castOfFishBun.setFinishCast(true);
            }
            else if(CastOfFishBun.startMaking8thBun){
                CastOfFishBun.cooking8thBun=true;
                castOfFishBun.setIcon(castOfFishBun.castOfFishFinishImage);
                castOfFishBun.setFinishCast(true);
            }
            else if(CastOfFishBun.startMaking9thBun){
                CastOfFishBun.cooking9thBun=true;
                castOfFishBun.setIcon(castOfFishBun.castOfFishFinishImage);
                castOfFishBun.setFinishCast(true);
            }

            System.out.println(castOfFishBun.finishCast);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
