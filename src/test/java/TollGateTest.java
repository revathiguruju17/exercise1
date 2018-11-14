import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TollGateTest {
    @Test
    void testForTollNumber1(){
        TollGate tollGate1 = new TollGate( 1,new TwoWheeler(15), new FourWheeler(25 ) );
        assertEquals( 1,tollGate1.getTollNumber() );
        assertEquals(15,tollGate1.getCostFor2Wheeler());
        assertEquals( 25,tollGate1.getCostFor4Wheeler());
    }

    @Test
    void testForTollNumber2(){
        TollGate tollGate2 = new TollGate( 2, new TwoWheeler( 25 ),new TwoWheeler( 40 ) );
        assertEquals( 2,tollGate2.getTollNumber() );
        assertEquals(25,tollGate2.getCostFor2Wheeler());
        assertEquals( 40,tollGate2.getCostFor4Wheeler());
    }
}
