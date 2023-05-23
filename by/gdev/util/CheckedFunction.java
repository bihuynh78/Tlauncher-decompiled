package by.gdev.util;

@FunctionalInterface
public interface CheckedFunction<T, R> {
  R apply(T paramT) throws Exception;
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/by/gdev/util/CheckedFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */