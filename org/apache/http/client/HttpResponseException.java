/*    */ package org.apache.http.client;
/*    */ 
/*    */ import org.apache.http.annotation.Immutable;
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
/*    */ 
/*    */ @Immutable
/*    */ public class HttpResponseException
/*    */   extends ClientProtocolException
/*    */ {
/*    */   private static final long serialVersionUID = -7186627969477257933L;
/*    */   private final int statusCode;
/*    */   
/*    */   public HttpResponseException(int statusCode, String s) {
/* 44 */     super(s);
/* 45 */     this.statusCode = statusCode;
/*    */   }
/*    */   
/*    */   public int getStatusCode() {
/* 49 */     return this.statusCode;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/http/client/HttpResponseException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */