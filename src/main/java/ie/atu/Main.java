package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args){
        //Specify the file name
        String fileName = "File13.txt";

        //Create a File object
        File myFile = new File(fileName);
        String fileName2 = "File11.txt";


        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName2, true))){ //setting this to true keeps the old text printed to the file
            //Notice there is no close method called. This is a try with resources

            writer.println("Text for file. ");
            System.out.println("Successfully printed to file");
        }
        catch(IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }

        try{
            //Create a new file on the disk
            if (myFile.createNewFile()){
                System.out.println("File created successfully at " + myFile.getAbsolutePath());
            } else{
                System.out.println("File already exists at " + myFile.getAbsolutePath());
            }
        } catch(IOException e){
            System.out.println("An error occurred while creating the file");
            e.printStackTrace();
        }
    }
}