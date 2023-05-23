package org.tlauncher.tlauncher.downloader;

public interface DownloadableHandler {
  void onStart(Downloadable paramDownloadable);
  
  void onAbort(Downloadable paramDownloadable);
  
  void onComplete(Downloadable paramDownloadable) throws RetryDownloadException;
  
  void onError(Downloadable paramDownloadable, Throwable paramThrowable);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/downloader/DownloadableHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */