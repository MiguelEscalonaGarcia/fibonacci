package com.example.fibonacci.controller;

import com.example.fibonacci.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

    @Autowired
    FibonacciService fibonacciService;

    @GetMapping("/fibonacci/{n}")
    public int getFibonacci(@PathVariable int n) {
        return fibonacciService.calculateFibonacci(n);
    }
}
