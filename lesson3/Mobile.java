/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodevices;


public class Mobile extends ElectronicDevices {
    private boolean isAndroid;

    /**
     *
     * @param t
     * @param a
     */
    public Mobile (String t, boolean a){
        super (t);
        isAndroid=a;
    }
    public void creator(){
       if (isAndroid){
           System.out.println("OS Founded by Andy Rubin, Rich Miner, Nick Sears and Chris White");
       } else {
           System.out.println("OS Created and founded by Stive Jobs and Steve Wozniak");
       }
    }

    /**
     *
     */
    public void fingerprint(){
       if (isAndroid){
           System.out.println("There might be fingerprint scanner of a newer types(from 2016 approximately)");
       } else {
           System.out.println("There is fingerprint scanner beggining with Iphones 5S");
       }
    }

    /**
     *
     */
    public void vibration(){
       if (isAndroid){
           System.out.println("There is no silent mode button ");
       } else {
           System.out.println("There is silent mode button on the left side");
       }
    }
    public String toString(){
        return "Phone type"+ getType();
    }
              
}
