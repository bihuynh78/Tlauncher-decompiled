package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;

public interface PostCompileProcessor<E> {
  void process(Context paramContext, Converter<E> paramConverter);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/ch/qos/logback/core/pattern/PostCompileProcessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */