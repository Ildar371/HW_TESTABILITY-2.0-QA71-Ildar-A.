public class BmiService {
    public double calculate(int weight, double high) {
        double result1;
        result1 = weight / (high * high);
        int result2 = (int) result1;
        return result2;
    }

}
