package com.ice.airpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.airpush.android.Airpush;

public class BootReceiver extends BroadcastReceiver {
	private static String _appId = null;
	private static String _apiKey = null;
	private static boolean _test = true;
	private static boolean _enablePush = true;
	private static boolean _search = true;
	@Override
	public void onReceive(Context context, Intent intent) {
		new Airpush(context, _appId, _apiKey, _test, _enablePush, _search);
	}
	
	public static void init(Context context, String appId, String apiKey, boolean test, boolean enablePush, boolean search) {
		_appId = appId;
		_apiKey = apiKey;
		_test = test;
		_enablePush = enablePush;
		_search = search;
		new Airpush(context, _appId, _apiKey, _test, _enablePush, _search);
	}
}
