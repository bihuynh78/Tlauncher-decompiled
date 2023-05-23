/*    */ package org.tlauncher.tlauncher.minecraft.user.mcsauth;
/*    */ 
/*    */ import org.tlauncher.tlauncher.minecraft.user.MinecraftAuthenticationException;
/*    */ 
/*    */ public class MinecraftServicesAuthenticationException
/*    */   extends MinecraftAuthenticationException {
/*    */   public MinecraftServicesAuthenticationException(Throwable cause) {
/*  8 */     super(cause);
/*    */   }
/*    */   
/*    */   public String getShortKey() {
/* 12 */     return "minecraft_services_auth";
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/user/mcsauth/MinecraftServicesAuthenticationException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */