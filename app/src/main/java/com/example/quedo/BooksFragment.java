package com.example.quedo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BooksFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_books, container, false);
        super.onCreate(savedInstanceState);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem("A Brief History of Time", "Stephen Hawking"));
        exampleList.add(new ExampleItem("A Brief History of Time", "Stephen Hawking"));
        exampleList.add(new ExampleItem("A Brief History of Time", "Stephen Hawking"));
        exampleList.add(new ExampleItem("A Vindication of the Rights of Woman", "Mary Wollstonecraft"));
        exampleList.add(new ExampleItem("A Vindication of the Rights of Woman", "Mary Wollstonecraft"));
        exampleList.add(new ExampleItem("A Vindication of the Rights of Woman", "Mary Wollstonecraft"));
        exampleList.add(new ExampleItem("Critique of Pure Reason", "Immanuel Kant"));
        exampleList.add(new ExampleItem("Critique of Pure Reason", "Immanuel Kant"));
        exampleList.add(new ExampleItem("Critique of Pure Reason", "Immanuel Kant"));
        exampleList.add(new ExampleItem("Critique of Pure Reason", "Immanuel Kant"));

        mRecyclerView = rootView.findViewById(R.id.bookRecycle);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;


    }
//    @Override
//    protected void onStart() {
//        super.onStart();
//
//        setContentView(R.layout.fragment_library);
//    }

}
