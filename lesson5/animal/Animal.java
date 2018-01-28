public interface Animal {
    /**
     * Returns the kind of the animal
     * 
     * @return the kind of animal
     */
     
    
    public String animalKind();
    
    /**
     * Returns the current age of the animal
     * 
     * @return the age of the animal
     */
    
    public int getAge();
    
    /**
     * Returns true if the animal can eat the given food
     * 
     * @param food - the name of food
     * @return whether or not the animal can eat the given food
     */
    
    public boolean canEat(String food);
    
    /**
     * Returns Exception if the animal cannot eat the given food
     * 
     * @param food - the name of food
     * @return can animal eat the given food
     */
    public void feed(String food) throws Exception;
    
    
    /**
     * prints out the voice of the animal
     */
    
    
    public String voice();
    
    
    
    /**
     * Increments the animal's age by one year
     */
    public void ageOneYear();
    
    
}

