package com.sanches.pontointeligente.services.impl

import com.sanches.pontointeligente.documents.Empresa
import com.sanches.pontointeligente.repositories.EmpresaRepository
import com.sanches.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(
        val empresaRepository: EmpresaRepository
): EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)
}