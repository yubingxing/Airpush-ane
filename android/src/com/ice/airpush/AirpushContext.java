package com.ice.airpush;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class AirpushContext extends FREContext {
	private static final String INIT = "init";
	private static final String IS_ENABLED = "isEnabled";
	private static final String ACTIVATE = "activate";
	
	@Override
	public void dispose() {
	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		Map<String, FREFunction> functionMap = new HashMap<String, FREFunction>();
		functionMap.put(INIT, new InitFunction());
		functionMap.put(IS_ENABLED, new IsEnabledFunction());
		functionMap.put(ACTIVATE, new ActivateFunction());
		return functionMap;
	}

}
