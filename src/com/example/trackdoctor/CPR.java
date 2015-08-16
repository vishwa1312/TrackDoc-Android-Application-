package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CPR extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cpr);
		TextView cpr_adult=(TextView)findViewById(R.id.textView2);
		cpr_adult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(CPR.this,CPR_Adult.class);
				startActivity(intent3);
				
			}
		});
		TextView cpr_child=(TextView)findViewById(R.id.textView3);
		cpr_child.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(CPR.this,CPR_Child.class);
				startActivity(intent3);
				
			}
		});
		
	}

}
