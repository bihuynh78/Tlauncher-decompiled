/*    */ package org.apache.log4j;
/*    */ 
/*    */ import org.apache.log4j.spi.LoggerFactory;
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
/*    */ class DefaultCategoryFactory
/*    */   implements LoggerFactory
/*    */ {
/*    */   public Logger makeNewLoggerInstance(String name) {
/* 29 */     return new Logger(name);
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/log4j/DefaultCategoryFactory.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */