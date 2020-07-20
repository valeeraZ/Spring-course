package com.example.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class MyScope implements Scope {
    //double creation at most
    private Map<String, Object> map1 = new ConcurrentHashMap<String, Object>();
    private Map<String, Object> map2 = new ConcurrentHashMap<String, Object>();

    public Object get(String s, ObjectFactory<?> objectFactory) {
        if (!map1.containsKey(s)){
            Object o = objectFactory.getObject();
            map1.put(s,o);
            return o;
        }
        if(!map2.containsKey(s)){
            Object o = objectFactory.getObject();
            map2.put(s,o);
            return o;
        }
        int i = new Random().nextInt(2);
        if(i == 0){
            return map1.get(s);
        }else {
            return map2.get(s);
        }
    }

    public Object remove(String s) {
        if(map1.containsKey(s)){
            Object o = map1.get(s);
            map1.remove(s);
            return o;
        }
        if(map2.containsKey(s)){
            Object o = map2.get(s);
            map2.remove(s);
            return o;
        }
        return null;
    }

    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    public Object resolveContextualObject(String s) {
        return null;
    }

    public String getConversationId() {
        return null;
    }
}
