/*    */ package org.tlauncher.tlauncher.ui.swing;
/*    */ 
/*    */ import java.beans.PropertyChangeListener;
/*    */ import javax.swing.Action;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class EmptyAction
/*    */   implements Action
/*    */ {
/*    */   protected boolean enabled = true;
/*    */   
/*    */   public Object getValue(String key) {
/* 16 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void putValue(String key, Object value) {}
/*    */ 
/*    */   
/*    */   public void setEnabled(boolean b) {
/* 25 */     this.enabled = b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isEnabled() {
/* 30 */     return this.enabled;
/*    */   }
/*    */   
/*    */   public void addPropertyChangeListener(PropertyChangeListener listener) {}
/*    */   
/*    */   public void removePropertyChangeListener(PropertyChangeListener listener) {}
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/swing/EmptyAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */