package com.ChrisPoncio.englishmuffin;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VocabMenu extends ListActivity {
	
	//String [] words = new String [5];
	
	String words [] = {"Available", "Thanksgiving", "Miserable", "Enhance", "Cough"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(VocabMenu.this, android.R.layout.simple_list_item_1, words));
		
		}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		//new code
		String choice = words[position];
		Bundle bundle = new Bundle();
		bundle.putString("key", choice);
		//end new code
		try {
			Class ourClass = Class.forName("com.ChrisPoncio.englishmuffin.Speaking");
		
		Intent a = new Intent (VocabMenu.this, ourClass);
		a.putExtras(bundle); //part of new code
		startActivity(a);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
