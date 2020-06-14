package com.Sano.forzacartrackor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class movieDetailActivity extends AppCompatActivity {
    TextView movieTitle,movieRD,movieRating,storyline;
    ImageView movieImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        movieTitle = findViewById(R.id.movieTitle);
        movieRD = findViewById(R.id.movieReleaseDate);
        movieRating = findViewById(R.id.movieRating);
        storyline = findViewById(R.id.stroyline);
        movieImageView = findViewById(R.id.movieImage);

        movieTitle.setText(getIntent().getStringExtra("title"));
        movieRD.setText(getIntent().getStringExtra("RD"));
        movieRating.setText(getIntent().getStringExtra("Rating"));
        storyline.setText(getIntent().getStringExtra("StoryLine"));
       movieImageView.setImageResource((getIntent().getIntExtra("MP", (int) R.drawable.aston)));

    }
}
