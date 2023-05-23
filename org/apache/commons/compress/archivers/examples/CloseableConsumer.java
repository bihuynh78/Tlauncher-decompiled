/*    */ package org.apache.commons.compress.archivers.examples;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface CloseableConsumer
/*    */ {
/* 37 */   public static final CloseableConsumer CLOSING_CONSUMER = Closeable::close;
/*    */   public static final CloseableConsumer NULL_CONSUMER = c -> {
/*    */     
/*    */     };
/*    */   
/*    */   void accept(Closeable paramCloseable) throws IOException;
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/compress/archivers/examples/CloseableConsumer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */