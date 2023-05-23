/*    */ package org.tlauncher.tlauncher.ui.converter.dummy;
/*    */ 
/*    */ import java.util.Date;
/*    */ import net.minecraft.launcher.versions.json.DateTypeAdapter;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DummyDateConverter
/*    */   extends DummyConverter<Date>
/*    */ {
/* 11 */   private final DateTypeAdapter dateAdapter = new DateTypeAdapter();
/*    */ 
/*    */ 
/*    */   
/*    */   public Date fromDummyString(String from) throws RuntimeException {
/* 16 */     return this.dateAdapter.toDate(from);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toDummyValue(Date value) throws RuntimeException {
/* 21 */     return this.dateAdapter.toString(value);
/*    */   }
/*    */ 
/*    */   
/*    */   public Class<Date> getObjectClass() {
/* 26 */     return Date.class;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/converter/dummy/DummyDateConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */