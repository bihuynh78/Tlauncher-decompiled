/*    */ package org.tlauncher.tlauncher.ui.converter.dummy;
/*    */ 
/*    */ public class DummyLongConverter
/*    */   extends DummyConverter<Long>
/*    */ {
/*    */   public Long fromDummyString(String from) throws RuntimeException {
/*  7 */     return Long.valueOf(Long.parseLong(from));
/*    */   }
/*    */ 
/*    */   
/*    */   public String toDummyValue(Long value) throws RuntimeException {
/* 12 */     return value.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   public Class<Long> getObjectClass() {
/* 17 */     return Long.class;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/converter/dummy/DummyLongConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */