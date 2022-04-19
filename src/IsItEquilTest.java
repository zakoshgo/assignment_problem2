import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItEquilTest {

    @Test
    void constrainsTest() {
        int arr[][]={{-200,3,3},{200,-3,-3}};
        IsItEquil IE = new IsItEquil(2);

        assertEquals("ERROR", IE.isEquil(arr));
    }

    @Test
    void NoOfRowsTest() {
        int arr[][]={{2,3,-3},{2,-3,3}};
        IsItEquil IE = new IsItEquil(101);

        assertEquals("ERROR", IE.isEquil(arr));
    }

    @Test
    void NormalTest() {
        int arr[][]={{-2,3,-3},{2,-3,3}};
        IsItEquil IE = new IsItEquil(2);
        assertEquals("YES", IE.isEquil(arr));
    }
    @Test
    void wrongCaseTest() {
        int arr[][]={{2,3,-3},{2,-3,3}};
        IsItEquil IE = new IsItEquil(2);
        assertEquals("NO", IE.isEquil(arr));
    }




}