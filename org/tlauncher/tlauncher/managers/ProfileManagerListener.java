package org.tlauncher.tlauncher.managers;

import org.tlauncher.tlauncher.entity.profile.ClientProfile;

public interface ProfileManagerListener {
  void fireRefreshed(ClientProfile paramClientProfile);
  
  void fireClientProfileChanged(ClientProfile paramClientProfile);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/managers/ProfileManagerListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */