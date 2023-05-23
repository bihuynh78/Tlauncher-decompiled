/*    */ package org.apache.http.impl.client;
/*    */ 
/*    */ import org.apache.http.annotation.Immutable;
/*    */ import org.apache.http.client.UserTokenHandler;
/*    */ import org.apache.http.protocol.HttpContext;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Immutable
/*    */ public class NoopUserTokenHandler
/*    */   implements UserTokenHandler
/*    */ {
/* 41 */   public static final NoopUserTokenHandler INSTANCE = new NoopUserTokenHandler();
/*    */ 
/*    */   
/*    */   public Object getUserToken(HttpContext context) {
/* 45 */     return null;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/http/impl/client/NoopUserTokenHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */