package com.example.guicontrols

import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    /*
    Declaring private member variables for various UI elements
    (EditText, CheckBox, Button, TextView).
     */
    /*
    The "lateinit" var keyword is used because these variables will be initialized
    later in the onCreate method.
     */
    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var maleCheckBox: CheckBox
    private lateinit var femaleCheckBox: CheckBox
    private lateinit var submitButton: Button
    private lateinit var peopleListTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Initializing the member variables by finding the corresponding views
        in the layout using their IDs.
         */
        nameEditText = findViewById(R.id.nameEditText)
        emailEditText = findViewById(R.id.emailEditText)
        maleCheckBox = findViewById(R.id.maleCheckBox)
        femaleCheckBox = findViewById(R.id.femaleCheckBox)
        submitButton = findViewById(R.id.submitButton)
        peopleListTextView = findViewById(R.id.peopleListTextView)
        //Button click listener.
        submitButton.setOnClickListener {
            //Once the button is clicked, the following two methods will be called.
            saveData()
            loadPeopleList()
        }
    }
    /*
    The following method retrieves the stored data from the shared preferences file
    and updates the peopleListTextView with the loaded data.
     */
    private fun saveData() {
        val name = nameEditText.text.toString()
        val email = emailEditText.text.toString()
        val gender = if (maleCheckBox.isChecked) "Male" else if (femaleCheckBox.isChecked) "Female" else ""

        val sharedPref = getSharedPreferences("PeopleData", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        val currentData = sharedPref.getString("people_list", "")
        val newData = "$currentData\nName: $name\nEmail: $email\nGender: $gender\n"

        editor.putString("people_list", newData)
        editor.apply()

        nameEditText.text.clear()
        emailEditText.text.clear()
        maleCheckBox.isChecked = false
        femaleCheckBox.isChecked = false
    }

    private fun loadPeopleList() {
        val sharedPref = getSharedPreferences("PeopleData", Context.MODE_PRIVATE)
        val peopleList = sharedPref.getString("people_list", "") ?: ""

        peopleListTextView.text = peopleList
    }
}