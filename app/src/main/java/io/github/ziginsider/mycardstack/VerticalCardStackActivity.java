package io.github.ziginsider.mycardstack;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.ckenergy.stackcard.stackcardlayoutmanager.StackCardLayoutManager;
import com.ckenergy.stackcard.stackcardlayoutmanager.StackCardPostLayout;

public class VerticalCardStackActivity extends BaseCardStackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

        StackCardLayoutManager stackCardLayoutManager =
                new StackCardLayoutManager
                        (StackCardLayoutManager.VERTICAL,
                        false,
                        new StackCardPostLayout());
        stackCardLayoutManager.setStackOrder(StackCardLayoutManager.OUT_STACK_ORDER);
        stackCardLayoutManager.setNumberOrder(StackCardLayoutManager.NEGATIVE_ORDER);
        RecyclerViewCardStackAdapter adapter = new RecyclerViewCardStackAdapter(20);

        initRecyclerView(recyclerView, stackCardLayoutManager, adapter);
    }
}
