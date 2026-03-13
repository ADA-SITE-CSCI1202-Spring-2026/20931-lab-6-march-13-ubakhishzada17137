public class Animal {
    String animalName, ownerName;
    int age;
    public Animal(String animalName, String ownerName, int age){
        this.animalName = animalName;
        this.ownerName = ownerName;
        if (age < 0){
            throw new IllegalArgumentException("Age should be bigger or equal to 0");
        }
        this.age = age;
    }

    public void setAnimalName(String newAnimalName){
        animalName = newAnimalName;
    }
    public void setOwnerName(String newOwnerName){
        ownerName = newOwnerName;
    }
    public void setAge(int newAge){
        if (newAge < 0){
            throw new IllegalArgumentException("Age should be bigger or equal to 0");
        }
        age = newAge;
    }

    public String getAnimalName(){
        return animalName;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return animalName+ " " + ownerName + " " + age;
    }

    @Override
    public boolean equals(Object obj){
        Animal animal = (Animal) obj;
        return this.animalName.equals(animal.animalName) &&
           this.ownerName.equals(animal.ownerName) &&
           this.age == animal.age;
    }
}
