package br.edu.utfpr.trocatelas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

class ConfirmarActivity : AppCompatActivity() {
    private lateinit var tvCod: TextView
    private lateinit var tvQntd: TextView
    private lateinit var tvValor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar)

        val cod = intent.getStringExtra("cod")
        val qntd = intent.getStringExtra("qntd")
        val valor = intent.getStringExtra("valor")

        tvCod = findViewById(R.id.tvCod)
        tvQntd = findViewById(R.id.tvQntd)
        tvValor = findViewById(R.id.tvValor)

        tvCod.text = cod
        tvQntd.text = qntd
        tvValor.text = valor
    }

    fun btEnviarOnClick(view: View) {
        val sms_body = "Cod: ${tvCod.text} qtd: ${tvQntd.text} valor: ${tvValor.text}"
        val phone_number = "sms:+5546991124391"

        val intent = Intent(Intent.ACTION_VIEW)

        intent.setData(phone_number.toUri())
        intent.putExtra("sms_body", sms_body)

        startActivity(intent)
    }
}