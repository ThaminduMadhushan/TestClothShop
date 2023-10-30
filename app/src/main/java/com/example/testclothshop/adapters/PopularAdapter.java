//package com.example.testclothshop.adapters;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.constraintlayout.widget.ConstraintLayout;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.testclothshop.R;
//import com.example.testclothshop.domain.ClothDomain;
//
//import java.util.ArrayList;
//
//public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
//
//    ArrayList<ClothDomain> ClothDomains;
//
//    public PopularAdapter(ArrayList<ClothDomain> ClothDomains) {
//        this.ClothDomains = ClothDomains;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular, parent, false);
//        return new ViewHolder(inflate);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.popularName.setText(ClothDomains.get(position).getTitle());
//        String picUrl = "";
//        switch (position) {
//            case 0: {
//                picUrl = "1";
//                break;
//            }
//            case 1: {
//                picUrl = "2";
//                break;
//            }
//            case 2: {
//                picUrl = "3";
//                break;
//            }
//            case 3: {
//                picUrl = "4";
//                break;
//            }
//        }
//        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable", holder.itemView.getContext().getPackageName());
//        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.popularPic);
//    }
//
//    @Override
//    public int getItemCount() {
//        return PoplarDomains.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//
//        TextView popularName;
//        ImageView popularPic;
//        ConstraintLayout mainLayout;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            popularName = itemView.findViewById(R.id.popularName);
//            popularPic = itemView.findViewById(R.id.popularPic);
//            mainLayout = itemView.findViewById(R.id.mainLayout);
//        }
//
//    }
//}
