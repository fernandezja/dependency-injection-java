package com.fernandezja.battle;

import com.fernandezja.battle.interfaces.IService;

public class ServiceB implements IService {
 
    @Override
    public String getInfo() {
        return "Hello Service BBB";
    }
}
