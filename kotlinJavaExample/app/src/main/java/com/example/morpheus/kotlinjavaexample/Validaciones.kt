package com.example.morpheus.kotlinjavaexample

import android.widget.EditText



    fun EditText.passwordValida():Boolean
    {
        return this.text.toString().isNotEmpty() &&
                this.text.toString().length.compareTo(6) ==1
    }
