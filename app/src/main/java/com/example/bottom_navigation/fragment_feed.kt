package com.example.bottom_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.bottom_navigation.databinding.FragmentFeedBinding



class fragment_feed : Fragment() {

    private  var binding: FragmentFeedBinding? = null
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
  //      return inflater.inflate(R.layout.fragment_feed, container, false)

        binding = FragmentFeedBinding.inflate(inflater,container,false)
        return binding!!.root

    }


//--------------------------------------------------------------------------------------------------------------------
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    //man  never forget to bind the navcontroller with the navigation library  with a view parameter in it .
    navController = Navigation.findNavController( view)


 binding!!.button2.setOnClickListener()
 {
     Toast.makeText(context, "heading towards the fragment E ", Toast.LENGTH_SHORT).show()
     navController!!.navigate(R.id.action_fragment_feed_to_fragment_E)
 }

}

//--------------------------------------------------------------------------------------------------------------------

//        *****   rem   this is imp step: closing the variable and objects .  it avoids the data leaks    *******

    override fun onDestroyView() {
    super.onDestroyView()

    binding=null
}
    //--------------------------------------------------------------------------------------------------------------------


}
