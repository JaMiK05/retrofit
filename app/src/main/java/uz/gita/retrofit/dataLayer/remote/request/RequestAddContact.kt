package uz.gita.retrofit.dataLayer.remote.request

data class RequestAddContact(
    val firstName: String,
    val lastName: String,
    val phone: String,
)