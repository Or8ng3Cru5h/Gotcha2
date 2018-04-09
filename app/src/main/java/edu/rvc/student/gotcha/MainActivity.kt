package edu.rvc.student.gotcha

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.widget.GridLayout
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    internal var gridLayout: GridLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridLayout = findViewById(R.id.mainGrid) as GridLayout

        setSingleEvent(gridLayout)

    }

    // we are setting onClickListener for each element
    private fun setSingleEvent(gridLayout: GridLayout) {
        for (i in 0 until gridLayout.childCount) {
            val cardView = gridLayout.getChildAt(i) as CardView
            val finalI = i
            cardView.setOnClickListener {
                Toast.makeText(this@MainActivity, "Clicked at index $i",
                        Toast.LENGTH_SHORT).show()
            }
        }
    }


}