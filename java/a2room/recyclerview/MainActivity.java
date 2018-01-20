package a2room.recyclerview;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_LIST_ITEMS = 10;
    private Adapter mAdapter;
    private RecyclerView mListItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListItems = (RecyclerView) findViewById(R.id.recycler_view_layout);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mListItems.setLayoutManager(layoutManager);
        mListItems.setBackgroundColor(Color.BLUE);

        mListItems.setHasFixedSize(true);

        mAdapter = new Adapter(NUM_LIST_ITEMS);

        mListItems.setAdapter(mAdapter);

        ActionBar bar = this.getActionBar();
    }
}
