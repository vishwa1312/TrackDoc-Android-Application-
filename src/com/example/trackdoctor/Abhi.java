package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Abhi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abhi);
		Button dir=(Button)findViewById(R.id.button2);
		dir.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(android.content.Intent.ACTION_VIEW, 
						  Uri.parse("http://maps.google.com/maps?saddr="+"12.934341, 77.534326"+"&daddr="+"12.914315, 77.637184"));
				intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
					startActivity(intent);
				
			}
		});
		Button call=(Button)findViewById(R.id.button1);
         call.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:9738849255"));
				startActivity(callIntent);
				
			}
		});

	}

}
