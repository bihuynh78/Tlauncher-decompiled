/*   */ package org.tlauncher.tlauncher.exceptions.auth;
/*   */ 
/*   */ public class UserMigratedException extends AuthenticatorException {
/*   */   private static final long serialVersionUID = 7441756035466353515L;
/*   */   
/*   */   public UserMigratedException() {
/* 7 */     super("This user has migrated", "migrated");
/*   */   }
/*   */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/exceptions/auth/UserMigratedException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */