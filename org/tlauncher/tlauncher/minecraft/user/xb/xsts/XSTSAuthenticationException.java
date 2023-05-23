/*    */ package org.tlauncher.tlauncher.minecraft.user.xb.xsts;
/*    */ 
/*    */ import org.tlauncher.tlauncher.minecraft.user.MinecraftAuthenticationException;
/*    */ 
/*    */ public class XSTSAuthenticationException
/*    */   extends MinecraftAuthenticationException
/*    */ {
/*    */   public XSTSAuthenticationException() {}
/*    */   
/*    */   public XSTSAuthenticationException(Throwable cause) {
/* 11 */     super(cause);
/*    */   }
/*    */   
/*    */   public String getShortKey() {
/* 15 */     return "xsts_authentication";
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/user/xb/xsts/XSTSAuthenticationException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */