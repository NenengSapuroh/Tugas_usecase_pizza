package com.example.aplikasituntunandoawudhu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Tuntunandoawudhu extends Activity {
	ListView list1;
	String[] menu = new String[] { "Doa Pergelangan","Doa Berkumur","Doa Membasuh Hidung","Doa Membasuh Muka(niat)","Doa Membasuh Tangan Kanan","Doa Membasuh Tangan Kiri","Doa Membasuh Kepala","Doa Membasuh Telinga","Doa Membasuh dua Telapak Kaki","Doa Setelah Berwudhu","Kembali"};
	// Create an ArrayAdapter, that will actually make the Strings above
	// appear in the ListView
	// Menset nilai array ke dalam list adapater sehingga data pada array
	// akan dimunculkan dalam list


	/**
	 * Called when the activity is first created. Method ini akan dipanggil pada
	 * saat aplikasi dijalankan
	 */
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuntunandoawudhu);
        list1 = (ListView)findViewById(R.id.list);
        list1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));
        list1.setOnItemClickListener(new OnItemClickListener(){
        	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3){
        		Intent i = null;
        		if (position == 0){
        			i = new Intent(Tuntunandoawudhu.this, DoaPergelangan.class);}
        		else if(position == 1){
        			i = new Intent(Tuntunandoawudhu.this, Doaberkumur.class);}
        		else if(position == 2){
    				i = new Intent(Tuntunandoawudhu.this, Doamembasuhhidung.class);}
    			else if(position == 3){
    				i = new Intent(Tuntunandoawudhu.this, Doamembasuhmuka.class);}
    			else if(position == 4){
    				i = new Intent(Tuntunandoawudhu.this, Doakeduatangankanan.class);}
    			else if(position == 5){
    				i = new Intent(Tuntunandoawudhu.this, Doakeduatangankiri.class);}
    			else if(position == 6){
    				i = new Intent(Tuntunandoawudhu.this, Doamembasuhkepala.class);}
    			else if(position == 7){
    				i = new Intent(Tuntunandoawudhu.this, Doamembasuhtelinga.class);}
    			else if(position == 8){
    				i = new Intent(Tuntunandoawudhu.this, Doamembasuhkaki.class);}
    			else if(position == 9){
    				i = new Intent(Tuntunandoawudhu.this, DoaSetelahwudhu.class);}
    			else if(position == 10){
    				i = new Intent(Tuntunandoawudhu.this, MenuUtama.class);
    				finish();}
    			else{}
        	
        	startActivity(i);
        	}
        });}
	public void onBackPressed(){
		finish();
		System.exit(0);
		}
	}
		

