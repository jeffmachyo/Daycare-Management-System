/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccines;

import samplefx.Child;

/**
 *
 * @author jeff
 */
public class HepA extends Vaccine {

    public HepA(int doseOneAge) {
        super(doseOneAge);
    }

    public HepA(int doseOneAge, int doseTwoAge) {
        super(doseOneAge, doseTwoAge);
    }

    public HepA(int doseOneAge, int doseTwoAge, int doseThreeAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge);
    }

    public HepA(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge);
    }

    public HepA(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge);
    }

    public HepA(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge, int doseSixAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge, doseSixAge);
    }

    public HepA(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge, int doseSixAge, int numberOfDoses) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge, doseSixAge, numberOfDoses);
    }

    public HepA() {
    }

    @Override
    public int doseOne() {
        return new HepA(12,18).getDoseOneAge();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int doseTwo() {
        return new HepA(12,18).getDoseTwoAge();
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int doseThree() {
        return 0;
        //sthrow new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
