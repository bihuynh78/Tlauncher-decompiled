/*    */ package org.apache.http.impl.cookie;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.annotation.ThreadSafe;
/*    */ import org.apache.http.cookie.Cookie;
/*    */ import org.apache.http.cookie.CookieOrigin;
/*    */ import org.apache.http.cookie.MalformedCookieException;
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
/*    */ @ThreadSafe
/*    */ public class IgnoreSpec
/*    */   extends CookieSpecBase
/*    */ {
/*    */   public int getVersion() {
/* 49 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<Cookie> parse(Header header, CookieOrigin origin) throws MalformedCookieException {
/* 55 */     return Collections.emptyList();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean match(Cookie cookie, CookieOrigin origin) {
/* 60 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<Header> formatCookies(List<Cookie> cookies) {
/* 65 */     return Collections.emptyList();
/*    */   }
/*    */ 
/*    */   
/*    */   public Header getVersionHeader() {
/* 70 */     return null;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/http/impl/cookie/IgnoreSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */