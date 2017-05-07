/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.justmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView searchMusic = (TextView) findViewById(R.id.search_music);
        TextView nativeMusic = (TextView) findViewById(R.id.native_music);
        TextView onlineMusic = (TextView) findViewById(R.id.online_music);
        TextView playingMusic = (TextView) findViewById(R.id.playing_music);

        // Set a click listener on that View
        searchMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchMusicIntent = new Intent(MainActivity.this, searchMusicActivity.class);
                startActivity(searchMusicIntent);
            }
        });
        nativeMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nativeMusicIntent = new Intent(MainActivity.this, nativeMusicActivity.class);
                startActivity(nativeMusicIntent);
            }
        });
        onlineMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent onlineMusicIntent = new Intent(MainActivity.this, onlineMusicActivity.class);
                startActivity(onlineMusicIntent);
            }
        });
        playingMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingMusicIntent = new Intent(MainActivity.this, playingMusicActivity.class);
                startActivity(playingMusicIntent);
            }
        });
    }
}
