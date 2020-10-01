package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        
        Person person = new Person("Blas", LocalDate.of(1949,9,24));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
