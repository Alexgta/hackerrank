package com.Test;

import java.io.File;

class FileResource {
    File a;
    File b;
    File c;
    void workWithFileA()
    {
        synchronized(a) {
            // code that works with file A
        }
    }
    void workWithFileB()
    {
        synchronized(b) {
            // code that works with file B
        }
    }
    void workWithFileC()
    {
        synchronized(c) {
            // code that works with file C
        }
    }
}


public class Test7 implements Runnable {

    FileResource resource;
    public Test7 (FileResource resource_)   {
        resource = resource_;
    }

    @Override
    public void run()
    {
        synchronized (resource.a) {
            resource.workWithFileA();
        }
        synchronized (resource.b) {
            resource.workWithFileB();
        }
        synchronized (resource.c) {
            resource.workWithFileC();
        }
    }


}
