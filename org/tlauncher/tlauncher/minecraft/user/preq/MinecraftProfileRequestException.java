/*    */ package org.tlauncher.tlauncher.minecraft.user.preq;
/*    */ 
/*    */ import org.tlauncher.tlauncher.minecraft.user.MinecraftAuthenticationException;
/*    */ 
/*    */ public class MinecraftProfileRequestException
/*    */   extends MinecraftAuthenticationException {
/*    */   public MinecraftProfileRequestException(Throwable cause) {
/*  8 */     super(cause);
/*    */   }
/*    */   
/*    */   public String getShortKey() {
/* 12 */     return "minecraft_profile_request";
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/user/preq/MinecraftProfileRequestException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */