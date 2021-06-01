package com.example.components.views

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import com.example.components.R
import kotlinx.android.synthetic.main.activity_date.*
import java.text.SimpleDateFormat
import java.util.*

class DateActivity : AppCompatActivity(), View.OnClickListener, DatePickerDialog.OnDateSetListener,
    TimePicker.OnTimeChangedListener {
    private val mSimpleDateFormat = SimpleDateFormat("dd/MM/yyyy")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)

        setListeners()
    }

    private fun setListeners() {
        buttonDatepicker.setOnClickListener(this)
        buttonGetTime.setOnClickListener(this)
        buttonSetTime.setOnClickListener(this)

        timePicker.setOnTimeChangedListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonDatepicker -> openDatepickerDialog()
            R.id.buttonGetTime -> getTimePicker()
            R.id.buttonSetTime -> setTimePicker()
        }
    }

    override fun onDateSet(view: DatePicker, year: Int, month: Int, dayOfMonth: Int) {
        val calendar = Calendar.getInstance()
        calendar.set(year, month, dayOfMonth)
        val value = mSimpleDateFormat.format(calendar.time)
        buttonDatepicker.text = value
    }

    override fun onTimeChanged(view: TimePicker, hourOfDay: Int, minute: Int) {
        Toast.makeText(this, "$hourOfDay:$minute", Toast.LENGTH_LONG).show()
    }

    private fun openDatepickerDialog() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(this, this, year, month, day).show()
    }

    private fun getTimePicker() {
        var value: String = if (Build.VERSION.SDK_INT >= 23)
            "${timePicker.hour}:${timePicker.minute}"
        else
            "${timePicker.currentHour}:${timePicker.currentMinute}"

        Toast.makeText(this, value, Toast.LENGTH_LONG).show()
    }

    private fun setTimePicker() {
        if (Build.VERSION.SDK_INT >= 23) {
            timePicker.hour = 18
            timePicker.minute = 20
        } else {
            timePicker.currentHour = 18
            timePicker.currentMinute = 20
        }
    }
}