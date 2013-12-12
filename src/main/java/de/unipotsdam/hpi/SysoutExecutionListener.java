package de.unipotsdam.hpi;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class SysoutExecutionListener implements ExecutionListener {

  public void notify(DelegateExecution execution) throws Exception {
    System.out.println("Yay, I got executed");
  }

}
