package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.spi.ContextAware;

public interface LoggerContextAware extends ContextAware {
  void setLoggerContext(LoggerContext paramLoggerContext);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/ch/qos/logback/classic/spi/LoggerContextAware.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */