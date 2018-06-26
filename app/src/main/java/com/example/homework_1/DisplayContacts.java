package com.example.homework_1;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DisplayContacts extends AppCompatActivity {

    ArrayList<Contact> contacts = MainActivity.contacts;
    ArrayAdapter<Contact> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contacts);
        setTitle("Contacts (" + MainActivity.contacts.size() + ")");

        adapter = new ContactAdapter(this, android.R.layout.activity_list_item, contacts);

//        setListAdapter(adapter);
    }
}
