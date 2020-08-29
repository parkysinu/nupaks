package fishShapedBunTycoon3rd;



public class Player  {



    static int numberOfFishBun;
    static int life;
    static int money;


    public void setNumberOfFishBun(int numberOfFishBun) {
        this.numberOfFishBun = numberOfFishBun;
    }
    public int getNumberOfFishBun(){
        return numberOfFishBun;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void beforeStart(){

        setLife(5);
        setNumberOfFishBun(0);
        setMoney(0);

    }





}
