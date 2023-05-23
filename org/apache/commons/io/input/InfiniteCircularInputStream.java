/*    */ package org.apache.commons.io.input;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InfiniteCircularInputStream
/*    */   extends CircularInputStream
/*    */ {
/*    */   public InfiniteCircularInputStream(byte[] repeatContent) {
/* 41 */     super(repeatContent, -1L);
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/io/input/InfiniteCircularInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */