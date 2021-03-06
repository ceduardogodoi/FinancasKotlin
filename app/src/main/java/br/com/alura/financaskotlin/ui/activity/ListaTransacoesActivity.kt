package br.com.alura.financaskotlin.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.alura.financaskotlin.R
import br.com.alura.financaskotlin.model.Tipo
import br.com.alura.financaskotlin.model.Transacao
import br.com.alura.financaskotlin.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.Calendar

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes: List<Transacao> = transacoesDeExemplo()

        configuraLista(transacoes)
    }

    private fun configuraLista(transacoes: List<Transacao>) {
        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

    private fun transacoesDeExemplo(): List<Transacao> {
        return listOf(
            Transacao(
                categoria = "Almoco de final de semana",
                tipo = Tipo.DESPESA,
                data = Calendar.getInstance(),
                valor = BigDecimal(20.5)
            ),
            Transacao(BigDecimal(100.0), "Economia", Tipo.RECEITA),
            Transacao(valor = BigDecimal(200.0), tipo = Tipo.DESPESA),
            Transacao(valor = BigDecimal(500.0), categoria = "Premio", tipo = Tipo.RECEITA)
        )
    }

}
