// HelloWorldTest.java
// Copyright © 2020 Smallrock Internet Services, Inc. All rights reserved.
//
// This tests the simple class has a method that prints and returns a fixed message. The point
// is not to test the message, the point is that the Maven project was imported correction and
// that a Jupiter JUnit test works.
//

package com.wonderfulwidgets.checkconfig;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void getMessage() {

        HelloWorld helloWorld = new HelloWorld();
        String message = helloWorld.getMessage();

        assertEquals("Hello, World!", message);
    }
}
