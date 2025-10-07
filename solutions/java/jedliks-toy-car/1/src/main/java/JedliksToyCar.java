public class JedliksToyCar {
    private int distanceDriven;
    private int battery = 100; 
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if(battery == 0){
            return "Battery empty";
        }
        return "Battery at " + battery + "%"; 
    }

    public void drive() {
        if(battery == 0){
            return;
        }
        distanceDriven += 20;
        battery -= 1;
    }
}
