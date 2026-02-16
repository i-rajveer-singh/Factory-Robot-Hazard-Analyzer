import java.util.*;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double armPrecision = sc.nextDouble();
        int workerDensity = sc.nextInt();
        String machineryState = sc.next();

        System.out.println(armPrecision);
        System.out.println(workerDensity);
        System.out.println(machineryState);
    }
}
