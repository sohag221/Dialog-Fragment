package com.example.dialogfragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class dialogFragment : DialogFragment() {

    lateinit var name:EditText
    lateinit var age:EditText
    lateinit var cance:Button
    lateinit var ok:Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_dialog, container, false)


        name = view.findViewById(R.id.textName)
        age = view.findViewById(R.id.textAge)
        cance = view.findViewById(R.id.cancleButton)
        ok = view.findViewById(R.id.okButton)

        ok.setOnClickListener {


        }

        cance.setOnClickListener {



        }







        return view
    }

}