public class Clock {
  
    // Fields
    private int hours;
    private int minutes;
    private int seconds;
	
  	private String leadh;
  	private String leadm;
  	private String leads;
    // Constructor
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
	
  
  	public void setHours(int h){
      if(h>=0 && h <=24){
      	hours = h;
      }
    }
  	
  	public void setMinutes(int m){
      if(m>=0 && m <=60){
      	minutes = m;
      }
    }
    
  	public void setSeconds(int s){
      if(s>=0 && s <=60){
      	seconds = s;
      }
    }
  
  	public int getHours(){
  		return hours;
    }
  	
  	public int getMinutes(){
  		return minutes;
    }
  
  	public int getSeconds(){
  		return seconds;
    }
  	
    // Reset method
    public void resetToMidnight() {
        hours = 0; minutes = 0; seconds = 0;
    }

    // Check if morning method
    public boolean isMorning() {
        return hours > 12;
    }

    // Advance one second method
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
