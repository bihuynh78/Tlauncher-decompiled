/*   */ package org.tlauncher.tlauncher.downloader;
/*   */ 
/*   */ import java.io.IOException;
/*   */ 
/*   */ class GaveUpDownloadException extends IOException {
/*   */   private static final long serialVersionUID = 5762388485267411115L;
/*   */   
/*   */   GaveUpDownloadException(String url, Throwable cause) {
/* 9 */     super(url, cause);
/*   */   }
/*   */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/downloader/GaveUpDownloadException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */