/*    */ package org.tlauncher.tlauncher.minecraft.user;
/*    */ 
/*    */ public class MinecraftProfileConversionException
/*    */   extends MinecraftAuthenticationException {
/*    */   public MinecraftProfileConversionException(Throwable cause) {
/*  6 */     super(cause);
/*    */   }
/*    */   
/*    */   public String getShortKey() {
/* 10 */     return "minecraft_profile_conversion";
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/user/MinecraftProfileConversionException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */