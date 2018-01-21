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
public class ElectronicDeviceTest {
public static void doSomething (ElectronicDevices devices){
    System.out.println(devices);
    devices.internet();
    devices.creator();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mobile samsung= new Mobile("Samsung",true);
       samsung.fingerprint();
       samsung.vibration();
       Mobile iphone = new Mobile ("IPhone", false);
       iphone.fingerprint();
       iphone.vibration();
       Laptop lenovo = new Laptop ("Lenovo", true);
       lenovo.os();
       lenovo.sensory();
       ElectronicDevices[]devices={samsung, iphone, lenovo};
       for (int i=0; i<3; i++){
           doSomething(devices[i]);
       }
    }
// TODO code application logic here
    }
     

