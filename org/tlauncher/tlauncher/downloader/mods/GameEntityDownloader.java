/*   */ package org.tlauncher.tlauncher.downloader.mods;
/*   */ 
/*   */ import org.tlauncher.modpack.domain.client.version.MetadataDTO;
/*   */ import org.tlauncher.tlauncher.downloader.Downloadable;
/*   */ import org.tlauncher.tlauncher.repository.Repo;
/*   */ 
/*   */ public abstract class GameEntityDownloader extends Downloadable {
/*   */   public GameEntityDownloader(Repo repo, boolean forceDownload, MetadataDTO metadataDTO) {
/* 9 */     super(repo, metadataDTO, forceDownload);
/*   */   }
/*   */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/downloader/mods/GameEntityDownloader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */