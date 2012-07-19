package com.ice.airpush;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.airpush.android.Airpush;

public class IsEnabledFunction implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		try {
			return FREObject.newObject(Airpush.isEnabled(context.getActivity()));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (FREWrongThreadException e) {
			e.printStackTrace();
		}
		return null;
	}

}
