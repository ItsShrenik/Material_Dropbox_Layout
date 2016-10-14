package com.apps.shrenoid.dropbox;

import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FragSignLay extends Fragment {
EditText lemail,lpass;
    TextView tvques;
    Button btnsign;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v1=inflater.inflate(R.layout.layoutlogin,container,false);
        lemail=(EditText) v1.findViewById(R.id.lemail);
        lpass=(EditText)v1.findViewById(R.id.lpass);
        btnsign=(Button) v1.findViewById(R.id.btnloginac);
        tvques=(TextView)v1.findViewById(R.id.lprblmtext);

        Animation LeftSwipe = AnimationUtils.loadAnimation(getContext(), R.anim.edittextanim);
        LeftSwipe.setStartOffset(530);
        lemail.startAnimation(LeftSwipe);

        Animation LeftSwipe1 = AnimationUtils.loadAnimation(getContext(), R.anim.edittextanim);
        LeftSwipe1.setStartOffset(560);
        lpass.startAnimation(LeftSwipe1);

        Animation LeftSwipe2= AnimationUtils.loadAnimation(getContext(), R.anim.edittextanim);
        LeftSwipe2.setStartOffset(580);
        tvques.startAnimation(LeftSwipe2);

        Animation animation3 = AnimationUtils.loadAnimation(getContext(), R.anim.btnbringfront);
        animation3.setStartOffset(600);
        btnsign.startAnimation(animation3);

        return v1;
    }
}
