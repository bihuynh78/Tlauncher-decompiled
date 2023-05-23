/*    */ package org.tlauncher.tlauncher.ui.swing.extended;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import java.awt.event.ComponentEvent;
/*    */ 
/*    */ public class ExtendedComponentAdapter
/*    */   extends ExtendedComponentListener {
/*    */   public ExtendedComponentAdapter(Component component, int tick) {
/*  9 */     super(component, tick);
/*    */   }
/*    */   
/*    */   public ExtendedComponentAdapter(Component component) {
/* 13 */     super(component);
/*    */   }
/*    */   
/*    */   public void componentShown(ComponentEvent e) {}
/*    */   
/*    */   public void componentHidden(ComponentEvent e) {}
/*    */   
/*    */   public void onComponentResizing(ComponentEvent e) {}
/*    */   
/*    */   public void onComponentResized(ComponentEvent e) {}
/*    */   
/*    */   public void onComponentMoving(ComponentEvent e) {}
/*    */   
/*    */   public void onComponentMoved(ComponentEvent e) {}
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/swing/extended/ExtendedComponentAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */