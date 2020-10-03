package com.practice.rest.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

//    @GetMapping("/v1/person")
//    @GetMapping(value = "/person", params = "version=1")
//    @GetMapping(value = "/person", headers = "X-API-VERSION=1")
    @GetMapping(value = "/person", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getPersonV1() {
        return new PersonV1("Archie Isdiningrat");
    }

//    @GetMapping("/v2/person")
//    @GetMapping(value = "/person", params = "version=2")
    @GetMapping(value = "/person", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getPersonV2() {
            return new PersonV2(new Name("Archie", "Isdiningrat"));
    }
}
