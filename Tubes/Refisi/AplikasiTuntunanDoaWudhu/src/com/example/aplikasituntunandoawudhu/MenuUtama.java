package com.example.aplikasituntunandoawudhu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MenuUtama extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutama);
        
        View Doawudhu = findViewById(R.id.button1); 
    	Doawudhu.setOnClickListener((OnClickListener) this);
    	View About = findViewById(R.id.button2); 
    	About.setOnClickListener((OnClickListener) this);
    	View Exit= findViewById(R.id.button3); 
    	Exit.setOnClickListener((OnClickListener) this);
    	    }

    public void onClick(View v) {
        switch (v.getId()) {
        
        case R.id.button1:
        	Intent menu = new Intent(this, Tuntunandoawudhu.class);
            startActivity(menu);
             break;
        case R.id.button2:
        	Intent menu3 = new Intent(this, about.class);
        	startActivity(menu3);
        	break;
                case R.id.button3:
        	AlertDialog.Builder mauKeluar = new AlertDialog.Builder(MenuUtama.this);
    		mauKeluar.setMessage("Aapakah yakin anda ingin keluar ?").setCancelable(false)
    		.setPositiveButton("YA",new AlertDialog.OnClickListener(){
    			
    			public void onClick(DialogInterface arg0,int arg1){
    				Intent exit = new Intent (Intent.ACTION_MAIN);
    				exit.addCategory(Intent.CATEGORY_HOME);
    				exit.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
    				startActivity(exit);
    			}
    		})
    		.setNegativeButton("TIDAK",new AlertDialog.OnClickListener(){
    			
    			public void onClick(DialogInterface dialog,int arg1){
    			dialog.cancel();
    			}	
    		});
    		AlertDialog judul = mauKeluar.create();
    		judul.setTitle("Keluar ?");
    		judul.show();
        }
    }
}