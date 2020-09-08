public class pet {
    String petType;
    String petName;
    int petAge;
    int dogSpace;
    int catSpace;
    int daysStay;
    double amountDue;

    public pet() {
        petType = " ";
        petName = " ";
        petAge = 0;
        dogSpace = -1;
        catSpace = -1;
        daysStay = 0;
        amountDue = 0.00;
    }


    public void setPet(String pType,String pName, int age) {
        this.petType = pType;
        this.petName = pName;
        this.petAge = age;
    }

    public void updatePet(int age) {

        this.petAge = age;
    }

    public boolean checkIn(int space, int numDays){
        boolean success = false;
// put for loop in to check all of the numDays.
        if (this.petType.equals("dog")) {
            this.dogSpace = space;
            success = true;
        }
        else {
            this.catSpace = space;
            success = true;
        }

        this.daysStay = numDays;

        return success;

    }

    public boolean checkOut(double stayRate, double groomRate){

        double taxRate = 0.15;
        double cost = daysStay * stayRate + this.daysStay/2 * groomRate;
        this.amountDue = cost * taxRate + cost;
        return true;
        //figure out if they paid you by putting in if or else statements

      }

      public boolean getPet(String inputType, String inputName, int inputAge) {
        boolean found = false;
        inputType = inputType.toLowerCase();
        inputName = inputName.toLowerCase():
        
        if ((this.petType == inputType) && (this.petName == inputName) && (this.petAge == inputAge)){
            found = true;
          }
         return found;
      }//end of getPet

}//end of pet class

