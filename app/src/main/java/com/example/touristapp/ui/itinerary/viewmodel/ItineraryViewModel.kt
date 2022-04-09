package com.example.touristapp.ui.itinerary.viewmodel

import androidx.lifecycle.*
import com.example.touristapp.data.ItineraryDao
import com.example.touristapp.model.Itinerary
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException

class ItineraryViewModel(
    // Pass dao here
    private val itineraryDao: ItineraryDao
): ViewModel() {

    val allItineraries: LiveData<List<Itinerary>> = itineraryDao.getItineraries().asLiveData()

    fun getItinerary(id: Long): LiveData<Itinerary> = itineraryDao.getItinerary(id).asLiveData()

    fun addItinerary(
        name: String,
        address: String,
        hasVisited: Boolean,
        date: String,
        notes: String
    ) {
        val itinerary = Itinerary(
            name = name,
            address = address,
            hasVisited = hasVisited,
            date = date,
            notes = notes
        )

        // TODO: launch a coroutine and call the DAO method to add a Forageable to the database within it
        viewModelScope.launch{
            itineraryDao.insert(itinerary)
        }
    }

    fun updateItinerary(
        id: Long,
        name: String,
        address: String,
        hasVisited: Boolean,
        date: String,
        notes: String
    ) {
        val itinerary = Itinerary(
            id = id,
            name = name,
            address = address,
            hasVisited = hasVisited,
            date = date,
            notes = notes
        )
        viewModelScope.launch(Dispatchers.IO) {
            // TODO: call the DAO method to update a forageable to the database here
            itineraryDao.update(itinerary)
        }
    }

    fun deleteItinerary(itinerary: Itinerary) {
        viewModelScope.launch(Dispatchers.IO) {
            itineraryDao.delete(itinerary)
        }
    }

    fun isValidEntry(name: String, address: String): Boolean {
        return name.isNotBlank() && address.isNotBlank()
    }
}

class ItineraryViewModelFactory(private val itineraryDao: ItineraryDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom((ItineraryViewModel::class.java))){
            return ItineraryViewModel(itineraryDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}