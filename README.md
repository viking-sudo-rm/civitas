## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Using BuildTools

BuildTools.jar can be used to obtain the Bukkit API JAR. In a different directory (I put it on my desktop), download and run BuildTools, following [this](https://www.spigotmc.org/wiki/buildtools/#latest). Then run the following command:
```java
java -jar BuildTools.jar --rev latest
```

After running this, a bunch of files will get created. You will need to use two of them:

1. spigot-1.18.1.jar: This is the server JAR file for Spigot 1.18. You can treat it like a normal Minecraft server JAR (i.e., use it to create a test server).
2. Spigot/Spigot-API/target/spigot-api-1.18.1-R0.1-SNAPSHOT.jar: This is the Spigot API JAR. You need to link this as an external JAR in your IDE so that your plugin can use the Spigot API. Exactly how you do this will depend on the IDE, but there should be some standard way to do it.

After linking the Spigot-API from step 2, you can build the source in this repository as a JAR file, and then use it as a Spigot plugin. Specifically, you can test it on the Spigot server from step 1.

## Hello World Plugin Example

See [here](https://github.com/team-code/Spigot-Plugin-Template/blob/master/HelloWorld.md)