import java.util.*;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double armPrecision = sc.nextDouble();
        int workerDensity = sc.nextInt();
        String machineryState = sc.next();

        double risk = calculateHazardRisk(armPrecision,workerDensity,machineryState);

        System.out.println("Robot Hazard Risk Score: " + risk);
    }

    // =========================
    // UC5 NEW METHOD
    // =========================
    public static double calculateHazardRisk(double armPrecision,int workerDensity,String machineryState){

        if(armPrecision < 0.0 || armPrecision > 1.0){
            System.out.println("Invalid arm precision");
            return 0;
        }

        if(workerDensity < 1 || workerDensity > 20){
            System.out.println("Invalid worker density");
            return 0;
        }

        double machineRiskFactor = 1.3;

        if(machineryState.equals("Faulty")) machineRiskFactor = 2.0;
        if(machineryState.equals("Critical")) machineRiskFactor = 3.0;

        return ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
    }
}
