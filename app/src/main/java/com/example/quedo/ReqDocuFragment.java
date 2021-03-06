package com.example.quedo;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ReqDocuFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_req_docu, container, false);
        super.onCreate(savedInstanceState);

        Spinner docTypeSpin = (Spinner) rootView.findViewById(R.id.docTypeEdit);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(ReqDocuFragment.this.getActivity(), R.array.docTypeSpin,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        docTypeSpin.setAdapter(staticAdapter);

        Button btnSubmit = (Button)rootView.findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.req_suc, container, false);
                Toast toast = new Toast(ReqDocuFragment.this.getActivity());
                toast.setGravity(Gravity.FILL, 0, 0);
                toast.setView(layout); //inflated view
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });

        return rootView;


    }

}
