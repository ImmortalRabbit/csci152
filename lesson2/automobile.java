public class Automobile
{
    private boolean engineRunning; 

    private double speed; 
  
  	private int name;
 
    public Automobile() { 
   		engineRunning = false; 
    	speed = 0.0; 
    } 
	
  	public void setName(int na){
  		name = na;
    }

    public void startCar(){ 
    	engineRunning = true; 
    } 

    public void pressGasPedal(){ 
    	if (engineRunning) { 
    		speed = speed + 10.0; 
        } 
    } 

    public void pressBrake(){ 
    	speed = 0.0; 
    } 
    public void shutdown(){ 
    	engineRunning = false; 
    } 

    public boolean isEngineRunning(){ 
    	return engineRunning; 
    } 

    public double getSpeed() { 
    	return speed; 
	} 

    public double calculateDistance (double time) { 
   	 return time * speed; 
    } 

    public String toString() { 
      return "Name of Car:" + name +
      " Engine running: " + engineRunning + 
      " Speed: " + speed; 
    } 
  
    }
