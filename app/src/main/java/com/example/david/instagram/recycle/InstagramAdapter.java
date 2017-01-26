package com.example.david.instagram.recycle;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.david.instagram.R;

import java.util.List;

/**
 * Created by David on 1/18/17.
 */

public class InstagramAdapter extends RecyclerView.Adapter<InstagramAdapter.MyViewHolder> {

    private List<Model> modelList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView username, location, body, numbersOfLikes, numbersOfComments;

        public MyViewHolder(View view) {
            super(view);
            username = (TextView) view.findViewById(R.id.user_name);
            location = (TextView) view.findViewById(R.id.location);
            body = (TextView) view.findViewById(R.id.text_view3);
            numbersOfLikes = (TextView) view.findViewById(R.id.text_view1);
            numbersOfComments = (TextView) view.findViewById(R.id.text_view2);

        }
    }

    public InstagramAdapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Model model = modelList.get(position);
        holder.username.setText(model.getUsername());
        holder.location.setText(model.getLocation());
        holder.body.setText(model.getBody());
        holder.numbersOfLikes.setText(model.getNumberOfLikes());
        holder.numbersOfComments.setText(model.getNumberOfComments());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
