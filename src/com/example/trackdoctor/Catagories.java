package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Catagories extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.catagories);
		Button gen=(Button)findViewById(R.id.button1);
		gen.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Catagories.this,General.class);
				startActivity(intent3);
				
			}
		});
		Button cat=(Button)findViewById(R.id.button2);
		cat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Catagories.this,ENT.class);
				startActivity(intent3);
				
			}
		});
		Button cardio=(Button)findViewById(R.id.button3);
		cardio.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Catagories.this,Cardio.class);
				startActivity(intent3);
				
			}
		});
		Button pediatrician=(Button)findViewById(R.id.button4);
		pediatrician.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Catagories.this,Pediatrician.class);
				startActivity(intent3);
				
			}
		});
		Button ortho=(Button)findViewById(R.id.button5);
		ortho.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Catagories.this,Ortho.class);
				startActivity(intent3);
				
			}
		});
		Button neuro=(Button)findViewById(R.id.button6);
		neuro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Catagories.this,Neuro.class);
				startActivity(intent3);
				
			}
		});
	}

}
