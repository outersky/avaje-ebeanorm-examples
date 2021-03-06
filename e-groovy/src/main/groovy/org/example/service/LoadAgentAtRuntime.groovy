package org.example.service

import org.avaje.agentloader.AgentLoader
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 *
 * @author: Richard Vowles - https://plus.google.com/+RichardVowles
 */
class LoadAgentAtRuntime {
	protected static Logger logger = LoggerFactory.getLogger(LoadAgentAtRuntime.class);

	static {
		logger.debug("... preStart");
		if (!AgentLoader.loadAgentFromClasspath("avaje-ebeanorm-agent","debug=1;packages=org.example.**")) {
			logger.info("avaje-ebeanorm-agent not found in classpath - not dynamically loaded");
		}
	}
}
