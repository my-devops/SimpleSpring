package com.demo;

public interface DemoManager {
    public String getServiceName();
}
 class DemoManagerImpl implements DemoManager 
{
    @Override
    public String getServiceName()
    {
        return "My first service with Spring 3";
    }
}