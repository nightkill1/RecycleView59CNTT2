package com.example.recycleview59cntt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.model.product;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private class ProductViewHodel extends RecyclerView.ViewHolder
    {
        TextView txtName;
        TextView txtPrice;
        TextView txtDesc;
        ImageView imvAddToCart;
        product product;
        public ProductViewHodel(@NonNull View itemView) {
            super(itemView);
            txtName = this.itemView.findViewById(R.id.txtNamePr);
            txtPrice = this.itemView.findViewById(R.id.txtPricePr);
            txtDesc = this.itemView.findViewById(R.id.txtDes);
            imvAddToCart = this.itemView.findViewById(R.id.imvgiohang);
        }
        public void bind(product p)
        {
            this.product = p;
            txtName.setText(p.getName());
            txtPrice.setText(new Integer(p.getPrice()).toString());
            txtDesc.setText(p.getDesc());

        }
    }
    private class Adater extends RecyclerView.Adapter<ProductViewHodel>
    {
        List<product> dsSP;

        public Adater(List<product> dsSP) {
            this.dsSP = dsSP;

        }

        @NonNull
        @Override
        public ProductViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.product, parent, false);
            return new ProductViewHodel(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ProductViewHodel holder, int position) {
            holder.bind(dsSP.get(position));
        }

        @Override
        public int getItemCount() {
            return dsSP.size();
        }
    }
}
