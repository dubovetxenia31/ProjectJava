package Lesson8.HomeWorkBase;

public class Bus extends Vehicle{
    private  int peopleCount;
    private  int maxPeople;

    public Bus(){

    }

    public Bus(double tankVolume, double petrolAmount, int peopleCount, int maxPeople) {
        super(tankVolume, petrolAmount);
        this.peopleCount = peopleCount;
        this.maxPeople = maxPeople;
        this.setPetrolAmount(petrolAmount);
        this.setTankVolume(tankVolume);
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }


    @Override
    public void arrive() {
        Base.peopleOnBase++;
        Base.vehiclesOnBase++;
        Base.peopleOnBase = Base.peopleOnBase + peopleCount;

    }

    @Override
    public boolean leave() {
        if (!canLeaveVehicle()) {
            return false;
        }
        Base.peopleOnBase--;
        Base.vehiclesOnBase--;
        Base.petrolOnBase = Base.petrolOnBase - (getPetrolAmount() - getTankVolume());

        if (Base.peopleOnBase >= (maxPeople - peopleCount)) {
            Base.peopleOnBase -= maxPeople - peopleCount;
            peopleCount = maxPeople;
        } else {
            peopleCount += Base.peopleOnBase;
            Base.peopleOnBase = 0;
        }
        return true;
    }
}
