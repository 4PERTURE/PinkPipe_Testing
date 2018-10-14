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
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.simtim.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import me.jfenn.attribouter.Attribouter;

import static me.jfenn.attribouter.Attribouter.*;

public class AboutMod extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Attribouter attribouter;
        attribouter = from(getActivity());
        Attribouter.from(getActivity()).withFile(R.xml.about_mod);
        Attribouter.from(getActivity()).show();
=======
import android.support.v7.preference.ListPreference;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceScreen;
import android.support.v7.preference.Preference.OnPreferenceChangeListener;
import android.support.v14.preference.SwitchPreference;
import android.provider.Settings;
import org.schabi.newpipe.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.schabi.newpipe.BuildConfig;
import org.schabi.newpipe.R;
import org.schabi.newpipe.util.NavigationHelper;
import org.schabi.newpipe.util.ThemeHelper;
import org.schabi.newpipe.util.Constants;
import android.support.annotation.Nullable;

import org.schabi.newpipe.settings.BasePreferenceFragment;

public class AboutMod extends BasePreferenceFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
    //    super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.about_mod);
        
>>>>>>> parent of da8132b4... Initial About Mod page
    }

    /**@Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    final Attribouter attribouter;
    attribouter = from(getActivity());
    from(getActivity()).withFile(R.xml.about_mod);
    from(getActivity()).show();

    }**/


    /** @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Attribouter.from(this)
    .withFile(R.xml.about_mod)
    .show();
    }**/
}
