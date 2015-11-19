package com.example.hellomoon;

import android.media.MediaPlayer;

public class AudioPalyer 
{
	private MediaPlayer mPlayer;
	
	public void stop() {
		if (mPlayer != null) {
			mPlayer.relase();
			mPlayer = null;
		}
	}
	
	public void play(Context c) {
		stop();
		
		mPlayer = MediaPlayer.create(c,raw.one_small_step);
		
		mPlayer.setOnCompletionListiner(new MediaPlayer.OnCompletionListener() {
			public void onCompletion(MediaPlayer mp) {
				
			}
		});
		
		mPlayer.start();
	}
}
