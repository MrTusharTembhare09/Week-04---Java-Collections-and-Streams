package com.example.mapinterface.votingsystem;

import java.util.*;

// Creating VoteManager to handle voting operations
public class VoteManager {
    private final Map<String, Integer> voteMap; // Storing votes using HashMap
    private final Map<String, Integer> voteOrderMap; // Maintaining insertion order using LinkedHashMap

    // Creating constructor
    public VoteManager() {
        this.voteMap = new HashMap<>();
        this.voteOrderMap = new LinkedHashMap<>();
    }

    // Adding a vote for a candidate
    public void addVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, voteOrderMap.getOrDefault(candidate, 0) + 1);
    }

    // Retrieving the votes in sorted order by candidate names using TreeMap
    public Map<String, Integer> getSortedResults() {
        return new TreeMap<>(voteMap);
    }

    // Retrieving the votes in insertion order using LinkedHashMap
    public Map<String, Integer> getVoteOrder() {
        return new LinkedHashMap<>(voteOrderMap);
    }

    // Retrieving the votes in descending order by vote count
    public Map<String, Integer> getResultsByVoteCount() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(voteMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        Map<String, Integer> sortedByVotes = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedByVotes.put(entry.getKey(), entry.getValue());
        }
        return sortedByVotes;
    }
}
