public class Dog extends Animal{
    
    String breed;

    public Dog(String animalName, String ownerName, int age, String breed){
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    public void setBreed(String newBreed){
        breed = newBreed;
    }

    public String getBreed(){
        return breed;
    }

    @Override
    public String toString(){
        return "Dog[" + "Breed: " + breed + ", Name: " + animalName + ", Owner: " + ownerName + ", Age: " + age + "]";
    }

    @Override
    public boolean equals(Object obj){
        Dog dog = (Dog) obj;
        return super.equals(obj) && this.breed.equals(dog.breed);
    }
}
