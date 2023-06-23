package uz.gita.retrofit.presentation.viewmodel

import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import uz.gita.retrofit.dataLayer.remote.request.RequestAddContact
import uz.gita.retrofit.dataLayer.remote.response.ResponseData
import uz.gita.retrofit.domain.repository.ContactRepository

class MainScreenViewModel: ViewModel() {
    private val repository = ContactRepository.getInstance()



    fun addContact(data: RequestAddContact) {
        repository.addContact(data, object : Callback<ResponseData> {
            override fun onResponse(call: Call<ResponseData>, response: Response<ResponseData>) {
                if(response.isSuccessful) {
                    // LiveData
                } else {
                    // ERrorLiuvedata
                }
            }

            override fun onFailure(call: Call<ResponseData>, t: Throwable) {
                // ErorrLiveData
            }
        })
    }
}