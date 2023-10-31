package com.wilda.wkplminggu11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {

    private Calculator calkulator = new Calculator();

    @Test
    public  void  testAddSuccess(){
         int result = calkulator.add(10, 10);
         assertEquals (20, result);

    }

}
