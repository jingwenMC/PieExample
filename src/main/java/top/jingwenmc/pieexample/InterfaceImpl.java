package top.jingwenmc.pieexample;

import top.jingwenmc.spigotpie.common.instance.PieComponent;

@PieComponent
public class InterfaceImpl implements InterfaceExample{
    @Override
    public String getMessage() {
        return "It works!";
    }
}
