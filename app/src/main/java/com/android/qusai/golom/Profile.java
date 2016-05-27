package com.android.qusai.golom;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by qusai on 5/27/16.
 */
public class Profile extends ListActivity{

String [] menuList ={"Home", "Calender","Overview","Groups", "Lists","Profile","Timeline","   Settings","   Logout"};
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, menuList));
}

}
