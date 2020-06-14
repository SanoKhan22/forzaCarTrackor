package com.Sano.forzacartrackor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.facebook.ads.*;
import android.widget.Button;
import android.widget.LinearLayout;

import com.facebook.ads.AudienceNetworkAds;

public class Parent extends AppCompatActivity {
  private   Button intro_horizonic, explorecars,moreApps,controls;

  //intestial
    private InterstitialAd interstitialAd;

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);

        // Initialize the Audience Network SDK
        AudienceNetworkAds.initialize(this);

        //intestial ads units
        interstitialAd = new InterstitialAd(this, "2715643862005093_2724677344435078");


        adView = new AdView(this, "2715643862005093_2715644398671706", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();

        // listner fb intes
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {

            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {
                interstitialAd.show();

            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        });


// introduction Button
        intro_horizonic = (Button) findViewById(R.id.intro_horizonic);
        intro_horizonic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Parent.this, introduction.class);
                startActivity(intent);
            }
        });


        //explore cars horizon cars tracker

        explorecars = (Button) findViewById(R.id.explore_cars);
        explorecars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cars = new Intent(Parent.this, MainActivity.class);
                startActivity(cars);

                //fb ad
                interstitialAd.loadAd();
            }
        });

        //Game Controls
        controls = (Button) findViewById(R.id.forza_control);
        controls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Parent.this, Controls.class);
                startActivity(intent);
            }
        });




        //Rate This app
        moreApps = (Button) findViewById(R.id.moreApps);
        moreApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Sano.K")));
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://search?q=pub:Sano.K"));
                Parent.this.startActivity(intent);
            }
        });




    }
    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}


