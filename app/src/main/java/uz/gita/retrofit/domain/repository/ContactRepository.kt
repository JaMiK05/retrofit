package uz.gita.retrofit.domain.repository

import android.provider.ContactsContract.Contacts
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import uz.gita.retrofit.dataLayer.remote.Api
import uz.gita.retrofit.dataLayer.remote.Client
import uz.gita.retrofit.dataLayer.remote.request.RequestAddContact
import uz.gita.retrofit.dataLayer.remote.response.ResponseData

class ContactRepository private constructor() {

    companion object {
        private lateinit var instance: ContactRepository

        fun getInstance(): ContactRepository {
               if(!(::instance.isInitialized)){
                   instance = ContactRepository()
               }
            return instance
        }
    }

    val contactApi = Client.retrofit.create(Api::class.java)

    fun addContact(contact: RequestAddContact, callback: Callback<ResponseData>){
        contactApi.addContact(contact).enqueue(callback)
    }

}