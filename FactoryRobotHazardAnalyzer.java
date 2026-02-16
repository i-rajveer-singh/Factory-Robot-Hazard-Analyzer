import java.util.*;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        double armPrecision = sc.nextDouble();
        int workerDensity = sc.nextInt();
        String machineryState = sc.next();

        if(armPrecision < 0.0 || armPrecision > 1.0){
            System.out.println("Invalid arm precision");
            return;
        }

        if(workerDensity < 1 || workerDensity > 20){
            System.out.println("Invalid worker density");
            return;
        }

        if(!(machineryState.equals("Worn") ||
                machineryState.equals("Faulty") ||
                machineryState.equals("Critical"))){

            System.out.println("Invalid machinery state");
            return;
        }

        double machineRiskFactor = 1.3;

        if(machineryState.equals("Faulty")) machineRiskFactor = 2.0;
        if(machineryState.equals("Critical")) machineRiskFactor = 3.0;

        double hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);

        System.out.println("Robot Hazard Risk Score: " + hazardRisk);
    }
}
