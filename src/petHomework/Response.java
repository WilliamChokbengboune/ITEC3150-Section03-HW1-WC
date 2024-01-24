/**
 * Class: UserInterface
 * Author: William Chokbengboune
 * Date: 1/16/2024
 * @Course: ITEC 3150 section 03
 * @Version: 1.0
 * Class Description: This class will take the user response and make decisions based on that.
 *      The decisions wll take a user's response and implement it into the if statement.
 */

package petHomework;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Response {
    public LinkedList<String> fileReader(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(System.in);
        LinkedList<String> lineInformation = new LinkedList<>();
        // linkedlist is made to hold the information

        String line = br.readLine();
        while (line != null) {
            lineInformation.add(line);
            line = br.readLine();
            System.out.println(line);
        }
        sc.nextLine();
        //next line is to separate lines after it is put in by the while loop

        br.close();
        sc.close();
        // close lines are to close the scanner and buffered reader so there is no memory leak

        return lineInformation;
    }

    public void fileWriter(List<String> lists) throws IOException{
        List<String> list = new ArrayList<>();
        FileWriter fw = new FileWriter("AnimalInformation.txt");
        BufferedWriter bw = new BufferedWriter(fw);

    }

}
