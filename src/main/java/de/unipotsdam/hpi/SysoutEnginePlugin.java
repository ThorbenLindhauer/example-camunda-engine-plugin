package de.unipotsdam.hpi;

import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.impl.bpmn.parser.BpmnParseListener;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.cfg.ProcessEnginePlugin;

/**
 * This plugin ensures that the parse listener is registered with the process engine.
 * The plugin itself is registered in the process engine configuration, i.e. camunda.cfg.xml or bpm-platform.xml.
 * 
 * @author Thorben
 */
public class SysoutEnginePlugin implements ProcessEnginePlugin {

  public void preInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
    List<BpmnParseListener> customPreBPMNParseListeners = processEngineConfiguration.getCustomPreBPMNParseListeners();
    if (customPreBPMNParseListeners == null) {
      customPreBPMNParseListeners = new ArrayList<BpmnParseListener>();
      processEngineConfiguration.setCustomPreBPMNParseListeners(customPreBPMNParseListeners);
    }
    customPreBPMNParseListeners.add(new SysoutParseListener());
  }

  public void postInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
    
  }

  public void postProcessEngineBuild(ProcessEngine processEngine) {
    
  }

}
