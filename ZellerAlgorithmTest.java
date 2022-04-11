package Assignment1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZellerAlgorithmTest {

    @Test
    void dayNameTest() {
        assertEquals("Monday",ZellerAlgorithm.findDayName(2));
        assertEquals("Tuesday",ZellerAlgorithm.findDayName(3));
    }
    @ParameterizedTest
    @CsvSource({
            "12,11,2000,Sunday",
            "3,3,2005,Thursday"
    })
    void findDayTest(int day,int month,int year,String expectedDay){
            assertEquals(expectedDay,ZellerAlgorithm.findDay(day,month,year));
    }
    @Test
    void monthValueTest(){
        assertEquals(13,ZellerAlgorithm.shiftedMonthValue(1));
        assertEquals(3,ZellerAlgorithm.shiftedMonthValue(3));
        assertEquals(4,ZellerAlgorithm.shiftedMonthValue(4));
    }
    @Test
    void yearValueTest(){
        assertEquals(1999,ZellerAlgorithm.yearValue(2000,1));
        assertEquals(2000,ZellerAlgorithm.yearValue(2000,12));
    }
}