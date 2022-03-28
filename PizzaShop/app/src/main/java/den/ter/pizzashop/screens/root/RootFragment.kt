package den.ter.pizzashop.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import den.ter.pizzashop.R
import den.ter.pizzashop.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_root.*
import kotlinx.android.synthetic.main.fragment_root.view.*
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener as OnTabSelectedListener


class RootFragment : Fragment() {

    private var ctx: Context ?= null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_root, container, false)
        view.tab_layout.setTabIconTintResource(R.color.dark_gray)



        view.tab_layout.setTabTextColors(R.color.dark_gray,R.color.red)
        view.view_pager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        TabLayoutMediator(view.tab_layout,view.view_pager){
            tab, pos ->
            when(pos){
                0 -> {
                    tab.setIcon(R.drawable.ic_menu)
                    tab.text = "Меню"

                }
                1 ->{
                    tab.setIcon(R.drawable.ic_profile)
                    tab.text = "Профиль"
                }
                2 -> {
                    tab.setIcon(R.drawable.ic_card)
                    tab.text = "Корзина"
                }
            }
        }.attach()


            view.tab_layout.setTabIconTintResource(R.color.dark_gray)



            view.tab_layout.setTabTextColors(R.color.dark_gray,R.color.red)
            view.view_pager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
            TabLayoutMediator(view.tab_layout,view.view_pager){
                tab, pos ->
                when(pos){
                    0 -> {
                        tab.setIcon(R.drawable.ic_menu)
                        tab.text = "Меню"

                    }
                    1 ->{
                        tab.setIcon(R.drawable.ic_profile)
                        tab.text = "Профиль"
                    }
                    2 -> {
                        tab.setIcon(R.drawable.ic_card)
                        tab.text = "Корзина"
                    }
                }
            }.attach()




        return view
    }

}