package org.codebase.fragmenttransition

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DetailFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedElementEnterTransition = TransitionInflater.from(activity).inflateTransition(
            R.transition.ch_fragment_transistion
        )
        sharedElementReturnTransition = TransitionInflater.from(activity).inflateTransition(
            R.transition.ch_fragment_transistion
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    companion object {

        fun newInstance() = DetailFragment()
    }
}