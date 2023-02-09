package org.codebase.fragmenttransition

import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import com.google.android.material.transition.MaterialContainerTransform

class FragmentTest {

    private fun buildContainerTransform() =
        MaterialContainerTransform().apply {
//            addTarget(binding.coordinator)
            duration = 300
            interpolator = FastOutSlowInInterpolator()
            fadeMode = MaterialContainerTransform.FADE_MODE_IN
        }
}