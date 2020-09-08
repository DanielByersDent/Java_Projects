public class RescueAnimal {


	// Instance variables
	    private String name;
	    private String Type;
	    //Dog or monkey
	    private String gender;
	    private int age;
	    private double weight;
	    //private SimpleDateFormat acquisitionDate;
	    //private SimpleDateFormat statusDate;
	    private String acquisitionSource;
	    private boolean Reserved = false;
	    private String Status;
	    //status is equal to intake, inservice, farm,retirement and death

	    private String trainingLocation;
	    //private SimpleDateFormat trainingStart;
	    //private SimpleDateFormat trainingEnd;
	    private String trainingStatus;
	  //Phase 1, Phase 2, Phase 3, Phase 4,and Phase 5, failed :phase of training)
	    private boolean retired = false;
	    private boolean death = false;
	    private boolean test = true;
	    private String inServiceCountry;
	    private String inServiceCity;
	    private String inServiceAgency;
	    private String inServicePOC;
	    private String inServiceEmail;
	    private String inServicePhone;
	    private String inServicePostalAddress;
	    private String farmLocation;
	    private String deathLocation;
	    private int i = 0;
	    public String globalLocation;

	    // Constructor
	    // ani stand for animal
	    RescueAnimal(String theName, String theType, String theGender, String theSource, String theTrainingLocation) {
	    	
	    	  name = theName;
		      Type = theType;
		      gender = theGender ;
		      acquisitionSource = theSource;
		      Status="intake";
		      trainingLocation = theTrainingLocation;

	    }
	    
// Add mutator Methods here-----------------------------------------------------------------------------------------------------------------------------------------------
	    // Transfers the animal from one phase to the next
	    public void transferAnimals() {
	    	if (Status == "intake") {
	    		Status= "training";
	    		trainingStatus = "Phase 1";
	    	}
	    	else if(Status == "training") {
	    			if (trainingStatus == "Phase 5") {
	    				Status = "Inservice";
	    			}// end of trainingStatus
	    			else {
	    			Status = "Farm";
	    			farmLocation = "Bermuda";
	    			}//end of farm
	    	   }// end of training 
	    	else if (Status =="Inservice") {
	    		if(retired == true) {
	    			farmLocation = "Bermuda";
	    			Status = "Retirement";
	    		 }// end of retired
	    	    else if(death == true ) {
	    		    Status = "Death";
	    		    deathLocation = this.getInservelLocation();
	    	       }//end of death
	    			
	           }// end of inservice 
	    }

	    // sets the animal status reverse for client
	    public void setReserved() {
	    	this.Reserved = true;
	    
	    }
	    // brings up the report of the animal
	    public void animalReport(int reportType) {
	    	if (reportType == 1)
	    		retired = true;
	    	else if(reportType == 2) {
	    		death =true;
	    	}
	    	
	    }
	    // sets the that the in service animal is located at
	    public void setinServiceAgency(String agencyName) {
	    	inServiceAgency = agencyName;
	    	
	    }
	    // sets the in service country were the animal is at
	    public void setinServiceCountry(String countryName) {
	    	inServiceCountry =countryName;
	    }
	    // sets the in service city that the rescue animal is at
	    public void setinServiceCity(String cityName) {
	    	inServiceCity = cityName;
	    }
	    // sets the inservice POC of the rescue animal
	    public void setinServicePOC(String pocName) {
	    	inServicePOC = pocName;
	    }
	    // sets the email of the agency that the rescue animal is at 
	    public void setinServiceEmail(String emailName) {
	    	inServiceEmail = emailName;
	    }
	    // sets the in service agency's phone number that the rescue animal is at 
	    public void setinServicePhone (String phoneNum) {
	    	inServicePhone = phoneNum;
	    }  
	    // sets the in service agency's postal address that the rescue animal is at 
	    public void setinServicePostalAddress(String addressName) {
	    	inServicePostalAddress = addressName;
	    }
	    //sets the training phase of the animal
	    public void setTrainingPhase() {
	    	if (trainingStatus == "Phase 1") {
	    	
	    		trainingStatus = "Phase 2";
	    	}//end of training phase 1
	    	else if (trainingStatus == "Phase 2") {
	    		trainingStatus ="Phase 3";
	    	}//end of training phase 2
	    	else if (trainingStatus == "Phase 3" ) {
	    		trainingStatus = "Phase 4";
	    	}// end of training phase 3
	    	else if (trainingStatus == "Phase 4") {
	    		trainingStatus = "Phase 5";
	    	}
	    	else if (trainingStatus == "Phase 5") {
	    		trainingStatus = " ";
	    		if (test == true) {
	    			Status = "Inservice";
	    		}
	    		else{
	    			Status = "Farm";
	    	  }
	    	}	
	    }
	     // sets the age of the animal
	      public void setAge(int theAge){
	    	  age = theAge;	  
	      }
	      // sets the weight of the animal
	      public void setWeight(double theWeight){
	    	  weight = theWeight;	  
	      }
	      // sets the status of the animal
	      public void setStatus(String theStatus) {
	    	  Status = theStatus;
	      }
	      // sets the source of the animal is from
	      public void setAcquisitionSource (String theAcquisitionSource) {
	    	  acquisitionSource   = theAcquisitionSource;
	      }
	      // sets the training location of the animal
	      public void setTrainingLocation(String someLocation){
	    	  trainingLocation = someLocation;  
	      }
	      
	      
	      
//--------------------------------------------------------------------------------------------------------------------------------------------	      
	      // Add Accessor Methods here
	      public String getAnimalStatus() {
	        return this.Status;
	      } // Gets status
	      
	      public String getTrainingPhase() {
	    	  return trainingStatus;
	      }// Gets training status
	      
	      //Gets the location of the rescue animal no matter what phase they are in
	      public String getglobalLocation() {
	    	//intake, training,  in service, farm, retirement, and death  
	    	 
	       		if (this.Status.equals("In Service")) {
	       			globalLocation = this.getInservelLocation();
	       			
	       		
	       		}//end of if status equal inservice 
	   		
	       		else if (this.Status.equals("Training") || this.Status.equals("Intake")) { 
	       			globalLocation = this.trainingLocation;
	       		
	       		}// end of else if status equals training
	       	
	       	
	       		else if (this.Status.equals("Retirement")|| this.Status.equals("Farm")) {
	       			globalLocation = this.farmLocation;
	       		
	       		}
	       		else if (this.Status.equals("Death")) {
	       			globalLocation = this.deathLocation; 		
	       		}
	    	  
            return globalLocation;     	  
	      }
	      
	      
	      public String getInservelLocation() {
	        String location = inServicePostalAddress + "\n" + inServiceCity + ", " + inServiceCountry;

	        return location;
	      } // Get the location of an inservice animal
	      
	      public String getTrainingLocation() {
	    	  
	    	  return this.trainingLocation;
	      } // gets the training location of RescueAnimal
	      
	      public String getType(){
	    	  
	    	  return this.Type;
	      } // gets ether if it is a monkey or dog
	      public String getFarmLocation() {
	    	  return farmLocation; 
	      } // gets the location of the farm
	      public String getDeathLocation() {
	    	  return deathLocation; 
	      } // gets the location of the death of the animal
	      public String getAcquisitionSource() {
	    	  return acquisitionSource; 
	      } // get were the animal is from
	      public int getAge(){
	    	  return age; 
	      } // gets age animal
	      public double getWeight(){
	    	  return weight; 
	      } // gets weight of animal 
	      public String getStatus(){
	    	  return Status; 
	      }  // gets the status of the animal
	      public String getName() {
	    	  return name;
	      } // gets the name of the animal
	      
}
	    
