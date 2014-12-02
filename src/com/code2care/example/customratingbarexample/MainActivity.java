package com.code2care.example.customratingbarexample;


import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;


public class MainActivity extends Activity {
	
	
	RatingBar ratingBar;
	TextView rateMessage;
	String ratedValue;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        ratingBar = (RatingBar) findViewById(R.id.ratingBar1);
		rateMessage = (TextView) findViewById(R.id.ratingMessage);

		ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {

			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating,
					boolean fromUser) {
				
				System.out.println("Hwre");

				ratedValue = String.valueOf(ratingBar.getRating());
				rateMessage.setText("Rating : "
						+ ratedValue + "/5");

			}
		});
        
    }
   
    
  
}
