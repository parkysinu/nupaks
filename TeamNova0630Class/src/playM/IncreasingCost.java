package playM;

import java.util.Random;

public class IncreasingCost implements Runnable{

    //1�п� �ѹ��� �������� ������ �Ѱ� ���ؼ� �����¿� ���ο� 10�﾿ ����Ḧ ���� ��Ű�� ������.

    static boolean structureInflationLeft;
    static boolean structureInflationRight;
    static boolean structureInflationUp;
    static boolean structureInflationDown;

    public void run() {


        Random r = new Random();
        int R;

        while(!Thread.currentThread().isInterrupted()){



               for(int i =0 ; i<6 ;i++) {



                   if(i==0){



                   }
                   if(i==1){

                   }
                   if(i==2){

                   }
                   if(i==3){

                   }
                   if(i==4){
                       System.out.println("��� �� �ǹ��� ������ ��� �մϴ�.");
                       structureInflationLeft=false;
                       structureInflationRight=false;
                       structureInflationUp=false;
                       structureInflationDown=false;
                   }
                   if(i==5) {
                       R = r.nextInt(4);
                       if (R == 0) {
                           Korea.buildingCost = Korea.buildingCost + 10;
                           Korea.landmarkCost = Korea.landmarkCost + 10;
                           Korea.build_markCost = Korea.build_markCost + 10;
                           //�ѱ� �����

                           Japan.buildingCost = Japan.buildingCost + 10;
                           Japan.landmarkCost = Japan.landmarkCost + 10;
                           Japan.build_markCost = Japan.build_markCost + 10;
                           //�Ϻ� �����


                           China.buildingCost = China.buildingCost + 10;
                           China.landmarkCost = China.landmarkCost + 10;
                           China.build_markCost = China.build_markCost + 10;
                           //�߱� �����

                           structureInflationLeft=true;

                       } else if (R == 1) {
                           England.buildingCost = England.buildingCost + 10;
                           England.landmarkCost = England.landmarkCost + 10;
                           England.build_markCost = England.build_markCost + 10;
                           //���� �����

                           France.buildingCost = France.buildingCost + 10;
                           France.landmarkCost = France.landmarkCost + 10;
                           France.build_markCost = France.build_markCost + 10;
                           //������ �����


                           Germany.buildingCost = Germany.buildingCost + 10;
                           Germany.landmarkCost = Germany.landmarkCost + 10;
                           Germany.build_markCost = Germany.build_markCost + 10;
                           //���� �����

                           Russia.buildingCost = Russia.buildingCost + 10;
                           Russia.landmarkCost = Russia.landmarkCost + 10;
                           Russia.build_markCost = Russia.build_markCost + 10;
                           //���� �����

                           structureInflationUp=true;

                       } else if (R == 2) {
                           USA.buildingCost = USA.buildingCost + 10;
                           USA.landmarkCost = USA.landmarkCost + 10;
                           USA.build_markCost = USA.build_markCost + 10;
                           //�̱� �����

                           Canada.buildingCost = Canada.buildingCost + 10;
                           Canada.landmarkCost = Canada.landmarkCost + 10;
                           Canada.build_markCost = Canada.build_markCost + 10;
                           //ĳ���� �����


                           Mexico.buildingCost = Mexico.buildingCost + 10;
                           Mexico.landmarkCost = Mexico.landmarkCost + 10;
                           Mexico.build_markCost = Mexico.build_markCost + 10;
                           //�߽��� �����

                           structureInflationRight=true;


                       } else if (R == 3) {
                           Italy.buildingCost = Italy.buildingCost + 10;
                           Italy.landmarkCost = Italy.landmarkCost + 10;
                           Italy.build_markCost = Italy.build_markCost + 10;
                           //��Ż���� �����

                           Swiss.buildingCost = Swiss.buildingCost + 10;
                           Swiss.landmarkCost = Swiss.landmarkCost + 10;
                           Swiss.build_markCost = Swiss.build_markCost + 10;
                           //������ �����


                           Vietnam.buildingCost = Vietnam.buildingCost + 10;
                           Vietnam.landmarkCost = Vietnam.landmarkCost + 10;
                           Vietnam.build_markCost = Vietnam.build_markCost + 10;
                           //��Ʈ�� �����

                           Egypt.buildingCost = Egypt.buildingCost + 10;
                           Egypt.landmarkCost = Egypt.landmarkCost + 10;
                           Egypt.build_markCost = Egypt.build_markCost + 10;
                           //����Ʈ �����

                           structureInflationDown=true;
                       }
                   }
                   try{
                       Thread.sleep(10000);
                   }catch(Exception e){}
               }




        }//while(!isInterrupted())
    }
}
