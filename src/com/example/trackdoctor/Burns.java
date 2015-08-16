package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Burns extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.burns1);
		TextView burns_adult=(TextView)findViewById(R.id.textView2);
		burns_adult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Burns.this,Burns_Adult.class);
				startActivity(intent3);
				
			}
		});
		TextView burns_child=(TextView)findViewById(R.id.textView3);
		burns_child.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Burns.this,Burns_Child.class);
				startActivity(intent3);
				
			}
		});
	}

}
