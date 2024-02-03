package top.jingwenmc.pieexample;

import top.jingwenmc.spigotpie.common.configuration.BaseConfiguration;
import top.jingwenmc.spigotpie.common.configuration.Configuration;
import top.jingwenmc.spigotpie.common.configuration.ConfigurationFile;
import top.jingwenmc.spigotpie.common.instance.PieComponent;

import java.util.*;

@PieComponent
@ConfigurationFile("config.yml")
public class ConfigTest extends BaseConfiguration {
    @Configuration(value = "main")
    public String MAIN_CONFIG = "HelloWorld!";

    @Configuration(value = "list")
    public List<String> LIST_CONFIG = new ArrayList<>(Arrays.asList("a","b","c"));
}
