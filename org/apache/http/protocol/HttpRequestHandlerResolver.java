package org.apache.http.protocol;

@Deprecated
public interface HttpRequestHandlerResolver {
  HttpRequestHandler lookup(String paramString);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/http/protocol/HttpRequestHandlerResolver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */