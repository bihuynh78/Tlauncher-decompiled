package org.tlauncher.tlauncher.updater.client;

public abstract class UpdaterAdapter implements UpdaterListener {
  public void onUpdaterRequesting(Updater u) {}
  
  public void onUpdaterErrored(Updater.SearchFailed failed) {}
  
  public void onUpdaterSucceeded(Updater.SearchSucceeded succeeded) {}
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/updater/client/UpdaterAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */