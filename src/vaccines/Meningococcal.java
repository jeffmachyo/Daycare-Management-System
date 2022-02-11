/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccines;

/**
 *
 * @author jeff
 */
public class Meningococcal extends Vaccine {

    public Meningococcal(int doseOneAge) {
        super(doseOneAge);
    }

    public Meningococcal(int doseOneAge, int doseTwoAge) {
        super(doseOneAge, doseTwoAge);
    }

    public Meningococcal(int doseOneAge, int doseTwoAge, int doseThreeAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge);
    }

    public Meningococcal(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge);
    }

    public Meningococcal(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge);
    }

    public Meningococcal(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge, int doseSixAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge, doseSixAge);
    }

    public Meningococcal(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge, int doseSixAge, int numberOfDoses) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge, doseSixAge, numberOfDoses);
    }

    public Meningococcal() {
    }

    @Override
    public int doseOne() {
        return new Meningococcal(132,192).getDoseOneAge();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int doseTwo() {
        return new Meningococcal(132,192).getDoseTwoAge();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int doseThree() {
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
