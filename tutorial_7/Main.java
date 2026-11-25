public class Main {
    public static void main(String[] args) {
        Appliance ac = new AirConditioner("LG");
        ac.displayBrand();
        ac.turnOn();
        ac.operate();
        ac.turnOff();
        
        System.out.println();
        
        Appliance fridge = new Refrigerator("Panasonic");
        fridge.displayBrand();
        fridge.turnOn();
        fridge.operate();
        fridge.turnOff();
    }
}
