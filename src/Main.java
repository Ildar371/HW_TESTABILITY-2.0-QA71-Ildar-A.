public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double high = 1.87;
        double Bmi = service.calculate(weight, high);
        System.out.println("Индекс массы тела: " + Bmi);
    }
}