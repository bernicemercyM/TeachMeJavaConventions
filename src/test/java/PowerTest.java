
import org.junit.jupiter.api.Test;

public class PowerTest {
    @Test
    void OneRaisedToOne() {
        PowerOf powerOf = new PowerOf(1, 1);
        int power = PowerOf.power();
        assert power == 1 ;
    }

    @Test
    void TwoRaisedToTwo()
    {
        PowerOf powerOf = new PowerOf(2,2);
        int power = PowerOf.power();
        assert power == 4;
    }

    @Test
    void TwoRaisedToOne() {
        PowerOf powerOf = new PowerOf(2, 1);
        int power = PowerOf.power();
        assert power == 2;
    }

    @Test
    void ThreeRaisedToThree() {
        PowerOf powerOf = new PowerOf(3, 3);
        int power = PowerOf.power();
        assert power == 27;
    }
}
