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
/*    */ public class SuperInitMethodRefForm
/*    */   extends InitMethodReferenceForm
/*    */ {
/*    */   public SuperInitMethodRefForm(int opcode, String name, int[] rewrite) {
/* 25 */     super(opcode, name, rewrite);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected String context(OperandManager operandManager) {
/* 31 */     return operandManager.getSuperClass();
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/compress/harmony/unpack200/bytecode/forms/SuperInitMethodRefForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */