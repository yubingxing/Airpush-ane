package com.air.airtest;


import com.airpush.android.Airpush;
import com.airpush.android.SetPreferences;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		new Airpush(getApplicationContext(),"10256","airpush",true,true,true);
	}

}