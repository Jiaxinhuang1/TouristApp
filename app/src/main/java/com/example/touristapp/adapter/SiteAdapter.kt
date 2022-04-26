package com.example.touristapp.adapter

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.touristapp.R
import com.example.touristapp.data.TempDataSourceObj
import com.example.touristapp.model.Site
import com.example.touristapp.ui.city.CityListFragmentDirections
import com.example.touristapp.ui.site.SiteListFragmentDirections
import com.example.touristapp.ui.wishlist.WishlistFragmentDirections

class SiteAdapter(private val cityID: String) : RecyclerView.Adapter<SiteAdapter.SiteCardViewHolder>() {

    private val filteredSites: List<Site>
    init {
        val sites = TempDataSourceObj.sites
        filteredSites = sites.filter { it.city.equals(cityID) }
    }
    val wishlist = TempDataSourceObj.wishlist


    //if you edit, make sure to transfer edit to wishlist siteCardViewHolder and Search viewholder
    class SiteCardViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val siteImageView : ImageView? = view?.findViewById(R.id.site_image)
        val siteNameText : TextView? = view?.findViewById(R.id.site_name)
        val siteDetailsButton: Button = view.findViewById<Button>(R.id.details_button)
        val siteWishlistButton: ImageButton = view.findViewById<ImageButton>(R.id.wishlist_button)
    }

    override fun getItemCount(): Int = filteredSites.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SiteCardViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.site_item_view, parent, false)

        layout.accessibilityDelegate = Accessibility

        return SiteCardViewHolder(layout)
    }

    override fun onBindViewHolder(holder: SiteCardViewHolder, position: Int) {
        val siteItem = filteredSites[position]
        val context = holder.view.context

        holder.siteNameText?.text = siteItem.name
        holder.siteImageView?.setImageResource(siteItem.imageResourceId)

        if (wishlist.contains(siteItem)) {
            holder.siteWishlistButton.setImageResource(R.drawable.ic_baseline_favorite_24)
        }
        else {
            holder.siteWishlistButton.setImageResource(R.drawable.ic_baseline_favorite_border_24)
        }

        holder.siteDetailsButton.setOnClickListener {
//            val action = CityListFragmentDirections.actionCityListFragmentToSiteListFragment(city = cityItem.name)
            val action = SiteListFragmentDirections.actionSiteListFragmentToSiteDetailsFragment(siteItem.name)
//            val action = SiteListFragmentDirections.actionSiteListFragmentToSiteDetailsFragment()
            holder.view.findNavController().navigate(action)
        }

        holder.siteWishlistButton.setOnClickListener{
            if (wishlist.contains(siteItem)) {
                holder.siteWishlistButton.setImageResource(R.drawable.ic_baseline_favorite_border_24)

                val toast = Toast.makeText(context, "${siteItem.name} removed from Wishlist", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
                toast.show()
                scaler(holder.siteWishlistButton)
                wishlist.remove(siteItem)

//                val toast = Toast.makeText(context, "${siteItem.name} already in Wishlist", Toast.LENGTH_SHORT)
//                toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
//                toast.show()
            }
            else {
                holder.siteWishlistButton.setImageResource(R.drawable.ic_baseline_favorite_24)

                val toast = Toast.makeText(context, "${siteItem.name} added to Wishlist", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
                toast.show()
                scaler(holder.siteWishlistButton)
                wishlist.add(siteItem)
            }
        }
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

    private fun scaler(imageButton: ImageButton) {
        //scale animation
        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 0.5f)
        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.5f)
        val animator = ObjectAnimator.ofPropertyValuesHolder(imageButton, scaleX, scaleY)
        animator.repeatCount = 1
        animator.duration = 50
        animator.repeatMode = ObjectAnimator.REVERSE
        //animator.disableViewDuringAnimation(button)
        animator.start()
    }
}