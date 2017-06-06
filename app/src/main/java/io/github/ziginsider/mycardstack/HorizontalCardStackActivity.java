package io.github.ziginsider.mycardstack;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.ckenergy.stackcard.stackcardlayoutmanager.StackCardLayoutManager;
import com.ckenergy.stackcard.stackcardlayoutmanager.StackCardPostLayout;

public class HorizontalCardStackActivity extends BaseCardStackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

        StackCardLayoutManager stackCardLayoutManager = new StackCardLayoutManager(StackCardLayoutManager.HORIZONTAL,
                false,
                new StackCardPostLayout());
        RecyclerViewCardStackAdapter adapter = new RecyclerViewCardStackAdapter(20);

        initRecyclerView(recyclerView,stackCardLayoutManager, adapter);

        Log.d(getClass().getSimpleName(),stackCardLayoutManager.getStackOrder()+"");
    }
}
