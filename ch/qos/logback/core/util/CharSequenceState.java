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
/*    */ 
/*    */ 
/*    */ 
/*    */ class CharSequenceState
/*    */ {
/*    */   final char c;
/*    */   int occurrences;
/*    */   
/*    */   public CharSequenceState(char c) {
/* 25 */     this.c = c;
/* 26 */     this.occurrences = 1;
/*    */   }
/*    */   
/*    */   void incrementOccurrences() {
/* 30 */     this.occurrences++;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/ch/qos/logback/core/util/CharSequenceState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */