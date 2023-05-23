package org.tlauncher.util.guice;

import org.tlauncher.tlauncher.configuration.Configuration;
import org.tlauncher.tlauncher.rmo.TLauncher;

public interface TlauncherFactory {
  TLauncher create(Configuration paramConfiguration);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/util/guice/TlauncherFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */