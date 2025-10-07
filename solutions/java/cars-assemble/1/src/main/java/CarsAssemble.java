public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if(speed > 0 && speed <= 4){
            return speed * 221;
        }else if(speed >= 5 && speed <= 8){
            return (speed * 221) * 0.9;
        }else if(speed == 9){
            return (speed * 221) * 0.8;
        }else if(speed == 10){
            return (speed * 221) * 0.77;
        }
        return 0.0;
    }
    public int workingItemsPerMinute(int speed) {
        double result = productionRatePerHour(speed);
        int perMin = (int) (result / 60);
        return perMin;
    }
}
