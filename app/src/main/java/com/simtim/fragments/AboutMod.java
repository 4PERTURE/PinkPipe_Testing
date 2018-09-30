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

import org.schabi.newpipe.R;
import android.os.Bundle;
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
        Attribouter.from(getActivity()).withFile(Integer.parseInt(String.valueOf((R.xml.about_mod))));
        Attribouter.from(getActivity()).show();
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
