/*    */ package org.apache.commons.compress.harmony.unpack200.bytecode.forms;
/*    */ 
/*    */ import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
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
/*    */ public class DoubleForm
/*    */   extends ReferenceForm
/*    */ {
/*    */   public DoubleForm(int opcode, String name, int[] rewrite) {
/* 29 */     super(opcode, name, rewrite);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getOffset(OperandManager operandManager) {
/* 34 */     return operandManager.nextDoubleRef();
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getPoolID() {
/* 39 */     return 5;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/compress/harmony/unpack200/bytecode/forms/DoubleForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */