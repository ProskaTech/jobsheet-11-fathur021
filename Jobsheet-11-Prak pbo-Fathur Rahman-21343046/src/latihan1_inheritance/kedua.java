
package latihan1_inheritance;

/**
 *
 * Created by 21343046_fathur rahman
 */
public class kedua extends pertama {
    private int b = 8;
    
    protected void BacaSuper(){
        System.out.println("Nilai b = " + b);
        terprotek();
        info();
    }
}
