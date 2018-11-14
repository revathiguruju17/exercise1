
public class ElectronicTollOperator {
    public static void main(String[] args) {
        OuterRingRoad outerRingRoad = new OuterRingRoad();
        outerRingRoad.setUpTollGates();
        doTask( outerRingRoad );
    }

    private static void doTask(OuterRingRoad outerRingRoad) {
        OutputDriver.printMessage( "Welcome to Electronic Toll Collection" );
        String userChoice;
        do {
            OutputDriver.printMessage( "Enter Vehicle Type, Entry Toll Number, Exit Toll Number : " );
            String vehicleType = InputDriver.readString();
            int entryTollNumber = InputDriver.readInt();
            int exitTollNumber = InputDriver.readInt();
            int tollFee = outerRingRoad.calculateTollFee( vehicleType, entryTollNumber, exitTollNumber );
            String s="Collect Toll fee Rs." + tollFee + " for travel from TollGate#"  ;
            s=s.concat( entryTollNumber + " to TollGate#" + exitTollNumber + "." );
            OutputDriver.printMessage(s);
            OutputDriver.printMessage( "press 1 to continue or any other key to exit" );
            userChoice = InputDriver.readString();
        } while (userChoice.equals( "1" ));
    }
}
