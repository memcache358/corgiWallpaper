package com.example.vince.corgiwallpaper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CorgiImageAdapter extends RecyclerView.Adapter<CorgiImageAdapter.ViewHolder> {

    private List<CorgiImage> mCorgiImageList;

    public CorgiImageAdapter(List<CorgiImage> corgiImageList){
        mCorgiImageList = corgiImageList;
    }

    //usually involves inflating a layout from XML and return the holder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View corgiRowView = inflater.inflate(R.layout.corgi_row, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(corgiRowView);
        return viewHolder;
    }

    //involves populating data into the item through holder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        CorgiImage corgiImage = mCorgiImageList.get(position);

        TextView textView = viewHolder.mTextView;
        textView.setText(corgiImage.getDescription());

    }

    @Override
    public int getItemCount() {
        return mCorgiImageList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public Button mButton;
        public TextView mTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           mImageView = itemView.findViewById(R.id.mImageView);
           mButton = itemView.findViewById(R.id.mButton);
           mTextView = itemView.findViewById(R.id.mTextView);
        }
    }
}
