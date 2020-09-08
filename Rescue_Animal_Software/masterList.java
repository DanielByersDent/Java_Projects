import java.util.ArrayList;


	public class masterList{
       // Variables
		ArrayList<RescueAnimal> aniList = new ArrayList<RescueAnimal>();
		int i = 0; 
		
		
	// constructor	 
	masterList(){
	
	}
	
	
//Mutator Methods -----------------------------------------------------------------------------------------------------	

	
	
	//addAnimals to the arrayList
  public void addAnimal(RescueAnimal newAnimal){
	  		newAnimal.setStatus("Intake");
	        this.aniList.add(newAnimal);
	        
	      
}
// Finds request match finds the customer location, what of animal, and status of animal
  public boolean  findRequestMatch(String customerCountry, String customerType) {
		RescueAnimal currentAni;
		boolean success  = false;

		while ( i < this.aniList.size() && success == false) {

  		currentAni = aniList.get(i);

      	if (currentAni.getTrainingLocation().equals(customerCountry)) {
        	if (currentAni.getType().equals(customerType)){
        		if ((currentAni.getAnimalStatus().equals("Intake")) ||
      	  		   (currentAni.getAnimalStatus().equals("Training"))) {	
        			currentAni.setReserved();
        			success = true;
      	  		}
           }
        } 
      	i++;
	 } // Ending of the for loop
		return success;
}

	
//Accessor Methods--------------------------------------------------------------------------------------------------------------------------------------------------------------
	       
  public ArrayList<RescueAnimal> getInServeAnimal() {
			        String currentStatus= " ";
			        ArrayList<RescueAnimal> inserveList = new ArrayList<RescueAnimal>();
			        
			    	  for (int i = 0; i < aniList.size(); i++) {
			        	currentStatus = aniList.get(i).getAnimalStatus();
			        	if (currentStatus == "In Service") {
			        		inserveList.add(aniList.get(i));		
			            }    	
			          }
			    	  return inserveList;	    	  
	           }
  
  public int getSize(){
	  
	  return this.aniList.size();
  }
  //-------This a arraylist of arraylist is for findReequestMatch and main to iterate through to find the details of the RescueAnimal
   public ArrayList<ArrayList<RescueAnimal>> getAniStatus_n_Phase(){
	   ArrayList<ArrayList<RescueAnimal>> Status_n_Phase = new ArrayList<ArrayList<RescueAnimal>>();
	   ArrayList<RescueAnimal> ofAniLocation = new ArrayList<RescueAnimal>();
	   String place[] = new String [15];
	   int y = 0;
	   int t = 0;
	   boolean found = false;
	   boolean placed= false;
	   
	       
		   place[0] = this.aniList.get(0).getglobalLocation();
		   ofAniLocation = new ArrayList<RescueAnimal>();
     	   ofAniLocation.add(aniList.get(i));
     	   Status_n_Phase.add(ofAniLocation); 

	   y++;
	   for (int i = 1; i < this.aniList.size(); i++) {

		   t = 0;
		   found = false;
		   placed = false;
		   while (t <= y && found == false && placed == false) {
			   if(place[t].equals(aniList.get(i).getglobalLocation())) {
				   found = true;
				  Status_n_Phase.get(t).add(aniList.get( i));

			   }
			   else {
				   
				   place[y] = aniList.get(i).getglobalLocation();
				   placed = true;
				   ofAniLocation = new ArrayList<RescueAnimal>();
	               ofAniLocation.add(aniList.get(i));	
	               Status_n_Phase.add(ofAniLocation);
				   y++;
			   }
			   
			   t++;
		   }// end of while loop
   } // end of for loop 
       	
	   
	   return Status_n_Phase;
   }// end of arraylist of arraylist's or method 
   
  }