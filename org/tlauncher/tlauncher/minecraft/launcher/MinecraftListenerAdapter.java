package org.tlauncher.tlauncher.minecraft.launcher;

import org.tlauncher.tlauncher.minecraft.crash.Crash;

public class MinecraftListenerAdapter implements MinecraftListener {
  public void onMinecraftPrepare() {}
  
  public void onMinecraftAbort() {}
  
  public void onMinecraftLaunch() {}
  
  public void onMinecraftClose() {}
  
  public void onMinecraftError(Throwable e) {}
  
  public void onMinecraftKnownError(MinecraftException e) {}
  
  public void onMinecraftCrash(Crash crash) {}
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/launcher/MinecraftListenerAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */