/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.senol.esx.module;

import java.util.Timer;
import jdk.nashorn.api.scripting.ScriptObjectMirror;

/**
 *
 * @author stas
 */
@FunctionalInterface
public interface TimeoutFunctions {
    public Timer setTimeout(ScriptObjectMirror function);    
}