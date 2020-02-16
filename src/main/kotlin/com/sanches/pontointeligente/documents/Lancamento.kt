package com.sanches.pontointeligente.documents

import com.sanches.pontointeligente.enums.TipoEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document
data class Lancamento (
        @Id val id: String? = null,
        val data: Date,
        val tipo: TipoEnum,
        val funcionarioId: String,
        val descricao: String? = "",
        val localizacao: String? = ""
)