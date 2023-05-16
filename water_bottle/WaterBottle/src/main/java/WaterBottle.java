public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }
    public void drinkWater(){
        this.volume -= 10;
    }


}
