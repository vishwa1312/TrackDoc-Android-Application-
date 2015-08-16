package com.example.trackdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends Activity {
	Button signup;
	EditText fname,lname,email,phone,pass,cpass,username,family,phy;
	String first,last,mail,number,paswrd,cpaswrd,usrnme,fam,phy1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);
		signup=(Button)findViewById(R.id.button1);
		fname=(EditText)findViewById(R.id.editText1);
		lname=(EditText)findViewById(R.id.editText2);
		email=(EditText)findViewById(R.id.editText3);
		phone=(EditText)findViewById(R.id.editText4);
		pass=(EditText)findViewById(R.id.editText5);
		cpass=(EditText)findViewById(R.id.editText6);
		username=(EditText)findViewById(R.id.editText7);
		family=(EditText)findViewById(R.id.editText8);
		phy=(EditText)findViewById(R.id.editText9);
		
		signup.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				first=fname.getText().toString();
				last=lname.getText().toString();
				mail=email.getText().toString();
				number=phone.getText().toString();
				paswrd=pass.getText().toString();
				cpaswrd=cpass.getText().toString();
				usrnme=username.getText().toString();
				fam=family.getText().toString();
				phy1=phy.getText().toString();
				if((first.equals("")) | (last.equals("")) | (mail.equals("")) | (number.equals("")) | (paswrd.equals("")) | (usrnme.equals("")) | (fam.equals("")) | (phy1.equals("")))
				{
					Toast.makeText(getApplicationContext(), 
                            "You must fill in all of the fields", Toast.LENGTH_LONG).show();
				}
				
				else if(paswrd.equals(cpaswrd))
				{
					Intent intent3=new Intent(Signup.this,Succ_signup.class);
				startActivity(intent3);
				}
				else
				{
					Toast.makeText(getApplicationContext(), 
                            "These Passwords dont match. Try Again", Toast.LENGTH_LONG).show();
				}
			}
		});
		}

}
