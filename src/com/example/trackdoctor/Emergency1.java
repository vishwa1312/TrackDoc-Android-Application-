package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Emergency1 extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.emergncy);
		Button ambulance=(Button)findViewById(R.id.button1);
		ambulance.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:108"));
				startActivity(callIntent);
			}
		});
		Button physician=(Button)findViewById(R.id.button2);
		physician.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:9738849255"));
				startActivity(callIntent);
				
			}
		});
		Button friends=(Button)findViewById(R.id.button3);
		friends.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:9481086260"));
				startActivity(callIntent);
				
			}
		});
		Button poison=(Button)findViewById(R.id.button4);
		poison.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:1-800-222-1222"));
				startActivity(callIntent);
				
			}
		});
	
	}
	

}
