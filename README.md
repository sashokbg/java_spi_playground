# Java SPI Playground

This repository illustrates a very simple "product & plugins" system where a main launcher application loads dependancy jars on runtime.

## How to Use

- Build the launcher first with "make build"
- Run the launcher to see that its default implementations are loaded with "make dev"
  
- Build the plugin (this will copy its jar to the launcher/plugins directory
- Run the launcher again to see that its default implementations are now overridden by the plugin
