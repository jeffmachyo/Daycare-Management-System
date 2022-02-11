/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccines;

/**
 *
 * @author jeff
 */
public class RotaVirus extends Vaccine {

    public RotaVirus(int doseOneAge) {
        super(doseOneAge);
    }

    public RotaVirus(int doseOneAge, int doseTwoAge) {
        super(doseOneAge, doseTwoAge);
    }

    public RotaVirus(int doseOneAge, int doseTwoAge, int doseThreeAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge);
    }

    public RotaVirus(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge);
    }

    public RotaVirus(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge);
    }

    public RotaVirus(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge, int doseSixAge) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge, doseSixAge);
    }

    public RotaVirus(int doseOneAge, int doseTwoAge, int doseThreeAge, int doseFourAge, int doseFiveAge, int doseSixAge, int numberOfDoses) {
        super(doseOneAge, doseTwoAge, doseThreeAge, doseFourAge, doseFiveAge, doseSixAge, numberOfDoses);
    }

    public RotaVirus() {
    }

    @Override
    public int doseOne() {
        return new RotaVirus(2, 4).getDoseOneAge();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int doseTwo() {
        return new RotaVirus(2, 4).getDoseTwoAge();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int doseThree() {
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
