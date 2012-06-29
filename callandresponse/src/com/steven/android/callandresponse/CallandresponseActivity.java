package com.steven.android.callandresponse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class CallandresponseActivity extends Activity {
	
	//public String message;
	//EditText getInput;
	public final static String EXTRA_MESSAGE = "android.intent.action.MESSAGE";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    //Called when the user selects the Send button. Calling the method is done in XML using Android:onClick = "sendMessage"
    public void sendMessage(View view) {
        // Do something in response to button
    	EditText editText = (EditText) findViewById(R.id.editText1);
    	String message = editText.getText().toString();
    	
    	Intent intent = new Intent(this, responsePage.class); //create new intent to start new activity
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
    
}