package de.unipotsdam.hpi;

import org.camunda.bpm.engine.impl.test.PluggableProcessEngineTestCase;
import org.camunda.bpm.engine.test.Deployment;
import org.junit.Test;

public class SysoutTest extends PluggableProcessEngineTestCase {
  
  @Test
  @Deployment(resources = "de/unipotsdam/hpi/oneTaskProcess.bpmn20.xml")
  public void testSysout() {
    runtimeService.startProcessInstanceByKey("oneTaskProcess");
    
    // I don't do assertions of sysout...
  }

}
