package com.apps.shrenoid.dropbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ScnActivity extends AppCompatActivity{
    Button btn;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    Fragment fragment;
    ImageView spot,unspot;
    ImageView[] dots;
    LinearLayout pager_indicator;
    Integer poscatch; //0->c,1->s
    ViewPager vpage;
    AdapterFragPager adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scn);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().hide();
        poscatch=(Integer)getIntent().getExtras().get("pos");

       // Integer entryvalue=(Integer)getIntent().getExtras().get("entrykey");
        vpage=(ViewPager)findViewById(R.id.container);
        pager_indicator = (LinearLayout) findViewById(R.id.dotsindicator);
        Animation bottomUp = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fragmentanim);
        adapter=new AdapterFragPager(getSupportFragmentManager());
        vpage.setAdapter(adapter);
        vpage.startAnimation(bottomUp);

        vpage.setVisibility(View.VISIBLE);
        vpage.setCurrentItem(poscatch);

        vpage.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < 2; i++) {
                    dots[i].setImageDrawable(getResources().getDrawable(R.drawable.unselecteddot));
                }

                dots[position].setImageDrawable(getResources().getDrawable(R.drawable.selecteddot));


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
//        Toast.makeText(getApplicationContext(),entryvalue+"",Toast.LENGTH_SHORT).show();

        dots=new ImageView[2];
        for(int i=0;i<2;i++){
            dots[i]=new ImageView(this);
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.unselecteddot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            params.setMargins(4, 0, 4, 0);

            pager_indicator.addView(dots[i], params);
        }

        if(poscatch==0){
            dots[poscatch].setImageDrawable(getResources().getDrawable(R.drawable.selecteddot));
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            //fragmentTransaction.setCustomAnimations(R.anim.fragmentanim,0);
            fragment=new FragCreateLay();
            fragmentTransaction.replace(R.id.container,fragment);
            fragmentTransaction.commit();

        }

       if(poscatch==1){
           dots[poscatch].setImageDrawable(getResources().getDrawable(R.drawable.selecteddot));
           fragmentManager = getSupportFragmentManager();
           fragmentTransaction=fragmentManager.beginTransaction();
           //fragmentTransaction.setCustomAnimations(R.anim.fragmentanim,0);
           fragment=new FragSignLay();
           fragmentTransaction.replace(R.id.container,fragment);
           fragmentTransaction.commit();
       }



    }

}
