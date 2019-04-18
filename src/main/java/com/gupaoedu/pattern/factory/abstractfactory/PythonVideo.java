package com.gupaoedu.pattern.factory.abstractfactory;

public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("Python视频直播");
    }
}
