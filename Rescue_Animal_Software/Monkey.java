public class Monkey extends RescueAnimal {


    // Instance variable
    public String species;
    public String monkeyLocation;
    public double tailLength;
    public double height; 
    public double bodyLength;
    public double torsoSize;
    public double skullSize;
    public double neckSize;
    
    
    // Constructor
    public Monkey(String theName, String theSpecies, String theType, String theGender, String theSource, String theTrainingLocation){
    	super(theName, theType, theGender, theSource, theTrainingLocation);
    	species = theSpecies;
    }

    // Accessor Method
    public String getspecies() {
        return species;
    }
    // gets for tail length
    public double getTailLength() {
    	return tailLength;
    }
    // gets height length
    public double getHeight() {
    	return height;
    }
    // gets body length
    public double getBodyLength() {
    	return bodyLength;
    }
    // gets torso size
    public double getTorsoSize() {
    	return torsoSize;
    }
    // gets skull size
    public double getSkullSize() {
    	return skullSize;
    }
    // gets neck size
    public double getneckSize() {
    	return neckSize;
    }
    // gets the monkeys location
    public String getMonkeyLocation() {
    	
    	if ( super.getStatus() == "intake") {
    		monkeyLocation = super.getAcquisitionSource();	
    	}		
    	else if (super.getStatus() == "training") {
    		monkeyLocation = super.getTrainingLocation(); 
    	}
    	else if (super.getStatus() == "In Service") {
    		monkeyLocation = super.getInservelLocation();	
    	}
    	else if (super.getStatus() == "Farm") {
    		monkeyLocation = super.getFarmLocation();	
    	}
    	else if (super.getStatus() == "Death") {
    		monkeyLocation = super.getDeathLocation();	
    	}
    	 
    	return monkeyLocation;
    }

//-Add mutator Methods here----------------------------------------------------------------------------------------------------------------------------------------------

      // sets the type of monkey species
    public void setSpecies(String monkeySpecies) {
    	if ((monkeySpecies =="Capuchin" ) ||
    		(monkeySpecies == "Guenon") ||
    		(monkeySpecies == "Macaque") ||
    		(monkeySpecies == "Marmoset") ||
    		(monkeySpecies== "Squirrel monkey") ||
    		(monkeySpecies == "Tamarin")){
    		species = monkeySpecies;
    	}
    }
    // sets the monkey location
    public void setMonkeyLocation(String theMonkeyLocation) {
    	if (super.getStatus() == "intake") {
    	super.setAcquisitionSource(theMonkeyLocation);
    	}
    	monkeyLocation = theMonkeyLocation;
    }
    // sets the weight of the monkey
    public void setWeight(double theWeight) {
    	super.setWeight(theWeight);
    }
    // sets the age of the monkey
    public void setAge(int theAge) {
    	super.setAge(theAge);
    	}
   // sets the tail length of the monkey
    public void setTailLength(double theLength) {
    	tailLength = theLength ;
    }
    // sets the height of the monkey
    public void setHeight(double theHeight) {
    	height = theHeight ;
    }
    // sets the body length of the monkey
    public void setBodyLength(double theBodyLength) {
    	bodyLength = theBodyLength;
    }
    // sets the torso size of the monkey
    public void setTorsoSize(double theTorso) {
    	torsoSize = theTorso;
    }
    // sets the skull size of the monkey
    public void setSkullSize(double theSkullSize) {
    	skullSize = theSkullSize;
    }
    // sets the neck size of the monkey
    public void setNeckSize (double theNeckSize) {
    	neckSize = theNeckSize;
    }
    
    
}
