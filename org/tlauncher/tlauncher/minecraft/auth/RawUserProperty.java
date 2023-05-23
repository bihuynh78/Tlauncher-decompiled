/*   */ package org.tlauncher.tlauncher.minecraft.auth;
/*   */ 
/*   */ import java.util.LinkedHashMap;
/*   */ 
/*   */ class RawUserProperty extends LinkedHashMap<String, String> {
/*   */   private static final long serialVersionUID = 1281494999913983388L;
/*   */   
/*   */   public UserProperty toProperty() {
/* 9 */     return new UserProperty(get("name"), get("value"));
/*   */   }
/*   */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/auth/RawUserProperty.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */