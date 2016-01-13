package navigationdrawer.arifhasnat.com.categorypagedetails.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import navigationdrawer.arifhasnat.com.categorypagedetails.R;

/**
 * Created by arifhasnat on 1/13/16.
 */
public class CategoryPageDetailsAdapter extends RecyclerView.Adapter<CategoryPageDetailsAdapter.ViewHolder> {

    private List<CategoryPageDetailsAdapter> mList;
    private Context mContext;


    public CategoryPageDetailsAdapter(List<CategoryPageDetailsAdapter> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(CategoryPageDetailsAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // this part is for view holder


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
