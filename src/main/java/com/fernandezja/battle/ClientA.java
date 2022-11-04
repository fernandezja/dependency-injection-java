package com.fernandezja.battle;

import com.fernandezja.battle.interfaces.IClient;
import com.fernandezja.battle.interfaces.IService;

public class ClientA implements IClient {
     
    IService service;
     
    public ClientA(IService service) {
        this.service = service;
    }

    public void setService(IService service) {
        this.service = service;
    }
 
    @Override
    public String doSomething() {
         
        String info = service.getInfo();
        return info;
         
    }
}
