package com.proxym.spi.playground.plugin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.proxym.spi.playground.plugin")
public class PluginConfig {

  public PluginConfig() {
    System.out.println("PluginConfig Loaded");
  }
}
