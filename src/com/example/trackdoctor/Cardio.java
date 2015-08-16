package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Cardio extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cardio);
		TextView guru=(TextView)findViewById(R.id.textView2);
		guru.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Cardio.this,Guru.class);
				startActivity(intent3);
				
			}
		});
		TextView abhi=(TextView)findViewById(R.id.textView3);
		abhi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Cardio.this,Abhi.class);
				startActivity(intent3);
				
			}
		});
	}

}
