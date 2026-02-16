import java.util.*;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double armPrecision = sc.nextDouble();
        int workerDensity = sc.nextInt();
        String machineryState = sc.next();

        double machineRiskFactor = 1.3;

        if(machineryState.equals("Faulty")) machineRiskFactor = 2.0;
        if(machineryState.equals("Critical")) machineRiskFactor = 3.0;

        double hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);

        System.out.println("Robot Hazard Risk Score: " + hazardRisk);
    }
}
