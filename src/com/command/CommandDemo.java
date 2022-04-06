package com.command;

import java.util.ArrayList;
import java.util.List;

/** Command pattern
 * Encapsulate request as an Object
 * Object-oriented callback
 * Decouple sender from processor
 * Often used for "undo" functionality
 * Examples: java.lang.Runnable, javax.swing.Action
 *
 * Object per command
 * Command Interface
 * Execute Method
 * 'Unexecute' method
 * Reflection
 * Command, Invoker, ConcreteCommand
 */

//client
public class CommandDemo {

    public static void main(String[] args){
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
        
        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);
        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
        lightSwitch.storeAndExecute(allLightsCommand);
    }

}
