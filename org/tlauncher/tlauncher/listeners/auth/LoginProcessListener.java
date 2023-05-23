package org.tlauncher.tlauncher.listeners.auth;

import org.tlauncher.tlauncher.ui.login.LoginException;

public interface LoginProcessListener {
  default void preValidate() {}
  
  default void validatePreGameLaunch() throws LoginException {}
  
  default void loginFailed() {}
  
  default void loginSucceed() {}
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/listeners/auth/LoginProcessListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */