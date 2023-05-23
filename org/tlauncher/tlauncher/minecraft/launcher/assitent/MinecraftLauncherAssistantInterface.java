package org.tlauncher.tlauncher.minecraft.launcher.assitent;

import org.tlauncher.tlauncher.minecraft.launcher.MinecraftException;
import org.tlauncher.tlauncher.minecraft.launcher.MinecraftLauncher;

public interface MinecraftLauncherAssistantInterface {
  void collectInfo(MinecraftLauncher paramMinecraftLauncher) throws MinecraftException;
  
  void collectResources(MinecraftLauncher paramMinecraftLauncher) throws MinecraftException;
  
  void constructJavaArguments(MinecraftLauncher paramMinecraftLauncher) throws MinecraftException;
  
  void constructProgramArguments(MinecraftLauncher paramMinecraftLauncher) throws MinecraftException;
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/launcher/assitent/MinecraftLauncherAssistantInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */