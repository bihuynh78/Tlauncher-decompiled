package org.apache.http.conn;

import org.apache.http.HttpHost;

public interface SchemePortResolver {
  int resolve(HttpHost paramHttpHost) throws UnsupportedSchemeException;
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/http/conn/SchemePortResolver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */