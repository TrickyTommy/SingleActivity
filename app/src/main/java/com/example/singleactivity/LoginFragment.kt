package com.example.singleactivity

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_register.*
import androidx.navigation.fragment.NavHostFragment.findNavController as findNavController1


class LoginFragment : Fragment(), View.OnClickListener {


    private lateinit var binding: LoginFragment
    var navController : NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btn_login).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_register).setOnClickListener(this)


    }




    override fun onClick(v: View?) {
        when(v!!.id)
        {
            R.id.btn_login -> navController!!.navigate(R.id.action_loginFragment_to_homeFragment)
            R.id.btn_register -> navController!!.navigate(R.id.action_loginFragment_to_registerFragment)
        }




    }

}