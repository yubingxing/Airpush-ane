package com.ice.airpush;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class AirpushExtension implements FREExtension {
	public static FREContext context;
	@Override
	public FREContext createContext(String arg0) {
		if(context == null)
			context = new AirpushContext();
		return context;
	}

	@Override
	public void dispose() {
		context = null;
	}

	@Override
	public void initialize() {
	}

}
