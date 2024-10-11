//package com.spring.implementation.repository;
package com.example.swh_back.mentor_allotment;

import com.spring.implementation.model.MentorReg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MentorRegRepo extends JpaRepository<MentorReg, Integer> {

    MentorReg findByEmail(String email);

    Optional<MentorReg> findByFirstName(String name);
}
