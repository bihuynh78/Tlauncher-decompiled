/*    */ package org.apache.commons.compress.archivers.sevenz;
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
/*    */ class BindPair
/*    */ {
/*    */   long inIndex;
/*    */   long outIndex;
/*    */   
/*    */   public String toString() {
/* 26 */     return "BindPair binding input " + this.inIndex + " to output " + this.outIndex;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/compress/archivers/sevenz/BindPair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */