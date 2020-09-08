import java.util.ArrayList;

public class petMaster{
    

public petMaster() {
  
} 



    public boolean findPet(ArrayList <pet> petList,String inputType, String inputName, int inputAge){
        int i = 0;
        boolean found = false;
        

        while ((i < petList.size()) && (found == false)) {
          found = petList.get(i).getPet(inputType,inputName,inputAge);
          i++;
          }
          return (found);
        }


    public void addPet(ArrayList <pet> petList, pet myPet){
        int next = petList.size();
        petList.add(next,myPet);
       
            
        }
    public void loadMasterList(ArrayList <pet> petList){
         pet varPet = new pet();
         varPet.setPet("dog", "tasha", 9);
         addPet(petList,varPet);
                 
         pet varPet1 = new pet();
        varPet1.setPet("dog", "rooster", 2);
        addPet(petList,varPet1);
        
        pet varPet2 = new pet();
        varPet2.setPet("cat", "pepper", 13);
        addPet(petList,varPet2);
        
        pet varPet3 = new pet();
        varPet3.setPet("cat","sara", 14);
        addPet(petList,varPet3);
        
        pet varPet4 = new pet();
        varPet4.setPet("dog", "jenny", 8);
        addPet(petList,varPet4);
        
        pet varPet5 = new pet();
        varPet5.setPet("dog", "sandy", 9);
        addPet(petList,varPet5);
        
        
        pet varPet6 = new pet();
        varPet6.setPet("cat", "moonlight", 10);
        addPet(petList,varPet6);
        
        pet varPet7 = new pet();
        varPet7.setPet("dog","sheeba", 7);
        addPet(petList,varPet7);
        
        pet varPet8 = new pet();
        varPet8.setPet("cat","janet", 6);
        addPet(petList,varPet8);
        
        pet varPet9 = new pet();
        varPet9.setPet("dog", "missy", 7); 
        addPet(petList,varPet9);
         
    }

}