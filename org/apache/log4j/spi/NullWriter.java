package org.apache.log4j.spi;

import java.io.Writer;

class NullWriter extends Writer {
  public void close() {}
  
  public void flush() {}
  
  public void write(char[] cbuf, int off, int len) {}
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/log4j/spi/NullWriter.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */