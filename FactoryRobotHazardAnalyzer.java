import java.util.*;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double armPrecision = sc.nextDouble();
        int workerDensity = sc.nextInt();
        String machineryState = sc.next();
        RobotHazardAuditor auditor = new RobotHazardAuditor();

        try {
            double risk = auditor.CalculateHazardRisk(armPrecision, workerDensity, machineryState);
            System.out.println("Robot Hazard Risk Score: " + risk);
        } catch (RobotSafetyException e) {
        }

    }
}


