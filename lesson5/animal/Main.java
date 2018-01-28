public class Main {
    
    public static void feedMeat(Animal animal) {
        try {
            animal.feed("Meat");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String args[]) {

        Cow cow = new Cow();
        Tiger tiger = new Tiger();
        Animal rabbit = new rabbit();
        feedMeat(cow);
        feedMeat(tiger);
        feedMeat(rabbit);
        
        System.out.println(cow.voice());
        System.out.println(tiger.voice());
        System.out.println(rabbit.voice());
        
        cow.ageOneYear();
        tiger.ageOneYear();
        rabbit.ageOneYear();
        
        System.out.println(tiger.getAge());
        System.out.println(cow.getAge());
        System.out.println(rabbit.getAge());
        
        
    }
}
