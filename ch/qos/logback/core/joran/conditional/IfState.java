package ch.qos.logback.core.joran.conditional;

import ch.qos.logback.core.joran.event.SaxEvent;
import java.util.List;

class IfState {
  Boolean boolResult;
  
  List<SaxEvent> thenSaxEventList;
  
  List<SaxEvent> elseSaxEventList;
  
  boolean active;
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/ch/qos/logback/core/joran/conditional/IfState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */