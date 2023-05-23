package org.tlauncher.tlauncher.updater.client;

public interface UpdaterListener {
  void onUpdaterRequesting(Updater paramUpdater);
  
  void onUpdaterErrored(Updater.SearchFailed paramSearchFailed);
  
  void onUpdaterSucceeded(Updater.SearchSucceeded paramSearchSucceeded);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/updater/client/UpdaterListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */