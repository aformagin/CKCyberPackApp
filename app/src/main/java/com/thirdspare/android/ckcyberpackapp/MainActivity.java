package com.thirdspare.android.ckcyberpackapp;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import static com.thirdspare.android.ckcyberpackapp.R.id.container;


public class MainActivity extends AppCompatActivity {
    Fragment homeFragment = new HomeFragment();
    Fragment delphiFragment = new DelphiFragment();
    Fragment tbaFragment = new TBAFragment();
    private TextView mTextMessage;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                   // mTextMessage.setText(R.string.title_home);
                    getFragmentManager().beginTransaction()
                    .show(homeFragment)
                    .commit();
                    return true;
                case R.id.navigation_delphi:
                   // mTextMessage.setText(R.string.title_delphi);
                    getFragmentManager().beginTransaction()
                            .show(delphiFragment)
                            .hide(homeFragment)
                            .commit();

                    return true;
                case R.id.navigation_notifications:
                   // mTextMessage.setText(R.string.title_tba);
                    getFragmentManager().beginTransaction()
                            .show(tbaFragment)
                            .hide(homeFragment)
                            .hide(delphiFragment)
                            .commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        if (savedInstanceState == null){
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(container, homeFragment);

            ft.add(container, delphiFragment);
            ft.hide(delphiFragment);

            ft.add(container, tbaFragment);
            ft.hide(tbaFragment);
            ft.commit();
      }
    }

}
