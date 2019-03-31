package es.ulpgc.dayron.recycler.Advice;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.dayron.recycler.R;
import es.ulpgc.dayron.recycler.data.AdviceItem;

public class AdviceAdapter extends RecyclerView.Adapter<AdviceAdapter.ViewHolder> {

    private List<AdviceItem> itemList;
    private final View.OnClickListener clickListener;


    public AdviceAdapter(View.OnClickListener listener){

        itemList = new ArrayList();
        clickListener = listener;
    }
    public void addItem(AdviceItem item){
        itemList.add(item);
        notifyDataSetChanged();
    }
    public void  addItems(List<AdviceItem> items){
        itemList.addAll(items);
        notifyDataSetChanged();
    }
    public void setItems(List<AdviceItem> items){
        itemList =items;
        notifyDataSetChanged();
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        final TextView contentView;

        ViewHolder (View view){
            super(view);
            contentView = view.findViewById(R.id.contentView);

        }
    }
    @Override
    public int getItemCount(){return itemList.size();}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.advice_list_content, parent, false);
        return new ViewHolder(view);

    }
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position){
        holder.itemView.setTag(itemList.get(position));
        holder.itemView.setOnClickListener(clickListener);

        holder.contentView.setText(itemList.get(position).titulo);
    }


}
