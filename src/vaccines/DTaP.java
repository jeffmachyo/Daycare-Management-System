/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccines;

/**
 *
 * @author jeff
 */
public class DTaP extends Vaccine {

    public DTaP(int doseOneAge) {
        super(doseOneAge);
    }

    public DTaP(int doseOneAge, int doseTwoAge) {
        super(doseOneAge, doseTwoAge);
    }

    public DTaP(int doseOneAge, int doseTwoAge, int doseThreeAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge);
    }

    public DTaP(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge);
    }

    public DTaP(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge);
    }

    public DTaP(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge, int doseSixAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge, doseSixAge);
    }

    public DTaP(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge, int doseSixAge, int numberOfDoses) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge, doseSixAge, numberOfDoses);
    }

    public DTaP() {
        super();
    }

    @Override
    public int doseOne() {
        return new DTaP(2, 4,6,15,48).getDoseOneAge();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int doseTwo() {
        return new DTaP(2, 4,6,15,48).getDoseTwoAge();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int doseThree() {
        return new DTaP(2, 4,6,15,48).getDoseThreeAge();
        //sthrow new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
