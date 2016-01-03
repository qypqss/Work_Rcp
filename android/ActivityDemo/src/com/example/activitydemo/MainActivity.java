package com.example.activitydemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG","start onCreate");
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
    @Override
    protected void onStart(){
    	super.onStart();
    	Log.e("TAG","start onStart");
    }
    
    @Override
    protected void onRestart(){
    	super.onRestart();
    	Log.e("TAG","start onRestart");
    }
    
    @Override
    protected void onResume(){
    	super.onResume();
    	Log.e("TAG","start onResume");
    }
    
    @Override
    protected void onPause(){
    	super.onPause();
    	Log.e("TAG","start onPause");
    }
    @Override  
    protected void onStop() {  
        super.onStop();  
        Log.e("TAG", "start onStop~~~");  
    }
    @Override  
    protected void onDestroy() {  
        super.onDestroy();  
        Log.e("TAG", "start onDestroy~~~");  
    }  
}
