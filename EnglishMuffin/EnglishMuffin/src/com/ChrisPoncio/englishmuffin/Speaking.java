package com.ChrisPoncio.englishmuffin;

import java.util.Locale;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Speaking extends Activity implements OnClickListener {

	//static final String[] words = { "Available", "Available", "Available" };
	TextToSpeech tts;
	String gotBread;
	TextView word,definition;
	

	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selection);
		Button b = (Button) findViewById(R.id.voice);
		b.setOnClickListener(this);
		tts = new TextToSpeech(Speaking.this,
				new TextToSpeech.OnInitListener() {

					@Override
					public void onInit(int status) {
						// TODO Auto-generated method stub

						if (status != TextToSpeech.ERROR) {
							tts.setLanguage(Locale.US);
						}

					}
				});
		started();
		
		Bundle getBundle = getIntent().getExtras();
		gotBread = getBundle.getString("key");
		word.setText(gotBread);
	}
	
	
	

	private void started() {
		// TODO Auto-generated method stub
		
		word= (TextView)findViewById(R.id.firstWord);
		
		
	}




	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		if (tts != null) {
			tts.stop();
			tts.shutdown();
		}
		super.onPause();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//Random temp = new Random();
		String word1 = gotBread;//words[temp.nextInt(3)];
		tts.speak(word1, TextToSpeech.QUEUE_FLUSH, null);
	}

}
