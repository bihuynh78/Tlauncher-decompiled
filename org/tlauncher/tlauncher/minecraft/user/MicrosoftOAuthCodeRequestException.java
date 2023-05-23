/*    */ package org.tlauncher.tlauncher.minecraft.user;
/*    */ 
/*    */ public class MicrosoftOAuthCodeRequestException
/*    */   extends MinecraftAuthenticationException {
/*    */   public MicrosoftOAuthCodeRequestException(String message) {
/*  6 */     super(message);
/*    */   }
/*    */   
/*    */   public MicrosoftOAuthCodeRequestException(String message, Throwable cause) {
/* 10 */     super(message, cause);
/*    */   }
/*    */   
/*    */   public String getShortKey() {
/* 14 */     return "microsoft_oauth_code_request";
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/user/MicrosoftOAuthCodeRequestException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */