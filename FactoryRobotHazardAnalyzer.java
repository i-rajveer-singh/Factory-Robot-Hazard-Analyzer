import java.util.*;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double armPrecision = sc.nextDouble();
        int workerDensity = sc.nextInt();
        String machineryState = sc.next();

        try{
            double risk = calculateHazardRisk(armPrecision,workerDensity,machineryState);
            System.out.println("Robot Hazard Risk Score: " + risk);
        } catch(RobotSafetyException e){
        }

    }


    // UC5
    public static double calculateHazardRisk(double armPrecision,int workerDensity,String machineryState) throws RobotSafetyException
    {
        if(armPrecision < 0.0 || armPrecision > 1.0){
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
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
