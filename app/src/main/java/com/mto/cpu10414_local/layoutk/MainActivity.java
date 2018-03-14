package com.mto.cpu10414_local.layoutk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.mto.cpu10414_local.layoutk.Entities.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


//    private RecyclerView rv;
    List<Person> persons;
    List<Person> persons1;
    List<Person> persons2;
    List<Person> persons3;
    private LinearLayout linearContent;
//    RVAdapter rvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addControls();
        addEvents();

        addNewRecyclerView(persons);


        addNewRecyclerView(persons1);
        addNewRecyclerView(persons2);

        addFooterLayout();
//        rv.setHasFixedSize(true);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//
//        rv.setLayoutManager(layoutManager);
//        rv.setAdapter(rvAdapter);

    }

    private void addFooterLayout() {
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View childView = layoutInflater.inflate(R.layout.footer, null);
        linearContent.addView(childView);
    }

    private void addNewRecyclerView(List<Person> values) {
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View childView = layoutInflater.inflate(R.layout.item_recyclerview, null);
        linearContent.addView(childView);

        RecyclerView rv = (RecyclerView) childView.findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        RVAdapter rvAdapter = new RVAdapter(values);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(rvAdapter);

    }

    private void addEvents() {

    }

    private void addControls() {
//        rv = (RecyclerView) findViewById(R.id.rv);
        linearContent = (LinearLayout) findViewById(R.id.content_linear);

        initializeData();
//        rvAdapter = new RVAdapter(persons);
    }

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData(){
        persons = new ArrayList<>();
        persons1 = new ArrayList<>();
        persons2 = new ArrayList<>();


        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.images));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.images));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.images));

        persons1.add(new Person("Emma Wilson 1", "23 years old", R.drawable.images));
        persons1.add(new Person("Lavery Maiss 1", "25 years old", R.drawable.images));
        persons1.add(new Person("Lillie Watts 1", "35 years old", R.drawable.images));

        persons2.add(new Person("Emma Wilson 2", "23 years old", R.drawable.images));
        persons2.add(new Person("Lavery Maiss 2", "25 years old", R.drawable.images));
        persons2.add(new Person("Lillie Watts 2", "35 years old", R.drawable.images));
    }
}
