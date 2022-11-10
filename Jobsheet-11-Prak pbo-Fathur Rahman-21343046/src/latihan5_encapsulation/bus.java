package latihan5_encapsulation;

/**
 *
 * Created by 21343046_fathur rahman
 */
public class bus {
    public int penumpang;
    public int maxPenumpang;
    
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}
