/*    */ package org.tlauncher.tlauncher.exceptions;
/*    */ 
/*    */ public class ConnectServerConfig
/*    */   extends Exception {
/*    */   private static final long serialVersionUID = 2977918735746519247L;
/*    */   
/*    */   public ConnectServerConfig(String name) {
/*  8 */     super(name);
/*    */   }
/*    */   public ConnectServerConfig(String name, Throwable er) {
/* 11 */     super(name, er);
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/exceptions/ConnectServerConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */