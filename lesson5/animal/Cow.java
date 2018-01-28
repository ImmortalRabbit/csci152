
public class Cow extends AnimalImpl {
    
    private int age;
    
    @Override
    public String animalKind() {
        return "Cow";
    }
    @Override
    public boolean canEat(String food){
        if(food.equals("Grass")) {
            return true;
        } 
        
        return false;
    }
    @Override
    public void feed(String food) throws Exception {
        if(!this.canEat(food)){
            throw new Exception("Cows cannot eat " + food);
            
        }
        
        System.out.println("CHEEP, CHEEP!!!");
    }

    @Override
    public String voice(){
        return "Oooooo";
    }
    public String toString(){
        return "A cow which is " + age + " years old";
    }
}