package com.javafortesters.basicsofjavarevisited.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ClassExample {
  /*  public static final String CONSTANT= "a constant string";
    public static String sClassField = "a class field";
    protected static String proField = "a class field";
    public String pubField = "a public field";
    private String privField = "a public field";
    private String name;

    public ClassExample(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }*/


    @Test
    public void variableNaming(){
        String $aString="bob";
        float £owed=10F;
        int aMount=4;
        long Amount=5;
        String A01234567890bCd$f="ugh";

        assertEquals(4, aMount);
        assertEquals(5, Amount);
        assertEquals(10.0F, £owed);
        assertEquals("bob", $aString);
        assertEquals("ugh", A01234567890bCd$f);
    }

    @Test
    public void booleanType(){
        boolean truthy = true;
        boolean falsey = false;

        assertTrue(true);
        assertFalse(false);

        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;

        assertTrue(truthy);
        assertFalse(falsey);

    }

    @Test
    public void IntegerTypes(){
        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int anIntHas4Bytes;
        long aLongHas8Bytes;

        System.out.println(
                "* 'byte' range:" +
                        Byte.MIN_VALUE + " to " +
                        Byte.MAX_VALUE);
        System.out.println(
                "* 'short' range:" +
                        Short.MIN_VALUE + " to " +
                        Short.MAX_VALUE);
        System.out.println(
                "* 'int' range:" +
                        Integer.MIN_VALUE + " to " +
                        Integer.MAX_VALUE);
        System.out.println(
                "* 'long' range:" +
                        Long.MIN_VALUE + " to " +
                        Long.MIN_VALUE);

        aLongHas8Bytes = 0L; //add suffix L for long
        assertEquals(0, aLongHas8Bytes);

        aByteHas1Byte = 0xA; //add suffix 0x for Hex
        assertEquals(10, aByteHas1Byte);

        anIntHas4Bytes = 010; //add zero prefix for octals
        assertEquals(8, anIntHas4Bytes);

        aByteHas1Byte = 0b0010;  //java 1.7 added 0b for binary
        assertEquals(aByteHas1Byte, 2);

        aLongHas8Bytes = 9_000_000_000L; //9 000 MILLION
        assertEquals(9000000000L, aLongHas8Bytes);
    }

    @Test
    public void traditionalOperatorsExplored(){
        assertEquals(4, 2+2);
        assertEquals(5L, 10L - 5L);
        assertEquals(25.0F, 12.5F * 2, 0);
        assertEquals(30.2D, 120.8D / 4D, 0);
        assertEquals("abcdef", "abc" + "def");
        assertEquals(1, 9%2);
    }

    @Test
    public void assignmentOperatorsExplored(){
        String ab = "ab";
        assertEquals("ab", ab);

        int num = 10;
        assertEquals(10, num);

        num += 2;
        assertEquals("+= increments by", 12, num);

        num -= 4;
        assertEquals("-= decrements by", 8, num);

        num *= 2;
        assertEquals("*= multiplies by", 16, num);

        num /= 8;
        assertEquals("/= divides by", 2, num);

        num %=1;
        assertEquals("%= modulus of", 0, num);
    }

    @Test
    public void incrementDecrementOperatorsExplored(){
        int num = 10;
        assertEquals(11, ++num);
        assertEquals(10, --num);
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);
    }

    @Test
    public void bitwiseShiftOperatorsExplored(){
        int x = 56;

        assertEquals(x*2, x<<1);
        assertEquals(x*4, x<<2);
        assertEquals(x*8, x<<3);

        x <<= 3;
        assertEquals(56*8, x);

        x = Integer.MAX_VALUE;
        assertEquals(Integer.MAX_VALUE/2, x>>1);
        assertEquals(Integer.MAX_VALUE/4, x>>2);
        assertEquals(Integer.MAX_VALUE/8, x>>3);
        x = Integer.MIN_VALUE; // -ve
        assertEquals((Integer.MAX_VALUE/2)+1, x>>>1);
    }

    @Test
    public void stringConcatenated(){
        assertEquals("adina e cool", "adina" + " e" + " cool" );
    }

    @Test
    public void someStringMethods(){
        String aString = "brinda";

        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("BRINDA")==0);
        assertTrue(aString.contains("brin"));
        assertTrue(aString.startsWith("br"));

        //STRING INDEXIND STARTS AT 0
        assertEquals('b', aString.charAt(0));
        assertEquals("da", aString.substring(4));
    }

}

