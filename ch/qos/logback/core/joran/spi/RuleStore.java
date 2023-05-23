package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;

public interface RuleStore {
  void addRule(ElementSelector paramElementSelector, String paramString) throws ClassNotFoundException;
  
  void addRule(ElementSelector paramElementSelector, Action paramAction);
  
  List<Action> matchActions(ElementPath paramElementPath);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/ch/qos/logback/core/joran/spi/RuleStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */