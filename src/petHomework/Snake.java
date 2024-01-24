/**
 *Class: Cat
 * Author: William Chokbengboune
 * Date: January 13th, 2024
 * @Version: 1.0
 *Description: This program is a snake class. It gives the name, age, owner name, and how to handle it.
 */

package petHomework;

public class Snake extends Pet{
    public String handling;

    public Snake(String owner, String petName, String petAge, String species, String handling) {
        super(owner, petName, petAge, species);
        this.handling = handling;
    }

    public String getHandling() {
        return handling;
    }

    public void setHandling(String handling) {
        this.handling = handling;
    }
}
