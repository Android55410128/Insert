package app.lap.sql_ruttiporn128;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btn_insert, btn_show;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		DB128tuy db128tuy = new DB128tuy(this);
		db128tuy.getWritableDatabase();
		
		btn_insert = (Button) findViewById(R.id.btninsert);
		btn_insert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==btn_insert){
					Intent add = new Intent(MainActivity.this,AddActivity.class);
					startActivity(add);
					
				}
			}
		});

	
}
}
