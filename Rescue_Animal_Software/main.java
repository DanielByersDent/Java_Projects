

	import java.util.Scanner;
	import java.util.ArrayList;

	public class main {
		
		
		public static void main(String[] args) {

		    // Instance variables
			 masterList theAList = new masterList();
			 String loci = "United States"; 
			 String loci2 = "Scotland";
			 
			 // array list content
			 RescueAnimal newAni = (RescueAnimal) new Dog("Rooster", "German Shepherd","DOG", "Male","Seattle, Washington",loci.toUpperCase());
			 theAList.addAnimal(newAni);
			 newAni = (RescueAnimal) new Dog("Sheba","Collie","DOG", "Female", "Madison,Wisconsin",loci.toUpperCase());
			 theAList.addAnimal(newAni);
			 newAni = (RescueAnimal) new Dog("Tasha","Collie","DOG","Female","Glasgow", loci2.toUpperCase());
			 theAList.addAnimal(newAni);
			 newAni = (RescueAnimal) new Dog("David","Collie","DOG","Male", "Madison, Wisconsin", loci.toUpperCase());
			 theAList.addAnimal(newAni);
			 newAni = (RescueAnimal) new Monkey("Tammy","Tamarin","MONKEY", "Female", "Chicago, Illinois", loci.toUpperCase());
			 theAList.addAnimal(newAni);
			 newAni = (RescueAnimal) new Monkey("Billy","Squirrel Monkey","MONKEY", "Male", "Topeka, Kansas", loci.toUpperCase());
			 theAList.addAnimal(newAni);
			 
			
			
			//masterList theAList = new masterList();  
			Scanner scnr  = new Scanner(System.in);
			boolean userSuccess = false;
			int i  = 0;
			String intakeProccess; 
			String mainStatus;
			
		    // Create New Dog
			String loci3 = "France";
			Dog itDog = new Dog("Richard", "German Shepard", "DOG", "Male", "Paris",loci3.toUpperCase());
			theAList.addAnimal(itDog);
			

		    // Create New Monkey
			String loci4 = "Thailand";
			Monkey itMonkey = new Monkey("Larry", "Capuchin", "MONKEY", "Male", "Bongkok",loci4.toUpperCase());
			theAList.addAnimal(itMonkey);


		    // Method to process request for a rescue animal
			while (i < theAList.getSize() && userSuccess == false) {
				System.out.println("What is country where are you located? ");
				String customerCountry = scnr.nextLine();
				System.out.println("Do you want a Dog or a Monkey?");
				String customerType = scnr.nextLine();
				userSuccess = theAList.findRequestMatch(customerCountry.toUpperCase(), customerType.toUpperCase());
				System.out.println("We have reserved your requested animal!");
				i++;
			} // This helps the method findRequestMatch in masterList to get user input to locate 
			// an animal. 
			userSuccess = false;
			
		    // Method(s) to update information on existing animals
			while (i < theAList.getSize() && userSuccess == false) {
				System.out.println("Hello! Would like to procceed with intake? Yes or No");
				intakeProccess  = scnr.nextLine();
				intakeProccess = intakeProccess.toUpperCase();
				if(intakeProccess.equals("YES")) {
					System.out.println("What rescue animal would like to update? Dog or Monkey");
					String type = scnr.nextLine();
					type = type.toUpperCase();
					if (type.equals("DOG")) {
						userSuccess = true;
						System.out.println("What is the dogs name?");
						String name2 =  scnr.nextLine();
						System.out.println("What is the breed?");
						String Type2 =  scnr.nextLine();
						System.out.println("What is the dogs gender? Male or Female");
						String gender2 = scnr.nextLine();
						System.out.println("Where was this dog from?");
						String source2 = scnr.nextLine();
						Dog itDog2 = new Dog(name2, Type2, "DOG",  gender2, source2, "UNITED STATES");
						
						System.out.println("What is the dogs weight?");
						double weight = scnr.nextDouble();
						System.out.println("What is the dogs age?");
						int age = scnr.nextInt();
						itDog2.setWeight(weight);
						itDog2.setAge(age);
						itDog2.setStatus("intake");
						theAList.addAnimal(itDog2);
						
					}
					else if(type.equals("MONKEY")) {
						userSuccess = true;
						System.out.println("What is the monkeys name?");
						String name2 =  scnr.nextLine();
						System.out.println("What is the species?");
						String Type2 =  scnr.nextLine();
						System.out.println("What is the monkeys gender? Male or Female");
						String gender2 = scnr.nextLine();
						System.out.println("Where was this monkeys from?");
						String source2 = scnr.nextLine();
						Monkey itMonkey2 = new Monkey(name2, Type2, "MONKEY",  gender2, source2,"UNITED STATES");
						
						System.out.println("What is the monkeys weight?");
						double weight = scnr.nextDouble();
						System.out.println("What is the monkeys age?");
						int age = scnr.nextInt();
						System.out.println("What is the monkeys tail length?");
						double length = scnr.nextDouble();
						System.out.println("What is the monkeys height");
						double height = scnr.nextDouble();
						System.out.println("What is the monkey body length?");
						double bodyLength2 = scnr.nextDouble();
						System.out.println("What is the monkeys torso size?");
						double torsoSize2 = scnr.nextDouble();
						System.out.println("What is the monkeys skull size?");
						double skullSize2 = scnr.nextDouble();
						System.out.println("What is the monkeys neck size?");
						double neckSize2 = scnr.nextDouble();
						
						itMonkey2.setNeckSize(neckSize2);
						itMonkey2.setSkullSize(skullSize2);		
						itMonkey2.setBodyLength(bodyLength2);
						itMonkey2.setHeight(height);
						itMonkey2.setTailLength(length);
						itMonkey2.setWeight(weight);
						itMonkey2.setAge(age);
						itMonkey2.setStatus("intake");
						theAList.addAnimal(itMonkey2);
						
					}
							
					
				}
				
			}
			

		    // Method to display matrix of animal based on location and status/training phase
			for (int e = 0; e < theAList.getAniStatus_n_Phase().size(); e++) {
				for(int u = 0; u < theAList.getAniStatus_n_Phase().get(e).size(); u++) {
					theAList.getAniStatus_n_Phase().get(e).get(u);
					System.out.print(theAList.getAniStatus_n_Phase().get(e).get(u).getName() + " is a " + theAList.getAniStatus_n_Phase().get(e).get(u).getType());
					System.out.print(" at location  "+ theAList.getAniStatus_n_Phase().get(e).get(u).getglobalLocation());
					System.out.print(" with status "+ theAList.getAniStatus_n_Phase().get(e).get(u).getStatus());
					System.out.println();
						mainStatus = theAList.getAniStatus_n_Phase().get(e).get(u).getStatus();
							if (mainStatus == "Training") {
								System.out.println("This animal is " + theAList.getAniStatus_n_Phase().get(e).get(u).getTrainingPhase() + "of training.");
					
				             } // end of if
				
			          }// end of inner for loop
				  }// end of outer for loop
			  }// end of public static void main(String[] args)
		
}// end of main
