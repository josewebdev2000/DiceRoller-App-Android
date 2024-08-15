package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    // Promise to initialize Dice Button View Later On
    lateinit var rollButton: Button

    // Promise to initialize Dice Image View Later On
    lateinit var diceImage: ImageView

    // Promise to initialize Dice Text View Later On
    lateinit var diceText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set an activity for the App
        setContentView(R.layout.activity_main)

        // Grab the Dice Image
        diceImage = findViewById<ImageView>(R.id.dice_image)

        // Grab the Dice Text
        diceText= findViewById<TextView>(R.id.dice_number)

        // Grab a Button by its ID
        rollButton= findViewById<Button>(R.id.roll_button)

        // Button Click Event Listener
        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice()
    {
        // Grab a random number between the inclusive range (1-6)
        val randomInt = Random().nextInt(6) + 1

        // Determine Dice Text Result
        val diceTextResult: String = randomInt.toString()

        // Determine Dice Image Result
        val diceImgResult: Int = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Change the Dice Text for the one shown in the result
        diceText.setText(diceTextResult)

        // Change the Dice Image for the one shown in the result
        diceImage.setImageResource(diceImgResult)


    }
}