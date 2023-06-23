package uz.gita.retrofit

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.widget.doAfterTextChanged
import uz.gita.retrofit.databinding.DialogAddBinding

class Add_Dialog(context: Context) : AlertDialog(context) {

    private var _binding: DialogAddBinding? = null
    private val binding get() = _binding!!

    private var call: (() -> Unit)? = null

    fun setCall(block: () -> Unit) {
        call = block
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DialogAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        load()
    }

    private fun load() {
        empty()
        binding.apply {

            name.doAfterTextChanged {
                empty()
            }
            surname.doAfterTextChanged {
                empty()
            }
            phone.doAfterTextChanged {
                empty()
            }
            adBtn.setOnClickListener {
                call?.invoke()
            }
        }
    }

    private fun empty() {
        val name = binding.name.text.toString()
        val surname = binding.surname.text.toString()
        val phone = binding.phone.text.toString()
        binding.adBtn.isEnabled = !(name.isEmpty() || surname.isEmpty() || phone.isEmpty())
    }

}