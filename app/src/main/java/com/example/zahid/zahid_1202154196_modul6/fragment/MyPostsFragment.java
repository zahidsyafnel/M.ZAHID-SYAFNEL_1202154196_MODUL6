package com.example.zahid.zahid_1202154196_modul6.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {}



    @Override

    public Query getQuery(DatabaseReference databaseReference) {

        // All my posts

        return databaseReference.child("user-posts")

                .child(getUid());

    }
}
