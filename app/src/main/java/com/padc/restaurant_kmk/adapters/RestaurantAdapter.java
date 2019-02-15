package com.padc.restaurant_kmk.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padc.restaurant_kmk.R;
import com.padc.restaurant_kmk.delegates.RestaurantDelegate;
import com.padc.restaurant_kmk.views.items.RestaurantViewItem;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantViewItem> {

    private RestaurantDelegate mDelegate;
    public RestaurantAdapter(RestaurantDelegate delegate) {

        mDelegate=delegate;

    }

    @NonNull
    @Override
    public RestaurantViewItem onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.view_item_restaurant, viewGroup, false);
        return new RestaurantViewItem(view,mDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewItem restaurantViewItem, int i) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

}
