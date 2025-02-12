package com.example.mapinterface.votingsystem;

// Creating VotingSystemTest to test VoteManager functionality
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

public class VotingSystemTest {
    @Test
    public void testVotingSystem() {
        VoteManager voteManager = new VoteManager();

        // Adding votes
        voteManager.addVote("Alice");
        voteManager.addVote("Bob");
        voteManager.addVote("Alice");

        // Checking vote count
        Map<String, Integer> expectedResults = Map.of("Alice", 2, "Bob", 1);
        assertEquals(expectedResults, voteManager.getVoteOrder());

        // Checking sorted order
        Map<String, Integer> sortedResults = voteManager.getSortedResults();
        assertTrue(sortedResults.containsKey("Alice"));
        assertTrue(sortedResults.containsKey("Bob"));

        // Checking descending vote count order
        Map<String, Integer> sortedByVotes = voteManager.getResultsByVoteCount();
        assertEquals(2, sortedByVotes.get("Alice"));
        assertEquals(1, sortedByVotes.get("Bob"));
    }
}

