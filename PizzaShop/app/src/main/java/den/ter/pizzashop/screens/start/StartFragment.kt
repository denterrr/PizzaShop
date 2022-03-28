package den.ter.pizzashop.screens.start

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import den.ter.pizzashop.R
import den.ter.pizzashop.adapter.BannerAdapter
import den.ter.pizzashop.adapter.CategoryAdapter
import den.ter.pizzashop.adapter.MyAdapter
import den.ter.pizzashop.databinding.FragmentStartBinding
import den.ter.pizzashop.repository.MyRepository



class StartFragment : Fragment() {

    lateinit var binding: FragmentStartBinding
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView_banner: RecyclerView
    lateinit var recyclerView_category: RecyclerView
    lateinit var adapter: MyAdapter
    lateinit var adapter_banner: BannerAdapter
    lateinit var adapter_category: CategoryAdapter
    lateinit var spin: Spinner

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(layoutInflater,container,false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }





    private fun init() {
        spin = binding.spin
        val rep: MyRepository = MyRepository()
        val newList = rep.listPizza
        val list_category = rep.listCategory
        val list_banners = rep.listBanner
        recyclerView = binding.rvPizza
        recyclerView_category = binding.rvCategory
        recyclerView_banner = binding.rvBanners
        val lm: RecyclerView.LayoutManager = LinearLayoutManager(requireContext(),
            RecyclerView.HORIZONTAL,false)
        val lm2: RecyclerView.LayoutManager = LinearLayoutManager(requireContext(),
            RecyclerView.VERTICAL,false)
        val lm3: RecyclerView.LayoutManager = LinearLayoutManager(requireContext(),
            RecyclerView.HORIZONTAL,false)
        recyclerView_banner.layoutManager = lm
        recyclerView.layoutManager = lm2
        recyclerView_category.layoutManager = lm3
        adapter = MyAdapter()
        adapter.ctx = requireContext()
        adapter_banner = BannerAdapter()
        adapter_category = CategoryAdapter()
        recyclerView.adapter = adapter
        recyclerView_banner.adapter=adapter_banner
        recyclerView_category.adapter = adapter_category
        adapter.setList(newList)
        adapter_banner.setList(list_banners)
        adapter_category.setList(list_category)
        val arrayadapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            requireContext(),R.array.cities,android.R.layout.simple_spinner_item)
        arrayadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spin.adapter=arrayadapter

    }

}