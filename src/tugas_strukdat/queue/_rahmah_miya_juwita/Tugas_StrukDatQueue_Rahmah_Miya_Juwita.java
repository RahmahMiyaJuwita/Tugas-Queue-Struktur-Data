/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_strukdat.queue._rahmah_miya_juwita;

/**
 *
 * @author Rahmah Miya Juwita
 */
public class Tugas_StrukDatQueue_Rahmah_Miya_Juwita {
    static int tail;
    static int antrian;
    static String kendaraan[];

    static void Queue (int pjgAntrian){
        tail=0;
        antrian = pjgAntrian;
        kendaraan = new String[antrian];
    }
    
    public static void main(String[] args) {
        Tugas_StrukDatQueue_Rahmah_Miya_Juwita a = new Tugas_StrukDatQueue_Rahmah_Miya_Juwita();
        a.Queue(4);
        a.add("Honda");
        a.add("Yamaha");
        a.add("Suzuki");
        a.add("Kawasaki");
        a.add("Vespa");
        System.out.println("");
        a.print();
        a.remove();
        a.print();
        a.remove();
        a.print();
        a.remove();
        a.print();
        a.remove();
        a.print();
        a.remove();
        a.print();
        
    }

    static void add (String input) {
         
            if(tail >= antrian){
                System.out.println("Antrian Pengisian BBM Sudah Melebihi Kapasitas SPBU");
            } else {
                kendaraan[tail++] = input;
                System.out.println("Kendaraan Merek "+input+" Mengisi BBM Di SPBU Rimbo Panjang");
                System.out.println("");
            }
    }

      static void remove()
    {
        if(tail <=0){
           System.out.println("Antrian Pengisian BBM Sudah Berakhir");
            
        }else
        {
            String pop=kendaraan [0];
            int i=1;
            System.out.println("Kendaraan Dengan Merek : "+pop+", Telah Selesai Melakukan Pengisian BBM");
            System.out.println("");
            while(i<tail)
            {
                kendaraan[i-1]=kendaraan[i];
                i++;
            }
            tail--;
            kendaraan[tail]="";
        }
    }
    static void print (){
        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][]");
        System.out.println("Antrian Pengisian BBM");
        for (int i =0; i<tail; i++){
            System.out.println((i+1)+")"+kendaraan[i]);
        }
        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][]");
        System.out.println("");
    }
}
