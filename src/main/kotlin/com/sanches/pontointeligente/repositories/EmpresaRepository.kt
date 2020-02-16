package com.sanches.pontointeligente.repositories

import com.sanches.pontointeligente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {

    fun findByCnpj(cnpj:String): Empresa
}