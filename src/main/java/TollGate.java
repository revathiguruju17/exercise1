public class TollGate {
    private  int tollNumber;
    private int costFor2Wheeler;
    private int costFor4Wheeler;


    TollGate(int tollNumber, int costFor2Wheeler, int costFor4Wheeler) {
        this.tollNumber = tollNumber;
        this.costFor2Wheeler = costFor2Wheeler;
        this.costFor4Wheeler = costFor4Wheeler;
    }


    int getTollNumber() {
        return tollNumber;
    }

    int getCostFor2Wheeler() {
        return costFor2Wheeler;
    }

    int getCostFor4Wheeler() {
        return costFor4Wheeler;
    }
}
