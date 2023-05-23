/*    */ package org.tlauncher.tlauncher.minecraft.user.xb;
/*    */ 
/*    */ import org.apache.log4j.Logger;
/*    */ import org.tlauncher.tlauncher.minecraft.user.GsonParser;
/*    */ import org.tlauncher.tlauncher.minecraft.user.Parser;
/*    */ import org.tlauncher.tlauncher.minecraft.user.RequestAndParseStrategy;
/*    */ import org.tlauncher.tlauncher.minecraft.user.Requester;
/*    */ 
/*    */ public abstract class XboxServiceAuthStrategy extends RequestAndParseStrategy<String, XboxServiceAuthenticationResponse> {
/*    */   protected XboxServiceAuthStrategy(Logger logger, Requester<String> requester) {
/* 11 */     this(logger, requester, (Parser<XboxServiceAuthenticationResponse>)createGsonParser());
/*    */   }
/*    */   
/*    */   protected XboxServiceAuthStrategy(Logger logger, Requester<String> requester, Parser<XboxServiceAuthenticationResponse> parser) {
/* 15 */     super(logger, requester, parser);
/*    */   }
/*    */   
/*    */   protected static GsonParser<XboxServiceAuthenticationResponse> createGsonParser() {
/* 19 */     return GsonParser.withDeserializer(XboxServiceAuthenticationResponse.class, new XboxServiceAuthenticationResponse.Deserializer());
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/user/xb/XboxServiceAuthStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */