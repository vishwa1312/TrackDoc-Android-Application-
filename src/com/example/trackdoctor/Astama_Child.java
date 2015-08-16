package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Astama_Child extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.astama_child);
		Button video=(Button)findViewById(R.id.button1);
		video.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Astama_Child.this,Astama_Ch_Vid.class);
				startActivity(intent3);
				
			}
		});
	}

}
