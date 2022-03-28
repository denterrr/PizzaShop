package den.ter.pizzashop

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import den.ter.pizzashop.screens.card.CardFragment
import den.ter.pizzashop.screens.profile.ProfileFragment
import den.ter.pizzashop.screens.start.StartFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> StartFragment()
            1 -> ProfileFragment()
            else -> CardFragment()
        }
    }
}