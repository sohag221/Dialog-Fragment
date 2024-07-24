package com.example.dialogfragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity

class dialogFragment : DialogFragment() {

    lateinit var name:EditText
    lateinit var age:EditText
    lateinit var cance:Button
    lateinit var ok:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_dialog, container, false)


        name = view.findViewById(R.id.textName)
        age = view.findViewById(R.id.textAge)
        cance = view.findViewById(R.id.cancleButton)
        ok = view.findViewById(R.id.okButton)

        dialog?.window?.setBackgroundDrawableResource(android.R.color.holo_blue_dark)

        ok.setOnClickListener {
            if (name.text.toString().isBlank() || age.text.toString().isBlank()) {
                Toast.makeText(activity, "Enter data first!", Toast.LENGTH_SHORT).show()
            } else {
                val userName: String = name.text.toString()
                val userAge: Int = age.text.toString().toInt()
                val mainActivity: MainActivity = activity as MainActivity
                mainActivity.getData(userName, userAge)
                dialog!!.dismiss()
            }
        }

        cance.setOnClickListener {
            dialog!!.dismiss()
        }
        return view
    }
}