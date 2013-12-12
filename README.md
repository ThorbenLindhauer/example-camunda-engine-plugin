example-camunda-engine-plugin
=============================

This is a super simple example of writing a camunda engine plugin and registering a parse and execution listener.

Core classes
------------

[SysoutEnginePlugin](https://github.com/ThorbenLindhauer/example-camunda-engine-plugin/blob/master/src/main/java/de/unipotsdam/hpi/SysoutEnginePlugin.java): the process engine plugin  makes sure the parse listener gets registered

[SysoutParseListener](https://github.com/ThorbenLindhauer/example-camunda-engine-plugin/blob/master/src/main/java/de/unipotsdam/hpi/SysoutParseListener.java): The parse listener adds the execution listener for every user task element

[SysoutExecutionListener](https://github.com/ThorbenLindhauer/example-camunda-engine-plugin/blob/master/src/main/java/de/unipotsdam/hpi/SysoutExecutionListener.java): yeah, prints stuff

[SysoutTest](https://github.com/ThorbenLindhauer/example-camunda-engine-plugin/blob/master/src/test/java/de/unipotsdam/hpi/SysoutTest.java): Try it out

[camunda.cfg.xml](https://github.com/ThorbenLindhauer/example-camunda-engine-plugin/blob/master/src/test/resources/camunda.cfg.xml): shows how to register the process engine plugin
