package uz.gita.retrofit.dataLayer.remote.request

data class UpdateContactRequest(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val phone: String,
)
