public class AnimalImpl implements Animal {
    private int age;
    private int maxAge;
    private boolean isAlive;

    @Override
    public int getAge(){
        return age;
    }
    @Override
    public void ageOneYear(){
        age++;
        if(age>maxAge){
            isAlive = false;
        }
    }
    
    @Override
    public String animalKind(){
        return "animalKind";
    }
    
    @Override
    public boolean canEat(String food){
        return true;
    }
    @Override
    public void feed(String food) throws Exception{
        throw new Exception("Exception");
    }

    @Override
    public String voice(){
        return "voice";
    }
}