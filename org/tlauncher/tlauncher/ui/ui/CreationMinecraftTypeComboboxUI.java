/*   */ package org.tlauncher.tlauncher.ui.ui;
/*   */ 
/*   */ import org.tlauncher.modpack.domain.client.share.NameIdDTO;
/*   */ import org.tlauncher.tlauncher.ui.loc.Localizable;
/*   */ 
/*   */ public class CreationMinecraftTypeComboboxUI
/*   */   extends CreationModpackComboBoxUI {
/*   */   public String getText(Object value) {
/* 9 */     return Localizable.get("modpack.version." + ((NameIdDTO)value).getName());
/*   */   }
/*   */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/ui/CreationMinecraftTypeComboboxUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */