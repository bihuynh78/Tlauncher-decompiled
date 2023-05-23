/*    */ package ch.qos.logback.classic.joran.action;
/*    */ 
/*    */ import ch.qos.logback.classic.boolex.JaninoEventEvaluator;
/*    */ import ch.qos.logback.core.joran.action.AbstractEventEvaluatorAction;
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
/*    */ public class EvaluatorAction
/*    */   extends AbstractEventEvaluatorAction
/*    */ {
/*    */   protected String defaultClassName() {
/* 21 */     return JaninoEventEvaluator.class.getName();
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/ch/qos/logback/classic/joran/action/EvaluatorAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */