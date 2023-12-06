package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.service.PrimeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@AllArgsConstructor
public class PrimeController {
    private final PrimeService primeService;
    @GetMapping("/new-prime")
    public BigInteger getNewPrime(){
        return primeService.generatePrime();
    }
}
