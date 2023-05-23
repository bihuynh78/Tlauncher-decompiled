/*    */ package org.tlauncher.tlauncher.minecraft.user.oauth.exchange;
/*    */ 
/*    */ import org.tlauncher.tlauncher.minecraft.user.MinecraftAuthenticationException;
/*    */ 
/*    */ public class MicrosoftOAuthCodeExchangeException
/*    */   extends MinecraftAuthenticationException {
/*    */   public MicrosoftOAuthCodeExchangeException(Throwable cause) {
/*  8 */     super(cause);
/*    */   }
/*    */   
/*    */   public String getShortKey() {
/* 12 */     return "microsoft_oauth_code_exchange";
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/user/oauth/exchange/MicrosoftOAuthCodeExchangeException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */