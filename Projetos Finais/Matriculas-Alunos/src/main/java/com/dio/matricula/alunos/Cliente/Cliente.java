package com.dio.matricula.alunos.Cliente;

import jakarta.persistence.*;
import java.time.LocalDate;
    @Entity
    public class Cliente {
        @Id
        private String cpf;
        private String nomeCompleto;
        private String endereco;
        private int telefone;
        @Column(columnDefinition = "DATE")
        private LocalDate dataNascimento;
        @Column(columnDefinition = "DATE")
        private LocalDate dataPagamento;

        public Cliente(String cpf, String nomeCompleto, String endereco, int telefone, LocalDate dataNascimento, LocalDate dataPagamento) {
            this.cpf = cpf;
            this.nomeCompleto = nomeCompleto;
            this.endereco = endereco;
            this.telefone = telefone;
            this.dataNascimento = dataNascimento;
            this.dataPagamento = dataPagamento;
        }

        public Cliente() {

        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getNomeCompleto() {
            return nomeCompleto;
        }

        public void setNomeCompleto(String nomeCompleto) {
            this.nomeCompleto = nomeCompleto;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public int getTelefone() {
            return telefone;
        }

        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }

        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public LocalDate getDataPagamento() {
            return dataPagamento;
        }

        public void setDataPagamento(LocalDate dataPagamento) {
            this.dataPagamento = dataPagamento;
        }
        @Override
        public String toString() {
            return "Cliente{" +
                    "cpf='" + cpf + '\'' +
                    ", nomeCompleto='" + nomeCompleto + '\'' +
                    ", endereco='" + endereco + '\'' +
                    ", telefone=" + telefone +
                    ", dataNascimento=" + dataNascimento +
                    ", dataPagamento=" + dataPagamento +
                    '}';
        }
    }