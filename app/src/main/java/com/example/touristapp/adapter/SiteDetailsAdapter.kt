package com.example.touristapp.adapter

import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.touristapp.R
import com.example.touristapp.data.TempDataSourceObj
import com.example.touristapp.model.Site
import com.example.touristapp.ui.site.SiteListFragmentDirections

class SiteDetailsAdapter (private val siteID: String) {
    private val filteredSite: List<Site>

    init {
        val sites = TempDataSourceObj.sites
        filteredSite = sites.filter { it.name.equals(siteID) }
    }

    val site = filteredSite[0]
    val wishlist = TempDataSourceObj.wishlist

    class SiteDetailsHolder(val view: View) {
        val siteImageView: ImageView? = view?.findViewById(R.id.site_image)
        val siteNameText: TextView? = view?.findViewById(R.id.site_name)
        val siteWishlistButton: ImageButton = view.findViewById<ImageButton>(R.id.wishlist_button)
    }

    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_site_details, container, false)
    }

    fun onBindView(holder: SiteDetailsAdapter.SiteDetailsHolder) {
        val siteItem = site
        val context = holder.view.context

        holder.siteNameText?.text = siteItem.name
        holder.siteImageView?.setImageResource(siteItem.imageResourceId)

//        if (wishlist.contains(siteItem)) {
//            holder.siteWishlistButton.setImageResource(R.drawable.ic_baseline_favorite_24)
//        } else {
//            holder.siteWishlistButton.setImageResource(R.drawable.ic_baseline_favorite_border_24)
//        }
//
//        holder.siteWishlistButton.setOnClickListener {
//            if (wishlist.contains(siteItem)) {
//                holder.siteWishlistButton.setImageResource(R.drawable.ic_baseline_favorite_border_24)
//
//                val toast = Toast.makeText(
//                    context,
//                    "${siteItem.name} removed from Wishlist",
//                    Toast.LENGTH_SHORT
//                )
//                toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
//                toast.show()
//                wishlist.remove(siteItem)
//
////                val toast = Toast.makeText(context, "${siteItem.name} already in Wishlist", Toast.LENGTH_SHORT)
////                toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
////                toast.show()
//            } else {
//                holder.siteWishlistButton.setImageResource(R.drawable.ic_baseline_favorite_24)
//
//                val toast = Toast.makeText(
//                    context,
//                    "${siteItem.name} added to Wishlist",
//                    Toast.LENGTH_SHORT
//                )
//                toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
//                toast.show()
//                wishlist.add(siteItem)
//            }
//        }
    }

    companion object Accessibility : View.AccessibilityDelegate() {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun onInitializeAccessibilityNodeInfo(
            host: View?,
            info: AccessibilityNodeInfo?
        ) {
            super.onInitializeAccessibilityNodeInfo(host, info)
            val customString = "Custom Text Accessibility"
            val customClick =
                AccessibilityNodeInfo.AccessibilityAction(
                    AccessibilityNodeInfo.ACTION_CLICK,
                    customString
                )
            info?.addAction(customClick)
        }
    }
}