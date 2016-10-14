package com.apps.shrenoid.dropbox;


import android.content.Intent;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

public class FragHomeLay extends Fragment implements View.OnClickListener{

    Button btncreateac,btnsignin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.layouthome,container,false);
        btncreateac=(Button)v.findViewById(R.id.btncac);
        btnsignin=(Button)v.findViewById(R.id.btnsignin);
        btnsignin.setOnClickListener(this);
        btncreateac.setOnClickListener(this);
        RelativeLayout laydiff=(RelativeLayout)v.findViewById(R.id.diffline);

        Animation animatepart2=AnimationUtils.loadAnimation(getContext(),R.anim.btnbringfront);
        animatepart2.setDuration(600);
        animatepart2.setStartOffset(650);
        btncreateac.startAnimation(animatepart2);
        btnsignin.startAnimation(animatepart2);
        laydiff.startAnimation(animatepart2);


        return v;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btncac:
                Intent in=new Intent(getContext(),ScnActivity.class);
                in.putExtra("pos",0);
                startActivity(in);



                break;

            case R.id.btnsignin:
                Intent in1=new Intent(getContext(),ScnActivity.class);
                in1.putExtra("pos",1);
                startActivity(in1);
                break;
        }
    }
}
/*
* Animation bottomUp = AnimationUtils.loadAnimation(getContext(),
                        R.anim.fragmentanim);
                ViewGroup hiddenPanel = (ViewGroup)v.getParent();
                hiddenPanel.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                hiddenPanel.startAnimation(bottomUp);
                hiddenPanel.setVisibility(View.VISIBLE);*/