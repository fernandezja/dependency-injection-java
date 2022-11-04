package com.fernandezja.battle;

import com.fernandezja.battle.interfaces.IService;

public class ServiceD implements IService {
 
    @Override
    public String getInfo() {
        return "Hello Service DDD";
    }
}
