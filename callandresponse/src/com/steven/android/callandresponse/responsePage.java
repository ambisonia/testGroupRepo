package com.steven.android.callandresponse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class responsePage extends Activity {

	//TextView textOut; //new TextView
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		//get message from the intent
		Intent intent = getIntent(); //gets he intent that started the activity and retrieve data contained within
		String message = intent.getStringExtra(CallandresponseActivity.EXTRA_MESSAGE);
		
		//show message on screen
		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);
		
		setContentView(textView);
		
	}

}
