package io.github.ziginsider.mycardstack;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ckenergy.stackcard.stackcardlayoutmanager.ItemTouchHelperCallBack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zigin on 03.06.2017.
 */

public class RecyclerViewCardStackAdapter extends RecyclerView.Adapter<RecyclerViewCardStackAdapter.TestViewHolder> implements ItemTouchHelperCallBack.onSwipListener {

    int[] mImgs = {R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4};

    @Override
    public void onSwip(RecyclerView.ViewHolder viewHolder, int position) {
        remove(position);
    }

    class Bean {
        int mPosition;
        int mImgRes;
    }

    List<Bean> cards = new ArrayList<>();

    RecyclerViewCardStackAdapter(int count) {
        for (int i = 0; count > i; ++i) {
            Bean card = new Bean();
            card.mPosition = i;
            card.mImgRes = mImgs[i% mImgs.length];
            cards.add(card);
        }
    }

    @Override
    public TestViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new TestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final TestViewHolder holder, final int position) {
        holder.top.setText(String.valueOf(cards.get(position).mPosition));
        holder.bottom.setText(String.valueOf(cards.get(position).mPosition));
        holder.img.setImageResource(cards.get(position).mImgRes);
        Log.d(this.getClass().getSimpleName(), "position:" + position);
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public void remove(int position) {
        cards.remove(position);
        notifyItemRemoved(position);
    }


    class TestViewHolder extends RecyclerView.ViewHolder {

        private TextView top;
        private TextView bottom;
        private ImageView img;

        TestViewHolder(View view) {
            super(view);
            top = (TextView) view.findViewById(R.id.top);
            bottom = (TextView) view.findViewById(R.id.bottom);
            img = (ImageView) view.findViewById(R.id.img);
        }
    }
}
