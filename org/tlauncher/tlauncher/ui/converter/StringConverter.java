package org.tlauncher.tlauncher.ui.converter;

public interface StringConverter<T> {
  T fromString(String paramString);
  
  String toString(T paramT);
  
  String toValue(T paramT);
  
  Class<T> getObjectClass();
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/converter/StringConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */