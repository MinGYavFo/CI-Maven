/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.minhchan.mathuntil.core;

import com.minhchan.mathutil.core.MathUtil;
import static com.minhchan.mathutil.core.MathUtil.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilTest {
    
    @Test
    public void testGetFGivenRightWell() {
        assertEquals(120, getFactorial(5));
    }
    
    @Test
     public void testGetFGivenRightWellThrowArgumentExp() {
//         Executable expO = new Executable() {
//             @Override
//             public void execute() throws Throwable {
//                 getFactorial(-5);
//             }
//         };
         Executable expO = () -> {getFactorial(-5);};
        assertThrows(IllegalArgumentException.class, expO);
    }   
    
     
     public static Object[][] initData() {
        return new Integer[][] {
            {0, 1}, 
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720},
        };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialGivenRightArgumentReturnsWell(int input, long exp){
        assertEquals(exp, getFactorial(input));
    }
     
     
}



