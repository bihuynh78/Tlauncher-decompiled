/*    */ package org.apache.http.impl.cookie;
/*    */ 
/*    */ import org.apache.http.annotation.ThreadSafe;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ @ThreadSafe
/*    */ public class BestMatchSpec
/*    */   extends DefaultCookieSpec
/*    */ {
/*    */   public BestMatchSpec(String[] datepatterns, boolean oneHeader) {
/* 45 */     super(datepatterns, oneHeader);
/*    */   }
/*    */   
/*    */   public BestMatchSpec() {
/* 49 */     this(null, false);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 54 */     return "best-match";
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/http/impl/cookie/BestMatchSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */