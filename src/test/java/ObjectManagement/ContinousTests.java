package ObjectManagement;

import GrapicalEngine.Draw;
import ObjectManagement.Attributes.ComplexPosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinousTests {

    @Test
    public void equalizationTest () {
        ComplexPosition complexPosition0 = new ComplexPosition();
        List<Integer> integerList0 = new ArrayList<>(Arrays.asList(2,1,4,5));
        complexPosition0.setUsableProperties(integerList0);
        complexPosition0.setX(2F);

        ComplexPosition complexPosition1 = new ComplexPosition();
        List<Integer> integerList1 = new ArrayList<>(Arrays.asList(2,1,4,5));
        complexPosition1.setUsableProperties(integerList1);
        complexPosition1.setX(2F);

        Assertions.assertEquals(complexPosition0, complexPosition1);
    }

    @Test
    public void blockDrawOnScreenTest () {
        Draw drawer = new Draw ("Test application name");
    }
}
