package org.tlauncher.tlauncher.component;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ComponentDependence {
  Class<?>[] value();
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/component/ComponentDependence.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */