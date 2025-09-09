package com.example.lab_week_03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DetailFragment : Fragment() {
    private var param1: String? = null // Consider removing if not used
    private var param2: String? = null // Consider removing if not used

    private val coffeeTitle: TextView?
        get() = view?.findViewById(R.id.coffee_title)

    private val coffeeDesc: TextView?
        get() = view?.findViewById(R.id.coffee_desc)

    // Removed boilerplate onCreate, onCreateView as they are not in the provided code
    // If you need them, you'll have to add them back based on your requirements.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // This line is assumed, as it's standard practice, though not explicitly in your snippet
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    fun setCoffeeData(id: Int){
        when(id){
            R.id.affogato -> {
                coffeeTitle?.text = getString(R.string.affogato_title)
                coffeeDesc?.text = getString(R.string.affogato_desc)
            }
            R.id.americano -> {
                coffeeTitle?.text = getString(R.string.americano_title)
                coffeeDesc?.text = getString(R.string.americano_desc)
            }
            R.id.latte -> {
                coffeeTitle?.text = getString(R.string.latte_title)
                coffeeDesc?.text = getString(R.string.latte_desc)
            }
        }
    }

    companion object {
        // Removed boilerplate newInstance method as it's not in the provided code
        // If you need it, you'll have to add it back based on your requirements.
        // Consider if a companion object is needed at all if newInstance is removed.
    }
}