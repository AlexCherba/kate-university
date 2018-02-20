package com.vidwel.university.controller;

import com.vidwel.university.dto.request.reqUniversityDTO;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

//@Getter
@RestController
public class WebController {
    private Set<reqUniversityDTO> universities;

    {
        universities = new HashSet<>();
        reqUniversityDTO university;
        for (int i = 0; i < 5; i++) {
            university = new reqUniversityDTO();
            university.setName("Univer" + i);
            university.setDescription("Desc" + i);
            university.setAddress("Berlin" + i);
            university.setPhone("3333333" + i);
            university.setEmail("blblbla@de." + i);
            universities.add(university);
        }
    }

    @RequestMapping(path = "/getuniversity", method = RequestMethod.POST)
    public void getUniversities(@RequestBody HashSet<reqUniversityDTO> universities) {
        System.out.println("I get json!");

        for (reqUniversityDTO university:universities)
        System.out.println(university);
    }

    /*
    Response JSON Array from Set<University>:
    [
        {
            "name": "Univer4",
            "description": "Desc4",
            "phone": "33333334",
            "email": "blblbla@de.4",
            "address": "Berlin4"
        },
        {
            "name": "Univer1",
            "description": "Desc1",
            "phone": "33333331",
            "email": "blblbla@de.1",
            "address": "Berlin1"
        },
        {
            "name": "Univer2",
            "description": "Desc2",
            "phone": "33333332",
            "email": "blblbla@de.2",
            "address": "Berlin2"
        },
        {
            "name": "Univer0",
            "description": "Desc0",
            "phone": "33333330",
            "email": "blblbla@de.0",
            "address": "Berlin0"
        },
        {
            "name": null,
            "description": null,
            "phone": null,
            "email": null,
            "address": null
        },
        {
            "name": "Univer3",
            "description": "Desc3",
            "phone": "33333333",
            "email": "blblbla@de.3",
            "address": "Berlin3"
        }
    ]
    */
    @RequestMapping(path = "/viewall", method = RequestMethod.POST)
    @ResponseBody
    public Set getAllUniversity() {
        return universities;
    }
}



