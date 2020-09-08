import java.util.Scanner;
import java.util.ArrayList;


public class main {

    public static void main(String[] args) {
        ArrayList<pet> petList = new ArrayList<pet>();
        petMaster masterList = new petMaster();
        Scanner scnr = new Scanner(System.in);
        boolean valFound = false;
        masterList.loadMasterList(petList);
        
        
        System.out.println("What is the name of your furry friend?");
        String inputName = scnr.next();
        if (inputName.matches("^[a-zA-Z]*$")) {

        }
        else{ 
            System.out.println("Error! Pet names can only contain letters. Have a great day!");

        }

        System.out.println("What is the age of your furry friend?");
        int inputAge = scnr.nextInt();
        
        System.out.println("Is your furry friend a dog, or cat?");
        String inputType = scnr.next();
        inputType = inputType.toLowerCase();

        if (inputType.matches("dog") || inputType.matches("cat"))  {
            
        }
        else{ 
            System.out.println("Error! Pet type can only be dog, or cat. Have a great day!");

        }

        valFound = masterList.findPet(petList, inputType,inputName,inputAge);
        if (valFound == false){
            pet varPet = new pet();
            varPet.setPet(inputType, inputName, inputAge);
            masterList.addPet(petList,varPet);
        }
        else{
            System.out.println("Turns out we found we found your furry friend! Here we have your records!");
        }

    }

}
