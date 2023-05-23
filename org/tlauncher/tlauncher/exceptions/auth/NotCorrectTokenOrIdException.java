/*   */ package org.tlauncher.tlauncher.exceptions.auth;
/*   */ 
/*   */ public class NotCorrectTokenOrIdException
/*   */   extends AuthenticatorException {
/*   */   public NotCorrectTokenOrIdException() {
/* 6 */     super("Invalid client id or token", "authorization");
/*   */   }
/*   */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/exceptions/auth/NotCorrectTokenOrIdException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */