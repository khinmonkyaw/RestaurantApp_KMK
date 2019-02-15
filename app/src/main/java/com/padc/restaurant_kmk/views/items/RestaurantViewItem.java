package com.padc.restaurant_kmk.views.items;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.padc.restaurant_kmk.R;
import com.padc.restaurant_kmk.delegates.RestaurantDelegate;

public class RestaurantViewItem extends RecyclerView.ViewHolder {

    private RestaurantDelegate mDelegate;
    public RestaurantViewItem(@NonNull View itemView,RestaurantDelegate delegate) {
        super(itemView);
        mDelegate = delegate;

        Button button =itemView.findViewById(R.id.btn_view_detail);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDelegate.onTapViewDetail();
            }
        });

    }
}
