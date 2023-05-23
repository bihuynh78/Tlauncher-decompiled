/*    */ package org.tlauncher.tlauncher.ui.animate;
/*    */ 
/*    */ import java.awt.Component;
/*    */ 
/*    */ public class Animator {
/*    */   private static final int DEFAULT_TICK = 20;
/*    */   
/*    */   public static void move(Component comp, int destX, int destY, int tick) {
/*  9 */     comp.setLocation(destX, destY);
/*    */   }
/*    */   
/*    */   public static void move(Component comp, int destX, int destY) {
/* 13 */     move(comp, destX, destY, 20);
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/animate/Animator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */