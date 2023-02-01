public class BmiService {
    public double calculate(double height, double weight) {
        double x = 2;
        double bmi = weight / Math.pow (height, x);
        return bmi;
    }
    }
