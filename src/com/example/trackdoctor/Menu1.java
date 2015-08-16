package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu1 extends Activity {
	TextView first_aid,avil_doc,emergency,self_care,med_info;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		first_aid=(TextView)findViewById(R.id.textView1);
		avil_doc=(TextView)findViewById(R.id.textView2);
		emergency=(TextView)findViewById(R.id.textView3);
		self_care=(TextView)findViewById(R.id.textView4);
		med_info=(TextView)findViewById(R.id.textView5);
first_aid.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Menu1.this,First_Aid.class);
				startActivity(intent3);
				
			}
		});
		avil_doc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Menu1.this,Catagories.class);
				startActivity(intent3);
				
			}
		});
		emergency.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Menu1.this,Emergency1.class);
				startActivity(intent3);
				
			}
		});
		self_care.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Menu1.this,Tab_Menu.class);
				startActivity(intent3);
				
			}
		});
med_info.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(Menu1.this,Input_Med.class);
				startActivity(intent3);
				
			}
		});
	
	}
	

}
