package com.proxym.spi.playground.launcher.model;

import com.proxym.spi.playground.launcher.spi.TransferSPI;

public class DefaultTransferSPI implements TransferSPI {

  public DefaultTransferSPI() {
    System.out.println("DefaultTransferSPI");
  }

  @Override
  public void sendTransfer(Transfer transfer) {
    System.out.println("DefaultTransferSPI.sendTransfer");
  }
}
