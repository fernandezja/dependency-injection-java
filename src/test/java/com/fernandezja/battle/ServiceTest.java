package com.fernandezja.battle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.fernandezja.battle.interfaces.IClient;
import com.fernandezja.battle.interfaces.IService;


public class ServiceTest 
{
    @Test
    public void simple_di_by_constructor()
    {
        IService service = new ServiceB();

        IClient client = new ClientA(service);
              
        assertEquals("Hello Service BBB", client.doSomething());
    }

    @Test
    public void another_simple_di_by_constructor()
    {
        IService service = new ServiceC();

        IClient client = new ClientA(service);
              
        assertEquals("Hello Service CCC", client.doSomething());
    }


    @Test
    public void simple_di_by_constructor_and_set()
    {
        IService service = new ServiceB();

        IClient client = new ClientA(service);
              
        assertEquals("Hello Service BBB", client.doSomething());

        client.setService(new ServiceC());

        assertEquals("Hello Service CCC", client.doSomething());

        client.setService(new ServiceD());

        assertEquals("Hello Service DDD", client.doSomething());
    }

}
