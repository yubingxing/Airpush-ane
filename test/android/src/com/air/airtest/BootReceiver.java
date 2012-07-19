package com.air.airtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.airpush.android.Airpush;

public class BootReceiver extends BroadcastReceiver {

	public void onReceive(Context arg0, Intent arg1) {
		new Airpush(arg0, "10256", "airpush", true, true, true);
	}

}
