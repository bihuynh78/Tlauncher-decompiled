package org.tlauncher.tlauncher.minecraft.launcher;

import org.tlauncher.tlauncher.minecraft.crash.Crash;

public interface MinecraftListener {
  void onMinecraftPrepare();
  
  void onMinecraftAbort();
  
  void onMinecraftLaunch();
  
  void onMinecraftClose();
  
  void onMinecraftError(Throwable paramThrowable);
  
  void onMinecraftKnownError(MinecraftException paramMinecraftException);
  
  void onMinecraftCrash(Crash paramCrash);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/launcher/MinecraftListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */