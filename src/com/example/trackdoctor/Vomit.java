package com.example.trackdoctor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Vomit extends Activity {
	String age1,days1;
	int age2,days2;
	TextView tab,tab1,tab2,tab3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vomit);
		final EditText age=(EditText)findViewById(R.id.editText1);
		final EditText days=(EditText)findViewById(R.id.editText2);
		Button submit=(Button)findViewById(R.id.button1);
		tab=(TextView)findViewById(R.id.textView4);
		tab1=(TextView)findViewById(R.id.textView5);
		tab2=(TextView)findViewById(R.id.textView6);
		tab3=(TextView)findViewById(R.id.textView7);
		submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				age1=age.getText().toString();
				days1=days.getText().toString();
				if(age1.equals("") | (days1.equals("")))
				{
					Toast.makeText(getApplicationContext(), 
                            "You must fill in all of the fields", Toast.LENGTH_LONG).show();
				}
				else{
				age2=Integer.parseInt(age1);
				days2=Integer.parseInt(days1);
				if(age2 < 14)
				{
					if(days2 < 6)
					{
						tab.setText("Domestol(syrup)   5ml-5ml-5ml (or)");
						tab1.setText("Avamin  ½-½-½ ");
						
					}
					else
						tab.setText("Better to Contact Doctor for Treatment");
				}
			   if((age2 > 14))
				{
					if(days2 < 6)
					{
						tab.setText("Domestol  1-1-1 (or)");
						tab1.setText("Avamin  1-1-1 ");
					}
					else
						tab.setText("Better to Contact Doctor for Treatment");
				}
			 
			}}
		});

		
	}

}
