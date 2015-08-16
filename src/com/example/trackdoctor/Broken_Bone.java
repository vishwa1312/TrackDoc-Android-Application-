package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Broken_Bone extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.broken_bone);
		TextView adult=(TextView)findViewById(R.id.textView2);
		adult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Broken_Bone.this,Broken_Adult.class);
				startActivity(intent3);
				
			}
		});
		TextView child=(TextView)findViewById(R.id.textView3);
		child.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Broken_Bone.this,Broken_Child.class);
				startActivity(intent3);	
			}
		});
	}

}
