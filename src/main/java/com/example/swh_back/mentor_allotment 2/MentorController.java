//package com.spring.implementation.controller;
package com.example.swh_back.mentor_allotment;

import com.spring.implementation.MentorService;
import com.spring.implementation.model.MentorReg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/mentors")
public class MentorController {
    @Autowired
    private MentorService mentorService;

    @GetMapping("/getAllMentors")
    public List<MentorReg> getAllMentors() {
        return mentorService.getAllMentors();
    }

    @PutMapping("/{name}")
    public MentorReg allotMentor(@PathVariable String name, @RequestBody MentorReg mentor) {
        return mentorService.updateMentor(name, mentor.getCollege(), mentor.getIsAllotted());
    }
}

