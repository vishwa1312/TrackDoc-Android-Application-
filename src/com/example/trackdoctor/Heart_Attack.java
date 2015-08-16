package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Heart_Attack extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.heart_attack);
		TextView heart=(TextView)findViewById(R.id.textView2);
		ImageButton heart1=(ImageButton)findViewById(R.id.imageButton1);
		heart.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Heart_Attack.this,Heart_Adult.class);
				startActivity(intent3);
				
			}
		});
		heart1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Heart_Attack.this,Heart_Adult.class);
				startActivity(intent3);
				
			}
		});
	}

}
