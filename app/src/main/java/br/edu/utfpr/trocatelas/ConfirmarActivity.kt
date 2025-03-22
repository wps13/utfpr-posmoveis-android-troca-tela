package br.edu.utfpr.trocatelas

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmarActivity : AppCompatActivity() {
    private lateinit var  tvCod: TextView
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
}