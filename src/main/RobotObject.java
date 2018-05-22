
package main;

/**
 *
 * @author RMB
 */
public class RobotObject {
   
    public static void main(String [] arguments){
        //jamie the robot
        LittleRobot jamie = new LittleRobot();
        jamie.setStatus("exploring");
        jamie.setSpeed(2);
        jamie.setTemperature(510);
        
        jamie.showAttributes();
        System.out.println("Increasing speed to 3.");
        jamie.setSpeed(3);
        jamie.showAttributes();
       
        System.out.println("Changing temperature to 670.");
        jamie.setTemperature(670);
        
       
        System.out.println("Temperature is †oo high");
        jamie.checkTemperature();
        
        jamie.showreturnhomeAttributes();
         
        
        
       
    }
    
}
