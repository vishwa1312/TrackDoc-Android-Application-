package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pediatrician extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pedia);
		TextView abhay=(TextView)findViewById(R.id.textView2);
		abhay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Pediatrician.this,Abhay.class);
				startActivity(intent3);
				
			}
		});
		TextView antony=(TextView)findViewById(R.id.textView3);
		antony.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Pediatrician.this,Antony.class);
				startActivity(intent3);
				
			}
		});
		TextView mad=(TextView)findViewById(R.id.textView4);
		mad.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Pediatrician.this,Madh.class);
				startActivity(intent3);
				
			}
		});
		TextView aparna=(TextView)findViewById(R.id.textView5);
		aparna.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Pediatrician.this,Aparna.class);
				startActivity(intent3);
				
			}
		});
	}

}
