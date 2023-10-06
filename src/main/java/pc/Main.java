package pc;

public class Main {

    public static void main(String[] args) {
        Dimensions dimension = new Dimensions(7,7,7);
        Resolution resolution = new Resolution(1440,1060);
        Case case1 = new Case("Super Sonic","Intel","Corsair CX450",dimension);
        Monitor monitor = new Monitor(resolution, "Samsung", 1123421);
        MotherBoard motherBoard = new MotherBoard("MPG B550 GAMING PLUS","MSI",4,7,"BIOS");
        PC pc = new PC(case1, motherBoard, monitor);
        pc.description();
        pc.powerUp();
    }
}
