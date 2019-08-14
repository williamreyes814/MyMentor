package com.MyMentor.Repositories;

import com.MyMentor.Model.MentorOrganization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository extends CrudRepository<MentorOrganization, Integer> {



}

