package org.tlauncher.tlauncher.downloader;

public abstract class DownloadableContainerHandlerAdapter implements DownloadableContainerHandler {
  public void onAbort(DownloadableContainer c) {}
  
  public void onError(DownloadableContainer c, Downloadable d, Throwable e) {}
  
  public void onComplete(DownloadableContainer c, Downloadable d) throws RetryDownloadException {}
  
  public void onFullComplete(DownloadableContainer c) {}
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/downloader/DownloadableContainerHandlerAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */