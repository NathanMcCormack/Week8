package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        //Specify the file name
        String fileName = "File13.txt";

        //Create a File object
        File myFile = new File(fileName);
        String fileName2 = "File11.txt";

        try(FileWriter writer = new FileWriter(fileName2)){
            //Notice there is no close method called. This is a try with resources

            writer.write("Text for file");
            System.out.println("Successfuly printed to file");
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