package com.victor.devTest.Controller;

import com.victor.devTest.Model.Option;
import com.victor.devTest.Model.Poll;
import com.victor.devTest.Model.Vote;
import com.victor.devTest.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/Poll")
public class PollController {

    @Autowired
    private PollService pollService;


    @GetMapping
    public List<Poll> getAllPolls(){
        return pollService.getPolls();
    }

    @PostMapping("/api/v1/polls")
    public ResponseEntity<Poll> createPoll(@RequestBody Map<String, Object> body){
        String name = (String) body.get("name");
        Option[] options = (Option[]) body.get("options");
        Poll createdPoll = pollService.createPoll(name, options);
        return ResponseEntity.status(201).body(createdPoll);


    }

    @PostMapping("api/v1/polls/{:id}/votes")
    public ResponseEntity<Vote> voteForPoll(@PathVariable int pollId, Map<String, Object> body){
        Vote vote = pollService.vote(pollId,(int)body.get("optionId"), (String)body.get("voterEmail"));
        return ResponseEntity.ok(vote);
    }
}
