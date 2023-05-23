package org.apache.log4j.spi;

import org.apache.log4j.Logger;

public interface LoggerFactory {
  Logger makeNewLoggerInstance(String paramString);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/log4j/spi/LoggerFactory.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */