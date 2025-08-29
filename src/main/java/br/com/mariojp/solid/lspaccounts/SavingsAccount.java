package br.com.mariojp.solid.lspaccounts;

public class SavingsAccount extends Account {
    // SavingsAccount não implementa Withdrawable
    // Herda apenas deposit() e getBalance() de Account
    // O método withdraw() da classe pai não é sobrescrito
}