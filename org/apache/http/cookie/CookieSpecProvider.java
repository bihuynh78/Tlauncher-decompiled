package org.apache.http.cookie;

import org.apache.http.protocol.HttpContext;

public interface CookieSpecProvider {
  CookieSpec create(HttpContext paramHttpContext);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/http/cookie/CookieSpecProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */