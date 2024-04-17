package com.tpro.brokenapp.tpro.brokenapp.tpro.broeknapp

import android.app.*
import android.os.*
import android.text.Editable
import android.text.TextWatcher
import com.tpro.brokenapp.R
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.editext1
import kotlinx.android.synthetic.main.activity_main.editext2
import kotlinx.android.synthetic.main.activity_main.rsult
import java.util.Locale


class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editext1.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                button.isEnabled =
                    editext1.text.toString().isNotEmpty() && editext2.text.toString().isNotEmpty()
            }
        })

        editext2.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                button.isEnabled =
                    editext1.text.toString().isNotEmpty() && editext2.text.toString().isNotEmpty()
            }
        })

       button.setOnClickListener {
            editext1.text.toString().toLowerCase(Locale.ROOT)
                .let { text1 ->
                    val text2 = editext2.text.toString()
                        .toLowerCase(Locale.ROOT)
                    val sum = Value(text1).getValue() + Value(text2).getValue()
                    rsult.text = getString(R.string.result, sum)
                }
        }
    }
}

class Value(private val integer: String) {
    fun getValue(): Int {
        return if (integer == "0") {
            "0".toInt() * 2
        } else {
            Thread.sleep(50) //haha
            integer.toInt()
        }
    }

}