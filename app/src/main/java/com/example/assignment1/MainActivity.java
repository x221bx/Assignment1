package com.example.assignment1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Post> postList = generatePosts(1000);
        PostAdapter postAdapter = new PostAdapter(postList);
        recyclerView.setAdapter(postAdapter);
    }

    private List<Post> generatePosts(int count) {
        List<Post> posts = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String title = "User " + i;
            String description = "This is post number " + i;
            posts.add(new Post(title, description));
        }
        return posts;
    }
}
