package com.mycardview;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

	private ArrayList<DataSource> dataSource;
	
	private Context 		context;
	
	public CustomAdapter (Context context, ArrayList<DataSource> dataSource) {
		this.context=context;
		this.dataSource = dataSource;
	}
	

	public static class ViewHolder extends RecyclerView.ViewHolder {
		TextView nameTextView;
		TextView latinNameTextView;
		ImageView imageView;
		
		public ViewHolder(View itemView) {
			super(itemView);
			nameTextView 		= (TextView)itemView.findViewById(R.id.nameTextView);
            latinNameTextView 	= (TextView)itemView.findViewById(R.id.latinNameTextView);
            imageView			= (ImageView)itemView.findViewById(R.id.animalImageView);
			
		}
	}

	@Override
	public int getItemCount() {
		return dataSource.size();
	}

	@Override
	public void onBindViewHolder(ViewHolder viewHolder, int position) {
		viewHolder.nameTextView.setText(dataSource.get(position).getNameText());
		viewHolder.latinNameTextView.setText(dataSource.get(position).getLatinNameText());
		
        String uri = dataSource.get(position).getImage();
        int imageResource = context.getResources().getIdentifier(uri, "drawable", context.getPackageName());
   		Drawable image = ContextCompat.getDrawable(context, imageResource);
		viewHolder.imageView.setImageDrawable(image);
		
	}

	@Override
	public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		//create a new view
		View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
		
		//create ViewHolder
		ViewHolder viewHolder = new ViewHolder(itemView);
		return viewHolder;
		
	}
	
	
}