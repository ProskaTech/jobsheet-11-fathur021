package latihan2_inheritance;
/**
 * Created by 21343046_fathur rahman
 */
public class person {
    protected String name;
    protected int age;
    
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void info(){
        System.out.println("Nama : " + this.name);
        System.out.println("Usia : " + this.age);
    }
}
