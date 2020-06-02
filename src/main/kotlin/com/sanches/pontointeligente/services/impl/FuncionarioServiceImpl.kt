package com.sanches.pontointeligente.services.impl

import com.sanches.pontointeligente.documents.Funcionario
import com.sanches.pontointeligente.repositories.FuncionarioRepository
import com.sanches.pontointeligente.services.FuncionarioService
import org.springframework.stereotype.Service

@Service
class FuncionarioServiceImpl(val funcionarioRepository: FuncionarioRepository): FuncionarioService {

    override fun persistir(funcionario: Funcionario) = funcionarioRepository.save(funcionario)

    override fun buscarPorCpf(cpf: String) = funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String) = funcionarioRepository.findByEmail(email)

    override fun buscarPorId(id: String) = funcionarioRepository.findById(id).get()
}