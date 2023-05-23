/*   */ package org.tlauncher.tlauncher.exceptions.auth;
/*   */ 
/*   */ public class InvalidCredentialsException extends AuthenticatorException {
/*   */   private static final long serialVersionUID = 7221509839484990453L;
/*   */   
/*   */   public InvalidCredentialsException() {
/* 7 */     super("Invalid user / password / token", "relogin");
/*   */   }
/*   */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/exceptions/auth/InvalidCredentialsException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */