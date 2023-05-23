package org.apache.commons.io.function;

import java.io.IOException;

@FunctionalInterface
public interface IOSupplier<T> {
  T get() throws IOException;
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/io/function/IOSupplier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */