import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OuterRingRoadTest {
    @Test
    void calculateTollFee1(){
        OuterRingRoad outerRingRoad = new OuterRingRoad();
        outerRingRoad.setUpTollGates();
        int tollFee = outerRingRoad.calculateTollFee( "2W", 1,3 );
        assertEquals(45,tollFee);
    }

    @Test
    void calculateTollFee2(){
        OuterRingRoad outerRingRoad = new OuterRingRoad();
        outerRingRoad.setUpTollGates();
        int tollFee = outerRingRoad.calculateTollFee( "4W", 2,4 );
        assertEquals(55,tollFee);
    }
}
