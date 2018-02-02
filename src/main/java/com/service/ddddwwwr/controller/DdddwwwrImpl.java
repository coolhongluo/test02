package com.service.ddddwwwr.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-02-02T02:26:58.570Z")

@RestSchema(schemaId = "ddddwwwr")
@RequestMapping(path = "/ddddwwwr", produces = MediaType.APPLICATION_JSON)
public class DdddwwwrImpl {

    @Autowired
    private DdddwwwrDelegate userDdddwwwrDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDdddwwwrDelegate.helloworld(name);
    }

}
