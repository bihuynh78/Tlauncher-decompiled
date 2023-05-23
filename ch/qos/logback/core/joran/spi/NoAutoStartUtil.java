/*    */ package ch.qos.logback.core.joran.spi;
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
/*    */ public class NoAutoStartUtil
/*    */ {
/*    */   public static boolean notMarkedWithNoAutoStart(Object o) {
/* 26 */     if (o == null) {
/* 27 */       return false;
/*    */     }
/* 29 */     Class<?> clazz = o.getClass();
/* 30 */     NoAutoStart a = clazz.<NoAutoStart>getAnnotation(NoAutoStart.class);
/* 31 */     return (a == null);
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/ch/qos/logback/core/joran/spi/NoAutoStartUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */