package com.example.soccerteam

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.soccerteam.R.id.teamsTextView

class MainActivity : AppCompatActivity() {

    val teams = arrayOf<string>("Mamelode Sundowns FC",
        "Bidvest Bits",
        "Orlando Piates",
        "Kaizer Chiefs",
        "Cape Town City FC")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //get the teams text view
        val teamsTextViews = findViewById<TextView>(teamsTextView)
        // set the text views text to first time
        //teamsTextView.text = teams(0)

        //teamsTextView.text = Arrays.toString(teams)


        //add all the teams to the display string
    //      var teamsDisplay = ""
    //      teamsDisplay += "${teams[0]}\n"
    //      teamsDisplay += "${teams[1]}\n"
    //      teamsDisplay += "${teams[2]}\n"
    //      teamsDisplay += "${teams[3]}\n"
    //      teamsDisplay += "${teams[4]}\n"
    //      set the text view's text to the string represent
    //      teamsTextView.text = teamsDisplay



            // add all the teams to the display string
            // add display

            var teamsDisplay = ""
            var counter = 0
            while (counter < 5) {
                teamsDisplay += "${teams[counter]}\n"
                counter++
            }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

