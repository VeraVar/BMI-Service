public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi = service.calculate(99, 1.77);

        System.out.println(bmi);
    }
}
