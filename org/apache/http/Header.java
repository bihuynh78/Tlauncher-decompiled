package org.apache.http;

public interface Header {
  String getName();
  
  String getValue();
  
  HeaderElement[] getElements() throws ParseException;
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/http/Header.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */