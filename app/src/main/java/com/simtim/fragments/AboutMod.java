/*
 * Copyright (C) 2018 PinkPipe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.simtim.fragments;

import org.schabi.newpipe.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import org.schabi.newpipe.settings.BasePreferenceFragment;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.preference.ListPreference;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceCategory;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.widget.Toolbar;

import org.schabi.newpipe.settings.SettingsActivity;

import me.jfenn.attribouter.Attribouter;

public class AboutMod extends AppCompatActivity implements PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Attribouter.from(this)
                .withFile(R.xml.about_mod)
                .show();
    }
      
    @Override
    public boolean onPreferenceStartFragment(PreferenceFragmentCompat caller, Preference pref) {
        Fragment fragment;
        fragment = Attribouter.from(this).withFile(R.xml.about_mod).toFragment(); 
        return false;   
}
