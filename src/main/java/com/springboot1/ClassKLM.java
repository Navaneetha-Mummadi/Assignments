package com.springboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassKLM {

    @Autowired
    @Qualifier("classABC")  // Change to "classXYZ" to use ClassXYZ
    private InterfacePQR pqr;

    public void run() {
        pqr.display();
    }
}
