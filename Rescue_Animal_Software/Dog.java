public class Dog extends RescueAnimal {

    // Instance variable
    public String breed;
    public String dogLocation;
    
    

 
    // Constructor
    public Dog(String theName, String theBreed, String theType, String theGender, String theSource, String theTrainingLocation) {
    	super(theName, theType, theGender, theSource, theTrainingLocation);
    	breed = theBreed;
    }

//------------- Accessor Method------------------------------------------------------------------------------------------------------------------------------------------------------
    // gets the breed type
    public String getBreed() {
        return breed;
    }
    // gets the dogs location
    public String getDogLocation() {
    	
    	if ( super.getStatus() == "intake") {
    		dogLocation = super.getAcquisitionSource();	
    	}		
    	else if (super.getStatus() == "training") {
    		dogLocation = super.getTrainingLocation(); 
    	}
    	else if (super.getStatus() == "In Service") {
    		dogLocation = super.getInservelLocation();	
    	}
    	else if (super.getStatus() == "Farm") {
    		dogLocation = super.getFarmLocation();	
    	}
    	else if (super.getStatus() == "Death") {
    		dogLocation = super.getDeathLocation();	
    	}
    	 
    	return dogLocation;
    }

//-----------------------------------------------------------------------------------------------------------------------------------------------
    
    // Mutator Method
     // sets the dogs breed
    public void setBreed(String dogBreed) {
    	if ((dogBreed =="American pit bull terrier" ) ||
    		(dogBreed == "Beagle") ||
    		(dogBreed == "Belgian Malinois") ||
    		(dogBreed == "Border collie") ||
    		(dogBreed == "Bloodhound") ||
    		(dogBreed == "English springer spaniel") ||
    		(dogBreed == "German shepherd") ||
    		(dogBreed == "German shorthaired pointer") ||
    		(dogBreed == "Golden retriever") ||
    		(dogBreed == "Labrador retriever") ||
    		(dogBreed == "Nova Scotia duck tolling retriever") ||
    		(dogBreed == "Rough collie") ||
    		(dogBreed == "Smooth collie ")) {
    		breed = dogBreed;
    	}
    }
    // sets the dogs location
    public void setDogLocation(String theDogLocation) {
    	if (super.getStatus() == "intake") {
    	super.setAcquisitionSource(theDogLocation);
    	}
    	dogLocation = theDogLocation;
    }
    // sets the weight of the dog
    public void setWeight(double theWeight) {
    	super.setWeight(theWeight);
    }
    // sets the age of the dog
    public void setAge(int theAge) {
    	super.setAge(theAge);
    }
}