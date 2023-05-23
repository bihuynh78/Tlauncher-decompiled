package org.tlauncher.tlauncher.managers;

public interface ManagerListerner<T> {
  void startedDownloading();
  
  void downloadedData(T paramT);
  
  void preparedGame();
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/managers/ManagerListerner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */