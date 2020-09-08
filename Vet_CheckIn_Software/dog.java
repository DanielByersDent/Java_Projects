public class dog extends pet{

    int dogSpaceNbr;
    double dogWeight;
    boolean grooming;

    public dog() {

        dogSpaceNbr = -1;
        dogWeight = 0.0;
        grooming = false;
    }
    public boolean getGrooming(){
        return this.grooming;

    }
    public void setGrooming(boolean grum){
        this.grooming = grum;
    }
    public double getDogWeight(){
        return this.dogWeight;
    }
    public void setDogWeight(double wieght){
        this.dogWeight = wieght;
    }
} // end of dog class