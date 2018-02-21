package com.vidwel.university.repository;

import com.vidwel.university.entity.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UniversityRepository extends CrudRepository<University, UUID> {

    //University getByNameAndAddress(UUID id);

    University getByName(UUID id);

    University getByAddress(UUID id);

    University getByEmail(UUID id);


}
