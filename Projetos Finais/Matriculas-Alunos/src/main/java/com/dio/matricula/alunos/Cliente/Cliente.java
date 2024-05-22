package com.dio.matricula.alunos.Cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
    @Entity
    public class Cliente {
        @Id
        @Pattern(regexp = "\\d{11}", message = "O CPF deve conter 11 dígitos numéricos")
        private String cpf;

        @NotBlank(message = "O nome completo não pode estar em branco")
        @Size(min = 2, max = 100, message = "O nome completo deve ter entre 2 e 100 caracteres")
        private String nomeCompleto;

        @NotBlank(message = "O endereço não pode estar em branco")
        @Size(min = 5, max = 255, message = "O endereço deve ter entre 5 e 255 caracteres")
        private String endereco;

        @NotNull(message = "O telefone não pode estar nulo")
        private Integer telefone;

        @NotNull(message = "A data de nascimento não pode estar em branco")
        @Past(message = "A data de nascimento deve ser no passado")
        @Column(columnDefinition = "DATE")
        private LocalDate dataNascimento;

        @NotNull(message = "A data de pagamento não pode estar em branco")
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