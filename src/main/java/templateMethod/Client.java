package templateMethod;

public class Client {



    public static void main(String[] args) {

        Template template = new CalculateVale1();
        System.out.println(template.calculate_result());
        template = new CalculateVale2();
        System.out.println(template.calculate_result());
    }
}
