package com.vidwel.university.controller;

import com.vidwel.university.dto.request.reqUniversityDTO;
import com.vidwel.university.entity.University;
import com.vidwel.university.repository.UniversityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RestController
public class WebController {
    private UniversityRepository repository;

    public WebController(UniversityRepository repository) {
        this.repository = repository;
    }

    private Set<reqUniversityDTO> getTestDTO() {
        //Create Test JSON of Universities
        Set<reqUniversityDTO> universities = new HashSet<>();
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
        return universities;
    }

    private University getTestUniversity() {
        University university = new University();
        university.setName("Univerdef");
        university.setDescription("Desc");
        university.setAddress("Berlin");
        university.setPhone("3333333");
        university.setEmail("blblbla@de.de");
        return university;
    }

    @RequestMapping(path = "/getuniversity", method = RequestMethod.POST)
    public void getUniversities(@RequestBody HashSet<reqUniversityDTO> universities) {
        for (reqUniversityDTO university : universities)
            System.out.println(university);
    }

    @GetMapping(path = "/form1")
    public void getForm(@RequestParam Map<String, String> allRequestParams) {
        System.out.println(allRequestParams);
    }

    @PostMapping(path = "/form")
    public void getForm(@RequestParam(name = "name1", defaultValue = "DONE") String requestParam) {
        System.out.println(requestParam);
    }

    @GetMapping(path = "/add")
    public void addUniversity() {
        System.out.println("ADD");

        repository.save(getTestUniversity());
    }

    @RequestMapping(path = "/viewall", method = RequestMethod.POST)
    @ResponseBody
    public Set getAllUniversity() {
        return getTestDTO();
    }
}



