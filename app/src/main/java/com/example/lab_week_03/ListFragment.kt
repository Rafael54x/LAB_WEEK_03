package com.example.lab_week_03

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ListFragment : Fragment(), View.OnClickListener{
    private var param1: String? = null // Consider removing if not used
    private var param2: String? = null // Consider removing if not used
    private lateinit var coffeeListener: CoffeeListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is CoffeeListener){
            coffeeListener = context
        }
        else{
            throw RuntimeException("Must implement CoffeeListener")
        }
    }

    // Removed boilerplate onCreate, onCreateView as they are not in the provided code
    // If you need them, you'll have to add them back based on your requirements.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // This line is assumed, as it's standard practice, though not explicitly in your snippet
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val coffeeList = listOf<View>(
            view.findViewById(R.id.affogato),
            view.findViewById(R.id.americano),
            view.findViewById(R.id.latte)
        )
        coffeeList.forEach{
            it.setOnClickListener(this)
        }
    }

    override fun onClick(v: View?) {
        v?.let{
                coffee -> coffeeListener.onSelected(coffee.id)
        }
    }

    companion object {
        // Removed boilerplate newInstance method as it's not in the provided code
        // If you need it, you'll have to add it back based on your requirements.
        // Consider if a companion object is needed at all if newInstance is removed.
    }
}