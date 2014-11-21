package com.ChrisPoncio.englishmuffin;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VocabMenu extends ListActivity {
	
	String words [] = {"Word1", "Word2", "Word3", "Word4", "Word5"};
	
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

	}

	
	

}
