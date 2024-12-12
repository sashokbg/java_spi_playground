package com.proxym.spi.playground.launcher.spi;

import com.proxym.spi.playground.launcher.model.Transfer;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class OnStartupService {

  TransferSPI transferSPI;

  public OnStartupService(TransferSPI transferSPI) {
    this.transferSPI = transferSPI;
  }

  @EventListener(ApplicationStartedEvent.class)
  public void onStartup() {
     this.transferSPI.sendTransfer(new Transfer());
  }
}
