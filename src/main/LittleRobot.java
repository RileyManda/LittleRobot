
package main;

/**
 *
 * @author RMB
 */
 class LittleRobot {
//instance variables
private String status;
    private int speed;
    private int homeSpeed;
private float temperature;
    /**
     * @param args the command line arguments
     */
//instance method1
  void checkTemperature() {
      if (getTemperature() > 660){
            setStatus("returning home");
            setSpeed(5);
            setHomespeed(10);
      }
      }
   
    //instance method2    
  void showAttributes(){
      System.out.println("Temperature: " + getTemperature());
      System.out.println("Status: " + getStatus());
      System.out.println("Speed: " + getSpeed());
      
  }
  
   void showreturnhomeAttributes(){
      System.out.println("Temperature: " + getTemperature());
      System.out.println("Status: " + getStatus());
      System.out.println("Speed: " + getHomespeed());
      
  }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the homeSpeed
     */
    public int getHomespeed() {
        return homeSpeed;
    }

    /**
     * @param homespeed the homeSpeed to set
     */
    public void setHomespeed(int homespeed) {
        this.homeSpeed = homespeed;
    }

    /**
     * @return the temperature
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    }
    


