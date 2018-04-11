package com.example.adityakumar.recipe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Lemonriceplay extends YouTubeBaseActivity {
        YouTubePlayerView youTubePlayerView;
        Button button;
        YouTubePlayer.OnInitializedListener onInitializedListener;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.lemonriceplay);button=(Button)findViewById(R.id.bn);
            youTubePlayerView = (YouTubePlayerView)findViewById(R.id.youtube_player_view);
            onInitializedListener=new YouTubePlayer.OnInitializedListener()  {
                @Override
                public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                    youTubePlayer.loadVideo("TQsVSncvM0g");
                }

                @Override
                public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                }
            };

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    youTubePlayerView.initialize(PlayerConfig.API_Key,onInitializedListener);
                }
            });


        }
    }

