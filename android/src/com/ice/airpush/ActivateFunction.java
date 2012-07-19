package com.ice.airpush;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;
import com.airpush.android.Airpush;

public class ActivateFunction implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		try {
			if(args[0].getAsBool())
				Airpush.enableSdk(context.getActivity());
			else
				Airpush.disableSdk(context.getActivity());
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
