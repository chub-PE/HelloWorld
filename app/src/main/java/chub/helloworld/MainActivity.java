package chub.helloworld;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity
{

    private ImageButton squirrelButton, crowButton, donkeyButton, chickenButton, pigButton, snakeButton, sheepButton, wolfButton;

    private MediaPlayer crowSound, chickenSound, pigSound, squirrelSound, donkeySound, snakeSound, sheepSound, wolfSound;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        squirrelButton = (ImageButton) findViewById(R.id.squirrelButton);
        donkeyButton = (ImageButton) findViewById(R.id.donkeyButton);
        snakeButton = (ImageButton) findViewById(R.id.snakeButton);
        sheepButton = (ImageButton) findViewById(R.id.sheepButton);
        wolfButton = (ImageButton) findViewById(R.id.wolfButton);
        chickenButton = (ImageButton) findViewById(R.id.chickenButton);
        pigButton = (ImageButton) findViewById(R.id.pigButton);
        crowButton = (ImageButton) findViewById(R.id.crowButton);
        loadSounds();

        squirrelButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                squirrelSound.start();
            }
        });

        donkeyButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                donkeySound.start();
            }
        });

        snakeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                snakeSound.start();
            }
        });

        sheepButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                sheepSound.start();
            }
        });

        wolfButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                wolfSound.start();
            }
        });

        chickenButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                chickenSound.start();
            }
        });

        pigButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                pigSound.start();
            }
        });

        crowButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                crowSound.start();
            }
        });
    }

    private void loadSounds()
    {
        crowSound = MediaPlayer.create(this, R.raw.crow);
        chickenSound = MediaPlayer.create(this, R.raw.chicken);
        pigSound = MediaPlayer.create(this, R.raw.pig);
        squirrelSound = MediaPlayer.create(this, R.raw.squirrel);
        donkeySound = MediaPlayer.create(this, R.raw.donkey);
        snakeSound = MediaPlayer.create(this, R.raw.snake);
        sheepSound = MediaPlayer.create(this, R.raw.sheep);
        wolfSound = MediaPlayer.create(this, R.raw.wolf);

    }


}
