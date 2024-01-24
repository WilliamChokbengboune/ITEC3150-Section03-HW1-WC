/**
 * Class: Pet
 * Author: William Chokbengboune
 * Date: 1/13/2024
 * Version: 1.0
 * Class Description: This class will store the pet information.
 * This class will have the variables, getters and setters.
 */

package petHomework;

public class Pet <T extends Object>{
    public String owner;
    public String petName;
    public String petAge;
    public String species;

    public Pet(String owner, String petName, String petAge, String species) {
        this.owner = owner;
        this.petName = petName;
        this.petAge = petAge;
        this.species = species;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetAge() {
        return petAge;
    }

    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
