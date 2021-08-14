public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMassKilo = 75;
        double heightMeter = 1.65;
        double bmi = service.calculate(bodyMassKilo, heightMeter);
        System.out.println(bmi);
    }
}