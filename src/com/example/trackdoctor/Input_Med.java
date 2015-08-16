package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Input_Med extends Activity {
	String abc;
	EditText drug;

protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.input_med);
	Button submit=(Button)findViewById(R.id.button1);
	
	//Toast.makeText(getApplicationContext(), 
      //     a, Toast.LENGTH_LONG).show();
	submit.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			drug=(EditText)findViewById(R.id.editText1);
			abc=drug.getText().toString();
			Toast.makeText(getApplicationContext(), 
		            abc, Toast.LENGTH_LONG).show();
			Intent intent3=new Intent(Input_Med.this,Med_Info.class);
			intent3.putExtra("drug", abc);
			startActivity(intent3);
			
		}
	});
}
}
