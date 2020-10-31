/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan20.targetsaldotabungan;

import java.text.NumberFormat;
import java.util.Locale;
        

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
        double saldoTarget;
        int saldoAwal = 3500000;
        
        saldoTarget = 6000000;
        
        i = 1;
        while (saldoAwal < saldoTarget){
            System.out.print("Saldo di bulan ke-" + i + " Rp.");
            i++;
            double bunga = 0.08 * saldoAwal;
            System.out.println(saldoAwal = (int) (saldoAwal + bunga));
        }
    }
    
}
