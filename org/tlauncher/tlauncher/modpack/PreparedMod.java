package org.tlauncher.tlauncher.modpack;

import java.nio.file.Path;
import java.util.List;
import net.minecraft.launcher.versions.CompleteVersion;

public interface PreparedMod {
  List<Path> prepare(CompleteVersion paramCompleteVersion);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/modpack/PreparedMod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */