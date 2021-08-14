public class BmiService {
    public  int calculate (int bodyMassKilo, double heightMeter) {
        double bmi = bodyMassKilo / Math.pow(heightMeter,2);
        return (int) bmi;
    }
}
