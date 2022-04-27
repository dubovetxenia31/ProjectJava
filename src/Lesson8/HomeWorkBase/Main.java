package Lesson8.HomeWorkBase;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(50, 15,5,100);

// get
//        System.out.println( bus.getPetrolAmount() );
//        System.out.println( bus.getTankVolume() );
//        System.out.println();

// init
        Base.vehiclesOnBase = 49;
        Base.peopleOnBase = 99;
        Base.petrolOnBase = 1000.0;
        Base.goodsOnBase  = 2000.0;

        System.out.println("Initially:");
        System.out.println( Base.vehiclesOnBase );
        System.out.println( Base.peopleOnBase );
        System.out.println( Base.petrolOnBase );
        System.out.println( Base.goodsOnBase );
        System.out.println();

// arrive
        bus.arrive();
        System.out.println( "Arrived:" );

        System.out.println( Base.vehiclesOnBase );	// arrived
        System.out.println( Base.petrolOnBase );

        System.out.println( Base.petrolOnBase );	// same
        System.out.println( Base.goodsOnBase );
        System.out.println();

// leave
        bus.leave();
        System.out.println( "Left:" );

        System.out.println( Base.vehiclesOnBase );	// left
        System.out.println( Base.peopleOnBase );

// should be 1000-(60-19.5)
        System.out.println( Base.petrolOnBase );	// changed!

        System.out.println( Base.goodsOnBase );	// same
        System.out.println();
    }
}
