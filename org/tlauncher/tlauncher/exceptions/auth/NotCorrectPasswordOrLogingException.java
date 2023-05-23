/*   */ package org.tlauncher.tlauncher.exceptions.auth;
/*   */ 
/*   */ public class NotCorrectPasswordOrLogingException
/*   */   extends AuthenticatorException {
/*   */   public NotCorrectPasswordOrLogingException() {
/* 6 */     super("Invalid user or password", "relogin");
/*   */   }
/*   */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/exceptions/auth/NotCorrectPasswordOrLogingException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */