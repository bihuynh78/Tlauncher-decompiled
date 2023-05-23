package ch.qos.logback.core;

import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.FilterAttachable;
import ch.qos.logback.core.spi.LifeCycle;

public interface Appender<E> extends LifeCycle, ContextAware, FilterAttachable<E> {
  String getName();
  
  void doAppend(E paramE) throws LogbackException;
  
  void setName(String paramString);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/ch/qos/logback/core/Appender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */