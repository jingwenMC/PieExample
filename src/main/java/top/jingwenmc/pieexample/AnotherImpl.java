package top.jingwenmc.pieexample;

import top.jingwenmc.spigotpie.common.instance.PieComponent;

@PieComponent
public class AnotherImpl implements InterfaceExample{
    @Override
    public String getMessage() {
        return "Oh no!";
    }
}
