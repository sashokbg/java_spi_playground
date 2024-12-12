PHONY: dev

dev:
	mvn clean install -DskipTests
	java -Dloader.path=plugins -Dloader.main=com.proxym.spi.playground.launcher.LauncherApplication -jar target/launcher-0.0.2-SNAPSHOT-exec.jar
