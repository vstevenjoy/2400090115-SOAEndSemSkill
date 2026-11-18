package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController
public class AdditionController {
	@GetMapping(value = "/ms1/add", produces = "text/plain;charset=UTF-8")
    public String add(@RequestParam int a,
                      @RequestParam int b) {
        return "MS 1.1 - Addition = " + (a + b);
    }
}