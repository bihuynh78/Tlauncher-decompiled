package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.nio.ByteBuffer;

public interface ZipEncoding {
  boolean canEncode(String paramString);
  
  ByteBuffer encode(String paramString) throws IOException;
  
  String decode(byte[] paramArrayOfbyte) throws IOException;
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/compress/archivers/zip/ZipEncoding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */