package com.example.labo7_meseguer;


import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp = new MediaPlayer();
    Button playRain;
    Button playFarm;
    Button playStorm;
    Button playWind;
    Button playCity;
    Button playSea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MediaPlayer rain = MediaPlayer.create(this, R.raw.rain);
//        MediaPlayer storm = MediaPlayer.create(this, R.raw.storm);
//        MediaPlayer city = MediaPlayer.create(this, R.raw.city);
//        MediaPlayer farm = MediaPlayer.create(this, R.raw.farm);
//        MediaPlayer sea = MediaPlayer.create(this, R.raw.sea);
//        MediaPlayer wind = MediaPlayer.create(this, R.raw.wind);



        playRain = (Button) this.findViewById(R.id.play_rain);
        playRain.setOnClickListener(this::onClick);
        playStorm = (Button) this.findViewById(R.id.play_storm);
        playStorm.setOnClickListener(this::onClick);
        playCity = (Button) this.findViewById(R.id.play_city);
        playCity.setOnClickListener(this::onClick);
        playFarm = (Button) this.findViewById(R.id.play_farm);
        playFarm.setOnClickListener(this::onClick);
        playSea = (Button) this.findViewById(R.id.play_sea);
        playSea.setOnClickListener(this::onClick);
        playWind = (Button) this.findViewById(R.id.play_wind);
        playWind.setOnClickListener(this::onClick);

//        playRain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                rain.start();
//            }
//        });
//
//        playStorm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                storm.release();
//            }
//        });
//
//        playCity.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                city.release();
//            }
//        });
//
//        playFarm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                farm.release();
//            }
//        });
//
//        playSea.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                sea.release();
//            }
//        });
//
//        playWind.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                wind.release();
//            }
//        });
    }
    boolean Rain_Clicked = true;
    boolean Storm_Clicked = true;
    boolean Wind_Clicked = true;
    boolean Sea_Clicked = true;
    boolean Farm_Clicked = true;
    boolean City_Clicked = true;
    public void onClick(View v){
        if(mp!=null) {
            if(mp.isPlaying())
                mp.stop();
            mp.reset();
            mp.release();
            mp=null;
        }
        switch  (v.getId()){
            case R.id.play_rain:

                if(Rain_Clicked) {
                    playRain.setBackgroundColor(Color.parseColor("#88cbd1"));
                    Rain_Clicked = false;
                }
                else{
                    playRain.setBackgroundColor(Color.parseColor("#45a0a8"));
                    Rain_Clicked = true;
                }
                mp = MediaPlayer.create(this, R.raw.rain);
                break;
            case R.id.play_farm:
                if(Farm_Clicked) {
                    playFarm.setBackgroundColor(Color.parseColor("#a69a81"));
                    Farm_Clicked = false;
                }
                else{
                    playFarm.setBackgroundColor(Color.parseColor("#78653e"));
                    Farm_Clicked = true;
                }
                mp = MediaPlayer.create(this, R.raw.farm);
                break;
            case R.id.play_sea:
                if(Sea_Clicked) {
                    playSea.setBackgroundColor(Color.parseColor("#5e7dc4"));
                    Sea_Clicked = false;
                }
                else{
                    playSea.setBackgroundColor(Color.parseColor("#264a9e"));
                    Sea_Clicked = true;
                }
                mp = MediaPlayer.create(this, R.raw.sea);
                break;
            case R.id.play_storm:
                if(Storm_Clicked) {
                    playStorm.setBackgroundColor(Color.parseColor("#7c6899"));
                    Storm_Clicked = false;
                }
                else{
                    playStorm.setBackgroundColor(Color.parseColor("#4d3078"));
                    Storm_Clicked = true;
                }
                mp = MediaPlayer.create(this, R.raw.storm);
                break;
            case R.id.play_city:
                if(City_Clicked) {
                    playCity.setBackgroundColor(Color.parseColor("#b8707b"));
                    City_Clicked = false;
                }
                else{
                    playCity.setBackgroundColor(Color.parseColor("#7d2230"));
                    City_Clicked = true;
                }
                mp = MediaPlayer.create(this, R.raw.city);
                break;
            case R.id.play_wind:
                if(Wind_Clicked) {
                    playWind.setBackgroundColor(Color.parseColor("#79a882"));
                    Wind_Clicked = false;
                }
                else{
                    playWind.setBackgroundColor(Color.parseColor("#297538"));
                    Wind_Clicked = true;
                }
                mp = MediaPlayer.create(this, R.raw.wind);
                break;

            default:
                return;
        }
        mp.start();

    }




}