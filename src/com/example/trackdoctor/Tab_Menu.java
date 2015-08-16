package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tab_Menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_menu);
		TextView fever=(TextView)findViewById(R.id.textView1);
		fever.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Tab_Menu.this,Fever.class);
				startActivity(intent3);
				
			}
		});
		TextView cold=(TextView)findViewById(R.id.textView2);
		cold.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Tab_Menu.this,Cold.class);
				startActivity(intent3);
				
			}
		});
		TextView cough=(TextView)findViewById(R.id.textView3);
		cough.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Tab_Menu.this,Cough.class);
				startActivity(intent3);
				
			}
		});
		TextView dia=(TextView)findViewById(R.id.textView4);
		dia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Tab_Menu.this,Dia.class);
				startActivity(intent3);
				
			}
		});
		TextView body=(TextView)findViewById(R.id.textView5);
		body.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Tab_Menu.this,Body.class);
				startActivity(intent3);
				
			}
		});
		TextView vomit=(TextView)findViewById(R.id.textView6);
		vomit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Tab_Menu.this,Vomit.class);
				startActivity(intent3);
				
			}
		});
	}

}
