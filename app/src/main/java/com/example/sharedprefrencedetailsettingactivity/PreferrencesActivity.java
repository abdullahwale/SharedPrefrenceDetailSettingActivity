package com.example.sharedprefrencedetailsettingactivity;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class PreferrencesActivity extends PreferenceActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addPreferencesFromResource(R.xml.preferrences_file);

    }
}
