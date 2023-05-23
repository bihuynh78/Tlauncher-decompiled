package org.tlauncher.tlauncher.managers;

public interface VersionManagerListener {
  void onVersionsRefreshing(VersionManager paramVersionManager);
  
  void onVersionsRefreshingFailed(VersionManager paramVersionManager);
  
  void onVersionsRefreshed(VersionManager paramVersionManager);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/managers/VersionManagerListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */