package de.unipotsdam.hpi;

import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.impl.bpmn.parser.AbstractBpmnParseListener;
import org.camunda.bpm.engine.impl.pvm.process.ActivityImpl;
import org.camunda.bpm.engine.impl.pvm.process.ScopeImpl;
import org.camunda.bpm.engine.impl.util.xml.Element;

/**
 * Adds a sysout-listener to any BPMN element we want.
 * @author Thorben
 */
public class SysoutParseListener extends AbstractBpmnParseListener {

  @Override
  public void parseUserTask(Element taskElement, ScopeImpl scope, ActivityImpl activity) {
    scope.addExecutionListener(ExecutionListener.EVENTNAME_START, new SysoutExecutionListener());
    super.parseTask(taskElement, scope, activity);
  }
}
