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
        for (int j = entryTollNumber - 1; j < tollGates.size(); j++) {
            if (isExitTollGateArrives( exitTollNumber, tollGates.get( j ).getTollNumber() )) {
                return tollFee;
            }
            tollFee += isTwoWheeler( vehicleType ) ? tollGates.get( j ).getCostFor2Wheeler() :
                    tollGates.get( j ).getCostFor4Wheeler();
            if (tollGates.size() == j + 1) {
                j = -1;
            }
        }
        return tollFee;
    }

    private boolean isExitTollGateArrives(int exitTollNumber, int tollNumber) {
        return exitTollNumber == tollNumber;
    }

    private boolean isTwoWheeler(String vehicleType) {
        return vehicleType.equals( "2W" );
    }

}
