package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Poison extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.poison);
		TextView poison_adult=(TextView)findViewById(R.id.textView2);
		poison_adult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Poison.this,Poison_Adult.class);
				startActivity(intent3);
				
			}
		});
		TextView poison_child=(TextView)findViewById(R.id.textView3);
		poison_child.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Poison.this,Poison_Child.class);
				startActivity(intent3);
				
			}
		});
		
	}

}
