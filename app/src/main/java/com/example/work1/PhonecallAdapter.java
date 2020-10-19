package com.example.work1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.List;

public class PhonecallAdapter extends RecyclerView.Adapter<PhonecallAdapter.ViewHolder> {
    private List<Phonecall> mPhonecallList;

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView phonecallText;
        TextView phonecallTime;

        public ViewHolder(View view) {
            super(view);
            phonecallText = (TextView) view.findViewById(R.id.phonecallText);
            phonecallTime = (TextView) view.findViewById(R.id.phonecallTime);
        }
    }

    public PhonecallAdapter(List<Phonecall> PhonecallList) {
        this.mPhonecallList = PhonecallList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.phonecall_item
                , parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Phonecall phonecall = mPhonecallList.get(position);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeFormat = sdf.format(phonecall.getPhonecallTime());
        holder.phonecallText.setText(phonecall.getPhonecallText());
        holder.phonecallTime.setText(timeFormat);
    }


    @Override
    public int getItemCount() {
        return mPhonecallList.size();
    }
}
