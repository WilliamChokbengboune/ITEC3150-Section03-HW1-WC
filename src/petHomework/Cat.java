/**
 *Class: Cat
 * Author: William Chokbengboune
 * Date: January 13th, 2024
 * @Version: 1.0
 *
 */

package petHomework;

public class Cat extends Pet {
    public String clawOrDeclawed;
    public String hairLength;
    public String color;


    public Cat(String owner, String petName, String petAge, String species,
               String clawOrDeclawed,  String hairLength, String color) {
        super(owner, petName, petAge, species);
        this.clawOrDeclawed = clawOrDeclawed;
        this.hairLength = hairLength;
        this.color = color;
    }

    public String getClawOrDeclawed() {
        return clawOrDeclawed;
    }

    public void setClawOrDeclawed(String clawOrDeclawed) {
        this.clawOrDeclawed = clawOrDeclawed;
    }

    public String getHairLength() {
        return hairLength;
    }

    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
