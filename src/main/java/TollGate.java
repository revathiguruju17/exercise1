class TollGate {
    private int tollNumber;
    private Vehicle twoWheeler;
    private Vehicle fourWheeler;


    TollGate(int tollNumber, Vehicle twoWheeler, Vehicle fourWheeler) {
        this.tollNumber = tollNumber;
        this.twoWheeler = twoWheeler;
        this.fourWheeler = fourWheeler;
    }

    int getTollNumber() {
        return tollNumber;
    }

    int getCostFor2Wheeler() {
        return this.twoWheeler.getCost();
    }

    int getCostFor4Wheeler() {
        return this.fourWheeler.getCost();
    }
}
