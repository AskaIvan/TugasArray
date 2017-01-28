
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI CORE I7-PC
 */
public class Praktikum_2 {
    public static void main(String[] args){
        try {
            String[] Prestasi={"Baik", "Kurang Baik"};
            String poin;
            int i, Nilai, banyak;
             // Masukan Data yang Di cari
            
            String jumlah = JOptionPane.showInputDialog("Masukkan jumlah siswa");
            banyak = Integer.parseInt(jumlah);
            for (i = 1; i <= banyak; i++) {
            String nama=JOptionPane.showInputDialog("Masukan nama");
            String bilangan=JOptionPane.showInputDialog("Masukan nilai 1-10");
            Nilai=Integer.parseInt(bilangan);
            if(Nilai <6){
                poin = Prestasi[1];
                JOptionPane.showMessageDialog(null, "Halo "+nama+"\nAnda telah mendapatkan nilai "+Nilai+" dan itu "+Prestasi[1]);
            }
            else if(Nilai > 5 && Nilai < 11 ){
               poin = Prestasi[0];
                JOptionPane.showMessageDialog(null, "Halo "+nama+"\nAnda telah mendapatkan nilai "+Nilai+" dan itu "+Prestasi[0]);
            }
            else if(Nilai > 10){
                JOptionPane.showMessageDialog(null, "Nilai yang anda masukkan melebihi batas");
            }
            else{JOptionPane.showMessageDialog(null, "Error");}
            }
        } catch (NullPointerException e) {
            System.out.println("NPE");
        }
    }
}
