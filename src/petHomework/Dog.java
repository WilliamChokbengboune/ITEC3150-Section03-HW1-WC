/**
 *Class: Cat
 * Author: William Chokbengboune
 * Date: January 13th, 2024
 * @Version: 1.0
 *The dog class give the name, age, species, breed, and color of the dog
 */
package petHomework;

public class Dog extends Pet{
    public String breed;
    public String color;

    public Dog(String owner, String petName, String petAge, String species, String breed, String color) {
        super(owner, petName, petAge, species);
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
