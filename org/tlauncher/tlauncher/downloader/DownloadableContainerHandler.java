package org.tlauncher.tlauncher.downloader;

public interface DownloadableContainerHandler {
  void onAbort(DownloadableContainer paramDownloadableContainer);
  
  void onError(DownloadableContainer paramDownloadableContainer, Downloadable paramDownloadable, Throwable paramThrowable);
  
  void onComplete(DownloadableContainer paramDownloadableContainer, Downloadable paramDownloadable) throws RetryDownloadException;
  
  void onFullComplete(DownloadableContainer paramDownloadableContainer);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/downloader/DownloadableContainerHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */