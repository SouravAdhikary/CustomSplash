package com.example.souravadhikary.customsplash;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_durga;
    private boolean valueOfCountModified=false;
    private SharedPreferences preferences;
    private int launchCount=0;

    String dates[]={"06-08-2017","07-08-2017","08-08-2017","09-08-2017","10-08-2017"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_durga=(ImageView)findViewById(R.id.iv_durga);

        // Randomise a background
        int[] yourListOfImages= {R.drawable.maa_durga1, R.drawable.maa_durga2,
                R.drawable.maa_durga3, R.drawable.maa_durga4, R.drawable.maa_durga5};


        //String currentDate=
                String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
        Log.w("currentDate", "onCreate: "+currentDate );
                if (currentDate.equals(dates[0])){
                    Glide.with(getApplicationContext()).load(yourListOfImages[0]).into(iv_durga);

                }
                else  if (currentDate.equals(dates[1])){
                    Glide.with(getApplicationContext()).load(yourListOfImages[1]).into(iv_durga);

                }
                else  if (currentDate.equals(dates[2])){
                    Glide.with(getApplicationContext()).load(yourListOfImages[2]).into(iv_durga);

                }
                else  if (currentDate.equals(dates[3])){
                    Glide.with(getApplicationContext()).load(yourListOfImages[3]).into(iv_durga);

                }
                else  if (currentDate.equals(dates[4])){
                    Glide.with(getApplicationContext()).load(yourListOfImages[4]).into(iv_durga);

                }
                else
                    Glide.with(getApplicationContext()).load(yourListOfImages[4]).into(iv_durga);
       /* if(!valueOfCountModified){
            preferences = getPreferences(MODE_PRIVATE);
            launchCount= preferences.getInt("launchCount", 0);
            Log.w("launchCount", "onCreate: "+launchCount );
            if(preferences.edit().putInt("launchCount", ++launchCount).commit()){
                valueOfCountModified = true;
                Log.w("launchCount", "onCreate: "+launchCount );
                if(launchCount == 1){
                    //Do whatever you want
                }
            }
        }
        Random random = new Random();
        int posOfImage = random.nextInt(yourListOfImages.length - 1);*/

        //iv_durga.setImageDrawable(yourListOfImages[posOfImage]);

    }
}
