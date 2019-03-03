package info.nightscout.androidaps.plugins.PumpOmnipod;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.squareup.otto.Subscribe;

import java.util.Objects;

import info.nightscout.androidaps.R;
import info.nightscout.androidaps.plugins.Common.SubscriberFragment;
import info.nightscout.androidaps.plugins.PumpVirtual.events.EventVirtualPumpUpdateGui;

public class OmnipodFragment extends SubscriberFragment {

    public OmnipodFragment() {
        // Required empty public constructor
    }

    public static OmnipodFragment newInstance() {
        return new OmnipodFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = Objects.requireNonNull(getActivity()).getIntent();
        if (intent != null) {

            Bundle extras = intent.getExtras();
            if (extras != null) {
                String address = extras.getString("omnipy_address");
                if (address != null) {
                    //
                }
            }
        }
    }

    @Subscribe
    public void onStatusEvent(final EventVirtualPumpUpdateGui ev) {
        updateGUI();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_omnipod, container, false);

//        View.OnClickListener onc = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        }

//        ((Button)view.findViewById(R.id.omnipy_btn_check_connection)).setOnClickListener(this.onClick(view));

        return view;
    }

    @Override
    protected void updateGUI() {

    }
}