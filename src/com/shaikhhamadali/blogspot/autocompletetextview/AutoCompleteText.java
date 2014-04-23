package com.shaikhhamadali.blogspot.autocompletetextview;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteText extends Activity{
	//declare controls
	AutoCompleteTextView tVAutoComplete;
	//variables
	// Array of cell phone companies names 
	String CellphoneCompanies[]={
			"LG", "Nexus", "Sony", "SonyEricson",
			"Qmobile", "Ainol", "Samsung",
			"Motorola", "HTC", "Iphone", 
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_auto_complete_text);
		//Initialize controls
		tVAutoComplete = (AutoCompleteTextView)findViewById(R.id.tVAutoComplete);
		//Set Adapter to AutoCompleteTextView 
		//you can use it using string array declared in strings.xml file
		/*uncomment me if you want to access Array from strings.xml file
		tVAutoComplete.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, R.array.CellphoneCompanies));*/
		//or using simply array declared in your activity
		tVAutoComplete.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, CellphoneCompanies));
	}
}
