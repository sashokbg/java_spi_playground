package com.proxym.spi.playground.launcher.spi;

import com.proxym.spi.playground.launcher.model.Transfer;

public interface TransferSPI {

  void sendTransfer(Transfer transfer);
}
