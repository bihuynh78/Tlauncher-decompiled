package com.google.gson;

import java.lang.reflect.Field;

public interface FieldNamingStrategy {
  String translateName(Field paramField);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/com/google/gson/FieldNamingStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */