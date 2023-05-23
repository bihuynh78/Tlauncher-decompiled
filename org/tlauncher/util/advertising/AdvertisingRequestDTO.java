/*    */ package org.tlauncher.util.advertising;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ 
/*    */ public class AdvertisingRequestDTO
/*    */ {
/*    */   @XmlElement
/*    */   private String accessToken;
/*    */   @XmlElement
/*    */   private String clientToken;
/*    */   
/*    */   public String getAccessToken() {
/* 13 */     return this.accessToken;
/*    */   }
/*    */   public void setAccessToken(String accessToken) {
/* 16 */     this.accessToken = accessToken;
/*    */   }
/*    */   public String getClientToken() {
/* 19 */     return this.clientToken;
/*    */   }
/*    */   public void setClientToken(String clientToken) {
/* 22 */     this.clientToken = clientToken;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/util/advertising/AdvertisingRequestDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */