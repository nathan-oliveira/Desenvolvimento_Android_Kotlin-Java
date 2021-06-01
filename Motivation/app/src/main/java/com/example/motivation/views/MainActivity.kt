package com.example.motivation.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.motivation.R
import com.example.motivation.mock.Mock
import com.example.motivation.util.MotivationConstants
import com.example.motivation.util.SecurityPreference
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var mFilter: Int = MotivationConstants.PHRASE_FILTER.ALL
    private lateinit var mSecurityPreference: SecurityPreference
    private val mMock = Mock()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSecurityPreference = SecurityPreference(this)

        setListeners()
        setInitializers()
        verifyUserName()
    }

    private fun setListeners() { // Events
        imageAll.setOnClickListener(this)
        imageSun.setOnClickListener(this)
        imageHappy.setOnClickListener(this)
        buttonNewPhrase.setOnClickListener(this)
    }

    private fun setInitializers() { // Initializes
        handlerFilter(R.id.imageAll)
        refreshPhrase()
    }

    private fun verifyUserName() {
        textUserName.text = mSecurityPreference.getStoredString(MotivationConstants.KEY.PERSON_NAME)
    }

    override fun onClick(view: View) {
        val id = view.id
        val listId = listOf(R.id.imageAll, R.id.imageSun, R.id.imageHappy)

        when (id) {
            in listId -> handlerFilter(id)
            R.id.buttonNewPhrase -> refreshPhrase()
        }
    }

    private fun handlerFilter(id: Int) {
        imageAll.setImageResource(R.drawable.ic_all_unselected)
        imageSun.setImageResource(R.drawable.ic_sun_unselected)
        imageHappy.setImageResource(R.drawable.ic_happy_unselected)

        when (id) {
            R.id.imageAll -> {
                mFilter = MotivationConstants.PHRASE_FILTER.ALL
                imageAll.setImageResource(R.drawable.ic_all_selected)

            }
            R.id.imageSun -> {
                mFilter = MotivationConstants.PHRASE_FILTER.SUN
                imageSun.setImageResource(R.drawable.ic_sun_selected)
            }
            R.id.imageHappy -> {
                mFilter = MotivationConstants.PHRASE_FILTER.HAPPY
                imageHappy.setImageResource(R.drawable.ic_happy_selected)
            }
            else -> Toast.makeText(
                this,
                getString(R.string.filtro_nao_encontrado),
                Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun refreshPhrase() {
        textPhrase.text = mMock.getPhrase(mFilter)
    }

}