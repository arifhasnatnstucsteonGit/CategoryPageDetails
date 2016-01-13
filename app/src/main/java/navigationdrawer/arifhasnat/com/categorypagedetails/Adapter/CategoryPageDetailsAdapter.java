package navigationdrawer.arifhasnat.com.categorypagedetails.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

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
    public CategoryPageDetailsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CategoryPageDetailsAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
