package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ortho extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ortho);
		TextView san=(TextView)findViewById(R.id.textView2);
		san.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Ortho.this,Sandeep.class);
				startActivity(intent3);
				
			}
		});
		TextView antony=(TextView)findViewById(R.id.textView3);
		antony.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Ortho.this,Antony.class);
				startActivity(intent3);
				
			}
		});

	}

}
