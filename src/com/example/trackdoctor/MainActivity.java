package com.example.trackdoctor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button login,signup;
	TextView username,password;
	EditText usrnme,pass;
	String a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button)findViewById(R.id.button1);
        signup=(Button)findViewById(R.id.button2);
         usrnme=(EditText)findViewById(R.id.editText1);
         pass=(EditText)findViewById(R.id.editText2);
         login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				a=usrnme.getText().toString();
				b=pass.getText().toString();
				if(a.equals("vishwa"))
					{if(b.equals("vishwa"))
					{
						Intent intent3=new Intent(MainActivity.this,Menu1.class);
					startActivity(intent3);
					}
					else
					{
				    	Toast.makeText(getApplicationContext(), 
	                            "Invalid Password", Toast.LENGTH_LONG).show();
					}}
				else if(a.equals("sagar"))
					{if(b.equals("sagar"))
					{
						Intent intent3=new Intent(MainActivity.this,Menu1.class);
					startActivity(intent3);
					}
					else
					{
				    	Toast.makeText(getApplicationContext(), 
	                            "Invalid Password", Toast.LENGTH_LONG).show();
					}}
				else if(a.equals("sushanth"))
					{if(b.equals("sushanth"))
					{
						Intent intent3=new Intent(MainActivity.this,Menu1.class);
					startActivity(intent3);
					}
					else
					{
				    	Toast.makeText(getApplicationContext(), 
	                            "Invalid Password", Toast.LENGTH_LONG).show();
					}}
				else if(a.equals("rajesh"))
					{if(b.equals("rajesh"))
					{
						Intent intent3=new Intent(MainActivity.this,Menu1.class);
					startActivity(intent3);
					}
					else
					{
				    	Toast.makeText(getApplicationContext(), 
	                            "Invalid Password", Toast.LENGTH_LONG).show();
					}}
				
				else
				{
					Toast.makeText(getApplicationContext(), 
                            "Username doesnt exists ", Toast.LENGTH_LONG).show();
				}
				
			}
		});
         signup.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3=new Intent(MainActivity.this,Signup.class);
				startActivity(intent3);
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
