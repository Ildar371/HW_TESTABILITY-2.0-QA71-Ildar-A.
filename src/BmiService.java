public class BmiService {
    public double calculate(int weight, double high) {
        double result1;
        result1 = weight / (high * 2);
        int result2 = (int) result1;
        return result2;
    }

}
