import org.junit.jupiter.api.Test;

public class JUnit_Test_1 {

    @Test
    void suma() {
        Calculator calc = new Calculator();
        calc.sum(5.0,5);
        calc.sum(-1.2,-4.5);
    }

    @Test
    void res() {
        Calculator calc = new Calculator();
        calc.res(-1.2,-1.2);
        calc.res(11,3.0);
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        calc.div(-12,0);
        calc.div(5,10);
    }

    @Test
    void mult() {
        Calculator calc = new Calculator();
        calc.mult(5,5);
        calc.mult(0,651551);
    }

}
