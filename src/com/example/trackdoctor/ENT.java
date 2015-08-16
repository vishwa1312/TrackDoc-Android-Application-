package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ENT extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ent);
		TextView arora=(TextView)findViewById(R.id.textView2);
		arora.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(ENT.this,Arora.class);
				startActivity(intent3);
				
			}
		});
		TextView rai=(TextView)findViewById(R.id.textView3);
		rai.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(ENT.this,Rai.class);
				startActivity(intent3);
				
			}
		});
		TextView shri=(TextView)findViewById(R.id.textView4);
		shri.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(ENT.this,Shri.class);
				startActivity(intent3);
				
			}
		});
		TextView aparna=(TextView)findViewById(R.id.textView5);
		aparna.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(ENT.this,Aparna.class);
				startActivity(intent3);
				
			}
		});
	}

}
