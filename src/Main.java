public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.80;
        double weight = 90;
        double bmi = service.calculate(height, weight);
        System.out.printf("%.2f",bmi);
    }
}