package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Succ_signup extends Activity {
	TextView click;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.succ_signup);
		click=(TextView)findViewById(R.id.textView2);
		click.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Succ_signup.this,MainActivity.class);
				startActivity(intent3);
			}
		});
	}

}
