package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class First_Aid extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_aid);
		TextView astama=(TextView)findViewById(R.id.textView2);
		astama.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(First_Aid.this,Astama.class);
				startActivity(intent3);
				
			}
		});
		TextView heartattack=(TextView)findViewById(R.id.textView3);
		heartattack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(First_Aid.this,Heart_Attack.class);
				startActivity(intent3);
				
			}
		});
		TextView brokenbone=(TextView)findViewById(R.id.textView4);
		brokenbone.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(First_Aid.this,Broken_Bone.class);
				startActivity(intent3);
				
			}
		});
		TextView snake=(TextView)findViewById(R.id.textView5);
		snake.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(First_Aid.this,Snake_Bite.class);
				startActivity(intent3);
				
			}
		});
		TextView cpr=(TextView)findViewById(R.id.textView6);
		cpr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(First_Aid.this,CPR.class);
				startActivity(intent);
				
			}
		});
		TextView burns=(TextView)findViewById(R.id.textView7);
		burns.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(First_Aid.this,Burns.class);
				startActivity(intent);
				
			}
		});
		TextView stroke=(TextView)findViewById(R.id.textView8);
		stroke.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(First_Aid.this,Stroke.class);
				startActivity(intent);
				
			}
		});
		TextView poison=(TextView)findViewById(R.id.textView9);
		poison.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(First_Aid.this,Poison.class);
				startActivity(intent);
				
			}
		});
		TextView bleed=(TextView)findViewById(R.id.textView10);
		bleed.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(First_Aid.this,Bleeding.class);
				startActivity(intent);
				
			}
		});
	}

}
