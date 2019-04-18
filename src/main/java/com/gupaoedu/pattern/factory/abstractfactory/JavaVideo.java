package com.gupaoedu.pattern.factory.abstractfactory;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("Java视频直播");
    }
}
