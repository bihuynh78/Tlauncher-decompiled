/*    */ package ch.qos.logback.classic.pattern;
/*    */ 
/*    */ import ch.qos.logback.classic.spi.ILoggingEvent;
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
/*    */ public class LoggerConverter
/*    */   extends NamedConverter
/*    */ {
/*    */   protected String getFullyQualifiedName(ILoggingEvent event) {
/* 21 */     return event.getLoggerName();
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/ch/qos/logback/classic/pattern/LoggerConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */