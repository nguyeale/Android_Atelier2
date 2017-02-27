package com.deviouscreators.android_atelier2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;

public class ArticleFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    // add your code here which executes when fragment's instance initializes
        Log.v(TAG, "fragmentOnCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.v(TAG, "fragmentOnCreateView");
        return inflater.inflate(R.layout.fragment_article, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
// add your code here which executes after the execution of onCreateView() method.
        Log.v(TAG, "fragmentOnViewCreated");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
// add your code here which executes when the host activity is created.
        Log.v(TAG, "fragmentOnActivityCreated");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v(TAG, "fragmentOnResume");
// add your code here which executes when the Fragment is visible and intractable.
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v(TAG, "fragmentOnPause");
// add your code here which executes when user leaving the current fragment or fragment is no longer intractable.
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v(TAG, "fragmentOnStop");
// add your code here which executes Fragment going to be stopped.
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v(TAG, "fragmentOnDestroyView");
// add your code here which executes when the view's and other related resources created in onCreateView() method are removed
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "fragmentOnDestroy");
// add your code here which executes when the final clean up for the Fragment's state is needed.
    }
}