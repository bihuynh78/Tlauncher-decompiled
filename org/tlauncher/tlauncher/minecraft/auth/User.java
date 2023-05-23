/*    */ package org.tlauncher.tlauncher.minecraft.auth;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class User {
/*    */   private String id;
/*    */   private List<Map<String, String>> properties;
/*    */   
/*    */   public String getID() {
/* 11 */     return this.id;
/*    */   }
/*    */   
/*    */   public List<Map<String, String>> getProperties() {
/* 15 */     return this.properties;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/auth/User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */