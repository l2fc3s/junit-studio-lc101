package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void bracketsWithTextInMiddle(){
       assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsInMiddleOfWord(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsOutsideOfWord(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyStringTest(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void emptyBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //Should Pass: "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
    // Should not pass "[LaunchCode", "Launch]Code[", "[", "]["

    @Test
    public void onlyOpenBracketWithText(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test public void unbalancedWithText(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test public void onlyOpenBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test public void closedBracketBeforeOpenBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyClosedBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void nestedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

}
