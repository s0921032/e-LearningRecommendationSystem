package com.takanolab.mainview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainviewActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);
        
      //buttonを取得
        Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }
    
        //インターフェイスを実装 implements OnClickListener
        public void onClick(View v) {
        	
        	switch(v.getId()) {
	        	case R.id.button1 :
	        		Intent intent = new Intent(com.takanolab.mainview.MainviewActivity.this, jp.androidgroup.nyartoolkit.NyARToolkitAndroidActivity.class);
	        		startActivity(intent);
	        		break;
	        	case R.id.button2 :
	        		Intent intent2 = new Intent(com.takanolab.mainview.MainviewActivity.this, com.takanolab.recommendation.recommendationActivity.class);
	        		startActivity(intent2);
	        		break;
        	}
        }
    
}