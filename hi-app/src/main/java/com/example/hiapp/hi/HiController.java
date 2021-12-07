package com.example.hiapp.hi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    private static final Logger log = LoggerFactory.getLogger(HiController.class);

    @GetMapping("/hi")
    public String hi() {
        log.info("### hi");
        return "hi~";
    }
}
