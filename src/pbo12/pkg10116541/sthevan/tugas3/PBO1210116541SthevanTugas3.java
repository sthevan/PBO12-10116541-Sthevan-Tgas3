/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12.pkg10116541.sthevan.tugas3;
class nilaiMahasiswa {

    private String name;
    private int nim;
    private double QUIZ, UTS, UAS, NA;

    public void setName(String name) {
        this.name = name;

    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void getName() {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Nama ke " + i + " =  " + name);

        }
    }

    public void getNim() {
        for (int i = 11; i >= 1; i--) {
            System.out.println("Nim ke " + i + " = " + nim);
        }
    }

    public void setValuequiz(double quiz) {
        this.QUIZ = quiz;

    }

    public void setValueuts(double uts) {

        this.UTS = uts;

    }

    public void setValueuas(double uas) {

        this.UAS = uas;

    }

    public void getValuenilai() {

        System.out.println("Nilai QUIZ  =" + QUIZ);
        System.out.println("Nilai UTS   =" + UTS);
        System.out.println("Nilai UAS   =" + UAS);

    }

    public void getNilaina() {
        NA = QUIZ * 0.2 + UTS * 0.3 + UAS * 0.5;
        System.out.println("Nilai Akhir =" + NA);
    }

    public void getIndex() {
        if (NA <= 100 && NA >= 80) {
            System.out.println("index      =A");
            System.out.println("Keterangan =Sangat baik");
        }
        if (NA <= 80 && NA >= 68) {
            System.out.println("index       =B");
            System.out.println("Keterangan  =baik");
        }

        if (NA <= 68 && NA >= 56) {
            System.out.println("index       =D");
            System.out.println("Keterangan  =cukup");
        }

        if (NA <= 56 && NA >= 45) {
            System.out.println("index       =D");
            System.out.println("Keterangan  =kurang");
        }

        if (NA <= 45 && NA >= 0) {
            System.out.println("index       =E");
            System.out.println("Keterangan  =Sangat kurang");
        }

    }

}
public class PBO1210116541SthevanTugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  nilaiMahasiswa NM = new nilaiMahasiswa();

        NM.setName("Sthevan Reynaldo Simak Lando\n");

        NM.setNim(10116541);
        NM.setValuequiz(90);
        NM.setValueuts(87);
        NM.setValueuas(73);
        NM.getName();
        NM.getNim();
        System.out.println();
        NM.getValuenilai();
        System.out.println();
        NM.getNilaina();
        System.out.println();
        NM.getIndex();
    }
    
}
