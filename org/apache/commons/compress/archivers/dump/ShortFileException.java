/*    */ package org.apache.commons.compress.archivers.dump;
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
/*    */ public class ShortFileException
/*    */   extends DumpArchiveException
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   public ShortFileException() {
/* 30 */     super("unexpected EOF");
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/compress/archivers/dump/ShortFileException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */