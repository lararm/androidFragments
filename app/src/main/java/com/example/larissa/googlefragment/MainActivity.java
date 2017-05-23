package com.example.larissa.googlefragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Configuration config = getResources().getConfiguration();

        //Adding fragment transaction
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        /**
         * Check the device orientation and act accordingly
         */
        if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            /**
             * Landscape mode of the device
             */
            LM_Fragment ls_fragment = new LM_Fragment();
            fragmentTransaction.replace(android.R.id.content, ls_fragment);
        }else{
            /**
             * Portrait mode of the device
             */
            PM_fragment pm_fragement = new PM_fragment();
            fragmentTransaction.replace(android.R.id.content, pm_fragement);
        }
        fragmentTransaction.commit();


 /***   //To make fragment transactions in your activity (such as add, remove, or replace a fragment),
        // you must use APIs from FragmentTransaction. You can get an instance of FragmentTransaction
        // from your Activity like this:
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //To add a fragment using the add()
        ExampleFragment fragment = new ExampleFragment();
        //The first argument passed to add() is the ViewGroup in which the fragment
        // should be placed, specified by resource ID, and the second parameter is the fragment to add.
        fragmentTransaction.add(R.id.mainView, fragment);

        //Once you've made your changes with FragmentTransaction, you must call commit()
        // for the changes to take effect.
        fragmentTransaction.commit();*/

    }



    /***public static class ExampleFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.example_fragment, container, false);
        }
    }*/
}


