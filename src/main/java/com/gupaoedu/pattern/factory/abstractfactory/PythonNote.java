package com.gupaoedu.pattern.factory.abstractfactory;

public class PythonNote implements INote{

    @Override
    public void edit() {
        System.out.println("Python笔记编辑");
    }
}
