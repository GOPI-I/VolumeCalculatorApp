package com.example.volumecalculatorapp;

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

public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapesArrayList;
    Context context;

    public MyCustomAdapter( ArrayList<Shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item_layout, shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    private static class MyViewHolder{

        TextView shapeName;
        ImageView shapeImg;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Shape shapes = getItem(position);
        //infaltor
        MyViewHolder myViewHolder;

        if(convertView == null){
            //no view wentoff a screen -> create a new view
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );
            //finding view
            myViewHolder.shapeImg = (ImageView) convertView.findViewById(R.id.imageView);
            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(myViewHolder);

        }else {
            // a view wentoff screen -> reuse it
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        //getting data from shape class
        myViewHolder.shapeName.setText(shapes.getShapeName());
        myViewHolder.shapeImg.setImageResource(shapes.getShapeImg());

        return convertView;

    }
}
