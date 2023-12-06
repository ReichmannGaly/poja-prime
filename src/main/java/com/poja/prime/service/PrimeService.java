package com.poja.prime.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Random;

@Service
public class PrimeService {
    public BigInteger generatePrime(){
        return BigInteger.probablePrime(1000, new Random());
    }
}
