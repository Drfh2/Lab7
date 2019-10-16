package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RPSLSpockTest {

    @Test
    public void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick("ROCK"));
        Assert.assertTrue(RPSLSpock.isValidPick("PAPER"));
        Assert.assertTrue(RPSLSpock.isValidPick("SCISSORS"));
        Assert.assertTrue(RPSLSpock.isValidPick("LIZARD"));
        Assert.assertTrue(RPSLSpock.isValidPick("SPOCK"));
    }

    @Test
    public void generatePick() {
        for(int i = 0; i < 1000000; i++){
            Assert.assertNotNull(RPSLSpock.generatePick());
        }
    }

    @Test
    public void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "scissors"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "scissors"));
        
        Assert.assertFalse(RPSLSpock.isComputerWin("scissors", "rock"));

    }
}