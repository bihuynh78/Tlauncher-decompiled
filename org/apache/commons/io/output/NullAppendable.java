/*    */ package org.apache.commons.io.output;
/*    */ 
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
/*    */ public class NullAppendable
/*    */   implements Appendable
/*    */ {
/* 35 */   public static final NullAppendable INSTANCE = new NullAppendable();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Appendable append(char c) throws IOException {
/* 44 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public Appendable append(CharSequence csq) throws IOException {
/* 49 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public Appendable append(CharSequence csq, int start, int end) throws IOException {
/* 54 */     return this;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/io/output/NullAppendable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */