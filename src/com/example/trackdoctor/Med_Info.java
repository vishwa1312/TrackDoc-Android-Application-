package com.example.trackdoctor;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class Med_Info extends Activity {
/*	Bundle bundle = getIntent().getExtras();
	String a = bundle.getString("drug");*/
	/*Intent startingIntent = getIntent();
	String a = startingIntent.getStringExtra("drug");
	String url =  "http://www.drugs.com/"+a.toLowerCase()+".html";*/
	String url;
	String a;
	ProgressDialog mProgressDialog;
	protected void onCreate(Bundle savedInstanceState) {
	/*	Intent startingIntent = getIntent();
		 a = startingIntent.getStringExtra("drug");
		 url =  "http://www.drugs.com/"+a+".html";*/
		
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.med_info2);
		Intent startingIntent = getIntent();
		 a = startingIntent.getStringExtra("drug");
		 url =  "http://www.drugs.com/"+a.toLowerCase()+".html";
		// Toast.makeText(getApplicationContext(), 
          //       url, Toast.LENGTH_LONG).show();
	/*	Bundle bundle = getIntent().getExtras();
		 a = bundle.getString("drug");
		Button submit=(Button)findViewById(R.id.button1);*/
		
		
		//super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);

		// Locate the Buttons in activity_main.xml
	
		Button descbutton = (Button) findViewById(R.id.button1);
		Button side_eff=(Button)findViewById(R.id.button2);
		Button dosage=(Button)findViewById(R.id.button3);
		Button avoid=(Button)findViewById(R.id.button4);
		Button effect=(Button)findViewById(R.id.button5);

		// Capture button click
		descbutton.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				// Execute Description AsyncTask
				new Description().execute();
			}
		});
		side_eff.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				// Execute Description AsyncTask
				new Side().execute();
			}
		});
		dosage.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				// Execute Description AsyncTask
				new Dose().execute();
			}
		});
		avoid.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				// Execute Description AsyncTask
				new Avoid().execute();
			}
		});
		effect.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				// Execute Description AsyncTask
				new Effect().execute();
			}
		});

	

	}

	// Title AsyncTask
	
	// Description AsyncTask
	private class Description extends AsyncTask<Void, Void, Void> {
		String desc;
		String desc1;
		
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			mProgressDialog = new ProgressDialog(Med_Info.this);
			mProgressDialog.setTitle("Drug Details");
			mProgressDialog.setMessage("Loading...");
			mProgressDialog.setIndeterminate(false);
			mProgressDialog.show();
		}

		@Override
		protected Void doInBackground(Void... params) {
			try {
				// Connect to the web site
				Document document = Jsoup.connect(url).get();
				// Using Elements to get the Meta data
				
				Elements description1 = document
						.select("div.contentBox");
				desc = description1.text();
				int x = desc.indexOf("What is");
				int y = desc.indexOf("Important information");
				desc1 = desc.substring(x,y);
			
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// Set description into TextView
			
			//TextView txtdesc = (TextView) findViewById(R.id.desctxt);
			//txtdesc.setText(desc1);
			Intent intent3=new Intent(Med_Info.this,What_is.class);
			intent3.putExtra("drug", desc1);
			startActivity(intent3);
			
			mProgressDialog.dismiss();
		}
	}
	private class Side extends AsyncTask<Void, Void, Void> {
		String desc;
		String desc1;
		
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			mProgressDialog = new ProgressDialog(Med_Info.this);
			mProgressDialog.setTitle("Side Effects");
			mProgressDialog.setMessage("Loading...");
			mProgressDialog.setIndeterminate(false);
			mProgressDialog.show();
		}

		@Override
		protected Void doInBackground(Void... params) {
			try {
				// Connect to the web site
				Document document = Jsoup.connect(url).get();
				// Using Elements to get the Meta data
				
				Elements description1 = document
						.select("div.contentBox");
				desc = description1.text();
				String abc=Character.toUpperCase(a.charAt(0))+a.substring(1);
				int x = desc.indexOf(abc+" side effects");
				int y = desc.indexOf("See also: Side effects");
				desc1 = desc.substring(x,y);
			    
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// Set description into TextView
			
			//TextView txtdesc = (TextView) findViewById(R.id.desctxt);
			//txtdesc.setText(desc1);
			Intent intent=new Intent(Med_Info.this,What_is.class);
			intent.putExtra("drug", desc1);
			startActivity(intent);
			
			mProgressDialog.dismiss();
		}
	}
	private class Dose extends AsyncTask<Void, Void, Void> {
		String desc;
		String desc1;
		
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			mProgressDialog = new ProgressDialog(Med_Info.this);
			mProgressDialog.setTitle("Dosage Details");
			mProgressDialog.setMessage("Loading...");
			mProgressDialog.setIndeterminate(false);
			mProgressDialog.show();
		}

		@Override
		protected Void doInBackground(Void... params) {
			try {
				// Connect to the web site
				Document document = Jsoup.connect(url).get();
				// Using Elements to get the Meta data
				
				Elements description1 = document
						.select("div.contentBox");
				desc = description1.text();
		//		String abc=Character.toUpperCase(a.charAt(0))+a.substring(1);
				int x = desc.indexOf("How should I");
				if(x==-1)
				{
					x = desc.indexOf("How is");
				}
				int y = desc.indexOf("What happens if I");
				desc1 = desc.substring(x,y);
			    
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// Set description into TextView
			
			//TextView txtdesc = (TextView) findViewById(R.id.desctxt);
			//txtdesc.setText(desc1);
			Intent intent=new Intent(Med_Info.this,What_is.class);
			intent.putExtra("drug", desc1);
			startActivity(intent);
			
			mProgressDialog.dismiss();
		}
	}
	private class Avoid extends AsyncTask<Void, Void, Void> {
		String desc;
		String desc1;
		
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			mProgressDialog = new ProgressDialog(Med_Info.this);
			mProgressDialog.setTitle("Avoid These things..");
			mProgressDialog.setMessage("Loading...");
			mProgressDialog.setIndeterminate(false);
			mProgressDialog.show();
		}

		@Override
		protected Void doInBackground(Void... params) {
			try {
				// Connect to the web site
				Document document = Jsoup.connect(url).get();
				// Using Elements to get the Meta data
				
				Elements description1 = document
						.select("div.contentBox");
				desc = description1.text();
				String abc=Character.toUpperCase(a.charAt(0))+a.substring(1);
				int x = desc.indexOf("What should I avoid");
				int y = desc.indexOf(abc+" side effects");
				desc1 = desc.substring(x,y);
			    
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// Set description into TextView
			
			//TextView txtdesc = (TextView) findViewById(R.id.desctxt);
			//txtdesc.setText(desc1);
			Intent intent=new Intent(Med_Info.this,What_is.class);
			intent.putExtra("drug", desc1);
			startActivity(intent);
			
			mProgressDialog.dismiss();
		}


}
	private class Effect extends AsyncTask<Void, Void, Void> {
		String desc;
		String desc1;
		
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			mProgressDialog = new ProgressDialog(Med_Info.this);
			mProgressDialog.setTitle("Effect OF Other Drugs..");
			mProgressDialog.setMessage("Loading...");
			mProgressDialog.setIndeterminate(false);
			mProgressDialog.show();
		}

		@Override
		protected Void doInBackground(Void... params) {
			try {
				// Connect to the web site
				Document document = Jsoup.connect(url).get();
				// Using Elements to get the Meta data
				
				Elements description1 = document
						.select("div.contentBox");
				desc = description1.text();
				String abc=Character.toUpperCase(a.charAt(0))+a.substring(1);
				int x = desc.indexOf("What other drugs");
				int y = desc.indexOf("Google");
				desc1 = desc.substring(x,y);
			    
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// Set description into TextView
			
			//TextView txtdesc = (TextView) findViewById(R.id.desctxt);
			//txtdesc.setText(desc1);
			Intent intent=new Intent(Med_Info.this,What_is.class);
			intent.putExtra("drug", desc1);
			startActivity(intent);
			
			mProgressDialog.dismiss();
		}
}}