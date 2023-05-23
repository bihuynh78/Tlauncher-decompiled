/*   */ package org.tlauncher.tlauncher.minecraft.user.xb.xsts;
/*   */ 
/*   */ public class NoXboxAccountException extends XSTSAuthenticationException {
/*   */   public String getShortKey() {
/* 5 */     return super.getShortKey() + ".no_xbox_account";
/*   */   }
/*   */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/user/xb/xsts/NoXboxAccountException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */