package com.ice.airpush;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;

public class InitFunction implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		try {
			BootReceiver.init(context.getActivity(), args[0].getAsString(), args[1].getAsString(), args[2].getAsBool(), args[3].getAsBool(), args[4].getAsBool());
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (FRETypeMismatchException e) {
			e.printStackTrace();
		} catch (FREInvalidObjectException e) {
			e.printStackTrace();
		} catch (FREWrongThreadException e) {
			e.printStackTrace();
		}
		return null;
	}

}
