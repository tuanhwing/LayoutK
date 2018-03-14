package com.mto.cpu10414_local.layoutk;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mto.cpu10414_local.layoutk.Entities.Person;

import java.util.List;

/**
 * Created by CPU10414-local on 3/14/2018.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {


    private List<Person> persons;

    public RVAdapter(List<Person> persons){
        this.persons = persons;
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        TextView personAge;
        ImageView personPhoto;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personAge = (TextView)itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.personName.setText(persons.get(position).getName());
        holder.personAge.setText(persons.get(position).getAge());
        holder.personPhoto.setImageResource(persons.get(position).getImage());
    }


    @Override
    public int getItemCount() {
        return persons.size();
    }
}
