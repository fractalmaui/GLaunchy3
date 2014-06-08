/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.frak.glaunchy.opengl;

import com.frak.glaunchy.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.lang.Runnable;

/**
 * Activity showing an options menu to stop the {@link OpenGlService}.
 */
public class MenuActivity extends Activity {

    private final Handler mHandler = new Handler();

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        openOptionsMenu();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.opengl_livecard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection.
    	//DHS DUH switch (item.getItemId()) {
            //DHS DUH case R.id.stop:
                // Stop the service at the end of the message queue for proper options menu
                // animation. This is only needed when starting a new Activity or stopping a Service
                // that published a LiveCard.
      //DHS DUH     mHandler.post(new Runnable() {

      //DHS DUH     @Override
      //DHS DUH     public void run() {
                    	//Clobber openGL surfaceview here, use finish?
                    //    stopService(new Intent(MenuActivity.this, OpenGlService.class));
      //DHS DUH     }
      //DHS DUH });
      //DHS DUH return true;
      //DHS DUH default:
      //DHS DUH return super.onOptionsItemSelected(item);
      //DHS DUH }
    	return true;
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        // Nothing else to do, closing the Activity.
        finish();
    }
}
