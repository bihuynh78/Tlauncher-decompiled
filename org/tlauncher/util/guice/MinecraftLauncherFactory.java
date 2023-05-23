package org.tlauncher.util.guice;

import org.tlauncher.tlauncher.minecraft.launcher.MinecraftLauncher;
import org.tlauncher.tlauncher.rmo.TLauncher;

public interface MinecraftLauncherFactory {
  MinecraftLauncher create(TLauncher paramTLauncher, boolean paramBoolean);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/util/guice/MinecraftLauncherFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */