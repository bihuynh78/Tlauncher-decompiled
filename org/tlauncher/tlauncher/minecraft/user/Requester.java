package org.tlauncher.tlauncher.minecraft.user;

import java.io.IOException;
import org.apache.log4j.Logger;

public interface Requester<A> {
  String makeRequest(Logger paramLogger, A paramA) throws InvalidResponseException, IOException;
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/user/Requester.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */