public class rabbit extends AnimalImpl {
    
    private int age;
    
    @Override
    public String animalKind() {
        return "rabbit";
    }

    @Override
    public boolean canEat(String food){
        if(food.equals("carrot")) {
            return true;
        } 
        
        return false;
    }
    @Override
    public void feed(String food) throws Exception {
        if(!this.canEat(food)){
            throw new Exception("Rabbits cannot eat " + food);
            
        }
        
        System.out.println("NAm nam, nam it's really delicious !!!");
    }

    @Override
    public String voice(){
        return "Sweet Dreams are made of this, who I am do disagree, I traveled the world and seven season, everybody is looing for something";
    }
    public String toString(){
        return "A Rabbit which is " + age + " years old";
    }
}
