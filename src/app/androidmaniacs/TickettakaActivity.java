package app.androidmaniacs;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class TickettakaActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    ImageButton ib1,ib2,ib3,ib4,ib5,ib6;
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    String idioma;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ib1 = (ImageButton) findViewById(R.id.spa);
        ib1.setOnClickListener(this);
       
        //tv1 = (TextView) findViewById(R.id.idiomaesp);
        
        ib2 = (ImageButton) findViewById(R.id.cat);
        ib2.setOnClickListener(this);
   
        //tv2 = (TextView) findViewById(R.id.idiomacat);

        ib3 = (ImageButton) findViewById(R.id.eng);
        ib3.setOnClickListener(this);
        
        //tv3 = (TextView) findViewById(R.id.idiomaeng);

        ib4 = (ImageButton) findViewById(R.id.ita);
        ib4.setOnClickListener(this);
       
        //tv4 = (TextView) findViewById(R.id.idiomaita);
        
        ib5 = (ImageButton) findViewById(R.id.ger);
        ib5.setOnClickListener(this);
    
        //tv5 = (TextView) findViewById(R.id.idiomager);
        
        ib6 = (ImageButton) findViewById(R.id.frc);
        ib6.setOnClickListener(this);
       
        //tv6 = (TextView) findViewById(R.id.idiomafrc);
       
    }
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

}