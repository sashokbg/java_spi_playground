package com.proxym.spi.playground.plugin;

import com.proxym.spi.playground.launcher.model.Transfer;
import com.proxym.spi.playground.launcher.spi.TransferSPI;
import org.springframework.stereotype.Component;

@Component
public class PluginTransferSPI implements TransferSPI {
  public PluginTransferSPI() {
    System.out.println("PluginTransferSPI V2");
  }

  @Override
  public void sendTransfer(Transfer transfer) {
    System.out.println("PluginTransferSPI.sendTransfer");
  }
}
