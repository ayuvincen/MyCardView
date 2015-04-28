package com.mycardview;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {
	RecyclerView recyclerView;
	ArrayList<DataSource> data = new ArrayList<DataSource>();
	
	String[] nameTexts = {
			"Ant", "Butterfly", "Camel", "Cat", "Cow",
			"Crab","Deer", "Dog", "Elephant", "Flamigo",
			"Frog", "Hare", "Lizard", "Owl", "Rooster",
			"Toucan", "Turtle"
			
	};
	
	String[] latinNameTexts = {
			"Solenopsis mandibularis", "Antocharis cardamines", "Camelus dromedarius", "Felis catus", "Bos taurus",
			"Liocarcinus vernalis", "Cervus elaphus", "Canis lupus", "Elephas maximus", "Phoenicopterus roseus",
			"Rana temporaria", "Lepus timidus", "Pogona vitticeps", "Athene noctua", "Gallus domesticus", 
			"Pteroglossus torquatus", "Terrapene carolina"
	};
	
	String[] images = {
			"ant", "butterfly","camel", "cat", "cow",
			"crab", "deer", "dog", "elephant", "flamingo",
			"frog", "hare", "lizard", "owl", "rooster",
			"toucan", "turtle"
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		recyclerView  = (RecyclerView)findViewById(R.id.cardList);
		
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, getAllAnimal());
		recyclerView.setAdapter(customAdapter);		
		recyclerView.setItemAnimator(new DefaultItemAnimator());
	}

	
	public ArrayList<DataSource> getAllAnimal(){	
		 for(int i=0;i<nameTexts.length;i++){
			 data.add(new DataSource(nameTexts[i], latinNameTexts[i], images[i]));
	     }
	    
		return data;
	}

	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
