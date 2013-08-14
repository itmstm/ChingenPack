package com.itmstm.ChingenPack;

import com.itmstm.ChingenPack.Chingen.ChingeActivity;
import com.itmstm.ChingenPack.ChingenPanic.MarugeActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * @author itmstm
 *
 */
public class ChingenPackActivity extends Activity {
	
    private static final String TAG = ChingenPackActivity.class.getSimpleName();;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		// main view s
        setContentView(R.layout.main);
    }
    
    /**
     * Chingenボタンが押されたときに呼ばれる
     * 
     * @param view
     */
    public void onChingenButtonPressed(View view) {
    	Log.d(TAG,  "Chingen ボタンが押された");
    	launchChingen();
    }
    
	/**
     * ChingenPanicボタンが押されたときに呼ばれる
     * 
     * @param view
     */
    public void onChingenPanicButtonPressed(View view) {
    	Log.d(TAG,  "Chingen Panicボタンが押された");
    	launchChingenPanic();
    }

	/**
	 *  Chingen Activityを起動
	 */
	private void launchChingen() {
		Intent i = new Intent( getApplicationContext(), ChingeActivity.class);
		startActivity(i);
	}

	/**
	 *  ChingenPanic Activityを起動
	 */
	private void launchChingenPanic() {
		Intent i = new Intent( getApplicationContext(), MarugeActivity.class);
		startActivity(i);
	}

}
