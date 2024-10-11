//package com.spring.implementation;
package com.example.swh_back.mentor_allotment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorService {
    @Autowired
    private MentorRegRepo mentorRepository;

    public List<MentorReg> getAllMentors() {
        return mentorRepository.findAll();
    }

    public MentorReg updateMentor(String name, String college, Boolean isAllotted) {
        MentorReg mentor = mentorRepository.findByEmail(name);
        mentor.setCollege(college);
        mentor.setIsAllotted(true);
        return mentorRepository.save(mentor);
    }
}
