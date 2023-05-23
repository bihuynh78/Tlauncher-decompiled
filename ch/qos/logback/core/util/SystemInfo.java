/*    */ package ch.qos.logback.core.util;
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
/*    */ public class SystemInfo
/*    */ {
/*    */   public static String getJavaVendor() {
/* 19 */     return OptionHelper.getSystemProperty("java.vendor", null);
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/ch/qos/logback/core/util/SystemInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */