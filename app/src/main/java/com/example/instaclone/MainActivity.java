package com.example.instaclone;

import com.parse.Parse;
import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YOUR_APP_ID")
                // if desired
                .clientKey("YOUR_CLIENT_KEY")
                .server("https://your-server-address/parse/")
                .build()
        );
    }
}

import androidx.appcompat.app.AppCompatActivity;
import com.parse.Parse;
import android.app.Application;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
