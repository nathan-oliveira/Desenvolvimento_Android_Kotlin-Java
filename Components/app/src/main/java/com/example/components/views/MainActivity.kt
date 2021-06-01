package com.example.components.views

import android.app.ProgressDialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import com.example.components.R
import com.example.components.mock.Mock
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener, AdapterView.OnItemSelectedListener, SeekBar.OnSeekBarChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
        loadSpinner()
    }

    private fun loadSpinner() {
        // Mock.TESTE.getList()
        val list = Mock.getList()
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, list)
        spinnerDynamic.adapter = adapter
    }

    private fun setListeners() {
        buttonToastMe.setOnClickListener(this)
        buttonSnackMe.setOnClickListener(this)
        buttonGetSpinner.setOnClickListener(this)
        buttonSetSpinner.setOnClickListener(this)

        spinnerDynamic.onItemSelectedListener = this

        buttonGetSeek.setOnClickListener(this)
        buttonSetSeek.setOnClickListener(this)

        seekValue.setOnSeekBarChangeListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonToastMe -> {
                val toast = createToast("Toast notification!", "error")
                toast?.show()
            }
            R.id.buttonSnackMe -> {
                val snack = createSnackBar("Snack bar notification!", "success")
                snack.show()
            }
            R.id.buttonGetSpinner -> {
                val value = spinnerDynamic.selectedItemPosition.toString()  // val value = spinnerDynamic.selectedItem.toString()
                Toast.makeText(this, value, Toast.LENGTH_LONG).show()
            }
            R.id.buttonSetSpinner -> {
                spinnerDynamic.setSelection(3)
            }
            R.id.buttonProgress -> {
                val progress = createProgressDialog("Título", "Mensagem")
                progress.show()
            }
            R.id.buttonGetSeek -> Toast.makeText(this, seekValue.progress, Toast.LENGTH_LONG).show()
            R.id.buttonSetSeek -> seekValue.progress = 10

        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        when (view.id) {
            R.id.spinnerDynamic -> {
                val value: String = parent.getItemAtPosition(position).toString()
                Toast.makeText(this, value, Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
        when (seek.id) {
            R.id.seekValue -> textSeekValue.text = progress.toString()
        }
    }

    override fun onStartTrackingTouch(seekBar: SeekBar) {

    }

    override fun onStopTrackingTouch(seekBar: SeekBar) {

    }

    private fun createToast(message: String, status: String = "success"): Toast? {
        val inflater: LayoutInflater = layoutInflater
        val toast = Toast.makeText(this, message, Toast.LENGTH_LONG)
        toast.view = inflater.inflate(R.layout.toast_custom, null)
        toast.view?.findViewById<TextView>(R.id.textMessage)?.setTextColor(Color.WHITE)

        when (status) {
            "error" -> toast.view?.setBackgroundColor(Color.RED)
            "success" -> toast.view?.setBackgroundColor(Color.GREEN)
            "warning" -> toast.view?.setBackgroundColor(Color.YELLOW)
            else -> toast.view?.setBackgroundColor(Color.BLACK)
        }

        return toast;
    }

    private fun createSnackBar(message: String, status: String = "success"): Snackbar {
        val snack = Snackbar.make(constraintlayout, message, Snackbar.LENGTH_SHORT)
        snack.setTextColor(Color.WHITE)

        when (status) {
            "error" -> snack.setBackgroundTint(ContextCompat.getColor(this, R.color.red))
            "success" -> snack.setBackgroundTint(Color.GREEN)
            "warning" -> snack.setBackgroundTint(Color.YELLOW)
            else -> snack.setBackgroundTint(Color.BLACK)
        }

        // mostrar imp da action
        snack.setAction("Desfazer") {
            Snackbar.make(constraintlayout, "Ação desfeita", Snackbar.LENGTH_SHORT).show()
        }

        // cor do texto da action "Desfazer"
        snack.setActionTextColor(Color.YELLOW)

        return snack
    }

    private fun createProgressDialog(title: String, message: String): ProgressDialog {
        val progress: ProgressDialog = ProgressDialog(this)
        progress.setTitle(title)
        progress.setMessage(message)
        return progress
        // progress.hide()
        // progress.dismiss()
    }



}