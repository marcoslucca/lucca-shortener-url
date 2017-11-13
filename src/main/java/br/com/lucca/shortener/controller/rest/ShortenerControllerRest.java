package br.com.lucca.shortener.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marcos.lucca on 13/11/2017.
 */
@RestController
@RequestMapping(value = "/api/shortener", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShortenerControllerRest {
    final static Logger LOGGER = LoggerFactory.getLogger(ShortenerControllerRest.class);

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Object> get() {


        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
