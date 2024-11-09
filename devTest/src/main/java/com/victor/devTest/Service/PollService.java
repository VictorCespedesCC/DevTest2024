package com.victor.devTest.Service;

import com.victor.devTest.Model.Option;
import com.victor.devTest.Model.Poll;
import com.victor.devTest.Model.Vote;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PollService {
    private List<Poll> polls = new ArrayList<>();
    private List<Vote> votes = new ArrayList<>();

    public List<Poll> getPolls() {
        return polls;
    }

    public Poll createPoll(String name, List<Option> options){
        int newPollId = polls.size() + 1;
        for (int i = 0; i < options.size(); i++) {
            options.get(i).setId(i + 1);
        }
        Poll newPoll = new Poll(newPollId,name,options);
        polls.add(newPoll);
        return newPoll;
    }

    public Vote vote(int pollId , int optionId, String voterEmail){
        int newVotesId = votes.size() + 1;
        Vote newVote = new Vote(newVotesId, pollId, optionId, voterEmail);
        votes.add(newVote);
        return newVote;
    }
}
