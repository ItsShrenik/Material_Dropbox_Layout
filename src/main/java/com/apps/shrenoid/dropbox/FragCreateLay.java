package com.apps.shrenoid.dropbox;

import android.support.annotation.Nullable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

public class FragCreateLay extends Fragment {
    EditText name,lastname,email,password;
    Button btncreate;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.layoutcreateac,container,false);
        name=(EditText)v.findViewById(R.id.cfstname);
        lastname=(EditText)v.findViewById(R.id.clstname);
        email=(EditText)v.findViewById(R.id.cemail);
        password=(EditText)v.findViewById(R.id.cpass);
        btncreate=(Button)v.findViewById(R.id.btncreateac);

        Animation LeftSwipe1 = AnimationUtils.loadAnimation(getContext(), R.anim.edittextanim);

        LeftSwipe1.setStartOffset(530);
        name.startAnimation(LeftSwipe1);

        Animation LeftSwipe2 = AnimationUtils.loadAnimation(getContext(), R.anim.edittextanim);
        LeftSwipe2.setStartOffset(560);
        lastname.startAnimation(LeftSwipe2);

        Animation LeftSwipe3 = AnimationUtils.loadAnimation(getContext(), R.anim.edittextanim);
        LeftSwipe3.setStartOffset(590);
        email.startAnimation(LeftSwipe3);

        Animation LeftSwipe4 = AnimationUtils.loadAnimation(getContext(), R.anim.edittextanim);
        LeftSwipe4.setStartOffset(640);
        password.startAnimation(LeftSwipe4);

        Animation animation3 = AnimationUtils.loadAnimation(getContext(), R.anim.btnbringfront);
        animation3.setStartOffset(630);
       btncreate.startAnimation(animation3);


        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
