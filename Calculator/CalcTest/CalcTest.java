import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    Calc calc = new Calc();
    int act;
    int otvet;
    @Test
    public void sqPerimetertest() {
        act = calc.sqPerimeter(5);
        otvet = 20;
        assertEquals(otvet, act);
    }
    @Test
    public void addtest() {
        act = calc.add(5, 2);
        otvet = 7;
        assertEquals(otvet, act);
    }
    @Test
    public void minustest() {
        act = calc.minus(8, 5);
        otvet = 3;
        assertEquals(otvet, act);
    }
    @Test
    public void multitest() {
        act = calc.multi(5, 5);
        otvet = 25;
        assertEquals(otvet, act);
    }
    @Test
    public void dividetest() {
        act = calc.divide(6,3);
        otvet = 2;
        assertEquals(otvet, act);
    }

}
