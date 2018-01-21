
public class Clock throws Exception{
  
    // Fields
    private int hours;
    private int minutes;
    private int seconds;
	
  	private String leadh;
  	private String leadm;
  	private String leads;
  

  	if(hours<0 || hours>23){
  		throw new Exception("hours is not in range");
    }
  	if(minutes<0 || minutes>59){
  		throw new Exception("minutes is not in range");
    }
  	if(seconds<0 || seconds>23){
  		throw new Exception("seconds is not in range");
    }
  	/**
    *Constructor of Clock which includes hours, minutes, seconds
    */  
  	public Clock(){
  	  hours = 0;
      minutes = 0;
      seconds = 0;
  	}
    public Clock(int h, int m, int s) {
        
      if(h>=0 && h <=24){
      	hours = h;
        if(h<10){
        	leadh = "0";
        } else {
        	leadh = "";
        }
      } else {
      	hours = 0;
        if(h<10){
        	leadh = "0";
        } else {
        	leadh = "";
        }
      }
      if(m>=0 && m <=60){
      	minutes = m;
        if(m<10){
        	leadm = "0";
        } else {
        	leadm = "";
        }
      } else {
        minutes = 0;
        if(m<10){
        	leadm = "0";
        } else {
        	leadm = "";
        }
      }
      if(s>=0 && s <=60){
      	seconds = s;
        if(s<10){
        	leads = "0";
        } else {
        	leads = "";
        }
      } else {
      	seconds = 0;
      	if(s<10){
        	leads = "0";
        } else {
        	leads = "";
        }
      }
    }
	
  	/**
    * method set's hours 
    @param hours
    */
  	public void setHours(int hours){
      
      	this.hours = hours;
    }
  	/**
    * methods set's minutes
    @param minutes
    */
  	public void setMinutes(int minutes){
      
      	this.minutes = minutes;
    }
    /**
    * methods set's seconds
    @param seconds
    */
  	public void setSeconds(int seconds){
      
      	this.seconds = seconds
    }
  	/**
    * methods get's hours
    @return hours
    */
  	public int getHours(){
  		return hours;
    }
  	/**
    * methods get's minutes
    @return minutes
    */
  	public int getMinutes(){
  		return minutes;
    }
  	/**
    * methods get's seconds
    @param seconds
    */
  	public int getSeconds(){
  		return seconds;
    }
  	
    /**
    * resets to Midnight 
    @param hours, minutes, seconds
    */
  	void resetToMidnight() {
        hours = 0; minutes = 0; seconds = 0;
    }

    /**
    * methods checks is Morning now
    */
    public boolean isMorning() {
        return hours > 12;
    }

     /**
    * Advance one second method
    */
    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
          	minutes++;
          if(minutes>=60){
            minutes = 0;
          	hours++;
            if(minutes>=24){
            	hours = 0;
            }
          }
            // need to increment mins, etc.
        }
    }
  
  	
    public String toString() { 
    
		return leadh+hours+":"+leadm+minutes+":"+leads+seconds;
    } 

}
