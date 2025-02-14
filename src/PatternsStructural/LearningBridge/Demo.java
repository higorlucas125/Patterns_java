package PatternsStructural.LearningBridge;

import PatternsStructural.LearningBridge.devices.Device;
import PatternsStructural.LearningBridge.devices.Raio;
import PatternsStructural.LearningBridge.devices.Tv;
import PatternsStructural.LearningBridge.remotes.AdvancedRemote;
import PatternsStructural.LearningBridge.remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Raio());
    }

    public static void testDevice(Device device){
        System.out.println("Test With basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Test with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
