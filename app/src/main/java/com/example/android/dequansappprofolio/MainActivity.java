package com.example.android.dequansappprofolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        return rootView;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    onClick App Launch Methods

    // This method launches Popular Movies App
    public void sendPopularMoviesButtonToast(View view) {
        final Button appLaunchButton = (Button) view.findViewById(R.id.popular_movies_actionButton);
        Toast.makeText(getApplicationContext(), "This button will launch " + appLaunchButton.getText(),
                Toast.LENGTH_SHORT).show();
    }

    // This method launches Football Scores App
    public void sendFootballScoresButtonToast(View view) {
        Button appLaunchButton = (Button) view.findViewById(R.id.football_scores_actionButton);
        Toast.makeText(getApplicationContext(), "This button will launch " + appLaunchButton.getText(),
                Toast.LENGTH_SHORT).show();
    }

    // This method launches Library App
    public void sendLibraryAppButtonToast(View view) {
        Button appLaunchButton = (Button) view.findViewById(R.id.library_app_actionButton);
        Toast.makeText(getApplicationContext(), "This button will launch " + appLaunchButton.getText(),
                Toast.LENGTH_SHORT).show();
    }

    // This method launches Build It Bigger App
    public void sendBuildItBiggerButtonToast(View view) {
        Button appLaunchButton = (Button) view.findViewById(R.id.build_it_bigger_actionButton);
        Toast.makeText(getApplicationContext(), "This button will launch " + appLaunchButton.getText(),
                Toast.LENGTH_SHORT).show();
    }

    // This method launches XYZ Reader App
    public void sendXYZ_ReaderButtonToast(View view) {
        Button appLaunchButton = (Button) view.findViewById(R.id.xyz_reader_actionButton);
        Toast.makeText(getApplicationContext(), "This button will launch " + appLaunchButton.getText(),
                Toast.LENGTH_SHORT).show();
    }

    // This method launches My Own App
    public void sendMyOwnAppButtonToast(View view) {
        Button appLaunchButton = (Button) view.findViewById(R.id.my_own_app_actionButton);
        Toast.makeText(getApplicationContext(), "This button will launch " + appLaunchButton.getText(),
                Toast.LENGTH_SHORT).show();
    }

//    end of onClick App Launch Methods

}
