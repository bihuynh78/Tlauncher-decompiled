package org.tlauncher.tlauncher.downloader.mods;

import org.tlauncher.tlauncher.downloader.Downloadable;
import org.tlauncher.tlauncher.downloader.DownloadableHandler;

public class DownloadableHandlerAdapter implements DownloadableHandler {
  public void onStart(Downloadable d) {}
  
  public void onAbort(Downloadable d) {}
  
  public void onComplete(Downloadable d) {}
  
  public void onError(Downloadable d, Throwable e) {}
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/downloader/mods/DownloadableHandlerAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */