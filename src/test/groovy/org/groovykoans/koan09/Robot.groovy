/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

import org.codehaus.groovy.runtime.InvokerHelper

class Robot {
    // ------------ START EDITING HERE ----------------------
    int x;
    int y;
    void left(){
        x--
    }
    void right(){
        x++
    }
    void up(){
        y++
    }
    void down(){
        y--
    }

    def invokeMethod(String name,Object args){
        if (name.startsWith('go')){
            def directions = name.findAll(/Right|Left|Up|Down/).collect{ it.toLowerCase()}
            directions.each {
                println it
                this."$it"();
            }
        }
        return name;
    }

    // ------------ STOP EDITING HERE  ----------------------
}
