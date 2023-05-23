/*   */ package org.tlauncher.tlauncher.ui.swing;
/*   */ 
/*   */ import java.awt.event.ItemEvent;
/*   */ import java.awt.event.ItemListener;
/*   */ 
/*   */ public abstract class CheckBoxListener
/*   */   implements ItemListener {
/*   */   public void itemStateChanged(ItemEvent e) {
/* 9 */     itemStateChanged((e.getStateChange() == 1));
/*   */   }
/*   */   
/*   */   public abstract void itemStateChanged(boolean paramBoolean);
/*   */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/swing/CheckBoxListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */