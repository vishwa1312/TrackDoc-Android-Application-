package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Astama extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.astama1);
		TextView adult=(TextView)findViewById(R.id.textView2);
		ImageButton adult1=(ImageButton)findViewById(R.id.imageButton1);
		adult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Astama.this,Astama_Adult.class);
				startActivity(intent3);
			}
		});
		adult1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Astama.this,Astama_Adult.class);
				startActivity(intent3);
				
			}
		});
		TextView child=(TextView)findViewById(R.id.textView3);
		ImageButton child1=(ImageButton)findViewById(R.id.imageButton2);
		child.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Astama.this,Astama_Child.class);
				startActivity(intent3);
			}
		});
		child1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Astama.this,Astama_Child.class);
				startActivity(intent3);
				
			}
		});
	}

}
