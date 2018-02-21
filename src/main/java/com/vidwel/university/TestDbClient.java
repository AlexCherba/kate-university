package com.vidwel.university;

import com.vidwel.university.dto.request.reqUniversityDTO;
import com.vidwel.university.entity.University;
import com.vidwel.university.repository.UniversityRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class TestDbClient {
    private static UniversityRepository repository;

    public static void main(String[] args) {
//
//        University university = repository.getByName("")

        int i = 0;
        University university = new University();
        university.setName("Univer" + i);
        university.setDescription("Desc" + i);
        university.setAddress("Berlin" + i);
        university.setPhone("3333333" + i);
        university.setEmail("blblbla@de." + i);

        repository.save(university);
    }
}
