public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.addGear(0, 5.5);
        mcLaren.addGear(1, 10.2);
        mcLaren.addGear(2, 12.2);
        mcLaren.addGear(3, 13.3);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(0);
        mcLaren.operateClutch(false);
        System.out.println("Wheel Speed : " + mcLaren.wheelSpeed(1000));
    }
}
