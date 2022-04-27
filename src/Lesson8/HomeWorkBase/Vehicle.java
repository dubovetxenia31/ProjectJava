package Lesson8.HomeWorkBase;

public class Vehicle {
    private double tankVolume;
    private double petrolAmount;

    public Vehicle() {
    }

    public Vehicle(double tankVolume, double petrolAmount) {
        this.tankVolume = tankVolume;
        this.petrolAmount = petrolAmount;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getPetrolAmount() {
        return petrolAmount;
    }

    public void setPetrolAmount(double petrolAmount) {
        this.petrolAmount = petrolAmount;
    }


    public void arrive() {
        Base.peopleOnBase++;
        Base.vehiclesOnBase++;
    }

    public boolean leave() {
        if(!canLeaveVehicle()){
           return false;
        }
        Base.peopleOnBase--;
        Base.vehiclesOnBase--;
        Base.petrolOnBase = Base.petrolOnBase - (tankVolume - petrolAmount);
        return true;
    }


    protected boolean canLeaveVehicle(){
        if (Base.peopleOnBase < 1) {
            return false;
        }
        if (Base.vehiclesOnBase < 1) {
            return false;
        }
        if (tankVolume - petrolAmount > Base.petrolOnBase) {
            return false;
        }
        return true;
    }

}
