package com.hafsalrahman.tasky.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;




import java.io.File;

/**
 * Created by ennur on 6/28/16.
 */
public class BaseActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");


    }

}
