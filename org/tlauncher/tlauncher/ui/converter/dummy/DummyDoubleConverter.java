/*    */ package org.tlauncher.tlauncher.ui.converter.dummy;
/*    */ 
/*    */ public class DummyDoubleConverter
/*    */   extends DummyConverter<Double>
/*    */ {
/*    */   public Double fromDummyString(String from) throws RuntimeException {
/*  7 */     return Double.valueOf(Double.parseDouble(from));
/*    */   }
/*    */ 
/*    */   
/*    */   public String toDummyValue(Double value) throws RuntimeException {
/* 12 */     return value.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   public Class<Double> getObjectClass() {
/* 17 */     return Double.class;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/converter/dummy/DummyDoubleConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */