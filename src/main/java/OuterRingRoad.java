import java.util.ArrayList;
import java.util.List;

class OuterRingRoad {
    private List<TollGate> tollGates = new ArrayList<>();

    void setUpTollGates() {
        tollGates.add( new TollGate( 1, new TwoWheeler( 25 ), new FourWheeler( 45 ) ) );
        tollGates.add( new TollGate( 2, new TwoWheeler( 20 ), new FourWheeler( 25 ) ) );
        tollGates.add( new TollGate( 3, new TwoWheeler( 15 ), new FourWheeler( 30 ) ) );
        tollGates.add( new TollGate( 4, new TwoWheeler( 10 ), new FourWheeler( 15 ) ) );
    }

    int calculateTollFee(String vehicleType, int entryTollNumber, int exitTollNumber) {
        int tollFee = 0;
        for (int i = entryTollNumber; i < exitTollNumber; i++) {
            if(isTwoWheeler( vehicleType )) {
                tollFee += tollGates.get( i - 1 ).getCostFor2Wheeler();
            }
            else {
                tollFee += tollGates.get( i - 1 ).getCostFor4Wheeler();
            }
        }
        return tollFee;
    }


    private boolean isTwoWheeler(String vehicleType) {
        return vehicleType.equals( "2W" );
    }

}
