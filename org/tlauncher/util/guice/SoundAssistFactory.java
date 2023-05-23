package org.tlauncher.util.guice;

import org.tlauncher.tlauncher.minecraft.launcher.MinecraftLauncher;
import org.tlauncher.tlauncher.minecraft.launcher.assitent.SoundAssist;

public interface SoundAssistFactory {
  SoundAssist create(MinecraftLauncher paramMinecraftLauncher);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/util/guice/SoundAssistFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */