package org.apache.http.conn.ssl;

import java.net.Socket;
import java.util.Map;

@Deprecated
public interface PrivateKeyStrategy {
  String chooseAlias(Map<String, PrivateKeyDetails> paramMap, Socket paramSocket);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/http/conn/ssl/PrivateKeyStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */