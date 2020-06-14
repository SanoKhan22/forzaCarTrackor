package com.Sano.forzacartrackor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class movieAdapter  extends ArrayAdapter<mvDT> {

    public movieAdapter(@NonNull Context context, int resource, @NonNull ArrayList<mvDT> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rtVIew  = convertView;

        if(rtVIew == null ){
            rtVIew = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout,parent,false);
        }

            mvDT itemData = getItem(position);

        TextView movieTitle,movieRD,movieRating,numofitem;
        ImageView movieImageView;

        numofitem = rtVIew.findViewById(R.id.numofitem);
        movieTitle = rtVIew.findViewById(R.id.movieTitle);
        movieRD = rtVIew.findViewById(R.id.movieReleaseDate);
        movieRating = rtVIew.findViewById(R.id.movieRating);
        movieImageView = rtVIew.findViewById(R.id.movieImage);


        numofitem.setText(Integer.toString(position+1));
        movieTitle.setText(itemData.getMovieTitle());
        movieRD.setText(itemData.getMovieRD());
        movieRating.setText(itemData.getMovieRating());
        movieImageView.setImageResource(itemData.getMoviePosterPath());



        return rtVIew;
    }
}
