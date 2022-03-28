package den.ter.pizzashop.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.text.font.Typeface
import androidx.recyclerview.widget.RecyclerView
import den.ter.pizzashop.R
import den.ter.pizzashop.model.BannerModel
import den.ter.pizzashop.model.CategoryModel
import den.ter.pizzashop.model.PizzaModel
import kotlinx.android.synthetic.main.item_banner.view.*
import kotlinx.android.synthetic.main.item_category.view.*
import java.util.*
import java.util.Collections.emptyList
class CategoryAdapter: RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    private var list = emptyList<CategoryModel>()

    class CategoryViewHolder(view: View):RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(view)
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

        if(position!=0){
            holder.itemView.tv_category.setBackgroundColor(Color.WHITE)
            holder.itemView.tv_category.setTextColor(Color.parseColor("#D3CFCF"))

        }
        holder.itemView.tv_category.text = list[position].category_text

    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(newList: List<CategoryModel>){
        list = newList
        notifyDataSetChanged()
    }
}