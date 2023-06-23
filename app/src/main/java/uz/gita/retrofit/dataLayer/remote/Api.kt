package uz.gita.retrofit.dataLayer.remote

import android.provider.ContactsContract.Contacts
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.DELETE
import retrofit2.http.POST
import uz.gita.retrofit.dataLayer.remote.request.RequestAddContact
import uz.gita.retrofit.dataLayer.remote.request.UpdateContactRequest
import uz.gita.retrofit.dataLayer.remote.response.DeleteContactResponse
import uz.gita.retrofit.dataLayer.remote.response.ResponseData

interface Api {

    @POST("/api/v1/contact")
    fun addContact(@Body data: RequestAddContact): Call<ResponseData>

    @DELETE("/api/v1/contact")
    fun deleteContact(@Query("id") id: Int): Call<DeleteContactResponse>

    @PUT("/api/v1/contact")
    fun updateContact(@Body request: UpdateContactRequest): Call<ResponseData>

    @GET("/api/v1/contact")
    fun getContacts(): Call<List<Contacts>>

}