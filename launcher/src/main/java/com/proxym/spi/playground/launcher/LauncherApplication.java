package com.proxym.spi.playground.launcher;

import com.proxym.spi.playground.launcher.model.DefaultTransferSPI;
import com.proxym.spi.playground.launcher.spi.TransferSPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class LauncherApplication {

  public static void main(String[] args) {
    SpringApplication.run(LauncherApplication.class, args);
  }


  @ConditionalOnMissingBean
  @Bean
  public TransferSPI spi() {
    return new DefaultTransferSPI();
  }

}
