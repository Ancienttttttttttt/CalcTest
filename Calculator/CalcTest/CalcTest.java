import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest extends Calc{
    @Test
    public void sqPerimetertest() {
        int a = sqPerimeter(5);
        if (a == 20) {
            System.out.println("Ok");
        } else {
            System.out.println("Error");
        }
    }
    @Test
    public void addtest() {
        int a = add(5, 2);
        if (a == 7) {
            System.out.println("Ok");
        } else {
            System.out.println("Error");
        }
    }
    @Test
    public void minustest() {
        int a = minus(8, 5);
        if (a == 3) {
            System.out.println("Ok");
        } else {
            System.out.println("Error");
        }
    }
    @Test
    public void multitest() {
        int a = multi(5, 5);
        if (a == 25) {
            System.out.println("Ok");
        } else {
            System.out.println("Error");
        }
    }
    @Test
    public void dividetest() {
        int a = divide(6,3);
        if (a == 2) {
            System.out.println("Ok");
        } else {
            System.out.println("Error");
        }
    }

}