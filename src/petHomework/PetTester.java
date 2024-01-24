/**
 * Class: PetTester
 * Author: William Chokbengboune
 * Date: 1/14/2024
 * @Version: 1.0
 * Class Description: This class will compile the
 * @Requirements:
 * 1. properly reads file
 * 2. minimum requirements of cats, dogs and 2 other types
 * 3. Cats have an indication of long or short haired, clawed or declawed, and color
 * 4. Dogs have a breed and color (String ArrayList)
 * 5. Other pet types must be identified and indication of special handling
 * 6. Creates a list of 2 pets per type (An ArrayList)
 * 7. Asks the user if would like to add or remove a pet (Scanner)
 * 8. Pets have a name, owner's name, age, and species (Species will be generic multi-type)
 * 9. Save the list to the text file when finished
 *
 */

package petHomework;

import java.io.IOException;
import java.util.Scanner;

public class PetTester {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Response ui = new Response();
        System.out.println(ui.fileReader("src/petHomework/AnimalInformationList"));

    }
}
