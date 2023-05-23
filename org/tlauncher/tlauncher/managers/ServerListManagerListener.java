package org.tlauncher.tlauncher.managers;

public interface ServerListManagerListener {
  void onServersRefreshing(ServerListManager paramServerListManager);
  
  void onServersRefreshingFailed(ServerListManager paramServerListManager);
  
  void onServersRefreshed(ServerListManager paramServerListManager);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/managers/ServerListManagerListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */