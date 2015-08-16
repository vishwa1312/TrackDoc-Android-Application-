package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bleeding extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bleeding);
		TextView bleed_adult=(TextView)findViewById(R.id.textView2);
		bleed_adult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Bleeding.this,Bleeding_Adult.class);
				startActivity(intent3);
				
			}
		});
		TextView bleed_child=(TextView)findViewById(R.id.textView3);
		bleed_child.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Bleeding.this,Bleeding_Child.class);
				startActivity(intent3);
				
			}
		});
	}

}
