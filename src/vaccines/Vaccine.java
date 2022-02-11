/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vaccines;
import samplefx.Child;
//import samplefx.Person;
/**
 *
 * @author jeff
 */
public abstract class Vaccine {
    
    private int doseOneAge, doseTwoAge, doseThreeAge,doseFourAge,doseFiveAge,doseSixAge,numberOfDoses;

    public int getDoseOneAge() {
        return doseOneAge;
    }

    public int getDoseTwoAge() {
        return doseTwoAge;
    }

    public int getDoseThreeAge() {
        return doseThreeAge;
    }

    public int getDoseFourAge() {
        return doseFourAge;
    }

    public int getDoseFiveAge() {
        return doseFiveAge;
    }

    public int getDoseSixAge() {
        return doseSixAge;
    }

    public int getNumberOfDoses() {
        return numberOfDoses;
    }

    public Vaccine(int doseOneAge) {
        this.doseOneAge = doseOneAge;
    }

    public Vaccine(int doseOneAge, int doseTwoAge) {
        this.doseOneAge = doseOneAge;
        this.doseTwoAge = doseTwoAge;
    }

    public Vaccine(int doseOneAge, int doseTwoAge, int doseThreeAge) {
        this.doseOneAge = doseOneAge;
        this.doseTwoAge = doseTwoAge;
        this.doseThreeAge = doseThreeAge;
    }

    public Vaccine(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge) {
        this.doseOneAge = doseOneAge;
        this.doseTwoAge = doseTwoAge;
        this.doseThreeAge = doseThreeAge;
        this.doseFourAge = doseFourAge;
    }

    public Vaccine(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge) {
        this.doseOneAge = doseOneAge;
        this.doseTwoAge = doseTwoAge;
        this.doseThreeAge = doseThreeAge;
        this.doseFourAge = doseFourAge;
        this.doseFiveAge = doseFiveAge;
    }

    public Vaccine(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge, int doseSixAge) {
        this.doseOneAge = doseOneAge;
        this.doseTwoAge = doseTwoAge;
        this.doseThreeAge = doseThreeAge;
        this.doseFourAge = doseFourAge;
        this.doseFiveAge = doseFiveAge;
        this.doseSixAge = doseSixAge;
    }

    public Vaccine(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge, int doseSixAge, int numberOfDoses) {
        this.doseOneAge = doseOneAge;
        this.doseTwoAge = doseTwoAge;
        this.doseThreeAge = doseThreeAge;
        this.doseFourAge = doseFourAge;
        this.doseFiveAge = doseFiveAge;
        this.doseSixAge = doseSixAge;
        this.numberOfDoses = numberOfDoses;
    }

    
    public Vaccine() {
        super();
    }
    public abstract int doseOne();
    public abstract int doseTwo();
    public abstract int doseThree();
    //public abstract int vaccineDoseOneRules(Vaccine vaccine);

    @Override
    public String toString() {
        return "Vaccine{" + "doseOneAge=" + doseOneAge + ", doseTwoAge=" + doseTwoAge + ", doseThreeAge=" + doseThreeAge + ", doseFourAge=" + doseFourAge + ", doseFiveAge=" + doseFiveAge + ", doseSixAge=" + doseSixAge + ", numberOfDoses=" + numberOfDoses + '}';
    }
    
}
