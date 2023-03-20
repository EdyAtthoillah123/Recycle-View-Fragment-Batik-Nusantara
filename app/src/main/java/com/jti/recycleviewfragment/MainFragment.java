package com.jti.recycleviewfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment implements RecyclerViewAdapter.ItemClickListener {
    private ArrayList<DataModel> list = new ArrayList<>();
    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_main, container, false);

        buildListData();
        initRecyclerView(view);
        return view;
    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list, this);
        recyclerView.setAdapter(adapter);
    }

    private void buildListData() {
        list.add(new DataModel("Batik Asmat"));
        list.add(new DataModel("Batik Kuwung"));
        list.add(new DataModel("Batik Jagatan Pisang"));
        list.add(new DataModel("Batik Kamoro"));
        list.add(new DataModel("Batik Keraton"));
        list.add(new DataModel("Batik Gentengan"));
        list.add(new DataModel("Batik Solo"));
        list.add(new DataModel("Batik Lasem"));
        list.add(new DataModel("Batik Gentongan"));
        list.add(new DataModel("Batik Benang Bintik"));
        list.add(new DataModel("Batik Sogan"));
        list.add(new DataModel("Batik Tidayu"));
    }

    @Override
    public void onItemClick(DataModel dataModel) {
        Fragment fragment = DetailFragment.newInstance(dataModel.getTitle());


        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        // transaction.replace(R.id.frame_container, fragment, "detail_fragment");

        transaction.hide(getActivity().getSupportFragmentManager().findFragmentByTag("main_fragment"));
        transaction.add(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}