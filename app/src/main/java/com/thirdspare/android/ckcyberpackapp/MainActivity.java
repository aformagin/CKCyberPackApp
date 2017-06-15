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
    Fragment TestFrag = new TestFrag();
    Fragment MysticalFrag = new MysticalFrag();
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    getFragmentManager().beginTransaction()
                    .show(TestFrag)
                    .commit();
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    getFragmentManager().beginTransaction()
                            .show(MysticalFrag)
                            .hide(TestFrag)
                            .commit();

                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    getFragmentManager().beginTransaction()
                            .hide(TestFrag)
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
            ft.add(container, TestFrag);

            ft.add(container, MysticalFrag);
            ft.hide(MysticalFrag);

            ft.commit();
      }
    }

}
