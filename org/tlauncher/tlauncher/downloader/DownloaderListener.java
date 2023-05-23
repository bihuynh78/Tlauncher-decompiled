package org.tlauncher.tlauncher.downloader;

public interface DownloaderListener {
  void onDownloaderStart(Downloader paramDownloader, int paramInt);
  
  void onDownloaderAbort(Downloader paramDownloader);
  
  void onDownloaderProgress(Downloader paramDownloader, double paramDouble1, double paramDouble2, double paramDouble3);
  
  void onDownloaderFileComplete(Downloader paramDownloader, Downloadable paramDownloadable);
  
  void onDownloaderComplete(Downloader paramDownloader);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/downloader/DownloaderListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */