package com.example.fibonacci.service.impl;

import com.example.fibonacci.service.FibonacciService;
import org.springframework.stereotype.Service;

@Service
public class FibonacciServiceImpl implements FibonacciService {
    @Override
    public int calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}
