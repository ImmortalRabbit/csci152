/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicdevices;

/**
 *
 * @author samal
 */
public class Laptop extends ElectronicDevices {
    private boolean isWindows;

    /**
     *
     * @param t
     * @param i
     */
    public Laptop (String t, boolean i){
        super (t);
       isWindows=i;
    }
    public void creator(){
       if (isWindows){
           System.out.println("OS Founded by Microsoft Corporation ");
       } else {
           System.out.println("OS Created and founded by Stive Jobs and Steve Wozniak");
       }
    }

    /**
     *
     */
    public void os(){
       if (isWindows){
           System.out.println("Windows OS ");
       } else {
           System.out.println("IOS");
       }
    }

    /**
     *
     */
    public void sensory(){
       if (isWindows){
           System.out.println("Most of the new versions of Windows OS laptops has touch screen");
       } else {
           System.out.println("There are currently no touch screen");
       }
    }
    
    public String toString(){
        return "Laptop type"+ getType();
    }
}
 
   
