package a2room.recyclerview;

import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    private TextView itemTextView;
    public ItemViewHolder(View itemText) {
        super(itemText);
        itemTextView = (TextView) itemText.findViewById(R.id.list_items);
//        this.itemTextView = itemTextView;
    }

    public void bind(int index) {
        itemTextView.setText(String.valueOf(index));
    }
}
