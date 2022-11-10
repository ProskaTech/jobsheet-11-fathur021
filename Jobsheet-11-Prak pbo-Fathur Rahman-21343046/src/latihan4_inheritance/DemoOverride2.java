package latihan4_inheritance;

/*
 * Created by 21343046_fathur rahman
 */
public class DemoOverride2 {
    public static void main(String args[]){
        b obj = new b();
        obj.setA(50);
        obj.setB(150);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
}
