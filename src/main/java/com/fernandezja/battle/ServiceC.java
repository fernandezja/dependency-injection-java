package com.fernandezja.battle;

import com.fernandezja.battle.interfaces.IService;

public class ServiceC implements IService {
 
    @Override
    public String getInfo() {
        return "Hello Service CCC";
    }
}
