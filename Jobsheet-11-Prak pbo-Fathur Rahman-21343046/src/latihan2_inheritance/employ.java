package latihan2_inheritance;

/**
 * Created by 21343046_fathur rahman
 */
public class employ extends person {
    private String noKaryawan;
    
    public employ (String noKaryawan, String name, int age){
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    
    public void info(){
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
}
