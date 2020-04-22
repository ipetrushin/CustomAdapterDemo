package com.example.customadapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    UserListAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);

        ArrayList<User> users = new ArrayList<>();

        // TODO: реализовать загрузку данных из JSON-файла
        // который загрузить в папку assets

        for (int i = 0; i < 10; i++) {
            users.add(new User("Petya", "123", Sex.MAN));
            users.add(new User("Vasya", "234", Sex.MAN));
            users.add(new User("Valya", "456", Sex.WOMAN));
            users.add(new User("UFO", "@@@", Sex.UNKNOWN));
        }


        adapter = new UserListAdapter(this, users);

        listView.setAdapter(adapter);
    }
}
