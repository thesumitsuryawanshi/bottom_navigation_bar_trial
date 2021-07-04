package com.example.bottom_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import androidx.navigation.NavController
import androidx.navigation.Navigation

import com.example.bottom_navigation.databinding.FragmentChatsBinding


class fragment_chats : Fragment() {

       private  var binding: FragmentChatsBinding? = null
       private  var navController:NavController? =null



//--------------------------------------------------------------------------------------------------------------------


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
//--------------------------------------------------------------------------------------------------------------------

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
   //     return inflater.inflate(R.layout.fragment_chats, container, false)

        binding = FragmentChatsBinding.inflate(inflater,container, false)
        return binding!!.root
    }


//--------------------------------------------------------------------------------------------------------------------

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //man , never forget to attach navController with the Navigation lib with a view parameter in it
        navController = Navigation.findNavController(view)


        binding!!.button.setOnClickListener()
        {

            Toast.makeText(context, "heading towards the fragment E ", Toast.LENGTH_SHORT).show()
            navController!!.navigate(R.id.action_fragment_chats_to_fragment_E)
        }

    }

    //--------------------------------------------------------------------------------------------------------------------


    //        *****   rem   this is imp step: closing the variable and objects .  it avoids the data leaks    *******

    override fun onDestroyView() {
        super.onDestroyView()

        binding=null
    }
    //--------------------------------------------------------------------------------------------------------------------
/*
    *******************  tejas dada reference code ***************************
    private var binding: FragmentSubscriptionBinding? = null
    private val fragmentBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSubscriptionBinding.inflate(inflater, container, false)
        return binding!!.root
    }

//--------------------------------------------------------------------------------------------------------------------
*/
}