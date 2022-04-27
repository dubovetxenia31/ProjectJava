package Lesson8.HomeWorkBase;

public class Truck extends Vehicle{
   private int maxLoad;
   private int currentLoad;

   public Truck (){

    }

    public Truck(double tankVolume, double petrolAmount, int maxLoad, int currentLoad) {
        super(tankVolume, petrolAmount);
        this.maxLoad = maxLoad;
        this.currentLoad = currentLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.goodsOnBase += currentLoad;
    }

    @Override
    public boolean leave() {
        if (!canLeaveVehicle()){
            return false;
        }
        Base.peopleOnBase--;
        Base.vehiclesOnBase--;
        Base.petrolOnBase = Base.petrolOnBase - (getTankVolume() - getPetrolAmount());

        if (Base.goodsOnBase >= (maxLoad - currentLoad)) {
            Base.goodsOnBase -= maxLoad - currentLoad;
            currentLoad = maxLoad;
        } else {
            currentLoad += Base.goodsOnBase;
            Base.goodsOnBase = 0;
        }
        return true;
    }

}
