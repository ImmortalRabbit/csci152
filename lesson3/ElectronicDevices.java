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
public class ElectronicDevices {

    private String type;
     
    /**
     *
     * @param t
     */
    public ElectronicDevices (String t){
    type = t;
    }

    /**
     *
     * @return
     */
    public String getType(){
        return type;
    }

    /**
     *
     */
    public void internet (){
        System.out.println ("Internet connection is allowed");
    }

    /**
     *
     */
    public void creator(){
         System.out.println ("it depends on type");
     }
    
    public String toString(){
        return "Your device is "+ type;
    }
}
